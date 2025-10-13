package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.KeyPair;
import java.security.interfaces.ECPrivateKey;
import java.security.interfaces.ECPublicKey;
import java.security.spec.ECPoint;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class y82 extends k62<lc2, sc2> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ z82 f10393b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    y82(z82 z82Var, Class cls) {
        super(cls);
        this.f10393b = z82Var;
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ void b(lk2 lk2Var) throws GeneralSecurityException {
        i92.a(((lc2) lk2Var).D());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ lk2 c(ci2 ci2Var) {
        return lc2.E(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.k62
    public final /* bridge */ /* synthetic */ sc2 d(lk2 lk2Var) throws InvalidAlgorithmParameterException {
        lc2 lc2Var = (lc2) lk2Var;
        KeyPair keyPairC = dg2.c(dg2.d(i92.c(lc2Var.D().D().D())));
        ECPublicKey eCPublicKey = (ECPublicKey) keyPairC.getPublic();
        ECPrivateKey eCPrivateKey = (ECPrivateKey) keyPairC.getPrivate();
        ECPoint w = eCPublicKey.getW();
        uc2 uc2VarI = vc2.I();
        uc2VarI.q(0);
        uc2VarI.r(lc2Var.D());
        uc2VarI.s(ci2.H(w.getAffineX().toByteArray()));
        uc2VarI.t(ci2.H(w.getAffineY().toByteArray()));
        vc2 vc2VarN = uc2VarI.n();
        qc2 qc2VarH = sc2.H();
        qc2VarH.q(0);
        qc2VarH.r(vc2VarN);
        qc2VarH.s(ci2.H(eCPrivateKey.getS().toByteArray()));
        return qc2VarH.n();
    }
}