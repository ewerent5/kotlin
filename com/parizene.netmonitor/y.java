package com.parizene.netmonitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;

/* compiled from: NetmonitorManager_Factory.java */
/* loaded from: classes.dex */
public final class y implements f.c.c<x> {
    private final h.a.a<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<org.greenrobot.eventbus.c> f14090b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<SharedPreferences> f14091c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.db.celllog.b> f14092d;

    /* renamed from: e, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.d> f14093e;

    /* renamed from: f, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.s0.d.c> f14094f;

    /* renamed from: g, reason: collision with root package name */
    private final h.a.a<Handler> f14095g;

    /* renamed from: h, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.e> f14096h;

    /* renamed from: i, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.e> f14097i;

    /* renamed from: j, reason: collision with root package name */
    private final h.a.a<u> f14098j;

    /* renamed from: k, reason: collision with root package name */
    private final h.a.a<d0> f14099k;

    public y(h.a.a<Context> aVar, h.a.a<org.greenrobot.eventbus.c> aVar2, h.a.a<SharedPreferences> aVar3, h.a.a<com.parizene.netmonitor.db.celllog.b> aVar4, h.a.a<com.parizene.netmonitor.m0.d0.d> aVar5, h.a.a<com.parizene.netmonitor.s0.d.c> aVar6, h.a.a<Handler> aVar7, h.a.a<com.parizene.netmonitor.m0.e> aVar8, h.a.a<com.parizene.netmonitor.m0.e> aVar9, h.a.a<u> aVar10, h.a.a<d0> aVar11) {
        this.a = aVar;
        this.f14090b = aVar2;
        this.f14091c = aVar3;
        this.f14092d = aVar4;
        this.f14093e = aVar5;
        this.f14094f = aVar6;
        this.f14095g = aVar7;
        this.f14096h = aVar8;
        this.f14097i = aVar9;
        this.f14098j = aVar10;
        this.f14099k = aVar11;
    }

    public static y a(h.a.a<Context> aVar, h.a.a<org.greenrobot.eventbus.c> aVar2, h.a.a<SharedPreferences> aVar3, h.a.a<com.parizene.netmonitor.db.celllog.b> aVar4, h.a.a<com.parizene.netmonitor.m0.d0.d> aVar5, h.a.a<com.parizene.netmonitor.s0.d.c> aVar6, h.a.a<Handler> aVar7, h.a.a<com.parizene.netmonitor.m0.e> aVar8, h.a.a<com.parizene.netmonitor.m0.e> aVar9, h.a.a<u> aVar10, h.a.a<d0> aVar11) {
        return new y(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10, aVar11);
    }

    public static x c(Context context, org.greenrobot.eventbus.c cVar, SharedPreferences sharedPreferences, com.parizene.netmonitor.db.celllog.b bVar, com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.s0.d.c cVar2, Handler handler, f.a<com.parizene.netmonitor.m0.e> aVar, f.a<com.parizene.netmonitor.m0.e> aVar2, u uVar, d0 d0Var) {
        return new x(context, cVar, sharedPreferences, bVar, dVar, cVar2, handler, aVar, aVar2, uVar, d0Var);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.a.get(), this.f14090b.get(), this.f14091c.get(), this.f14092d.get(), this.f14093e.get(), this.f14094f.get(), this.f14095g.get(), f.c.b.a(this.f14096h), f.c.b.a(this.f14097i), this.f14098j.get(), this.f14099k.get());
    }
}