package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;
import com.google.android.gms.ads.OnUserEarnedRewardListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class tn extends cn {

    /* renamed from: e, reason: collision with root package name */
    private FullScreenContentCallback f9210e;

    /* renamed from: f, reason: collision with root package name */
    private OnUserEarnedRewardListener f9211f;

    @Override // com.google.android.gms.internal.ads.dn
    public final void I(g93 g93Var) {
        FullScreenContentCallback fullScreenContentCallback = this.f9210e;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(g93Var.c());
        }
    }

    public final void I4(FullScreenContentCallback fullScreenContentCallback) {
        this.f9210e = fullScreenContentCallback;
    }

    public final void J4(OnUserEarnedRewardListener onUserEarnedRewardListener) {
        this.f9211f = onUserEarnedRewardListener;
    }

    @Override // com.google.android.gms.internal.ads.dn
    public final void Q0(xm xmVar) {
        OnUserEarnedRewardListener onUserEarnedRewardListener = this.f9211f;
        if (onUserEarnedRewardListener != null) {
            onUserEarnedRewardListener.onUserEarnedReward(new kn(xmVar));
        }
    }

    @Override // com.google.android.gms.internal.ads.dn
    public final void Z(int i2) {
    }

    @Override // com.google.android.gms.internal.ads.dn
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f9210e;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.dn
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f9210e;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.dn
    public final void zzj() {
        FullScreenContentCallback fullScreenContentCallback = this.f9210e;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }
}