package com.parizene.netmonitor.db.celllog.i;

import ch.qos.logback.core.CoreConstants;

/* compiled from: ClfEntity.java */
/* loaded from: classes.dex */
public class i {
    public String a;

    /* renamed from: b, reason: collision with root package name */
    public String f13112b;

    /* renamed from: c, reason: collision with root package name */
    public int f13113c;

    /* renamed from: d, reason: collision with root package name */
    public long f13114d;

    /* renamed from: e, reason: collision with root package name */
    public int f13115e;

    /* renamed from: f, reason: collision with root package name */
    public int f13116f;

    /* renamed from: g, reason: collision with root package name */
    public String f13117g;

    public i(String str, String str2, int i2, long j2, int i3, int i4, String str3) {
        this.a = str;
        this.f13112b = str2;
        this.f13113c = i2;
        this.f13114d = j2;
        this.f13115e = i3;
        this.f13116f = i4;
        this.f13117g = str3;
    }

    public String toString() {
        return "ClfEntity{mcc='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", mnc='" + this.f13112b + CoreConstants.SINGLE_QUOTE_CHAR + ", lac=" + this.f13113c + ", cid=" + this.f13114d + ", latitude=" + this.f13115e + ", longitude=" + this.f13116f + ", info='" + this.f13117g + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }

    public i(g.a.a.a.d dVar) {
        this.a = dVar.a(0);
        this.f13112b = dVar.a(1);
        this.f13113c = Integer.parseInt(dVar.a(2));
        this.f13114d = Long.parseLong(dVar.a(3));
        this.f13115e = Integer.parseInt(dVar.a(4));
        this.f13116f = Integer.parseInt(dVar.a(5));
        this.f13117g = dVar.a(6);
    }

    public i(String[] strArr) {
        this.a = strArr[0];
        this.f13112b = strArr[1];
        this.f13113c = Integer.parseInt(strArr[2]);
        this.f13114d = Long.parseLong(strArr[3]);
        this.f13115e = Integer.parseInt(strArr[4]);
        this.f13116f = Integer.parseInt(strArr[5]);
        this.f13117g = strArr[6];
    }
}