package e.c.b.b.c.e;

import java.util.NoSuchElementException;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
abstract class y3<E> extends m5<E> {

    /* renamed from: e, reason: collision with root package name */
    private final int f14942e;

    /* renamed from: f, reason: collision with root package name */
    private int f14943f;

    protected y3(int i2, int i3) {
        q3.g(i3, i2);
        this.f14942e = i2;
        this.f14943f = i3;
    }

    protected abstract E a(int i2);

    @Override // java.util.Iterator, j$.util.Iterator
    public final boolean hasNext() {
        return this.f14943f < this.f14942e;
    }

    @Override // java.util.ListIterator
    public final boolean hasPrevious() {
        return this.f14943f > 0;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public final E next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f14943f;
        this.f14943f = i2 + 1;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int nextIndex() {
        return this.f14943f;
    }

    @Override // java.util.ListIterator
    public final E previous() {
        if (!hasPrevious()) {
            throw new NoSuchElementException();
        }
        int i2 = this.f14943f - 1;
        this.f14943f = i2;
        return a(i2);
    }

    @Override // java.util.ListIterator
    public final int previousIndex() {
        return this.f14943f - 1;
    }
}