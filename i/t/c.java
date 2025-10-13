package i.t;

import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;

/* compiled from: Collections.kt */
/* loaded from: classes3.dex */
final class c<T> implements Collection<T>, i.y.d.z.a, j$.util.Collection {

    /* renamed from: e, reason: collision with root package name */
    private final T[] f15838e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f15839f;

    public c(T[] tArr, boolean z) {
        i.y.d.l.d(tArr, "values");
        this.f15838e = tArr;
        this.f15839f = z;
    }

    public int a() {
        return this.f15838e.length;
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean contains(Object obj) {
        return h.m(this.f15838e, obj);
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean containsAll(Collection<? extends Object> collection) {
        i.y.d.l.d(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean isEmpty() {
        return this.f15838e.length == 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public Iterator<T> iterator() {
        return i.y.d.b.a(this.f15838e);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Q1.v(j$.time.a.L(this), true);
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean retainAll(java.util.Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ int size() {
        return a();
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Q1.v(j$.time.a.L(this), false);
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final Object[] toArray() {
        return k.a(this.f15838e, this.f15839f);
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) i.y.d.f.b(this, tArr);
    }
}