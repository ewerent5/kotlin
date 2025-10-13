package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class o72 extends n62<ia2> {
    o72() {
        super(ia2.class, new l72(b62.class));
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey";
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final pd2 c() {
        return pd2.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ lk2 d(ci2 ci2Var) {
        return ia2.G(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ void e(lk2 lk2Var) throws GeneralSecurityException {
        ia2 ia2Var = (ia2) lk2Var;
        zg2.b(ia2Var.D(), 0);
        new r72();
        r72.k(ia2Var.E());
        new r92();
        r92.k(ia2Var.F());
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final k62<la2, ia2> i() {
        return new n72(this, la2.class);
    }
}