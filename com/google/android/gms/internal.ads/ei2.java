package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ei2 extends gi2 {

    /* renamed from: c, reason: collision with root package name */
    private final byte[] f5642c;

    /* renamed from: d, reason: collision with root package name */
    private int f5643d;

    /* renamed from: e, reason: collision with root package name */
    private int f5644e;

    /* renamed from: f, reason: collision with root package name */
    private int f5645f;

    /* renamed from: g, reason: collision with root package name */
    private final int f5646g;

    /* renamed from: h, reason: collision with root package name */
    private int f5647h;

    /* renamed from: i, reason: collision with root package name */
    private int f5648i;

    /* synthetic */ ei2(byte[] bArr, int i2, int i3, boolean z, di2 di2Var) {
        super(null);
        this.f5648i = Integer.MAX_VALUE;
        this.f5642c = bArr;
        this.f5643d = i3 + i2;
        this.f5645f = i2;
        this.f5646g = i2;
    }

    private final void D() {
        int i2 = this.f5643d + this.f5644e;
        this.f5643d = i2;
        int i3 = i2 - this.f5646g;
        int i4 = this.f5648i;
        if (i3 <= i4) {
            this.f5644e = 0;
            return;
        }
        int i5 = i3 - i4;
        this.f5644e = i5;
        this.f5643d = i2 - i5;
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int A(int i2) {
        if (i2 < 0) {
            throw qj2.c();
        }
        int i3 = i2 + (this.f5645f - this.f5646g);
        int i4 = this.f5648i;
        if (i3 > i4) {
            throw qj2.b();
        }
        this.f5648i = i3;
        D();
        return i4;
    }

    public final byte B() throws qj2 {
        int i2 = this.f5645f;
        if (i2 == this.f5643d) {
            throw qj2.b();
        }
        byte[] bArr = this.f5642c;
        this.f5645f = i2 + 1;
        return bArr[i2];
    }

    public final void C(int i2) throws qj2 {
        if (i2 >= 0) {
            int i3 = this.f5643d;
            int i4 = this.f5645f;
            if (i2 <= i3 - i4) {
                this.f5645f = i4 + i2;
                return;
            }
        }
        if (i2 >= 0) {
            throw qj2.b();
        }
        throw qj2.c();
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0067, code lost:
    
        if (r2[r3] >= 0) goto L33;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final int E() {
        /*
            r5 = this;
            int r0 = r5.f5645f
            int r1 = r5.f5643d
            if (r1 != r0) goto L7
            goto L6c
        L7:
            byte[] r2 = r5.f5642c
            int r3 = r0 + 1
            r0 = r2[r0]
            if (r0 < 0) goto L12
            r5.f5645f = r3
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
            r5.f5645f = r1
            return r0
        L6c:
            long r0 = r5.G()
            int r1 = (int) r0
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.ei2.E():int");
    }

    public final long F() {
        long j2;
        long j3;
        long j4;
        long j5;
        int i2;
        int i3 = this.f5645f;
        int i4 = this.f5643d;
        if (i4 != i3) {
            byte[] bArr = this.f5642c;
            int i5 = i3 + 1;
            byte b2 = bArr[i3];
            if (b2 >= 0) {
                this.f5645f = i5;
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
                                                    this.f5645f = i6;
                                                    return j3;
                                                }
                                            }
                                        }
                                    }
                                }
                                j3 = j4 ^ j7;
                                i6 = i11;
                                this.f5645f = i6;
                                return j3;
                            }
                            j5 = 266354560;
                            j2 = j6 ^ j5;
                        }
                    }
                    i6 = i8;
                    j3 = j2;
                    this.f5645f = i6;
                    return j3;
                }
                i2 = i7 ^ (-128);
                j3 = i2;
                this.f5645f = i6;
                return j3;
            }
        }
        return G();
    }

    final long G() throws qj2 {
        long j2 = 0;
        for (int i2 = 0; i2 < 64; i2 += 7) {
            j2 |= (r3 & 127) << i2;
            if ((B() & 128) == 0) {
                return j2;
            }
        }
        throw qj2.d();
    }

    public final int H() throws qj2 {
        int i2 = this.f5645f;
        if (this.f5643d - i2 < 4) {
            throw qj2.b();
        }
        byte[] bArr = this.f5642c;
        this.f5645f = i2 + 4;
        return ((bArr[i2 + 3] & 255) << 24) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16);
    }

    public final long I() throws qj2 {
        int i2 = this.f5645f;
        if (this.f5643d - i2 < 8) {
            throw qj2.b();
        }
        byte[] bArr = this.f5642c;
        this.f5645f = i2 + 8;
        return ((bArr[i2 + 7] & 255) << 56) | (bArr[i2] & 255) | ((bArr[i2 + 1] & 255) << 8) | ((bArr[i2 + 2] & 255) << 16) | ((bArr[i2 + 3] & 255) << 24) | ((bArr[i2 + 4] & 255) << 32) | ((bArr[i2 + 5] & 255) << 40) | ((bArr[i2 + 6] & 255) << 48);
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final void a(int i2) {
        this.f5648i = i2;
        D();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final boolean b() {
        return this.f5645f == this.f5643d;
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int c() {
        return this.f5645f - this.f5646g;
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int g() throws qj2 {
        if (b()) {
            this.f5647h = 0;
            return 0;
        }
        int iE = E();
        this.f5647h = iE;
        if ((iE >>> 3) != 0) {
            return iE;
        }
        throw qj2.e();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final void h(int i2) throws qj2 {
        if (this.f5647h != i2) {
            throw qj2.f();
        }
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final boolean i(int i2) throws qj2 {
        int iG;
        int i3 = i2 & 7;
        int i4 = 0;
        if (i3 == 0) {
            if (this.f5643d - this.f5645f < 10) {
                while (i4 < 10) {
                    if (B() < 0) {
                        i4++;
                    }
                }
                throw qj2.d();
            }
            while (i4 < 10) {
                byte[] bArr = this.f5642c;
                int i5 = this.f5645f;
                this.f5645f = i5 + 1;
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
            C(E());
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
        return Double.longBitsToDouble(I());
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final float k() {
        return Float.intBitsToFloat(H());
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final long l() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final long m() {
        return F();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int n() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final long o() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int p() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final boolean q() {
        return F() != 0;
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final String r() throws qj2 {
        int iE = E();
        if (iE > 0) {
            int i2 = this.f5643d;
            int i3 = this.f5645f;
            if (iE <= i2 - i3) {
                String str = new String(this.f5642c, i3, iE, oj2.a);
                this.f5645f += iE;
                return str;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE < 0) {
            throw qj2.c();
        }
        throw qj2.b();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final String s() throws qj2 {
        int iE = E();
        if (iE > 0) {
            int i2 = this.f5643d;
            int i3 = this.f5645f;
            if (iE <= i2 - i3) {
                String strF = hm2.f(this.f5642c, i3, iE);
                this.f5645f += iE;
                return strF;
            }
        }
        if (iE == 0) {
            return "";
        }
        if (iE <= 0) {
            throw qj2.c();
        }
        throw qj2.b();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final ci2 t() throws qj2 {
        int iE = E();
        if (iE > 0) {
            int i2 = this.f5643d;
            int i3 = this.f5645f;
            if (iE <= i2 - i3) {
                ci2 ci2VarG = ci2.G(this.f5642c, i3, iE);
                this.f5645f += iE;
                return ci2VarG;
            }
        }
        if (iE == 0) {
            return ci2.f5319e;
        }
        if (iE > 0) {
            int i4 = this.f5643d;
            int i5 = this.f5645f;
            if (iE <= i4 - i5) {
                int i6 = iE + i5;
                this.f5645f = i6;
                return ci2.I(Arrays.copyOfRange(this.f5642c, i5, i6));
            }
        }
        if (iE <= 0) {
            throw qj2.c();
        }
        throw qj2.b();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int u() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int v() {
        return E();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int w() {
        return H();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final long x() {
        return I();
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final int y() {
        return gi2.e(E());
    }

    @Override // com.google.android.gms.internal.ads.gi2
    public final long z() {
        return gi2.f(F());
    }
}