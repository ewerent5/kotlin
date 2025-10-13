package i.d0;

import ch.qos.logback.core.CoreConstants;
import i.y.d.x;
import java.util.Comparator;

/* compiled from: StringsJVM.kt */
/* loaded from: classes3.dex */
public class p extends o {
    public static /* synthetic */ boolean A(String str, String str2, int i2, boolean z, int i3, Object obj) {
        if ((i3 & 4) != 0) {
            z = false;
        }
        return y(str, str2, i2, z);
    }

    public static /* synthetic */ boolean B(String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return z(str, str2, z);
    }

    public static final boolean m(String str, String str2, boolean z) {
        i.y.d.l.d(str, "$this$endsWith");
        i.y.d.l.d(str2, "suffix");
        return !z ? str.endsWith(str2) : r(str, str.length() - str2.length(), str2, 0, str2.length(), true);
    }

    public static /* synthetic */ boolean n(String str, String str2, boolean z, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            z = false;
        }
        return m(str, str2, z);
    }

    public static boolean o(String str, String str2, boolean z) {
        return str == null ? str2 == null : !z ? str.equals(str2) : str.equalsIgnoreCase(str2);
    }

    public static Comparator<String> p(x xVar) {
        i.y.d.l.d(xVar, "$this$CASE_INSENSITIVE_ORDER");
        Comparator<String> comparator = String.CASE_INSENSITIVE_ORDER;
        i.y.d.l.c(comparator, "java.lang.String.CASE_INSENSITIVE_ORDER");
        return comparator;
    }

    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final boolean q(java.lang.CharSequence r4) {
        /*
            java.lang.String r0 = "$this$isBlank"
            i.y.d.l.d(r4, r0)
            int r0 = r4.length()
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L3e
            i.a0.c r0 = i.d0.q.K(r4)
            boolean r3 = r0 instanceof java.util.Collection
            if (r3 == 0) goto L20
            r3 = r0
            java.util.Collection r3 = (java.util.Collection) r3
            boolean r3 = r3.isEmpty()
            if (r3 == 0) goto L20
        L1e:
            r4 = 1
            goto L3c
        L20:
            java.util.Iterator r0 = r0.iterator()
        L24:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L1e
            r3 = r0
            i.t.y r3 = (i.t.y) r3
            int r3 = r3.b()
            char r3 = r4.charAt(r3)
            boolean r3 = i.d0.b.c(r3)
            if (r3 != 0) goto L24
            r4 = 0
        L3c:
            if (r4 == 0) goto L3f
        L3e:
            r1 = 1
        L3f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: i.d0.p.q(java.lang.CharSequence):boolean");
    }

    public static final boolean r(String str, int i2, String str2, int i3, int i4, boolean z) {
        i.y.d.l.d(str, "$this$regionMatches");
        i.y.d.l.d(str2, "other");
        return !z ? str.regionMatches(i2, str2, i3, i4) : str.regionMatches(z, i2, str2, i3, i4);
    }

    public static String t(CharSequence charSequence, int i2) {
        i.y.d.l.d(charSequence, "$this$repeat");
        int i3 = 1;
        if (!(i2 >= 0)) {
            throw new IllegalArgumentException(("Count 'n' must be non-negative, but was " + i2 + CoreConstants.DOT).toString());
        }
        if (i2 == 0) {
            return "";
        }
        if (i2 == 1) {
            return charSequence.toString();
        }
        int length = charSequence.length();
        if (length == 0) {
            return "";
        }
        if (length == 1) {
            char cCharAt = charSequence.charAt(0);
            char[] cArr = new char[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                cArr[i4] = cCharAt;
            }
            return new String(cArr);
        }
        StringBuilder sb = new StringBuilder(charSequence.length() * i2);
        if (1 <= i2) {
            while (true) {
                sb.append(charSequence);
                if (i3 == i2) {
                    break;
                }
                i3++;
            }
        }
        String string = sb.toString();
        i.y.d.l.c(string, "sb.toString()");
        return string;
    }

    public static final String u(String str, char c2, char c3, boolean z) {
        i.y.d.l.d(str, "$this$replace");
        if (!z) {
            String strReplace = str.replace(c2, c3);
            i.y.d.l.c(strReplace, "(this as java.lang.Strin…replace(oldChar, newChar)");
            return strReplace;
        }
        StringBuilder sb = new StringBuilder(str.length());
        for (int i2 = 0; i2 < str.length(); i2++) {
            char cCharAt = str.charAt(i2);
            if (c.d(cCharAt, c2, z)) {
                cCharAt = c3;
            }
            sb.append(cCharAt);
        }
        String string = sb.toString();
        i.y.d.l.c(string, "StringBuilder(capacity).…builderAction).toString()");
        return string;
    }

    public static final String v(String str, String str2, String str3, boolean z) {
        i.y.d.l.d(str, "$this$replace");
        i.y.d.l.d(str2, "oldValue");
        i.y.d.l.d(str3, "newValue");
        int i2 = 0;
        int iN = q.N(str, str2, 0, z);
        if (iN < 0) {
            return str;
        }
        int length = str2.length();
        int iB = i.a0.f.b(length, 1);
        int length2 = (str.length() - length) + str3.length();
        if (length2 < 0) {
            throw new OutOfMemoryError();
        }
        StringBuilder sb = new StringBuilder(length2);
        do {
            sb.append((CharSequence) str, i2, iN);
            sb.append(str3);
            i2 = iN + length;
            if (iN >= str.length()) {
                break;
            }
            iN = q.N(str, str2, iN + iB, z);
        } while (iN > 0);
        sb.append((CharSequence) str, i2, str.length());
        String string = sb.toString();
        i.y.d.l.c(string, "stringBuilder.append(this, i, length).toString()");
        return string;
    }

    public static /* synthetic */ String w(String str, char c2, char c3, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return u(str, c2, c3, z);
    }

    public static /* synthetic */ String x(String str, String str2, String str3, boolean z, int i2, Object obj) {
        if ((i2 & 4) != 0) {
            z = false;
        }
        return v(str, str2, str3, z);
    }

    public static boolean y(String str, String str2, int i2, boolean z) {
        i.y.d.l.d(str, "$this$startsWith");
        i.y.d.l.d(str2, "prefix");
        return !z ? str.startsWith(str2, i2) : r(str, i2, str2, 0, str2.length(), z);
    }

    public static boolean z(String str, String str2, boolean z) {
        i.y.d.l.d(str, "$this$startsWith");
        i.y.d.l.d(str2, "prefix");
        return !z ? str.startsWith(str2) : r(str, 0, str2, 0, str2.length(), z);
    }
}