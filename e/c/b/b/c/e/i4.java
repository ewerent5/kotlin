package e.c.b.b.c.e;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
abstract class i4<T> implements Iterator<T>, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    private int f14602e;

    /* renamed from: f, reason: collision with root package name */
    private int f14603f;

    /* renamed from: g, reason: collision with root package name */
    private int f14604g;

    /* renamed from: h, reason: collision with root package name */
    private final /* synthetic */ b4 f14605h;

    private i4(b4 b4Var) {
        this.f14605h = b4Var;
        this.f14602e = b4Var.f14401j;
        this.f14603f = b4Var.p();
        this.f14604g = -1;
    }

    private final void b() {
        if (this.f14605h.f14401j != this.f14602e) {
            throw new ConcurrentModificationException();
        }
    }

    abstract T a(int i2);

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        return this.f14603f >= 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public T next() {
        b();
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f14603f;
        this.f14604g = i2;
        T tA = a(i2);
        this.f14603f = this.f14605h.a(this.f14603f);
        return tA;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public void remove() {
        b();
        q3.h(this.f14604g >= 0, "no calls to next() since the last call to remove()");
        this.f14602e += 32;
        b4 b4Var = this.f14605h;
        b4Var.remove(b4Var.f14399h[this.f14604g]);
        this.f14603f = b4.h(this.f14603f, this.f14604g);
        this.f14604g = -1;
    }

    /* synthetic */ i4(b4 b4Var, e4 e4Var) {
        this(b4Var);
    }
}