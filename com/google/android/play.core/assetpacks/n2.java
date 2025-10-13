package com.google.android.play.core.assetpacks;

import android.content.Context;

/* loaded from: classes.dex */
public final class n2 implements e.c.b.d.a.b.h0<s2> {
    private final e.c.b.d.a.b.h0<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.d.a.b.h0<o> f12100b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.d.a.b.h0<h1> f12101c;

    public n2(e.c.b.d.a.b.h0<Context> h0Var, e.c.b.d.a.b.h0<o> h0Var2, e.c.b.d.a.b.h0<h1> h0Var3) {
        this.a = h0Var;
        this.f12100b = h0Var2;
        this.f12101c = h0Var3;
    }

    @Override // e.c.b.d.a.b.h0
    public final /* bridge */ /* synthetic */ s2 a() {
        s2 s2Var = (s2) (j2.b(((o2) this.a).a()) == null ? e.c.b.d.a.b.g0.c(this.f12100b).a() : e.c.b.d.a.b.g0.c(this.f12101c).a());
        e.c.b.d.a.b.s.d(s2Var);
        return s2Var;
    }
}