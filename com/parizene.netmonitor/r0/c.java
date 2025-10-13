package com.parizene.netmonitor.r0;

import ch.qos.logback.core.CoreConstants;

/* compiled from: GeolocationCellData.java */
/* loaded from: classes3.dex */
public class c {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f13643b;

    /* renamed from: c, reason: collision with root package name */
    public int f13644c;

    /* renamed from: d, reason: collision with root package name */
    public long f13645d;

    public c(int i2, int i3, int i4, long j2) {
        this.a = i2;
        this.f13643b = i3;
        this.f13644c = i4;
        this.f13645d = j2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        c cVar = (c) obj;
        return this.a == cVar.a && this.f13643b == cVar.f13643b && this.f13644c == cVar.f13644c && this.f13645d == cVar.f13645d;
    }

    public int hashCode() {
        int i2 = ((((this.a * 31) + this.f13643b) * 31) + this.f13644c) * 31;
        long j2 = this.f13645d;
        return i2 + ((int) (j2 ^ (j2 >>> 32)));
    }

    public String toString() {
        return "GeolocationCellData{mcc=" + this.a + ", mnc=" + this.f13643b + ", lac=" + this.f13644c + ", cid=" + this.f13645d + CoreConstants.CURLY_RIGHT;
    }
}