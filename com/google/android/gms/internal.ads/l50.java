package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class l50 implements mo2<nh0<v13>> {
    private final y40 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<o60> f7197b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f7198c;

    public l50(y40 y40Var, wo2<o60> wo2Var, wo2<Executor> wo2Var2) {
        this.a = y40Var;
        this.f7197b = wo2Var;
        this.f7198c = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        o60 o60VarZzb = this.f7197b.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new nh0(o60VarZzb, h52Var);
    }
}