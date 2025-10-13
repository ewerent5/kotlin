package com.parizene.netmonitor.q0;

import android.os.Handler;

/* compiled from: AppModule_ProvideNewCellHelperFactory.java */
/* loaded from: classes3.dex */
public final class h0 implements f.c.c<com.parizene.netmonitor.m0.e> {
    private final h.a.a<com.parizene.netmonitor.f0> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<Handler> f13601b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<Handler> f13602c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.d> f13603d;

    /* renamed from: e, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.e> f13604e;

    /* renamed from: f, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.a> f13605f;

    /* renamed from: g, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.i> f13606g;

    /* renamed from: h, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.n> f13607h;

    /* renamed from: i, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.u> f13608i;

    /* renamed from: j, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.r> f13609j;

    public h0(h.a.a<com.parizene.netmonitor.f0> aVar, h.a.a<Handler> aVar2, h.a.a<Handler> aVar3, h.a.a<com.parizene.netmonitor.m0.d0.d> aVar4, h.a.a<com.parizene.netmonitor.m0.d0.e> aVar5, h.a.a<com.parizene.netmonitor.m0.d0.a> aVar6, h.a.a<com.parizene.netmonitor.m0.i> aVar7, h.a.a<com.parizene.netmonitor.m0.n> aVar8, h.a.a<com.parizene.netmonitor.m0.u> aVar9, h.a.a<com.parizene.netmonitor.m0.r> aVar10) {
        this.a = aVar;
        this.f13601b = aVar2;
        this.f13602c = aVar3;
        this.f13603d = aVar4;
        this.f13604e = aVar5;
        this.f13605f = aVar6;
        this.f13606g = aVar7;
        this.f13607h = aVar8;
        this.f13608i = aVar9;
        this.f13609j = aVar10;
    }

    public static h0 a(h.a.a<com.parizene.netmonitor.f0> aVar, h.a.a<Handler> aVar2, h.a.a<Handler> aVar3, h.a.a<com.parizene.netmonitor.m0.d0.d> aVar4, h.a.a<com.parizene.netmonitor.m0.d0.e> aVar5, h.a.a<com.parizene.netmonitor.m0.d0.a> aVar6, h.a.a<com.parizene.netmonitor.m0.i> aVar7, h.a.a<com.parizene.netmonitor.m0.n> aVar8, h.a.a<com.parizene.netmonitor.m0.u> aVar9, h.a.a<com.parizene.netmonitor.m0.r> aVar10) {
        return new h0(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9, aVar10);
    }

    public static com.parizene.netmonitor.m0.e c(com.parizene.netmonitor.f0 f0Var, Handler handler, Handler handler2, com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.m0.d0.e eVar, com.parizene.netmonitor.m0.d0.a aVar, com.parizene.netmonitor.m0.i iVar, com.parizene.netmonitor.m0.n nVar, com.parizene.netmonitor.m0.u uVar, com.parizene.netmonitor.m0.r rVar) {
        return (com.parizene.netmonitor.m0.e) f.c.f.c(t.n(f0Var, handler, handler2, dVar, eVar, aVar, iVar, nVar, uVar, rVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.m0.e get() {
        return c(this.a.get(), this.f13601b.get(), this.f13602c.get(), this.f13603d.get(), this.f13604e.get(), this.f13605f.get(), this.f13606g.get(), this.f13607h.get(), this.f13608i.get(), this.f13609j.get());
    }
}