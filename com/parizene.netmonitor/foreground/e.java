package com.parizene.netmonitor.foreground;

/* compiled from: ForegroundStateManager_Factory.java */
/* loaded from: classes3.dex */
public final class e implements f.c.c<d> {
    private final h.a.a<a> a;

    public e(h.a.a<a> aVar) {
        this.a = aVar;
    }

    public static e a(h.a.a<a> aVar) {
        return new e(aVar);
    }

    public static d c(a aVar) {
        return new d(aVar);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c(this.a.get());
    }
}