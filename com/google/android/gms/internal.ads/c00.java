package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class c00 implements wv0 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final xa f5231b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<wv0> f5232c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<xa> f5233d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<rv0> f5234e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<tv0> f5235f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ p00 f5236g;

    /* synthetic */ c00(p00 p00Var, Context context, xa xaVar, dz dzVar) {
        this.f5236g = p00Var;
        this.a = context;
        this.f5231b = xaVar;
        mo2 mo2VarA = no2.a(this);
        this.f5232c = mo2VarA;
        mo2 mo2VarA2 = no2.a(xaVar);
        this.f5233d = mo2VarA2;
        sv0 sv0Var = new sv0(mo2VarA2);
        this.f5234e = sv0Var;
        this.f5235f = lo2.a(new uv0(mo2VarA, sv0Var));
    }

    @Override // com.google.android.gms.internal.ads.wv0
    public final tv0 zza() {
        return this.f5235f.zzb();
    }

    @Override // com.google.android.gms.internal.ads.wv0
    public final nv0 zzb() {
        return new zz(this, null);
    }
}