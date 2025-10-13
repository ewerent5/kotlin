package e.c.b.a.i.y;

/* compiled from: TimeModule_EventClockFactory.java */
/* loaded from: classes.dex */
public final class c implements e.c.b.a.i.t.a.b<e.c.b.a.i.y.a> {

    /* compiled from: TimeModule_EventClockFactory.java */
    private static final class a {
        private static final c a = new c();
    }

    public static c a() {
        return a.a;
    }

    public static e.c.b.a.i.y.a b() {
        return (e.c.b.a.i.y.a) e.c.b.a.i.t.a.d.c(b.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public e.c.b.a.i.y.a get() {
        return b();
    }
}