package com.parizene.netmonitor.m0.b0;

/* compiled from: MyCellIdentityLte.java */
/* loaded from: classes.dex */
public class g extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f13282b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13283c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13284d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13285e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13286f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13287g;

    public g(String str, String str2, int i2, int i3, int i4, int i5, int i6) {
        super(str);
        this.f13282b = str2;
        this.f13283c = i2;
        this.f13284d = i3;
        this.f13285e = i4;
        this.f13286f = i5;
        this.f13287g = i6;
    }

    public int a() {
        return this.f13284d >> 8;
    }

    public int b() {
        return this.f13284d & 255;
    }

    public boolean c() {
        return this.f13287g != Integer.MAX_VALUE;
    }

    public boolean d() {
        return this.f13284d != Integer.MAX_VALUE;
    }

    public boolean e() {
        return this.f13286f != Integer.MAX_VALUE;
    }

    @Override // com.parizene.netmonitor.m0.b0.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        g gVar = (g) obj;
        if (this.f13283c != gVar.f13283c || this.f13284d != gVar.f13284d || this.f13285e != gVar.f13285e || this.f13286f != gVar.f13286f || this.f13287g != gVar.f13287g) {
            return false;
        }
        String str = this.f13282b;
        String str2 = gVar.f13282b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public boolean f() {
        return this.f13285e != Integer.MAX_VALUE;
    }

    public boolean g() {
        return this.f13283c != Integer.MAX_VALUE;
    }

    @Override // com.parizene.netmonitor.m0.b0.d
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f13282b;
        return ((((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f13283c) * 31) + this.f13284d) * 31) + this.f13285e) * 31) + this.f13286f) * 31) + this.f13287g;
    }
}