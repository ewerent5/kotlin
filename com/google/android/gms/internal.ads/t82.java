package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class t82 extends n62<ub2> {
    t82() {
        super(ub2.class, new r82(e62.class));
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesSivKey";
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final pd2 c() {
        return pd2.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ lk2 d(ci2 ci2Var) {
        return ub2.F(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ void e(lk2 lk2Var) throws GeneralSecurityException {
        ub2 ub2Var = (ub2) lk2Var;
        zg2.b(ub2Var.D(), 0);
        if (ub2Var.E().l() == 64) {
            return;
        }
        int iL = ub2Var.E().l();
        StringBuilder sb = new StringBuilder(61);
        sb.append("invalid key size: ");
        sb.append(iL);
        sb.append(". Valid keys must have 64 bytes.");
        throw new InvalidKeyException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final k62<xb2, ub2> i() {
        return new s82(this, xb2.class);
    }
}