package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;

/* loaded from: classes.dex */
public class ThrowableProxyUtil {
    private static final int BUILDER_CAPACITY = 2048;
    public static final int REGULAR_EXCEPTION_INDENT = 1;
    public static final int SUPPRESSED_EXCEPTION_INDENT = 1;

    public static String asString(IThrowableProxy iThrowableProxy) {
        StringBuilder sb = new StringBuilder(BUILDER_CAPACITY);
        recursiveAppend(sb, null, 1, iThrowableProxy);
        return sb.toString();
    }

    public static void build(ThrowableProxy throwableProxy, Throwable th, ThrowableProxy throwableProxy2) {
        StackTraceElement[] stackTrace = th.getStackTrace();
        throwableProxy.commonFrames = throwableProxy2 != null ? findNumberOfCommonFrames(stackTrace, throwableProxy2.getStackTraceElementProxyArray()) : -1;
        throwableProxy.stackTraceElementProxyArray = steArrayToStepArray(stackTrace);
    }

    static int findNumberOfCommonFrames(StackTraceElement[] stackTraceElementArr, StackTraceElementProxy[] stackTraceElementProxyArr) {
        int i2 = 0;
        if (stackTraceElementProxyArr != null && stackTraceElementArr != null) {
            int length = stackTraceElementArr.length - 1;
            for (int length2 = stackTraceElementProxyArr.length - 1; length >= 0 && length2 >= 0 && stackTraceElementArr[length].equals(stackTraceElementProxyArr[length2].ste); length2--) {
                i2++;
                length--;
            }
        }
        return i2;
    }

    public static void indent(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            sb.append('\t');
        }
    }

    private static void recursiveAppend(StringBuilder sb, String str, int i2, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy == null) {
            return;
        }
        subjoinFirstLine(sb, str, i2, iThrowableProxy);
        sb.append(CoreConstants.LINE_SEPARATOR);
        subjoinSTEPArray(sb, i2, iThrowableProxy);
        IThrowableProxy[] suppressed = iThrowableProxy.getSuppressed();
        if (suppressed != null) {
            for (IThrowableProxy iThrowableProxy2 : suppressed) {
                recursiveAppend(sb, CoreConstants.SUPPRESSED, i2 + 1, iThrowableProxy2);
            }
        }
        recursiveAppend(sb, CoreConstants.CAUSED_BY, i2, iThrowableProxy.getCause());
    }

    static StackTraceElementProxy[] steArrayToStepArray(StackTraceElement[] stackTraceElementArr) {
        if (stackTraceElementArr == null) {
            return new StackTraceElementProxy[0];
        }
        int length = stackTraceElementArr.length;
        StackTraceElementProxy[] stackTraceElementProxyArr = new StackTraceElementProxy[length];
        for (int i2 = 0; i2 < length; i2++) {
            stackTraceElementProxyArr[i2] = new StackTraceElementProxy(stackTraceElementArr[i2]);
        }
        return stackTraceElementProxyArr;
    }

    private static void subjoinExceptionMessage(StringBuilder sb, IThrowableProxy iThrowableProxy) {
        sb.append(iThrowableProxy.getClassName());
        sb.append(": ");
        sb.append(iThrowableProxy.getMessage());
    }

    public static void subjoinFirstLine(StringBuilder sb, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCommonFrames() > 0) {
            sb.append(CoreConstants.CAUSED_BY);
        }
        subjoinExceptionMessage(sb, iThrowableProxy);
    }

    private static void subjoinFirstLine(StringBuilder sb, String str, int i2, IThrowableProxy iThrowableProxy) {
        indent(sb, i2 - 1);
        if (str != null) {
            sb.append(str);
        }
        subjoinExceptionMessage(sb, iThrowableProxy);
    }

    public static void subjoinFirstLineRootCauseFirst(StringBuilder sb, IThrowableProxy iThrowableProxy) {
        if (iThrowableProxy.getCause() != null) {
            sb.append(CoreConstants.WRAPPED_BY);
        }
        subjoinExceptionMessage(sb, iThrowableProxy);
    }

    public static void subjoinPackagingData(StringBuilder sb, StackTraceElementProxy stackTraceElementProxy) {
        ClassPackagingData classPackagingData;
        if (stackTraceElementProxy == null || (classPackagingData = stackTraceElementProxy.getClassPackagingData()) == null) {
            return;
        }
        sb.append(!classPackagingData.isExact() ? " ~[" : " [");
        sb.append(classPackagingData.getCodeLocation());
        sb.append(CoreConstants.COLON_CHAR);
        sb.append(classPackagingData.getVersion());
        sb.append(']');
    }

    public static void subjoinSTEP(StringBuilder sb, StackTraceElementProxy stackTraceElementProxy) {
        sb.append(stackTraceElementProxy.toString());
        subjoinPackagingData(sb, stackTraceElementProxy);
    }

    public static void subjoinSTEPArray(StringBuilder sb, int i2, IThrowableProxy iThrowableProxy) {
        StackTraceElementProxy[] stackTraceElementProxyArray = iThrowableProxy.getStackTraceElementProxyArray();
        int commonFrames = iThrowableProxy.getCommonFrames();
        for (int i3 = 0; i3 < stackTraceElementProxyArray.length - commonFrames; i3++) {
            StackTraceElementProxy stackTraceElementProxy = stackTraceElementProxyArray[i3];
            indent(sb, i2);
            subjoinSTEP(sb, stackTraceElementProxy);
            sb.append(CoreConstants.LINE_SEPARATOR);
        }
        if (commonFrames > 0) {
            indent(sb, i2);
            sb.append("... ");
            sb.append(commonFrames);
            sb.append(" common frames omitted");
            sb.append(CoreConstants.LINE_SEPARATOR);
        }
    }

    public static void subjoinSTEPArray(StringBuilder sb, IThrowableProxy iThrowableProxy) {
        subjoinSTEPArray(sb, 1, iThrowableProxy);
    }
}