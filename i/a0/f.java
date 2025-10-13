package i.a0;

import ch.qos.logback.core.CoreConstants;
import i.a0.a;
import i.y.d.l;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: _Ranges.kt */
/* loaded from: classes3.dex */
public class f extends e {
    public static int b(int i2, int i3) {
        return i2 < i3 ? i3 : i2;
    }

    public static long c(long j2, long j3) {
        return j2 < j3 ? j3 : j2;
    }

    public static int d(int i2, int i3) {
        return i2 > i3 ? i3 : i2;
    }

    public static long e(long j2, long j3) {
        return j2 > j3 ? j3 : j2;
    }

    public static int f(int i2, int i3, int i4) {
        if (i3 <= i4) {
            return i2 < i3 ? i3 : i2 > i4 ? i4 : i2;
        }
        throw new IllegalArgumentException("Cannot coerce value to an empty range: maximum " + i4 + " is less than minimum " + i3 + CoreConstants.DOT);
    }

    public static a g(int i2, int i3) {
        return a.f15768e.a(i2, i3, -1);
    }

    public static a h(a aVar, int i2) {
        l.d(aVar, "$this$step");
        e.a(i2 > 0, Integer.valueOf(i2));
        a.C0197a c0197a = a.f15768e;
        int iA = aVar.a();
        int iC = aVar.c();
        if (aVar.e() <= 0) {
            i2 = -i2;
        }
        return c0197a.a(iA, iC, i2);
    }

    public static c i(int i2, int i3) {
        return i3 <= Integer.MIN_VALUE ? c.f15777j.a() : new c(i2, i3 - 1);
    }
}