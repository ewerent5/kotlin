package com.parizene.netmonitor.q0;

/* compiled from: CellModule_ProvideTelephonyManagerWrapperProxyFactory.java */
/* loaded from: classes3.dex */
public final class u0 implements f.c.c<com.parizene.netmonitor.m0.d0.e> {
    private final h.a.a<com.parizene.netmonitor.m0.d0.d> a;

    public u0(h.a.a<com.parizene.netmonitor.m0.d0.d> aVar) {
        this.a = aVar;
    }

    public static u0 a(h.a.a<com.parizene.netmonitor.m0.d0.d> aVar) {
        return new u0(aVar);
    }

    public static com.parizene.netmonitor.m0.d0.e c(com.parizene.netmonitor.m0.d0.d dVar) {
        return (com.parizene.netmonitor.m0.d0.e) f.c.f.c(p0.e(dVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.m0.d0.e get() {
        return c(this.a.get());
    }
}