package com.parizene.netmonitor.q0;

/* compiled from: AppModule_ProvideGsonFactory.java */
/* loaded from: classes3.dex */
public final class f0 implements f.c.c<e.c.d.f> {

    /* compiled from: AppModule_ProvideGsonFactory.java */
    private static final class a {
        private static final f0 a = new f0();
    }

    public static f0 a() {
        return a.a;
    }

    public static e.c.d.f c() {
        return (e.c.d.f) f.c.f.c(t.l(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e.c.d.f get() {
        return c();
    }
}