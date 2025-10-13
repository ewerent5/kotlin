package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.RewardedAd;
import com.google.android.gms.ads.rewarded.RewardedAdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class nn extends gn {

    /* renamed from: e, reason: collision with root package name */
    private final RewardedAdLoadCallback f7758e;

    /* renamed from: f, reason: collision with root package name */
    private final RewardedAd f7759f;

    public nn(RewardedAdLoadCallback rewardedAdLoadCallback, RewardedAd rewardedAd) {
        this.f7758e = rewardedAdLoadCallback;
        this.f7759f = rewardedAd;
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void e(g93 g93Var) {
        if (this.f7758e != null) {
            this.f7758e.onAdFailedToLoad(g93Var.I());
        }
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void j(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.hn
    public final void zze() {
        RewardedAdLoadCallback rewardedAdLoadCallback = this.f7758e;
        if (rewardedAdLoadCallback != null) {
            rewardedAdLoadCallback.onAdLoaded(this.f7759f);
        }
    }
}