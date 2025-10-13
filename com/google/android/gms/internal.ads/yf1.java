package com.google.android.gms.internal.ads;

import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class yf1 implements mo2<wf1> {
    private final wo2<h52> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<Bundle> f10418b;

    public yf1(wo2<h52> wo2Var, wo2<Bundle> wo2Var2) {
        this.a = wo2Var;
        this.f10418b = wo2Var2;
    }

    @Override // com.google.android.gms.internal.ads.wo2
    public final /* bridge */ /* synthetic */ Object zzb() {
        h52 h52Var = qr.a;
        ro2.b(h52Var);
        return new wf1(h52Var, ((da0) this.f10418b).a());
    }
}