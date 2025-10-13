package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellSignalStrengthLteWrapper.java */
/* loaded from: classes.dex */
public class s extends w {

    /* renamed from: d, reason: collision with root package name */
    public final int f13449d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13450e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13451f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13452g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13453h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13454i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13455j;

    public s(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        super(i2, i3, i4);
        this.f13449d = i5;
        this.f13450e = i6;
        this.f13451f = i7;
        this.f13452g = i8;
        this.f13453h = i9;
        this.f13454i = i10;
        this.f13455j = i11;
    }

    public String toString() {
        return "CellSignalStrengthLteWrapper{signalStrength=" + this.f13449d + ", rssi=" + this.f13450e + ", rsrp=" + this.f13451f + ", rsrq=" + this.f13452g + ", rssnr=" + this.f13453h + ", cqi=" + this.f13454i + ", timingAdvance=" + this.f13455j + ", level=" + this.a + ", asuLevel=" + this.f13468b + ", dbm=" + this.f13469c + CoreConstants.CURLY_RIGHT;
    }
}