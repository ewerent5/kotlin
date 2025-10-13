package i.t;

import j$.util.Iterator;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.UnaryOperator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;

/* compiled from: AbstractList.kt */
/* loaded from: classes3.dex */
public abstract class b<E> extends i.t.a<E> implements List<E>, i.y.d.z.a, j$.util.List {

    /* renamed from: e, reason: collision with root package name */
    public static final a f15831e = new a(null);

    /* compiled from: AbstractList.kt */
    public static final class a {
        private a() {
        }

        public final void a(int i2, int i3) {
            if (i2 < 0 || i2 >= i3) {
                throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
            }
        }

        public final void b(int i2, int i3) {
            if (i2 < 0 || i2 > i3) {
                throw new IndexOutOfBoundsException("index: " + i2 + ", size: " + i3);
            }
        }

        public final void c(int i2, int i3, int i4) {
            if (i2 < 0 || i3 > i4) {
                throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3 + ", size: " + i4);
            }
            if (i2 <= i3) {
                return;
            }
            throw new IllegalArgumentException("fromIndex: " + i2 + " > toIndex: " + i3);
        }

        public final boolean d(Collection<?> collection, Collection<?> collection2) {
            i.y.d.l.d(collection, "c");
            i.y.d.l.d(collection2, "other");
            if (collection.size() != collection2.size()) {
                return false;
            }
            Iterator<?> it = collection2.iterator();
            Iterator<?> it2 = collection.iterator();
            while (it2.hasNext()) {
                if (!i.y.d.l.a(it2.next(), it.next())) {
                    return false;
                }
            }
            return true;
        }

        public final int e(Collection<?> collection) {
            i.y.d.l.d(collection, "c");
            Iterator<?> it = collection.iterator();
            int iHashCode = 1;
            while (it.hasNext()) {
                Object next = it.next();
                iHashCode = (iHashCode * 31) + (next != null ? next.hashCode() : 0);
            }
            return iHashCode;
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }
    }

    /* compiled from: AbstractList.kt */
    /* renamed from: i.t.b$b, reason: collision with other inner class name */
    private class C0199b implements Iterator<E>, i.y.d.z.a, j$.util.Iterator {

        /* renamed from: e, reason: collision with root package name */
        private int f15832e;

        public C0199b() {
        }

        protected final int a() {
            return this.f15832e;
        }

        protected final void b(int i2) {
            this.f15832e = i2;
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f15832e < b.this.size();
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public E next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            b bVar = b.this;
            int i2 = this.f15832e;
            this.f15832e = i2 + 1;
            return (E) bVar.get(i2);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    private class c extends b<E>.C0199b implements ListIterator<E>, i.y.d.z.a, j$.util.Iterator {
        public c(int i2) {
            super();
            b.f15831e.b(i2, b.this.size());
            b(i2);
        }

        @Override // java.util.ListIterator
        public void add(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        @Override // java.util.ListIterator
        public boolean hasPrevious() {
            return a() > 0;
        }

        @Override // java.util.ListIterator
        public int nextIndex() {
            return a();
        }

        @Override // java.util.ListIterator
        public E previous() {
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            b bVar = b.this;
            b(a() - 1);
            return (E) bVar.get(a());
        }

        @Override // java.util.ListIterator
        public int previousIndex() {
            return a() - 1;
        }

        @Override // java.util.ListIterator
        public void set(E e2) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* compiled from: AbstractList.kt */
    private static final class d<E> extends b<E> implements RandomAccess {

        /* renamed from: f, reason: collision with root package name */
        private int f15835f;

        /* renamed from: g, reason: collision with root package name */
        private final b<E> f15836g;

        /* renamed from: h, reason: collision with root package name */
        private final int f15837h;

        /* JADX WARN: Multi-variable type inference failed */
        public d(b<? extends E> bVar, int i2, int i3) {
            i.y.d.l.d(bVar, "list");
            this.f15836g = bVar;
            this.f15837h = i2;
            b.f15831e.c(i2, i3, bVar.size());
            this.f15835f = i3 - i2;
        }

        @Override // i.t.a
        public int a() {
            return this.f15835f;
        }

        @Override // i.t.b, java.util.List, j$.util.List
        public E get(int i2) {
            b.f15831e.a(i2, this.f15835f);
            return this.f15836g.get(this.f15837h + i2);
        }
    }

    protected b() {
    }

    @Override // java.util.List, j$.util.List
    public void add(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            return f15831e.d(this, (Collection) obj);
        }
        return false;
    }

    @Override // java.util.List, j$.util.List
    public abstract E get(int i2);

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public int hashCode() {
        return f15831e.e(this);
    }

    @Override // java.util.List, j$.util.List
    public int indexOf(Object obj) {
        java.util.Iterator<E> it = iterator();
        int i2 = 0;
        while (it.hasNext()) {
            if (i.y.d.l.a(it.next(), obj)) {
                return i2;
            }
            i2++;
        }
        return -1;
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public java.util.Iterator<E> iterator() {
        return new C0199b();
    }

    @Override // java.util.List, j$.util.List
    public int lastIndexOf(Object obj) {
        ListIterator<E> listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (i.y.d.l.a(listIterator.previous(), obj)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    @Override // java.util.List, j$.util.List
    public ListIterator<E> listIterator() {
        return new c(0);
    }

    @Override // java.util.List, j$.util.List
    public E remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List, j$.util.List
    public E set(int i2, E e2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.List, j$.util.List
    public java.util.List<E> subList(int i2, int i3) {
        return new d(this, i2, i3);
    }

    @Override // java.util.List, j$.util.List
    public ListIterator<E> listIterator(int i2) {
        return new c(i2);
    }
}