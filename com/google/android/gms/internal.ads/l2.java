package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class l2 extends o {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ m2 f7167e;

    /* synthetic */ l2(m2 m2Var, j2 j2Var) {
        this.f7167e = m2Var;
    }

    @Override // com.google.android.gms.internal.ads.p
    public final void Q2(m93 m93Var, int i2) {
        er.zzf("This app is using a lightweight version of the Google Mobile Ads SDK that requires the latest Google Play services to be installed, but Google Play services is either missing or out of date.");
        xq.a.post(new k2(this));
    }

    @Override // com.google.android.gms.internal.ads.p
    public final void zze(m93 m93Var) {
        Q2(m93Var, 1);
    }

    @Override // com.google.android.gms.internal.ads.p
    public final String zzf() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.p
    public final boolean zzg() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.p
    public final String zzh() {
        return null;
    }
}