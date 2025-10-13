package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class o03 {
    public byte[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f7869b;

    /* renamed from: c, reason: collision with root package name */
    private int f7870c;

    public o03() {
    }

    public o03(int i2) {
        this.a = new byte[i2];
        this.f7870c = i2;
    }

    public final void a(int i2) {
        b(h() < i2 ? new byte[i2] : this.a, i2);
    }

    public final void b(byte[] bArr, int i2) {
        this.a = bArr;
        this.f7870c = i2;
        this.f7869b = 0;
    }

    public final void c() {
        this.f7869b = 0;
        this.f7870c = 0;
    }

    public final int d() {
        return this.f7870c - this.f7869b;
    }

    public final int e() {
        return this.f7870c;
    }

    public final void f(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.a.length) {
            z = true;
        }
        f03.a(z);
        this.f7870c = i2;
    }

    public final int g() {
        return this.f7869b;
    }

    public final int h() {
        byte[] bArr = this.a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    public final void i(int i2) {
        boolean z = false;
        if (i2 >= 0 && i2 <= this.f7870c) {
            z = true;
        }
        f03.a(z);
        this.f7869b = i2;
    }

    public final void j(int i2) {
        i(this.f7869b + i2);
    }

    public final void k(byte[] bArr, int i2, int i3) {
        System.arraycopy(this.a, this.f7869b, bArr, i2, i3);
        this.f7869b += i3;
    }

    public final int l() {
        byte[] bArr = this.a;
        int i2 = this.f7869b;
        this.f7869b = i2 + 1;
        return bArr[i2] & 255;
    }

    public final int m() {
        byte[] bArr = this.a;
        int i2 = this.f7869b;
        int i3 = i2 + 1;
        this.f7869b = i3;
        byte b2 = bArr[i2];
        this.f7869b = i3 + 1;
        return (bArr[i3] & 255) | ((b2 & 255) << 8);
    }

    public final int n() {
        byte[] bArr = this.a;
        int i2 = this.f7869b;
        int i3 = i2 + 1;
        this.f7869b = i3;
        byte b2 = bArr[i2];
        this.f7869b = i3 + 1;
        return ((bArr[i3] & 255) << 8) | (b2 & 255);
    }

    public final short o() {
        byte[] bArr = this.a;
        int i2 = this.f7869b;
        int i3 = i2 + 1;
        this.f7869b = i3;
        byte b2 = bArr[i2];
        this.f7869b = i3 + 1;
        return (short) ((bArr[i3] & 255) | ((b2 & 255) << 8));
    }

    public final long p() {
        byte[] bArr = this.a;
        int i2 = this.f7869b;
        int i3 = i2 + 1;
        this.f7869b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f7869b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f7869b = i5;
        byte b4 = bArr[i4];
        this.f7869b = i5 + 1;
        return ((b3 & 255) << 16) | ((b2 & 255) << 24) | ((b4 & 255) << 8) | (bArr[i5] & 255);
    }

    public final long q() {
        byte[] bArr = this.a;
        int i2 = this.f7869b;
        int i3 = i2 + 1;
        this.f7869b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f7869b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f7869b = i5;
        byte b4 = bArr[i4];
        this.f7869b = i5 + 1;
        return ((b3 & 255) << 8) | (b2 & 255) | ((b4 & 255) << 16) | ((bArr[i5] & 255) << 24);
    }

    public final int r() {
        byte[] bArr = this.a;
        int i2 = this.f7869b;
        int i3 = i2 + 1;
        this.f7869b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f7869b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f7869b = i5;
        byte b4 = bArr[i4];
        this.f7869b = i5 + 1;
        return (bArr[i5] & 255) | ((b2 & 255) << 24) | ((b3 & 255) << 16) | ((b4 & 255) << 8);
    }

    public final long s() {
        byte[] bArr = this.a;
        int i2 = this.f7869b;
        int i3 = i2 + 1;
        this.f7869b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f7869b = i4;
        byte b3 = bArr[i3];
        int i5 = i4 + 1;
        this.f7869b = i5;
        byte b4 = bArr[i4];
        int i6 = i5 + 1;
        this.f7869b = i6;
        byte b5 = bArr[i5];
        int i7 = i6 + 1;
        this.f7869b = i7;
        byte b6 = bArr[i6];
        int i8 = i7 + 1;
        this.f7869b = i8;
        byte b7 = bArr[i7];
        int i9 = i8 + 1;
        this.f7869b = i9;
        byte b8 = bArr[i8];
        this.f7869b = i9 + 1;
        return ((b3 & 255) << 48) | ((b2 & 255) << 56) | ((b4 & 255) << 40) | ((b5 & 255) << 32) | ((b6 & 255) << 24) | ((b7 & 255) << 16) | ((b8 & 255) << 8) | (bArr[i9] & 255);
    }

    public final int t() {
        byte[] bArr = this.a;
        int i2 = this.f7869b;
        int i3 = i2 + 1;
        this.f7869b = i3;
        byte b2 = bArr[i2];
        int i4 = i3 + 1;
        this.f7869b = i4;
        byte b3 = bArr[i3];
        this.f7869b = i4 + 2;
        return (b3 & 255) | ((b2 & 255) << 8);
    }

    public final int u() {
        int iR = r();
        if (iR >= 0) {
            return iR;
        }
        StringBuilder sb = new StringBuilder(29);
        sb.append("Top bit not zero: ");
        sb.append(iR);
        throw new IllegalStateException(sb.toString());
    }

    public final long v() {
        long jS = s();
        if (jS >= 0) {
            return jS;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(jS);
        throw new IllegalStateException(sb.toString());
    }

    public final String w(int i2) {
        if (i2 == 0) {
            return "";
        }
        int i3 = this.f7869b;
        int i4 = (i3 + i2) - 1;
        String str = new String(this.a, i3, (i4 >= this.f7870c || this.a[i4] != 0) ? i2 : i2 - 1);
        this.f7869b += i2;
        return str;
    }

    public o03(byte[] bArr) {
        this.a = bArr;
        this.f7870c = bArr.length;
    }
}