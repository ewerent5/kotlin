package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class iu {
    private final sz2 a = new sz2(true, 65536);

    /* renamed from: b, reason: collision with root package name */
    private long f6601b = 15000000;

    /* renamed from: c, reason: collision with root package name */
    private long f6602c = 30000000;

    /* renamed from: d, reason: collision with root package name */
    private long f6603d = 2500000;

    /* renamed from: e, reason: collision with root package name */
    private long f6604e = 5000000;

    /* renamed from: f, reason: collision with root package name */
    private int f6605f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6606g;

    iu() {
    }

    public final void a() {
        k(false);
    }

    public final void b(ct2[] ct2VarArr, vy2 vy2Var, hz2 hz2Var) {
        this.f6605f = 0;
        for (int i2 = 0; i2 < 2; i2++) {
            if (hz2Var.a(i2) != null) {
                this.f6605f += v03.q(ct2VarArr[i2].zza());
            }
        }
        this.a.b(this.f6605f);
    }

    public final void c() {
        k(true);
    }

    public final void d() {
        k(true);
    }

    public final synchronized boolean e(long j2, boolean z) {
        long j3;
        j3 = z ? this.f6604e : this.f6603d;
        return j3 <= 0 || j2 >= j3;
    }

    public final synchronized boolean f(long j2) {
        boolean z;
        z = true;
        char c2 = j2 > this.f6602c ? (char) 0 : j2 < this.f6601b ? (char) 2 : (char) 1;
        int iG = this.a.g();
        int i2 = this.f6605f;
        if (c2 != 2 && (c2 != 1 || !this.f6606g || iG >= i2)) {
            z = false;
        }
        this.f6606g = z;
        return z;
    }

    public final synchronized void g(int i2) {
        this.f6601b = i2 * 1000;
    }

    public final synchronized void h(int i2) {
        this.f6602c = i2 * 1000;
    }

    public final synchronized void i(int i2) {
        this.f6603d = i2 * 1000;
    }

    public final synchronized void j(int i2) {
        this.f6604e = i2 * 1000;
    }

    final void k(boolean z) {
        this.f6605f = 0;
        this.f6606g = false;
        if (z) {
            this.a.a();
        }
    }

    public final sz2 l() {
        return this.a;
    }
}