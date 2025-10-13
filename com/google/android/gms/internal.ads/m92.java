package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class m92 extends k62<ca2, z92> {
    m92(n92 n92Var, Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ void b(lk2 lk2Var) throws GeneralSecurityException {
        ca2 ca2Var = (ca2) lk2Var;
        n92.l(ca2Var.E());
        n92.m(ca2Var.D());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ lk2 c(ci2 ci2Var) {
        return ca2.F(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ z92 d(lk2 lk2Var) {
        ca2 ca2Var = (ca2) lk2Var;
        y92 y92VarH = z92.H();
        y92VarH.q(0);
        y92VarH.r(ci2.H(xg2.a(ca2Var.D())));
        y92VarH.s(ca2Var.E());
        return y92VarH.n();
    }
}