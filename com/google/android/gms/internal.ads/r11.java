package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class r11 implements mo2<nh0<tt1>> {
    private final wo2<d21> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f8557b;

    public r11(wo2<d21> wo2Var, wo2<Executor> wo2Var2) {
        this.a = wo2Var;
        this.f8557b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        d21 d21VarZzb = ((e21) this.a).zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new nh0(d21VarZzb, h52Var);
    }
}