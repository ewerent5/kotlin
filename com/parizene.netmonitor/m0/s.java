package com.parizene.netmonitor.m0;

/* compiled from: PhoneStateListenerManager_Factory.java */
/* loaded from: classes.dex */
public final class s implements f.c.c<r> {
    private final h.a.a<com.parizene.netmonitor.m0.d0.d> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.e> f13518b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.a> f13519c;

    public s(h.a.a<com.parizene.netmonitor.m0.d0.d> aVar, h.a.a<com.parizene.netmonitor.m0.d0.e> aVar2, h.a.a<com.parizene.netmonitor.m0.d0.a> aVar3) {
        this.a = aVar;
        this.f13518b = aVar2;
        this.f13519c = aVar3;
    }

    public static s a(h.a.a<com.parizene.netmonitor.m0.d0.d> aVar, h.a.a<com.parizene.netmonitor.m0.d0.e> aVar2, h.a.a<com.parizene.netmonitor.m0.d0.a> aVar3) {
        return new s(aVar, aVar2, aVar3);
    }

    public static r c(com.parizene.netmonitor.m0.d0.d dVar, com.parizene.netmonitor.m0.d0.e eVar, com.parizene.netmonitor.m0.d0.a aVar) {
        return new r(dVar, eVar, aVar);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public r get() {
        return c(this.a.get(), this.f13518b.get(), this.f13519c.get());
    }
}