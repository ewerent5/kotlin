package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellIdentityCdmaWrapper.java */
/* loaded from: classes.dex */
public class b extends h {

    /* renamed from: c, reason: collision with root package name */
    public final int f13388c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13389d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13390e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13391f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13392g;

    public b(String str, String str2, int i2, int i3, int i4, int i5, int i6) {
        super(str, str2);
        this.f13389d = i2;
        this.f13388c = i3;
        this.f13390e = i4;
        this.f13392g = i5;
        this.f13391f = i6;
    }

    public String toString() {
        return "CellIdentityCdmaWrapper{networkId=" + this.f13389d + ", systemId=" + this.f13388c + ", baseStationId=" + this.f13390e + ", longitude=" + this.f13392g + ", latitude=" + this.f13391f + ", mccStr='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", mncStr='" + this.f13423b + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}