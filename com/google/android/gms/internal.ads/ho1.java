package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ho1 implements u42<xq0> {
    final /* synthetic */ lb1 a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ jo1 f6366b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ko1 f6367c;

    ho1(ko1 ko1Var, lb1 lb1Var, jo1 jo1Var) {
        this.f6367c = ko1Var;
        this.a = lb1Var;
        this.f6366b = jo1Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        dr0 dr0Var = (dr0) this.f6367c.f7018e.zzc();
        final g93 g93VarB = dr0Var == null ? mq1.b(th, null) : dr0Var.zzc().g(th);
        synchronized (this.f6367c) {
            if (dr0Var != null) {
                dr0Var.zzb().B0(g93VarB);
                this.f6367c.f7015b.execute(new Runnable(this, g93VarB) { // from class: com.google.android.gms.internal.ads.go1

                    /* renamed from: e, reason: collision with root package name */
                    private final ho1 f6151e;

                    /* renamed from: f, reason: collision with root package name */
                    private final g93 f6152f;

                    {
                        this.f6151e = this;
                        this.f6152f = g93VarB;
                    }

                    @Override // java.lang.Runnable
                    public final void run() {
                        ho1 ho1Var = this.f6151e;
                        ho1Var.f6367c.f7017d.B0(this.f6152f);
                    }
                });
            } else {
                this.f6367c.f7017d.B0(g93VarB);
                this.f6367c.g(this.f6366b).zza().zzc().d().zzp();
            }
            gq1.a(g93VarB.f6091e, th, "RewardedAdLoader.onFailure");
            this.a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(xq0 xq0Var) {
        xq0 xq0Var2 = xq0Var;
        synchronized (this.f6367c) {
            xq0Var2.f().d(this.f6367c.f7017d);
            this.a.zzb(xq0Var2);
            Executor executor = this.f6367c.f7015b;
            ao1 ao1Var = this.f6367c.f7017d;
            ao1Var.getClass();
            executor.execute(fo1.a(ao1Var));
            this.f6367c.f7017d.m();
        }
    }
}