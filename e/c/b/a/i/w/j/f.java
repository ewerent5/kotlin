package e.c.b.a.i.w.j;

/* compiled from: EventStoreModule_DbNameFactory.java */
/* loaded from: classes.dex */
public final class f implements e.c.b.a.i.t.a.b<String> {

    /* compiled from: EventStoreModule_DbNameFactory.java */
    private static final class a {
        private static final f a = new f();
    }

    public static f a() {
        return a.a;
    }

    public static String b() {
        return (String) e.c.b.a.i.t.a.d.c(e.a(), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public String get() {
        return b();
    }
}