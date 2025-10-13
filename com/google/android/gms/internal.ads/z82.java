package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class z82 extends z62<sc2, vc2> {
    z82() {
        super(sc2.class, vc2.class, new x82(f62.class));
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.EciesAeadHkdfPrivateKey";
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final pd2 c() {
        return pd2.ASYMMETRIC_PRIVATE;
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ lk2 d(ci2 ci2Var) {
        return sc2.G(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ void e(lk2 lk2Var) throws GeneralSecurityException {
        sc2 sc2Var = (sc2) lk2Var;
        if (sc2Var.F().F()) {
            throw new GeneralSecurityException("invalid ECIES private key");
        }
        zg2.b(sc2Var.D(), 0);
        i92.a(sc2Var.E().E());
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final k62<lc2, sc2> i() {
        return new y82(this, lc2.class);
    }
}