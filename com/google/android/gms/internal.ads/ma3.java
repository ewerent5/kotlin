package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class ma3 extends sa3<s> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f7457b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f7458c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ tf f7459d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ra3 f7460e;

    ma3(ra3 ra3Var, Context context, String str, tf tfVar) {
        this.f7460e = ra3Var;
        this.f7457b = context;
        this.f7458c = str;
        this.f7459d = tfVar;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    protected final /* bridge */ /* synthetic */ s a() {
        ra3.l(this.f7457b, "native_ad");
        return new m2();
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ s b() {
        return this.f7460e.f8624b.c(this.f7457b, this.f7458c, this.f7459d);
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ s c(h0 h0Var) {
        return h0Var.zzd(e.c.b.b.b.d.m4(this.f7457b), this.f7458c, this.f7459d, 210890000);
    }
}