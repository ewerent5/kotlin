package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class e51 implements u42<r40> {
    final /* synthetic */ f51 a;

    e51(f51 f51Var) {
        this.a = f51Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        g93 g93VarG = this.a.a.b().g(th);
        this.a.f5801d.B0(g93VarG);
        gq1.a(g93VarG.f6091e, th, "DelayedBannerAd.onFailure");
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(r40 r40Var) {
        r40Var.a();
    }
}