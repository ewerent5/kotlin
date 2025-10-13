package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class q92 extends k62<id2, fd2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ r92 f8352b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    q92(r92 r92Var, Class cls) {
        super(cls);
        this.f8352b = r92Var;
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ void b(lk2 lk2Var) throws GeneralSecurityException {
        id2 id2Var = (id2) lk2Var;
        if (id2Var.E() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        r92.l(id2Var.D());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ lk2 c(ci2 ci2Var) {
        return id2.F(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ fd2 d(lk2 lk2Var) {
        id2 id2Var = (id2) lk2Var;
        ed2 ed2VarH = fd2.H();
        ed2VarH.q(0);
        ed2VarH.r(id2Var.D());
        ed2VarH.s(ci2.H(xg2.a(id2Var.E())));
        return ed2VarH.n();
    }
}