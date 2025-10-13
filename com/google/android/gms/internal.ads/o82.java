package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class o82 extends n62<ef2> {
    o82() {
        super(ef2.class, new l82(b62.class));
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key";
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final pd2 c() {
        return pd2.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ lk2 d(ci2 ci2Var) {
        return ef2.F(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ void e(lk2 lk2Var) throws GeneralSecurityException {
        ef2 ef2Var = (ef2) lk2Var;
        zg2.b(ef2Var.D(), 0);
        if (ef2Var.E().l() != 32) {
            throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
        }
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final k62<hf2, ef2> i() {
        return new m82(this, hf2.class);
    }
}