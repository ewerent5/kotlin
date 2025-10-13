package k.a.a.a;

import java.util.regex.Pattern;

/* compiled from: StringUtils.java */
/* loaded from: classes3.dex */
public class c {
    private static final Pattern a = Pattern.compile("\\p{InCombiningDiacriticalMarks}+");

    public static String a(String str, int i2) {
        return c(str, "...", 0, i2);
    }

    public static String b(String str, String str2, int i2) {
        return c(str, str2, 0, i2);
    }

    public static String c(String str, String str2, int i2, int i3) {
        if (h(str) && "".equals(str2) && i3 > 0) {
            return j(str, 0, i3);
        }
        if (f(str, str2)) {
            return str;
        }
        int length = str2.length();
        int i4 = length + 1;
        int i5 = length + length + 1;
        if (i3 < i4) {
            throw new IllegalArgumentException(String.format("Minimum abbreviation width is %d", Integer.valueOf(i4)));
        }
        if (str.length() <= i3) {
            return str;
        }
        if (i2 > str.length()) {
            i2 = str.length();
        }
        int i6 = i3 - length;
        if (str.length() - i2 < i6) {
            i2 = str.length() - i6;
        }
        if (i2 <= i4) {
            return str.substring(0, i6) + str2;
        }
        if (i3 < i5) {
            throw new IllegalArgumentException(String.format("Minimum abbreviation width with offset is %d", Integer.valueOf(i5)));
        }
        if ((i3 + i2) - length < str.length()) {
            return str2 + b(str.substring(i2), str2, i6);
        }
        return str2 + str.substring(str.length() - i6);
    }

    public static String d(String str) {
        return e(str, "");
    }

    public static String e(String str, String str2) {
        return str == null ? str2 : str;
    }

    public static boolean f(CharSequence... charSequenceArr) {
        if (a.b(charSequenceArr)) {
            return false;
        }
        for (CharSequence charSequence : charSequenceArr) {
            if (g(charSequence)) {
                return true;
            }
        }
        return false;
    }

    public static boolean g(CharSequence charSequence) {
        return charSequence == null || charSequence.length() == 0;
    }

    public static boolean h(CharSequence charSequence) {
        return !g(charSequence);
    }

    public static boolean i(CharSequence charSequence) {
        if (charSequence == null) {
            return false;
        }
        int length = charSequence.length();
        for (int i2 = 0; i2 < length; i2++) {
            if (!Character.isWhitespace(charSequence.charAt(i2))) {
                return false;
            }
        }
        return true;
    }

    public static String j(String str, int i2, int i3) {
        if (str == null) {
            return null;
        }
        if (i3 < 0) {
            i3 += str.length();
        }
        if (i2 < 0) {
            i2 += str.length();
        }
        if (i3 > str.length()) {
            i3 = str.length();
        }
        if (i2 > i3) {
            return "";
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        return str.substring(i2, i3);
    }
}