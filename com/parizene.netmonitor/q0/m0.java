package com.parizene.netmonitor.q0;

import android.os.Handler;

/* compiled from: AppModule_ProvideUiHandlerFactory.java */
/* loaded from: classes3.dex */
public final class m0 implements f.c.c<Handler> {

    /* compiled from: AppModule_ProvideUiHandlerFactory.java */
    private static final class a {
        private static final m0 a = new m0();
    }

    public static m0 a() {
        return a.a;
    }

    public static Handler c() {
        return (Handler) f.c.f.c(t.s(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public Handler get() {
        return c();
    }
}