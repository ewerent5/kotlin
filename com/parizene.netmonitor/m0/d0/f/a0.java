package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: SignalStrengthWrapper.java */
/* loaded from: classes.dex */
public class a0 {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13376b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13377c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13378d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13379e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13380f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13381g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13382h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13383i;

    /* renamed from: j, reason: collision with root package name */
    public final int f13384j;

    /* renamed from: k, reason: collision with root package name */
    public final int f13385k;

    /* renamed from: l, reason: collision with root package name */
    public final int f13386l;

    /* renamed from: m, reason: collision with root package name */
    public final int f13387m;
    public final int n;
    public final int o;
    public final boolean p;
    public final int q;
    public final int r;
    public final int s;
    public final int t;
    public final long u;

    public a0(int i2, int i3, int i4, int i5, int i6, int i7, int i8, int i9, int i10, int i11, int i12, int i13, int i14, int i15, int i16, boolean z, int i17, int i18, int i19, int i20, long j2) {
        this.a = i2;
        this.f13376b = i3;
        this.f13377c = i4;
        this.f13378d = i5;
        this.f13379e = i6;
        this.f13380f = i7;
        this.f13381g = i8;
        this.f13382h = i9;
        this.f13383i = i10;
        this.f13384j = i11;
        this.f13385k = i12;
        this.f13386l = i13;
        this.f13387m = i14;
        this.n = i15;
        this.o = i16;
        this.p = z;
        this.q = i17;
        this.r = i18;
        this.s = i19;
        this.t = i20;
        this.u = j2;
    }

    public String toString() {
        return "SignalStrengthWrapper{gsmSignalStrength=" + this.a + ", gsmBitErrorRate=" + this.f13376b + ", cdmaDbm=" + this.f13377c + ", cdmaEcio=" + this.f13378d + ", evdoDbm=" + this.f13379e + ", evdoEcio=" + this.f13380f + ", evdoSnr=" + this.f13381g + ", lteSignalStrength=" + this.f13382h + ", lteRsrp=" + this.f13383i + ", lteRsrq=" + this.f13384j + ", lteRssnr=" + this.f13385k + ", lteCqi=" + this.f13386l + ", lteRsrpBoost=" + this.f13387m + ", tdScdmaRscp=" + this.n + ", wcdmaRscp=" + this.o + ", isGsm=" + this.p + ", dbm=" + this.q + ", gsmDbm=" + this.r + ", lteDbm=" + this.s + ", tdScdmaDbm=" + this.t + ", timestampMillis=" + this.u + CoreConstants.CURLY_RIGHT;
    }
}