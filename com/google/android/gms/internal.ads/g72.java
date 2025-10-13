package com.google.android.gms.internal.ads;

import java.nio.charset.Charset;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class g72 {
    public static final Charset a = Charset.forName("UTF-8");

    public static je2 a(ee2 ee2Var) {
        ge2 ge2VarD = je2.D();
        ge2VarD.q(ee2Var.D());
        for (de2 de2Var : ee2Var.E()) {
            he2 he2VarD = ie2.D();
            he2VarD.q(de2Var.E().D());
            he2VarD.r(de2Var.F());
            he2VarD.t(de2Var.H());
            he2VarD.s(de2Var.G());
            ge2VarD.r(he2VarD.n());
        }
        return ge2VarD.n();
    }

    public static void b(ee2 ee2Var) throws GeneralSecurityException {
        int iD = ee2Var.D();
        int i2 = 0;
        boolean z = false;
        boolean z2 = true;
        for (de2 de2Var : ee2Var.E()) {
            if (de2Var.F() == td2.ENABLED) {
                if (!de2Var.D()) {
                    throw new GeneralSecurityException(String.format("key %d has no key data", Integer.valueOf(de2Var.G())));
                }
                if (de2Var.H() == ye2.UNKNOWN_PREFIX) {
                    throw new GeneralSecurityException(String.format("key %d has unknown prefix", Integer.valueOf(de2Var.G())));
                }
                if (de2Var.F() == td2.UNKNOWN_STATUS) {
                    throw new GeneralSecurityException(String.format("key %d has unknown status", Integer.valueOf(de2Var.G())));
                }
                if (de2Var.G() == iD) {
                    if (z) {
                        throw new GeneralSecurityException("keyset contains multiple primary keys");
                    }
                    z = true;
                }
                z2 &= de2Var.E().F() == pd2.ASYMMETRIC_PUBLIC;
                i2++;
            }
        }
        if (i2 == 0) {
            throw new GeneralSecurityException("keyset must contain at least one ENABLED key");
        }
        if (!z && !z2) {
            throw new GeneralSecurityException("keyset doesn't contain a valid primary key");
        }
    }
}