package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class r92 extends n62<fd2> {
    public r92() {
        super(fd2.class, new p92(r62.class));
    }

    public static final void k(fd2 fd2Var) throws GeneralSecurityException {
        zg2.b(fd2Var.D(), 0);
        if (fd2Var.F().l() < 16) {
            throw new GeneralSecurityException("key too short");
        }
        l(fd2Var.E());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void l(ld2 ld2Var) throws GeneralSecurityException {
        if (ld2Var.E() < 10) {
            throw new GeneralSecurityException("tag size too small");
        }
        cd2 cd2Var = cd2.UNKNOWN_HASH;
        int iOrdinal = ld2Var.D().ordinal();
        if (iOrdinal == 1) {
            if (ld2Var.E() > 20) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else if (iOrdinal == 3) {
            if (ld2Var.E() > 32) {
                throw new GeneralSecurityException("tag size too big");
            }
        } else {
            if (iOrdinal != 4) {
                throw new GeneralSecurityException("unknown hash type");
            }
            if (ld2Var.E() > 64) {
                throw new GeneralSecurityException("tag size too big");
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final String b() {
        return "type.googleapis.com/google.crypto.tink.HmacKey";
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final pd2 c() {
        return pd2.SYMMETRIC;
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ lk2 d(ci2 ci2Var) {
        return fd2.G(ci2Var, qi2.a());
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final /* bridge */ /* synthetic */ void e(lk2 lk2Var) throws GeneralSecurityException {
        k((fd2) lk2Var);
    }

    @Override // com.google.android.gms.internal.ads.n62
    public final k62<id2, fd2> i() {
        return new q92(this, id2.class);
    }
}