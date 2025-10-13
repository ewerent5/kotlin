package com.parizene.netmonitor.q0;

/* compiled from: AppModule_ProvideUserInfoFactory.java */
/* loaded from: classes3.dex */
public final class n0 implements f.c.c<com.parizene.netmonitor.i0> {
    private final h.a.a<com.parizene.netmonitor.s0.c.c> a;

    public n0(h.a.a<com.parizene.netmonitor.s0.c.c> aVar) {
        this.a = aVar;
    }

    public static n0 a(h.a.a<com.parizene.netmonitor.s0.c.c> aVar) {
        return new n0(aVar);
    }

    public static com.parizene.netmonitor.i0 c(f.a<com.parizene.netmonitor.s0.c.c> aVar) {
        return (com.parizene.netmonitor.i0) f.c.f.c(t.t(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.i0 get() {
        return c(f.c.b.a(this.a));
    }
}