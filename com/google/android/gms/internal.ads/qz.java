package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class qz implements xj1 {
    private final wo2<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final wo2<String> f8536b;

    /* renamed from: c, reason: collision with root package name */
    private final wo2<mm1<t30, z30>> f8537c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<rk1> f8538d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<oj1> f8539e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<uj1> f8540f;

    /* renamed from: g, reason: collision with root package name */
    private final wo2<mm1<f40, k40>> f8541g;

    /* renamed from: h, reason: collision with root package name */
    private final wo2<tk1> f8542h;

    /* renamed from: i, reason: collision with root package name */
    private final wo2<zk1> f8543i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ p00 f8544j;

    /* synthetic */ qz(p00 p00Var, Context context, String str, dz dzVar) {
        this.f8544j = p00Var;
        mo2 mo2VarA = no2.a(context);
        this.a = mo2VarA;
        mo2 mo2VarA2 = no2.a(str);
        this.f8536b = mo2VarA2;
        qm1 qm1Var = new qm1(mo2VarA, p00Var.r0, p00Var.s0);
        this.f8537c = qm1Var;
        wo2<rk1> wo2VarA = lo2.a(new sk1(p00Var.r0));
        this.f8538d = wo2VarA;
        wo2<oj1> wo2VarA2 = lo2.a(new pj1(mo2VarA, p00Var.o, p00Var.M, qm1Var, wo2VarA, sp1.a()));
        this.f8539e = wo2VarA2;
        this.f8540f = lo2.a(new vj1(p00Var.M, mo2VarA, mo2VarA2, wo2VarA2, wo2VarA, p00Var.f8053h));
        pm1 pm1Var = new pm1(mo2VarA, p00Var.r0, p00Var.s0);
        this.f8541g = pm1Var;
        wo2<tk1> wo2VarA3 = lo2.a(new uk1(mo2VarA, p00Var.o, p00Var.M, pm1Var, wo2VarA, sp1.a()));
        this.f8542h = wo2VarA3;
        this.f8543i = lo2.a(new al1(p00Var.M, mo2VarA, mo2VarA2, wo2VarA3, wo2VarA));
    }

    @Override // com.google.android.gms.internal.ads.xj1
    public final uj1 zza() {
        return this.f8540f.zzb();
    }

    @Override // com.google.android.gms.internal.ads.xj1
    public final zk1 zzb() {
        return this.f8543i.zzb();
    }
}