package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;
import java.util.Arrays;
import java.util.Collection;
import javax.crypto.Cipher;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.SecretKeySpec;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class pf2 implements e62 {
    private static final Collection<Integer> a = Arrays.asList(64);

    /* renamed from: b, reason: collision with root package name */
    private static final byte[] f8150b = new byte[16];

    /* renamed from: c, reason: collision with root package name */
    private final rg2 f8151c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f8152d;

    public pf2(byte[] bArr) throws InvalidKeyException {
        Collection<Integer> collection = a;
        int length = bArr.length;
        if (collection.contains(Integer.valueOf(length))) {
            int i2 = length >> 1;
            byte[] bArrCopyOfRange = Arrays.copyOfRange(bArr, 0, i2);
            this.f8152d = Arrays.copyOfRange(bArr, i2, length);
            this.f8151c = new rg2(bArrCopyOfRange);
            return;
        }
        StringBuilder sb = new StringBuilder(59);
        sb.append("invalid key size: ");
        sb.append(length);
        sb.append(" bytes; key must have 64 bytes");
        throw new InvalidKeyException(sb.toString());
    }

    @Override // com.google.android.gms.internal.ads.e62
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        byte[] bArrD;
        if (bArr.length > 2147483631) {
            throw new GeneralSecurityException("plaintext too long");
        }
        Cipher cipherA = fg2.f5863c.a("AES/CTR/NoPadding");
        byte[][] bArr3 = {bArr2, bArr};
        byte[] bArrA = this.f8151c.a(f8150b, 16);
        for (char c2 = 0; c2 <= 0; c2 = 1) {
            byte[] bArr4 = bArr3[0];
            if (bArr4 == null) {
                bArr4 = new byte[0];
            }
            bArrA = rf2.d(qf2.a(bArrA), this.f8151c.a(bArr4, 16));
        }
        byte[] bArr5 = bArr3[1];
        int length = bArr5.length;
        if (length >= 16) {
            int length2 = bArrA.length;
            if (length < length2) {
                throw new IllegalArgumentException("xorEnd requires a.length >= b.length");
            }
            int i2 = length - length2;
            bArrD = Arrays.copyOf(bArr5, length);
            for (int i3 = 0; i3 < bArrA.length; i3++) {
                int i4 = i2 + i3;
                bArrD[i4] = (byte) (bArrD[i4] ^ bArrA[i3]);
            }
        } else {
            bArrD = rf2.d(qf2.b(bArr5), qf2.a(bArrA));
        }
        byte[] bArrA2 = this.f8151c.a(bArrD, 16);
        byte[] bArr6 = (byte[]) bArrA2.clone();
        bArr6[8] = (byte) (bArr6[8] & 127);
        bArr6[12] = (byte) (bArr6[12] & 127);
        cipherA.init(1, new SecretKeySpec(this.f8152d, "AES"), new IvParameterSpec(bArr6));
        return rf2.a(bArrA2, cipherA.doFinal(bArr));
    }
}