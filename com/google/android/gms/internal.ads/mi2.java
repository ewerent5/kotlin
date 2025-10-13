package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class mi2 {
    private final li2 a;

    private mi2(li2 li2Var) {
        oj2.b(li2Var, "output");
        this.a = li2Var;
        li2Var.f7258c = this;
    }

    public static mi2 l(li2 li2Var) {
        mi2 mi2Var = li2Var.f7258c;
        return mi2Var != null ? mi2Var : new mi2(li2Var);
    }

    public final void A(int i2, int i3) {
        this.a.i(i2, (i3 >> 31) ^ (i3 + i3));
    }

    public final void B(int i2, long j2) {
        this.a.k(i2, (j2 >> 63) ^ (j2 + j2));
    }

    public final void C(int i2, Object obj, dl2 dl2Var) {
        lk2 lk2Var = (lk2) obj;
        ji2 ji2Var = (ji2) this.a;
        ji2Var.r((i2 << 3) | 2);
        lh2 lh2Var = (lh2) lk2Var;
        int iC = lh2Var.c();
        if (iC == -1) {
            iC = dl2Var.c(lh2Var);
            lh2Var.h(iC);
        }
        ji2Var.r(iC);
        dl2Var.h(lk2Var, ji2Var.f7258c);
    }

    public final void D(int i2, Object obj, dl2 dl2Var) {
        li2 li2Var = this.a;
        li2Var.g(i2, 3);
        dl2Var.h((lk2) obj, li2Var.f7258c);
        li2Var.g(i2, 4);
    }

    public final void E(int i2) {
        this.a.g(i2, 3);
    }

    public final void F(int i2) {
        this.a.g(i2, 4);
    }

    public final void G(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.h(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int iZ = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZ += li2.z(list.get(i4).intValue());
        }
        this.a.r(iZ);
        while (i3 < list.size()) {
            this.a.q(list.get(i3).intValue());
            i3++;
        }
    }

    public final void H(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.j(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            i4 += 4;
        }
        this.a.r(i4);
        while (i3 < list.size()) {
            this.a.s(list.get(i3).intValue());
            i3++;
        }
    }

    public final void I(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.k(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int iB = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iB += li2.B(list.get(i4).longValue());
        }
        this.a.r(iB);
        while (i3 < list.size()) {
            this.a.t(list.get(i3).longValue());
            i3++;
        }
    }

    public final void J(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.k(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int iB = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iB += li2.B(list.get(i4).longValue());
        }
        this.a.r(iB);
        while (i3 < list.size()) {
            this.a.t(list.get(i3).longValue());
            i3++;
        }
    }

    public final void K(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.l(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            i4 += 8;
        }
        this.a.r(i4);
        while (i3 < list.size()) {
            this.a.u(list.get(i3).longValue());
            i3++;
        }
    }

    public final void a(int i2, List<Float> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.j(i2, Float.floatToRawIntBits(list.get(i3).floatValue()));
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).floatValue();
            i4 += 4;
        }
        this.a.r(i4);
        while (i3 < list.size()) {
            this.a.s(Float.floatToRawIntBits(list.get(i3).floatValue()));
            i3++;
        }
    }

    public final void b(int i2, List<Double> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.l(i2, Double.doubleToRawLongBits(list.get(i3).doubleValue()));
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).doubleValue();
            i4 += 8;
        }
        this.a.r(i4);
        while (i3 < list.size()) {
            this.a.u(Double.doubleToRawLongBits(list.get(i3).doubleValue()));
            i3++;
        }
    }

    public final void c(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.h(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int iZ = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZ += li2.z(list.get(i4).intValue());
        }
        this.a.r(iZ);
        while (i3 < list.size()) {
            this.a.q(list.get(i3).intValue());
            i3++;
        }
    }

    public final void d(int i2, List<Boolean> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.m(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).booleanValue();
            i4++;
        }
        this.a.r(i4);
        while (i3 < list.size()) {
            this.a.p(list.get(i3).booleanValue() ? (byte) 1 : (byte) 0);
            i3++;
        }
    }

    public final void e(int i2, List<String> list) {
        int i3 = 0;
        if (!(list instanceof uj2)) {
            while (i3 < list.size()) {
                this.a.n(i2, list.get(i3));
                i3++;
            }
            return;
        }
        uj2 uj2Var = (uj2) list;
        while (i3 < list.size()) {
            Object objW = uj2Var.W(i3);
            if (objW instanceof String) {
                this.a.n(i2, (String) objW);
            } else {
                this.a.o(i2, (ci2) objW);
            }
            i3++;
        }
    }

    public final void f(int i2, List<ci2> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.a.o(i2, list.get(i3));
        }
    }

    public final void g(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.i(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int iA = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iA += li2.A(list.get(i4).intValue());
        }
        this.a.r(iA);
        while (i3 < list.size()) {
            this.a.r(list.get(i3).intValue());
            i3++;
        }
    }

    public final void h(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.j(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).intValue();
            i4 += 4;
        }
        this.a.r(i4);
        while (i3 < list.size()) {
            this.a.s(list.get(i3).intValue());
            i3++;
        }
    }

    public final void i(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.l(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int i4 = 0;
        for (int i5 = 0; i5 < list.size(); i5++) {
            list.get(i5).longValue();
            i4 += 8;
        }
        this.a.r(i4);
        while (i3 < list.size()) {
            this.a.u(list.get(i3).longValue());
            i3++;
        }
    }

    public final void j(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                li2 li2Var = this.a;
                int iIntValue = list.get(i3).intValue();
                li2Var.i(i2, (iIntValue >> 31) ^ (iIntValue + iIntValue));
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int iA = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            int iIntValue2 = list.get(i4).intValue();
            iA += li2.A((iIntValue2 >> 31) ^ (iIntValue2 + iIntValue2));
        }
        this.a.r(iA);
        while (i3 < list.size()) {
            li2 li2Var2 = this.a;
            int iIntValue3 = list.get(i3).intValue();
            li2Var2.r((iIntValue3 >> 31) ^ (iIntValue3 + iIntValue3));
            i3++;
        }
    }

    public final void k(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                li2 li2Var = this.a;
                long jLongValue = list.get(i3).longValue();
                li2Var.k(i2, (jLongValue >> 63) ^ (jLongValue + jLongValue));
                i3++;
            }
            return;
        }
        this.a.g(i2, 2);
        int iB = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            long jLongValue2 = list.get(i4).longValue();
            iB += li2.B((jLongValue2 >> 63) ^ (jLongValue2 + jLongValue2));
        }
        this.a.r(iB);
        while (i3 < list.size()) {
            li2 li2Var2 = this.a;
            long jLongValue3 = list.get(i3).longValue();
            li2Var2.t((jLongValue3 >> 63) ^ (jLongValue3 + jLongValue3));
            i3++;
        }
    }

    public final void m(int i2, int i3) {
        this.a.j(i2, i3);
    }

    public final void n(int i2, long j2) {
        this.a.k(i2, j2);
    }

    public final void o(int i2, long j2) {
        this.a.l(i2, j2);
    }

    public final void p(int i2, float f2) {
        this.a.j(i2, Float.floatToRawIntBits(f2));
    }

    public final void q(int i2, double d2) {
        this.a.l(i2, Double.doubleToRawLongBits(d2));
    }

    public final void r(int i2, int i3) {
        this.a.h(i2, i3);
    }

    public final void s(int i2, long j2) {
        this.a.k(i2, j2);
    }

    public final void t(int i2, int i3) {
        this.a.h(i2, i3);
    }

    public final void u(int i2, long j2) {
        this.a.l(i2, j2);
    }

    public final void v(int i2, int i3) {
        this.a.j(i2, i3);
    }

    public final void w(int i2, boolean z) {
        this.a.m(i2, z);
    }

    public final void x(int i2, String str) {
        this.a.n(i2, str);
    }

    public final void y(int i2, ci2 ci2Var) {
        this.a.o(i2, ci2Var);
    }

    public final void z(int i2, int i3) {
        this.a.i(i2, i3);
    }
}