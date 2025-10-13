package c.e;

import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.Iterator;
import j$.util.Map;
import j$.util.Set;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

/* compiled from: MapCollections.java */
/* loaded from: classes.dex */
abstract class f<K, V> {
    f<K, V>.b a;

    /* renamed from: b, reason: collision with root package name */
    f<K, V>.c f2728b;

    /* renamed from: c, reason: collision with root package name */
    f<K, V>.e f2729c;

    /* compiled from: MapCollections.java */
    final class a<T> implements Iterator<T>, j$.util.Iterator {

        /* renamed from: e, reason: collision with root package name */
        final int f2730e;

        /* renamed from: f, reason: collision with root package name */
        int f2731f;

        /* renamed from: g, reason: collision with root package name */
        int f2732g;

        /* renamed from: h, reason: collision with root package name */
        boolean f2733h = false;

        a(int i2) {
            this.f2730e = i2;
            this.f2731f = f.this.d();
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f2732g < this.f2731f;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public T next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            T t = (T) f.this.b(this.f2732g, this.f2730e);
            this.f2732g++;
            this.f2733h = true;
            return t;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            if (!this.f2733h) {
                throw new IllegalStateException();
            }
            int i2 = this.f2732g - 1;
            this.f2732g = i2;
            this.f2731f--;
            this.f2733h = false;
            f.this.h(i2);
        }
    }

    /* compiled from: MapCollections.java */
    final class b implements Set<Map.Entry<K, V>>, j$.util.Set {
        b() {
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public boolean add(Map.Entry<K, V> entry) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int iD = f.this.d();
            for (Map.Entry<K, V> entry : collection) {
                f.this.g(entry.getKey(), entry.getValue());
            }
            return iD != f.this.d();
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int iE = f.this.e(entry.getKey());
            if (iE < 0) {
                return false;
            }
            return c.e.c.c(f.this.b(iE, 1), entry.getValue());
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean containsAll(Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
            while (it.hasNext()) {
                if (!contains(it.next())) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        @Override // j$.util.Collection, j$.lang.Iterable
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable.CC.$default$forEach(this, consumer);
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = f.this.d() - 1; iD >= 0; iD--) {
                Object objB = f.this.b(iD, 0);
                Object objB2 = f.this.b(iD, 1);
                iHashCode += (objB == null ? 0 : objB.hashCode()) ^ (objB2 == null ? 0 : objB2.hashCode());
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable, j$.util.Set, j$.util.Collection, j$.lang.Iterable
        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new d();
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Q1.v(j$.time.a.L(this), true);
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean retainAll(java.util.Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable, j$.util.Set, j$.util.Collection, j$.lang.Iterable
        public /* synthetic */ Spliterator spliterator() {
            return Set.CC.$default$spliterator(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream stream() {
            return Q1.v(j$.time.a.L(this), false);
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* compiled from: MapCollections.java */
    final class c implements java.util.Set<K>, j$.util.Set {
        c() {
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean add(K k2) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean addAll(java.util.Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean contains(Object obj) {
            return f.this.e(obj) >= 0;
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean containsAll(java.util.Collection<?> collection) {
            return f.j(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean equals(Object obj) {
            return f.k(this, obj);
        }

        @Override // j$.util.Collection, j$.lang.Iterable
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable.CC.$default$forEach(this, consumer);
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public int hashCode() {
            int iHashCode = 0;
            for (int iD = f.this.d() - 1; iD >= 0; iD--) {
                Object objB = f.this.b(iD, 0);
                iHashCode += objB == null ? 0 : objB.hashCode();
            }
            return iHashCode;
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean isEmpty() {
            return f.this.d() == 0;
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable, j$.util.Set, j$.util.Collection, j$.lang.Iterable
        public java.util.Iterator<K> iterator() {
            return new a(0);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Q1.v(j$.time.a.L(this), true);
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean remove(Object obj) {
            int iE = f.this.e(obj);
            if (iE < 0) {
                return false;
            }
            f.this.h(iE);
            return true;
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean removeAll(java.util.Collection<?> collection) {
            return f.o(f.this.c(), collection);
        }

        @Override // j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public boolean retainAll(java.util.Collection<?> collection) {
            return f.p(f.this.c(), collection);
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public int size() {
            return f.this.d();
        }

        @Override // java.util.Set, java.util.Collection, java.lang.Iterable, j$.util.Set, j$.util.Collection, j$.lang.Iterable
        public /* synthetic */ Spliterator spliterator() {
            return Set.CC.$default$spliterator(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream stream() {
            return Q1.v(j$.time.a.L(this), false);
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public Object[] toArray() {
            return f.this.q(0);
        }

        @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
        public <T> T[] toArray(T[] tArr) {
            return (T[]) f.this.r(tArr, 0);
        }
    }

    /* compiled from: MapCollections.java */
    final class d implements java.util.Iterator<Map.Entry<K, V>>, Map.Entry<K, V>, Map.Entry, j$.util.Iterator {

        /* renamed from: e, reason: collision with root package name */
        int f2737e;

        /* renamed from: g, reason: collision with root package name */
        boolean f2739g = false;

        /* renamed from: f, reason: collision with root package name */
        int f2738f = -1;

        d() {
            this.f2737e = f.this.d() - 1;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            this.f2738f++;
            this.f2739g = true;
            return this;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public boolean equals(Object obj) {
            if (!this.f2739g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            return c.e.c.c(entry.getKey(), f.this.b(this.f2738f, 0)) && c.e.c.c(entry.getValue(), f.this.b(this.f2738f, 1));
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public K getKey() {
            if (this.f2739g) {
                return (K) f.this.b(this.f2738f, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public V getValue() {
            if (this.f2739g) {
                return (V) f.this.b(this.f2738f, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f2738f < this.f2737e;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public int hashCode() {
            if (!this.f2739g) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            }
            Object objB = f.this.b(this.f2738f, 0);
            Object objB2 = f.this.b(this.f2738f, 1);
            return (objB == null ? 0 : objB.hashCode()) ^ (objB2 != null ? objB2.hashCode() : 0);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public void remove() {
            if (!this.f2739g) {
                throw new IllegalStateException();
            }
            f.this.h(this.f2738f);
            this.f2738f--;
            this.f2737e--;
            this.f2739g = false;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public V setValue(V v) {
            if (this.f2739g) {
                return (V) f.this.i(this.f2738f, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* compiled from: MapCollections.java */
    final class e implements java.util.Collection<V>, j$.util.Collection {
        e() {
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean addAll(java.util.Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public void clear() {
            f.this.a();
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean contains(Object obj) {
            return f.this.f(obj) >= 0;
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean containsAll(java.util.Collection<?> collection) {
            java.util.Iterator<?> it = collection.iterator();
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
            return f.this.d() == 0;
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
        public java.util.Iterator<V> iterator() {
            return new a(1);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Q1.v(j$.time.a.L(this), true);
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean remove(Object obj) {
            int iF = f.this.f(obj);
            if (iF < 0) {
                return false;
            }
            f.this.h(iF);
            return true;
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean removeAll(java.util.Collection<?> collection) {
            int iD = f.this.d();
            int i2 = 0;
            boolean z = false;
            while (i2 < iD) {
                if (collection.contains(f.this.b(i2, 1))) {
                    f.this.h(i2);
                    i2--;
                    iD--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean retainAll(java.util.Collection<?> collection) {
            int iD = f.this.d();
            int i2 = 0;
            boolean z = false;
            while (i2 < iD) {
                if (!collection.contains(f.this.b(i2, 1))) {
                    f.this.h(i2);
                    i2--;
                    iD--;
                    z = true;
                }
                i2++;
            }
            return z;
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public int size() {
            return f.this.d();
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
        public Object[] toArray() {
            return f.this.q(1);
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public <T> T[] toArray(T[] tArr) {
            return (T[]) f.this.r(tArr, 1);
        }
    }

    f() {
    }

    public static <K, V> boolean j(java.util.Map<K, V> map, java.util.Collection<?> collection) {
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!map.containsKey(it.next())) {
                return false;
            }
        }
        return true;
    }

    public static <T> boolean k(java.util.Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof java.util.Set) {
            java.util.Set set2 = (java.util.Set) obj;
            try {
                if (set.size() == set2.size()) {
                    if (set.containsAll(set2)) {
                        return true;
                    }
                }
                return false;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    public static <K, V> boolean o(java.util.Map<K, V> map, java.util.Collection<?> collection) {
        int size = map.size();
        java.util.Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            map.remove(it.next());
        }
        return size != map.size();
    }

    public static <K, V> boolean p(java.util.Map<K, V> map, java.util.Collection<?> collection) {
        int size = map.size();
        java.util.Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        return size != map.size();
    }

    protected abstract void a();

    protected abstract Object b(int i2, int i3);

    protected abstract java.util.Map<K, V> c();

    protected abstract int d();

    protected abstract int e(Object obj);

    protected abstract int f(Object obj);

    protected abstract void g(K k2, V v);

    protected abstract void h(int i2);

    protected abstract V i(int i2, V v);

    public java.util.Set<Map.Entry<K, V>> l() {
        if (this.a == null) {
            this.a = new b();
        }
        return this.a;
    }

    public java.util.Set<K> m() {
        if (this.f2728b == null) {
            this.f2728b = new c();
        }
        return this.f2728b;
    }

    public java.util.Collection<V> n() {
        if (this.f2729c == null) {
            this.f2729c = new e();
        }
        return this.f2729c;
    }

    public Object[] q(int i2) {
        int iD = d();
        Object[] objArr = new Object[iD];
        for (int i3 = 0; i3 < iD; i3++) {
            objArr[i3] = b(i3, i2);
        }
        return objArr;
    }

    public <T> T[] r(T[] tArr, int i2) {
        int iD = d();
        if (tArr.length < iD) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), iD));
        }
        for (int i3 = 0; i3 < iD; i3++) {
            tArr[i3] = b(i3, i2);
        }
        if (tArr.length > iD) {
            tArr[iD] = null;
        }
        return tArr;
    }
}