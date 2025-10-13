package com.parizene.netmonitor.q0;

import android.os.Handler;

/* compiled from: AppModule_ProvideWebHandlerFactory.java */
/* loaded from: classes3.dex */
public final class o0 implements f.c.c<Handler> {

    /* compiled from: AppModule_ProvideWebHandlerFactory.java */
    private static final class a {
        private static final o0 a = new o0();
    }

    public static o0 a() {
        return a.a;
    }

    public static Handler c() {
        return (Handler) f.c.f.c(t.u(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Handler get() {
        return c();
    }
}