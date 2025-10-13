package ch.qos.logback.core.util;

/* loaded from: classes.dex */
public class ContentTypeUtil {
    public static String getSubType(String str) {
        int iIndexOf;
        int i2;
        if (str == null || (iIndexOf = str.indexOf(47)) == -1 || (i2 = iIndexOf + 1) >= str.length()) {
            return null;
        }
        return str.substring(i2);
    }

    public static boolean isTextual(String str) {
        if (str == null) {
            return false;
        }
        return str.startsWith("text");
    }
}