package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class xv2 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public int f10272b;

    /* renamed from: c, reason: collision with root package name */
    public int f10273c;

    /* renamed from: d, reason: collision with root package name */
    public long f10274d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f10275e;

    /* renamed from: f, reason: collision with root package name */
    private final o03 f10276f;

    /* renamed from: g, reason: collision with root package name */
    private final o03 f10277g;

    /* renamed from: h, reason: collision with root package name */
    private int f10278h;

    /* renamed from: i, reason: collision with root package name */
    private int f10279i;

    public xv2(o03 o03Var, o03 o03Var2, boolean z) {
        this.f10277g = o03Var;
        this.f10276f = o03Var2;
        this.f10275e = z;
        o03Var2.i(12);
        this.a = o03Var2.u();
        o03Var.i(12);
        this.f10279i = o03Var.u();
        f03.e(o03Var.r() == 1, "first_chunk must be 1");
        this.f10272b = -1;
    }

    public final boolean a() {
        int i2 = this.f10272b + 1;
        this.f10272b = i2;
        if (i2 == this.a) {
            return false;
        }
        this.f10274d = this.f10275e ? this.f10276f.v() : this.f10276f.p();
        if (this.f10272b == this.f10278h) {
            this.f10273c = this.f10277g.u();
            this.f10277g.j(4);
            int i3 = this.f10279i - 1;
            this.f10279i = i3;
            this.f10278h = i3 > 0 ? (-1) + this.f10277g.u() : -1;
        }
        return true;
    }
}