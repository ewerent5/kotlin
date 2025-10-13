package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class na3 extends sa3<o0> {

    /* renamed from: b */
    final /* synthetic */ Context f7688b;

    /* renamed from: c */
    final /* synthetic */ ra3 f7689c;

    na3(ra3 ra3Var, Context context) {
        this.f7689c = ra3Var;
        this.f7688b = context;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    protected final /* bridge */ /* synthetic */ o0 a() {
        ra3.l(this.f7688b, "mobile_ads_settings");
        return new q2();
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ o0 b() {
        return this.f7689c.f8625c.c(this.f7688b);
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ o0 c(h0 h0Var) {
        return h0Var.zzh(e.c.b.b.b.d.m4(this.f7688b), 210890000);
    }
}