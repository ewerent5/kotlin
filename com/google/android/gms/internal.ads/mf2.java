package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import javax.crypto.BadPaddingException;
import javax.crypto.Cipher;
import javax.crypto.IllegalBlockSizeException;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mf2 implements b62 {
    private static final ThreadLocal<Cipher> a = new kf2();

    /* renamed from: b, reason: collision with root package name */
    private static final ThreadLocal<Cipher> f7479b = new lf2();

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f7480c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f7481d;

    /* renamed from: e, reason: collision with root package name */
    private final SecretKeySpec f7482e;

    /* renamed from: f, reason: collision with root package name */
    private final int f7483f;

    public mf2(byte[] bArr, int i2) throws InvalidKeyException, InvalidAlgorithmParameterException {
        if (i2 != 12 && i2 != 16) {
            throw new IllegalArgumentException("IV size should be either 12 or 16 bytes");
        }
        this.f7483f = i2;
        zg2.a(bArr.length);
        SecretKeySpec secretKeySpec = new SecretKeySpec(bArr, "AES");
        this.f7482e = secretKeySpec;
        Cipher cipher = a.get();
        cipher.init(1, secretKeySpec);
        byte[] bArrC = c(cipher.doFinal(new byte[16]));
        this.f7480c = bArrC;
        this.f7481d = c(bArrC);
    }

    private static byte[] b(byte[] bArr, byte[] bArr2) {
        int length = bArr.length;
        byte[] bArr3 = new byte[length];
        for (int i2 = 0; i2 < length; i2++) {
            bArr3[i2] = (byte) (bArr[i2] ^ bArr2[i2]);
        }
        return bArr3;
    }

    private static byte[] c(byte[] bArr) {
        byte[] bArr2 = new byte[16];
        int i2 = 0;
        while (i2 < 15) {
            byte b2 = bArr[i2];
            int i3 = i2 + 1;
            bArr2[i2] = (byte) (((b2 + b2) ^ ((bArr[i3] & 255) >>> 7)) & 255);
            i2 = i3;
        }
        byte b3 = bArr[15];
        bArr2[15] = (byte) ((b3 + b3) ^ ((bArr[0] & 128) != 0 ? 135 : 0));
        return bArr2;
    }

    private final byte[] d(Cipher cipher, int i2, byte[] bArr, int i3, int i4) throws BadPaddingException, IllegalBlockSizeException {
        int length;
        byte[] bArrB;
        byte[] bArr2 = new byte[16];
        bArr2[15] = (byte) i2;
        if (i4 == 0) {
            return cipher.doFinal(b(bArr2, this.f7480c));
        }
        byte[] bArrDoFinal = cipher.doFinal(bArr2);
        int i5 = 0;
        int i6 = 0;
        while (i4 - i6 > 16) {
            for (int i7 = 0; i7 < 16; i7++) {
                bArrDoFinal[i7] = (byte) (bArrDoFinal[i7] ^ bArr[(i3 + i6) + i7]);
            }
            bArrDoFinal = cipher.doFinal(bArrDoFinal);
            i6 += 16;
        }
        byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, i6 + i3, i3 + i4);
        if (bArrCopyOfRange.length == 16) {
            bArrB = b(bArrCopyOfRange, this.f7480c);
        } else {
            byte[] bArrCopyOf = Arrays.copyOf(this.f7481d, 16);
            while (true) {
                length = bArrCopyOfRange.length;
                if (i5 >= length) {
                    break;
                }
                bArrCopyOf[i5] = (byte) (bArrCopyOf[i5] ^ bArrCopyOfRange[i5]);
                i5++;
            }
            bArrCopyOf[length] = (byte) (bArrCopyOf[length] ^ 128);
            bArrB = bArrCopyOf;
        }
        return cipher.doFinal(b(bArrDoFinal, bArrB));
    }

    @Override // com.google.android.gms.internal.ads.b62
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.f7483f;
        if (length > (Integer.MAX_VALUE - i2) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[i2 + length + 16];
        byte[] bArrA = xg2.a(i2);
        System.arraycopy(bArrA, 0, bArr3, 0, this.f7483f);
        Cipher cipher = a.get();
        cipher.init(1, this.f7482e);
        byte[] bArrD = d(cipher, 0, bArrA, 0, bArrA.length);
        byte[] bArrD2 = d(cipher, 1, bArr2, 0, bArr2.length);
        Cipher cipher2 = f7479b.get();
        cipher2.init(1, this.f7482e, new IvParameterSpec(bArrD));
        cipher2.doFinal(bArr, 0, length, bArr3, this.f7483f);
        byte[] bArrD3 = d(cipher, 2, bArr3, this.f7483f, length);
        int i3 = length + this.f7483f;
        for (int i4 = 0; i4 < 16; i4++) {
            bArr3[i3 + i4] = (byte) ((bArrD2[i4] ^ bArrD[i4]) ^ bArrD3[i4]);
        }
        return bArr3;
    }
}