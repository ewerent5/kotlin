package com.google.android.gms.internal.ads;

import java.util.Arrays;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class sl2 {
    private static final sl2 a = new sl2(0, new int[0], new Object[0], false);

    /* renamed from: b, reason: collision with root package name */
    private int f8911b;

    /* renamed from: c, reason: collision with root package name */
    private int[] f8912c;

    /* renamed from: d, reason: collision with root package name */
    private Object[] f8913d;

    /* renamed from: e, reason: collision with root package name */
    private int f8914e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f8915f;

    private sl2() {
        this(0, new int[8], new Object[8], true);
    }

    private sl2(int i2, int[] iArr, Object[] objArr, boolean z) {
        this.f8914e = -1;
        this.f8911b = i2;
        this.f8912c = iArr;
        this.f8913d = objArr;
        this.f8915f = z;
    }

    public static sl2 a() {
        return a;
    }

    static sl2 b() {
        return new sl2(0, new int[8], new Object[8], true);
    }

    static sl2 c(sl2 sl2Var, sl2 sl2Var2) {
        int i2 = sl2Var.f8911b + sl2Var2.f8911b;
        int[] iArrCopyOf = Arrays.copyOf(sl2Var.f8912c, i2);
        System.arraycopy(sl2Var2.f8912c, 0, iArrCopyOf, sl2Var.f8911b, sl2Var2.f8911b);
        Object[] objArrCopyOf = Arrays.copyOf(sl2Var.f8913d, i2);
        System.arraycopy(sl2Var2.f8913d, 0, objArrCopyOf, sl2Var.f8911b, sl2Var2.f8911b);
        return new sl2(i2, iArrCopyOf, objArrCopyOf, true);
    }

    public final void d() {
        this.f8915f = false;
    }

    public final int e() {
        int i2 = this.f8914e;
        if (i2 != -1) {
            return i2;
        }
        int iA = 0;
        for (int i3 = 0; i3 < this.f8911b; i3++) {
            int i4 = this.f8912c[i3];
            ci2 ci2Var = (ci2) this.f8913d[i3];
            int iA2 = li2.A(8);
            int iA3 = li2.A(16);
            int iA4 = li2.A(i4 >>> 3);
            int iA5 = li2.A(24);
            int iL = ci2Var.l();
            iA += iA2 + iA2 + iA3 + iA4 + iA5 + li2.A(iL) + iL;
        }
        this.f8914e = iA;
        return iA;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof sl2)) {
            return false;
        }
        sl2 sl2Var = (sl2) obj;
        int i2 = this.f8911b;
        if (i2 == sl2Var.f8911b) {
            int[] iArr = this.f8912c;
            int[] iArr2 = sl2Var.f8912c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    Object[] objArr = this.f8913d;
                    Object[] objArr2 = sl2Var.f8913d;
                    int i4 = this.f8911b;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (objArr[i5].equals(objArr2[i5])) {
                        }
                    }
                    return true;
                }
                if (iArr[i3] != iArr2[i3]) {
                    break;
                }
                i3++;
            }
        }
        return false;
    }

    public final int f() {
        int iA;
        int iB;
        int iA2;
        int i2 = this.f8914e;
        if (i2 != -1) {
            return i2;
        }
        int iA3 = 0;
        for (int i3 = 0; i3 < this.f8911b; i3++) {
            int i4 = this.f8912c[i3];
            int i5 = i4 >>> 3;
            int i6 = i4 & 7;
            if (i6 != 0) {
                if (i6 == 1) {
                    ((Long) this.f8913d[i3]).longValue();
                    iA2 = li2.A(i5 << 3) + 8;
                } else if (i6 == 2) {
                    ci2 ci2Var = (ci2) this.f8913d[i3];
                    int iA4 = li2.A(i5 << 3);
                    int iL = ci2Var.l();
                    iA3 += iA4 + li2.A(iL) + iL;
                } else if (i6 == 3) {
                    int iY = li2.y(i5);
                    iA = iY + iY;
                    iB = ((sl2) this.f8913d[i3]).f();
                } else {
                    if (i6 != 5) {
                        throw new IllegalStateException(qj2.g());
                    }
                    ((Integer) this.f8913d[i3]).intValue();
                    iA2 = li2.A(i5 << 3) + 4;
                }
                iA3 += iA2;
            } else {
                long jLongValue = ((Long) this.f8913d[i3]).longValue();
                iA = li2.A(i5 << 3);
                iB = li2.B(jLongValue);
            }
            iA2 = iA + iB;
            iA3 += iA2;
        }
        this.f8914e = iA3;
        return iA3;
    }

    final void g(StringBuilder sb, int i2) {
        for (int i3 = 0; i3 < this.f8911b; i3++) {
            nk2.b(sb, i2, String.valueOf(this.f8912c[i3] >>> 3), this.f8913d[i3]);
        }
    }

    final void h(int i2, Object obj) {
        if (!this.f8915f) {
            throw new UnsupportedOperationException();
        }
        int i3 = this.f8911b;
        int[] iArr = this.f8912c;
        if (i3 == iArr.length) {
            int i4 = i3 + (i3 < 4 ? 8 : i3 >> 1);
            this.f8912c = Arrays.copyOf(iArr, i4);
            this.f8913d = Arrays.copyOf(this.f8913d, i4);
        }
        int[] iArr2 = this.f8912c;
        int i5 = this.f8911b;
        iArr2[i5] = i2;
        this.f8913d[i5] = obj;
        this.f8911b = i5 + 1;
    }

    public final int hashCode() {
        int i2 = this.f8911b;
        int i3 = (i2 + 527) * 31;
        int[] iArr = this.f8912c;
        int iHashCode = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i2; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i3 + i4) * 31;
        Object[] objArr = this.f8913d;
        int i7 = this.f8911b;
        for (int i8 = 0; i8 < i7; i8++) {
            iHashCode = (iHashCode * 31) + objArr[i8].hashCode();
        }
        return i6 + iHashCode;
    }

    public final void i(mi2 mi2Var) {
        if (this.f8911b != 0) {
            for (int i2 = 0; i2 < this.f8911b; i2++) {
                int i3 = this.f8912c[i2];
                Object obj = this.f8913d[i2];
                int i4 = i3 >>> 3;
                int i5 = i3 & 7;
                if (i5 == 0) {
                    mi2Var.n(i4, ((Long) obj).longValue());
                } else if (i5 == 1) {
                    mi2Var.u(i4, ((Long) obj).longValue());
                } else if (i5 == 2) {
                    mi2Var.y(i4, (ci2) obj);
                } else if (i5 == 3) {
                    mi2Var.E(i4);
                    ((sl2) obj).i(mi2Var);
                    mi2Var.F(i4);
                } else {
                    if (i5 != 5) {
                        throw new RuntimeException(qj2.g());
                    }
                    mi2Var.v(i4, ((Integer) obj).intValue());
                }
            }
        }
    }
}