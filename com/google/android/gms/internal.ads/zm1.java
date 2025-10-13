package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zm1 implements u42<li0> {
    final /* synthetic */ lb1 a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jj0 f10620b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ an1 f10621c;

    zm1(an1 an1Var, lb1 lb1Var, jj0 jj0Var) {
        this.f10621c = an1Var;
        this.a = lb1Var;
        this.f10620b = jj0Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        final g93 g93VarG = this.f10620b.b().g(th);
        synchronized (this.f10621c) {
            an1.d(this.f10621c, null);
            this.f10620b.a().B0(g93VarG);
            if (((Boolean) c.c().b(w3.q5)).booleanValue()) {
                this.f10621c.f4941b.execute(new Runnable(this, g93VarG) { // from class: com.google.android.gms.internal.ads.xm1

                    /* renamed from: e, reason: collision with root package name */
                    private final zm1 f10191e;

                    /* renamed from: f, reason: collision with root package name */
                    private final g93 f10192f;

                    {
                        this.f10191e = this;
                        this.f10192f = g93VarG;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zm1 zm1Var = this.f10191e;
                        zm1Var.f10621c.f4943d.B0(this.f10192f);
                    }
                });
                this.f10621c.f4941b.execute(new Runnable(this, g93VarG) { // from class: com.google.android.gms.internal.ads.ym1

                    /* renamed from: e, reason: collision with root package name */
                    private final zm1 f10454e;

                    /* renamed from: f, reason: collision with root package name */
                    private final g93 f10455f;

                    {
                        this.f10454e = this;
                        this.f10455f = g93VarG;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        zm1 zm1Var = this.f10454e;
                        zm1Var.f10621c.f4944e.B0(this.f10455f);
                    }
                });
            }
            gq1.a(g93VarG.f6091e, th, "InterstitialAdLoader.onFailure");
            this.a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(li0 li0Var) {
        li0 li0Var2 = li0Var;
        synchronized (this.f10621c) {
            an1.d(this.f10621c, null);
            o3<Boolean> o3Var = w3.q5;
            if (((Boolean) c.c().b(o3Var)).booleanValue()) {
                pe0 pe0VarF = li0Var2.f();
                pe0VarF.a(this.f10621c.f4943d);
                pe0VarF.d(this.f10621c.f4944e);
            }
            this.a.zzb(li0Var2);
            if (((Boolean) c.c().b(o3Var)).booleanValue()) {
                this.f10621c.f4941b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.vm1

                    /* renamed from: e, reason: collision with root package name */
                    private final zm1 f9739e;

                    {
                        this.f9739e = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9739e.f10621c.f4943d.b0();
                    }
                });
                this.f10621c.f4941b.execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.wm1

                    /* renamed from: e, reason: collision with root package name */
                    private final zm1 f9997e;

                    {
                        this.f9997e = this;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f9997e.f10621c.f4944e.b0();
                    }
                });
            }
        }
    }
}