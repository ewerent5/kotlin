package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class qa3 extends sa3<an> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Context f8354b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ String f8355c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ tf f8356d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ ra3 f8357e;

    qa3(ra3 ra3Var, Context context, String str, tf tfVar) {
        this.f8357e = ra3Var;
        this.f8354b = context;
        this.f8355c = str;
        this.f8356d = tfVar;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    protected final /* bridge */ /* synthetic */ an a() {
        ra3.l(this.f8354b, "rewarded");
        return new u2();
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ an b() {
        return mn.a(this.f8354b, this.f8355c, this.f8356d);
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ an c(h0 h0Var) {
        return h0Var.zzk(e.c.b.b.b.d.m4(this.f8354b), this.f8355c, this.f8356d, 210890000);
    }
}