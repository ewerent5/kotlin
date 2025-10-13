package com.parizene.netmonitor.ui;

/* compiled from: AdsConfigHolder_Factory.java */
/* loaded from: classes3.dex */
public final class m0 implements f.c.c<l0> {
    private final h.a.a<com.google.firebase.remoteconfig.g> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<e.c.d.f> f13935b;

    public m0(h.a.a<com.google.firebase.remoteconfig.g> aVar, h.a.a<e.c.d.f> aVar2) {
        this.a = aVar;
        this.f13935b = aVar2;
    }

    public static m0 a(h.a.a<com.google.firebase.remoteconfig.g> aVar, h.a.a<e.c.d.f> aVar2) {
        return new m0(aVar, aVar2);
    }

    public static l0 c(com.google.firebase.remoteconfig.g gVar, f.a<e.c.d.f> aVar) {
        return new l0(gVar, aVar);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public l0 get() {
        return c(this.a.get(), f.c.b.a(this.f13935b));
    }
}