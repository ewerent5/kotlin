package e.c.b.a.i;

/* compiled from: TransportRuntime_Factory.java */
/* loaded from: classes.dex */
public final class s implements e.c.b.a.i.t.a.b<q> {
    private final h.a.a<e.c.b.a.i.y.a> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<e.c.b.a.i.y.a> f14273b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<e.c.b.a.i.w.e> f14274c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.m> f14275d;

    /* renamed from: e, reason: collision with root package name */
    private final h.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.q> f14276e;

    public s(h.a.a<e.c.b.a.i.y.a> aVar, h.a.a<e.c.b.a.i.y.a> aVar2, h.a.a<e.c.b.a.i.w.e> aVar3, h.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.m> aVar4, h.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.q> aVar5) {
        this.a = aVar;
        this.f14273b = aVar2;
        this.f14274c = aVar3;
        this.f14275d = aVar4;
        this.f14276e = aVar5;
    }

    public static s a(h.a.a<e.c.b.a.i.y.a> aVar, h.a.a<e.c.b.a.i.y.a> aVar2, h.a.a<e.c.b.a.i.w.e> aVar3, h.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.m> aVar4, h.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.q> aVar5) {
        return new s(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static q c(e.c.b.a.i.y.a aVar, e.c.b.a.i.y.a aVar2, e.c.b.a.i.w.e eVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.m mVar, com.google.android.datatransport.runtime.scheduling.jobscheduling.q qVar) {
        return new q(aVar, aVar2, eVar, mVar, qVar);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public q get() {
        return c(this.a.get(), this.f14273b.get(), this.f14274c.get(), this.f14275d.get(), this.f14276e.get());
    }
}