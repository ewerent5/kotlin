package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.net.URL;
import java.security.CodeSource;
import java.util.HashMap;

/* loaded from: classes.dex */
public class PackagingDataCalculator {
    static final StackTraceElementProxy[] STEP_ARRAY_TEMPLATE = new StackTraceElementProxy[0];
    HashMap<String, ClassPackagingData> cache = new HashMap<>();

    private Class bestEffortLoadClass(ClassLoader classLoader, String str) {
        Class clsLoadClass = loadClass(classLoader, str);
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        ClassLoader contextClassLoader = Thread.currentThread().getContextClassLoader();
        if (contextClassLoader != classLoader) {
            clsLoadClass = loadClass(contextClassLoader, str);
        }
        if (clsLoadClass != null) {
            return clsLoadClass;
        }
        try {
            return Class.forName(str);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    private ClassPackagingData computeBySTEP(StackTraceElementProxy stackTraceElementProxy, ClassLoader classLoader) {
        String className = stackTraceElementProxy.ste.getClassName();
        ClassPackagingData classPackagingData = this.cache.get(className);
        if (classPackagingData != null) {
            return classPackagingData;
        }
        Class clsBestEffortLoadClass = bestEffortLoadClass(classLoader, className);
        ClassPackagingData classPackagingData2 = new ClassPackagingData(getCodeLocation(clsBestEffortLoadClass), getImplementationVersion(clsBestEffortLoadClass), false);
        this.cache.put(className, classPackagingData2);
        return classPackagingData2;
    }

    private String getCodeLocation(String str, char c2) {
        int iLastIndexOf = str.lastIndexOf(c2);
        if (isFolder(iLastIndexOf, str)) {
            return str.substring(str.lastIndexOf(c2, iLastIndexOf - 1) + 1);
        }
        if (iLastIndexOf > 0) {
            return str.substring(iLastIndexOf + 1);
        }
        return null;
    }

    private boolean isFolder(int i2, String str) {
        return i2 != -1 && i2 + 1 == str.length();
    }

    private Class loadClass(ClassLoader classLoader, String str) {
        if (classLoader == null) {
            return null;
        }
        try {
            return classLoader.loadClass(str);
        } catch (ClassNotFoundException | NoClassDefFoundError unused) {
            return null;
        } catch (Exception e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public void calculate(IThrowableProxy iThrowableProxy) {
        while (iThrowableProxy != null) {
            populateFrames(iThrowableProxy.getStackTraceElementProxyArray());
            IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
            if (suppressed != null) {
                for (IThrowableProxy iThrowableProxy2 : suppressed) {
                    populateFrames(iThrowableProxy2.getStackTraceElementProxyArray());
                }
            }
            iThrowableProxy = iThrowableProxy.getCause();
        }
    }

    String getCodeLocation(Class cls) {
        URL location;
        if (cls == null) {
            return "na";
        }
        try {
            CodeSource codeSource = cls.getProtectionDomain().getCodeSource();
            if (codeSource == null || (location = codeSource.getLocation()) == null) {
                return "na";
            }
            String string = location.toString();
            String codeLocation = getCodeLocation(string, '/');
            return codeLocation != null ? codeLocation : getCodeLocation(string, CoreConstants.ESCAPE_CHAR);
        } catch (Exception unused) {
            return "na";
        }
    }

    String getImplementationVersion(Class cls) {
        Package r2;
        String implementationVersion;
        return (cls == null || (r2 = cls.getPackage()) == null || (implementationVersion = r2.getImplementationVersion()) == null) ? "na" : implementationVersion;
    }

    void populateFrames(StackTraceElementProxy[] stackTraceElementProxyArr) {
        int iFindNumberOfCommonFrames = STEUtil.findNumberOfCommonFrames(new Throwable("local stack reference").getStackTrace(), stackTraceElementProxyArr);
        int length = stackTraceElementProxyArr.length - iFindNumberOfCommonFrames;
        for (int i2 = 0; i2 < iFindNumberOfCommonFrames; i2++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArr[length + i2];
            stackTraceElementProxy.setClassPackagingData(computeBySTEP(stackTraceElementProxy, null));
        }
        populateUncommonFrames(iFindNumberOfCommonFrames, stackTraceElementProxyArr, null);
    }

    void populateUncommonFrames(int i2, StackTraceElementProxy[] stackTraceElementProxyArr, ClassLoader classLoader) {
        int length = stackTraceElementProxyArr.length - i2;
        for (int i3 = 0; i3 < length; i3++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArr[i3];
            stackTraceElementProxy.setClassPackagingData(computeBySTEP(stackTraceElementProxy, classLoader));
        }
    }
}