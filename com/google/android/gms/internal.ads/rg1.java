package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rg1 implements mo2<pg1> {
    private final wo2<h52> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f8647b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<kr> f8648c;

    public rg1(wo2<h52> wo2Var, wo2<Context> wo2Var2, wo2<kr> wo2Var3) {
        this.a = wo2Var;
        this.f8647b = wo2Var2;
        this.f8648c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new pg1(h52Var, ((vq1) this.f8647b).a(), ((qy) this.f8648c).a());
    }
}