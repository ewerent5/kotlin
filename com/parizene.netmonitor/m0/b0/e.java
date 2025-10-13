package com.parizene.netmonitor.m0.b0;

/* compiled from: MyCellIdentityCdma.java */
/* loaded from: classes.dex */
public class e extends d {

    /* renamed from: b, reason: collision with root package name */
    public final int f13272b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13273c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13274d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13275e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13276f;

    public e(String str, int i2, int i3, int i4, int i5, int i6) {
        super(str);
        this.f13272b = i2;
        this.f13273c = i3;
        this.f13274d = i4;
        this.f13275e = i5;
        this.f13276f = i6;
    }

    public double a() {
        return this.f13275e / 1000000.0d;
    }

    public double b() {
        return this.f13276f / 1000000.0d;
    }

    public boolean c() {
        return this.f13274d != Integer.MAX_VALUE;
    }

    public boolean d() {
        return (this.f13275e == Integer.MAX_VALUE || this.f13276f == Integer.MAX_VALUE) ? false : true;
    }

    public boolean e() {
        return this.f13273c != Integer.MAX_VALUE;
    }

    @Override // com.parizene.netmonitor.m0.b0.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e) || !super.equals(obj)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f13272b == eVar.f13272b && this.f13273c == eVar.f13273c && this.f13274d == eVar.f13274d && this.f13275e == eVar.f13275e && this.f13276f == eVar.f13276f;
    }

    public boolean f() {
        return this.f13272b != Integer.MAX_VALUE;
    }

    @Override // com.parizene.netmonitor.m0.b0.d
    public int hashCode() {
        return (((((((((super.hashCode() * 31) + this.f13272b) * 31) + this.f13273c) * 31) + this.f13274d) * 31) + this.f13275e) * 31) + this.f13276f;
    }
}