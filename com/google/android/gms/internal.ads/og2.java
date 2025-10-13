package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class og2 {
    private final byte[] a;

    private og2(byte[] bArr, int i2, int i3) {
        byte[] bArr2 = new byte[i3];
        this.a = bArr2;
        System.arraycopy(bArr, 0, bArr2, 0, i3);
    }

    public static og2 a(byte[] bArr, int i2, int i3) {
        return new og2(bArr, 0, i3);
    }

    public final byte[] b() {
        byte[] bArr = this.a;
        int length = bArr.length;
        byte[] bArr2 = new byte[length];
        System.arraycopy(bArr, 0, bArr2, 0, length);
        return bArr2;
    }
}