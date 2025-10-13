package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellSignalStrengthGsmWrapper.java */
/* loaded from: classes.dex */
public class r extends w {

    /* renamed from: d, reason: collision with root package name */
    public final int f13445d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13446e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13447f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13448g;

    public r(int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(i2, i3, i4);
        this.f13445d = i5;
        this.f13446e = i6;
        this.f13447f = i7;
        this.f13448g = i8;
    }

    public String toString() {
        return "CellSignalStrengthGsmWrapper{signalStrength=" + this.f13445d + ", rssi=" + this.f13446e + ", bitErrorRate=" + this.f13447f + ", timingAdvance=" + this.f13448g + ", level=" + this.a + ", asuLevel=" + this.f13468b + ", dbm=" + this.f13469c + CoreConstants.CURLY_RIGHT;
    }
}