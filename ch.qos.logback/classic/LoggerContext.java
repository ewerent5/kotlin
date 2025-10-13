package ch.qos.logback.classic;

import ch.qos.logback.classic.android.AndroidManifestPropertiesUtil;
import ch.qos.logback.classic.spi.LoggerComparator;
import ch.qos.logback.classic.spi.LoggerContextListener;
import ch.qos.logback.classic.spi.LoggerContextVO;
import ch.qos.logback.classic.spi.TurboFilterList;
import ch.qos.logback.classic.turbo.TurboFilter;
import ch.qos.logback.classic.util.LoggerNameUtil;
import ch.qos.logback.core.ContextBase;
import ch.qos.logback.core.CoreConstants;
import ch.qos.logback.core.joran.spi.JoranException;
import ch.qos.logback.core.spi.FilterReply;
import ch.qos.logback.core.spi.LifeCycle;
import ch.qos.logback.core.status.StatusListener;
import ch.qos.logback.core.status.StatusManager;
import ch.qos.logback.core.status.WarnStatus;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.slf4j.ILoggerFactory;
import org.slf4j.Marker;

/* loaded from: classes.dex */
public class LoggerContext extends ContextBase implements ILoggerFactory, LifeCycle {
    private List<String> frameworkPackages;
    final Logger root;
    private int size;
    private int noAppenderWarning = 0;
    private final List<LoggerContextListener> loggerContextListenerList = new ArrayList();
    private final TurboFilterList turboFilterList = new TurboFilterList();
    private boolean packagingDataEnabled = true;
    private boolean androidPropsInitialized = false;
    private int maxCallerDataDepth = 8;
    int resetCount = 0;
    private Map<String, Logger> loggerCache = new ConcurrentHashMap();
    private LoggerContextVO loggerContextRemoteView = new LoggerContextVO(this);

    public LoggerContext() {
        Logger logger = new Logger(org.slf4j.Logger.ROOT_LOGGER_NAME, null, this);
        this.root = logger;
        logger.setLevel(Level.DEBUG);
        this.loggerCache.put(org.slf4j.Logger.ROOT_LOGGER_NAME, logger);
        initEvaluatorMap();
        this.size = 1;
        this.frameworkPackages = new ArrayList();
    }

    private void fireOnReset() {
        Iterator<LoggerContextListener> it = this.loggerContextListenerList.iterator();
        while (it.hasNext()) {
            it.next().onReset(this);
        }
    }

    private void fireOnStart() {
        Iterator<LoggerContextListener> it = this.loggerContextListenerList.iterator();
        while (it.hasNext()) {
            it.next().onStart(this);
        }
    }

    private void fireOnStop() {
        Iterator<LoggerContextListener> it = this.loggerContextListenerList.iterator();
        while (it.hasNext()) {
            it.next().onStop(this);
        }
    }

    private void incSize() {
        this.size++;
    }

    private boolean isSpecialKey(String str) {
        return str.equals(CoreConstants.PACKAGE_NAME_KEY) || str.equals(CoreConstants.VERSION_NAME_KEY) || str.equals(CoreConstants.VERSION_CODE_KEY) || str.equals(CoreConstants.EXT_DIR_KEY) || str.equals(CoreConstants.DATA_DIR_KEY);
    }

    private void resetAllListeners() {
        this.loggerContextListenerList.clear();
    }

    private void resetListenersExceptResetResistant() {
        ArrayList arrayList = new ArrayList();
        for (LoggerContextListener loggerContextListener : this.loggerContextListenerList) {
            if (loggerContextListener.isResetResistant()) {
                arrayList.add(loggerContextListener);
            }
        }
        this.loggerContextListenerList.retainAll(arrayList);
    }

    private void resetStatusListeners() {
        StatusManager statusManager = getStatusManager();
        Iterator<StatusListener> it = statusManager.getCopyOfStatusListenerList().iterator();
        while (it.hasNext()) {
            statusManager.remove(it.next());
        }
    }

    private void updateLoggerContextVO() {
        this.loggerContextRemoteView = new LoggerContextVO(this);
    }

    public void addListener(LoggerContextListener loggerContextListener) {
        this.loggerContextListenerList.add(loggerContextListener);
    }

    public void addTurboFilter(TurboFilter turboFilter) {
        this.turboFilterList.add(turboFilter);
    }

    public Logger exists(String str) {
        return this.loggerCache.get(str);
    }

    void fireOnLevelChange(Logger logger, Level level) {
        Iterator<LoggerContextListener> it = this.loggerContextListenerList.iterator();
        while (it.hasNext()) {
            it.next().onLevelChange(logger, level);
        }
    }

    public List<LoggerContextListener> getCopyOfListenerList() {
        return new ArrayList(this.loggerContextListenerList);
    }

    public List<String> getFrameworkPackages() {
        return this.frameworkPackages;
    }

    public final Logger getLogger(Class cls) {
        return getLogger(cls.getName());
    }

    @Override // org.slf4j.ILoggerFactory
    public final Logger getLogger(String str) {
        Logger childByName;
        if (str == null) {
            throw new IllegalArgumentException("name argument cannot be null");
        }
        if (org.slf4j.Logger.ROOT_LOGGER_NAME.equalsIgnoreCase(str)) {
            return this.root;
        }
        Logger logger = this.root;
        Logger logger2 = this.loggerCache.get(str);
        if (logger2 != null) {
            return logger2;
        }
        int i2 = 0;
        while (true) {
            int separatorIndexOf = LoggerNameUtil.getSeparatorIndexOf(str, i2);
            String strSubstring = separatorIndexOf == -1 ? str : str.substring(0, separatorIndexOf);
            int i3 = separatorIndexOf + 1;
            synchronized (logger) {
                childByName = logger.getChildByName(strSubstring);
                if (childByName == null) {
                    childByName = logger.createChildByName(strSubstring);
                    this.loggerCache.put(strSubstring, childByName);
                    incSize();
                }
            }
            if (separatorIndexOf == -1) {
                return childByName;
            }
            i2 = i3;
            logger = childByName;
        }
    }

    public LoggerContextVO getLoggerContextRemoteView() {
        return this.loggerContextRemoteView;
    }

    public List<Logger> getLoggerList() {
        ArrayList arrayList = new ArrayList(this.loggerCache.values());
        Collections.sort(arrayList, new LoggerComparator());
        return arrayList;
    }

    public int getMaxCallerDataDepth() {
        return this.maxCallerDataDepth;
    }

    @Override // ch.qos.logback.core.ContextBase, ch.qos.logback.core.Context, ch.qos.logback.core.spi.PropertyContainer
    public String getProperty(String str) {
        if (isSpecialKey(str)) {
            try {
                if (!this.androidPropsInitialized) {
                    this.androidPropsInitialized = true;
                    AndroidManifestPropertiesUtil.setAndroidProperties(this);
                }
            } catch (JoranException e2) {
                getStatusManager().add(new WarnStatus("Can't set manifest properties", e2));
                this.androidPropsInitialized = false;
            }
        }
        return super.getProperty(str);
    }

    final FilterReply getTurboFilterChainDecision_0_3OrMore(Marker marker, Logger logger, Level level, String str, Object[] objArr, Throwable th) {
        return this.turboFilterList.size() == 0 ? FilterReply.NEUTRAL : this.turboFilterList.getTurboFilterChainDecision(marker, logger, level, str, objArr, th);
    }

    final FilterReply getTurboFilterChainDecision_1(Marker marker, Logger logger, Level level, String str, Object obj, Throwable th) {
        return this.turboFilterList.size() == 0 ? FilterReply.NEUTRAL : this.turboFilterList.getTurboFilterChainDecision(marker, logger, level, str, new Object[]{obj}, th);
    }

    final FilterReply getTurboFilterChainDecision_2(Marker marker, Logger logger, Level level, String str, Object obj, Object obj2, Throwable th) {
        return this.turboFilterList.size() == 0 ? FilterReply.NEUTRAL : this.turboFilterList.getTurboFilterChainDecision(marker, logger, level, str, new Object[]{obj, obj2}, th);
    }

    public TurboFilterList getTurboFilterList() {
        return this.turboFilterList;
    }

    void initEvaluatorMap() {
        putObject(CoreConstants.EVALUATOR_MAP, new HashMap());
    }

    public boolean isPackagingDataEnabled() {
        return this.packagingDataEnabled;
    }

    final void noAppenderDefinedWarning(Logger logger) {
        int i2 = this.noAppenderWarning;
        this.noAppenderWarning = i2 + 1;
        if (i2 == 0) {
            getStatusManager().add(new WarnStatus("No appenders present in context [" + getName() + "] for logger [" + logger.getName() + "].", logger));
        }
    }

    @Override // ch.qos.logback.core.ContextBase, ch.qos.logback.core.Context
    public void putProperty(String str, String str2) {
        super.putProperty(str, str2);
        updateLoggerContextVO();
    }

    public void removeListener(LoggerContextListener loggerContextListener) {
        this.loggerContextListenerList.remove(loggerContextListener);
    }

    @Override // ch.qos.logback.core.ContextBase
    public void reset() {
        this.resetCount++;
        super.reset();
        initEvaluatorMap();
        this.root.recursiveReset();
        resetTurboFilterList();
        fireOnReset();
        resetListenersExceptResetResistant();
        resetStatusListeners();
    }

    public void resetTurboFilterList() {
        Iterator<TurboFilter> it = this.turboFilterList.iterator();
        while (it.hasNext()) {
            it.next().stop();
        }
        this.turboFilterList.clear();
    }

    public void setMaxCallerDataDepth(int i2) {
        this.maxCallerDataDepth = i2;
    }

    @Override // ch.qos.logback.core.ContextBase, ch.qos.logback.core.Context
    public void setName(String str) {
        super.setName(str);
        updateLoggerContextVO();
    }

    public void setPackagingDataEnabled(boolean z) {
        this.packagingDataEnabled = z;
    }

    int size() {
        return this.size;
    }

    @Override // ch.qos.logback.core.ContextBase, ch.qos.logback.core.spi.LifeCycle
    public void start() {
        super.start();
        fireOnStart();
    }

    @Override // ch.qos.logback.core.ContextBase, ch.qos.logback.core.spi.LifeCycle
    public void stop() {
        reset();
        fireOnStop();
        resetAllListeners();
        super.stop();
    }

    @Override // ch.qos.logback.core.ContextBase
    public String toString() {
        return getClass().getName() + "[" + getName() + "]";
    }
}