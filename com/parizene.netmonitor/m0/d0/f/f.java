package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: CellIdentityTdscdmaWrapper.java */
/* loaded from: classes.dex */
public class f extends h {

    /* renamed from: c, reason: collision with root package name */
    public final int f13413c;

    /* renamed from: d, reason: collision with root package name */
    public final int f13414d;

    /* renamed from: e, reason: collision with root package name */
    public final int f13415e;

    /* renamed from: f, reason: collision with root package name */
    public final int f13416f;

    public f(String str, String str2, int i2, int i3, int i4, int i5) {
        super(str, str2);
        this.f13413c = i2;
        this.f13414d = i3;
        this.f13415e = i4;
        this.f13416f = i5;
    }

    public int a() {
        String str = this.a;
        if (str != null) {
            return Integer.parseInt(str);
        }
        return Integer.MAX_VALUE;
    }

    public int b() {
        String str = this.f13423b;
        if (str != null) {
            return Integer.parseInt(str);
        }
        return Integer.MAX_VALUE;
    }

    public String toString() {
        return "CellIdentityTdscdmaWrapper{lac=" + this.f13413c + ", cid=" + this.f13414d + ", cpid=" + this.f13415e + ", uarfcn=" + this.f13416f + ", mccStr='" + this.a + CoreConstants.SINGLE_QUOTE_CHAR + ", mncStr='" + this.f13423b + CoreConstants.SINGLE_QUOTE_CHAR + CoreConstants.CURLY_RIGHT;
    }
}