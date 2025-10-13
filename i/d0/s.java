package i.d0;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Strings.kt */
/* loaded from: classes3.dex */
public class s extends r {
    public static final String C0(String str, int i2) {
        i.y.d.l.d(str, "$this$drop");
        if (i2 >= 0) {
            String strSubstring = str.substring(i.a0.f.d(i2, str.length()));
            i.y.d.l.c(strSubstring, "(this as java.lang.String).substring(startIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }

    public static String D0(String str, int i2) {
        i.y.d.l.d(str, "$this$take");
        if (i2 >= 0) {
            String strSubstring = str.substring(0, i.a0.f.d(i2, str.length()));
            i.y.d.l.c(strSubstring, "(this as java.lang.Strin…ing(startIndex, endIndex)");
            return strSubstring;
        }
        throw new IllegalArgumentException(("Requested character count " + i2 + " is less than zero.").toString());
    }
}