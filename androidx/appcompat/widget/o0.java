package androidx.appcompat.widget;

import ch.qos.logback.classic.Level;

/* compiled from: RtlSpacingHelper.java */
/* loaded from: classes.dex */
class o0 {
    private int a = 0;

    /* renamed from: b, reason: collision with root package name */
    private int f527b = 0;

    /* renamed from: c, reason: collision with root package name */
    private int f528c = Level.ALL_INT;

    /* renamed from: d, reason: collision with root package name */
    private int f529d = Level.ALL_INT;

    /* renamed from: e, reason: collision with root package name */
    private int f530e = 0;

    /* renamed from: f, reason: collision with root package name */
    private int f531f = 0;

    /* renamed from: g, reason: collision with root package name */
    private boolean f532g = false;

    /* renamed from: h, reason: collision with root package name */
    private boolean f533h = false;

    o0() {
    }

    public int a() {
        return this.f532g ? this.a : this.f527b;
    }

    public int b() {
        return this.a;
    }

    public int c() {
        return this.f527b;
    }

    public int d() {
        return this.f532g ? this.f527b : this.a;
    }

    public void e(int i2, int i3) {
        this.f533h = false;
        if (i2 != Integer.MIN_VALUE) {
            this.f530e = i2;
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f531f = i3;
            this.f527b = i3;
        }
    }

    public void f(boolean z) {
        if (z == this.f532g) {
            return;
        }
        this.f532g = z;
        if (!this.f533h) {
            this.a = this.f530e;
            this.f527b = this.f531f;
            return;
        }
        if (z) {
            int i2 = this.f529d;
            if (i2 == Integer.MIN_VALUE) {
                i2 = this.f530e;
            }
            this.a = i2;
            int i3 = this.f528c;
            if (i3 == Integer.MIN_VALUE) {
                i3 = this.f531f;
            }
            this.f527b = i3;
            return;
        }
        int i4 = this.f528c;
        if (i4 == Integer.MIN_VALUE) {
            i4 = this.f530e;
        }
        this.a = i4;
        int i5 = this.f529d;
        if (i5 == Integer.MIN_VALUE) {
            i5 = this.f531f;
        }
        this.f527b = i5;
    }

    public void g(int i2, int i3) {
        this.f528c = i2;
        this.f529d = i3;
        this.f533h = true;
        if (this.f532g) {
            if (i3 != Integer.MIN_VALUE) {
                this.a = i3;
            }
            if (i2 != Integer.MIN_VALUE) {
                this.f527b = i2;
                return;
            }
            return;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.a = i2;
        }
        if (i3 != Integer.MIN_VALUE) {
            this.f527b = i3;
        }
    }
}