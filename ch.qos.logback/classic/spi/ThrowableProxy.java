package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes.dex */
public class ThrowableProxy implements IThrowableProxy {
    private static final Method GET_SUPPRESSED_METHOD;
    private static final ThrowableProxy[] NO_SUPPRESSED;
    private boolean calculatedPackageData = false;
    private ThrowableProxy cause;
    private String className;
    int commonFrames;
    private String message;
    private transient PackagingDataCalculator packagingDataCalculator;
    StackTraceElementProxy[] stackTraceElementProxyArray;
    private ThrowableProxy[] suppressed;
    private Throwable throwable;

    static {
        Method method;
        try {
            method = Throwable.class.getMethod("getSuppressed", new Class[0]);
        } catch (NoSuchMethodException unused) {
            method = null;
        }
        GET_SUPPRESSED_METHOD = method;
        NO_SUPPRESSED = new ThrowableProxy[0];
    }

    public ThrowableProxy(Throwable th) throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
        this.suppressed = NO_SUPPRESSED;
        this.throwable = th;
        this.className = th.getClass().getName();
        this.message = th.getMessage();
        this.stackTraceElementProxyArray = ThrowableProxyUtil.steArrayToStepArray(th.getStackTrace());
        Throwable cause = th.getCause();
        if (cause != null) {
            ThrowableProxy throwableProxy = new ThrowableProxy(cause);
            this.cause = throwableProxy;
            throwableProxy.commonFrames = ThrowableProxyUtil.findNumberOfCommonFrames(cause.getStackTrace(), this.stackTraceElementProxyArray);
        }
        Method method = GET_SUPPRESSED_METHOD;
        if (method != null) {
            try {
                Object objInvoke = method.invoke(th, new Object[0]);
                if (objInvoke instanceof Throwable[]) {
                    Throwable[] thArr = (Throwable[]) objInvoke;
                    if (thArr.length > 0) {
                        this.suppressed = new ThrowableProxy[thArr.length];
                        for (int i2 = 0; i2 < thArr.length; i2++) {
                            this.suppressed[i2] = new ThrowableProxy(thArr[i2]);
                            this.suppressed[i2].commonFrames = ThrowableProxyUtil.findNumberOfCommonFrames(thArr[i2].getStackTrace(), this.stackTraceElementProxyArray);
                        }
                    }
                }
            } catch (IllegalAccessException | InvocationTargetException unused) {
            }
        }
    }

    public void calculatePackagingData() {
        PackagingDataCalculator packagingDataCalculator;
        if (this.calculatedPackageData || (packagingDataCalculator = getPackagingDataCalculator()) == null) {
            return;
        }
        this.calculatedPackageData = true;
        packagingDataCalculator.calculate(this);
    }

    public void fullDump() {
        StringBuilder sb = new StringBuilder();
        for (StackTraceElementProxy stackTraceElementProxy : this.stackTraceElementProxyArray) {
            String string = stackTraceElementProxy.toString();
            sb.append('\t');
            sb.append(string);
            ThrowableProxyUtil.subjoinPackagingData(sb, stackTraceElementProxy);
            sb.append(CoreConstants.LINE_SEPARATOR);
        }
        System.out.println(sb.toString());
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public IThrowableProxy getCause() {
        return this.cause;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public String getClassName() {
        return this.className;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public int getCommonFrames() {
        return this.commonFrames;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public String getMessage() {
        return this.message;
    }

    public PackagingDataCalculator getPackagingDataCalculator() {
        if (this.throwable != null && this.packagingDataCalculator == null) {
            this.packagingDataCalculator = new PackagingDataCalculator();
        }
        return this.packagingDataCalculator;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public StackTraceElementProxy[] getStackTraceElementProxyArray() {
        return this.stackTraceElementProxyArray;
    }

    @Override // ch.qos.logback.classic.spi.IThrowableProxy
    public IThrowableProxy[] getSuppressed() {
        return this.suppressed;
    }

    public Throwable getThrowable() {
        return this.throwable;
    }
}