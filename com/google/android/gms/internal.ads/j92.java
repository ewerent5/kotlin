package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class j92 implements xf2 {
    private final String a;

    /* renamed from: b, reason: collision with root package name */
    private final int f6707b;

    /* renamed from: c, reason: collision with root package name */
    private hb2 f6708c;

    /* renamed from: d, reason: collision with root package name */
    private ia2 f6709d;

    /* renamed from: e, reason: collision with root package name */
    private int f6710e;

    /* renamed from: f, reason: collision with root package name */
    private ub2 f6711f;

    j92(wd2 wd2Var) throws GeneralSecurityException {
        String strD = wd2Var.D();
        this.a = strD;
        if (strD.equals(h72.f6303b)) {
            try {
                kb2 kb2VarE = kb2.E(wd2Var.E(), qi2.a());
                this.f6708c = (hb2) f72.h(wd2Var);
                this.f6707b = kb2VarE.D();
                return;
            } catch (qj2 e2) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesGcmKeyFormat", e2);
            }
        }
        if (strD.equals(h72.a)) {
            try {
                la2 la2VarF = la2.F(wd2Var.E(), qi2.a());
                this.f6709d = (ia2) f72.h(wd2Var);
                this.f6710e = la2VarF.D().E();
                this.f6707b = this.f6710e + la2VarF.E().E();
                return;
            } catch (qj2 e3) {
                throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e3);
            }
        }
        if (!strD.equals(u82.a)) {
            String strValueOf = String.valueOf(strD);
            throw new GeneralSecurityException(strValueOf.length() != 0 ? "unsupported AEAD DEM key type: ".concat(strValueOf) : new String("unsupported AEAD DEM key type: "));
        }
        try {
            xb2 xb2VarE = xb2.E(wd2Var.E(), qi2.a());
            this.f6711f = (ub2) f72.h(wd2Var);
            this.f6707b = xb2VarE.D();
        } catch (qj2 e4) {
            throw new GeneralSecurityException("invalid KeyFormat protobuf, expected AesCtrHmacAeadKeyFormat", e4);
        }
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final k92 a(byte[] bArr) throws GeneralSecurityException {
        if (bArr.length != this.f6707b) {
            throw new GeneralSecurityException("Symmetric key has incorrect length");
        }
        if (this.a.equals(h72.f6303b)) {
            gb2 gb2VarG = hb2.G();
            gb2VarG.o(this.f6708c);
            gb2VarG.r(ci2.G(bArr, 0, this.f6707b));
            return new k92((b62) f72.i(this.a, gb2VarG.n(), b62.class));
        }
        if (!this.a.equals(h72.a)) {
            if (!this.a.equals(u82.a)) {
                throw new GeneralSecurityException("unknown DEM key type");
            }
            tb2 tb2VarG = ub2.G();
            tb2VarG.o(this.f6711f);
            tb2VarG.r(ci2.G(bArr, 0, this.f6707b));
            return new k92((e62) f72.i(this.a, tb2VarG.n(), e62.class));
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, this.f6710e);
        byte[] bArrCopyOfRange2 = Arrays.copyOfRange(bArr, this.f6710e, this.f6707b);
        na2 na2VarH = oa2.H();
        na2VarH.o(this.f6709d.E());
        na2VarH.s(ci2.H(bArrCopyOfRange));
        oa2 oa2VarN = na2VarH.n();
        ed2 ed2VarH = fd2.H();
        ed2VarH.o(this.f6709d.F());
        ed2VarH.s(ci2.H(bArrCopyOfRange2));
        fd2 fd2VarN = ed2VarH.n();
        ha2 ha2VarH = ia2.H();
        ha2VarH.q(this.f6709d.D());
        ha2VarH.r(oa2VarN);
        ha2VarH.s(fd2VarN);
        return new k92((b62) f72.i(this.a, ha2VarH.n(), b62.class));
    }

    @Override // com.google.android.gms.internal.ads.xf2
    public final int zza() {
        return this.f6707b;
    }
}