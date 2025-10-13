package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellSignalStrengthWcdmaWrapper.java */
/* loaded from: classes.dex */
public class v extends w {

    /* renamed from: d, reason: collision with root package name */
    public final int f13463d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13464e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13465f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13466g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13467h;

    public v(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9) {
        super(i2, i3, i4);
        this.f13463d = i5;
        this.f13464e = i6;
        this.f13465f = i7;
        this.f13466g = i8;
        this.f13467h = i9;
    }

    public String toString() {
        return "CellSignalStrengthWcdmaWrapper{signalStrength=" + this.f13463d + ", rssi=" + this.f13464e + ", bitErrorRate=" + this.f13465f + ", rscp=" + this.f13466g + ", ecNo=" + this.f13467h + ", level=" + this.a + ", asuLevel=" + this.f13468b + ", dbm=" + this.f13469c + CoreConstants.CURLY_RIGHT;
    }
}