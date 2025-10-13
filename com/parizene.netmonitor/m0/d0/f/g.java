package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellIdentityWcdmaWrapper.java */
/* loaded from: classes.dex */
public class g extends h {

    /* renamed from: c, reason: collision with root package name */
    public final int f13417c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13418d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13419e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13420f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13421g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13422h;

    public g(String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7) {
        super(str, str2);
        this.f13417c = i2;
        this.f13418d = i3;
        this.f13419e = i4;
        this.f13420f = i5;
        this.f13421g = i6;
        this.f13422h = i7;
    }

    public String toString() {
        return "CellIdentityWcdmaWrapper{mcc=" + this.f13417c + ", mnc=" + this.f13418d + ", lac=" + this.f13419e + ", cid=" + this.f13420f + ", psc=" + this.f13421g + ", uarfcn=" + this.f13422h + ", mccStr='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", mncStr='" + this.f13423b + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}