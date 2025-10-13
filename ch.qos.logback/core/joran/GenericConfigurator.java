package ch.qos.logback.core.joran;

import ch.qos.logback.core.Context;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.event.SaxEventRecorder;
import ch.qos.logback.core.joran.spi.DefaultNestedComponentRegistry;
import ch.qos.logback.core.joran.spi.ElementPath;
import ch.qos.logback.core.joran.spi.InterpretationContext;
import ch.qos.logback.core.joran.spi.Interpreter;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.spi.RuleStore;
import ch.qos.logback.core.joran.spi.SimpleRuleStore;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.status.StatusUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.net.URLConnection;
import java.util.List;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* loaded from: classes.dex */
public abstract class GenericConfigurator extends ContextAwareBase {
    protected Interpreter interpreter;

    private final void doConfigure(InputSource inputSource) throws SAXException, JoranException, IOException {
        long jCurrentTimeMillis = System.currentTimeMillis();
        if (!ConfigurationWatchListUtil.wasConfigurationWatchListReset(this.context)) {
            informContextOfURLUsedForConfiguration(getContext(), null);
        }
        SaxEventRecorder saxEventRecorder = new SaxEventRecorder(this.context);
        saxEventRecorder.recordEvents(inputSource);
        doConfigure(saxEventRecorder.getSaxEventList());
        if (new StatusUtil(this.context).noXMLParsingErrorsOccurred(jCurrentTimeMillis)) {
            addInfo("Registering current configuration as safe fallback point");
            registerSafeConfiguration();
        }
    }

    public static void informContextOfURLUsedForConfiguration(Context context, URL url) {
        ConfigurationWatchListUtil.setMainWatchURL(context, url);
    }

    protected void addDefaultNestedComponentRegistryRules(DefaultNestedComponentRegistry defaultNestedComponentRegistry) {
    }

    protected abstract void addImplicitRules(Interpreter interpreter);

    protected abstract void addInstanceRules(RuleStore ruleStore);

    protected void buildInterpreter() {
        SimpleRuleStore simpleRuleStore = new SimpleRuleStore(this.context);
        addInstanceRules(simpleRuleStore);
        Interpreter interpreter = new Interpreter(this.context, simpleRuleStore, initialElementPath());
        this.interpreter = interpreter;
        InterpretationContext interpretationContext = interpreter.getInterpretationContext();
        interpretationContext.setContext(this.context);
        addImplicitRules(this.interpreter);
        addDefaultNestedComponentRegistryRules(interpretationContext.getDefaultNestedComponentRegistry());
    }

    public final void doConfigure(File file) throws JoranException {
        try {
            informContextOfURLUsedForConfiguration(getContext(), file.toURI().toURL());
            doConfigure(new FileInputStream(file));
        } catch (IOException e2) {
            String str = "Could not open [" + file.getPath() + "].";
            addError(str, e2);
            throw new JoranException(str, e2);
        }
    }

    public final void doConfigure(InputStream inputStream) throws JoranException, IOException {
        try {
            doConfigure(new InputSource(inputStream));
            try {
                inputStream.close();
            } catch (IOException e2) {
                addError("Could not close the stream", e2);
                throw new JoranException("Could not close the stream", e2);
            }
        } catch (Throwable th) {
            try {
                inputStream.close();
                throw th;
            } catch (IOException e3) {
                addError("Could not close the stream", e3);
                throw new JoranException("Could not close the stream", e3);
            }
        }
    }

    public final void doConfigure(String str) throws JoranException {
        doConfigure(new File(str));
    }

    public final void doConfigure(URL url) throws JoranException, IOException {
        try {
            informContextOfURLUsedForConfiguration(getContext(), url);
            URLConnection uRLConnectionOpenConnection = url.openConnection();
            uRLConnectionOpenConnection.setUseCaches(false);
            doConfigure(uRLConnectionOpenConnection.getInputStream());
        } catch (IOException e2) {
            String str = "Could not open URL [" + url + "].";
            addError(str, e2);
            throw new JoranException(str, e2);
        }
    }

    public void doConfigure(List<SaxEvent> list) {
        buildInterpreter();
        synchronized (this.context.getConfigurationLock()) {
            this.interpreter.getEventPlayer().play(list);
        }
    }

    protected ElementPath initialElementPath() {
        return new ElementPath();
    }

    public List<SaxEvent> recallSafeConfiguration() {
        return (List) this.context.getObject(CoreConstants.SAFE_JORAN_CONFIGURATION);
    }

    public void registerSafeConfiguration() {
        this.context.putObject(CoreConstants.SAFE_JORAN_CONFIGURATION, this.interpreter.getEventPlayer().getCopyOfPlayerEventList());
    }
}