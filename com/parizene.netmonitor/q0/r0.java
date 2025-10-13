package com.parizene.netmonitor.q0;

/* compiled from: CellModule_ProvideCellMapperFactory.java */
/* loaded from: classes3.dex */
public final class r0 implements f.c.c<com.parizene.netmonitor.m0.d0.a> {

    /* compiled from: CellModule_ProvideCellMapperFactory.java */
    private static final class a {
        private static final r0 a = new r0();
    }

    public static r0 a() {
        return a.a;
    }

    public static com.parizene.netmonitor.m0.d0.a c() {
        return (com.parizene.netmonitor.m0.d0.a) f.c.f.c(p0.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.m0.d0.a get() {
        return c();
    }
}