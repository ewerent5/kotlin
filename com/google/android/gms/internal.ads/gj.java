package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class gj extends d8 {

    /* renamed from: e, reason: collision with root package name */
    private final NativeAd.OnNativeAdLoadedListener f6133e;

    public gj(NativeAd.OnNativeAdLoadedListener onNativeAdLoadedListener) {
        this.f6133e = onNativeAdLoadedListener;
    }

    @Override // com.google.android.gms.internal.ads.e8
    public final void p4(o8 o8Var) {
        this.f6133e.onNativeAdLoaded(new aj(o8Var));
    }
}