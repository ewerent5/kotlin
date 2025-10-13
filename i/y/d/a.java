package i.y.d;

import j$.util.Iterator;
import j$.util.function.Consumer;
import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: ArrayIterator.kt */
/* loaded from: classes3.dex */
final class a<T> implements Iterator<T>, i.y.d.z.a, j$.util.Iterator {

    /* renamed from: e, reason: collision with root package name */
    private int f15877e;

    /* renamed from: f, reason: collision with root package name */
    private final T[] f15878f;

    public a(T[] tArr) {
        l.d(tArr, "array");
        this.f15878f = tArr;
    }

    @Override // j$.util.Iterator
    public /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public boolean hasNext() {
        return this.f15877e < this.f15878f.length;
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public T next() {
        try {
            T[] tArr = this.f15878f;
            int i2 = this.f15877e;
            this.f15877e = i2 + 1;
            return tArr[i2];
        } catch (ArrayIndexOutOfBoundsException e2) {
            this.f15877e--;
            throw new NoSuchElementException(e2.getMessage());
        }
    }

    @Override // java.util.Iterator, j$.util.Iterator
    public void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}