package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bj0 implements mo2<Set<nh0<vj0>>> {
    private final wo2<vj0> a;

    public bj0(wo2<vj0> wo2Var) {
        this.a = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new nh0(this.a.zzb(), qr.f8451f));
        ro2.b(setSingleton);
        return setSingleton;
    }
}