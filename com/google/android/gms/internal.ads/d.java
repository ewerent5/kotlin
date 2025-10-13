package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.FullScreenContentCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class d extends k0 {

    /* renamed from: e, reason: collision with root package name */
    private final FullScreenContentCallback f5395e;

    public d(FullScreenContentCallback fullScreenContentCallback) {
        this.f5395e = fullScreenContentCallback;
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final void s2(g93 g93Var) {
        FullScreenContentCallback fullScreenContentCallback = this.f5395e;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdFailedToShowFullScreenContent(g93Var.c());
        }
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final void zzc() {
        FullScreenContentCallback fullScreenContentCallback = this.f5395e;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdShowedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final void zzd() {
        FullScreenContentCallback fullScreenContentCallback = this.f5395e;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdDismissedFullScreenContent();
        }
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final void zze() {
        FullScreenContentCallback fullScreenContentCallback = this.f5395e;
        if (fullScreenContentCallback != null) {
            fullScreenContentCallback.onAdImpression();
        }
    }
}