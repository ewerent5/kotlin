package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class ka3 extends sa3<w> {

    /* renamed from: b */
    final /* synthetic */ Context f6982b;

    /* renamed from: c */
    final /* synthetic */ r93 f6983c;

    /* renamed from: d */
    final /* synthetic */ String f6984d;

    /* renamed from: e */
    final /* synthetic */ ra3 f6985e;

    ka3(ra3 ra3Var, Context context, r93 r93Var, String str) {
        this.f6985e = ra3Var;
        this.f6982b = context;
        this.f6983c = r93Var;
        this.f6984d = str;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ w a() {
        ra3.l(this.f6982b, "search");
        return new o2();
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ w b() {
        return this.f6985e.a.c(this.f6982b, this.f6983c, this.f6984d, null, 3);
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ w c(h0 h0Var) {
        return h0Var.zzi(e.c.b.b.b.d.m4(this.f6982b), this.f6983c, this.f6984d, 210890000);
    }
}