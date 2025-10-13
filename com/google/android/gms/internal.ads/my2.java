package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class my2 {

    /* renamed from: i, reason: collision with root package name */
    private int f7593i;

    /* renamed from: j, reason: collision with root package name */
    private int f7594j;

    /* renamed from: k, reason: collision with root package name */
    private int f7595k;

    /* renamed from: l, reason: collision with root package name */
    private int f7596l;
    private xs2 q;
    private int a = CoreConstants.MILLIS_IN_ONE_SECOND;

    /* renamed from: b, reason: collision with root package name */
    private int[] f7586b = new int[CoreConstants.MILLIS_IN_ONE_SECOND];

    /* renamed from: c, reason: collision with root package name */
    private long[] f7587c = new long[CoreConstants.MILLIS_IN_ONE_SECOND];

    /* renamed from: f, reason: collision with root package name */
    private long[] f7590f = new long[CoreConstants.MILLIS_IN_ONE_SECOND];

    /* renamed from: e, reason: collision with root package name */
    private int[] f7589e = new int[CoreConstants.MILLIS_IN_ONE_SECOND];

    /* renamed from: d, reason: collision with root package name */
    private int[] f7588d = new int[CoreConstants.MILLIS_IN_ONE_SECOND];

    /* renamed from: g, reason: collision with root package name */
    private jv2[] f7591g = new jv2[CoreConstants.MILLIS_IN_ONE_SECOND];

    /* renamed from: h, reason: collision with root package name */
    private xs2[] f7592h = new xs2[CoreConstants.MILLIS_IN_ONE_SECOND];

    /* renamed from: m, reason: collision with root package name */
    private long f7597m = Long.MIN_VALUE;
    private long n = Long.MIN_VALUE;
    private boolean p = true;
    private boolean o = true;

    public final void a() {
        this.f7594j = 0;
        this.f7595k = 0;
        this.f7596l = 0;
        this.f7593i = 0;
        this.o = true;
    }

    public final void b() {
        this.f7597m = Long.MIN_VALUE;
        this.n = Long.MIN_VALUE;
    }

    public final int c() {
        return this.f7594j + this.f7593i;
    }

    public final synchronized boolean d() {
        return this.f7593i != 0;
    }

    public final synchronized xs2 e() {
        if (this.p) {
            return null;
        }
        return this.q;
    }

    public final synchronized long f() {
        return Math.max(this.f7597m, this.n);
    }

    public final synchronized int g(ys2 ys2Var, su2 su2Var, boolean z, boolean z2, xs2 xs2Var, ly2 ly2Var) {
        if (!d()) {
            if (z2) {
                su2Var.e(4);
                return -4;
            }
            xs2 xs2Var2 = this.q;
            if (xs2Var2 == null || (!z && xs2Var2 == xs2Var)) {
                return -3;
            }
            ys2Var.a = xs2Var2;
            return -5;
        }
        if (!z) {
            xs2[] xs2VarArr = this.f7592h;
            int i2 = this.f7595k;
            if (xs2VarArr[i2] == xs2Var) {
                if (su2Var.f8995c == null) {
                    return -3;
                }
                su2Var.f8996d = this.f7590f[i2];
                su2Var.e(this.f7589e[i2]);
                int[] iArr = this.f7588d;
                int i3 = this.f7595k;
                ly2Var.a = iArr[i3];
                ly2Var.f7357b = this.f7587c[i3];
                ly2Var.f7359d = this.f7591g[i3];
                this.f7597m = Math.max(this.f7597m, su2Var.f8996d);
                int i4 = this.f7593i - 1;
                this.f7593i = i4;
                int i5 = this.f7595k + 1;
                this.f7595k = i5;
                this.f7594j++;
                if (i5 == this.a) {
                    this.f7595k = 0;
                    i5 = 0;
                }
                ly2Var.f7358c = i4 > 0 ? this.f7587c[i5] : ly2Var.f7357b + ly2Var.a;
                return -4;
            }
        }
        ys2Var.a = this.f7592h[this.f7595k];
        return -5;
    }

    public final synchronized long h() {
        if (!d()) {
            return -1L;
        }
        int i2 = this.f7595k;
        int i3 = this.f7593i;
        int i4 = i2 + i3;
        int i5 = this.a;
        int i6 = (i4 - 1) % i5;
        this.f7595k = i4 % i5;
        this.f7594j += i3;
        this.f7593i = 0;
        return this.f7587c[i6] + this.f7588d[i6];
    }

    public final synchronized long i(long j2, boolean z) {
        if (d()) {
            long[] jArr = this.f7590f;
            int i2 = this.f7595k;
            if (j2 >= jArr[i2]) {
                int i3 = 0;
                if (j2 > this.n && !z) {
                    return -1L;
                }
                int i4 = -1;
                while (i2 != this.f7596l && this.f7590f[i2] <= j2) {
                    if (1 == (this.f7589e[i2] & 1)) {
                        i4 = i3;
                    }
                    i2 = (i2 + 1) % this.a;
                    i3++;
                }
                if (i4 == -1) {
                    return -1L;
                }
                int i5 = (this.f7595k + i4) % this.a;
                this.f7595k = i5;
                this.f7594j += i4;
                this.f7593i -= i4;
                return this.f7587c[i5];
            }
        }
        return -1L;
    }

    public final synchronized boolean j(xs2 xs2Var) {
        if (xs2Var == null) {
            this.p = true;
            return false;
        }
        this.p = false;
        if (v03.a(xs2Var, this.q)) {
            return false;
        }
        this.q = xs2Var;
        return true;
    }

    public final synchronized void k(long j2, int i2, long j3, int i3, jv2 jv2Var) {
        if (this.o) {
            if ((i2 & 1) == 0) {
                return;
            } else {
                this.o = false;
            }
        }
        f03.d(!this.p);
        l(j2);
        long[] jArr = this.f7590f;
        int i4 = this.f7596l;
        jArr[i4] = j2;
        long[] jArr2 = this.f7587c;
        jArr2[i4] = j3;
        this.f7588d[i4] = i3;
        this.f7589e[i4] = i2;
        this.f7591g[i4] = jv2Var;
        this.f7592h[i4] = this.q;
        this.f7586b[i4] = 0;
        int i5 = this.f7593i + 1;
        this.f7593i = i5;
        int i6 = this.a;
        if (i5 != i6) {
            int i7 = i4 + 1;
            this.f7596l = i7;
            if (i7 == i6) {
                this.f7596l = 0;
                return;
            }
            return;
        }
        int i8 = i6 + CoreConstants.MILLIS_IN_ONE_SECOND;
        int[] iArr = new int[i8];
        long[] jArr3 = new long[i8];
        long[] jArr4 = new long[i8];
        int[] iArr2 = new int[i8];
        int[] iArr3 = new int[i8];
        jv2[] jv2VarArr = new jv2[i8];
        xs2[] xs2VarArr = new xs2[i8];
        int i9 = this.f7595k;
        int i10 = i6 - i9;
        System.arraycopy(jArr2, i9, jArr3, 0, i10);
        System.arraycopy(this.f7590f, this.f7595k, jArr4, 0, i10);
        System.arraycopy(this.f7589e, this.f7595k, iArr2, 0, i10);
        System.arraycopy(this.f7588d, this.f7595k, iArr3, 0, i10);
        System.arraycopy(this.f7591g, this.f7595k, jv2VarArr, 0, i10);
        System.arraycopy(this.f7592h, this.f7595k, xs2VarArr, 0, i10);
        System.arraycopy(this.f7586b, this.f7595k, iArr, 0, i10);
        int i11 = this.f7595k;
        System.arraycopy(this.f7587c, 0, jArr3, i10, i11);
        System.arraycopy(this.f7590f, 0, jArr4, i10, i11);
        System.arraycopy(this.f7589e, 0, iArr2, i10, i11);
        System.arraycopy(this.f7588d, 0, iArr3, i10, i11);
        System.arraycopy(this.f7591g, 0, jv2VarArr, i10, i11);
        System.arraycopy(this.f7592h, 0, xs2VarArr, i10, i11);
        System.arraycopy(this.f7586b, 0, iArr, i10, i11);
        this.f7587c = jArr3;
        this.f7590f = jArr4;
        this.f7589e = iArr2;
        this.f7588d = iArr3;
        this.f7591g = jv2VarArr;
        this.f7592h = xs2VarArr;
        this.f7586b = iArr;
        this.f7595k = 0;
        int i12 = this.a;
        this.f7596l = i12;
        this.f7593i = i12;
        this.a = i8;
    }

    public final synchronized void l(long j2) {
        this.n = Math.max(this.n, j2);
    }
}