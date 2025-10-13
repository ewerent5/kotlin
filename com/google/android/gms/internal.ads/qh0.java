package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qh0 implements mo2<ph0> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Set<nh0<v13>>> f8378b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<xo1> f8379c;

    public qh0(wo2<Context> wo2Var, wo2<Set<nh0<v13>>> wo2Var2, wo2<xo1> wo2Var3) {
        this.a = wo2Var;
        this.f8378b = wo2Var2;
        this.f8379c = wo2Var3;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ph0(this.a.zzb(), ((uo2) this.f8378b).zzb(), ((j70) this.f8379c).a());
    }
}