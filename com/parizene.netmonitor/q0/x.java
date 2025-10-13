package com.parizene.netmonitor.q0;

/* compiled from: AppModule_ProvideBandHelperFactory.java */
/* loaded from: classes3.dex */
public final class x implements f.c.c<com.parizene.netmonitor.m0.z.b> {

    /* compiled from: AppModule_ProvideBandHelperFactory.java */
    private static final class a {
        private static final x a = new x();
    }

    public static x a() {
        return a.a;
    }

    public static com.parizene.netmonitor.m0.z.b c() {
        return (com.parizene.netmonitor.m0.z.b) f.c.f.c(t.d(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.m0.z.b get() {
        return c();
    }
}