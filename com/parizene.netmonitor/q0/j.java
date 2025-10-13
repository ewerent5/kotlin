package com.parizene.netmonitor.q0;

import android.content.Context;

/* compiled from: AndroidModule_ProvideLocalBroadcastManagerFactory.java */
/* loaded from: classes3.dex */
public final class j implements f.c.c<c.p.a.a> {
    private final h.a.a<Context> a;

    public j(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static j a(h.a.a<Context> aVar) {
        return new j(aVar);
    }

    public static c.p.a.a c(Context context) {
        return (c.p.a.a) f.c.f.c(d.f(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c.p.a.a get() {
        return c(this.a.get());
    }
}