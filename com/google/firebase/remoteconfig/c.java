package com.google.firebase.remoteconfig;

/* compiled from: FirebaseRemoteConfig.java */
/* loaded from: classes.dex */
final /* synthetic */ class c implements e.c.b.b.e.a {
    private final g a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.b.e.h f12899b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.b.e.h f12900c;

    private c(g gVar, e.c.b.b.e.h hVar, e.c.b.b.e.h hVar2) {
        this.a = gVar;
        this.f12899b = hVar;
        this.f12900c = hVar2;
    }

    public static e.c.b.b.e.a b(g gVar, e.c.b.b.e.h hVar, e.c.b.b.e.h hVar2) {
        return new c(gVar, hVar, hVar2);
    }

    @Override // e.c.b.b.e.a
    public Object a(e.c.b.b.e.h hVar) {
        return g.j(this.a, this.f12899b, this.f12900c, hVar);
    }
}