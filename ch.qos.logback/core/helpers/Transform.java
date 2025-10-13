package ch.qos.logback.core.helpers;

/* loaded from: classes.dex */
public class Transform {
    private static final String CDATA_EMBEDED_END = "]]>]]&gt;<![CDATA[";
    private static final String CDATA_END = "]]>";
    private static final int CDATA_END_LEN = 3;
    private static final String CDATA_PSEUDO_END = "]]&gt;";
    private static final String CDATA_START = "<![CDATA[";

    public static void appendEscapingCDATA(StringBuilder sb, String str) {
        if (str == null) {
            return;
        }
        int iIndexOf = str.indexOf(CDATA_END);
        if (iIndexOf < 0) {
            sb.append(str);
            return;
        }
        int i2 = 0;
        while (iIndexOf > -1) {
            sb.append(str.substring(i2, iIndexOf));
            sb.append(CDATA_EMBEDED_END);
            i2 = CDATA_END_LEN + iIndexOf;
            if (i2 >= str.length()) {
                return;
            } else {
                iIndexOf = str.indexOf(CDATA_END, i2);
            }
        }
        sb.append(str.substring(i2));
    }

    public static String escapeTags(String str) {
        return (str == null || str.length() == 0) ? str : (str.indexOf("<") == -1 && str.indexOf(">") == -1) ? str : escapeTags(new StringBuffer(str));
    }

    public static String escapeTags(StringBuffer stringBuffer) {
        int i2;
        String str;
        for (int i3 = 0; i3 < stringBuffer.length(); i3++) {
            char cCharAt = stringBuffer.charAt(i3);
            if (cCharAt == '<') {
                i2 = i3 + 1;
                str = "&lt;";
            } else if (cCharAt == '>') {
                i2 = i3 + 1;
                str = "&gt;";
            }
            stringBuffer.replace(i3, i2, str);
        }
        return stringBuffer.toString();
    }
}