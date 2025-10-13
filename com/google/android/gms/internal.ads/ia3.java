package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
final class ia3 extends sa3<w> {

    /* renamed from: b */
    final /* synthetic */ Context f6510b;

    /* renamed from: c */
    final /* synthetic */ r93 f6511c;

    /* renamed from: d */
    final /* synthetic */ String f6512d;

    /* renamed from: e */
    final /* synthetic */ tf f6513e;

    /* renamed from: f */
    final /* synthetic */ ra3 f6514f;

    ia3(ra3 ra3Var, Context context, r93 r93Var, String str, tf tfVar) {
        this.f6514f = ra3Var;
        this.f6510b = context;
        this.f6511c = r93Var;
        this.f6512d = str;
        this.f6513e = tfVar;
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ w a() {
        ra3.l(this.f6510b, "banner");
        return new o2();
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ w b() {
        return this.f6514f.a.c(this.f6510b, this.f6511c, this.f6512d, this.f6513e, 1);
    }

    @Override // com.google.android.gms.internal.ads.sa3
    public final /* bridge */ /* synthetic */ w c(h0 h0Var) {
        return h0Var.zzb(e.c.b.b.b.d.m4(this.f6510b), this.f6511c, this.f6512d, this.f6513e, 210890000);
    }
}