package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.h5.OnH5AdsEventListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class ua extends wa {

    /* renamed from: e, reason: collision with root package name */
    private final OnH5AdsEventListener f9409e;

    public ua(OnH5AdsEventListener onH5AdsEventListener) {
        this.f9409e = onH5AdsEventListener;
    }

    @Override // com.google.android.gms.internal.ads.xa
    public final void c(String str) {
        this.f9409e.onH5AdsEvent(str);
    }
}