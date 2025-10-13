package i.t;

import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* compiled from: AbstractCollection.kt */
/* loaded from: classes3.dex */
public abstract class a<E> implements Collection<E>, i.y.d.z.a, j$.util.Collection {

    /* compiled from: AbstractCollection.kt */
    /* renamed from: i.t.a$a, reason: collision with other inner class name */
    static final class C0198a extends i.y.d.m implements i.y.c.l<E, CharSequence> {
        C0198a() {
            super(1);
        }

        @Override // i.y.c.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(E e2) {
            return e2 == a.this ? "(this Collection)" : String.valueOf(e2);
        }
    }

    protected a() {
    }

    public abstract int a();

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean add(E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean contains(Object obj) {
        if (isEmpty()) {
            return false;
        }
        Iterator<E> it = iterator();
        while (it.hasNext()) {
            if (i.y.d.l.a(it.next(), obj)) {
                return true;
            }
        }
        return false;
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
        return size() == 0;
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

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Q1.v(j$.time.a.L(this), false);
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public Object[] toArray() {
        return i.y.d.f.a(this);
    }

    public String toString() {
        return t.A(this, ", ", "[", "]", 0, null, new C0198a(), 24, null);
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public <T> T[] toArray(T[] tArr) {
        i.y.d.l.d(tArr, "array");
        T[] tArr2 = (T[]) i.y.d.f.b(this, tArr);
        Objects.requireNonNull(tArr2, "null cannot be cast to non-null type kotlin.Array<T>");
        return tArr2;
    }
}