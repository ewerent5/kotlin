package com.google.android.gms.internal.ads;

import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.interfaces.ECPrivateKey;
import java.security.spec.ECPrivateKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class x82 extends m62<f62, sc2> {
    x82(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.m62
    public final /* bridge */ /* synthetic */ f62 b(sc2 sc2Var) throws GeneralSecurityException {
        sc2 sc2Var2 = sc2Var;
        oc2 oc2VarE = sc2Var2.E().E();
        yc2 yc2VarD = oc2VarE.D();
        int iC = i92.c(yc2VarD.D());
        byte[] bArrO = sc2Var2.F().O();
        return new yf2((ECPrivateKey) fg2.f5869i.a("EC").generatePrivate(new ECPrivateKeySpec(new BigInteger(1, bArrO), dg2.d(iC))), yc2VarD.F().O(), i92.b(yc2VarD.E()), i92.d(oc2VarE.F()), new j92(oc2VarE.E().D()));
    }
}