package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellSignalStrengthCdmaWrapper.java */
/* loaded from: classes.dex */
public class q extends w {

    /* renamed from: d, reason: collision with root package name */
    public final int f13438d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13439e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13440f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13441g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13442h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13443i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13444j;

    public q(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11) {
        super(i2, i3, i4);
        this.f13438d = i5;
        this.f13439e = i6;
        this.f13440f = i7;
        this.f13441g = i8;
        this.f13442h = i9;
        this.f13443i = i10;
        this.f13444j = i11;
    }

    public String toString() {
        return "CellSignalStrengthCdmaWrapper{cdmaLevel=" + this.f13438d + ", cdmaDbm=" + this.f13439e + ", cdmaEcio=" + this.f13440f + ", evdoLevel=" + this.f13441g + ", evdoDbm=" + this.f13442h + ", evdoEcio=" + this.f13443i + ", evdoSnr=" + this.f13444j + ", level=" + this.a + ", asuLevel=" + this.f13468b + ", dbm=" + this.f13469c + CoreConstants.CURLY_RIGHT;
    }
}