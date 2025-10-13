package com.parizene.netmonitor.ui.log;

import ch.qos.logback.core.CoreConstants;

/* compiled from: LogItem.kt */
/* loaded from: classes3.dex */
public final class g {
    private long a;

    /* renamed from: b, reason: collision with root package name */
    private boolean f13874b;

    /* renamed from: c, reason: collision with root package name */
    private String f13875c;

    /* renamed from: d, reason: collision with root package name */
    private String f13876d;

    /* renamed from: e, reason: collision with root package name */
    private int f13877e;

    /* renamed from: f, reason: collision with root package name */
    private long f13878f;

    /* renamed from: g, reason: collision with root package name */
    private int f13879g;

    /* renamed from: h, reason: collision with root package name */
    private int f13880h;

    /* renamed from: i, reason: collision with root package name */
    private int f13881i;

    /* renamed from: j, reason: collision with root package name */
    private int f13882j;

    /* renamed from: k, reason: collision with root package name */
    private int f13883k;

    /* renamed from: l, reason: collision with root package name */
    private int f13884l;

    /* renamed from: m, reason: collision with root package name */
    private long f13885m;
    private String n;

    public g(long j2, boolean z, String str, String str2, int i2, long j3, int i3, int i4, int i5, int i6, int i7, int i8, long j4, String str3) {
        i.y.d.l.d(str, "mcc");
        i.y.d.l.d(str2, "mnc");
        i.y.d.l.d(str3, "info");
        this.a = j2;
        this.f13874b = z;
        this.f13875c = str;
        this.f13876d = str2;
        this.f13877e = i2;
        this.f13878f = j3;
        this.f13879g = i3;
        this.f13880h = i4;
        this.f13881i = i5;
        this.f13882j = i6;
        this.f13883k = i7;
        this.f13884l = i8;
        this.f13885m = j4;
        this.n = str3;
    }

    public final int a() {
        return this.f13881i;
    }

    public final long b() {
        return this.f13878f;
    }

    public final long c() {
        return this.a;
    }

    public final String d() {
        return this.n;
    }

    public final int e() {
        return this.f13883k;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.a == gVar.a && this.f13874b == gVar.f13874b && i.y.d.l.a(this.f13875c, gVar.f13875c) && i.y.d.l.a(this.f13876d, gVar.f13876d) && this.f13877e == gVar.f13877e && this.f13878f == gVar.f13878f && this.f13879g == gVar.f13879g && this.f13880h == gVar.f13880h && this.f13881i == gVar.f13881i && this.f13882j == gVar.f13882j && this.f13883k == gVar.f13883k && this.f13884l == gVar.f13884l && this.f13885m == gVar.f13885m && i.y.d.l.a(this.n, gVar.n);
    }

    public final int f() {
        return this.f13877e;
    }

    public final long g() {
        return this.f13885m;
    }

    public final int h() {
        return this.f13882j;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public int hashCode() {
        int iA = com.parizene.netmonitor.m0.c0.e.a(this.a) * 31;
        boolean z = this.f13874b;
        int i2 = z;
        if (z != 0) {
            i2 = 1;
        }
        return ((((((((((((((((((((((((iA + i2) * 31) + this.f13875c.hashCode()) * 31) + this.f13876d.hashCode()) * 31) + this.f13877e) * 31) + com.parizene.netmonitor.m0.c0.e.a(this.f13878f)) * 31) + this.f13879g) * 31) + this.f13880h) * 31) + this.f13881i) * 31) + this.f13882j) * 31) + this.f13883k) * 31) + this.f13884l) * 31) + com.parizene.netmonitor.m0.c0.e.a(this.f13885m)) * 31) + this.n.hashCode();
    }

    public final String i() {
        return this.f13875c;
    }

    public final String j() {
        return this.f13876d;
    }

    public final int k() {
        return this.f13884l;
    }

    public final int l() {
        return this.f13880h;
    }

    public final int m() {
        return this.f13879g;
    }

    public final boolean n() {
        return this.f13874b;
    }

    public String toString() {
        return "LogItem(id=" + this.a + ", wasCurrent=" + this.f13874b + ", mcc=" + this.f13875c + ", mnc=" + this.f13876d + ", lac=" + this.f13877e + ", cid=" + this.f13878f + ", rnc=" + this.f13879g + ", psc=" + this.f13880h + ", channel=" + this.f13881i + ", locationSrc=" + this.f13882j + ", infoSrc=" + this.f13883k + ", networkType=" + this.f13884l + ", lastMentioned=" + this.f13885m + ", info=" + this.n + CoreConstants.RIGHT_PARENTHESIS_CHAR;
    }
}