package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: NeighboringCellInfoWrapper.java */
/* loaded from: classes.dex */
public class y {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13472b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13473c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13474d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13475e;

    public y(int i2, int i3, int i4, int i5, int i6) {
        this.a = i2;
        this.f13472b = i3;
        this.f13473c = i4;
        this.f13474d = i5;
        this.f13475e = i6;
    }

    public String toString() {
        return "NeighboringCellInfoWrapper{rssi=" + this.a + ", cid=" + this.f13472b + ", lac=" + this.f13473c + ", psc=" + this.f13474d + ", networkType=" + this.f13475e + CoreConstants.CURLY_RIGHT;
    }
}