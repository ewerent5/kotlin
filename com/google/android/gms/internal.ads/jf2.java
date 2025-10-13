package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jf2 implements pg2 {
    private static final ThreadLocal<Cipher> a = new if2();

    /* renamed from: b, reason: collision with root package name */
    private final SecretKeySpec f6746b;

    /* renamed from: c, reason: collision with root package name */
    private final int f6747c;

    /* renamed from: d, reason: collision with root package name */
    private final int f6748d;

    public jf2(byte[] bArr, int i2) throws GeneralSecurityException {
        zg2.a(bArr.length);
        this.f6746b = new SecretKeySpec(bArr, "AES");
        int blockSize = a.get().getBlockSize();
        this.f6748d = blockSize;
        if (i2 < 12 || i2 > blockSize) {
            throw new GeneralSecurityException("invalid IV size");
        }
        this.f6747c = i2;
    }

    @Override // com.google.android.gms.internal.ads.pg2
    public final byte[] c(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        int i2 = this.f6747c;
        int i3 = Integer.MAX_VALUE - i2;
        if (length > i3) {
            StringBuilder sb = new StringBuilder(43);
            sb.append("plaintext length can not exceed ");
            sb.append(i3);
            throw new GeneralSecurityException(sb.toString());
        }
        byte[] bArr2 = new byte[i2 + length];
        byte[] bArrA = xg2.a(i2);
        System.arraycopy(bArrA, 0, bArr2, 0, this.f6747c);
        int i4 = this.f6747c;
        Cipher cipher = a.get();
        byte[] bArr3 = new byte[this.f6748d];
        System.arraycopy(bArrA, 0, bArr3, 0, this.f6747c);
        cipher.init(1, this.f6746b, new IvParameterSpec(bArr3));
        if (cipher.doFinal(bArr, 0, length, bArr2, i4) == length) {
            return bArr2;
        }
        throw new GeneralSecurityException("stored output's length does not match input's length");
    }
}