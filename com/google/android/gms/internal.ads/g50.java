package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class g50 implements mo2<Set<nh0<dc0>>> {
    private final y40 a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<k60> f6043b;

    public g50(y40 y40Var, wo2<k60> wo2Var) {
        this.a = y40Var;
        this.f6043b = wo2Var;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        Set<nh0<dc0>> setG = y40.g(this.f6043b.zzb());
        ro2.b(setG);
        return setG;
    }
}