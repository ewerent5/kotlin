package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.overlay.zzp;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rk1 implements ta0, pc0, jm1, zzp, ad0 {

    /* renamed from: e, reason: collision with root package name */
    private final yq1 f8667e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<t33> f8668f = new AtomicReference<>();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<u33> f8669g = new AtomicReference<>();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<x33> f8670h = new AtomicReference<>();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<pc0> f8671i = new AtomicReference<>();

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference<zzp> f8672j = new AtomicReference<>();

    /* renamed from: k, reason: collision with root package name */
    private final AtomicReference<h1> f8673k = new AtomicReference<>();

    /* renamed from: l, reason: collision with root package name */
    private rk1 f8674l = null;

    public rk1(yq1 yq1Var) {
        this.f8667e = yq1Var;
    }

    public static rk1 a(rk1 rk1Var) {
        rk1 rk1Var2 = new rk1(rk1Var.f8667e);
        rk1Var2.f8674l = rk1Var;
        return rk1Var2;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void B0(final g93 g93Var) {
        rk1 rk1Var = this.f8674l;
        if (rk1Var != null) {
            rk1Var.B0(g93Var);
        } else {
            am1.a(this.f8668f, new zl1(g93Var) { // from class: com.google.android.gms.internal.ads.jk1
                private final g93 a;

                {
                    this.a = g93Var;
                }

                @Override // com.google.android.gms.internal.ads.zl1
                public final void zza(Object obj) {
                    ((t33) obj).x(this.a);
                }
            });
            am1.a(this.f8668f, new zl1(g93Var) { // from class: com.google.android.gms.internal.ads.kk1
                private final g93 a;

                {
                    this.a = g93Var;
                }

                @Override // com.google.android.gms.internal.ads.zl1
                public final void zza(Object obj) {
                    ((t33) obj).g(this.a.f6091e);
                }
            });
        }
    }

    public final void b(t33 t33Var) {
        this.f8668f.set(t33Var);
    }

    @Override // com.google.android.gms.internal.ads.ad0
    public final void c(final t93 t93Var) {
        rk1 rk1Var = this.f8674l;
        if (rk1Var != null) {
            rk1Var.c(t93Var);
        } else {
            am1.a(this.f8673k, new zl1(t93Var) { // from class: com.google.android.gms.internal.ads.fk1
                private final t93 a;

                {
                    this.a = t93Var;
                }

                @Override // com.google.android.gms.internal.ads.zl1
                public final void zza(Object obj) {
                    ((h1) obj).W2(this.a);
                }
            });
        }
    }

    public final void d(x33 x33Var) {
        this.f8670h.set(x33Var);
    }

    public final void e(pc0 pc0Var) {
        this.f8671i.set(pc0Var);
    }

    @Override // com.google.android.gms.internal.ads.jm1
    public final void f(jm1 jm1Var) {
        this.f8674l = (rk1) jm1Var;
    }

    public final void g(zzp zzpVar) {
        this.f8672j.set(zzpVar);
    }

    public final void h(h1 h1Var) {
        this.f8673k.set(h1Var);
    }

    public final void i(final q33 q33Var) {
        rk1 rk1Var = this.f8674l;
        if (rk1Var != null) {
            rk1Var.i(q33Var);
        } else {
            am1.a(this.f8668f, new zl1(q33Var) { // from class: com.google.android.gms.internal.ads.ik1
                private final q33 a;

                {
                    this.a = q33Var;
                }

                @Override // com.google.android.gms.internal.ads.zl1
                public final void zza(Object obj) {
                    ((t33) obj).c0(this.a);
                }
            });
        }
    }

    public final void j() {
        rk1 rk1Var = this.f8674l;
        if (rk1Var != null) {
            rk1Var.j();
            return;
        }
        this.f8667e.b();
        am1.a(this.f8669g, lk1.a);
        am1.a(this.f8670h, mk1.a);
    }

    public final void k(u33 u33Var) {
        this.f8669g.set(u33Var);
    }

    @Override // com.google.android.gms.internal.ads.pc0
    public final void t() {
        rk1 rk1Var = this.f8674l;
        if (rk1Var != null) {
            rk1Var.t();
        } else {
            am1.a(this.f8671i, nk1.a);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbJ() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbo() {
        rk1 rk1Var = this.f8674l;
        if (rk1Var != null) {
            rk1Var.zzbo();
            return;
        }
        am1.a(this.f8672j, ok1.a);
        am1.a(this.f8670h, pk1.a);
        am1.a(this.f8670h, qk1.a);
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbr() {
        rk1 rk1Var = this.f8674l;
        if (rk1Var != null) {
            rk1Var.zzbr();
        } else {
            am1.a(this.f8672j, hk1.a);
        }
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbs() {
    }

    @Override // com.google.android.gms.ads.internal.overlay.zzp
    public final void zzbt(final int i2) {
        rk1 rk1Var = this.f8674l;
        if (rk1Var != null) {
            rk1Var.zzbt(i2);
        } else {
            am1.a(this.f8672j, new zl1(i2) { // from class: com.google.android.gms.internal.ads.gk1
                private final int a;

                {
                    this.a = i2;
                }

                @Override // com.google.android.gms.internal.ads.zl1
                public final void zza(Object obj) {
                    ((zzp) obj).zzbt(this.a);
                }
            });
        }
    }
}