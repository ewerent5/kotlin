package com.parizene.netmonitor.m0.b0;

/* compiled from: MyCellIdentityGsm.java */
/* loaded from: classes.dex */
public class f extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f13277b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13278c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13279d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13280e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13281f;

    public f(String str, String str2, int i2, int i3, int i4, int i5) {
        super(str);
        this.f13277b = str2;
        this.f13278c = i2;
        this.f13279d = i3;
        this.f13280e = i4;
        this.f13281f = i5;
    }

    public boolean a() {
        return this.f13280e != Integer.MAX_VALUE;
    }

    public boolean b() {
        return this.f13281f != Integer.MAX_VALUE;
    }

    public boolean c() {
        return this.f13279d != Integer.MAX_VALUE;
    }

    public boolean d() {
        return this.f13278c != Integer.MAX_VALUE;
    }

    @Override // com.parizene.netmonitor.m0.b0.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || f.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        f fVar = (f) obj;
        if (this.f13278c != fVar.f13278c || this.f13279d != fVar.f13279d || this.f13280e != fVar.f13280e || this.f13281f != fVar.f13281f) {
            return false;
        }
        String str = this.f13277b;
        String str2 = fVar.f13277b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // com.parizene.netmonitor.m0.b0.d
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f13277b;
        return ((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f13278c) * 31) + this.f13279d) * 31) + this.f13280e) * 31) + this.f13281f;
    }
}