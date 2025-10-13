package com.parizene.netmonitor.q0;

import android.os.Handler;

/* compiled from: AppModule_ProvideOldCellHelperFactory.java */
/* loaded from: classes3.dex */
public final class j0 implements f.c.c<com.parizene.netmonitor.m0.e> {
    private final h.a.a<Handler> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<Handler> f13610b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.d> f13611c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.e> f13612d;

    /* renamed from: e, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.a> f13613e;

    /* renamed from: f, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.i> f13614f;

    /* renamed from: g, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.n> f13615g;

    /* renamed from: h, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.u> f13616h;

    /* renamed from: i, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.r> f13617i;

    public j0(h.a.a<Handler> aVar, h.a.a<Handler> aVar2, h.a.a<com.parizene.netmonitor.m0.d0.d> aVar3, h.a.a<com.parizene.netmonitor.m0.d0.e> aVar4, h.a.a<com.parizene.netmonitor.m0.d0.a> aVar5, h.a.a<com.parizene.netmonitor.m0.i> aVar6, h.a.a<com.parizene.netmonitor.m0.n> aVar7, h.a.a<com.parizene.netmonitor.m0.u> aVar8, h.a.a<com.parizene.netmonitor.m0.r> aVar9) {
        this.a = aVar;
        this.f13610b = aVar2;
        this.f13611c = aVar3;
        this.f13612d = aVar4;
        this.f13613e = aVar5;
        this.f13614f = aVar6;
        this.f13615g = aVar7;
        this.f13616h = aVar8;
        this.f13617i = aVar9;
    }

    public static j0 a(h.a.a<Handler> aVar, h.a.a<Handler> aVar2, h.a.a<com.parizene.netmonitor.m0.d0.d> aVar3, h.a.a<com.parizene.netmonitor.m0.d0.e> aVar4, h.a.a<com.parizene.netmonitor.m0.d0.a> aVar5, h.a.a<com.parizene.netmonitor.m0.i> aVar6, h.a.a<com.parizene.netmonitor.m0.n> aVar7, h.a.a<com.parizene.netmonitor.m0.u> aVar8, h.a.a<com.parizene.netmonitor.m0.r> aVar9) {
        return new j0(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7, aVar8, aVar9);
    }

    public static com.parizene.netmonitor.m0.e c(Handler handler, Handler handler2, com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.m0.d0.e eVar, com.parizene.netmonitor.m0.d0.a aVar, com.parizene.netmonitor.m0.i iVar, com.parizene.netmonitor.m0.n nVar, com.parizene.netmonitor.m0.u uVar, com.parizene.netmonitor.m0.r rVar) {
        return (com.parizene.netmonitor.m0.e) f.c.f.c(t.p(handler, handler2, dVar, eVar, aVar, iVar, nVar, uVar, rVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.m0.e get() {
        return c(this.a.get(), this.f13610b.get(), this.f13611c.get(), this.f13612d.get(), this.f13613e.get(), this.f13614f.get(), this.f13615g.get(), this.f13616h.get(), this.f13617i.get());
    }
}