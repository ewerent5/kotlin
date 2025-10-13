package e.c.b.a.i.t.a;

/* compiled from: DoubleCheck.java */
/* loaded from: classes.dex */
public final class a<T> implements h.a.a<T> {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile h.a.a<T> f14277b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f14278c = a;

    private a(h.a.a<T> aVar) {
        this.f14277b = aVar;
    }

    public static <P extends h.a.a<T>, T> h.a.a<T> a(P p) {
        d.b(p);
        return p instanceof a ? p : new a(p);
    }

    public static Object b(Object obj, Object obj2) {
        if (!(obj != a) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // h.a.a
    public T get() {
        T t = (T) this.f14278c;
        Object obj = a;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f14278c;
                if (t == obj) {
                    t = this.f14277b.get();
                    this.f14278c = b(this.f14278c, t);
                    this.f14277b = null;
                }
            }
        }
        return t;
    }
}