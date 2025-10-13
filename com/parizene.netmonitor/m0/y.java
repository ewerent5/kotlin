package com.parizene.netmonitor.m0;

import android.os.Handler;

/* compiled from: TestAll_Factory.java */
/* loaded from: classes.dex */
public final class y implements f.c.c<x> {
    private final h.a.a<com.parizene.netmonitor.m0.d0.d> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.e> f13533b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.a> f13534c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.c0.c> f13535d;

    /* renamed from: e, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.s0.d.c> f13536e;

    /* renamed from: f, reason: collision with root package name */
    private final h.a.a<Handler> f13537f;

    /* renamed from: g, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.k> f13538g;

    public y(h.a.a<com.parizene.netmonitor.m0.d0.d> aVar, h.a.a<com.parizene.netmonitor.m0.d0.e> aVar2, h.a.a<com.parizene.netmonitor.m0.d0.a> aVar3, h.a.a<com.parizene.netmonitor.m0.c0.c> aVar4, h.a.a<com.parizene.netmonitor.s0.d.c> aVar5, h.a.a<Handler> aVar6, h.a.a<com.parizene.netmonitor.k> aVar7) {
        this.a = aVar;
        this.f13533b = aVar2;
        this.f13534c = aVar3;
        this.f13535d = aVar4;
        this.f13536e = aVar5;
        this.f13537f = aVar6;
        this.f13538g = aVar7;
    }

    public static y a(h.a.a<com.parizene.netmonitor.m0.d0.d> aVar, h.a.a<com.parizene.netmonitor.m0.d0.e> aVar2, h.a.a<com.parizene.netmonitor.m0.d0.a> aVar3, h.a.a<com.parizene.netmonitor.m0.c0.c> aVar4, h.a.a<com.parizene.netmonitor.s0.d.c> aVar5, h.a.a<Handler> aVar6, h.a.a<com.parizene.netmonitor.k> aVar7) {
        return new y(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static x c(com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.m0.d0.e eVar, com.parizene.netmonitor.m0.d0.a aVar, com.parizene.netmonitor.m0.c0.c cVar, com.parizene.netmonitor.s0.d.c cVar2, Handler handler, com.parizene.netmonitor.k kVar) {
        return new x(dVar, eVar, aVar, cVar, cVar2, handler, kVar);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public x get() {
        return c(this.a.get(), this.f13533b.get(), this.f13534c.get(), this.f13535d.get(), this.f13536e.get(), this.f13537f.get(), this.f13538g.get());
    }
}