package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mi1 implements mo2<ki1> {
    private final wo2<k43> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<h52> f7493b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Context> f7494c;

    public mi1(wo2<k43> wo2Var, wo2<h52> wo2Var2, wo2<Context> wo2Var3) {
        this.a = wo2Var;
        this.f7493b = wo2Var2;
        this.f7494c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        k43 k43Var = new k43();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new ki1(k43Var, h52Var, ((hy) this.f7494c).a(), null);
    }
}