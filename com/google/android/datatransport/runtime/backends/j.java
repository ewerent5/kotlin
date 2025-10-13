package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* compiled from: CreationContextFactory_Factory.java */
/* loaded from: classes.dex */
public final class j implements e.c.b.a.i.t.a.b<i> {
    private final h.a.a<Context> a;

    /* renamed from: b */
    private final h.a.a<e.c.b.a.i.y.a> f4383b;

    /* renamed from: c */
    private final h.a.a<e.c.b.a.i.y.a> f4384c;

    public j(h.a.a<Context> aVar, h.a.a<e.c.b.a.i.y.a> aVar2, h.a.a<e.c.b.a.i.y.a> aVar3) {
        this.a = aVar;
        this.f4383b = aVar2;
        this.f4384c = aVar3;
    }

    public static j a(h.a.a<Context> aVar, h.a.a<e.c.b.a.i.y.a> aVar2, h.a.a<e.c.b.a.i.y.a> aVar3) {
        return new j(aVar, aVar2, aVar3);
    }

    public static i c(Context context, e.c.b.a.i.y.a aVar, e.c.b.a.i.y.a aVar2) {
        return new i(context, aVar, aVar2);
    }

    @Override // h.a.a
    /* renamed from: b */
    public i get() {
        return c(this.a.get(), this.f4383b.get(), this.f4384c.get());
    }
}