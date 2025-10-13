package c.h.k;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public class g<T> extends f<T> {

    /* renamed from: c, reason: collision with root package name */
    private final Object f3107c;

    public g(int i2) {
        super(i2);
        this.f3107c = new Object();
    }

    @Override // c.h.k.f, c.h.k.e
    public boolean a(T t) {
        boolean zA;
        synchronized (this.f3107c) {
            zA = super.a(t);
        }
        return zA;
    }

    @Override // c.h.k.f, c.h.k.e
    public T b() {
        T t;
        synchronized (this.f3107c) {
            t = (T) super.b();
        }
        return t;
    }
}