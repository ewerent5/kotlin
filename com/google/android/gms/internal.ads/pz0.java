package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pz0 implements mo2<oz0> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<kp> f8308b;

    public pz0(wo2<Context> wo2Var, wo2<kp> wo2Var2) {
        this.a = wo2Var;
        this.f8308b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final oz0 zzb() {
        return new oz0(((vq1) this.a).a(), this.f8308b.zzb());
    }
}