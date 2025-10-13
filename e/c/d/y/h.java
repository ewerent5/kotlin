package e.c.d.y;

import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.Comparator;
import j$.util.Iterator;
import j$.util.Map;
import j$.util.Set;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.Collections;
import java.util.Comparator;
import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Objects;

/* compiled from: LinkedTreeMap.java */
/* loaded from: classes.dex */
public final class h<K, V> extends AbstractMap<K, V> implements Serializable, Map {

    /* renamed from: e, reason: collision with root package name */
    private static final Comparator<Comparable> f15482e = new a();

    /* renamed from: f, reason: collision with root package name */
    Comparator<? super K> f15483f;

    /* renamed from: g, reason: collision with root package name */
    e<K, V> f15484g;

    /* renamed from: h, reason: collision with root package name */
    int f15485h;

    /* renamed from: i, reason: collision with root package name */
    int f15486i;

    /* renamed from: j, reason: collision with root package name */
    final e<K, V> f15487j;

    /* renamed from: k, reason: collision with root package name */
    private h<K, V>.b f15488k;

    /* renamed from: l, reason: collision with root package name */
    private h<K, V>.c f15489l;

    /* compiled from: LinkedTreeMap.java */
    class a implements Comparator<Comparable>, j$.util.Comparator {
        a() {
        }

        @Override // java.util.Comparator, j$.util.Comparator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(Comparable comparable, Comparable comparable2) {
            return comparable.compareTo(comparable2);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ Comparator reversed() {
            return Collections.reverseOrder(this);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ Comparator thenComparing(Function function) {
            return Comparator.CC.$default$thenComparing(this, function);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(Function function, java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, function, comparator);
        }

        @Override // java.util.Comparator, j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparing(java.util.Comparator comparator) {
            return Comparator.CC.$default$thenComparing(this, comparator);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingDouble(ToDoubleFunction toDoubleFunction) {
            return Comparator.CC.$default$thenComparingDouble(this, toDoubleFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingInt(ToIntFunction toIntFunction) {
            return Comparator.CC.$default$thenComparingInt(this, toIntFunction);
        }

        @Override // j$.util.Comparator
        public /* synthetic */ java.util.Comparator thenComparingLong(ToLongFunction toLongFunction) {
            return Comparator.CC.$default$thenComparingLong(this, toLongFunction);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    class b extends AbstractSet<Map.Entry<K, V>> implements Set {

        /* compiled from: LinkedTreeMap.java */
        class a extends h<K, V>.d<Map.Entry<K, V>> {
            a() {
                super();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public Map.Entry<K, V> next() {
                return a();
            }
        }

        b() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
        public boolean contains(Object obj) {
            return (obj instanceof Map.Entry) && h.this.c((Map.Entry) obj) != null;
        }

        @Override // j$.util.Collection, j$.lang.Iterable
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable.CC.$default$forEach(this, consumer);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Set, j$.util.Collection, j$.lang.Iterable
        public Iterator<Map.Entry<K, V>> iterator() {
            return new a();
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Q1.v(j$.time.a.L(this), true);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
        public boolean remove(Object obj) {
            e<K, V> eVarC;
            if (!(obj instanceof Map.Entry) || (eVarC = h.this.c((Map.Entry) obj)) == null) {
                return false;
            }
            h.this.f(eVarC, true);
            return true;
        }

        @Override // j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
        public int size() {
            return h.this.f15485h;
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Set, j$.util.Collection, j$.lang.Iterable
        public /* synthetic */ Spliterator spliterator() {
            return Set.CC.$default$spliterator(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream stream() {
            return Q1.v(j$.time.a.L(this), false);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    final class c extends AbstractSet<K> implements Set {

        /* compiled from: LinkedTreeMap.java */
        class a extends h<K, V>.d<K> {
            a() {
                super();
            }

            @Override // java.util.Iterator, j$.util.Iterator
            public K next() {
                return a().f15503j;
            }
        }

        c() {
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
        public void clear() {
            h.this.clear();
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
        public boolean contains(Object obj) {
            return h.this.containsKey(obj);
        }

        @Override // j$.util.Collection, j$.lang.Iterable
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable.CC.$default$forEach(this, consumer);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Set, j$.util.Collection, j$.lang.Iterable
        public Iterator<K> iterator() {
            return new a();
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Q1.v(j$.time.a.L(this), true);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
        public boolean remove(Object obj) {
            return h.this.g(obj) != null;
        }

        @Override // j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
        public int size() {
            return h.this.f15485h;
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Set, j$.util.Collection, j$.lang.Iterable
        public /* synthetic */ Spliterator spliterator() {
            return Set.CC.$default$spliterator(this);
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream stream() {
            return Q1.v(j$.time.a.L(this), false);
        }
    }

    /* compiled from: LinkedTreeMap.java */
    private abstract class d<T> implements Iterator<T>, j$.util.Iterator {

        /* renamed from: e, reason: collision with root package name */
        e<K, V> f15494e;

        /* renamed from: f, reason: collision with root package name */
        e<K, V> f15495f = null;

        /* renamed from: g, reason: collision with root package name */
        int f15496g;

        d() {
            this.f15494e = h.this.f15487j.f15501h;
            this.f15496g = h.this.f15486i;
        }

        final e<K, V> a() {
            e<K, V> eVar = this.f15494e;
            h hVar = h.this;
            if (eVar == hVar.f15487j) {
                throw new NoSuchElementException();
            }
            if (hVar.f15486i != this.f15496g) {
                throw new ConcurrentModificationException();
            }
            this.f15494e = eVar.f15501h;
            this.f15495f = eVar;
            return eVar;
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final boolean hasNext() {
            return this.f15494e != h.this.f15487j;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final void remove() {
            e<K, V> eVar = this.f15495f;
            if (eVar == null) {
                throw new IllegalStateException();
            }
            h.this.f(eVar, true);
            this.f15495f = null;
            this.f15496g = h.this.f15486i;
        }
    }

    public h() {
        this(f15482e);
    }

    private boolean a(Object obj, Object obj2) {
        return obj == obj2 || (obj != null && obj.equals(obj2));
    }

    private void e(e<K, V> eVar, boolean z) {
        while (eVar != null) {
            e<K, V> eVar2 = eVar.f15499f;
            e<K, V> eVar3 = eVar.f15500g;
            int i2 = eVar2 != null ? eVar2.f15505l : 0;
            int i3 = eVar3 != null ? eVar3.f15505l : 0;
            int i4 = i2 - i3;
            if (i4 == -2) {
                e<K, V> eVar4 = eVar3.f15499f;
                e<K, V> eVar5 = eVar3.f15500g;
                int i5 = (eVar4 != null ? eVar4.f15505l : 0) - (eVar5 != null ? eVar5.f15505l : 0);
                if (i5 == -1 || (i5 == 0 && !z)) {
                    i(eVar);
                } else {
                    j(eVar3);
                    i(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 2) {
                e<K, V> eVar6 = eVar2.f15499f;
                e<K, V> eVar7 = eVar2.f15500g;
                int i6 = (eVar6 != null ? eVar6.f15505l : 0) - (eVar7 != null ? eVar7.f15505l : 0);
                if (i6 == 1 || (i6 == 0 && !z)) {
                    j(eVar);
                } else {
                    i(eVar2);
                    j(eVar);
                }
                if (z) {
                    return;
                }
            } else if (i4 == 0) {
                eVar.f15505l = i2 + 1;
                if (z) {
                    return;
                }
            } else {
                eVar.f15505l = Math.max(i2, i3) + 1;
                if (!z) {
                    return;
                }
            }
            eVar = eVar.f15498e;
        }
    }

    private void h(e<K, V> eVar, e<K, V> eVar2) {
        e<K, V> eVar3 = eVar.f15498e;
        eVar.f15498e = null;
        if (eVar2 != null) {
            eVar2.f15498e = eVar3;
        }
        if (eVar3 == null) {
            this.f15484g = eVar2;
        } else if (eVar3.f15499f == eVar) {
            eVar3.f15499f = eVar2;
        } else {
            eVar3.f15500g = eVar2;
        }
    }

    private void i(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f15499f;
        e<K, V> eVar3 = eVar.f15500g;
        e<K, V> eVar4 = eVar3.f15499f;
        e<K, V> eVar5 = eVar3.f15500g;
        eVar.f15500g = eVar4;
        if (eVar4 != null) {
            eVar4.f15498e = eVar;
        }
        h(eVar, eVar3);
        eVar3.f15499f = eVar;
        eVar.f15498e = eVar3;
        int iMax = Math.max(eVar2 != null ? eVar2.f15505l : 0, eVar4 != null ? eVar4.f15505l : 0) + 1;
        eVar.f15505l = iMax;
        eVar3.f15505l = Math.max(iMax, eVar5 != null ? eVar5.f15505l : 0) + 1;
    }

    private void j(e<K, V> eVar) {
        e<K, V> eVar2 = eVar.f15499f;
        e<K, V> eVar3 = eVar.f15500g;
        e<K, V> eVar4 = eVar2.f15499f;
        e<K, V> eVar5 = eVar2.f15500g;
        eVar.f15499f = eVar5;
        if (eVar5 != null) {
            eVar5.f15498e = eVar;
        }
        h(eVar, eVar2);
        eVar2.f15500g = eVar;
        eVar.f15498e = eVar2;
        int iMax = Math.max(eVar3 != null ? eVar3.f15505l : 0, eVar5 != null ? eVar5.f15505l : 0) + 1;
        eVar.f15505l = iMax;
        eVar2.f15505l = Math.max(iMax, eVar4 != null ? eVar4.f15505l : 0) + 1;
    }

    e<K, V> b(K k2, boolean z) {
        int iCompareTo;
        e<K, V> eVar;
        java.util.Comparator<? super K> comparator = this.f15483f;
        e<K, V> eVar2 = this.f15484g;
        if (eVar2 != null) {
            Comparable comparable = comparator == f15482e ? (Comparable) k2 : null;
            while (true) {
                iCompareTo = comparable != null ? comparable.compareTo(eVar2.f15503j) : comparator.compare(k2, eVar2.f15503j);
                if (iCompareTo == 0) {
                    return eVar2;
                }
                e<K, V> eVar3 = iCompareTo < 0 ? eVar2.f15499f : eVar2.f15500g;
                if (eVar3 == null) {
                    break;
                }
                eVar2 = eVar3;
            }
        } else {
            iCompareTo = 0;
        }
        if (!z) {
            return null;
        }
        e<K, V> eVar4 = this.f15487j;
        if (eVar2 != null) {
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f15502i);
            if (iCompareTo < 0) {
                eVar2.f15499f = eVar;
            } else {
                eVar2.f15500g = eVar;
            }
            e(eVar2, true);
        } else {
            if (comparator == f15482e && !(k2 instanceof Comparable)) {
                throw new ClassCastException(k2.getClass().getName() + " is not Comparable");
            }
            eVar = new e<>(eVar2, k2, eVar4, eVar4.f15502i);
            this.f15484g = eVar;
        }
        this.f15485h++;
        this.f15486i++;
        return eVar;
    }

    e<K, V> c(Map.Entry<?, ?> entry) {
        e<K, V> eVarD = d(entry.getKey());
        if (eVarD != null && a(eVarD.f15504k, entry.getValue())) {
            return eVarD;
        }
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map, java.util.HashMap
    public void clear() {
        this.f15484g = null;
        this.f15485h = 0;
        this.f15486i++;
        e<K, V> eVar = this.f15487j;
        eVar.f15502i = eVar;
        eVar.f15501h = eVar;
    }

    @Override // j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        return d(obj) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    e<K, V> d(Object obj) {
        if (obj == 0) {
            return null;
        }
        try {
            return b(obj, false);
        } catch (ClassCastException unused) {
            return null;
        }
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public java.util.Set<Map.Entry<K, V>> entrySet() {
        h<K, V>.b bVar = this.f15488k;
        if (bVar != null) {
            return bVar;
        }
        h<K, V>.b bVar2 = new b();
        this.f15488k = bVar2;
        return bVar2;
    }

    void f(e<K, V> eVar, boolean z) {
        int i2;
        if (z) {
            e<K, V> eVar2 = eVar.f15502i;
            eVar2.f15501h = eVar.f15501h;
            eVar.f15501h.f15502i = eVar2;
        }
        e<K, V> eVar3 = eVar.f15499f;
        e<K, V> eVar4 = eVar.f15500g;
        e<K, V> eVar5 = eVar.f15498e;
        int i3 = 0;
        if (eVar3 == null || eVar4 == null) {
            if (eVar3 != null) {
                h(eVar, eVar3);
                eVar.f15499f = null;
            } else if (eVar4 != null) {
                h(eVar, eVar4);
                eVar.f15500g = null;
            } else {
                h(eVar, null);
            }
            e(eVar5, false);
            this.f15485h--;
            this.f15486i++;
            return;
        }
        e<K, V> eVarB = eVar3.f15505l > eVar4.f15505l ? eVar3.b() : eVar4.a();
        f(eVarB, false);
        e<K, V> eVar6 = eVar.f15499f;
        if (eVar6 != null) {
            i2 = eVar6.f15505l;
            eVarB.f15499f = eVar6;
            eVar6.f15498e = eVarB;
            eVar.f15499f = null;
        } else {
            i2 = 0;
        }
        e<K, V> eVar7 = eVar.f15500g;
        if (eVar7 != null) {
            i3 = eVar7.f15505l;
            eVarB.f15500g = eVar7;
            eVar7.f15498e = eVarB;
            eVar.f15500g = null;
        }
        eVarB.f15505l = Math.max(i2, i3) + 1;
        h(eVar, eVarB);
    }

    @Override // j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    e<K, V> g(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            f(eVarD, true);
        }
        return eVarD;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V get(Object obj) {
        e<K, V> eVarD = d(obj);
        if (eVarD != null) {
            return eVarD.f15504k;
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public java.util.Set<K> keySet() {
        h<K, V>.c cVar = this.f15489l;
        if (cVar != null) {
            return cVar;
        }
        h<K, V>.c cVar2 = new c();
        this.f15489l = cVar2;
        return cVar2;
    }

    @Override // j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V put(K k2, V v) {
        Objects.requireNonNull(k2, "key == null");
        e<K, V> eVarB = b(k2, true);
        V v2 = eVarB.f15504k;
        eVarB.f15504k = v;
        return v2;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V remove(Object obj) {
        e<K, V> eVarG = g(obj);
        if (eVarG != null) {
            return eVarG.f15504k;
        }
        return null;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int size() {
        return this.f15485h;
    }

    public h(java.util.Comparator<? super K> comparator) {
        this.f15485h = 0;
        this.f15486i = 0;
        this.f15487j = new e<>();
        this.f15483f = comparator == null ? f15482e : comparator;
    }

    /* compiled from: LinkedTreeMap.java */
    static final class e<K, V> implements Map.Entry<K, V>, Map.Entry {

        /* renamed from: e, reason: collision with root package name */
        e<K, V> f15498e;

        /* renamed from: f, reason: collision with root package name */
        e<K, V> f15499f;

        /* renamed from: g, reason: collision with root package name */
        e<K, V> f15500g;

        /* renamed from: h, reason: collision with root package name */
        e<K, V> f15501h;

        /* renamed from: i, reason: collision with root package name */
        e<K, V> f15502i;

        /* renamed from: j, reason: collision with root package name */
        final K f15503j;

        /* renamed from: k, reason: collision with root package name */
        V f15504k;

        /* renamed from: l, reason: collision with root package name */
        int f15505l;

        e() {
            this.f15503j = null;
            this.f15502i = this;
            this.f15501h = this;
        }

        public e<K, V> a() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f15499f; eVar2 != null; eVar2 = eVar2.f15499f) {
                eVar = eVar2;
            }
            return eVar;
        }

        public e<K, V> b() {
            e<K, V> eVar = this;
            for (e<K, V> eVar2 = this.f15500g; eVar2 != null; eVar2 = eVar2.f15500g) {
                eVar = eVar2;
            }
            return eVar;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public boolean equals(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k2 = this.f15503j;
            if (k2 == null) {
                if (entry.getKey() != null) {
                    return false;
                }
            } else if (!k2.equals(entry.getKey())) {
                return false;
            }
            V v = this.f15504k;
            if (v == null) {
                if (entry.getValue() != null) {
                    return false;
                }
            } else if (!v.equals(entry.getValue())) {
                return false;
            }
            return true;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public K getKey() {
            return this.f15503j;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public V getValue() {
            return this.f15504k;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public int hashCode() {
            K k2 = this.f15503j;
            int iHashCode = k2 == null ? 0 : k2.hashCode();
            V v = this.f15504k;
            return iHashCode ^ (v != null ? v.hashCode() : 0);
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public V setValue(V v) {
            V v2 = this.f15504k;
            this.f15504k = v;
            return v2;
        }

        public String toString() {
            return this.f15503j + "=" + this.f15504k;
        }

        e(e<K, V> eVar, K k2, e<K, V> eVar2, e<K, V> eVar3) {
            this.f15498e = eVar;
            this.f15503j = k2;
            this.f15505l = 1;
            this.f15501h = eVar2;
            this.f15502i = eVar3;
            eVar3.f15501h = this;
            eVar2.f15502i = this;
        }
    }
}