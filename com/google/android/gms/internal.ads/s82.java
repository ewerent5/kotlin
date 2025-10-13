package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class s82 extends k62<xb2, ub2> {

    /* renamed from: b */
    final /* synthetic */ t82 f8842b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    s82(t82 t82Var, Class cls) {
        super(cls);
        this.f8842b = t82Var;
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ void b(lk2 lk2Var) throws InvalidAlgorithmParameterException {
        xb2 xb2Var = (xb2) lk2Var;
        if (xb2Var.D() == 64) {
            return;
        }
        int iD = xb2Var.D();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(iD);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidAlgorithmParameterException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ lk2 c(ci2 ci2Var) {
        return xb2.E(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ ub2 d(lk2 lk2Var) {
        tb2 tb2VarG = ub2.G();
        tb2VarG.r(ci2.H(xg2.a(((xb2) lk2Var).D())));
        tb2VarG.q(0);
        return tb2VarG.n();
    }
}