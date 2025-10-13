package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class p30 implements mo2<Set<nh0<dc0>>> {
    private final n30 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<k60> f8077b;

    public p30(n30 n30Var, wo2<k60> wo2Var) {
        this.a = n30Var;
        this.f8077b = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new nh0(this.f8077b.zzb(), qr.f8451f));
        ro2.b(setSingleton);
        return setSingleton;
    }
}