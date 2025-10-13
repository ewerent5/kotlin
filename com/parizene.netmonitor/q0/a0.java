package com.parizene.netmonitor.q0;

/* compiled from: AppModule_ProvideEventBusFactory.java */
/* loaded from: classes3.dex */
public final class a0 implements f.c.c<org.greenrobot.eventbus.c> {

    /* compiled from: AppModule_ProvideEventBusFactory.java */
    private static final class a {
        private static final a0 a = new a0();
    }

    public static a0 a() {
        return a.a;
    }

    public static org.greenrobot.eventbus.c c() {
        return (org.greenrobot.eventbus.c) f.c.f.c(t.g(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public org.greenrobot.eventbus.c get() {
        return c();
    }
}