package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;
import java.util.Arrays;

/* compiled from: ServiceStateWrapper.java */
/* loaded from: classes.dex */
public class z {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f13476b;

    /* renamed from: c, reason: collision with root package name */
    public final String f13477c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f13478d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13479e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13480f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13481g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13482h;

    /* renamed from: i, reason: collision with root package name */
    public final int[] f13483i;

    public z(String str, String str2, String str3, boolean z, int i2, int i3, int i4, int i5, int[] iArr) {
        this.a = str;
        this.f13476b = str2;
        this.f13477c = str3;
        this.f13478d = z;
        this.f13479e = i2;
        this.f13480f = i3;
        this.f13481g = i4;
        this.f13482h = i5;
        this.f13483i = iArr;
    }

    public String toString() {
        return "ServiceStateWrapper{operatorAlphaLong='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", operatorAlphaShort='" + this.f13476b + CoreConstants.SINGLE_QUOTE_CHAR + ", operatorNumeric='" + this.f13477c + CoreConstants.SINGLE_QUOTE_CHAR + ", isRoaming=" + this.f13478d + ", state=" + this.f13479e + ", voiceRegState=" + this.f13480f + ", dataRegState=" + this.f13481g + ", channelNumber=" + this.f13482h + ", cellBandwidths=" + Arrays.toString(this.f13483i) + CoreConstants.CURLY_RIGHT;
    }
}