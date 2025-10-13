package com.parizene.netmonitor.m0.b0;

/* compiled from: MyCellSignalStrengthLte.java */
/* loaded from: classes.dex */
public class u extends r {

    /* renamed from: b, reason: collision with root package name */
    public final int f13306b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13307c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13308d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13309e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13310f;

    public u(int i2, int i3, int i4, int i5, int i6, int i7) {
        super(i2);
        this.f13306b = i3;
        this.f13307c = i4;
        this.f13308d = i5;
        this.f13309e = i6;
        this.f13310f = i7;
    }

    public boolean b() {
        return this.f13309e != Integer.MAX_VALUE;
    }

    public boolean c() {
        return this.f13307c != Integer.MAX_VALUE;
    }

    public boolean d() {
        return this.f13308d != Integer.MAX_VALUE;
    }

    public boolean e() {
        return this.f13310f != Integer.MAX_VALUE;
    }

    @Override // com.parizene.netmonitor.m0.b0.r
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u) || !super.equals(obj)) {
            return false;
        }
        u uVar = (u) obj;
        return this.f13306b == uVar.f13306b && this.f13307c == uVar.f13307c && this.f13308d == uVar.f13308d && this.f13309e == uVar.f13309e && this.f13310f == uVar.f13310f;
    }

    @Override // com.parizene.netmonitor.m0.b0.r
    public int hashCode() {
        return (((((((((super.hashCode() * 31) + this.f13306b) * 31) + this.f13307c) * 31) + this.f13308d) * 31) + this.f13309e) * 31) + this.f13310f;
    }
}