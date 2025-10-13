package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class aj0 implements mo2<nh0<qa0>> {
    private final pi0 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<xj0> f4919b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<Executor> f4920c;

    public aj0(pi0 pi0Var, wo2<xj0> wo2Var, wo2<Executor> wo2Var2) {
        this.a = pi0Var;
        this.f4919b = wo2Var;
        this.f4920c = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        xj0 xj0VarZzb = this.f4919b.zzb();
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new nh0(xj0VarZzb, h52Var);
    }
}