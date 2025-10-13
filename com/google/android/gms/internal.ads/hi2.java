package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class hi2 implements wk2 {
    private final gi2 a;

    /* renamed from: b, reason: collision with root package name */
    private int f6336b;

    /* renamed from: c, reason: collision with root package name */
    private int f6337c;

    /* renamed from: d, reason: collision with root package name */
    private int f6338d = 0;

    private hi2(gi2 gi2Var) {
        oj2.b(gi2Var, "input");
        this.a = gi2Var;
        gi2Var.f6132b = this;
    }

    public static hi2 A(gi2 gi2Var) {
        hi2 hi2Var = gi2Var.f6132b;
        return hi2Var != null ? hi2Var : new hi2(gi2Var);
    }

    private final void u(int i2) throws pj2 {
        if ((this.f6336b & 7) != i2) {
            throw qj2.g();
        }
    }

    private final <T> T v(dl2<T> dl2Var, qi2 qi2Var) throws qj2 {
        int iU = this.a.u();
        gi2 gi2Var = this.a;
        if (gi2Var.a >= 100) {
            throw new qj2("Protocol message had too many levels of nesting.  May be malicious.  Use CodedInputStream.setRecursionLimit() to increase the depth limit.");
        }
        int iA = gi2Var.A(iU);
        T tZza = dl2Var.zza();
        this.a.a++;
        dl2Var.f(tZza, this, qi2Var);
        dl2Var.j(tZza);
        this.a.h(0);
        r5.a--;
        this.a.a(iA);
        return tZza;
    }

    private final <T> T w(dl2<T> dl2Var, qi2 qi2Var) {
        int i2 = this.f6337c;
        this.f6337c = ((this.f6336b >>> 3) << 3) | 4;
        try {
            T tZza = dl2Var.zza();
            dl2Var.f(tZza, this, qi2Var);
            dl2Var.j(tZza);
            if (this.f6336b == this.f6337c) {
                return tZza;
            }
            throw qj2.i();
        } finally {
            this.f6337c = i2;
        }
    }

    private final void x(int i2) throws qj2 {
        if (this.a.c() != i2) {
            throw qj2.b();
        }
    }

    private static final void y(int i2) throws qj2 {
        if ((i2 & 3) != 0) {
            throw qj2.i();
        }
    }

    private static final void z(int i2) throws qj2 {
        if ((i2 & 7) != 0) {
            throw qj2.i();
        }
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void a(List<Integer> list) throws qj2 {
        int iG;
        int iG2;
        if (!(list instanceof fj2)) {
            int i2 = this.f6336b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.y()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iG = this.a.g();
                    }
                } while (iG == this.f6336b);
                this.f6338d = iG;
                return;
            }
            if (i2 != 2) {
                throw qj2.g();
            }
            int iC = this.a.c() + this.a.u();
            do {
                list.add(Integer.valueOf(this.a.y()));
            } while (this.a.c() < iC);
            x(iC);
            return;
        }
        fj2 fj2Var = (fj2) list;
        int i3 = this.f6336b & 7;
        if (i3 == 0) {
            do {
                fj2Var.Z(this.a.y());
                if (this.a.b()) {
                    return;
                } else {
                    iG2 = this.a.g();
                }
            } while (iG2 == this.f6336b);
            this.f6338d = iG2;
            return;
        }
        if (i3 != 2) {
            throw qj2.g();
        }
        int iC2 = this.a.c() + this.a.u();
        do {
            fj2Var.Z(this.a.y());
        } while (this.a.c() < iC2);
        x(iC2);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void b(List<Float> list) throws qj2 {
        int iG;
        int iG2;
        if (!(list instanceof yi2)) {
            int i2 = this.f6336b & 7;
            if (i2 == 2) {
                int iU = this.a.u();
                y(iU);
                int iC = this.a.c() + iU;
                do {
                    list.add(Float.valueOf(this.a.k()));
                } while (this.a.c() < iC);
                return;
            }
            if (i2 != 5) {
                throw qj2.g();
            }
            do {
                list.add(Float.valueOf(this.a.k()));
                if (this.a.b()) {
                    return;
                } else {
                    iG = this.a.g();
                }
            } while (iG == this.f6336b);
            this.f6338d = iG;
            return;
        }
        yi2 yi2Var = (yi2) list;
        int i3 = this.f6336b & 7;
        if (i3 == 2) {
            int iU2 = this.a.u();
            y(iU2);
            int iC2 = this.a.c() + iU2;
            do {
                yi2Var.c(this.a.k());
            } while (this.a.c() < iC2);
            return;
        }
        if (i3 != 5) {
            throw qj2.g();
        }
        do {
            yi2Var.c(this.a.k());
            if (this.a.b()) {
                return;
            } else {
                iG2 = this.a.g();
            }
        } while (iG2 == this.f6336b);
        this.f6338d = iG2;
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void c(List<Boolean> list) throws qj2 {
        int iG;
        int iG2;
        if (!(list instanceof qh2)) {
            int i2 = this.f6336b & 7;
            if (i2 == 0) {
                do {
                    list.add(Boolean.valueOf(this.a.q()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iG = this.a.g();
                    }
                } while (iG == this.f6336b);
                this.f6338d = iG;
                return;
            }
            if (i2 != 2) {
                throw qj2.g();
            }
            int iC = this.a.c() + this.a.u();
            do {
                list.add(Boolean.valueOf(this.a.q()));
            } while (this.a.c() < iC);
            x(iC);
            return;
        }
        qh2 qh2Var = (qh2) list;
        int i3 = this.f6336b & 7;
        if (i3 == 0) {
            do {
                qh2Var.c(this.a.q());
                if (this.a.b()) {
                    return;
                } else {
                    iG2 = this.a.g();
                }
            } while (iG2 == this.f6336b);
            this.f6338d = iG2;
            return;
        }
        if (i3 != 2) {
            throw qj2.g();
        }
        int iC2 = this.a.c() + this.a.u();
        do {
            qh2Var.c(this.a.q());
        } while (this.a.c() < iC2);
        x(iC2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.wk2
    public final <T> void d(List<T> list, dl2<T> dl2Var, qi2 qi2Var) throws pj2 {
        int iG;
        int i2 = this.f6336b;
        if ((i2 & 7) != 3) {
            throw qj2.g();
        }
        do {
            list.add(w(dl2Var, qi2Var));
            if (this.a.b() || this.f6338d != 0) {
                return;
            } else {
                iG = this.a.g();
            }
        } while (iG == i2);
        this.f6338d = iG;
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void e(List<Long> list) throws qj2 {
        int iG;
        int iG2;
        if (!(list instanceof ak2)) {
            int i2 = this.f6336b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.a.x()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iG = this.a.g();
                    }
                } while (iG == this.f6336b);
                this.f6338d = iG;
                return;
            }
            if (i2 != 2) {
                throw qj2.g();
            }
            int iU = this.a.u();
            z(iU);
            int iC = this.a.c() + iU;
            do {
                list.add(Long.valueOf(this.a.x()));
            } while (this.a.c() < iC);
            return;
        }
        ak2 ak2Var = (ak2) list;
        int i3 = this.f6336b & 7;
        if (i3 == 1) {
            do {
                ak2Var.f(this.a.x());
                if (this.a.b()) {
                    return;
                } else {
                    iG2 = this.a.g();
                }
            } while (iG2 == this.f6336b);
            this.f6338d = iG2;
            return;
        }
        if (i3 != 2) {
            throw qj2.g();
        }
        int iU2 = this.a.u();
        z(iU2);
        int iC2 = this.a.c() + iU2;
        do {
            ak2Var.f(this.a.x());
        } while (this.a.c() < iC2);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void f(List<Double> list) throws qj2 {
        int iG;
        int iG2;
        if (!(list instanceof ni2)) {
            int i2 = this.f6336b & 7;
            if (i2 == 1) {
                do {
                    list.add(Double.valueOf(this.a.j()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iG = this.a.g();
                    }
                } while (iG == this.f6336b);
                this.f6338d = iG;
                return;
            }
            if (i2 != 2) {
                throw qj2.g();
            }
            int iU = this.a.u();
            z(iU);
            int iC = this.a.c() + iU;
            do {
                list.add(Double.valueOf(this.a.j()));
            } while (this.a.c() < iC);
            return;
        }
        ni2 ni2Var = (ni2) list;
        int i3 = this.f6336b & 7;
        if (i3 == 1) {
            do {
                ni2Var.c(this.a.j());
                if (this.a.b()) {
                    return;
                } else {
                    iG2 = this.a.g();
                }
            } while (iG2 == this.f6336b);
            this.f6338d = iG2;
            return;
        }
        if (i3 != 2) {
            throw qj2.g();
        }
        int iU2 = this.a.u();
        z(iU2);
        int iC2 = this.a.c() + iU2;
        do {
            ni2Var.c(this.a.j());
        } while (this.a.c() < iC2);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void g(List<Integer> list) throws qj2 {
        int iG;
        int iG2;
        if (!(list instanceof fj2)) {
            int i2 = this.f6336b & 7;
            if (i2 == 2) {
                int iU = this.a.u();
                y(iU);
                int iC = this.a.c() + iU;
                do {
                    list.add(Integer.valueOf(this.a.p()));
                } while (this.a.c() < iC);
                return;
            }
            if (i2 != 5) {
                throw qj2.g();
            }
            do {
                list.add(Integer.valueOf(this.a.p()));
                if (this.a.b()) {
                    return;
                } else {
                    iG = this.a.g();
                }
            } while (iG == this.f6336b);
            this.f6338d = iG;
            return;
        }
        fj2 fj2Var = (fj2) list;
        int i3 = this.f6336b & 7;
        if (i3 == 2) {
            int iU2 = this.a.u();
            y(iU2);
            int iC2 = this.a.c() + iU2;
            do {
                fj2Var.Z(this.a.p());
            } while (this.a.c() < iC2);
            return;
        }
        if (i3 != 5) {
            throw qj2.g();
        }
        do {
            fj2Var.Z(this.a.p());
            if (this.a.b()) {
                return;
            } else {
                iG2 = this.a.g();
            }
        } while (iG2 == this.f6336b);
        this.f6338d = iG2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.internal.ads.wk2
    public final <T> void h(List<T> list, dl2<T> dl2Var, qi2 qi2Var) throws pj2 {
        int iG;
        int i2 = this.f6336b;
        if ((i2 & 7) != 2) {
            throw qj2.g();
        }
        do {
            list.add(v(dl2Var, qi2Var));
            if (this.a.b() || this.f6338d != 0) {
                return;
            } else {
                iG = this.a.g();
            }
        } while (iG == i2);
        this.f6338d = iG;
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void i(List<Long> list) throws qj2 {
        int iG;
        int iG2;
        if (!(list instanceof ak2)) {
            int i2 = this.f6336b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.z()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iG = this.a.g();
                    }
                } while (iG == this.f6336b);
                this.f6338d = iG;
                return;
            }
            if (i2 != 2) {
                throw qj2.g();
            }
            int iC = this.a.c() + this.a.u();
            do {
                list.add(Long.valueOf(this.a.z()));
            } while (this.a.c() < iC);
            x(iC);
            return;
        }
        ak2 ak2Var = (ak2) list;
        int i3 = this.f6336b & 7;
        if (i3 == 0) {
            do {
                ak2Var.f(this.a.z());
                if (this.a.b()) {
                    return;
                } else {
                    iG2 = this.a.g();
                }
            } while (iG2 == this.f6336b);
            this.f6338d = iG2;
            return;
        }
        if (i3 != 2) {
            throw qj2.g();
        }
        int iC2 = this.a.c() + this.a.u();
        do {
            ak2Var.f(this.a.z());
        } while (this.a.c() < iC2);
        x(iC2);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void j(List<Long> list) throws qj2 {
        int iG;
        int iG2;
        if (!(list instanceof ak2)) {
            int i2 = this.f6336b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.l()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iG = this.a.g();
                    }
                } while (iG == this.f6336b);
                this.f6338d = iG;
                return;
            }
            if (i2 != 2) {
                throw qj2.g();
            }
            int iC = this.a.c() + this.a.u();
            do {
                list.add(Long.valueOf(this.a.l()));
            } while (this.a.c() < iC);
            x(iC);
            return;
        }
        ak2 ak2Var = (ak2) list;
        int i3 = this.f6336b & 7;
        if (i3 == 0) {
            do {
                ak2Var.f(this.a.l());
                if (this.a.b()) {
                    return;
                } else {
                    iG2 = this.a.g();
                }
            } while (iG2 == this.f6336b);
            this.f6338d = iG2;
            return;
        }
        if (i3 != 2) {
            throw qj2.g();
        }
        int iC2 = this.a.c() + this.a.u();
        do {
            ak2Var.f(this.a.l());
        } while (this.a.c() < iC2);
        x(iC2);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final <T> T k(dl2<T> dl2Var, qi2 qi2Var) throws pj2 {
        u(2);
        return (T) v(dl2Var, qi2Var);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void l(List<Integer> list) throws qj2 {
        int iG;
        int iG2;
        if (!(list instanceof fj2)) {
            int i2 = this.f6336b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.u()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iG = this.a.g();
                    }
                } while (iG == this.f6336b);
                this.f6338d = iG;
                return;
            }
            if (i2 != 2) {
                throw qj2.g();
            }
            int iC = this.a.c() + this.a.u();
            do {
                list.add(Integer.valueOf(this.a.u()));
            } while (this.a.c() < iC);
            x(iC);
            return;
        }
        fj2 fj2Var = (fj2) list;
        int i3 = this.f6336b & 7;
        if (i3 == 0) {
            do {
                fj2Var.Z(this.a.u());
                if (this.a.b()) {
                    return;
                } else {
                    iG2 = this.a.g();
                }
            } while (iG2 == this.f6336b);
            this.f6338d = iG2;
            return;
        }
        if (i3 != 2) {
            throw qj2.g();
        }
        int iC2 = this.a.c() + this.a.u();
        do {
            fj2Var.Z(this.a.u());
        } while (this.a.c() < iC2);
        x(iC2);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void m(List<Long> list) throws qj2 {
        int iG;
        int iG2;
        if (!(list instanceof ak2)) {
            int i2 = this.f6336b & 7;
            if (i2 == 0) {
                do {
                    list.add(Long.valueOf(this.a.m()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iG = this.a.g();
                    }
                } while (iG == this.f6336b);
                this.f6338d = iG;
                return;
            }
            if (i2 != 2) {
                throw qj2.g();
            }
            int iC = this.a.c() + this.a.u();
            do {
                list.add(Long.valueOf(this.a.m()));
            } while (this.a.c() < iC);
            x(iC);
            return;
        }
        ak2 ak2Var = (ak2) list;
        int i3 = this.f6336b & 7;
        if (i3 == 0) {
            do {
                ak2Var.f(this.a.m());
                if (this.a.b()) {
                    return;
                } else {
                    iG2 = this.a.g();
                }
            } while (iG2 == this.f6336b);
            this.f6338d = iG2;
            return;
        }
        if (i3 != 2) {
            throw qj2.g();
        }
        int iC2 = this.a.c() + this.a.u();
        do {
            ak2Var.f(this.a.m());
        } while (this.a.c() < iC2);
        x(iC2);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final <T> T n(dl2<T> dl2Var, qi2 qi2Var) throws pj2 {
        u(3);
        return (T) w(dl2Var, qi2Var);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void o(List<ci2> list) throws pj2 {
        int iG;
        if ((this.f6336b & 7) != 2) {
            throw qj2.g();
        }
        do {
            list.add(zzq());
            if (this.a.b()) {
                return;
            } else {
                iG = this.a.g();
            }
        } while (iG == this.f6336b);
        this.f6338d = iG;
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void p(List<Integer> list) throws qj2 {
        int iG;
        int iG2;
        if (!(list instanceof fj2)) {
            int i2 = this.f6336b & 7;
            if (i2 == 2) {
                int iU = this.a.u();
                y(iU);
                int iC = this.a.c() + iU;
                do {
                    list.add(Integer.valueOf(this.a.w()));
                } while (this.a.c() < iC);
                return;
            }
            if (i2 != 5) {
                throw qj2.g();
            }
            do {
                list.add(Integer.valueOf(this.a.w()));
                if (this.a.b()) {
                    return;
                } else {
                    iG = this.a.g();
                }
            } while (iG == this.f6336b);
            this.f6338d = iG;
            return;
        }
        fj2 fj2Var = (fj2) list;
        int i3 = this.f6336b & 7;
        if (i3 == 2) {
            int iU2 = this.a.u();
            y(iU2);
            int iC2 = this.a.c() + iU2;
            do {
                fj2Var.Z(this.a.w());
            } while (this.a.c() < iC2);
            return;
        }
        if (i3 != 5) {
            throw qj2.g();
        }
        do {
            fj2Var.Z(this.a.w());
            if (this.a.b()) {
                return;
            } else {
                iG2 = this.a.g();
            }
        } while (iG2 == this.f6336b);
        this.f6338d = iG2;
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void q(List<Long> list) throws qj2 {
        int iG;
        int iG2;
        if (!(list instanceof ak2)) {
            int i2 = this.f6336b & 7;
            if (i2 == 1) {
                do {
                    list.add(Long.valueOf(this.a.o()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iG = this.a.g();
                    }
                } while (iG == this.f6336b);
                this.f6338d = iG;
                return;
            }
            if (i2 != 2) {
                throw qj2.g();
            }
            int iU = this.a.u();
            z(iU);
            int iC = this.a.c() + iU;
            do {
                list.add(Long.valueOf(this.a.o()));
            } while (this.a.c() < iC);
            return;
        }
        ak2 ak2Var = (ak2) list;
        int i3 = this.f6336b & 7;
        if (i3 == 1) {
            do {
                ak2Var.f(this.a.o());
                if (this.a.b()) {
                    return;
                } else {
                    iG2 = this.a.g();
                }
            } while (iG2 == this.f6336b);
            this.f6338d = iG2;
            return;
        }
        if (i3 != 2) {
            throw qj2.g();
        }
        int iU2 = this.a.u();
        z(iU2);
        int iC2 = this.a.c() + iU2;
        do {
            ak2Var.f(this.a.o());
        } while (this.a.c() < iC2);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void r(List<Integer> list) throws qj2 {
        int iG;
        int iG2;
        if (!(list instanceof fj2)) {
            int i2 = this.f6336b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.v()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iG = this.a.g();
                    }
                } while (iG == this.f6336b);
                this.f6338d = iG;
                return;
            }
            if (i2 != 2) {
                throw qj2.g();
            }
            int iC = this.a.c() + this.a.u();
            do {
                list.add(Integer.valueOf(this.a.v()));
            } while (this.a.c() < iC);
            x(iC);
            return;
        }
        fj2 fj2Var = (fj2) list;
        int i3 = this.f6336b & 7;
        if (i3 == 0) {
            do {
                fj2Var.Z(this.a.v());
                if (this.a.b()) {
                    return;
                } else {
                    iG2 = this.a.g();
                }
            } while (iG2 == this.f6336b);
            this.f6338d = iG2;
            return;
        }
        if (i3 != 2) {
            throw qj2.g();
        }
        int iC2 = this.a.c() + this.a.u();
        do {
            fj2Var.Z(this.a.v());
        } while (this.a.c() < iC2);
        x(iC2);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final void s(List<Integer> list) throws qj2 {
        int iG;
        int iG2;
        if (!(list instanceof fj2)) {
            int i2 = this.f6336b & 7;
            if (i2 == 0) {
                do {
                    list.add(Integer.valueOf(this.a.n()));
                    if (this.a.b()) {
                        return;
                    } else {
                        iG = this.a.g();
                    }
                } while (iG == this.f6336b);
                this.f6338d = iG;
                return;
            }
            if (i2 != 2) {
                throw qj2.g();
            }
            int iC = this.a.c() + this.a.u();
            do {
                list.add(Integer.valueOf(this.a.n()));
            } while (this.a.c() < iC);
            x(iC);
            return;
        }
        fj2 fj2Var = (fj2) list;
        int i3 = this.f6336b & 7;
        if (i3 == 0) {
            do {
                fj2Var.Z(this.a.n());
                if (this.a.b()) {
                    return;
                } else {
                    iG2 = this.a.g();
                }
            } while (iG2 == this.f6336b);
            this.f6338d = iG2;
            return;
        }
        if (i3 != 2) {
            throw qj2.g();
        }
        int iC2 = this.a.c() + this.a.u();
        do {
            fj2Var.Z(this.a.n());
        } while (this.a.c() < iC2);
        x(iC2);
    }

    public final void t(List<String> list, boolean z) throws pj2 {
        int iG;
        int iG2;
        if ((this.f6336b & 7) != 2) {
            throw qj2.g();
        }
        if (!(list instanceof uj2) || z) {
            do {
                list.add(z ? zzn() : zzm());
                if (this.a.b()) {
                    return;
                } else {
                    iG = this.a.g();
                }
            } while (iG == this.f6336b);
            this.f6338d = iG;
            return;
        }
        uj2 uj2Var = (uj2) list;
        do {
            uj2Var.i(zzq());
            if (this.a.b()) {
                return;
            } else {
                iG2 = this.a.g();
            }
        } while (iG2 == this.f6336b);
        this.f6338d = iG2;
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final int zzb() {
        int iG = this.f6338d;
        if (iG != 0) {
            this.f6336b = iG;
            this.f6338d = 0;
        } else {
            iG = this.a.g();
            this.f6336b = iG;
        }
        if (iG == 0 || iG == this.f6337c) {
            return Integer.MAX_VALUE;
        }
        return iG >>> 3;
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final int zzc() {
        return this.f6336b;
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final boolean zzd() {
        int i2;
        if (this.a.b() || (i2 = this.f6336b) == this.f6337c) {
            return false;
        }
        return this.a.i(i2);
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final double zze() throws pj2 {
        u(1);
        return this.a.j();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final float zzf() throws pj2 {
        u(5);
        return this.a.k();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final long zzg() throws pj2 {
        u(0);
        return this.a.l();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final long zzh() throws pj2 {
        u(0);
        return this.a.m();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final int zzi() throws pj2 {
        u(0);
        return this.a.n();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final long zzj() throws pj2 {
        u(1);
        return this.a.o();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final int zzk() throws pj2 {
        u(5);
        return this.a.p();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final boolean zzl() throws pj2 {
        u(0);
        return this.a.q();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final String zzm() throws pj2 {
        u(2);
        return this.a.r();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final String zzn() throws pj2 {
        u(2);
        return this.a.s();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final ci2 zzq() throws pj2 {
        u(2);
        return this.a.t();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final int zzr() throws pj2 {
        u(0);
        return this.a.u();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final int zzs() throws pj2 {
        u(0);
        return this.a.v();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final int zzt() throws pj2 {
        u(5);
        return this.a.w();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final long zzu() throws pj2 {
        u(1);
        return this.a.x();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final int zzv() throws pj2 {
        u(0);
        return this.a.y();
    }

    @Override // com.google.android.gms.internal.ads.wk2
    public final long zzw() throws pj2 {
        u(0);
        return this.a.z();
    }
}