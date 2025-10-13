package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class p03 {
    private final byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private final int f8059b;

    /* renamed from: c, reason: collision with root package name */
    private int f8060c;

    /* renamed from: d, reason: collision with root package name */
    private int f8061d = 0;

    public p03(byte[] bArr, int i2, int i3) {
        this.a = bArr;
        this.f8060c = i2;
        this.f8059b = i3;
        h();
    }

    private final int f() {
        int i2 = 0;
        while (!b()) {
            i2++;
        }
        return ((1 << i2) - 1) + (i2 > 0 ? c(i2) : 0);
    }

    private final boolean g(int i2) {
        if (i2 < 2 || i2 >= this.f8059b) {
            return false;
        }
        byte[] bArr = this.a;
        return bArr[i2] == 3 && bArr[i2 + (-2)] == 0 && bArr[i2 + (-1)] == 0;
    }

    private final void h() {
        int i2;
        int i3;
        int i4 = this.f8060c;
        boolean z = true;
        if (i4 < 0 || (i2 = this.f8061d) < 0 || i2 >= 8 || (i4 >= (i3 = this.f8059b) && (i4 != i3 || i2 != 0))) {
            z = false;
        }
        f03.d(z);
    }

    public final void a(int i2) {
        int i3 = this.f8060c;
        int i4 = (i2 >> 3) + i3;
        this.f8060c = i4;
        int i5 = this.f8061d + (i2 & 7);
        this.f8061d = i5;
        if (i5 > 7) {
            this.f8060c = i4 + 1;
            this.f8061d = i5 - 8;
        }
        while (true) {
            i3++;
            if (i3 > this.f8060c) {
                h();
                return;
            } else if (g(i3)) {
                this.f8060c++;
                i3 += 2;
            }
        }
    }

    public final boolean b() {
        return c(1) == 1;
    }

    public final int c(int i2) {
        int i3;
        int i4;
        int i5 = i2 >> 3;
        int i6 = 0;
        for (int i7 = 0; i7 < i5; i7++) {
            int i8 = g(this.f8060c + 1) ? this.f8060c + 2 : this.f8060c + 1;
            int i9 = this.f8061d;
            if (i9 != 0) {
                byte[] bArr = this.a;
                i4 = ((bArr[i8] & 255) >>> (8 - i9)) | ((bArr[this.f8060c] & 255) << i9);
            } else {
                i4 = this.a[this.f8060c];
            }
            i2 -= 8;
            i6 |= (255 & i4) << i2;
            this.f8060c = i8;
        }
        if (i2 > 0) {
            int i10 = this.f8061d + i2;
            byte b2 = (byte) (255 >> (8 - i2));
            int i11 = g(this.f8060c + 1) ? this.f8060c + 2 : this.f8060c + 1;
            if (i10 > 8) {
                byte[] bArr2 = this.a;
                i3 = (b2 & (((255 & bArr2[i11]) >> (16 - i10)) | ((bArr2[this.f8060c] & 255) << (i10 - 8)))) | i6;
                this.f8060c = i11;
            } else {
                i3 = (b2 & ((255 & this.a[this.f8060c]) >> (8 - i10))) | i6;
                if (i10 == 8) {
                    this.f8060c = i11;
                }
            }
            i6 = i3;
            this.f8061d = i10 % 8;
        }
        h();
        return i6;
    }

    public final int d() {
        return f();
    }

    public final int e() {
        int iF = f();
        return (iF % 2 == 0 ? -1 : 1) * ((iF + 1) / 2);
    }
}