package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class sb1 implements u42<s60> {
    final /* synthetic */ lb1 a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ gk0 f8849b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ tb1 f8850c;

    sb1(tb1 tb1Var, lb1 lb1Var, gk0 gk0Var) {
        this.f8850c = tb1Var;
        this.a = lb1Var;
        this.f8849b = gk0Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        final g93 g93VarG = this.f8849b.a().g(th);
        this.f8849b.b().B0(g93VarG);
        this.f8850c.f9110b.h().execute(new Runnable(this, g93VarG) { // from class: com.google.android.gms.internal.ads.rb1

            /* renamed from: e, reason: collision with root package name */
            private final sb1 f8631e;

            /* renamed from: f, reason: collision with root package name */
            private final g93 f8632f;

            {
                this.f8631e = this;
                this.f8632f = g93VarG;
            }

            @Override // java.lang.Runnable
            public final void run() {
                sb1 sb1Var = this.f8631e;
                sb1Var.f8850c.f9112d.e().B0(this.f8632f);
            }
        });
        gq1.a(g93VarG.f6091e, th, "NativeAdLoader.onFailure");
        this.a.zza();
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(s60 s60Var) {
        s60 s60Var2 = s60Var;
        synchronized (this.f8850c) {
            s60Var2.f().a(this.f8850c.f9112d.c());
            this.a.zzb(s60Var2);
            this.f8850c.f9110b.h().execute(new Runnable(this) { // from class: com.google.android.gms.internal.ads.qb1

                /* renamed from: e, reason: collision with root package name */
                private final sb1 f8358e;

                {
                    this.f8358e = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f8358e.f8850c.f9112d.d().b0();
                }
            });
        }
    }
}