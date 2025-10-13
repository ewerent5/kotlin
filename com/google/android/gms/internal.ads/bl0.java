package com.google.android.gms.internal.ads;

import android.content.Context;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class bl0 implements mo2<ph0> {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<xo1> f5135b;

    public bl0(wo2<Context> wo2Var, wo2<xo1> wo2Var2) {
        this.a = wo2Var;
        this.f5135b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        return new ph0(this.a.zzb(), new HashSet(), ((j70) this.f5135b).a());
    }
}