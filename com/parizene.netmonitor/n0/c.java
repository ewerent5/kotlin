package com.parizene.netmonitor.n0;

import android.text.TextUtils;

/* compiled from: ClfItem.java */
/* loaded from: classes.dex */
public class c {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f13563b;

    /* renamed from: c, reason: collision with root package name */
    private int f13564c;

    /* renamed from: d, reason: collision with root package name */
    private long f13565d;

    /* renamed from: e, reason: collision with root package name */
    private int f13566e;

    /* renamed from: f, reason: collision with root package name */
    private int f13567f;

    /* renamed from: g, reason: collision with root package name */
    private String f13568g;

    public c(String str, String str2, int i2, long j2, int i3, int i4, String str3) {
        this.a = str;
        this.f13563b = str2;
        this.f13564c = i2;
        this.f13565d = j2;
        this.f13566e = i3;
        this.f13567f = i4;
        this.f13568g = str3;
    }

    public long a() {
        return this.f13565d;
    }

    public String b() {
        return this.f13568g;
    }

    public String c() {
        String str = this.f13568g;
        return str != null ? str : "";
    }

    public int d() {
        return this.f13564c;
    }

    public int e() {
        return this.f13566e;
    }

    public String f() {
        int i2 = this.f13566e;
        return i2 != 0 ? String.valueOf(i2 / 1000000.0d) : "";
    }

    public int g() {
        return this.f13567f;
    }

    public String h() {
        int i2 = this.f13567f;
        return i2 != 0 ? String.valueOf(i2 / 1000000.0d) : "";
    }

    public String i() {
        return this.a;
    }

    public String j() {
        return this.f13563b;
    }

    public boolean k() {
        return !TextUtils.isEmpty(this.f13568g);
    }

    public boolean l() {
        return (this.f13566e == 0 || this.f13567f == 0) ? false : true;
    }
}