package ch.qos.logback.classic.turbo;

import ch.qos.logback.classic.Level;
import ch.qos.logback.classic.Logger;
import ch.qos.logback.classic.LoggerContext;
import ch.qos.logback.classic.joran.JoranConfigurator;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.GenericConfigurator;
import ch.qos.logback.core.joran.event.SaxEvent;
import ch.qos.logback.core.joran.spi.ConfigurationWatchList;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.joran.util.ConfigurationWatchListUtil;
import ch.qos.logback.core.spi.ContextAwareBase;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.status.StatusUtil;
import java.io.IOException;
import java.net.URL;
import java.util.List;
import okhttp3.internal.ws.WebSocketProtocol;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class ReconfigureOnChangeFilter extends TurboFilter {
    public static final long DEFAULT_REFRESH_PERIOD = 60000;
    private static final long MASK_DECREASE_THRESHOLD = 800;
    private static final long MASK_INCREASE_THRESHOLD = 100;
    private static final int MAX_MASK = 65535;
    ConfigurationWatchList configurationWatchList;
    URL mainConfigurationURL;
    protected volatile long nextCheck;
    long refreshPeriod = DEFAULT_REFRESH_PERIOD;
    private long invocationCounter = 0;
    private volatile long mask = 15;
    private volatile long lastMaskCheck = System.currentTimeMillis();

    class ReconfiguringThread implements Runnable {
        ReconfiguringThread() {
        }

        private void fallbackConfiguration(LoggerContext loggerContext, List<SaxEvent> list, URL url) {
            JoranConfigurator joranConfigurator = new JoranConfigurator();
            joranConfigurator.setContext(((ContextAwareBase) ReconfigureOnChangeFilter.this).context);
            if (list == null) {
                ReconfigureOnChangeFilter.this.addWarn("No previous configuration to fall back on.");
                return;
            }
            ReconfigureOnChangeFilter.this.addWarn("Falling back to previously registered safe configuration.");
            try {
                loggerContext.reset();
                GenericConfigurator.informContextOfURLUsedForConfiguration(((ContextAwareBase) ReconfigureOnChangeFilter.this).context, url);
                joranConfigurator.doConfigure(list);
                ReconfigureOnChangeFilter.this.addInfo("Re-registering previous fallback configuration once more as a fallback configuration point");
                joranConfigurator.registerSafeConfiguration();
            } catch (JoranException e2) {
                ReconfigureOnChangeFilter.this.addError("Unexpected exception thrown by a configuration considered safe.", e2);
            }
        }

        private void performXMLConfiguration(LoggerContext loggerContext) throws IOException {
            JoranConfigurator joranConfigurator = new JoranConfigurator();
            joranConfigurator.setContext(((ContextAwareBase) ReconfigureOnChangeFilter.this).context);
            StatusUtil statusUtil = new StatusUtil(((ContextAwareBase) ReconfigureOnChangeFilter.this).context);
            List<SaxEvent> listRecallSafeConfiguration = joranConfigurator.recallSafeConfiguration();
            URL mainWatchURL = ConfigurationWatchListUtil.getMainWatchURL(((ContextAwareBase) ReconfigureOnChangeFilter.this).context);
            loggerContext.reset();
            long jCurrentTimeMillis = System.currentTimeMillis();
            try {
                joranConfigurator.doConfigure(ReconfigureOnChangeFilter.this.mainConfigurationURL);
                if (statusUtil.hasXMLParsingErrors(jCurrentTimeMillis)) {
                    fallbackConfiguration(loggerContext, listRecallSafeConfiguration, mainWatchURL);
                }
            } catch (JoranException unused) {
                fallbackConfiguration(loggerContext, listRecallSafeConfiguration, mainWatchURL);
            }
        }

        @Override // java.lang.Runnable
        public void run() throws IOException {
            ReconfigureOnChangeFilter reconfigureOnChangeFilter = ReconfigureOnChangeFilter.this;
            if (reconfigureOnChangeFilter.mainConfigurationURL == null) {
                reconfigureOnChangeFilter.addInfo("Due to missing top level configuration file, skipping reconfiguration");
                return;
            }
            LoggerContext loggerContext = (LoggerContext) ((ContextAwareBase) reconfigureOnChangeFilter).context;
            ReconfigureOnChangeFilter.this.addInfo("Will reset and reconfigure context named [" + ((ContextAwareBase) ReconfigureOnChangeFilter.this).context.getName() + "]");
            if (ReconfigureOnChangeFilter.this.mainConfigurationURL.toString().endsWith("xml")) {
                performXMLConfiguration(loggerContext);
            }
        }
    }

    private void updateMaskIfNecessary(long j2) {
        long j3;
        long j4 = j2 - this.lastMaskCheck;
        this.lastMaskCheck = j2;
        if (j4 < MASK_INCREASE_THRESHOLD && this.mask < WebSocketProtocol.PAYLOAD_SHORT_MAX) {
            j3 = (this.mask << 1) | 1;
        } else if (j4 <= MASK_DECREASE_THRESHOLD) {
            return;
        } else {
            j3 = this.mask >>> 2;
        }
        this.mask = j3;
    }

    protected boolean changeDetected(long j2) {
        if (j2 < this.nextCheck) {
            return false;
        }
        updateNextCheck(j2);
        return this.configurationWatchList.changeDetected();
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter
    public FilterReply decide(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        if (!isStarted()) {
            return FilterReply.NEUTRAL;
        }
        long j2 = this.invocationCounter;
        this.invocationCounter = 1 + j2;
        if ((j2 & this.mask) != this.mask) {
            return FilterReply.NEUTRAL;
        }
        long jCurrentTimeMillis = System.currentTimeMillis();
        synchronized (this.configurationWatchList) {
            updateMaskIfNecessary(jCurrentTimeMillis);
            if (changeDetected(jCurrentTimeMillis)) {
                disableSubsequentReconfiguration();
                detachReconfigurationToNewThread();
            }
        }
        return FilterReply.NEUTRAL;
    }

    void detachReconfigurationToNewThread() {
        addInfo("Detected change in [" + this.configurationWatchList.getCopyOfFileWatchList() + "]");
        this.context.getExecutorService().submit(new ReconfiguringThread());
    }

    void disableSubsequentReconfiguration() {
        this.nextCheck = Long.MAX_VALUE;
    }

    public long getRefreshPeriod() {
        return this.refreshPeriod;
    }

    public void setRefreshPeriod(long j2) {
        this.refreshPeriod = j2;
    }

    @Override // ch.qos.logback.classic.turbo.TurboFilter, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        ConfigurationWatchList configurationWatchList = ConfigurationWatchListUtil.getConfigurationWatchList(this.context);
        this.configurationWatchList = configurationWatchList;
        if (configurationWatchList == null) {
            addWarn("Empty ConfigurationWatchList in context");
            return;
        }
        URL mainURL = configurationWatchList.getMainURL();
        this.mainConfigurationURL = mainURL;
        if (mainURL == null) {
            addWarn("Due to missing top level configuration file, automatic reconfiguration is impossible.");
            return;
        }
        addInfo("Will scan for changes in [" + this.configurationWatchList.getCopyOfFileWatchList() + "] every " + (this.refreshPeriod / 1000) + " seconds. ");
        synchronized (this.configurationWatchList) {
            updateNextCheck(System.currentTimeMillis());
        }
        super.start();
    }

    public String toString() {
        return "ReconfigureOnChangeFilter{invocationCounter=" + this.invocationCounter + CoreConstants.CURLY_RIGHT;
    }

    void updateNextCheck(long j2) {
        this.nextCheck = j2 + this.refreshPeriod;
    }
}