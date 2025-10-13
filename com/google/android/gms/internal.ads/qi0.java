package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qi0 implements mo2<Set<nh0<eb0>>> {
    private final pi0 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<p90> f8390b;

    public qi0(pi0 pi0Var, wo2<p90> wo2Var) {
        this.a = pi0Var;
        this.f8390b = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new nh0(this.f8390b.zzb(), qr.f8451f));
        ro2.b(setSingleton);
        return setSingleton;
    }
}