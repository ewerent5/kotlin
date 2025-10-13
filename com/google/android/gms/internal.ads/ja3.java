package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class ja3 extends sa3<w> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f6717b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ r93 f6718c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ String f6719d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ tf f6720e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ ra3 f6721f;

    ja3(ra3 ra3Var, Context context, r93 r93Var, String str, tf tfVar) {
        this.f6721f = ra3Var;
        this.f6717b = context;
        this.f6718c = r93Var;
        this.f6719d = str;
        this.f6720e = tfVar;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ w a() {
        ra3.l(this.f6717b, "app_open");
        return new o2();
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ w b() {
        return this.f6721f.a.c(this.f6717b, this.f6718c, this.f6719d, this.f6720e, 4);
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ w c(h0 h0Var) {
        return h0Var.zzl(e.c.b.b.b.d.m4(this.f6717b), this.f6718c, this.f6719d, this.f6720e, 210890000);
    }
}