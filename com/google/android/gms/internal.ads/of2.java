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
public final class of2 implements b62 {
    private static final ThreadLocal<Cipher> a = new nf2();

    /* renamed from: b, reason: collision with root package name */
    private final SecretKey f7942b;

    public of2(byte[] bArr) throws InvalidAlgorithmParameterException {
        zg2.a(bArr.length);
        this.f7942b = new SecretKeySpec(bArr, "AES");
    }

    @Override // com.google.android.gms.internal.ads.b62
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > 2147483619) {
            throw new GeneralSecurityException("plaintext too long");
        }
        byte[] bArr3 = new byte[length + 28];
        byte[] bArrA = xg2.a(12);
        System.arraycopy(bArrA, 0, bArr3, 0, 12);
        int length2 = bArrA.length;
        AlgorithmParameterSpec gCMParameterSpec = (!yg2.a() || yg2.b() > 19) ? new GCMParameterSpec(128, bArrA, 0, length2) : new IvParameterSpec(bArrA, 0, length2);
        ThreadLocal<Cipher> threadLocal = a;
        threadLocal.get().init(1, this.f7942b, gCMParameterSpec);
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