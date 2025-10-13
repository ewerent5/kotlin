package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class np0 implements mo2<lp0> {
    private final wo2<qp1> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f7766b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<vr0> f7767c;

    public np0(wo2<qp1> wo2Var, wo2<Executor> wo2Var2, wo2<vr0> wo2Var3) {
        this.a = wo2Var;
        this.f7766b = wo2Var2;
        this.f7767c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new lp0(((ga0) this.a).a(), this.f7766b.zzb(), this.f7767c.zzb());
    }
}