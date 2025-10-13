package com.parizene.netmonitor.q0;

import android.app.Application;
import android.content.Context;

/* compiled from: AndroidModule_ProvideContextFactory.java */
/* loaded from: classes3.dex */
public final class h implements f.c.c<Context> {
    private final h.a.a<Application> a;

    public h(h.a.a<Application> aVar) {
        this.a = aVar;
    }

    public static h a(h.a.a<Application> aVar) {
        return new h(aVar);
    }

    public static Context c(Application application) {
        return (Context) f.c.f.c(d.d(application), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Context get() {
        return c(this.a.get());
    }
}