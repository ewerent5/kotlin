package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.security.GeneralSecurityException;
import java.security.InvalidKeyException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class tf2 implements pg2 {
    private static final int[] a = i(new byte[]{101, 120, 112, 97, 110, 100, 32, 51, 50, 45, 98, 121, 116, 101, 32, 107});

    /* renamed from: b, reason: collision with root package name */
    int[] f9127b;

    /* renamed from: c, reason: collision with root package name */
    private final int f9128c;

    tf2(byte[] bArr, int i2) throws InvalidKeyException {
        if (bArr.length != 32) {
            throw new InvalidKeyException("The key length in bytes must be 32.");
        }
        this.f9127b = i(bArr);
        this.f9128c = i2;
    }

    static void f(int[] iArr, int[] iArr2) {
        int[] iArr3 = a;
        System.arraycopy(iArr3, 0, iArr, 0, iArr3.length);
        System.arraycopy(iArr2, 0, iArr, iArr3.length, 8);
    }

    static void g(int[] iArr) {
        for (int i2 = 0; i2 < 10; i2++) {
            h(iArr, 0, 4, 8, 12);
            h(iArr, 1, 5, 9, 13);
            h(iArr, 2, 6, 10, 14);
            h(iArr, 3, 7, 11, 15);
            h(iArr, 0, 5, 10, 15);
            h(iArr, 1, 6, 11, 12);
            h(iArr, 2, 7, 8, 13);
            h(iArr, 3, 4, 9, 14);
        }
    }

    static void h(int[] iArr, int i2, int i3, int i4, int i5) {
        int i6 = iArr[i2] + iArr[i3];
        iArr[i2] = i6;
        int i7 = i6 ^ iArr[i5];
        int i8 = (i7 >>> (-16)) | (i7 << 16);
        iArr[i5] = i8;
        int i9 = iArr[i4] + i8;
        iArr[i4] = i9;
        int i10 = iArr[i3] ^ i9;
        int i11 = (i10 >>> (-12)) | (i10 << 12);
        iArr[i3] = i11;
        int i12 = iArr[i2] + i11;
        iArr[i2] = i12;
        int i13 = iArr[i5] ^ i12;
        int i14 = (i13 >>> (-8)) | (i13 << 8);
        iArr[i5] = i14;
        int i15 = iArr[i4] + i14;
        iArr[i4] = i15;
        int i16 = iArr[i3] ^ i15;
        iArr[i3] = (i16 >>> (-7)) | (i16 << 7);
    }

    static int[] i(byte[] bArr) {
        IntBuffer intBufferAsIntBuffer = ByteBuffer.wrap(bArr).order(ByteOrder.LITTLE_ENDIAN).asIntBuffer();
        int[] iArr = new int[intBufferAsIntBuffer.remaining()];
        intBufferAsIntBuffer.get(iArr);
        return iArr;
    }

    abstract int[] a(int[] iArr, int i2);

    abstract int b();

    @Override // com.google.android.gms.internal.ads.pg2
    public final byte[] c(byte[] bArr) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > Integer.MAX_VALUE - b()) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(b() + length);
        d(byteBufferAllocate, bArr);
        return byteBufferAllocate.array();
    }

    final void d(ByteBuffer byteBuffer, byte[] bArr) {
        if (byteBuffer.remaining() - b() < bArr.length) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        byte[] bArrA = xg2.a(b());
        byteBuffer.put(bArrA);
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(bArr);
        int iRemaining = byteBufferWrap.remaining();
        int i2 = (iRemaining / 64) + 1;
        for (int i3 = 0; i3 < i2; i3++) {
            ByteBuffer byteBufferE = e(bArrA, this.f9128c + i3);
            if (i3 == i2 - 1) {
                rf2.c(byteBuffer, byteBufferWrap, byteBufferE, iRemaining % 64);
            } else {
                rf2.c(byteBuffer, byteBufferWrap, byteBufferE, 64);
            }
        }
    }

    final ByteBuffer e(byte[] bArr, int i2) {
        int[] iArrA = a(i(bArr), i2);
        int[] iArr = (int[]) iArrA.clone();
        g(iArr);
        for (int i3 = 0; i3 < 16; i3++) {
            iArrA[i3] = iArrA[i3] + iArr[i3];
        }
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(64).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.asIntBuffer().put(iArrA, 0, 16);
        return byteBufferOrder;
    }
}