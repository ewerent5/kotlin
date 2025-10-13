package com.google.android.gms.internal.ads;

import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.SecretKey;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class rg2 implements w92 {
    private final SecretKey a;

    /* renamed from: b, reason: collision with root package name */
    private final byte[] f8649b;

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f8650c;

    public rg2(byte[] bArr) throws InvalidKeyException, InvalidAlgorithmParameterException {
        zg2.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.a = secretKeySpec;
        Cipher cipherB = b();
        cipherB.init(1, secretKeySpec);
        byte[] bArrA = qf2.a(cipherB.doFinal(new byte[16]));
        this.f8649b = bArrA;
        this.f8650c = qf2.a(bArrA);
    }

    private static Cipher b() {
        return fg2.f5863c.a("AES/ECB/NoPadding");
    }

    @Override // com.google.android.gms.internal.ads.w92
    public final byte[] a(byte[] bArr, int i2) throws BadPaddingException, IllegalBlockSizeException, InvalidKeyException, InvalidAlgorithmParameterException {
        if (i2 > 16) {
            throw new InvalidAlgorithmParameterException("outputLength too large, max is 16 bytes");
        }
        Cipher cipherB = b();
        cipherB.init(1, this.a);
        int length = bArr.length;
        int iMax = Math.max(1, (int) Math.ceil(length / 16.0d));
        byte[] bArrB = iMax * 16 == length ? rf2.b(bArr, (iMax - 1) * 16, this.f8649b, 0, 16) : rf2.d(qf2.b(Arrays.copyOfRange(bArr, (iMax - 1) * 16, length)), this.f8650c);
        byte[] bArrDoFinal = new byte[16];
        for (int i3 = 0; i3 < iMax - 1; i3++) {
            bArrDoFinal = cipherB.doFinal(rf2.b(bArrDoFinal, 0, bArr, i3 * 16, 16));
        }
        return Arrays.copyOf(cipherB.doFinal(rf2.d(bArrB, bArrDoFinal)), i2);
    }
}