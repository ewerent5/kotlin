package com.parizene.netmonitor.db.celllog.i;

import ch.qos.logback.core.CoreConstants;

/* compiled from: LogEntity.java */
/* loaded from: classes.dex */
public class l {
    public long a;

    /* renamed from: b, reason: collision with root package name */
    public long f13128b;

    /* renamed from: c, reason: collision with root package name */
    public g f13129c;

    /* renamed from: d, reason: collision with root package name */
    public int f13130d;

    /* renamed from: e, reason: collision with root package name */
    public int f13131e;

    /* renamed from: f, reason: collision with root package name */
    public int f13132f;

    /* renamed from: g, reason: collision with root package name */
    public int f13133g;

    /* renamed from: h, reason: collision with root package name */
    public long f13134h;

    public l(long j2, g gVar, int i2, int i3, int i4, int i5, long j3) {
        this.f13128b = j2;
        this.f13129c = gVar;
        this.f13130d = i2;
        this.f13131e = i3;
        this.f13132f = i4;
        this.f13133g = i5;
        this.f13134h = j3;
    }

    public String toString() {
        return "LogEntity{_id=" + this.a + ", cellId=" + this.f13128b + ", changeType=" + this.f13129c + ", dbm=" + this.f13130d + ", gpsLat=" + this.f13131e + ", gpsLon=" + this.f13132f + ", gpsAcc=" + this.f13133g + ", timestamp=" + this.f13134h + CoreConstants.CURLY_RIGHT;
    }
}