package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class w80 implements mo2<nh0<ib0>> {
    private final wo2<re0> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Executor> f9921b;

    public w80(wo2<re0> wo2Var, wo2<Executor> wo2Var2) {
        this.a = wo2Var;
        this.f9921b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new nh0(this.a.zzb(), this.f9921b.zzb());
    }
}