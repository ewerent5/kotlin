package e.c.b.a.i.w;

import e.c.b.a.i.m;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes.dex */
final /* synthetic */ class a implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    private final c f14280e;

    /* renamed from: f, reason: collision with root package name */
    private final m f14281f;

    /* renamed from: g, reason: collision with root package name */
    private final e.c.b.a.h f14282g;

    /* renamed from: h, reason: collision with root package name */
    private final e.c.b.a.i.h f14283h;

    private a(c cVar, m mVar, e.c.b.a.h hVar, e.c.b.a.i.h hVar2) {
        this.f14280e = cVar;
        this.f14281f = mVar;
        this.f14282g = hVar;
        this.f14283h = hVar2;
    }

    public static Runnable a(c cVar, m mVar, e.c.b.a.h hVar, e.c.b.a.i.h hVar2) {
        return new a(cVar, mVar, hVar, hVar2);
    }

    @Override // java.lang.Runnable
    public void run() {
        c.c(this.f14280e, this.f14281f, this.f14282g, this.f14283h);
    }
}