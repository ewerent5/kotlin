package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class y8 extends d8 {

    /* renamed from: e, reason: collision with root package name */
    private final UnifiedNativeAd.OnUnifiedNativeAdLoadedListener f10387e;

    public y8(UnifiedNativeAd.OnUnifiedNativeAdLoadedListener onUnifiedNativeAdLoadedListener) {
        this.f10387e = onUnifiedNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.e8
    public final void p4(o8 o8Var) {
        this.f10387e.onUnifiedNativeAdLoaded(new p8(o8Var));
    }
}