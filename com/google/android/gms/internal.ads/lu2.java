package com.google.android.gms.internal.ads;

import java.nio.ShortBuffer;
import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class lu2 {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final int f7314b;

    /* renamed from: c, reason: collision with root package name */
    private final int f7315c;

    /* renamed from: d, reason: collision with root package name */
    private final int f7316d;

    /* renamed from: e, reason: collision with root package name */
    private final int f7317e;

    /* renamed from: f, reason: collision with root package name */
    private final short[] f7318f;

    /* renamed from: g, reason: collision with root package name */
    private int f7319g;

    /* renamed from: h, reason: collision with root package name */
    private short[] f7320h;

    /* renamed from: i, reason: collision with root package name */
    private int f7321i;

    /* renamed from: j, reason: collision with root package name */
    private short[] f7322j;

    /* renamed from: k, reason: collision with root package name */
    private int f7323k;

    /* renamed from: l, reason: collision with root package name */
    private short[] f7324l;
    private int q;
    private int r;
    private int s;
    private int t;
    private int v;
    private int w;
    private int x;

    /* renamed from: m, reason: collision with root package name */
    private int f7325m = 0;
    private int n = 0;
    private int u = 0;
    private float o = 1.0f;
    private float p = 1.0f;

    public lu2(int i2, int i3) {
        this.a = i2;
        this.f7314b = i3;
        this.f7315c = i2 / 400;
        int i4 = i2 / 65;
        this.f7316d = i4;
        int i5 = i4 + i4;
        this.f7317e = i5;
        this.f7318f = new short[i5];
        this.f7319g = i5;
        int i6 = i3 * i5;
        this.f7320h = new short[i6];
        this.f7321i = i5;
        this.f7322j = new short[i6];
        this.f7323k = i5;
        this.f7324l = new short[i6];
    }

    private final void g(int i2) {
        int i3 = this.r;
        int i4 = this.f7321i;
        if (i3 + i2 > i4) {
            int i5 = i4 + (i4 / 2) + i2;
            this.f7321i = i5;
            this.f7322j = Arrays.copyOf(this.f7322j, i5 * this.f7314b);
        }
    }

    private final void h(int i2) {
        int i3 = this.q;
        int i4 = this.f7319g;
        if (i3 + i2 > i4) {
            int i5 = i4 + (i4 / 2) + i2;
            this.f7319g = i5;
            this.f7320h = Arrays.copyOf(this.f7320h, i5 * this.f7314b);
        }
    }

    private final void i(short[] sArr, int i2, int i3) {
        g(i3);
        int i4 = this.f7314b;
        System.arraycopy(sArr, i2 * i4, this.f7322j, this.r * i4, i4 * i3);
        this.r += i3;
    }

    private final void j(short[] sArr, int i2, int i3) {
        int i4 = this.f7317e / i3;
        int i5 = this.f7314b;
        int i6 = i3 * i5;
        int i7 = i2 * i5;
        for (int i8 = 0; i8 < i4; i8++) {
            int i9 = 0;
            for (int i10 = 0; i10 < i6; i10++) {
                i9 += sArr[(i8 * i6) + i7 + i10];
            }
            this.f7318f[i8] = (short) (i9 / i6);
        }
    }

    private final int k(short[] sArr, int i2, int i3, int i4) {
        int i5 = i2 * this.f7314b;
        int i6 = 1;
        int i7 = 255;
        int i8 = 0;
        int i9 = 0;
        while (i3 <= i4) {
            int i10 = 0;
            for (int i11 = 0; i11 < i3; i11++) {
                short s = sArr[i5 + i11];
                short s2 = sArr[i5 + i3 + i11];
                i10 += s >= s2 ? s - s2 : s2 - s;
            }
            int i12 = i10 * i8;
            int i13 = i6 * i3;
            if (i12 < i13) {
                i6 = i10;
            }
            if (i12 < i13) {
                i8 = i3;
            }
            int i14 = i10 * i7;
            int i15 = i9 * i3;
            if (i14 > i15) {
                i9 = i10;
            }
            if (i14 > i15) {
                i7 = i3;
            }
            i3++;
        }
        this.w = i6 / i8;
        this.x = i9 / i7;
        return i8;
    }

    private final void l() {
        int iK;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9 = this.r;
        float f2 = this.o / this.p;
        double d2 = f2;
        int i10 = 1;
        if (d2 > 1.00001d || d2 < 0.99999d) {
            int i11 = this.q;
            if (i11 >= this.f7317e) {
                int i12 = 0;
                while (true) {
                    int i13 = this.t;
                    if (i13 > 0) {
                        int iMin = Math.min(this.f7317e, i13);
                        i(this.f7320h, i12, iMin);
                        this.t -= iMin;
                        i12 += iMin;
                    } else {
                        short[] sArr = this.f7320h;
                        int i14 = this.a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f7314b == i10 && i15 == i10) {
                            iK = k(sArr, i12, this.f7315c, this.f7316d);
                        } else {
                            j(sArr, i12, i15);
                            int iK2 = k(this.f7318f, 0, this.f7315c / i15, this.f7316d / i15);
                            if (i15 != i10) {
                                int i16 = iK2 * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i20 = this.f7315c;
                                if (i18 < i20) {
                                    i18 = i20;
                                }
                                int i21 = this.f7316d;
                                if (i19 > i21) {
                                    i19 = i21;
                                }
                                if (this.f7314b == i10) {
                                    iK = k(sArr, i12, i18, i19);
                                } else {
                                    j(sArr, i12, i10);
                                    iK = k(this.f7318f, 0, i18, i19);
                                }
                            } else {
                                iK = iK2;
                            }
                        }
                        int i22 = this.w;
                        int i23 = (i22 == 0 || (i4 = this.u) == 0 || this.x > i22 * 3 || i22 + i22 <= this.v * 3) ? iK : i4;
                        this.v = i22;
                        this.u = iK;
                        if (d2 > 1.0d) {
                            short[] sArr2 = this.f7320h;
                            if (f2 >= 2.0f) {
                                i3 = (int) (i23 / ((-1.0f) + f2));
                            } else {
                                this.t = (int) ((i23 * (2.0f - f2)) / ((-1.0f) + f2));
                                i3 = i23;
                            }
                            g(i3);
                            int i24 = i3;
                            m(i3, this.f7314b, this.f7322j, this.r, sArr2, i12, sArr2, i12 + i23);
                            this.r += i24;
                            i12 += i23 + i24;
                        } else {
                            int i25 = i23;
                            short[] sArr3 = this.f7320h;
                            if (f2 < 0.5f) {
                                i2 = (int) ((i25 * f2) / (1.0f - f2));
                            } else {
                                this.t = (int) ((i25 * ((f2 + f2) - 1.0f)) / (1.0f - f2));
                                i2 = i25;
                            }
                            int i26 = i25 + i2;
                            g(i26);
                            int i27 = this.f7314b;
                            System.arraycopy(sArr3, i12 * i27, this.f7322j, this.r * i27, i27 * i25);
                            m(i2, this.f7314b, this.f7322j, this.r + i25, sArr3, i25 + i12, sArr3, i12);
                            this.r += i26;
                            i12 += i2;
                        }
                    }
                    if (this.f7317e + i12 > i11) {
                        break;
                    } else {
                        i10 = 1;
                    }
                }
                int i28 = this.q - i12;
                short[] sArr4 = this.f7320h;
                int i29 = this.f7314b;
                System.arraycopy(sArr4, i12 * i29, sArr4, 0, i29 * i28);
                this.q = i28;
            }
        } else {
            i(this.f7320h, 0, this.q);
            this.q = 0;
        }
        float f3 = this.p;
        if (f3 == 1.0f || this.r == i9) {
            return;
        }
        int i30 = this.a;
        int i31 = (int) (i30 / f3);
        while (true) {
            if (i31 <= 16384 && i30 <= 16384) {
                break;
            }
            i31 /= 2;
            i30 /= 2;
        }
        int i32 = this.r - i9;
        int i33 = this.s;
        int i34 = this.f7323k;
        if (i33 + i32 > i34) {
            int i35 = i34 + (i34 / 2) + i32;
            this.f7323k = i35;
            this.f7324l = Arrays.copyOf(this.f7324l, i35 * this.f7314b);
        }
        short[] sArr5 = this.f7322j;
        int i36 = this.f7314b;
        System.arraycopy(sArr5, i9 * i36, this.f7324l, this.s * i36, i36 * i32);
        this.r = i9;
        this.s += i32;
        int i37 = 0;
        while (true) {
            i5 = this.s;
            i6 = i5 - 1;
            if (i37 >= i6) {
                break;
            }
            while (true) {
                i7 = this.f7325m + 1;
                i8 = this.n;
                if (i7 * i31 <= i8 * i30) {
                    break;
                }
                g(1);
                int i38 = 0;
                while (true) {
                    int i39 = this.f7314b;
                    if (i38 < i39) {
                        short[] sArr6 = this.f7322j;
                        int i40 = this.r;
                        short[] sArr7 = this.f7324l;
                        int i41 = (i37 * i39) + i38;
                        short s = sArr7[i41];
                        short s2 = sArr7[i41 + i39];
                        int i42 = this.n;
                        int i43 = this.f7325m;
                        int i44 = (i43 + 1) * i31;
                        int i45 = i44 - (i42 * i30);
                        int i46 = i44 - (i43 * i31);
                        sArr6[(i40 * i39) + i38] = (short) (((s * i45) + ((i46 - i45) * s2)) / i46);
                        i38++;
                    }
                }
                this.n++;
                this.r++;
            }
            this.f7325m = i7;
            if (i7 == i30) {
                this.f7325m = 0;
                f03.d(i8 == i31);
                this.n = 0;
            }
            i37++;
        }
        if (i6 != 0) {
            short[] sArr8 = this.f7324l;
            int i47 = this.f7314b;
            System.arraycopy(sArr8, i6 * i47, sArr8, 0, (i5 - i6) * i47);
            this.s -= i6;
        }
    }

    private static void m(int i2, int i3, short[] sArr, int i4, short[] sArr2, int i5, short[] sArr3, int i6) {
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = (i4 * i3) + i7;
            int i9 = (i6 * i3) + i7;
            int i10 = (i5 * i3) + i7;
            for (int i11 = 0; i11 < i2; i11++) {
                sArr[i8] = (short) (((sArr2[i10] * (i2 - i11)) + (sArr3[i9] * i11)) / i2);
                i8 += i3;
                i10 += i3;
                i9 += i3;
            }
        }
    }

    public final void a(float f2) {
        this.o = f2;
    }

    public final void b(float f2) {
        this.p = f2;
    }

    public final void c(ShortBuffer shortBuffer) {
        int iRemaining = shortBuffer.remaining();
        int i2 = this.f7314b;
        int i3 = iRemaining / i2;
        int i4 = i2 * i3;
        h(i3);
        shortBuffer.get(this.f7320h, this.q * this.f7314b, (i4 + i4) / 2);
        this.q += i3;
        l();
    }

    public final void d(ShortBuffer shortBuffer) {
        int iMin = Math.min(shortBuffer.remaining() / this.f7314b, this.r);
        shortBuffer.put(this.f7322j, 0, this.f7314b * iMin);
        int i2 = this.r - iMin;
        this.r = i2;
        short[] sArr = this.f7322j;
        int i3 = this.f7314b;
        System.arraycopy(sArr, iMin * i3, sArr, 0, i2 * i3);
    }

    public final void e() {
        int i2;
        int i3 = this.q;
        float f2 = this.o;
        float f3 = this.p;
        int i4 = this.r + ((int) ((((i3 / (f2 / f3)) + this.s) / f3) + 0.5f));
        int i5 = this.f7317e;
        h(i5 + i5 + i3);
        int i6 = 0;
        while (true) {
            int i7 = this.f7317e;
            i2 = i7 + i7;
            int i8 = this.f7314b;
            if (i6 >= i2 * i8) {
                break;
            }
            this.f7320h[(i8 * i3) + i6] = 0;
            i6++;
        }
        this.q += i2;
        l();
        if (this.r > i4) {
            this.r = i4;
        }
        this.q = 0;
        this.t = 0;
        this.s = 0;
    }

    public final int f() {
        return this.r;
    }
}