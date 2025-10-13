package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class p92 extends m62<r62, fd2> {
    p92(Class cls) {
        super(cls);
    }

    @Override // com.google.android.gms.internal.ads.m62
    public final /* bridge */ /* synthetic */ r62 b(fd2 fd2Var) throws GeneralSecurityException {
        fd2 fd2Var2 = fd2Var;
        cd2 cd2VarD = fd2Var2.E().D();
        SecretKeySpec secretKeySpec = new SecretKeySpec(fd2Var2.F().O(), "HMAC");
        int iE = fd2Var2.E().E();
        cd2 cd2Var = cd2.UNKNOWN_HASH;
        int iOrdinal = cd2VarD.ordinal();
        if (iOrdinal == 1) {
            return new ug2(new tg2("HMACSHA1", secretKeySpec), iE);
        }
        if (iOrdinal == 3) {
            return new ug2(new tg2("HMACSHA256", secretKeySpec), iE);
        }
        if (iOrdinal == 4) {
            return new ug2(new tg2("HMACSHA512", secretKeySpec), iE);
        }
        throw new GeneralSecurityException("unknown hash");
    }
}