package com.parizene.netmonitor.m0;

/* compiled from: NetworkInfoCreator_Factory.java */
/* loaded from: classes.dex */
public final class o implements f.c.c<n> {
    private final h.a.a<com.parizene.netmonitor.m0.d0.d> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.e> f13506b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<l> f13507c;

    public o(h.a.a<com.parizene.netmonitor.m0.d0.d> aVar, h.a.a<com.parizene.netmonitor.m0.d0.e> aVar2, h.a.a<l> aVar3) {
        this.a = aVar;
        this.f13506b = aVar2;
        this.f13507c = aVar3;
    }

    public static o a(h.a.a<com.parizene.netmonitor.m0.d0.d> aVar, h.a.a<com.parizene.netmonitor.m0.d0.e> aVar2, h.a.a<l> aVar3) {
        return new o(aVar, aVar2, aVar3);
    }

    public static n c(com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.m0.d0.e eVar, l lVar) {
        return new n(dVar, eVar, lVar);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public n get() {
        return c(this.a.get(), this.f13506b.get(), this.f13507c.get());
    }
}