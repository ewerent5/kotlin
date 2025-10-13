package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class t72 extends k62<bb2, ya2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ u72 f9087b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    t72(u72 u72Var, Class cls) {
        super(cls);
        this.f9087b = u72Var;
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ void b(lk2 lk2Var) throws GeneralSecurityException {
        bb2 bb2Var = (bb2) lk2Var;
        zg2.a(bb2Var.E());
        if (bb2Var.D().D() != 12 && bb2Var.D().D() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ lk2 c(ci2 ci2Var) {
        return bb2.F(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ ya2 d(lk2 lk2Var) {
        bb2 bb2Var = (bb2) lk2Var;
        xa2 xa2VarH = ya2.H();
        xa2VarH.s(ci2.H(xg2.a(bb2Var.E())));
        xa2VarH.r(bb2Var.D());
        xa2VarH.q(0);
        return xa2VarH.n();
    }
}