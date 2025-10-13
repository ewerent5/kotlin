package e.c.b.a.i.w;

import com.google.android.datatransport.runtime.scheduling.jobscheduling.s;
import java.util.concurrent.Executor;

/* compiled from: DefaultScheduler_Factory.java */
/* loaded from: classes.dex */
public final class d implements e.c.b.a.i.t.a.b<c> {
    private final h.a.a<Executor> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<com.google.android.datatransport.runtime.backends.e> f14291b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<s> f14292c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<e.c.b.a.i.w.j.c> f14293d;

    /* renamed from: e, reason: collision with root package name */
    private final h.a.a<e.c.b.a.i.x.b> f14294e;

    public d(h.a.a<Executor> aVar, h.a.a<com.google.android.datatransport.runtime.backends.e> aVar2, h.a.a<s> aVar3, h.a.a<e.c.b.a.i.w.j.c> aVar4, h.a.a<e.c.b.a.i.x.b> aVar5) {
        this.a = aVar;
        this.f14291b = aVar2;
        this.f14292c = aVar3;
        this.f14293d = aVar4;
        this.f14294e = aVar5;
    }

    public static d a(h.a.a<Executor> aVar, h.a.a<com.google.android.datatransport.runtime.backends.e> aVar2, h.a.a<s> aVar3, h.a.a<e.c.b.a.i.w.j.c> aVar4, h.a.a<e.c.b.a.i.x.b> aVar5) {
        return new d(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static c c(Executor executor, com.google.android.datatransport.runtime.backends.e eVar, s sVar, e.c.b.a.i.w.j.c cVar, e.c.b.a.i.x.b bVar) {
        return new c(executor, eVar, sVar, cVar, bVar);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.a.get(), this.f14291b.get(), this.f14292c.get(), this.f14293d.get(), this.f14294e.get());
    }
}