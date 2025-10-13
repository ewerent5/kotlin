package com.google.android.datatransport.runtime.scheduling.jobscheduling;

import java.util.concurrent.Executor;

/* compiled from: WorkInitializer_Factory.java */
/* loaded from: classes.dex */
public final class r implements e.c.b.a.i.t.a.b<q> {
    private final h.a.a<Executor> a;

    /* renamed from: b */
    private final h.a.a<e.c.b.a.i.w.j.c> f4435b;

    /* renamed from: c */
    private final h.a.a<s> f4436c;

    /* renamed from: d */
    private final h.a.a<e.c.b.a.i.x.b> f4437d;

    public r(h.a.a<Executor> aVar, h.a.a<e.c.b.a.i.w.j.c> aVar2, h.a.a<s> aVar3, h.a.a<e.c.b.a.i.x.b> aVar4) {
        this.a = aVar;
        this.f4435b = aVar2;
        this.f4436c = aVar3;
        this.f4437d = aVar4;
    }

    public static r a(h.a.a<Executor> aVar, h.a.a<e.c.b.a.i.w.j.c> aVar2, h.a.a<s> aVar3, h.a.a<e.c.b.a.i.x.b> aVar4) {
        return new r(aVar, aVar2, aVar3, aVar4);
    }

    public static q c(Executor executor, e.c.b.a.i.w.j.c cVar, s sVar, e.c.b.a.i.x.b bVar) {
        return new q(executor, cVar, sVar, bVar);
    }

    @Override // h.a.a
    /* renamed from: b */
    public q get() {
        return c(this.a.get(), this.f4435b.get(), this.f4436c.get(), this.f4437d.get());
    }
}