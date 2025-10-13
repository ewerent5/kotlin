package com.parizene.netmonitor.m0;

/* compiled from: CellInfoMapper_Factory.java */
/* loaded from: classes.dex */
public final class h implements f.c.c<g> {
    private final h.a.a<l> a;

    public h(h.a.a<l> aVar) {
        this.a = aVar;
    }

    public static h a(h.a.a<l> aVar) {
        return new h(aVar);
    }

    public static g c(l lVar) {
        return new g(lVar);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public g get() {
        return c(this.a.get());
    }
}