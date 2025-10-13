package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class t90 implements mo2<s90> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<xo1> f9094b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<ak> f9095c;

    public t90(wo2<Context> wo2Var, wo2<xo1> wo2Var2, wo2<ak> wo2Var3) {
        this.a = wo2Var;
        this.f9094b = wo2Var2;
        this.f9095c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new s90(this.a.zzb(), ((j70) this.f9094b).a(), new ak(), null);
    }
}