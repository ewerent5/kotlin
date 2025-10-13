package e.c.b.a.i.t.a;

/* compiled from: InstanceFactory.java */
/* loaded from: classes.dex */
public final class c<T> implements b<T> {
    private static final c<Object> a = new c<>(null);

    /* renamed from: b, reason: collision with root package name */
    private final T f14279b;

    private c(T t) {
        this.f14279b = t;
    }

    public static <T> b<T> a(T t) {
        return new c(d.c(t, "instance cannot be null"));
    }

    @Override // h.a.a
    public T get() {
        return this.f14279b;
    }
}