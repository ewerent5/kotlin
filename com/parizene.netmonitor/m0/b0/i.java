package com.parizene.netmonitor.m0.b0;

/* compiled from: MyCellIdentityTdscdma.java */
/* loaded from: classes.dex */
public class i extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f13293b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13294c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13295d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13296e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13297f;

    public i(String str, String str2, int i2, int i3, int i4, int i5) {
        super(str);
        this.f13293b = str2;
        this.f13294c = i2;
        this.f13295d = i3;
        this.f13296e = i4;
        this.f13297f = i5;
    }

    public boolean a() {
        return this.f13295d != Integer.MAX_VALUE;
    }

    public boolean b() {
        return this.f13296e != Integer.MAX_VALUE;
    }

    public boolean c() {
        return this.f13294c != Integer.MAX_VALUE;
    }

    public boolean d() {
        return this.f13297f != Integer.MAX_VALUE;
    }

    @Override // com.parizene.netmonitor.m0.b0.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || i.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        i iVar = (i) obj;
        if (this.f13294c != iVar.f13294c || this.f13295d != iVar.f13295d || this.f13296e != iVar.f13296e || this.f13297f != iVar.f13297f) {
            return false;
        }
        String str = this.f13293b;
        String str2 = iVar.f13293b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    @Override // com.parizene.netmonitor.m0.b0.d
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f13293b;
        return ((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f13294c) * 31) + this.f13295d) * 31) + this.f13296e) * 31) + this.f13297f;
    }
}