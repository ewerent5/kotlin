package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class j50 implements mo2<Set<nh0<v13>>> {
    private final y40 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<k60> f6689b;

    public j50(y40 y40Var, wo2<k60> wo2Var) {
        this.a = y40Var;
        this.f6689b = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set setSingleton = Collections.singleton(new nh0(this.f6689b.zzb(), qr.f8451f));
        ro2.b(setSingleton);
        return setSingleton;
    }
}