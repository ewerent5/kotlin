package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zc0 implements mo2<yc0> {
    private final wo2<Set<nh0<ad0>>> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<xo1> f10578b;

    public zc0(wo2<Set<nh0<ad0>>> wo2Var, wo2<xo1> wo2Var2) {
        this.a = wo2Var;
        this.f10578b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new yc0(((uo2) this.a).zzb(), ((j70) this.f10578b).a());
    }
}