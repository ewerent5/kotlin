package e.c.b.a.i.w.j;

/* compiled from: EventStoreModule_StoreConfigFactory.java */
/* loaded from: classes.dex */
public final class h implements e.c.b.a.i.t.a.b<d> {

    /* compiled from: EventStoreModule_StoreConfigFactory.java */
    private static final class a {
        private static final h a = new h();
    }

    public static h a() {
        return a.a;
    }

    public static d c() {
        return (d) e.c.b.a.i.t.a.d.c(e.c(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d get() {
        return c();
    }
}