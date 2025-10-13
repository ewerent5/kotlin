package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.GeneralSecurityException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class wf2 implements b62 {
    private final tf2 a;

    /* renamed from: b, reason: collision with root package name */
    private final tf2 f9958b;

    public wf2(byte[] bArr) {
        this.a = b(bArr, 1);
        this.f9958b = b(bArr, 0);
    }

    @Override // com.google.android.gms.internal.ads.b62
    public final byte[] a(byte[] bArr, byte[] bArr2) throws GeneralSecurityException {
        int length = bArr.length;
        if (length > (Integer.MAX_VALUE - this.a.b()) - 16) {
            throw new GeneralSecurityException("plaintext too long");
        }
        ByteBuffer byteBufferAllocate = ByteBuffer.allocate(this.a.b() + length + 16);
        if (byteBufferAllocate.remaining() < length + this.a.b() + 16) {
            throw new IllegalArgumentException("Given ByteBuffer output is too small");
        }
        int iPosition = byteBufferAllocate.position();
        this.a.d(byteBufferAllocate, bArr);
        byteBufferAllocate.position(iPosition);
        byte[] bArr3 = new byte[this.a.b()];
        byteBufferAllocate.get(bArr3);
        byteBufferAllocate.limit(byteBufferAllocate.limit() - 16);
        byte[] bArr4 = new byte[32];
        this.f9958b.e(bArr3, 0).get(bArr4);
        int length2 = bArr2.length;
        int i2 = length2 & 15;
        int i3 = i2 == 0 ? length2 : (length2 + 16) - i2;
        int iRemaining = byteBufferAllocate.remaining();
        int i4 = iRemaining % 16;
        int i5 = (i4 == 0 ? iRemaining : (iRemaining + 16) - i4) + i3;
        ByteBuffer byteBufferOrder = ByteBuffer.allocate(i5 + 16).order(ByteOrder.LITTLE_ENDIAN);
        byteBufferOrder.put(bArr2);
        byteBufferOrder.position(i3);
        byteBufferOrder.put(byteBufferAllocate);
        byteBufferOrder.position(i5);
        byteBufferOrder.putLong(length2);
        byteBufferOrder.putLong(iRemaining);
        byte[] bArrA = qg2.a(bArr4, byteBufferOrder.array());
        byteBufferAllocate.limit(byteBufferAllocate.limit() + 16);
        byteBufferAllocate.put(bArrA);
        return byteBufferAllocate.array();
    }

    abstract tf2 b(byte[] bArr, int i2);
}