package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class x41 implements mo2<w41> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<p50> f10122b;

    public x41(wo2<Context> wo2Var, wo2<p50> wo2Var2) {
        this.a = wo2Var;
        this.f10122b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final w41 zzb() {
        return new w41(this.a.zzb(), this.f10122b.zzb());
    }
}