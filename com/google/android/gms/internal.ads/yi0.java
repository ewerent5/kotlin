package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yi0 implements mo2<Set<nh0<qa0>>> {
    private final pi0 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<p90> f10427b;

    public yi0(pi0 pi0Var, wo2<p90> wo2Var) {
        this.a = pi0Var;
        this.f10427b = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set<nh0<qa0>> setE = this.a.e(this.f10427b.zzb());
        ro2.b(setE);
        return setE;
    }
}