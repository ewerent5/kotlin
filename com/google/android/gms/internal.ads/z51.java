package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class z51 implements mo2<y51> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<jj0> f10566b;

    public z51(wo2<Context> wo2Var, wo2<jj0> wo2Var2) {
        this.a = wo2Var;
        this.f10566b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final y51 zzb() {
        return new y51(this.a.zzb(), this.f10566b.zzb());
    }
}