package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class jh2 {
    private final byte[] a = new byte[256];

    /* renamed from: b, reason: collision with root package name */
    private int f6758b;

    /* renamed from: c, reason: collision with root package name */
    private int f6759c;

    public jh2(byte[] bArr) {
        for (int i2 = 0; i2 < 256; i2++) {
            this.a[i2] = (byte) i2;
        }
        int i3 = 0;
        for (int i4 = 0; i4 < 256; i4++) {
            byte[] bArr2 = this.a;
            byte b2 = bArr2[i4];
            i3 = (i3 + b2 + bArr[i4 % bArr.length]) & 255;
            bArr2[i4] = bArr2[i3];
            bArr2[i3] = b2;
        }
        this.f6758b = 0;
        this.f6759c = 0;
    }

    public final void a(byte[] bArr) {
        int i2 = this.f6758b;
        int i3 = this.f6759c;
        for (int i4 = 0; i4 < bArr.length; i4++) {
            i2 = (i2 + 1) & 255;
            byte[] bArr2 = this.a;
            byte b2 = bArr2[i2];
            i3 = (i3 + b2) & 255;
            bArr2[i2] = bArr2[i3];
            bArr2[i3] = b2;
            bArr[i4] = (byte) (bArr2[(bArr2[i2] + b2) & 255] ^ bArr[i4]);
        }
        this.f6758b = i2;
        this.f6759c = i3;
    }
}