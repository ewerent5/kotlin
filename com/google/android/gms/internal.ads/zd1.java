package com.google.android.gms.internal.ads;

import ch.qos.logback.core.spi.AbstractComponentTracker;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zd1 implements mo2<td1<nd1>> {
    private final wo2<md1> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<com.google.android.gms.common.util.f> f10582b;

    public zd1(wo2<md1> wo2Var, wo2<com.google.android.gms.common.util.f> wo2Var2) {
        this.a = wo2Var;
        this.f10582b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new td1(((od1) this.a).zzb(), AbstractComponentTracker.LINGERING_TIMEOUT, this.f10582b.zzb());
    }
}