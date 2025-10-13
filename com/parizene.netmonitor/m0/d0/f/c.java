package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellIdentityGsmWrapper.java */
/* loaded from: classes.dex */
public class c extends h {

    /* renamed from: c, reason: collision with root package name */
    public final int f13393c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13394d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13395e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13396f;

    /* renamed from: g, reason: collision with root package name */
    public final int f13397g;

    /* renamed from: h, reason: collision with root package name */
    public final int f13398h;

    /* renamed from: i, reason: collision with root package name */
    public final int f13399i;

    public c(String str, String str2, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        super(str, str2);
        this.f13393c = i2;
        this.f13394d = i3;
        this.f13395e = i4;
        this.f13396f = i5;
        this.f13397g = i6;
        this.f13398h = i7;
        this.f13399i = i8;
    }

    public String toString() {
        return "CellIdentityGsmWrapper{mcc=" + this.f13393c + ", mnc=" + this.f13394d + ", lac=" + this.f13395e + ", cid=" + this.f13396f + ", psc=" + this.f13397g + ", arfcn=" + this.f13398h + ", bsic=" + this.f13399i + ", mccStr='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", mncStr='" + this.f13423b + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}