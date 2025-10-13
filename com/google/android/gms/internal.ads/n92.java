package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class n92 extends n62<z92> {
    n92() {
        super(z92.class, new l92(r62.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(fa2 fa2Var) throws GeneralSecurityException {
        if (fa2Var.D() < 10) {
            throw new GeneralSecurityException("tag size too short");
        }
        if (fa2Var.D() > 16) {
            throw new GeneralSecurityException("tag size too long");
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void m(int i2) throws GeneralSecurityException {
        if (i2 != 32) {
            throw new GeneralSecurityException("AesCmacKey size wrong, must be 32 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCmacKey";
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final pd2 c() {
        return pd2.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ lk2 d(ci2 ci2Var) {
        return z92.G(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ void e(lk2 lk2Var) throws GeneralSecurityException {
        z92 z92Var = (z92) lk2Var;
        zg2.b(z92Var.D(), 0);
        m(z92Var.E().l());
        l(z92Var.F());
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final k62<ca2, z92> i() {
        return new m92(this, ca2.class);
    }
}