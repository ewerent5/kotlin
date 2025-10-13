package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ji2 extends li2 {

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f6762d;

    /* renamed from: e, reason: collision with root package name */
    private final int f6763e;

    /* renamed from: f, reason: collision with root package name */
    private int f6764f;

    ji2(byte[] bArr, int i2, int i3) {
        super(null);
        int length = bArr.length;
        if (((length - i3) | i3) < 0) {
            throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i3)));
        }
        this.f6762d = bArr;
        this.f6764f = 0;
        this.f6763e = i3;
    }

    public final void E(byte[] bArr, int i2, int i3) {
        try {
            System.arraycopy(bArr, i2, this.f6762d, this.f6764f, i3);
            this.f6764f += i3;
        } catch (IndexOutOfBoundsException e2) {
            throw new ki2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6764f), Integer.valueOf(this.f6763e), Integer.valueOf(i3)), e2);
        }
    }

    public final void F(String str) throws ki2 {
        int i2 = this.f6764f;
        try {
            int iA = li2.A(str.length() * 3);
            int iA2 = li2.A(str.length());
            if (iA2 != iA) {
                r(hm2.d(str));
                byte[] bArr = this.f6762d;
                int i3 = this.f6764f;
                this.f6764f = hm2.e(str, bArr, i3, this.f6763e - i3);
                return;
            }
            int i4 = i2 + iA2;
            this.f6764f = i4;
            int iE = hm2.e(str, this.f6762d, i4, this.f6763e - i4);
            this.f6764f = i2;
            r((iE - i2) - iA2);
            this.f6764f = iE;
        } catch (gm2 e2) {
            this.f6764f = i2;
            d(str, e2);
        } catch (IndexOutOfBoundsException e3) {
            throw new ki2(e3);
        }
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void g(int i2, int i3) {
        r((i2 << 3) | i3);
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void h(int i2, int i3) throws ki2 {
        r(i2 << 3);
        q(i3);
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void i(int i2, int i3) {
        r(i2 << 3);
        r(i3);
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void j(int i2, int i3) throws ki2 {
        r((i2 << 3) | 5);
        s(i3);
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void k(int i2, long j2) throws ki2 {
        r(i2 << 3);
        t(j2);
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void l(int i2, long j2) throws ki2 {
        r((i2 << 3) | 1);
        u(j2);
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void m(int i2, boolean z) throws ki2 {
        r(i2 << 3);
        p(z ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void n(int i2, String str) throws ki2 {
        r((i2 << 3) | 2);
        F(str);
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void o(int i2, ci2 ci2Var) {
        r((i2 << 3) | 2);
        r(ci2Var.l());
        ci2Var.t(this);
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void p(byte b2) throws ki2 {
        try {
            byte[] bArr = this.f6762d;
            int i2 = this.f6764f;
            this.f6764f = i2 + 1;
            bArr[i2] = b2;
        } catch (IndexOutOfBoundsException e2) {
            throw new ki2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6764f), Integer.valueOf(this.f6763e), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void q(int i2) throws ki2 {
        if (i2 >= 0) {
            r(i2);
        } else {
            t(i2);
        }
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void r(int i2) {
        if (li2.f7257b) {
            int i3 = nh2.a;
        }
        while ((i2 & (-128)) != 0) {
            try {
                byte[] bArr = this.f6762d;
                int i4 = this.f6764f;
                this.f6764f = i4 + 1;
                bArr[i4] = (byte) ((i2 & 127) | 128);
                i2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new ki2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6764f), Integer.valueOf(this.f6763e), 1), e2);
            }
        }
        byte[] bArr2 = this.f6762d;
        int i5 = this.f6764f;
        this.f6764f = i5 + 1;
        bArr2[i5] = (byte) i2;
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void s(int i2) throws ki2 {
        try {
            byte[] bArr = this.f6762d;
            int i3 = this.f6764f;
            int i4 = i3 + 1;
            this.f6764f = i4;
            bArr[i3] = (byte) (i2 & 255);
            int i5 = i4 + 1;
            this.f6764f = i5;
            bArr[i4] = (byte) ((i2 >> 8) & 255);
            int i6 = i5 + 1;
            this.f6764f = i6;
            bArr[i5] = (byte) ((i2 >> 16) & 255);
            this.f6764f = i6 + 1;
            bArr[i6] = (byte) ((i2 >> 24) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new ki2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6764f), Integer.valueOf(this.f6763e), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void t(long j2) throws ki2 {
        if (li2.f7257b && this.f6763e - this.f6764f >= 10) {
            while ((j2 & (-128)) != 0) {
                byte[] bArr = this.f6762d;
                int i2 = this.f6764f;
                this.f6764f = i2 + 1;
                cm2.u(bArr, i2, (byte) ((((int) j2) & 127) | 128));
                j2 >>>= 7;
            }
            byte[] bArr2 = this.f6762d;
            int i3 = this.f6764f;
            this.f6764f = i3 + 1;
            cm2.u(bArr2, i3, (byte) j2);
            return;
        }
        while ((j2 & (-128)) != 0) {
            try {
                byte[] bArr3 = this.f6762d;
                int i4 = this.f6764f;
                this.f6764f = i4 + 1;
                bArr3[i4] = (byte) ((((int) j2) & 127) | 128);
                j2 >>>= 7;
            } catch (IndexOutOfBoundsException e2) {
                throw new ki2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6764f), Integer.valueOf(this.f6763e), 1), e2);
            }
        }
        byte[] bArr4 = this.f6762d;
        int i5 = this.f6764f;
        this.f6764f = i5 + 1;
        bArr4[i5] = (byte) j2;
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void u(long j2) throws ki2 {
        try {
            byte[] bArr = this.f6762d;
            int i2 = this.f6764f;
            int i3 = i2 + 1;
            this.f6764f = i3;
            bArr[i2] = (byte) (((int) j2) & 255);
            int i4 = i3 + 1;
            this.f6764f = i4;
            bArr[i3] = (byte) (((int) (j2 >> 8)) & 255);
            int i5 = i4 + 1;
            this.f6764f = i5;
            bArr[i4] = (byte) (((int) (j2 >> 16)) & 255);
            int i6 = i5 + 1;
            this.f6764f = i6;
            bArr[i5] = (byte) (((int) (j2 >> 24)) & 255);
            int i7 = i6 + 1;
            this.f6764f = i7;
            bArr[i6] = (byte) (((int) (j2 >> 32)) & 255);
            int i8 = i7 + 1;
            this.f6764f = i8;
            bArr[i7] = (byte) (((int) (j2 >> 40)) & 255);
            int i9 = i8 + 1;
            this.f6764f = i9;
            bArr[i8] = (byte) (((int) (j2 >> 48)) & 255);
            this.f6764f = i9 + 1;
            bArr[i9] = (byte) (((int) (j2 >> 56)) & 255);
        } catch (IndexOutOfBoundsException e2) {
            throw new ki2(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.f6764f), Integer.valueOf(this.f6763e), 1), e2);
        }
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final void v(byte[] bArr, int i2, int i3) {
        E(bArr, 0, i3);
    }

    @Override // com.google.android.gms.internal.ads.li2
    public final int w() {
        return this.f6763e - this.f6764f;
    }
}