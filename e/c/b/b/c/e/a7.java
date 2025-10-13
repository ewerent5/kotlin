package e.c.b.b.c.e;

import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class a7 implements eb {
    private final y6 a;

    private a7(y6 y6Var) {
        y6 y6Var2 = (y6) r7.f(y6Var, "output");
        this.a = y6Var2;
        y6Var2.f14947c = this;
    }

    public static a7 M(y6 y6Var) {
        a7 a7Var = y6Var.f14947c;
        return a7Var != null ? a7Var : new a7(y6Var);
    }

    @Override // e.c.b.b.c.e.eb
    public final void A(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.Q(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.a.m(i2, 2);
        int iN0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iN0 += y6.n0(list.get(i4).longValue());
        }
        this.a.O(iN0);
        while (i3 < list.size()) {
            this.a.S(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void B(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.n(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.a.m(i2, 2);
        int iI0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iI0 += y6.i0(list.get(i4).longValue());
        }
        this.a.O(iI0);
        while (i3 < list.size()) {
            this.a.t(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void C(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.f0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.m(i2, 2);
        int iS0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iS0 += y6.s0(list.get(i4).intValue());
        }
        this.a.O(iS0);
        while (i3 < list.size()) {
            this.a.W(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void D(int i2, List<Double> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.k(i2, list.get(i3).doubleValue());
                i3++;
            }
            return;
        }
        this.a.m(i2, 2);
        int iZ = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZ += y6.z(list.get(i4).doubleValue());
        }
        this.a.O(iZ);
        while (i3 < list.size()) {
            this.a.h(list.get(i3).doubleValue());
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void E(int i2, List<g6> list) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            this.a.o(i2, list.get(i3));
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void F(int i2, int i3) {
        this.a.j0(i2, i3);
    }

    @Override // e.c.b.b.c.e.eb
    public final void G(int i2, long j2) {
        this.a.Y(i2, j2);
    }

    @Override // e.c.b.b.c.e.eb
    public final void H(int i2, List<Float> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.l(i2, list.get(i3).floatValue());
                i3++;
            }
            return;
        }
        this.a.m(i2, 2);
        int iA = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iA += y6.A(list.get(i4).floatValue());
        }
        this.a.O(iA);
        while (i3 < list.size()) {
            this.a.i(list.get(i3).floatValue());
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final <K, V> void I(int i2, s8<K, V> s8Var, Map<K, V> map) {
        for (Map.Entry<K, V> entry : map.entrySet()) {
            this.a.m(i2, 2);
            this.a.O(t8.a(s8Var, entry.getKey(), entry.getValue()));
            t8.b(this.a, s8Var, entry.getKey(), entry.getValue());
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void J(int i2, int i3) {
        this.a.X(i2, i3);
    }

    @Override // e.c.b.b.c.e.eb
    public final void K(int i2, long j2) {
        this.a.Q(i2, j2);
    }

    @Override // e.c.b.b.c.e.eb
    public final void L(int i2, List<String> list) {
        int i3 = 0;
        if (!(list instanceof h8)) {
            while (i3 < list.size()) {
                this.a.r(i2, list.get(i3));
                i3++;
            }
            return;
        }
        h8 h8Var = (h8) list;
        while (i3 < list.size()) {
            Object objZzb = h8Var.zzb(i3);
            if (objZzb instanceof String) {
                this.a.r(i2, (String) objZzb);
            } else {
                this.a.o(i2, (g6) objZzb);
            }
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void a(int i2, String str) {
        this.a.r(i2, str);
    }

    @Override // e.c.b.b.c.e.eb
    public final void b(int i2) {
        this.a.m(i2, 3);
    }

    @Override // e.c.b.b.c.e.eb
    public final void c(int i2, boolean z) {
        this.a.s(i2, z);
    }

    @Override // e.c.b.b.c.e.eb
    public final void d(int i2, List<Boolean> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.s(i2, list.get(i3).booleanValue());
                i3++;
            }
            return;
        }
        this.a.m(i2, 2);
        int iL = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iL += y6.L(list.get(i4).booleanValue());
        }
        this.a.O(iL);
        while (i3 < list.size()) {
            this.a.y(list.get(i3).booleanValue());
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void e(int i2, List<?> list, s9 s9Var) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            n(i2, list.get(i3), s9Var);
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void f(int i2, long j2) {
        this.a.Y(i2, j2);
    }

    @Override // e.c.b.b.c.e.eb
    public final void g(int i2, int i3) {
        this.a.P(i2, i3);
    }

    @Override // e.c.b.b.c.e.eb
    public final void h(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.P(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.m(i2, 2);
        int iK0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iK0 += y6.k0(list.get(i4).intValue());
        }
        this.a.O(iK0);
        while (i3 < list.size()) {
            this.a.j(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void i(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.P(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.m(i2, 2);
        int iB0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iB0 += y6.B0(list.get(i4).intValue());
        }
        this.a.O(iB0);
        while (i3 < list.size()) {
            this.a.j(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void j(int i2, int i3) {
        this.a.P(i2, i3);
    }

    @Override // e.c.b.b.c.e.eb
    public final void k(int i2, long j2) {
        this.a.n(i2, j2);
    }

    @Override // e.c.b.b.c.e.eb
    public final void l(int i2, Object obj) {
        if (obj instanceof g6) {
            this.a.R(i2, (g6) obj);
        } else {
            this.a.p(i2, (b9) obj);
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void m(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.n(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.a.m(i2, 2);
        int iD0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iD0 += y6.d0(list.get(i4).longValue());
        }
        this.a.O(iD0);
        while (i3 < list.size()) {
            this.a.t(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void n(int i2, Object obj, s9 s9Var) {
        this.a.q(i2, (b9) obj, s9Var);
    }

    @Override // e.c.b.b.c.e.eb
    public final void o(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.Y(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.a.m(i2, 2);
        int iV0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iV0 += y6.v0(list.get(i4).longValue());
        }
        this.a.O(iV0);
        while (i3 < list.size()) {
            this.a.Z(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void p(int i2, g6 g6Var) {
        this.a.o(i2, g6Var);
    }

    @Override // e.c.b.b.c.e.eb
    public final void q(int i2, Object obj, s9 s9Var) {
        y6 y6Var = this.a;
        y6Var.m(i2, 3);
        s9Var.c((b9) obj, y6Var.f14947c);
        y6Var.m(i2, 4);
    }

    @Override // e.c.b.b.c.e.eb
    public final void r(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.j0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.m(i2, 2);
        int iW0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iW0 += y6.w0(list.get(i4).intValue());
        }
        this.a.O(iW0);
        while (i3 < list.size()) {
            this.a.e0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void s(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.X(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.m(i2, 2);
        int iO0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iO0 += y6.o0(list.get(i4).intValue());
        }
        this.a.O(iO0);
        while (i3 < list.size()) {
            this.a.O(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void t(int i2, List<Integer> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.j0(i2, list.get(i3).intValue());
                i3++;
            }
            return;
        }
        this.a.m(i2, 2);
        int iZ0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iZ0 += y6.z0(list.get(i4).intValue());
        }
        this.a.O(iZ0);
        while (i3 < list.size()) {
            this.a.e0(list.get(i3).intValue());
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void u(int i2, List<?> list, s9 s9Var) {
        for (int i3 = 0; i3 < list.size(); i3++) {
            q(i2, list.get(i3), s9Var);
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void v(int i2, int i3) {
        this.a.j0(i2, i3);
    }

    @Override // e.c.b.b.c.e.eb
    public final void w(int i2, double d2) {
        this.a.k(i2, d2);
    }

    @Override // e.c.b.b.c.e.eb
    public final void x(int i2, float f2) {
        this.a.l(i2, f2);
    }

    @Override // e.c.b.b.c.e.eb
    public final void y(int i2, List<Long> list, boolean z) {
        int i3 = 0;
        if (!z) {
            while (i3 < list.size()) {
                this.a.Y(i2, list.get(i3).longValue());
                i3++;
            }
            return;
        }
        this.a.m(i2, 2);
        int iR0 = 0;
        for (int i4 = 0; i4 < list.size(); i4++) {
            iR0 += y6.r0(list.get(i4).longValue());
        }
        this.a.O(iR0);
        while (i3 < list.size()) {
            this.a.Z(list.get(i3).longValue());
            i3++;
        }
    }

    @Override // e.c.b.b.c.e.eb
    public final void z(int i2, int i3) {
        this.a.f0(i2, i3);
    }

    @Override // e.c.b.b.c.e.eb
    public final int zza() {
        return hb.a;
    }

    @Override // e.c.b.b.c.e.eb
    public final void zzb(int i2) {
        this.a.m(i2, 4);
    }

    @Override // e.c.b.b.c.e.eb
    public final void zza(int i2, long j2) {
        this.a.n(i2, j2);
    }
}