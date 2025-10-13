package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class o61 implements mo2<n61> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<gk0> f7916b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<kr> f7917c;

    public o61(wo2<Context> wo2Var, wo2<gk0> wo2Var2, wo2<kr> wo2Var3) {
        this.a = wo2Var;
        this.f7916b = wo2Var2;
        this.f7917c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new n61(this.a.zzb(), this.f7916b.zzb(), ((qy) this.f7917c).a());
    }
}