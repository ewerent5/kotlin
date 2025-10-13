package c.h.k;

/* compiled from: Pools.java */
/* loaded from: classes.dex */
public class f<T> implements e<T> {
    private final Object[] a;

    /* renamed from: b, reason: collision with root package name */
    private int f3106b;

    public f(int i2) {
        if (i2 <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.a = new Object[i2];
    }

    private boolean c(T t) {
        for (int i2 = 0; i2 < this.f3106b; i2++) {
            if (this.a[i2] == t) {
                return true;
            }
        }
        return false;
    }

    @Override // c.h.k.e
    public boolean a(T t) {
        if (c(t)) {
            throw new IllegalStateException("Already in the pool!");
        }
        int i2 = this.f3106b;
        Object[] objArr = this.a;
        if (i2 >= objArr.length) {
            return false;
        }
        objArr[i2] = t;
        this.f3106b = i2 + 1;
        return true;
    }

    @Override // c.h.k.e
    public T b() {
        int i2 = this.f3106b;
        if (i2 <= 0) {
            return null;
        }
        int i3 = i2 - 1;
        Object[] objArr = this.a;
        T t = (T) objArr[i3];
        objArr[i3] = null;
        this.f3106b = i2 - 1;
        return t;
    }
}