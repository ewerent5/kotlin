package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewardedinterstitial.RewardedInterstitialAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class un extends gn {

    /* renamed from: e, reason: collision with root package name */
    private final RewardedInterstitialAdLoadCallback f9516e;

    /* renamed from: f, reason: collision with root package name */
    private final vn f9517f;

    public un(RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback, vn vnVar) {
        this.f9516e = rewardedInterstitialAdLoadCallback;
        this.f9517f = vnVar;
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void e(g93 g93Var) {
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.f9516e;
        if (rewardedInterstitialAdLoadCallback != null) {
            rewardedInterstitialAdLoadCallback.onAdFailedToLoad(g93Var.I());
        }
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void j(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zze() {
        vn vnVar;
        RewardedInterstitialAdLoadCallback rewardedInterstitialAdLoadCallback = this.f9516e;
        if (rewardedInterstitialAdLoadCallback == null || (vnVar = this.f9517f) == null) {
            return;
        }
        rewardedInterstitialAdLoadCallback.onAdLoaded(vnVar);
    }
}