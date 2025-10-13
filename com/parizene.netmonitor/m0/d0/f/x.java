package com.parizene.netmonitor.m0.d0.f;

import ch.qos.logback.core.CoreConstants;

/* compiled from: GsmCellLocationWrapper.java */
/* loaded from: classes.dex */
public class x extends p {
    public final int a;

    /* renamed from: b, reason: collision with root package name */
    public final int f13470b;

    /* renamed from: c, reason: collision with root package name */
    public final int f13471c;

    public x(int i2, int i3, int i4) {
        this.a = i2;
        this.f13470b = i3;
        this.f13471c = i4;
    }

    public String toString() {
        return "GsmCellLocationWrapper{lac=" + this.a + ", cid=" + this.f13470b + ", psc=" + this.f13471c + CoreConstants.CURLY_RIGHT;
    }
}