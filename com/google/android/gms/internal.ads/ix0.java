package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ix0 implements mo2<nh0<ta0>> {
    private final wo2<qx0> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f6635b;

    public ix0(wo2<qx0> wo2Var, wo2<Executor> wo2Var2) {
        this.a = wo2Var;
        this.f6635b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        qx0 qx0VarZzb = this.a.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new nh0(qx0VarZzb, h52Var);
    }
}