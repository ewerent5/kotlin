package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ng1 implements mo2<lg1> {
    private final wo2<kp> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<h52> f7703b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Context> f7704c;

    public ng1(wo2<kp> wo2Var, wo2<h52> wo2Var2, wo2<Context> wo2Var3) {
        this.a = wo2Var;
        this.f7703b = wo2Var2;
        this.f7704c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        kp kpVarZzb = this.a.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new lg1(kpVarZzb, h52Var, ((vq1) this.f7704c).a());
    }
}