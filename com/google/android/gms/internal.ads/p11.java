package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class p11 implements mo2<nh0<ta0>> {
    private final wo2<y11> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f8062b;

    public p11(wo2<y11> wo2Var, wo2<Executor> wo2Var2) {
        this.a = wo2Var;
        this.f8062b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        y11 y11VarZzb = this.a.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new nh0(y11VarZzb, h52Var);
    }
}