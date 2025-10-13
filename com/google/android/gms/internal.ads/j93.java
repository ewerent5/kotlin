package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.AdLoadCallback;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class j93<AdT> extends l {

    /* renamed from: e, reason: collision with root package name */
    private final AdLoadCallback<AdT> f6712e;

    /* renamed from: f, reason: collision with root package name */
    private final AdT f6713f;

    public j93(AdLoadCallback<AdT> adLoadCallback, AdT adt) {
        this.f6712e = adLoadCallback;
        this.f6713f = adt;
    }

    @Override // com.google.android.gms.internal.ads.m
    public final void o4(g93 g93Var) {
        AdLoadCallback<AdT> adLoadCallback = this.f6712e;
        if (adLoadCallback != null) {
            adLoadCallback.onAdFailedToLoad(g93Var.I());
        }
    }

    @Override // com.google.android.gms.internal.ads.m
    public final void zzb() {
        AdT adt;
        AdLoadCallback<AdT> adLoadCallback = this.f6712e;
        if (adLoadCallback == null || (adt = this.f6713f) == null) {
            return;
        }
        adLoadCallback.onAdLoaded(adt);
    }
}