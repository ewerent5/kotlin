package com.google.android.gms.internal.ads;

import android.util.Log;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class rs2 {
    public final dy2 a;

    /* renamed from: b, reason: collision with root package name */
    public final Object f8723b;

    /* renamed from: c, reason: collision with root package name */
    public final int f8724c;

    /* renamed from: d, reason: collision with root package name */
    public final qy2[] f8725d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean[] f8726e;

    /* renamed from: f, reason: collision with root package name */
    public final long f8727f;

    /* renamed from: g, reason: collision with root package name */
    public int f8728g;

    /* renamed from: h, reason: collision with root package name */
    public long f8729h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f8730i;

    /* renamed from: j, reason: collision with root package name */
    public boolean f8731j;

    /* renamed from: k, reason: collision with root package name */
    public boolean f8732k;

    /* renamed from: l, reason: collision with root package name */
    public rs2 f8733l;

    /* renamed from: m, reason: collision with root package name */
    public lz2 f8734m;
    private final ct2[] n;
    private final dt2[] o;
    private final jz2 p;
    private final fy2 q;
    private lz2 r;
    private final iu s;

    public rs2(ct2[] ct2VarArr, dt2[] dt2VarArr, long j2, jz2 jz2Var, iu iuVar, fy2 fy2Var, Object obj, int i2, int i3, boolean z, long j3, byte[] bArr) {
        this.n = ct2VarArr;
        this.o = dt2VarArr;
        this.f8727f = j2;
        this.p = jz2Var;
        this.s = iuVar;
        this.q = fy2Var;
        Objects.requireNonNull(obj);
        this.f8723b = obj;
        this.f8724c = i2;
        this.f8728g = i3;
        this.f8730i = z;
        this.f8729h = j3;
        this.f8725d = new qy2[2];
        this.f8726e = new boolean[2];
        this.a = fy2Var.a(i3, iuVar.l());
    }

    public final boolean a() {
        return this.f8731j && (!this.f8732k || this.a.zzj() == Long.MIN_VALUE);
    }

    public final boolean b() {
        lz2 lz2VarA = this.p.a(this.o, this.a.zzg());
        lz2 lz2Var = this.r;
        if (lz2Var != null) {
            for (int i2 = 0; i2 < 2; i2++) {
                if (lz2VarA.a(lz2Var, i2)) {
                }
            }
            return false;
        }
        this.f8734m = lz2VarA;
        return true;
    }

    public final long c(long j2, boolean z) {
        return d(j2, false, new boolean[2]);
    }

    public final long d(long j2, boolean z, boolean[] zArr) {
        hz2 hz2Var = this.f8734m.f7376b;
        int i2 = 0;
        while (true) {
            boolean z2 = true;
            if (i2 >= 2) {
                break;
            }
            boolean[] zArr2 = this.f8726e;
            if (z || !this.f8734m.a(this.r, i2)) {
                z2 = false;
            }
            zArr2[i2] = z2;
            i2++;
        }
        long jE = this.a.e(hz2Var.b(), this.f8726e, this.f8725d, zArr, j2);
        this.r = this.f8734m;
        this.f8732k = false;
        int i3 = 0;
        while (true) {
            qy2[] qy2VarArr = this.f8725d;
            if (i3 >= 2) {
                this.s.b(this.n, this.f8734m.a, hz2Var);
                return jE;
            }
            if (qy2VarArr[i3] != null) {
                f03.d(hz2Var.a(i3) != null);
                this.f8732k = true;
            } else {
                f03.d(hz2Var.a(i3) == null);
            }
            i3++;
        }
    }

    public final void e() {
        try {
            this.q.d(this.a);
        } catch (RuntimeException e2) {
            Log.e("ExoPlayerImplInternal", "Period release failed.", e2);
        }
    }
}