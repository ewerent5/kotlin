package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.nativead.NativeAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class hj extends j8 {

    /* renamed from: e, reason: collision with root package name */
    private final NativeAd.UnconfirmedClickListener f6339e;

    public hj(NativeAd.UnconfirmedClickListener unconfirmedClickListener) {
        this.f6339e = unconfirmedClickListener;
    }

    @Override // com.google.android.gms.internal.ads.l8
    public final void zze(String str) {
        this.f6339e.onUnconfirmedClickReceived(str);
    }

    @Override // com.google.android.gms.internal.ads.l8
    public final void zzf() {
        this.f6339e.onUnconfirmedClickCancelled();
    }
}