package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class e70 implements u42<z60> {
    final /* synthetic */ u42 a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ g70 f5592b;

    e70(g70 g70Var, u42 u42Var) {
        this.f5592b = g70Var;
        this.a = u42Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        this.a.zza(th);
        qr.f8450e.execute(new Runnable(this.f5592b) { // from class: com.google.android.gms.internal.ads.d70

            /* renamed from: e, reason: collision with root package name */
            private final g70 f5441e;

            {
                this.f5441e = g70Var;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f5441e.c();
            }
        });
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(z60 z60Var) {
        g70.e(this.f5592b, z60Var.a, this.a);
    }
}