package e.c.b.a.i;

/* compiled from: TransportImpl.java */
/* loaded from: classes.dex */
final class o<T> implements e.c.b.a.f<T> {
    private final m a;

    /* renamed from: b, reason: collision with root package name */
    private final String f14265b;

    /* renamed from: c, reason: collision with root package name */
    private final e.c.b.a.b f14266c;

    /* renamed from: d, reason: collision with root package name */
    private final e.c.b.a.e<T, byte[]> f14267d;

    /* renamed from: e, reason: collision with root package name */
    private final p f14268e;

    o(m mVar, String str, e.c.b.a.b bVar, e.c.b.a.e<T, byte[]> eVar, p pVar) {
        this.a = mVar;
        this.f14265b = str;
        this.f14266c = bVar;
        this.f14267d = eVar;
        this.f14268e = pVar;
    }

    @Override // e.c.b.a.f
    public void a(e.c.b.a.c<T> cVar, e.c.b.a.h hVar) {
        this.f14268e.a(l.a().e(this.a).c(cVar).f(this.f14265b).d(this.f14267d).b(this.f14266c).a(), hVar);
    }
}