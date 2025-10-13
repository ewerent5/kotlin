package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ru0 implements mo2<qu0> {
    private final wo2<ju0> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Set<pu0>> f8738b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<com.google.android.gms.common.util.f> f8739c;

    public ru0(wo2<ju0> wo2Var, wo2<Set<pu0>> wo2Var2, wo2<com.google.android.gms.common.util.f> wo2Var3) {
        this.a = wo2Var;
        this.f8738b = wo2Var2;
        this.f8739c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new qu0(this.a.zzb(), ((uo2) this.f8738b).zzb(), this.f8739c.zzb());
    }
}