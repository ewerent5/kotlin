package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class q72 extends k62<sa2, oa2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r72 f8341b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q72(r72 r72Var, Class cls) {
        super(cls);
        this.f8341b = r72Var;
    }

    public static final oa2 f(sa2 sa2Var) {
        na2 na2VarH = oa2.H();
        na2VarH.r(sa2Var.D());
        na2VarH.s(ci2.H(xg2.a(sa2Var.E())));
        na2VarH.q(0);
        return na2VarH.n();
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ lk2 c(ci2 ci2Var) {
        return sa2.F(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ oa2 d(lk2 lk2Var) {
        return f((sa2) lk2Var);
    }

    @Override // com.google.android.gms.internal.ads.k62
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public final void b(sa2 sa2Var) throws GeneralSecurityException {
        zg2.a(sa2Var.E());
        r72 r72Var = this.f8341b;
        r72.l(sa2Var.D());
    }
}