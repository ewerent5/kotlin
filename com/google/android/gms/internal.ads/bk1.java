package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class bk1 implements u42 {
    final /* synthetic */ lb1 a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ ck1 f5124b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ dk1 f5125c;

    bk1(dk1 dk1Var, lb1 lb1Var, ck1 ck1Var) {
        this.f5125c = dk1Var;
        this.a = lb1Var;
        this.f5124b = ck1Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        y30 y30Var = (y30) this.f5125c.f5480e.zzc();
        final g93 g93VarB = y30Var == null ? mq1.b(th, null) : y30Var.zzc().g(th);
        synchronized (this.f5125c) {
            dk1.e(this.f5125c, null);
            if (y30Var != null) {
                y30Var.zzb().B0(g93VarB);
                if (((Boolean) c.c().b(w3.p5)).booleanValue()) {
                    this.f5125c.f5477b.execute(new Runnable(this, g93VarB) { // from class: com.google.android.gms.internal.ads.ak1

                        /* renamed from: e, reason: collision with root package name */
                        private final bk1 f4927e;

                        /* renamed from: f, reason: collision with root package name */
                        private final g93 f4928f;

                        {
                            this.f4927e = this;
                            this.f4928f = g93VarB;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            bk1 bk1Var = this.f4927e;
                            bk1Var.f5125c.f5479d.B0(this.f4928f);
                        }
                    });
                }
            } else {
                this.f5125c.f5479d.B0(g93VarB);
                ((y30) this.f5125c.j(this.f5124b).zzf()).zzc().d().zzp();
            }
            gq1.a(g93VarB.f6091e, th, "AppOpenAdLoader.onFailure");
            this.a.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        s60 s60Var = (s60) obj;
        synchronized (this.f5125c) {
            dk1.e(this.f5125c, null);
            if (((Boolean) c.c().b(w3.p5)).booleanValue()) {
                s60Var.f().c(this.f5125c.f5479d);
            }
            this.a.zzb(s60Var);
        }
    }
}