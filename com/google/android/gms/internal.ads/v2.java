package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.rewarded.OnAdMetadataChangedListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class v2 extends c1 {

    /* renamed from: e, reason: collision with root package name */
    private final OnAdMetadataChangedListener f9623e;

    public v2(OnAdMetadataChangedListener onAdMetadataChangedListener) {
        this.f9623e = onAdMetadataChangedListener;
    }

    @Override // com.google.android.gms.internal.ads.e1
    public final void zze() {
        OnAdMetadataChangedListener onAdMetadataChangedListener = this.f9623e;
        if (onAdMetadataChangedListener != null) {
            onAdMetadataChangedListener.onAdMetadataChanged();
        }
    }
}