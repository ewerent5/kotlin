package com.google.android.gms.internal.ads;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class c33 extends x23 {

    /* renamed from: c, reason: collision with root package name */
    private MessageDigest f5257c;

    @Override // com.google.android.gms.internal.ads.x23
    public final byte[] a(String str) throws UnsupportedEncodingException {
        byte[] bArr;
        byte[] bArrArray;
        String[] strArrSplit = str.split(" ");
        int length = strArrSplit.length;
        int i2 = 4;
        if (length == 1) {
            int iA = b33.a(strArrSplit[0]);
            ByteBuffer byteBufferAllocate = ByteBuffer.allocate(4);
            byteBufferAllocate.order(ByteOrder.LITTLE_ENDIAN);
            byteBufferAllocate.putInt(iA);
            bArrArray = byteBufferAllocate.array();
        } else {
            if (length < 5) {
                bArr = new byte[length + length];
                for (int i3 = 0; i3 < strArrSplit.length; i3++) {
                    int iA2 = b33.a(strArrSplit[i3]);
                    int i4 = (iA2 >> 16) ^ ((char) iA2);
                    byte[] bArr2 = {(byte) i4, (byte) (i4 >> 8)};
                    int i5 = i3 + i3;
                    bArr[i5] = bArr2[0];
                    bArr[i5 + 1] = bArr2[1];
                }
            } else {
                bArr = new byte[length];
                for (int i6 = 0; i6 < strArrSplit.length; i6++) {
                    int iA3 = b33.a(strArrSplit[i6]);
                    bArr[i6] = (byte) ((iA3 >> 24) ^ (((iA3 & 255) ^ ((iA3 >> 8) & 255)) ^ ((iA3 >> 16) & 255)));
                }
            }
            bArrArray = bArr;
        }
        this.f5257c = b();
        synchronized (this.f10111b) {
            MessageDigest messageDigest = this.f5257c;
            if (messageDigest == null) {
                return new byte[0];
            }
            messageDigest.reset();
            this.f5257c.update(bArrArray);
            byte[] bArrDigest = this.f5257c.digest();
            int length2 = bArrDigest.length;
            if (length2 <= 4) {
                i2 = length2;
            }
            byte[] bArr3 = new byte[i2];
            System.arraycopy(bArrDigest, 0, bArr3, 0, i2);
            return bArr3;
        }
    }
}