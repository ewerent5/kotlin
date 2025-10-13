package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class s80 implements mo2<nh0<c93>> {
    private final wo2<re0> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f8832b;

    public s80(wo2<re0> wo2Var, wo2<Executor> wo2Var2) {
        this.a = wo2Var;
        this.f8832b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new nh0(this.a.zzb(), this.f8832b.zzb());
    }
}