package com.google.android.gms.internal.ads;

import j$.util.Spliterator;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class fi2 extends gi2 {

    /* renamed from: c, reason: collision with root package name */
    private final InputStream f5873c;

    /* renamed from: d, reason: collision with root package name */
    private final byte[] f5874d;

    /* renamed from: e, reason: collision with root package name */
    private int f5875e;

    /* renamed from: f, reason: collision with root package name */
    private int f5876f;

    /* renamed from: g, reason: collision with root package name */
    private int f5877g;

    /* renamed from: h, reason: collision with root package name */
    private int f5878h;

    /* renamed from: i, reason: collision with root package name */
    private int f5879i;

    /* renamed from: j, reason: collision with root package name */
    private int f5880j;

    /* synthetic */ fi2(InputStream inputStream, int i2, di2 di2Var) {
        super(null);
        this.f5880j = Integer.MAX_VALUE;
        oj2.b(inputStream, "input");
        this.f5873c = inputStream;
        this.f5874d = new byte[Spliterator.CONCURRENT];
        this.f5875e = 0;
        this.f5877g = 0;
        this.f5879i = 0;
    }

    private final void D() {
        int i2 = this.f5875e + this.f5876f;
        this.f5875e = i2;
        int i3 = this.f5879i + i2;
        int i4 = this.f5880j;
        if (i3 <= i4) {
            this.f5876f = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f5876f = i5;
        this.f5875e = i2 - i5;
    }

    private final void E(int i2) throws qj2 {
        if (F(i2)) {
            return;
        }
        if (i2 <= (Integer.MAX_VALUE - this.f5879i) - this.f5877g) {
            throw qj2.b();
        }
        throw qj2.h();
    }

    private final boolean F(int i2) throws IOException {
        int i3 = this.f5877g;
        int i4 = this.f5875e;
        if (i3 + i2 <= i4) {
            StringBuilder sb = new StringBuilder(77);
            sb.append("refillBuffer() called when ");
            sb.append(i2);
            sb.append(" bytes were already available in buffer");
            throw new IllegalStateException(sb.toString());
        }
        int i5 = this.f5879i;
        if (i2 > (Integer.MAX_VALUE - i5) - i3 || i5 + i3 + i2 > this.f5880j) {
            return false;
        }
        if (i3 > 0) {
            if (i4 > i3) {
                byte[] bArr = this.f5874d;
                System.arraycopy(bArr, i3, bArr, 0, i4 - i3);
            }
            i5 = this.f5879i + i3;
            this.f5879i = i5;
            i4 = this.f5875e - i3;
            this.f5875e = i4;
            this.f5877g = 0;
        }
        int i6 = this.f5873c.read(this.f5874d, i4, Math.min(4096 - i4, (Integer.MAX_VALUE - i5) - i4));
        if (i6 == 0 || i6 < -1 || i6 > 4096) {
            String strValueOf = String.valueOf(this.f5873c.getClass());
            StringBuilder sb2 = new StringBuilder(strValueOf.length() + 91);
            sb2.append(strValueOf);
            sb2.append("#read(byte[]) returned invalid result: ");
            sb2.append(i6);
            sb2.append("\nThe InputStream implementation is buggy.");
            throw new IllegalStateException(sb2.toString());
        }
        if (i6 <= 0) {
            return false;
        }
        this.f5875e += i6;
        D();
        if (this.f5875e >= i2) {
            return true;
        }
        return F(i2);
    }

    private final byte[] G(int i2, boolean z) throws IOException {
        byte[] bArrH = H(i2);
        if (bArrH != null) {
            return bArrH;
        }
        int i3 = this.f5877g;
        int i4 = this.f5875e;
        int i5 = i4 - i3;
        this.f5879i += i4;
        this.f5877g = 0;
        this.f5875e = 0;
        List<byte[]> listI = I(i2 - i5);
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f5874d, i3, bArr, 0, i5);
        for (byte[] bArr2 : listI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i5, length);
            i5 += length;
        }
        return bArr;
    }

    private final byte[] H(int i2) throws IOException {
        if (i2 == 0) {
            return oj2.f7950c;
        }
        if (i2 < 0) {
            throw qj2.c();
        }
        int i3 = this.f5879i;
        int i4 = this.f5877g;
        int i5 = i3 + i4 + i2;
        if ((-2147483647) + i5 > 0) {
            throw qj2.h();
        }
        int i6 = this.f5880j;
        if (i5 > i6) {
            C((i6 - i3) - i4);
            throw qj2.b();
        }
        int i7 = this.f5875e - i4;
        int i8 = i2 - i7;
        if (i8 >= 4096 && i8 > this.f5873c.available()) {
            return null;
        }
        byte[] bArr = new byte[i2];
        System.arraycopy(this.f5874d, this.f5877g, bArr, 0, i7);
        this.f5879i += this.f5875e;
        this.f5877g = 0;
        this.f5875e = 0;
        while (i7 < i2) {
            int i9 = this.f5873c.read(bArr, i7, i2 - i7);
            if (i9 == -1) {
                throw qj2.b();
            }
            this.f5879i += i9;
            i7 += i9;
        }
        return bArr;
    }

    private final List<byte[]> I(int i2) throws IOException {
        ArrayList arrayList = new ArrayList();
        while (i2 > 0) {
            int iMin = Math.min(i2, Spliterator.CONCURRENT);
            byte[] bArr = new byte[iMin];
            int i3 = 0;
            while (i3 < iMin) {
                int i4 = this.f5873c.read(bArr, i3, iMin - i3);
                if (i4 == -1) {
                    throw qj2.b();
                }
                this.f5879i += i4;
                i3 += i4;
            }
            i2 -= iMin;
            arrayList.add(bArr);
        }
        return arrayList;
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int A(int i2) throws qj2 {
        if (i2 < 0) {
            throw qj2.c();
        }
        int i3 = i2 + this.f5879i + this.f5877g;
        int i4 = this.f5880j;
        if (i3 > i4) {
            throw qj2.b();
        }
        this.f5880j = i3;
        D();
        return i4;
    }

    public final byte B() throws qj2 {
        if (this.f5877g == this.f5875e) {
            E(1);
        }
        byte[] bArr = this.f5874d;
        int i2 = this.f5877g;
        this.f5877g = i2 + 1;
        return bArr[i2];
    }

    public final void C(int i2) throws qj2 {
        int i3 = this.f5875e;
        int i4 = this.f5877g;
        int i5 = i3 - i4;
        if (i2 <= i5 && i2 >= 0) {
            this.f5877g = i4 + i2;
            return;
        }
        if (i2 < 0) {
            throw qj2.c();
        }
        int i6 = this.f5879i;
        int i7 = i6 + i4;
        int i8 = this.f5880j;
        if (i7 + i2 > i8) {
            C((i8 - i6) - i4);
            throw qj2.b();
        }
        this.f5879i = i7;
        this.f5875e = 0;
        this.f5877g = 0;
        while (i5 < i2) {
            try {
                long j2 = i2 - i5;
                long jSkip = this.f5873c.skip(j2);
                if (jSkip < 0 || jSkip > j2) {
                    String strValueOf = String.valueOf(this.f5873c.getClass());
                    StringBuilder sb = new StringBuilder(strValueOf.length() + 92);
                    sb.append(strValueOf);
                    sb.append("#skip returned invalid result: ");
                    sb.append(jSkip);
                    sb.append("\nThe InputStream implementation is buggy.");
                    throw new IllegalStateException(sb.toString());
                }
                if (jSkip == 0) {
                    break;
                } else {
                    i5 += (int) jSkip;
                }
            } finally {
                this.f5879i += i5;
                D();
            }
        }
        if (i5 >= i2) {
            return;
        }
        int i9 = this.f5875e;
        int i10 = i9 - this.f5877g;
        this.f5877g = i9;
        E(1);
        while (true) {
            int i11 = i2 - i10;
            int i12 = this.f5875e;
            if (i11 <= i12) {
                this.f5877g = i11;
                return;
            } else {
                i10 += i12;
                this.f5877g = i12;
                E(1);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2[r3] >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int J() {
        /*
            r5 = this;
            int r0 = r5.f5877g
            int r1 = r5.f5875e
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f5874d
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f5877g = r3
            return r0
        L12:
            int r1 = r1 - r3
            r4 = 9
            if (r1 < r4) goto L6c
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 7
            r0 = r0 ^ r3
            if (r0 >= 0) goto L23
            r0 = r0 ^ (-128(0xffffffffffffff80, float:NaN))
            goto L69
        L23:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r1 = r1 << 14
            r0 = r0 ^ r1
            if (r0 < 0) goto L30
            r0 = r0 ^ 16256(0x3f80, float:2.278E-41)
        L2e:
            r1 = r3
            goto L69
        L30:
            int r1 = r3 + 1
            r3 = r2[r3]
            int r3 = r3 << 21
            r0 = r0 ^ r3
            if (r0 >= 0) goto L3e
            r2 = -2080896(0xffffffffffe03f80, float:NaN)
            r0 = r0 ^ r2
            goto L69
        L3e:
            int r3 = r1 + 1
            r1 = r2[r1]
            int r4 = r1 << 28
            r0 = r0 ^ r4
            r4 = 266354560(0xfe03f80, float:2.2112565E-29)
            r0 = r0 ^ r4
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r3 = r2[r3]
            if (r3 >= 0) goto L69
            int r3 = r1 + 1
            r1 = r2[r1]
            if (r1 >= 0) goto L2e
            int r1 = r3 + 1
            r2 = r2[r3]
            if (r2 < 0) goto L6c
        L69:
            r5.f5877g = r1
            return r0
        L6c:
            long r0 = r5.L()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.fi2.J():int");
    }

    public final long K() {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        int i3 = this.f5877g;
        int i4 = this.f5875e;
        if (i4 != i3) {
            byte[] bArr = this.f5874d;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f5877g = i5;
                return b2;
            }
            if (i4 - i5 >= 9) {
                int i6 = i5 + 1;
                int i7 = b2 ^ (bArr[i5] << 7);
                if (i7 >= 0) {
                    int i8 = i6 + 1;
                    int i9 = i7 ^ (bArr[i6] << 14);
                    if (i9 >= 0) {
                        j2 = i9 ^ 16256;
                    } else {
                        i6 = i8 + 1;
                        int i10 = i9 ^ (bArr[i8] << 21);
                        if (i10 < 0) {
                            i2 = i10 ^ (-2080896);
                        } else {
                            i8 = i6 + 1;
                            long j6 = (bArr[i6] << 28) ^ i10;
                            if (j6 < 0) {
                                int i11 = i8 + 1;
                                long j7 = j6 ^ (bArr[i8] << 35);
                                if (j7 < 0) {
                                    j4 = -34093383808L;
                                } else {
                                    i8 = i11 + 1;
                                    j6 = j7 ^ (bArr[i11] << 42);
                                    if (j6 >= 0) {
                                        j5 = 4363953127296L;
                                    } else {
                                        i11 = i8 + 1;
                                        j7 = j6 ^ (bArr[i8] << 49);
                                        if (j7 < 0) {
                                            j4 = -558586000294016L;
                                        } else {
                                            i8 = i11 + 1;
                                            j2 = (j7 ^ (bArr[i11] << 56)) ^ 71499008037633920L;
                                            if (j2 < 0) {
                                                i11 = i8 + 1;
                                                if (bArr[i8] >= 0) {
                                                    j3 = j2;
                                                    i6 = i11;
                                                    this.f5877g = i6;
                                                    return j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j4 ^ j7;
                                i6 = i11;
                                this.f5877g = i6;
                                return j3;
                            }
                            j5 = 266354560;
                            j2 = j6 ^ j5;
                        }
                    }
                    i6 = i8;
                    j3 = j2;
                    this.f5877g = i6;
                    return j3;
                }
                i2 = i7 ^ (-128);
                j3 = i2;
                this.f5877g = i6;
                return j3;
            }
        }
        return L();
    }

    final long L() throws qj2 {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j2 |= (r3 & 127) << i2;
            if ((B() & 128) == 0) {
                return j2;
            }
        }
        throw qj2.d();
    }

    public final int M() throws qj2 {
        int i2 = this.f5877g;
        if (this.f5875e - i2 < 4) {
            E(4);
            i2 = this.f5877g;
        }
        byte[] bArr = this.f5874d;
        this.f5877g = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final long N() throws qj2 {
        int i2 = this.f5877g;
        if (this.f5875e - i2 < 8) {
            E(8);
            i2 = this.f5877g;
        }
        byte[] bArr = this.f5874d;
        this.f5877g = i2 + 8;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final void a(int i2) {
        this.f5880j = i2;
        D();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final boolean b() {
        return this.f5877g == this.f5875e && !F(1);
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int c() {
        return this.f5879i + this.f5877g;
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int g() throws qj2 {
        if (b()) {
            this.f5878h = 0;
            return 0;
        }
        int iJ = J();
        this.f5878h = iJ;
        if ((iJ >>> 3) != 0) {
            return iJ;
        }
        throw qj2.e();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final void h(int i2) throws qj2 {
        if (this.f5878h != i2) {
            throw qj2.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final boolean i(int i2) throws qj2 {
        int iG;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.f5875e - this.f5877g < 10) {
                while (i4 < 10) {
                    if (B() < 0) {
                        i4++;
                    }
                }
                throw qj2.d();
            }
            while (i4 < 10) {
                byte[] bArr = this.f5874d;
                int i5 = this.f5877g;
                this.f5877g = i5 + 1;
                if (bArr[i5] < 0) {
                    i4++;
                }
            }
            throw qj2.d();
            return true;
        }
        if (i3 == 1) {
            C(8);
            return true;
        }
        if (i3 == 2) {
            C(J());
            return true;
        }
        if (i3 != 3) {
            if (i3 == 4) {
                return false;
            }
            if (i3 != 5) {
                throw qj2.g();
            }
            C(4);
            return true;
        }
        do {
            iG = g();
            if (iG == 0) {
                break;
            }
        } while (i(iG));
        h(((i2 >>> 3) << 3) | 4);
        return true;
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final double j() {
        return Double.longBitsToDouble(N());
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final float k() {
        return Float.intBitsToFloat(M());
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final long l() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final long m() {
        return K();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int n() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final long o() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int p() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final boolean q() {
        return K() != 0;
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final String r() throws qj2 {
        int iJ = J();
        if (iJ > 0) {
            int i2 = this.f5875e;
            int i3 = this.f5877g;
            if (iJ <= i2 - i3) {
                String str = new String(this.f5874d, i3, iJ, oj2.a);
                this.f5877g += iJ;
                return str;
            }
        }
        if (iJ == 0) {
            return "";
        }
        if (iJ > this.f5875e) {
            return new String(G(iJ, false), oj2.a);
        }
        E(iJ);
        String str2 = new String(this.f5874d, this.f5877g, iJ, oj2.a);
        this.f5877g += iJ;
        return str2;
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final String s() throws IOException {
        byte[] bArrG;
        int iJ = J();
        int i2 = this.f5877g;
        int i3 = this.f5875e;
        if (iJ <= i3 - i2 && iJ > 0) {
            bArrG = this.f5874d;
            this.f5877g = i2 + iJ;
        } else {
            if (iJ == 0) {
                return "";
            }
            if (iJ <= i3) {
                E(iJ);
                bArrG = this.f5874d;
                this.f5877g = iJ;
            } else {
                bArrG = G(iJ, false);
            }
            i2 = 0;
        }
        return hm2.f(bArrG, i2, iJ);
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final ci2 t() throws IOException {
        int iJ = J();
        int i2 = this.f5875e;
        int i3 = this.f5877g;
        if (iJ <= i2 - i3 && iJ > 0) {
            ci2 ci2VarG = ci2.G(this.f5874d, i3, iJ);
            this.f5877g += iJ;
            return ci2VarG;
        }
        if (iJ == 0) {
            return ci2.f5319e;
        }
        byte[] bArrH = H(iJ);
        if (bArrH != null) {
            return ci2.H(bArrH);
        }
        int i4 = this.f5877g;
        int i5 = this.f5875e;
        int i6 = i5 - i4;
        this.f5879i += i5;
        this.f5877g = 0;
        this.f5875e = 0;
        List<byte[]> listI = I(iJ - i6);
        byte[] bArr = new byte[iJ];
        System.arraycopy(this.f5874d, i4, bArr, 0, i6);
        for (byte[] bArr2 : listI) {
            int length = bArr2.length;
            System.arraycopy(bArr2, 0, bArr, i6, length);
            i6 += length;
        }
        return ci2.I(bArr);
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int u() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int v() {
        return J();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int w() {
        return M();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final long x() {
        return N();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int y() {
        return gi2.e(J());
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final long z() {
        return gi2.f(K());
    }
}