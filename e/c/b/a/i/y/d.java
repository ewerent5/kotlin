package e.c.b.a.i.y;

/* compiled from: TimeModule_UptimeClockFactory.java */
/* loaded from: classes.dex */
public final class d implements e.c.b.a.i.t.a.b<e.c.b.a.i.y.a> {

    /* compiled from: TimeModule_UptimeClockFactory.java */
    private static final class a {
        private static final d a = new d();
    }

    public static d a() {
        return a.a;
    }

    public static e.c.b.a.i.y.a c() {
        return (e.c.b.a.i.y.a) e.c.b.a.i.t.a.d.c(b.b(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public e.c.b.a.i.y.a get() {
        return c();
    }
}