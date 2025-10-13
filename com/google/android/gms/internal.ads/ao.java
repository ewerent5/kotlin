package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ao implements u42<Void> {
    final /* synthetic */ g52 a;

    ao(bo boVar, g52 g52Var) {
        this.a = g52Var;
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final void zza(Throwable th) {
        bo.a.remove(this.a);
    }

    @Override // com.google.android.gms.internal.ads.u42
    public final /* bridge */ /* synthetic */ void zzb(Void r2) {
        bo.a.remove(this.a);
    }
}