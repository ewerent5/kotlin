package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ts0 implements mo2<nh0<c93>> {
    private final wo2<jt0> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f9240b;

    public ts0(wo2<jt0> wo2Var, wo2<Executor> wo2Var2) {
        this.a = wo2Var;
        this.f9240b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        jt0 jt0VarZzb = this.a.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new nh0(jt0VarZzb, h52Var);
    }
}