package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class n03 {
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f7610b;

    /* renamed from: c, reason: collision with root package name */
    private int f7611c;

    /* renamed from: d, reason: collision with root package name */
    private int f7612d;

    public n03(byte[] bArr, int i2) {
        this.a = bArr;
        this.f7612d = i2;
    }

    public final int a(int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7 = i2 >> 3;
        boolean z = false;
        int i8 = 0;
        for (int i9 = 0; i9 < i7; i9++) {
            int i10 = this.f7611c;
            if (i10 != 0) {
                byte[] bArr = this.a;
                int i11 = this.f7610b;
                i6 = ((bArr[i11 + 1] & 255) >>> (8 - i10)) | ((bArr[i11] & 255) << i10);
            } else {
                i6 = this.a[this.f7610b];
            }
            i2 -= 8;
            i8 |= (255 & i6) << i2;
            this.f7610b++;
        }
        if (i2 > 0) {
            int i12 = this.f7611c + i2;
            byte b2 = (byte) (255 >> (8 - i2));
            if (i12 > 8) {
                byte[] bArr2 = this.a;
                int i13 = this.f7610b;
                int i14 = i13 + 1;
                i5 = (b2 & (((255 & bArr2[i14]) >> (16 - i12)) | ((bArr2[i13] & 255) << (i12 - 8)))) | i8;
                this.f7610b = i14;
            } else {
                byte[] bArr3 = this.a;
                int i15 = this.f7610b;
                i5 = (b2 & ((255 & bArr3[i15]) >> (8 - i12))) | i8;
                if (i12 == 8) {
                    this.f7610b = i15 + 1;
                }
            }
            i8 = i5;
            this.f7611c = i12 % 8;
        }
        int i16 = this.f7610b;
        if (i16 >= 0 && (i3 = this.f7611c) >= 0 && (i16 < (i4 = this.f7612d) || (i16 == i4 && i3 == 0))) {
            z = true;
        }
        f03.d(z);
        return i8;
    }
}