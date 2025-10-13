package com.google.android.gms.internal.ads;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class wz implements jl1 {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final r93 f10081b;

    /* renamed from: c, reason: collision with root package name */
    private final String f10082c;

    /* renamed from: d, reason: collision with root package name */
    private final wo2<Context> f10083d;

    /* renamed from: e, reason: collision with root package name */
    private final wo2<r93> f10084e;

    /* renamed from: f, reason: collision with root package name */
    private final wo2<wa1> f10085f;

    /* renamed from: g, reason: collision with root package name */
    private final wo2<ab1> f10086g;

    /* renamed from: h, reason: collision with root package name */
    private final wo2<gl1> f10087h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ p00 f10088i;

    /* synthetic */ wz(p00 p00Var, Context context, String str, r93 r93Var, dz dzVar) {
        this.f10088i = p00Var;
        this.a = context;
        this.f10081b = r93Var;
        this.f10082c = str;
        mo2 mo2VarA = no2.a(context);
        this.f10083d = mo2VarA;
        mo2 mo2VarA2 = no2.a(r93Var);
        this.f10084e = mo2VarA2;
        wo2<wa1> wo2VarA = lo2.a(new xa1(p00Var.n));
        this.f10085f = wo2VarA;
        wo2<ab1> wo2VarA2 = lo2.a(cb1.a());
        this.f10086g = wo2VarA2;
        this.f10087h = lo2.a(new hl1(mo2VarA, p00Var.o, mo2VarA2, p00Var.M, wo2VarA, wo2VarA2, sp1.a()));
    }

    @Override // com.google.android.gms.internal.ads.jl1
    public final da1 zza() {
        return new da1(this.a, this.f10081b, this.f10082c, this.f10087h.zzb(), this.f10085f.zzb());
    }
}