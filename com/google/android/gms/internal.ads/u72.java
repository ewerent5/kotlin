package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class u72 extends n62<ya2> {
    u72() {
        super(ya2.class, new s72(b62.class));
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.AesEaxKey";
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final pd2 c() {
        return pd2.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ lk2 d(ci2 ci2Var) {
        return ya2.G(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ void e(lk2 lk2Var) throws GeneralSecurityException {
        ya2 ya2Var = (ya2) lk2Var;
        zg2.b(ya2Var.D(), 0);
        zg2.a(ya2Var.F().l());
        if (ya2Var.E().D() != 12 && ya2Var.E().D() != 16) {
            throw new GeneralSecurityException("invalid IV size; acceptable values have 12 or 16 bytes");
        }
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final k62<bb2, ya2> i() {
        return new t72(this, bb2.class);
    }
}