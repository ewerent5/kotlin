package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class la3 extends sa3<w> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f7223b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r93 f7224c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f7225d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ tf f7226e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ra3 f7227f;

    la3(ra3 ra3Var, Context context, r93 r93Var, String str, tf tfVar) {
        this.f7227f = ra3Var;
        this.f7223b = context;
        this.f7224c = r93Var;
        this.f7225d = str;
        this.f7226e = tfVar;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ w a() {
        ra3.l(this.f7223b, "interstitial");
        return new o2();
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ w b() {
        return this.f7227f.a.c(this.f7223b, this.f7224c, this.f7225d, this.f7226e, 2);
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ w c(h0 h0Var) {
        return h0Var.zzc(e.c.b.b.b.d.m4(this.f7223b), this.f7224c, this.f7225d, this.f7226e, 210890000);
    }
}