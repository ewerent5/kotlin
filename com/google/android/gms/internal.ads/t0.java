package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.MuteThisAdListener;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class t0 extends r0 {

    /* renamed from: e, reason: collision with root package name */
    private final MuteThisAdListener f9046e;

    public t0(MuteThisAdListener muteThisAdListener) {
        this.f9046e = muteThisAdListener;
    }

    @Override // com.google.android.gms.internal.ads.s0
    public final void zze() {
        this.f9046e.onAdMuted();
    }
}