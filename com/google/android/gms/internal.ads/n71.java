package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class n71 implements mo2<m71> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<dr0> f7664b;

    public n71(wo2<Context> wo2Var, wo2<dr0> wo2Var2) {
        this.a = wo2Var;
        this.f7664b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final m71 zzb() {
        return new m71(this.a.zzb(), this.f7664b.zzb());
    }
}