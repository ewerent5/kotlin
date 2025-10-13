package com.parizene.netmonitor.m0.b0;

import okhttp3.internal.http2.Settings;

/* compiled from: MyCellIdentityWcdma.java */
/* loaded from: classes.dex */
public class j extends d {

    /* renamed from: b, reason: collision with root package name */
    public final String f13298b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13299c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13300d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13301e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13302f;

    public j(String str, String str2, int i2, int i3, int i4, int i5) {
        super(str);
        this.f13298b = str2;
        this.f13299c = i2;
        this.f13300d = i3;
        this.f13301e = i4;
        this.f13302f = i5;
    }

    public int a() {
        return this.f13300d >> 16;
    }

    public int b() {
        return this.f13300d & Settings.DEFAULT_INITIAL_WINDOW_SIZE;
    }

    public boolean c() {
        return this.f13300d != Integer.MAX_VALUE;
    }

    public boolean d() {
        return this.f13299c != Integer.MAX_VALUE;
    }

    public boolean e() {
        return this.f13301e != Integer.MAX_VALUE;
    }

    @Override // com.parizene.netmonitor.m0.b0.d
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || j.class != obj.getClass() || !super.equals(obj)) {
            return false;
        }
        j jVar = (j) obj;
        if (this.f13299c != jVar.f13299c || this.f13300d != jVar.f13300d || this.f13301e != jVar.f13301e || this.f13302f != jVar.f13302f) {
            return false;
        }
        String str = this.f13298b;
        String str2 = jVar.f13298b;
        return str != null ? str.equals(str2) : str2 == null;
    }

    public boolean f() {
        return c() && this.f13300d > 65535;
    }

    public boolean g() {
        return this.f13302f != Integer.MAX_VALUE;
    }

    @Override // com.parizene.netmonitor.m0.b0.d
    public int hashCode() {
        int iHashCode = super.hashCode() * 31;
        String str = this.f13298b;
        return ((((((((iHashCode + (str != null ? str.hashCode() : 0)) * 31) + this.f13299c) * 31) + this.f13300d) * 31) + this.f13301e) * 31) + this.f13302f;
    }
}