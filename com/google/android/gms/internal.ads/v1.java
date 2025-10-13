package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.LoadAdError;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class v1 extends ua3 {

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ w1 f9620c;

    v1(w1 w1Var) {
        this.f9620c = w1Var;
    }

    @Override // com.google.android.gms.internal.ads.ua3, com.google.android.gms.ads.AdListener
    public final void onAdFailedToLoad(LoadAdError loadAdError) {
        this.f9620c.f9835d.zza(this.f9620c.z());
        super.onAdFailedToLoad(loadAdError);
    }

    @Override // com.google.android.gms.internal.ads.ua3, com.google.android.gms.ads.AdListener
    public final void onAdLoaded() {
        this.f9620c.f9835d.zza(this.f9620c.z());
        super.onAdLoaded();
    }
}