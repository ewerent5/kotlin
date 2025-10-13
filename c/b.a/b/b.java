package c.b.a.b;

import j$.lang.Iterable;
import j$.util.Iterator;
import j$.util.Map;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.v;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;

/* compiled from: SafeIterableMap.java */
/* loaded from: classes.dex */
public class b<K, V> implements Iterable<Map.Entry<K, V>>, Iterable {

    /* renamed from: e, reason: collision with root package name */
    c<K, V> f2629e;

    /* renamed from: f, reason: collision with root package name */
    private c<K, V> f2630f;

    /* renamed from: g, reason: collision with root package name */
    private WeakHashMap<f<K, V>, Boolean> f2631g = new WeakHashMap<>();

    /* renamed from: h, reason: collision with root package name */
    private int f2632h = 0;

    /* compiled from: SafeIterableMap.java */
    static class a<K, V> extends e<K, V> {
        a(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // c.b.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f2636h;
        }

        @Override // c.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f2635g;
        }
    }

    /* compiled from: SafeIterableMap.java */
    /* renamed from: c.b.a.b.b$b, reason: collision with other inner class name */
    private static class C0045b<K, V> extends e<K, V> {
        C0045b(c<K, V> cVar, c<K, V> cVar2) {
            super(cVar, cVar2);
        }

        @Override // c.b.a.b.b.e
        c<K, V> b(c<K, V> cVar) {
            return cVar.f2635g;
        }

        @Override // c.b.a.b.b.e
        c<K, V> c(c<K, V> cVar) {
            return cVar.f2636h;
        }
    }

    /* compiled from: SafeIterableMap.java */
    static class c<K, V> implements Map.Entry<K, V>, Map.Entry {

        /* renamed from: e, reason: collision with root package name */
        final K f2633e;

        /* renamed from: f, reason: collision with root package name */
        final V f2634f;

        /* renamed from: g, reason: collision with root package name */
        c<K, V> f2635g;

        /* renamed from: h, reason: collision with root package name */
        c<K, V> f2636h;

        c(K k2, V v) {
            this.f2633e = k2;
            this.f2634f = v;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f2633e.equals(cVar.f2633e) && this.f2634f.equals(cVar.f2634f);
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public K getKey() {
            return this.f2633e;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public V getValue() {
            return this.f2634f;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public int hashCode() {
            return this.f2633e.hashCode() ^ this.f2634f.hashCode();
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public V setValue(V v) {
            throw new UnsupportedOperationException("An entry modification is not supported");
        }

        public String toString() {
            return this.f2633e + "=" + this.f2634f;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* compiled from: SafeIterableMap.java */
    public class d implements Iterator<Map.Entry<K, V>>, f<K, V>, j$.util.Iterator {

        /* renamed from: e, reason: collision with root package name */
        private c<K, V> f2637e;

        /* renamed from: f, reason: collision with root package name */
        private boolean f2638f = true;

        d() {
        }

        @Override // c.b.a.b.b.f
        public void a(c<K, V> cVar) {
            c<K, V> cVar2 = this.f2637e;
            if (cVar == cVar2) {
                c<K, V> cVar3 = cVar2.f2636h;
                this.f2637e = cVar3;
                this.f2638f = cVar3 == null;
            }
        }

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            if (this.f2638f) {
                this.f2638f = false;
                this.f2637e = b.this.f2629e;
            } else {
                c<K, V> cVar = this.f2637e;
                this.f2637e = cVar != null ? cVar.f2635g : null;
            }
            return this.f2637e;
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            if (this.f2638f) {
                return b.this.f2629e != null;
            }
            c<K, V> cVar = this.f2637e;
            return (cVar == null || cVar.f2635g == null) ? false : true;
        }
    }

    /* compiled from: SafeIterableMap.java */
    private static abstract class e<K, V> implements java.util.Iterator<Map.Entry<K, V>>, f<K, V>, j$.util.Iterator {

        /* renamed from: e, reason: collision with root package name */
        c<K, V> f2640e;

        /* renamed from: f, reason: collision with root package name */
        c<K, V> f2641f;

        e(c<K, V> cVar, c<K, V> cVar2) {
            this.f2640e = cVar2;
            this.f2641f = cVar;
        }

        private c<K, V> e() {
            c<K, V> cVar = this.f2641f;
            c<K, V> cVar2 = this.f2640e;
            if (cVar == cVar2 || cVar2 == null) {
                return null;
            }
            return c(cVar);
        }

        @Override // c.b.a.b.b.f
        public void a(c<K, V> cVar) {
            if (this.f2640e == cVar && cVar == this.f2641f) {
                this.f2641f = null;
                this.f2640e = null;
            }
            c<K, V> cVar2 = this.f2640e;
            if (cVar2 == cVar) {
                this.f2640e = b(cVar2);
            }
            if (this.f2641f == cVar) {
                this.f2641f = e();
            }
        }

        abstract c<K, V> b(c<K, V> cVar);

        abstract c<K, V> c(c<K, V> cVar);

        @Override // java.util.Iterator, j$.util.Iterator
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public Map.Entry<K, V> next() {
            c<K, V> cVar = this.f2641f;
            this.f2641f = e();
            return cVar;
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            return this.f2641f != null;
        }
    }

    /* compiled from: SafeIterableMap.java */
    interface f<K, V> {
        void a(c<K, V> cVar);
    }

    public Map.Entry<K, V> a() {
        return this.f2629e;
    }

    protected c<K, V> c(K k2) {
        c<K, V> cVar = this.f2629e;
        while (cVar != null && !cVar.f2633e.equals(k2)) {
            cVar = cVar.f2635g;
        }
        return cVar;
    }

    public java.util.Iterator<Map.Entry<K, V>> descendingIterator() {
        C0045b c0045b = new C0045b(this.f2630f, this.f2629e);
        this.f2631g.put(c0045b, Boolean.FALSE);
        return c0045b;
    }

    public b<K, V>.d e() {
        b<K, V>.d dVar = new d();
        this.f2631g.put(dVar, Boolean.FALSE);
        return dVar;
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        if (size() != bVar.size()) {
            return false;
        }
        java.util.Iterator<Map.Entry<K, V>> it = iterator();
        java.util.Iterator<Map.Entry<K, V>> it2 = bVar.iterator();
        while (it.hasNext() && it2.hasNext()) {
            Map.Entry<K, V> next = it.next();
            Map.Entry<K, V> next2 = it2.next();
            if ((next == null && next2 != null) || (next != null && !next.equals(next2))) {
                return false;
            }
        }
        return (it.hasNext() || it2.hasNext()) ? false : true;
    }

    public Map.Entry<K, V> f() {
        return this.f2630f;
    }

    @Override // j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    protected c<K, V> h(K k2, V v) {
        c<K, V> cVar = new c<>(k2, v);
        this.f2632h++;
        c<K, V> cVar2 = this.f2630f;
        if (cVar2 == null) {
            this.f2629e = cVar;
            this.f2630f = cVar;
            return cVar;
        }
        cVar2.f2635g = cVar;
        cVar.f2636h = cVar2;
        this.f2630f = cVar;
        return cVar;
    }

    public int hashCode() {
        java.util.Iterator<Map.Entry<K, V>> it = iterator();
        int iHashCode = 0;
        while (it.hasNext()) {
            iHashCode += it.next().hashCode();
        }
        return iHashCode;
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public java.util.Iterator<Map.Entry<K, V>> iterator() {
        a aVar = new a(this.f2629e, this.f2630f);
        this.f2631g.put(aVar, Boolean.FALSE);
        return aVar;
    }

    public V k(K k2, V v) {
        c<K, V> cVarC = c(k2);
        if (cVarC != null) {
            return cVarC.f2634f;
        }
        h(k2, v);
        return null;
    }

    public V l(K k2) {
        c<K, V> cVarC = c(k2);
        if (cVarC == null) {
            return null;
        }
        this.f2632h--;
        if (!this.f2631g.isEmpty()) {
            java.util.Iterator<f<K, V>> it = this.f2631g.keySet().iterator();
            while (it.hasNext()) {
                it.next().a(cVarC);
            }
        }
        c<K, V> cVar = cVarC.f2636h;
        if (cVar != null) {
            cVar.f2635g = cVarC.f2635g;
        } else {
            this.f2629e = cVarC.f2635g;
        }
        c<K, V> cVar2 = cVarC.f2635g;
        if (cVar2 != null) {
            cVar2.f2636h = cVar;
        } else {
            this.f2630f = cVar;
        }
        cVarC.f2635g = null;
        cVarC.f2636h = null;
        return cVarC.f2634f;
    }

    public int size() {
        return this.f2632h;
    }

    @Override // java.lang.Iterable, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return v.o(iterator(), 0);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        java.util.Iterator<Map.Entry<K, V>> it = iterator();
        while (it.hasNext()) {
            sb.append(it.next().toString());
            if (it.hasNext()) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}