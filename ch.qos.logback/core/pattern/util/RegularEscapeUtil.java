package ch.qos.logback.core.pattern.util;

/* loaded from: classes.dex */
public class RegularEscapeUtil implements IEscapeUtil {
    public static String basicEscape(String str) {
        int length = str.length();
        StringBuffer stringBuffer = new StringBuffer(length);
        int i2 = 0;
        while (i2 < length) {
            int i3 = i2 + 1;
            char cCharAt = str.charAt(i2);
            if (cCharAt == '\\') {
                int i4 = i3 + 1;
                char cCharAt2 = str.charAt(i3);
                if (cCharAt2 == 'n') {
                    i3 = i4;
                    cCharAt = '\n';
                } else if (cCharAt2 == 'r') {
                    i3 = i4;
                    cCharAt = '\r';
                } else if (cCharAt2 == 't') {
                    i3 = i4;
                    cCharAt = '\t';
                } else if (cCharAt2 == 'f') {
                    i3 = i4;
                    cCharAt = '\f';
                } else {
                    i3 = i4;
                    cCharAt = cCharAt2;
                }
            }
            stringBuffer.append(cCharAt);
            i2 = i3;
        }
        return stringBuffer.toString();
    }

    @Override // ch.qos.logback.core.pattern.util.IEscapeUtil
    public void escape(String str, StringBuffer stringBuffer, char c2, int i2) {
        char c3;
        if (str.indexOf(c2) >= 0 || c2 == '\\') {
            stringBuffer.append(c2);
            return;
        }
        if (c2 != '_') {
            if (c2 == 'n') {
                c3 = '\n';
            } else if (c2 == 'r') {
                c3 = '\r';
            } else {
                if (c2 != 't') {
                    throw new IllegalArgumentException("Illegal char '" + c2 + " at column " + i2 + ". Only \\\\, \\_" + formatEscapeCharsForListing(str) + ", \\t, \\n, \\r combinations are allowed as escape characters.");
                }
                c3 = '\t';
            }
            stringBuffer.append(c3);
        }
    }

    String formatEscapeCharsForListing(String str) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < str.length(); i2++) {
            sb.append(", \\");
            sb.append(str.charAt(i2));
        }
        return sb.toString();
    }
}