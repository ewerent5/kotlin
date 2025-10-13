package com.google.android.gms.internal.ads;

import android.app.Activity;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class ba3 extends sa3<xj> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Activity f5098b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ ra3 f5099c;

    ba3(ra3 ra3Var, Activity activity) {
        this.f5099c = ra3Var;
        this.f5098b = activity;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    protected final /* bridge */ /* synthetic */ xj a() {
        ra3.l(this.f5098b, "ad_overlay");
        return null;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ xj b() {
        return this.f5099c.f8628f.c(this.f5098b);
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ xj c(h0 h0Var) {
        return h0Var.zzg(e.c.b.b.b.d.m4(this.f5098b));
    }
}