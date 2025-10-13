package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.security.spec.AlgorithmParameterSpec;
import javax.crypto.Cipher;
import javax.crypto.SecretKey;
import javax.crypto.spec.GCMParameterSpec;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class q82 implements b62 {
    private static final ThreadLocal<Cipher> a = new p82();

    /* renamed from: b, reason: collision with root package name */
    private final SecretKey f8347b;

    public q82(byte[] bArr) throws InvalidAlgorithmParameterException {
        zg2.a(bArr.length);
        this.f8347b = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.ads.b62
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException, ClassNotFoundException {
        AlgorithmParameterSpec ivParameterSpec;
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        byte[] bArrA = xg2.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        int length2 = bArrA.length;
        try {
            Class.forName("javax.crypto.spec.GCMParameterSpec");
            ivParameterSpec = new GCMParameterSpec(128, bArrA, 0, length2);
        } catch (ClassNotFoundException unused) {
            if (!yg2.a()) {
                throw new GeneralSecurityException("cannot use AES-GCM: javax.crypto.spec.GCMParameterSpec not found");
            }
            ivParameterSpec = new IvParameterSpec(bArrA, 0, length2);
        }
        ThreadLocal<Cipher> threadLocal = a;
        threadLocal.get().init(1, this.f8347b, ivParameterSpec);
        if (bArr2.length != 0) {
            threadLocal.get().updateAAD(bArr2);
        }
        int iDoFinal = threadLocal.get().doFinal(bArr, 0, length, bArr3, 12);
        if (iDoFinal == length + 16) {
            return bArr3;
        }
        throw new GeneralSecurityException(String.format("encryption failed; GCM tag must be %s bytes, but got only %s bytes", 16, Integer.valueOf(iDoFinal - length)));
    }
}