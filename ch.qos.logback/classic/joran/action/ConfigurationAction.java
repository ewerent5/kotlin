package ch.qos.logback.classic.joran.action;

import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter;
import ch.qos.logback.core.joran.action.Action;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.status.OnConsoleStatusListener;
import ch.qos.logback.core.util.ContextUtil;
import ch.qos.logback.core.util.Duration;
import ch.qos.logback.core.util.OptionHelper;
import org.xml.sax.Attributes;

/* loaded from: classes.dex */
public class ConfigurationAction extends Action {
    static final String DEBUG_SYSTEM_PROPERTY_KEY = "logback.debug";
    static final String INTERNAL_DEBUG_ATTR = "debug";
    static final String SCAN_ATTR = "scan";
    static final String SCAN_PERIOD_ATTR = "scanPeriod";

    @Override // ch.qos.logback.core.joran.action.Action
    public void begin(InterpretationContext interpretationContext, String str, Attributes attributes) {
        String systemProperty = OptionHelper.getSystemProperty(DEBUG_SYSTEM_PROPERTY_KEY);
        if (systemProperty == null) {
            systemProperty = interpretationContext.subst(attributes.getValue(INTERNAL_DEBUG_ATTR));
        }
        if (OptionHelper.isEmpty(systemProperty) || systemProperty.equalsIgnoreCase("false") || systemProperty.equalsIgnoreCase("null")) {
            addInfo("debug attribute not set");
        } else {
            OnConsoleStatusListener.addNewInstanceToContext(this.context);
        }
        processScanAttrib(interpretationContext, attributes);
        new ContextUtil(this.context).addHostNameAsProperty();
        interpretationContext.pushObject(getContext());
    }

    @Override // ch.qos.logback.core.joran.action.Action
    public void end(InterpretationContext interpretationContext, String str) {
        addInfo("End of configuration.");
        interpretationContext.popObject();
    }

    String getSystemProperty(String str) {
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    void processScanAttrib(InterpretationContext interpretationContext, Attributes attributes) {
        String strSubst = interpretationContext.subst(attributes.getValue(SCAN_ATTR));
        if (OptionHelper.isEmpty(strSubst) || "false".equalsIgnoreCase(strSubst)) {
            return;
        }
        ReconfigureOnChangeFilter reconfigureOnChangeFilter = new ReconfigureOnChangeFilter();
        reconfigureOnChangeFilter.setContext(this.context);
        String strSubst2 = interpretationContext.subst(attributes.getValue(SCAN_PERIOD_ATTR));
        if (!OptionHelper.isEmpty(strSubst2)) {
            try {
                Duration durationValueOf = Duration.valueOf(strSubst2);
                reconfigureOnChangeFilter.setRefreshPeriod(durationValueOf.getMilliseconds());
                addInfo("Setting ReconfigureOnChangeFilter scanning period to " + durationValueOf);
            } catch (NumberFormatException e2) {
                addError("Error while converting [" + strSubst + "] to long", e2);
            }
        }
        reconfigureOnChangeFilter.start();
        LoggerContext loggerContext = (LoggerContext) this.context;
        addInfo("Adding ReconfigureOnChangeFilter as a turbo filter");
        loggerContext.addTurboFilter(reconfigureOnChangeFilter);
    }
}