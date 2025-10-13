package com.google.android.gms.internal.ads;

import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class o11 implements mo2<n11> {
    private final wo2<Set<m11>> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<bu1> f7871b;

    public o11(wo2<Set<m11>> wo2Var, wo2<bu1> wo2Var2) {
        this.a = wo2Var;
        this.f7871b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new n11(((uo2) this.a).zzb(), this.f7871b.zzb());
    }
}