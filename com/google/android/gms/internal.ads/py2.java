package com.google.android.gms.internal.ads;

import ch.qos.logback.classic.Level;
import java.io.EOFException;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class py2 implements kv2 {

    /* renamed from: e, reason: collision with root package name */
    private ny2 f8298e;

    /* renamed from: f, reason: collision with root package name */
    private ny2 f8299f;

    /* renamed from: g, reason: collision with root package name */
    private xs2 f8300g;

    /* renamed from: h, reason: collision with root package name */
    private xs2 f8301h;

    /* renamed from: i, reason: collision with root package name */
    private long f8302i;

    /* renamed from: k, reason: collision with root package name */
    private oy2 f8304k;

    /* renamed from: l, reason: collision with root package name */
    private final sz2 f8305l;
    private final my2 a = new my2();

    /* renamed from: b, reason: collision with root package name */
    private final ly2 f8295b = new ly2();

    /* renamed from: c, reason: collision with root package name */
    private final o03 f8296c = new o03(32);

    /* renamed from: d, reason: collision with root package name */
    private final AtomicInteger f8297d = new AtomicInteger();

    /* renamed from: j, reason: collision with root package name */
    private int f8303j = 65536;

    public py2(sz2 sz2Var, byte[] bArr) {
        this.f8305l = sz2Var;
        ny2 ny2Var = new ny2(0L, 65536);
        this.f8298e = ny2Var;
        this.f8299f = ny2Var;
    }

    private final void o(long j2, byte[] bArr, int i2) {
        p(j2);
        int i3 = 0;
        while (i3 < i2) {
            int i4 = (int) (j2 - this.f8298e.a);
            int iMin = Math.min(i2 - i3, 65536 - i4);
            mz2 mz2Var = this.f8298e.f7837d;
            System.arraycopy(mz2Var.a, i4, bArr, i3, iMin);
            j2 += iMin;
            i3 += iMin;
            if (j2 == this.f8298e.f7835b) {
                this.f8305l.d(mz2Var);
                ny2 ny2Var = this.f8298e;
                ny2Var.f7837d = null;
                this.f8298e = ny2Var.f7838e;
            }
        }
    }

    private final void p(long j2) {
        while (true) {
            ny2 ny2Var = this.f8298e;
            if (j2 < ny2Var.f7835b) {
                return;
            }
            this.f8305l.d(ny2Var.f7837d);
            ny2 ny2Var2 = this.f8298e;
            ny2Var2.f7837d = null;
            this.f8298e = ny2Var2.f7838e;
        }
    }

    private final boolean q() {
        return this.f8297d.compareAndSet(0, 1);
    }

    private final void r() {
        if (this.f8297d.compareAndSet(1, 0)) {
            return;
        }
        s();
    }

    private final void s() {
        this.a.a();
        ny2 ny2Var = this.f8298e;
        if (ny2Var.f7836c) {
            ny2 ny2Var2 = this.f8299f;
            boolean z = ny2Var2.f7836c;
            int i2 = (z ? 1 : 0) + (((int) (ny2Var2.a - ny2Var.a)) / 65536);
            mz2[] mz2VarArr = new mz2[i2];
            for (int i3 = 0; i3 < i2; i3++) {
                mz2VarArr[i3] = ny2Var.f7837d;
                ny2Var.f7837d = null;
                ny2Var = ny2Var.f7838e;
            }
            this.f8305l.e(mz2VarArr);
        }
        ny2 ny2Var3 = new ny2(0L, 65536);
        this.f8298e = ny2Var3;
        this.f8299f = ny2Var3;
        this.f8302i = 0L;
        this.f8303j = 65536;
        this.f8305l.f();
    }

    private final int t(int i2) {
        if (this.f8303j == 65536) {
            this.f8303j = 0;
            ny2 ny2Var = this.f8299f;
            if (ny2Var.f7836c) {
                this.f8299f = ny2Var.f7838e;
            }
            ny2 ny2Var2 = this.f8299f;
            mz2 mz2VarC = this.f8305l.c();
            ny2 ny2Var3 = new ny2(this.f8299f.f7835b, 65536);
            ny2Var2.f7837d = mz2VarC;
            ny2Var2.f7838e = ny2Var3;
            ny2Var2.f7836c = true;
        }
        return Math.min(i2, 65536 - this.f8303j);
    }

    @Override // com.google.android.gms.internal.ads.kv2
    public final void a(xs2 xs2Var) {
        xs2 xs2Var2 = xs2Var == null ? null : xs2Var;
        boolean zJ = this.a.j(xs2Var2);
        this.f8301h = xs2Var;
        oy2 oy2Var = this.f8304k;
        if (oy2Var == null || !zJ) {
            return;
        }
        oy2Var.j(xs2Var2);
    }

    @Override // com.google.android.gms.internal.ads.kv2
    public final void b(long j2, int i2, int i3, int i4, jv2 jv2Var) {
        if (!q()) {
            this.a.l(j2);
            return;
        }
        try {
            this.a.k(j2, i2, this.f8302i - i3, i3, jv2Var);
        } finally {
            r();
        }
    }

    @Override // com.google.android.gms.internal.ads.kv2
    public final void c(o03 o03Var, int i2) {
        if (!q()) {
            o03Var.j(i2);
            return;
        }
        while (i2 > 0) {
            int iT = t(i2);
            o03Var.k(this.f8299f.f7837d.a, this.f8303j, iT);
            this.f8303j += iT;
            this.f8302i += iT;
            i2 -= iT;
        }
        r();
    }

    @Override // com.google.android.gms.internal.ads.kv2
    public final int d(zu2 zu2Var, int i2, boolean z) throws InterruptedException, EOFException {
        if (!q()) {
            int iC = zu2Var.c(i2);
            if (iC != -1) {
                return iC;
            }
            throw new EOFException();
        }
        try {
            int iA = zu2Var.a(this.f8299f.f7837d.a, this.f8303j, t(i2));
            if (iA == -1) {
                throw new EOFException();
            }
            this.f8303j += iA;
            this.f8302i += iA;
            return iA;
        } finally {
            r();
        }
    }

    public final void e(boolean z) {
        int andSet = this.f8297d.getAndSet(true != z ? 2 : 0);
        s();
        this.a.b();
        if (andSet == 2) {
            this.f8300g = null;
        }
    }

    public final int f() {
        return this.a.c();
    }

    public final void g() {
        if (this.f8297d.getAndSet(2) == 0) {
            s();
        }
    }

    public final boolean h() {
        return this.a.d();
    }

    public final xs2 i() {
        return this.a.e();
    }

    public final long j() {
        return this.a.f();
    }

    public final void k() {
        long jH = this.a.h();
        if (jH != -1) {
            p(jH);
        }
    }

    public final boolean l(long j2, boolean z) {
        long jI = this.a.i(j2, z);
        if (jI == -1) {
            return false;
        }
        p(jI);
        return true;
    }

    public final int m(ys2 ys2Var, su2 su2Var, boolean z, boolean z2, long j2) {
        int iM;
        int iG = this.a.g(ys2Var, su2Var, z, z2, this.f8300g, this.f8295b);
        if (iG == -5) {
            this.f8300g = ys2Var.a;
            return -5;
        }
        if (iG != -4) {
            return -3;
        }
        if (!su2Var.c()) {
            if (su2Var.f8996d < j2) {
                su2Var.f(Level.ALL_INT);
            }
            if (su2Var.i()) {
                ly2 ly2Var = this.f8295b;
                long j3 = ly2Var.f7357b;
                this.f8296c.a(1);
                o(j3, this.f8296c.a, 1);
                long j4 = j3 + 1;
                byte b2 = this.f8296c.a[0];
                int i2 = b2 & 128;
                int i3 = b2 & 127;
                qu2 qu2Var = su2Var.f8994b;
                if (qu2Var.a == null) {
                    qu2Var.a = new byte[16];
                }
                o(j4, qu2Var.a, i3);
                long j5 = j4 + i3;
                if (i2 != 0) {
                    this.f8296c.a(2);
                    o(j5, this.f8296c.a, 2);
                    j5 += 2;
                    iM = this.f8296c.m();
                } else {
                    iM = 1;
                }
                qu2 qu2Var2 = su2Var.f8994b;
                int[] iArr = qu2Var2.f8477d;
                if (iArr == null || iArr.length < iM) {
                    iArr = new int[iM];
                }
                int[] iArr2 = iArr;
                int[] iArr3 = qu2Var2.f8478e;
                if (iArr3 == null || iArr3.length < iM) {
                    iArr3 = new int[iM];
                }
                int[] iArr4 = iArr3;
                if (i2 != 0) {
                    int i4 = iM * 6;
                    this.f8296c.a(i4);
                    o(j5, this.f8296c.a, i4);
                    j5 += i4;
                    this.f8296c.i(0);
                    for (int i5 = 0; i5 < iM; i5++) {
                        iArr2[i5] = this.f8296c.m();
                        iArr4[i5] = this.f8296c.u();
                    }
                } else {
                    iArr2[0] = 0;
                    iArr4[0] = ly2Var.a - ((int) (j5 - ly2Var.f7357b));
                }
                jv2 jv2Var = ly2Var.f7359d;
                qu2 qu2Var3 = su2Var.f8994b;
                qu2Var3.a(iM, iArr2, iArr4, jv2Var.f6861b, qu2Var3.a, 1);
                long j6 = ly2Var.f7357b;
                int i6 = (int) (j5 - j6);
                ly2Var.f7357b = j6 + i6;
                ly2Var.a -= i6;
            }
            su2Var.h(this.f8295b.a);
            ly2 ly2Var2 = this.f8295b;
            long j7 = ly2Var2.f7357b;
            ByteBuffer byteBuffer = su2Var.f8995c;
            int i7 = ly2Var2.a;
            p(j7);
            while (i7 > 0) {
                int i8 = (int) (j7 - this.f8298e.a);
                int iMin = Math.min(i7, 65536 - i8);
                mz2 mz2Var = this.f8298e.f7837d;
                byteBuffer.put(mz2Var.a, i8, iMin);
                j7 += iMin;
                i7 -= iMin;
                if (j7 == this.f8298e.f7835b) {
                    this.f8305l.d(mz2Var);
                    ny2 ny2Var = this.f8298e;
                    ny2Var.f7837d = null;
                    this.f8298e = ny2Var.f7838e;
                }
            }
            p(this.f8295b.f7358c);
        }
        return -4;
    }

    public final void n(oy2 oy2Var) {
        this.f8304k = oy2Var;
    }
}