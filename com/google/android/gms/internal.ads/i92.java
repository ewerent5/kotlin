package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class i92 {
    public static void a(oc2 oc2Var) throws GeneralSecurityException {
        dg2.d(c(oc2Var.D().D()));
        b(oc2Var.D().E());
        if (oc2Var.F() == fc2.UNKNOWN_FORMAT) {
            throw new GeneralSecurityException("unknown EC point format");
        }
        f72.g(oc2Var.E().D());
    }

    public static String b(cd2 cd2Var) throws NoSuchAlgorithmException {
        fc2 fc2Var = fc2.UNKNOWN_FORMAT;
        ad2 ad2Var = ad2.UNKNOWN_CURVE;
        cd2 cd2Var2 = cd2.UNKNOWN_HASH;
        int iOrdinal = cd2Var.ordinal();
        if (iOrdinal == 1) {
            return "HmacSha1";
        }
        if (iOrdinal == 3) {
            return "HmacSha256";
        }
        if (iOrdinal == 4) {
            return "HmacSha512";
        }
        String strValueOf = String.valueOf(cd2Var);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 27);
        sb.append("hash unsupported for HMAC: ");
        sb.append(strValueOf);
        throw new NoSuchAlgorithmException(sb.toString());
    }

    public static int c(ad2 ad2Var) throws GeneralSecurityException {
        fc2 fc2Var = fc2.UNKNOWN_FORMAT;
        ad2 ad2Var2 = ad2.UNKNOWN_CURVE;
        cd2 cd2Var = cd2.UNKNOWN_HASH;
        int iOrdinal = ad2Var.ordinal();
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                String strValueOf = String.valueOf(ad2Var);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 20);
                sb.append("unknown curve type: ");
                sb.append(strValueOf);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return i2;
    }

    public static int d(fc2 fc2Var) throws GeneralSecurityException {
        fc2 fc2Var2 = fc2.UNKNOWN_FORMAT;
        ad2 ad2Var = ad2.UNKNOWN_CURVE;
        cd2 cd2Var = cd2.UNKNOWN_HASH;
        int iOrdinal = fc2Var.ordinal();
        int i2 = 1;
        if (iOrdinal != 1) {
            i2 = 2;
            if (iOrdinal != 2) {
                if (iOrdinal == 3) {
                    return 3;
                }
                String strValueOf = String.valueOf(fc2Var);
                StringBuilder sb = new StringBuilder(strValueOf.length() + 22);
                sb.append("unknown point format: ");
                sb.append(strValueOf);
                throw new GeneralSecurityException(sb.toString());
            }
        }
        return i2;
    }
}