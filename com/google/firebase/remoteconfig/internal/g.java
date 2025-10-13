package com.google.firebase.remoteconfig.internal;

/* compiled from: ConfigFetchHandler.java */
/* loaded from: classes.dex */
final /* synthetic */ class g implements e.c.b.b.e.a {
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final long f12936b;

    private g(k kVar, long j2) {
        this.a = kVar;
        this.f12936b = j2;
    }

    public static e.c.b.b.e.a b(k kVar, long j2) {
        return new g(kVar, j2);
    }

    @Override // e.c.b.b.e.a
    public Object a(e.c.b.b.e.h hVar) {
        return this.a.h(hVar, this.f12936b);
    }
}