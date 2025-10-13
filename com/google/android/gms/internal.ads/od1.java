package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class od1 implements mo2<md1> {
    private final wo2<h52> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f7939b;

    public od1(wo2<h52> wo2Var, wo2<Context> wo2Var2) {
        this.a = wo2Var;
        this.f7939b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final md1 zzb() {
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new md1(h52Var, ((hy) this.f7939b).a());
    }
}