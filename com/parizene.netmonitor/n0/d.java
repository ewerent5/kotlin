package com.parizene.netmonitor.n0;

/* compiled from: ClfLogItem.java */
/* loaded from: classes.dex */
public class d {
    private String a;

    /* renamed from: b, reason: collision with root package name */
    private String f13569b;

    /* renamed from: c, reason: collision with root package name */
    private long f13570c;

    /* renamed from: d, reason: collision with root package name */
    private int f13571d;

    /* renamed from: e, reason: collision with root package name */
    private String f13572e;

    /* renamed from: f, reason: collision with root package name */
    private String f13573f;

    /* renamed from: g, reason: collision with root package name */
    private String f13574g;

    /* renamed from: h, reason: collision with root package name */
    private double f13575h;

    /* renamed from: i, reason: collision with root package name */
    private double f13576i;

    /* renamed from: k, reason: collision with root package name */
    private int f13578k;

    /* renamed from: m, reason: collision with root package name */
    private String f13580m;

    /* renamed from: j, reason: collision with root package name */
    private String f13577j = "-";

    /* renamed from: l, reason: collision with root package name */
    private String f13579l = "-";

    public d(String str, String str2, long j2, int i2, String str3, String str4, String str5, double d2, double d3, int i3, String str6) {
        this.a = str;
        this.f13569b = str2;
        this.f13570c = j2;
        this.f13571d = i2;
        this.f13572e = str3;
        this.f13573f = str4;
        this.f13574g = str5;
        this.f13575h = d2;
        this.f13576i = d3;
        this.f13578k = i3;
        this.f13580m = str6;
    }

    public String a() {
        return String.format("%s\t%s\t%d\t%d\t%s\t%s\t%s\t%+.6f\t%+.6f\t%s\t%d\t%s\t%s", this.a, this.f13569b, Long.valueOf(this.f13570c), Integer.valueOf(this.f13571d), this.f13572e, this.f13573f, this.f13574g, Double.valueOf(this.f13575h), Double.valueOf(this.f13576i), this.f13577j, Integer.valueOf(this.f13578k), this.f13579l, this.f13580m);
    }
}