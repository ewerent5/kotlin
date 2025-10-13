package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yg1 implements mo2<xg1> {
    private final wo2<h52> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Context> f10425b;

    public yg1(wo2<h52> wo2Var, wo2<Context> wo2Var2) {
        this.a = wo2Var;
        this.f10425b = wo2Var2;
    }

    public static xg1 a(h52 h52Var, Context context) {
        return new xg1(h52Var, context);
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new xg1(h52Var, ((vq1) this.f10425b).a());
    }
}