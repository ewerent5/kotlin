package e.c.b.a.i.w;

import e.c.b.a.i.m;
import e.c.b.a.i.x.b;

/* compiled from: DefaultScheduler.java */
/* loaded from: classes.dex */
final /* synthetic */ class b implements b.a {
    private final c a;

    /* renamed from: b, reason: collision with root package name */
    private final m f14284b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.a.i.h f14285c;

    private b(c cVar, m mVar, e.c.b.a.i.h hVar) {
        this.a = cVar;
        this.f14284b = mVar;
        this.f14285c = hVar;
    }

    public static b.a a(c cVar, m mVar, e.c.b.a.i.h hVar) {
        return new b(cVar, mVar, hVar);
    }

    @Override // e.c.b.a.i.x.b.a
    public Object execute() {
        return c.b(this.a, this.f14284b, this.f14285c);
    }
}