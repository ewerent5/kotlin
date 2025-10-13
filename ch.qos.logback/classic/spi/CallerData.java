package ch.qos.logback.classic.spi;

import ch.qos.logback.core.CoreConstants;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class CallerData {
    public static final String CALLER_DATA_NA = "?#?:?" + CoreConstants.LINE_SEPARATOR;
    public static final StackTraceElement[] EMPTY_CALLER_DATA_ARRAY = new StackTraceElement[0];
    public static final int LINE_NA = -1;
    private static final String LOG4J_CATEGORY = "org.apache.log4j.Category";
    public static final String NA = "?";
    private static final String SLF4J_BOUNDARY = "org.slf4j.Logger";

    public static StackTraceElement[] extract(Throwable th, String str, int i2, List<String> list) {
        if (th == null) {
            return null;
        }
        StackTraceElement[] stackTrace = th.getStackTrace();
        int i3 = -1;
        for (int i4 = 0; i4 < stackTrace.length; i4++) {
            if (!isInFrameworkSpace(stackTrace[i4].getClassName(), str, list)) {
                if (i3 != -1) {
                    break;
                }
            } else {
                i3 = i4 + 1;
            }
        }
        if (i3 == -1) {
            return EMPTY_CALLER_DATA_ARRAY;
        }
        int length = stackTrace.length - i3;
        if (i2 >= length) {
            i2 = length;
        }
        StackTraceElement[] stackTraceElementArr = new StackTraceElement[i2];
        for (int i5 = 0; i5 < i2; i5++) {
            stackTraceElementArr[i5] = stackTrace[i3 + i5];
        }
        return stackTraceElementArr;
    }

    static boolean isInFrameworkSpace(String str, String str2, List<String> list) {
        return str.equals(str2) || str.equals(LOG4J_CATEGORY) || str.startsWith(SLF4J_BOUNDARY) || isInFrameworkSpaceList(str, list);
    }

    private static boolean isInFrameworkSpaceList(String str, List<String> list) {
        if (list == null) {
            return false;
        }
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            if (str.startsWith(it.next())) {
                return true;
            }
        }
        return false;
    }

    public static StackTraceElement naInstance() {
        return new StackTraceElement(NA, NA, NA, -1);
    }
}