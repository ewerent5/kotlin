package com.google.android.gms.internal.ads;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ao1 extends gx1 implements dc0, ta0, qa0, eb0, ad0, jm1 {

    /* renamed from: e, reason: collision with root package name */
    private final yq1 f4948e;

    /* renamed from: f, reason: collision with root package name */
    private final AtomicReference<gx1> f4949f = new AtomicReference<>();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicReference<hn> f4950g = new AtomicReference<>();

    /* renamed from: h, reason: collision with root package name */
    private final AtomicReference<dn> f4951h = new AtomicReference<>();

    /* renamed from: i, reason: collision with root package name */
    private final AtomicReference<mm> f4952i = new AtomicReference<>();

    /* renamed from: j, reason: collision with root package name */
    private final AtomicReference<in> f4953j = new AtomicReference<>();

    /* renamed from: k, reason: collision with root package name */
    private final AtomicReference<hm> f4954k = new AtomicReference<>();

    /* renamed from: l, reason: collision with root package name */
    private final AtomicReference<h1> f4955l = new AtomicReference<>();

    /* renamed from: m, reason: collision with root package name */
    private ao1 f4956m = null;

    public ao1(yq1 yq1Var) {
        this.f4948e = yq1Var;
    }

    @Deprecated
    public final void A(mm mmVar) {
        this.f4952i.set(mmVar);
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void B0(final g93 g93Var) {
        ao1 ao1Var = this.f4956m;
        if (ao1Var != null) {
            ao1Var.B0(g93Var);
            return;
        }
        final int i2 = g93Var.f6091e;
        am1.a(this.f4950g, new zl1(g93Var) { // from class: com.google.android.gms.internal.ads.sn1
            private final g93 a;

            {
                this.a = g93Var;
            }

            @Override // com.google.android.gms.internal.ads.zl1
            public final void zza(Object obj) {
                ((hn) obj).e(this.a);
            }
        });
        am1.a(this.f4950g, new zl1(i2) { // from class: com.google.android.gms.internal.ads.tn1
            private final int a;

            {
                this.a = i2;
            }

            @Override // com.google.android.gms.internal.ads.zl1
            public final void zza(Object obj) {
                ((hn) obj).j(this.a);
            }
        });
        am1.a(this.f4952i, new zl1(i2) { // from class: com.google.android.gms.internal.ads.un1
            private final int a;

            {
                this.a = i2;
            }

            @Override // com.google.android.gms.internal.ads.zl1
            public final void zza(Object obj) {
                ((mm) obj).zzk(this.a);
            }
        });
    }

    public final void G(in inVar) {
        this.f4953j.set(inVar);
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final void I(final g93 g93Var) {
        ao1 ao1Var = this.f4956m;
        if (ao1Var != null) {
            ao1Var.I(g93Var);
        } else {
            am1.a(this.f4951h, new zl1(g93Var) { // from class: com.google.android.gms.internal.ads.nn1
                private final g93 a;

                {
                    this.a = g93Var;
                }

                @Override // com.google.android.gms.internal.ads.zl1
                public final void zza(Object obj) {
                    ((dn) obj).I(this.a);
                }
            });
            am1.a(this.f4951h, new zl1(g93Var) { // from class: com.google.android.gms.internal.ads.on1
                private final g93 a;

                {
                    this.a = g93Var;
                }

                @Override // com.google.android.gms.internal.ads.zl1
                public final void zza(Object obj) {
                    ((dn) obj).Z(this.a.f6091e);
                }
            });
        }
    }

    @Deprecated
    public final void R(hm hmVar) {
        this.f4954k.set(hmVar);
    }

    @Override // com.google.android.gms.internal.ads.dc0
    public final void b0() {
        ao1 ao1Var = this.f4956m;
        if (ao1Var != null) {
            ao1Var.b0();
        } else {
            am1.a(this.f4950g, en1.a);
            am1.a(this.f4952i, qn1.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.ad0
    public final void c(final t93 t93Var) {
        ao1 ao1Var = this.f4956m;
        if (ao1Var != null) {
            ao1Var.c(t93Var);
        } else {
            am1.a(this.f4955l, new zl1(t93Var) { // from class: com.google.android.gms.internal.ads.rn1
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

    @Override // com.google.android.gms.internal.ads.qa0
    public final void d(final gm gmVar, final String str, final String str2) {
        ao1 ao1Var = this.f4956m;
        if (ao1Var != null) {
            ao1Var.d(gmVar, str, str2);
            return;
        }
        am1.a(this.f4951h, new zl1(gmVar) { // from class: com.google.android.gms.internal.ads.in1
            private final gm a;

            {
                this.a = gmVar;
            }

            @Override // com.google.android.gms.internal.ads.zl1
            public final void zza(Object obj) {
                gm gmVar2 = this.a;
                ((dn) obj).Q0(new sn(gmVar2.zzb(), gmVar2.zzc()));
            }
        });
        am1.a(this.f4953j, new zl1(gmVar, str, str2) { // from class: com.google.android.gms.internal.ads.jn1
            private final gm a;

            /* renamed from: b, reason: collision with root package name */
            private final String f6785b;

            /* renamed from: c, reason: collision with root package name */
            private final String f6786c;

            {
                this.a = gmVar;
                this.f6785b = str;
                this.f6786c = str2;
            }

            @Override // com.google.android.gms.internal.ads.zl1
            public final void zza(Object obj) {
                gm gmVar2 = this.a;
                ((in) obj).R(new sn(gmVar2.zzb(), gmVar2.zzc()), this.f6785b, this.f6786c);
            }
        });
        am1.a(this.f4952i, new zl1(gmVar) { // from class: com.google.android.gms.internal.ads.kn1
            private final gm a;

            {
                this.a = gmVar;
            }

            @Override // com.google.android.gms.internal.ads.zl1
            public final void zza(Object obj) {
                ((mm) obj).O1(this.a);
            }
        });
        am1.a(this.f4954k, new zl1(gmVar, str, str2) { // from class: com.google.android.gms.internal.ads.ln1
            private final gm a;

            /* renamed from: b, reason: collision with root package name */
            private final String f7274b;

            /* renamed from: c, reason: collision with root package name */
            private final String f7275c;

            {
                this.a = gmVar;
                this.f7274b = str;
                this.f7275c = str2;
            }

            @Override // com.google.android.gms.internal.ads.zl1
            public final void zza(Object obj) {
                ((hm) obj).R(this.a, this.f7274b, this.f7275c);
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.jm1
    public final void f(jm1 jm1Var) {
        this.f4956m = (ao1) jm1Var;
    }

    @Override // com.google.android.gms.internal.ads.gx1
    public final void m() {
        ao1 ao1Var = this.f4956m;
        if (ao1Var != null) {
            ao1Var.m();
        } else {
            am1.a(this.f4949f, pn1.a);
        }
    }

    public final void o(hn hnVar) {
        this.f4950g.set(hnVar);
    }

    public final void u(dn dnVar) {
        this.f4951h.set(dnVar);
    }

    public final void x(gx1 gx1Var) {
        this.f4949f.set(gx1Var);
    }

    public final void z(h1 h1Var) {
        this.f4955l.set(h1Var);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzc() {
        ao1 ao1Var = this.f4956m;
        if (ao1Var != null) {
            ao1Var.zzc();
            return;
        }
        am1.a(this.f4951h, vn1.a);
        am1.a(this.f4952i, wn1.a);
        am1.a(this.f4951h, xn1.a);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzd() {
        ao1 ao1Var = this.f4956m;
        if (ao1Var != null) {
            ao1Var.zzd();
            return;
        }
        this.f4948e.b();
        am1.a(this.f4951h, yn1.a);
        am1.a(this.f4952i, zn1.a);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zze() {
        ao1 ao1Var = this.f4956m;
        if (ao1Var != null) {
            ao1Var.zze();
        } else {
            am1.a(this.f4952i, fn1.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzg() {
        ao1 ao1Var = this.f4956m;
        if (ao1Var != null) {
            ao1Var.zzg();
        } else {
            am1.a(this.f4952i, gn1.a);
        }
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzh() {
        ao1 ao1Var = this.f4956m;
        if (ao1Var != null) {
            ao1Var.zzh();
        } else {
            am1.a(this.f4952i, mn1.a);
        }
    }
}