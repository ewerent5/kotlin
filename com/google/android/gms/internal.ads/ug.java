package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.mediation.MediationInterscrollerAd;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class ug extends bg {

    /* renamed from: e, reason: collision with root package name */
    private final MediationInterscrollerAd f9453e;

    public ug(MediationInterscrollerAd mediationInterscrollerAd) {
        this.f9453e = mediationInterscrollerAd;
    }

    @Override // com.google.android.gms.internal.ads.cg
    public final e.c.b.b.b.b zze() {
        return e.c.b.b.b.d.m4(this.f9453e.getView());
    }

    @Override // com.google.android.gms.internal.ads.cg
    public final boolean zzf() {
        return this.f9453e.shouldDelegateInterscrollerEffect();
    }
}