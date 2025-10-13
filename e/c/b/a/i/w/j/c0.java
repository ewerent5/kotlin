package e.c.b.a.i.w.j;

/* compiled from: SQLiteEventStore_Factory.java */
/* loaded from: classes.dex */
public final class c0 implements e.c.b.a.i.t.a.b<b0> {
    private final h.a.a<e.c.b.a.i.y.a> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<e.c.b.a.i.y.a> f14316b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<d> f14317c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<h0> f14318d;

    public c0(h.a.a<e.c.b.a.i.y.a> aVar, h.a.a<e.c.b.a.i.y.a> aVar2, h.a.a<d> aVar3, h.a.a<h0> aVar4) {
        this.a = aVar;
        this.f14316b = aVar2;
        this.f14317c = aVar3;
        this.f14318d = aVar4;
    }

    public static c0 a(h.a.a<e.c.b.a.i.y.a> aVar, h.a.a<e.c.b.a.i.y.a> aVar2, h.a.a<d> aVar3, h.a.a<h0> aVar4) {
        return new c0(aVar, aVar2, aVar3, aVar4);
    }

    public static b0 c(e.c.b.a.i.y.a aVar, e.c.b.a.i.y.a aVar2, Object obj, Object obj2) {
        return new b0(aVar, aVar2, (d) obj, (h0) obj2);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public b0 get() {
        return c(this.a.get(), this.f14316b.get(), this.f14317c.get(), this.f14318d.get());
    }
}