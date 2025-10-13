package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class x72 extends n62<hb2> {
    x72() {
        super(hb2.class, new v72(b62.class));
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesGcmKey";
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final pd2 c() {
        return pd2.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ lk2 d(ci2 ci2Var) {
        return hb2.F(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ void e(lk2 lk2Var) throws GeneralSecurityException {
        hb2 hb2Var = (hb2) lk2Var;
        zg2.b(hb2Var.D(), 0);
        zg2.a(hb2Var.E().l());
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final k62<kb2, hb2> i() {
        return new w72(this, kb2.class);
    }
}