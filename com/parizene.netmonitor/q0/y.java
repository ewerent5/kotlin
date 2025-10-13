package com.parizene.netmonitor.q0;

import android.os.Handler;

/* compiled from: AppModule_ProvideBgHandlerFactory.java */
/* loaded from: classes3.dex */
public final class y implements f.c.c<Handler> {

    /* compiled from: AppModule_ProvideBgHandlerFactory.java */
    private static final class a {
        private static final y a = new y();
    }

    public static y a() {
        return a.a;
    }

    public static Handler c() {
        return (Handler) f.c.f.c(t.e(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Handler get() {
        return c();
    }
}