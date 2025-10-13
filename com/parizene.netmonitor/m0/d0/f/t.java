package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellSignalStrengthNrWrapper.java */
/* loaded from: classes.dex */
public class t extends w {

    /* renamed from: d, reason: collision with root package name */
    private int f13456d;

    /* renamed from: e, reason: collision with root package name */
    private int f13457e;

    /* renamed from: f, reason: collision with root package name */
    private int f13458f;

    /* renamed from: g, reason: collision with root package name */
    private int f13459g;

    /* renamed from: h, reason: collision with root package name */
    private int f13460h;

    /* renamed from: i, reason: collision with root package name */
    private int f13461i;

    public t(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10) {
        super(i2, i3, i4);
        this.f13456d = i5;
        this.f13457e = i6;
        this.f13458f = i7;
        this.f13459g = i8;
        this.f13460h = i9;
        this.f13461i = i10;
    }

    public String toString() {
        return "CellSignalStrengthNrWrapper{csiRsrp=" + this.f13456d + ", csiRsrq=" + this.f13457e + ", csiSinr=" + this.f13458f + ", ssRsrp=" + this.f13459g + ", ssRsrq=" + this.f13460h + ", ssSinr=" + this.f13461i + ", level=" + this.a + ", asuLevel=" + this.f13468b + ", dbm=" + this.f13469c + CoreConstants.CURLY_RIGHT;
    }
}