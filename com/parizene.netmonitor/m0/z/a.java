package com.parizene.netmonitor.m0.z;

import ch.qos.logback.core.joran.action.Action;
import i.y.d.l;

/* compiled from: Band.kt */
/* loaded from: classes.dex */
public final class a {
    private final int a;

    /* renamed from: b, reason: collision with root package name */
    private final String f13539b;

    /* renamed from: c, reason: collision with root package name */
    private final i.a0.c f13540c;

    public a(int i2, String str, int i3, int i4) {
        l.d(str, Action.NAME_ATTRIBUTE);
        this.a = i2;
        this.f13539b = str;
        this.f13540c = new i.a0.c(i3, i4);
    }

    public final boolean a(int i2) {
        return this.f13540c.k(i2);
    }

    public final String b() {
        return this.f13539b;
    }

    public final int c() {
        return this.a;
    }
}