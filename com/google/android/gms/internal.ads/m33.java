package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class m33 extends w33 {

    /* renamed from: e, reason: collision with root package name */
    private FullScreenContentCallback f7414e;

    @Override // com.google.android.gms.internal.ads.x33
    public final void F(g93 g93Var) {
        FullScreenContentCallback fullScreenContentCallback = this.f7414e;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(g93Var.c());
        }
    }

    public final void I4(FullScreenContentCallback fullScreenContentCallback) {
        this.f7414e = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.internal.ads.x33
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.f7414e;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.x33
    public final void zzd() {
        FullScreenContentCallback fullScreenContentCallback = this.f7414e;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.x33
    public final void zzf() {
        FullScreenContentCallback fullScreenContentCallback = this.f7414e;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }
}