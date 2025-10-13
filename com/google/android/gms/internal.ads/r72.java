package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class r72 extends n62<oa2> {
    r72() {
        super(oa2.class, new p72(pg2.class));
    }

    public static final void k(oa2 oa2Var) throws GeneralSecurityException {
        zg2.b(oa2Var.D(), 0);
        zg2.a(oa2Var.F().l());
        l(oa2Var.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void l(va2 va2Var) throws GeneralSecurityException {
        if (va2Var.D() < 12 || va2Var.D() > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesCtrKey";
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final pd2 c() {
        return pd2.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ lk2 d(ci2 ci2Var) {
        return oa2.G(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ void e(lk2 lk2Var) throws GeneralSecurityException {
        k((oa2) lk2Var);
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final k62<sa2, oa2> i() {
        return new q72(this, sa2.class);
    }
}