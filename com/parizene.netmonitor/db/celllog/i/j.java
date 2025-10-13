package com.parizene.netmonitor.db.celllog.i;

import ch.qos.logback.core.CoreConstants;

/* compiled from: GeolocationEntity.java */
/* loaded from: classes.dex */
public class j {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f13118b;

    /* renamed from: c, reason: collision with root package name */
    public int f13119c;

    /* renamed from: d, reason: collision with root package name */
    public long f13120d;

    /* renamed from: e, reason: collision with root package name */
    public int f13121e;

    /* renamed from: f, reason: collision with root package name */
    public int f13122f;

    /* renamed from: g, reason: collision with root package name */
    public int f13123g;

    /* renamed from: h, reason: collision with root package name */
    public String f13124h;

    /* renamed from: i, reason: collision with root package name */
    public int f13125i;

    /* renamed from: j, reason: collision with root package name */
    public long f13126j;

    /* renamed from: k, reason: collision with root package name */
    public int f13127k;

    public j(int i2, int i3, int i4, long j2, int i5, int i6, int i7, String str, int i8, long j3, int i9) {
        this.a = i2;
        this.f13118b = i3;
        this.f13119c = i4;
        this.f13120d = j2;
        this.f13121e = i5;
        this.f13122f = i6;
        this.f13123g = i7;
        this.f13124h = str;
        this.f13125i = i8;
        this.f13126j = j3;
        this.f13127k = i9;
    }

    public String toString() {
        return "GeolocationEntity{mcc=" + this.a + ", mnc=" + this.f13118b + ", lac=" + this.f13119c + ", cid=" + this.f13120d + ", latitude=" + this.f13121e + ", longitude=" + this.f13122f + ", accuracy=" + this.f13123g + ", info='" + this.f13124h + CoreConstants.SINGLE_QUOTE_CHAR + ", status=" + this.f13125i + ", timestamp=" + this.f13126j + ", source=" + this.f13127k + CoreConstants.CURLY_RIGHT;
    }

    public j(g.a.a.a.d dVar) {
        this.a = Integer.parseInt(dVar.a(0));
        this.f13118b = Integer.parseInt(dVar.a(1));
        this.f13119c = Integer.parseInt(dVar.a(2));
        this.f13120d = Long.parseLong(dVar.a(3));
        this.f13121e = Integer.parseInt(dVar.a(4));
        this.f13122f = Integer.parseInt(dVar.a(5));
        this.f13123g = Integer.parseInt(dVar.a(6));
        this.f13124h = dVar.a(7);
        this.f13125i = Integer.parseInt(dVar.a(8));
        this.f13126j = Long.parseLong(dVar.a(9));
        if (dVar.b() >= 11) {
            this.f13127k = Integer.parseInt(dVar.a(10));
        } else {
            this.f13127k = 0;
        }
    }

    public j(String[] strArr) {
        this.a = Integer.parseInt(strArr[0]);
        this.f13118b = Integer.parseInt(strArr[1]);
        this.f13119c = Integer.parseInt(strArr[2]);
        this.f13120d = Long.parseLong(strArr[3]);
        this.f13121e = Integer.parseInt(strArr[4]);
        this.f13122f = Integer.parseInt(strArr[5]);
        this.f13123g = Integer.parseInt(strArr[6]);
        this.f13124h = strArr[7];
        this.f13125i = Integer.parseInt(strArr[8]);
        this.f13126j = Long.parseLong(strArr[9]);
        if (strArr.length >= 11) {
            this.f13127k = Integer.parseInt(strArr[10]);
        } else {
            this.f13127k = 0;
        }
    }
}