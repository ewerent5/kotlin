package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class lu1 implements mo2<ku1> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<kr> f7313b;

    public lu1(wo2<Context> wo2Var, wo2<kr> wo2Var2) {
        this.a = wo2Var;
        this.f7313b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final ku1 zzb() {
        return new ku1(((hy) this.a).a(), ((qy) this.f7313b).a());
    }
}