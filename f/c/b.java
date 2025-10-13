package f.c;

/* compiled from: DoubleCheck.java */
/* loaded from: classes3.dex */
public final class b<T> implements h.a.a<T>, f.a<T> {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile h.a.a<T> f15705b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f15706c = a;

    private b(h.a.a<T> aVar) {
        this.f15705b = aVar;
    }

    public static <P extends h.a.a<T>, T> f.a<T> a(P p) {
        return p instanceof f.a ? (f.a) p : new b((h.a.a) f.b(p));
    }

    public static <P extends h.a.a<T>, T> h.a.a<T> b(P p) {
        f.b(p);
        return p instanceof b ? p : new b(p);
    }

    public static Object c(Object obj, Object obj2) {
        if (!(obj != a) || obj == obj2) {
            return obj2;
        }
        throw new IllegalStateException("Scoped provider was invoked recursively returning different results: " + obj + " & " + obj2 + ". This is likely due to a circular dependency.");
    }

    @Override // h.a.a
    public T get() {
        T t = (T) this.f15706c;
        Object obj = a;
        if (t == obj) {
            synchronized (this) {
                t = (T) this.f15706c;
                if (t == obj) {
                    t = this.f15705b.get();
                    this.f15706c = c(this.f15706c, t);
                    this.f15705b = null;
                }
            }
        }
        return t;
    }
}