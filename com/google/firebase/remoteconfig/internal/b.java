package com.google.firebase.remoteconfig.internal;

/* compiled from: ConfigCacheClient.java */
/* loaded from: classes.dex */
final /* synthetic */ class b implements e.c.b.b.e.g {
    private final e a;

    /* renamed from: b, reason: collision with root package name */
    private final boolean f12921b;

    /* renamed from: c, reason: collision with root package name */
    private final f f12922c;

    private b(e eVar, boolean z, f fVar) {
        this.a = eVar;
        this.f12921b = z;
        this.f12922c = fVar;
    }

    public static e.c.b.b.e.g b(e eVar, boolean z, f fVar) {
        return new b(eVar, z, fVar);
    }

    @Override // e.c.b.b.e.g
    public e.c.b.b.e.h a(Object obj) {
        return e.h(this.a, this.f12921b, this.f12922c, (Void) obj);
    }
}