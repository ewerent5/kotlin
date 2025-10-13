package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@Deprecated
/* loaded from: classes.dex */
public final class s62 {
    @Deprecated
    public static final o62 a(byte[] bArr) throws GeneralSecurityException {
        try {
            ee2 ee2VarG = ee2.G(bArr, qi2.a());
            for (de2 de2Var : ee2VarG.E()) {
                if (de2Var.E().F() == pd2.UNKNOWN_KEYMATERIAL || de2Var.E().F() == pd2.SYMMETRIC || de2Var.E().F() == pd2.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            return o62.a(ee2VarG);
        } catch (qj2 unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}