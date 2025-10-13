package i;

import java.io.Serializable;

/* compiled from: LazyJVM.kt */
/* loaded from: classes3.dex */
final class o<T> implements g<T>, Serializable {

    /* renamed from: e, reason: collision with root package name */
    private i.y.c.a<? extends T> f15827e;

    /* renamed from: f, reason: collision with root package name */
    private volatile Object f15828f;

    /* renamed from: g, reason: collision with root package name */
    private final Object f15829g;

    public o(i.y.c.a<? extends T> aVar, Object obj) {
        i.y.d.l.d(aVar, "initializer");
        this.f15827e = aVar;
        this.f15828f = q.a;
        this.f15829g = obj == null ? this : obj;
    }

    public boolean a() {
        return this.f15828f != q.a;
    }

    @Override // i.g
    public T getValue() {
        T tInvoke;
        T t = (T) this.f15828f;
        q qVar = q.a;
        if (t != qVar) {
            return t;
        }
        synchronized (this.f15829g) {
            tInvoke = (T) this.f15828f;
            if (tInvoke == qVar) {
                i.y.c.a<? extends T> aVar = this.f15827e;
                i.y.d.l.b(aVar);
                tInvoke = aVar.invoke();
                this.f15828f = tInvoke;
                this.f15827e = null;
            }
        }
        return tInvoke;
    }

    public String toString() {
        return a() ? String.valueOf(getValue()) : "Lazy value not initialized yet.";
    }

    public /* synthetic */ o(i.y.c.a aVar, Object obj, int i2, i.y.d.g gVar) {
        this(aVar, (i2 & 2) != 0 ? null : obj);
    }
}