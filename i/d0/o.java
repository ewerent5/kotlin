package i.d0;

import ch.qos.logback.classic.Level;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: StringNumberConversions.kt */
/* loaded from: classes3.dex */
public class o extends n {
    public static Integer i(String str) {
        i.y.d.l.d(str, "$this$toIntOrNull");
        return j(str, 10);
    }

    public static final Integer j(String str, int i2) {
        boolean z;
        int i3;
        i.y.d.l.d(str, "$this$toIntOrNull");
        b.a(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i4 = 0;
        char cCharAt = str.charAt(0);
        int i5 = -2147483647;
        int i6 = 1;
        if (i.y.d.l.e(cCharAt, 48) >= 0) {
            z = false;
            i6 = 0;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                i5 = Level.ALL_INT;
                z = true;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                z = false;
            }
        }
        int i7 = -59652323;
        while (i6 < length) {
            int iB = b.b(str.charAt(i6), i2);
            if (iB < 0) {
                return null;
            }
            if ((i4 < i7 && (i7 != -59652323 || i4 < (i7 = i5 / i2))) || (i3 = i4 * i2) < i5 + iB) {
                return null;
            }
            i4 = i3 - iB;
            i6++;
        }
        return z ? Integer.valueOf(i4) : Integer.valueOf(-i4);
    }

    public static Long k(String str) {
        i.y.d.l.d(str, "$this$toLongOrNull");
        return l(str, 10);
    }

    public static final Long l(String str, int i2) {
        i.y.d.l.d(str, "$this$toLongOrNull");
        b.a(i2);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i3 = 0;
        char cCharAt = str.charAt(0);
        long j2 = -9223372036854775807L;
        boolean z = true;
        if (i.y.d.l.e(cCharAt, 48) >= 0) {
            z = false;
        } else {
            if (length == 1) {
                return null;
            }
            if (cCharAt == '-') {
                j2 = Long.MIN_VALUE;
                i3 = 1;
            } else {
                if (cCharAt != '+') {
                    return null;
                }
                i3 = 1;
                z = false;
            }
        }
        long j3 = -256204778801521550L;
        long j4 = 0;
        long j5 = -256204778801521550L;
        while (i3 < length) {
            int iB = b.b(str.charAt(i3), i2);
            if (iB < 0) {
                return null;
            }
            if (j4 < j5) {
                if (j5 == j3) {
                    j5 = j2 / i2;
                    if (j4 < j5) {
                    }
                }
                return null;
            }
            long j6 = j4 * i2;
            long j7 = iB;
            if (j6 < j2 + j7) {
                return null;
            }
            j4 = j6 - j7;
            i3++;
            j3 = -256204778801521550L;
        }
        return z ? Long.valueOf(j4) : Long.valueOf(-j4);
    }
}