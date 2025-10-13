package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class hs2 implements ct2, dt2 {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private ft2 f6373b;

    /* renamed from: c, reason: collision with root package name */
    private int f6374c;

    /* renamed from: d, reason: collision with root package name */
    private int f6375d;

    /* renamed from: e, reason: collision with root package name */
    private qy2 f6376e;

    /* renamed from: f, reason: collision with root package name */
    private long f6377f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6378g = true;

    /* renamed from: h, reason: collision with root package name */
    private boolean f6379h;

    public hs2(int i2) {
        this.a = i2;
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final void a() {
        f03.d(this.f6375d == 2);
        this.f6375d = 1;
        s();
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final void c(xs2[] xs2VarArr, qy2 qy2Var, long j2) {
        f03.d(!this.f6379h);
        this.f6376e = qy2Var;
        this.f6378g = false;
        this.f6377f = j2;
        o(xs2VarArr, j2);
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final void d(long j2) {
        this.f6379h = false;
        this.f6378g = false;
        q(j2, false);
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final void g(int i2) {
        this.f6374c = i2;
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final void h(ft2 ft2Var, xs2[] xs2VarArr, qy2 qy2Var, long j2, boolean z, long j3) {
        f03.d(this.f6375d == 0);
        this.f6373b = ft2Var;
        this.f6375d = 1;
        n(z);
        c(xs2VarArr, qy2Var, j3);
        q(j2, z);
    }

    protected final int k(ys2 ys2Var, su2 su2Var, boolean z) {
        int iB = this.f6376e.b(ys2Var, su2Var, z);
        if (iB == -4) {
            if (su2Var.c()) {
                this.f6378g = true;
                return this.f6379h ? -4 : -3;
            }
            su2Var.f8996d += this.f6377f;
        } else if (iB == -5) {
            xs2 xs2Var = ys2Var.a;
            long j2 = xs2Var.A;
            if (j2 != Long.MAX_VALUE) {
                ys2Var.a = new xs2(xs2Var.f10245e, xs2Var.f10249i, xs2Var.f10250j, xs2Var.f10247g, xs2Var.f10246f, xs2Var.f10251k, xs2Var.n, xs2Var.o, xs2Var.p, xs2Var.q, xs2Var.r, xs2Var.t, xs2Var.s, xs2Var.u, xs2Var.v, xs2Var.w, xs2Var.x, xs2Var.y, xs2Var.z, xs2Var.B, xs2Var.C, xs2Var.D, j2 + this.f6377f, xs2Var.f10252l, xs2Var.f10253m, xs2Var.f10248h);
                return -5;
            }
        }
        return iB;
    }

    protected final void l(long j2) {
        this.f6376e.a(j2 - this.f6377f);
    }

    protected final boolean m() {
        return this.f6378g ? this.f6379h : this.f6376e.zza();
    }

    protected abstract void n(boolean z);

    protected void o(xs2[] xs2VarArr, long j2) {
    }

    protected abstract void q(long j2, boolean z);

    protected abstract void r();

    protected abstract void s();

    protected abstract void t();

    protected final ft2 u() {
        return this.f6373b;
    }

    protected final int v() {
        return this.f6374c;
    }

    @Override // com.google.android.gms.internal.ads.ct2, com.google.android.gms.internal.ads.dt2
    public final int zza() {
        return this.a;
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final dt2 zzb() {
        return this;
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public j03 zzd() {
        return null;
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final int zze() {
        return this.f6375d;
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final void zzg() {
        f03.d(this.f6375d == 1);
        this.f6375d = 2;
        r();
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final qy2 zzi() {
        return this.f6376e;
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final boolean zzj() {
        return this.f6378g;
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final void zzk() {
        this.f6379h = true;
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final boolean zzl() {
        return this.f6379h;
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final void zzm() {
        this.f6376e.zzb();
    }

    @Override // com.google.android.gms.internal.ads.ct2
    public final void zzp() {
        f03.d(this.f6375d == 1);
        this.f6375d = 0;
        this.f6376e = null;
        this.f6379h = false;
        t();
    }
}