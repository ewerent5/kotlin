package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class rl2<T, B> {
    rl2() {
    }

    abstract boolean a(wk2 wk2Var);

    abstract void b(B b2, int i2, long j2);

    abstract void c(B b2, int i2, int i3);

    abstract void d(B b2, int i2, long j2);

    abstract void e(B b2, int i2, ci2 ci2Var);

    abstract void f(B b2, int i2, T t);

    abstract B g();

    abstract T h(B b2);

    abstract void i(Object obj, T t);

    abstract T j(Object obj);

    abstract B k(Object obj);

    abstract void l(Object obj, B b2);

    abstract void m(Object obj);

    final boolean n(B b2, wk2 wk2Var) throws qj2 {
        int iZzc = wk2Var.zzc();
        int i2 = iZzc >>> 3;
        int i3 = iZzc & 7;
        if (i3 == 0) {
            b(b2, i2, wk2Var.zzh());
            return true;
        }
        if (i3 == 1) {
            d(b2, i2, wk2Var.zzj());
            return true;
        }
        if (i3 == 2) {
            e(b2, i2, wk2Var.zzq());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw qj2.g();
            }
            c(b2, i2, wk2Var.zzk());
            return true;
        }
        B bG = g();
        int i4 = 4 | (i2 << 3);
        while (wk2Var.zzb() != Integer.MAX_VALUE && n(bG, wk2Var)) {
        }
        if (i4 != wk2Var.zzc()) {
            throw qj2.f();
        }
        h(bG);
        f(b2, i2, bG);
        return true;
    }

    abstract T o(T t, T t2);

    abstract int p(T t);

    abstract int q(T t);

    abstract void r(T t, mi2 mi2Var);
}