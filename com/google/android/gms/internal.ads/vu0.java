package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vu0 implements mo2<su0> {
    private final wo2<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<jr> f9780b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<ku1> f9781c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<mu1> f9782d;

    public vu0(wo2<Executor> wo2Var, wo2<jr> wo2Var2, wo2<ku1> wo2Var3, wo2<mu1> wo2Var4) {
        this.a = wo2Var;
        this.f9780b = wo2Var2;
        this.f9781c = wo2Var3;
        this.f9782d = wo2Var4;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new su0(h52Var, this.f9780b.zzb(), ((lu1) this.f9781c).zzb(), new mu1());
    }
}