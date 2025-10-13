package com.google.android.datatransport.runtime.backends;

import android.content.Context;

/* compiled from: MetadataBackendRegistry_Factory.java */
/* loaded from: classes.dex */
public final class l implements e.c.b.a.i.t.a.b<k> {
    private final h.a.a<Context> a;

    /* renamed from: b */
    private final h.a.a<i> f4388b;

    public l(h.a.a<Context> aVar, h.a.a<i> aVar2) {
        this.a = aVar;
        this.f4388b = aVar2;
    }

    public static l a(h.a.a<Context> aVar, h.a.a<i> aVar2) {
        return new l(aVar, aVar2);
    }

    public static k c(Context context, Object obj) {
        return new k(context, (i) obj);
    }

    @Override // h.a.a
    /* renamed from: b */
    public k get() {
        return c(this.a.get(), this.f4388b.get());
    }
}