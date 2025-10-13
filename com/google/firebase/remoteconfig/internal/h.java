package com.google.firebase.remoteconfig.internal;

import java.util.Date;

/* compiled from: ConfigFetchHandler.java */
/* loaded from: classes.dex */
final /* synthetic */ class h implements e.c.b.b.e.a {
    private final k a;

    /* renamed from: b, reason: collision with root package name */
    private final e.c.b.b.e.h f12937b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.b.e.h f12938c;

    /* renamed from: d, reason: collision with root package name */
    private final Date f12939d;

    private h(k kVar, e.c.b.b.e.h hVar, e.c.b.b.e.h hVar2, Date date) {
        this.a = kVar;
        this.f12937b = hVar;
        this.f12938c = hVar2;
        this.f12939d = date;
    }

    public static e.c.b.b.e.a b(k kVar, e.c.b.b.e.h hVar, e.c.b.b.e.h hVar2, Date date) {
        return new h(kVar, hVar, hVar2, date);
    }

    @Override // e.c.b.b.e.a
    public Object a(e.c.b.b.e.h hVar) {
        return k.o(this.a, this.f12937b, this.f12938c, this.f12939d, hVar);
    }
}