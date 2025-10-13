package com.parizene.netmonitor.q0;

/* compiled from: CellModule_ProvideCellInfosSplitterFactory.java */
/* loaded from: classes3.dex */
public final class q0 implements f.c.c<com.parizene.netmonitor.m0.c0.c> {

    /* compiled from: CellModule_ProvideCellInfosSplitterFactory.java */
    private static final class a {
        private static final q0 a = new q0();
    }

    public static q0 a() {
        return a.a;
    }

    public static com.parizene.netmonitor.m0.c0.c c() {
        return (com.parizene.netmonitor.m0.c0.c) f.c.f.c(p0.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.m0.c0.c get() {
        return c();
    }
}