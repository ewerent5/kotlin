package com.parizene.netmonitor.m0;

/* compiled from: CellStateCreator_Factory.java */
/* loaded from: classes.dex */
public final class j implements f.c.c<i> {
    private final h.a.a<g> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<com.google.firebase.crashlytics.c> f13500b;

    public j(h.a.a<g> aVar, h.a.a<com.google.firebase.crashlytics.c> aVar2) {
        this.a = aVar;
        this.f13500b = aVar2;
    }

    public static j a(h.a.a<g> aVar, h.a.a<com.google.firebase.crashlytics.c> aVar2) {
        return new j(aVar, aVar2);
    }

    public static i c(g gVar, f.a<com.google.firebase.crashlytics.c> aVar) {
        return new i(gVar, aVar);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public i get() {
        return c(this.a.get(), f.c.b.a(this.f13500b));
    }
}