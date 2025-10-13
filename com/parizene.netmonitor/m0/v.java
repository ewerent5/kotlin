package com.parizene.netmonitor.m0;

/* compiled from: SubscriptionIdsInfoCreator_Factory.java */
/* loaded from: classes.dex */
public final class v implements f.c.c<u> {
    private final h.a.a<com.parizene.netmonitor.m0.d0.d> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<com.google.firebase.crashlytics.c> f13524b;

    public v(h.a.a<com.parizene.netmonitor.m0.d0.d> aVar, h.a.a<com.google.firebase.crashlytics.c> aVar2) {
        this.a = aVar;
        this.f13524b = aVar2;
    }

    public static v a(h.a.a<com.parizene.netmonitor.m0.d0.d> aVar, h.a.a<com.google.firebase.crashlytics.c> aVar2) {
        return new v(aVar, aVar2);
    }

    public static u c(com.parizene.netmonitor.m0.d0.d dVar, f.a<com.google.firebase.crashlytics.c> aVar) {
        return new u(dVar, aVar);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.a.get(), f.c.b.a(this.f13524b));
    }
}