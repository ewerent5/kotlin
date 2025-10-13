package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.formats.UnifiedNativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class z8 extends j8 {

    /* renamed from: e, reason: collision with root package name */
    private final UnifiedNativeAd.UnconfirmedClickListener f10571e;

    public z8(UnifiedNativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.f10571e = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.l8
    public final void zze(String str) {
        this.f10571e.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.l8
    public final void zzf() {
        this.f10571e.onUnconfirmedClickCancelled();
    }
}