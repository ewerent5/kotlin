package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class vx {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9804b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9805c;

    private vx(int i2, int i3, int i4) {
        this.a = i2;
        this.f9805c = i3;
        this.f9804b = i4;
    }

    public static vx a(r93 r93Var) {
        return r93Var.f8618h ? new vx(3, 0, 0) : r93Var.f8623m ? new vx(2, 0, 0) : r93Var.f8622l ? b() : c(r93Var.f8620j, r93Var.f8617g);
    }

    public static vx b() {
        return new vx(0, 0, 0);
    }

    public static vx c(int i2, int i3) {
        return new vx(1, i2, i3);
    }

    public static vx d() {
        return new vx(4, 0, 0);
    }

    public static vx e() {
        return new vx(5, 0, 0);
    }

    public final boolean f() {
        return this.a == 2;
    }

    public final boolean g() {
        return this.a == 3;
    }

    public final boolean h() {
        return this.a == 0;
    }

    public final boolean i() {
        return this.a == 4;
    }

    public final boolean j() {
        return this.a == 5;
    }
}