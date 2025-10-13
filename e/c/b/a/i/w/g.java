package e.c.b.a.i.w;

/* compiled from: SchedulingConfigModule_ConfigFactory.java */
/* loaded from: classes.dex */
public final class g implements e.c.b.a.i.t.a.b<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> {
    private final h.a.a<e.c.b.a.i.y.a> a;

    public g(h.a.a<e.c.b.a.i.y.a> aVar) {
        this.a = aVar;
    }

    public static com.google.android.datatransport.runtime.scheduling.jobscheduling.g a(e.c.b.a.i.y.a aVar) {
        return (com.google.android.datatransport.runtime.scheduling.jobscheduling.g) e.c.b.a.i.t.a.d.c(f.a(aVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    public static g b(h.a.a<e.c.b.a.i.y.a> aVar) {
        return new g(aVar);
    }

    @Override // h.a.a
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public com.google.android.datatransport.runtime.scheduling.jobscheduling.g get() {
        return a(this.a.get());
    }
}