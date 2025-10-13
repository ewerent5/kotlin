package com.parizene.netmonitor.m0.b0;

/* compiled from: MyCellIdentityNr.java */
/* loaded from: classes.dex */
public class h extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f13288b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13289c;

    /* renamed from: d, reason: collision with root package name */
    public final long f13290d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13291e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13292f;

    public h(String str, String str2, int i2, long j2, int i3, int i4) {
        super(str);
        this.f13288b = str2;
        this.f13289c = i2;
        this.f13290d = j2;
        this.f13291e = i3;
        this.f13292f = i4;
    }

    public boolean a() {
        return this.f13290d != 2147483647L;
    }

    public boolean b() {
        return this.f13292f != Integer.MAX_VALUE;
    }

    public boolean c() {
        return this.f13291e != Integer.MAX_VALUE;
    }

    public boolean d() {
        return this.f13289c != Integer.MAX_VALUE;
    }

    @Override // com.parizene.netmonitor.m0.b0.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        h hVar = (h) obj;
        if (this.f13289c != hVar.f13289c || this.f13290d != hVar.f13290d || this.f13291e != hVar.f13291e || this.f13292f != hVar.f13292f) {
            return false;
        }
        String str = this.f13288b;
        String str2 = hVar.f13288b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // com.parizene.netmonitor.m0.b0.d
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f13288b;
        int iHashCode2 = (((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f13289c) * 31;
        long j2 = this.f13290d;
        return ((((iHashCode2 + ((int) (j2 ^ (j2 >>> 32)))) * 31) + this.f13291e) * 31) + this.f13292f;
    }
}