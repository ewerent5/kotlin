package f.c;

/* compiled from: InstanceFactory.java */
/* loaded from: classes3.dex */
public final class d<T> implements c<T>, f.a<T> {
    private static final d<Object> a = new d<>(null);

    /* renamed from: b, reason: collision with root package name */
    private final T f15707b;

    private d(T t) {
        this.f15707b = t;
    }

    public static <T> c<T> a(T t) {
        return new d(f.c(t, "instance cannot be null"));
    }

    @Override // h.a.a
    public T get() {
        return this.f15707b;
    }
}