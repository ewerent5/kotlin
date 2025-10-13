package j$.util.concurrent;

import ch.qos.logback.core.CoreConstants;
import j$.C$r8$wrapper$java$util$Spliterator$WRP;
import j$.C0266q;
import j$.C0269s;
import j$.C0387w;
import j$.M;
import j$.S0;
import j$.util.Collection;
import j$.util.Iterator;
import j$.util.Map;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import j$.util.function.x;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import j$.x0;
import java.io.ObjectStreamField;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.locks.LockSupport;
import java.util.concurrent.locks.ReentrantLock;
import okhttp3.internal.http2.Settings;
import sun.misc.Unsafe;

/* loaded from: classes2.dex */
public class ConcurrentHashMap<K, V> extends AbstractMap<K, V> implements ConcurrentMap<K, V>, Serializable, j$.util.concurrent.b {
    static final int a = Runtime.getRuntime().availableProcessors();

    /* renamed from: b */
    private static final Unsafe f16011b;

    /* renamed from: c */
    private static final long f16012c;

    /* renamed from: d */
    private static final long f16013d;

    /* renamed from: e */
    private static final long f16014e;

    /* renamed from: f */
    private static final long f16015f;

    /* renamed from: g */
    private static final long f16016g;

    /* renamed from: h */
    private static final long f16017h;

    /* renamed from: i */
    private static final int f16018i;
    private volatile transient long baseCount;
    private volatile transient int cellsBusy;

    /* renamed from: j */
    volatile transient l[] f16019j;

    /* renamed from: k */
    private volatile transient l[] f16020k;

    /* renamed from: l */
    private volatile transient c[] f16021l;

    /* renamed from: m */
    private transient i f16022m;
    private transient u n;
    private transient e o;
    private volatile transient int sizeCtl;
    private volatile transient int transferIndex;

    static class a<K, V> extends p<K, V> {

        /* renamed from: i */
        final ConcurrentHashMap f16023i;

        /* renamed from: j */
        l f16024j;

        a(l[] lVarArr, int i2, int i3, int i4, ConcurrentHashMap concurrentHashMap) {
            super(lVarArr, i2, i3, i4);
            this.f16023i = concurrentHashMap;
            a();
        }

        public final boolean hasMoreElements() {
            return this.f16037b != null;
        }

        public final boolean hasNext() {
            return this.f16037b != null;
        }

        public final void remove() {
            l lVar = this.f16024j;
            if (lVar == null) {
                throw new IllegalStateException();
            }
            this.f16024j = null;
            this.f16023i.i(lVar.f16031b, null, null);
        }
    }

    static final class c {
        volatile long value;

        c(long j2) {
            this.value = j2;
        }
    }

    static final class d<K, V> extends a<K, V> implements Iterator<Map.Entry<K, V>>, j$.util.Iterator {
        d(l[] lVarArr, int i2, int i3, int i4, ConcurrentHashMap concurrentHashMap) {
            super(lVarArr, i2, i3, i4, concurrentHashMap);
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, C0387w.b(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public Object next() {
            l lVar = this.f16037b;
            if (lVar == null) {
                throw new NoSuchElementException();
            }
            Object obj = lVar.f16031b;
            Object obj2 = lVar.f16032c;
            this.f16024j = lVar;
            a();
            return new k(obj, obj2, this.f16023i);
        }
    }

    static final class e<K, V> extends b<K, V, Map.Entry<K, V>> implements Set<Map.Entry<K, V>>, Serializable, j$.util.Set {
        e(ConcurrentHashMap concurrentHashMap) {
            super(concurrentHashMap);
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        /* renamed from: a */
        public boolean add(Map.Entry entry) {
            return this.a.h(entry.getKey(), entry.getValue(), false) == null;
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean addAll(Collection collection) {
            java.util.Iterator it = collection.iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (add((Map.Entry) it.next())) {
                    z = true;
                }
            }
            return z;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.b, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean contains(Object obj) {
            Map.Entry entry;
            Object key;
            Object obj2;
            Object value;
            return (!(obj instanceof Map.Entry) || (key = (entry = (Map.Entry) obj).getKey()) == null || (obj2 = this.a.get(key)) == null || (value = entry.getValue()) == null || (value != obj2 && !value.equals(obj2))) ? false : true;
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public final boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // j$.util.Collection, j$.lang.Iterable
        public void forEach(Consumer consumer) {
            consumer.getClass();
            l[] lVarArr = this.a.f16019j;
            if (lVarArr == null) {
                return;
            }
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    return;
                } else {
                    consumer.accept(new k(lVarA.f16031b, lVarA.f16032c, this.a));
                }
            }
        }

        @Override // java.lang.Iterable
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(C0387w.b(consumer));
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public final int hashCode() {
            l[] lVarArr = this.a.f16019j;
            int iHashCode = 0;
            if (lVarArr != null) {
                p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
                while (true) {
                    l lVarA = pVar.a();
                    if (lVarA == null) {
                        break;
                    }
                    iHashCode += lVarA.hashCode();
                }
            }
            return iHashCode;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.b, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
        public java.util.Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            l[] lVarArr = concurrentHashMap.f16019j;
            int length = lVarArr == null ? 0 : lVarArr.length;
            return new d(lVarArr, length, 0, length, concurrentHashMap);
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean remove(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && this.a.remove(key, value);
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
        public Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            long jM = concurrentHashMap.m();
            l[] lVarArr = concurrentHashMap.f16019j;
            int length = lVarArr == null ? 0 : lVarArr.length;
            return new f(lVarArr, length, 0, length, jM >= 0 ? jM : 0L, concurrentHashMap);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public /* synthetic */ java.util.Spliterator spliterator() {
            return C$r8$wrapper$java$util$Spliterator$WRP.convert(spliterator());
        }
    }

    static final class f<K, V> extends p<K, V> implements Spliterator<Map.Entry<K, V>> {

        /* renamed from: i */
        final ConcurrentHashMap f16025i;

        /* renamed from: j */
        long f16026j;

        f(l[] lVarArr, int i2, int i3, int i4, long j2, ConcurrentHashMap concurrentHashMap) {
            super(lVarArr, i2, i3, i4);
            this.f16025i = concurrentHashMap;
            this.f16026j = j2;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 4353;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.f16026j;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            consumer.getClass();
            while (true) {
                l lVarA = a();
                if (lVarA == null) {
                    return;
                } else {
                    consumer.accept(new k(lVarA.f16031b, lVarA.f16032c, this.f16025i));
                }
            }
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i2) {
            return Spliterator.CC.$default$hasCharacteristics(this, i2);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            consumer.getClass();
            l lVarA = a();
            if (lVarA == null) {
                return false;
            }
            consumer.accept(new k(lVarA.f16031b, lVarA.f16032c, this.f16025i));
            return true;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            int i2 = this.f16041f;
            int i3 = this.f16042g;
            int i4 = (i2 + i3) >>> 1;
            if (i4 <= i2) {
                return null;
            }
            l[] lVarArr = this.a;
            int i5 = this.f16043h;
            this.f16042g = i4;
            long j2 = this.f16026j >>> 1;
            this.f16026j = j2;
            return new f(lVarArr, i5, i4, i3, j2, this.f16025i);
        }
    }

    static final class g<K, V> extends l<K, V> {

        /* renamed from: e */
        final l[] f16027e;

        g(l[] lVarArr) {
            super(-1, null, null, null);
            this.f16027e = lVarArr;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.l
        l a(int i2, Object obj) {
            int length;
            l lVarN;
            Object obj2;
            l[] lVarArr = this.f16027e;
            loop0: while (lVarArr != null && (length = lVarArr.length) != 0 && (lVarN = ConcurrentHashMap.n(lVarArr, (length - 1) & i2)) != null) {
                do {
                    int i3 = lVarN.a;
                    if (i3 == i2 && ((obj2 = lVarN.f16031b) == obj || (obj2 != null && obj.equals(obj2)))) {
                        return lVarN;
                    }
                    if (i3 >= 0) {
                        lVarN = lVarN.f16033d;
                    } else {
                        if (!(lVarN instanceof g)) {
                            return lVarN.a(i2, obj);
                        }
                        lVarArr = ((g) lVarN).f16027e;
                    }
                } while (lVarN != null);
            }
            return null;
        }
    }

    static final class h<K, V> extends a<K, V> implements java.util.Iterator<K>, Enumeration<K>, j$.util.Iterator {
        h(l[] lVarArr, int i2, int i3, int i4, ConcurrentHashMap concurrentHashMap) {
            super(lVarArr, i2, i3, i4, concurrentHashMap);
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, C0387w.b(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            l lVar = this.f16037b;
            if (lVar == null) {
                throw new NoSuchElementException();
            }
            Object obj = lVar.f16031b;
            this.f16024j = lVar;
            a();
            return obj;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return next();
        }
    }

    public static class i<K, V> extends b<K, V, K> implements Set<K>, Serializable, j$.util.Set {
        i(ConcurrentHashMap concurrentHashMap, Object obj) {
            super(concurrentHashMap);
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.b, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean contains(Object obj) {
            return this.a.containsKey(obj);
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean equals(Object obj) {
            Set set;
            return (obj instanceof Set) && ((set = (Set) obj) == this || (containsAll(set) && set.containsAll(this)));
        }

        @Override // j$.util.Collection, j$.lang.Iterable
        public void forEach(Consumer consumer) {
            consumer.getClass();
            l[] lVarArr = this.a.f16019j;
            if (lVarArr == null) {
                return;
            }
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    return;
                } else {
                    consumer.accept(lVarA.f16031b);
                }
            }
        }

        @Override // java.lang.Iterable
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(C0387w.b(consumer));
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public int hashCode() {
            Object it = iterator();
            int iHashCode = 0;
            while (((a) it).hasNext()) {
                iHashCode += ((h) it).next().hashCode();
            }
            return iHashCode;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.b, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
        public java.util.Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            l[] lVarArr = concurrentHashMap.f16019j;
            int length = lVarArr == null ? 0 : lVarArr.length;
            return new h(lVarArr, length, 0, length, concurrentHashMap);
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public boolean remove(Object obj) {
            return this.a.remove(obj) != null;
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
        public Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            long jM = concurrentHashMap.m();
            l[] lVarArr = concurrentHashMap.f16019j;
            int length = lVarArr == null ? 0 : lVarArr.length;
            return new j(lVarArr, length, 0, length, jM >= 0 ? jM : 0L);
        }

        @Override // java.util.Collection, java.lang.Iterable, java.util.Set
        public /* synthetic */ java.util.Spliterator spliterator() {
            return C$r8$wrapper$java$util$Spliterator$WRP.convert(spliterator());
        }
    }

    static final class j<K, V> extends p<K, V> implements Spliterator<K> {

        /* renamed from: i */
        long f16028i;

        j(l[] lVarArr, int i2, int i3, int i4, long j2) {
            super(lVarArr, i2, i3, i4);
            this.f16028i = j2;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 4353;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.f16028i;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            consumer.getClass();
            while (true) {
                l lVarA = a();
                if (lVarA == null) {
                    return;
                } else {
                    consumer.accept(lVarA.f16031b);
                }
            }
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i2) {
            return Spliterator.CC.$default$hasCharacteristics(this, i2);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            consumer.getClass();
            l lVarA = a();
            if (lVarA == null) {
                return false;
            }
            consumer.accept(lVarA.f16031b);
            return true;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            int i2 = this.f16041f;
            int i3 = this.f16042g;
            int i4 = (i2 + i3) >>> 1;
            if (i4 <= i2) {
                return null;
            }
            l[] lVarArr = this.a;
            int i5 = this.f16043h;
            this.f16042g = i4;
            long j2 = this.f16028i >>> 1;
            this.f16028i = j2;
            return new j(lVarArr, i5, i4, i3, j2);
        }
    }

    static final class k<K, V> implements Map.Entry<K, V>, Map.Entry {
        final Object a;

        /* renamed from: b */
        Object f16029b;

        /* renamed from: c */
        final ConcurrentHashMap f16030c;

        k(Object obj, Object obj2, ConcurrentHashMap concurrentHashMap) {
            this.a = obj;
            this.f16029b = obj2;
            this.f16030c = concurrentHashMap;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public boolean equals(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            Object obj2;
            Object obj3;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.a) || key.equals(obj2)) && (value == (obj3 = this.f16029b) || value.equals(obj3));
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public Object getKey() {
            return this.a;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public Object getValue() {
            return this.f16029b;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public int hashCode() {
            return this.a.hashCode() ^ this.f16029b.hashCode();
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public Object setValue(Object obj) {
            obj.getClass();
            Object obj2 = this.f16029b;
            this.f16029b = obj;
            this.f16030c.put(this.a, obj);
            return obj2;
        }

        public String toString() {
            return this.a + "=" + this.f16029b;
        }
    }

    static class l<K, V> implements Map.Entry<K, V>, Map.Entry {
        final int a;

        /* renamed from: b */
        final Object f16031b;

        /* renamed from: c */
        volatile Object f16032c;

        /* renamed from: d */
        volatile l f16033d;

        l(int i2, Object obj, Object obj2, l lVar) {
            this.a = i2;
            this.f16031b = obj;
            this.f16032c = obj2;
            this.f16033d = lVar;
        }

        l a(int i2, Object obj) {
            Object obj2;
            l<K, V> lVar = this;
            do {
                if (lVar.a == i2 && ((obj2 = lVar.f16031b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    return lVar;
                }
                lVar = lVar.f16033d;
            } while (lVar != null);
            return null;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final boolean equals(Object obj) {
            Map.Entry entry;
            Object key;
            Object value;
            Object obj2;
            Object obj3;
            return (obj instanceof Map.Entry) && (key = (entry = (Map.Entry) obj).getKey()) != null && (value = entry.getValue()) != null && (key == (obj2 = this.f16031b) || key.equals(obj2)) && (value == (obj3 = this.f16032c) || value.equals(obj3));
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final Object getKey() {
            return this.f16031b;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final Object getValue() {
            return this.f16032c;
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final int hashCode() {
            return this.f16031b.hashCode() ^ this.f16032c.hashCode();
        }

        @Override // java.util.Map.Entry, j$.util.Map.Entry
        public final Object setValue(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final String toString() {
            return this.f16031b + "=" + this.f16032c;
        }
    }

    static final class m<K, V> extends l<K, V> {
        m() {
            super(-3, null, null, null);
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.l
        l a(int i2, Object obj) {
            return null;
        }
    }

    static class n<K, V> extends ReentrantLock implements Serializable {
    }

    static final class o<K, V> {
        int a;

        /* renamed from: b */
        int f16034b;

        /* renamed from: c */
        l[] f16035c;

        /* renamed from: d */
        o f16036d;

        o() {
        }
    }

    static class p<K, V> {
        l[] a;

        /* renamed from: b */
        l f16037b = null;

        /* renamed from: c */
        o f16038c;

        /* renamed from: d */
        o f16039d;

        /* renamed from: e */
        int f16040e;

        /* renamed from: f */
        int f16041f;

        /* renamed from: g */
        int f16042g;

        /* renamed from: h */
        final int f16043h;

        p(l[] lVarArr, int i2, int i3, int i4) {
            this.a = lVarArr;
            this.f16043h = i2;
            this.f16040e = i3;
            this.f16041f = i3;
            this.f16042g = i4;
        }

        /* JADX WARN: Removed duplicated region for block: B:201:0x0097 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:204:0x005f A[SYNTHETIC] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final j$.util.concurrent.ConcurrentHashMap.l a() {
            /*
                r6 = this;
                j$.util.concurrent.ConcurrentHashMap$l r0 = r6.f16037b
                r1 = 0
                if (r0 == 0) goto L7
                j$.util.concurrent.ConcurrentHashMap$l r0 = r0.f16033d
            L7:
                if (r0 == 0) goto Lc
                r6.f16037b = r0
                return r0
            Lc:
                int r0 = r6.f16041f
                int r2 = r6.f16042g
                if (r0 >= r2) goto La8
                j$.util.concurrent.ConcurrentHashMap$l[] r0 = r6.a
                if (r0 == 0) goto La8
                int r2 = r0.length
                int r3 = r6.f16040e
                if (r2 <= r3) goto La8
                if (r3 >= 0) goto L1f
                goto La8
            L1f:
                j$.util.concurrent.ConcurrentHashMap$l r4 = j$.util.concurrent.ConcurrentHashMap.n(r0, r3)
                if (r4 == 0) goto L5a
                int r5 = r4.a
                if (r5 >= 0) goto L5a
                boolean r5 = r4 instanceof j$.util.concurrent.ConcurrentHashMap.g
                if (r5 == 0) goto L4f
                j$.util.concurrent.ConcurrentHashMap$g r4 = (j$.util.concurrent.ConcurrentHashMap.g) r4
                j$.util.concurrent.ConcurrentHashMap$l[] r4 = r4.f16027e
                r6.a = r4
                j$.util.concurrent.ConcurrentHashMap$o r4 = r6.f16039d
                if (r4 == 0) goto L3c
                j$.util.concurrent.ConcurrentHashMap$o r5 = r4.f16036d
                r6.f16039d = r5
                goto L41
            L3c:
                j$.util.concurrent.ConcurrentHashMap$o r4 = new j$.util.concurrent.ConcurrentHashMap$o
                r4.<init>()
            L41:
                r4.f16035c = r0
                r4.a = r2
                r4.f16034b = r3
                j$.util.concurrent.ConcurrentHashMap$o r0 = r6.f16038c
                r4.f16036d = r0
                r6.f16038c = r4
                r0 = r1
                goto L7
            L4f:
                boolean r0 = r4 instanceof j$.util.concurrent.ConcurrentHashMap.q
                if (r0 == 0) goto L58
                j$.util.concurrent.ConcurrentHashMap$q r4 = (j$.util.concurrent.ConcurrentHashMap.q) r4
                j$.util.concurrent.ConcurrentHashMap$r r0 = r4.f16047h
                goto L5b
            L58:
                r0 = r1
                goto L5b
            L5a:
                r0 = r4
            L5b:
                j$.util.concurrent.ConcurrentHashMap$o r4 = r6.f16038c
                if (r4 == 0) goto L97
            L5f:
                j$.util.concurrent.ConcurrentHashMap$o r3 = r6.f16038c
                if (r3 == 0) goto L82
                int r4 = r6.f16040e
                int r5 = r3.a
                int r4 = r4 + r5
                r6.f16040e = r4
                if (r4 < r2) goto L82
                int r2 = r3.f16034b
                r6.f16040e = r2
                j$.util.concurrent.ConcurrentHashMap$l[] r2 = r3.f16035c
                r6.a = r2
                r3.f16035c = r1
                j$.util.concurrent.ConcurrentHashMap$o r2 = r3.f16036d
                j$.util.concurrent.ConcurrentHashMap$o r4 = r6.f16039d
                r3.f16036d = r4
                r6.f16038c = r2
                r6.f16039d = r3
                r2 = r5
                goto L5f
            L82:
                if (r3 != 0) goto L7
                int r3 = r6.f16040e
                int r4 = r6.f16043h
                int r3 = r3 + r4
                r6.f16040e = r3
                if (r3 < r2) goto L7
                int r2 = r6.f16041f
                int r2 = r2 + 1
                r6.f16041f = r2
                r6.f16040e = r2
                goto L7
            L97:
                int r4 = r6.f16043h
                int r3 = r3 + r4
                r6.f16040e = r3
                if (r3 < r2) goto L7
                int r2 = r6.f16041f
                int r2 = r2 + 1
                r6.f16041f = r2
                r6.f16040e = r2
                goto L7
            La8:
                r6.f16037b = r1
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.p.a():j$.util.concurrent.ConcurrentHashMap$l");
        }
    }

    static final class q<K, V> extends l<K, V> {

        /* renamed from: e */
        private static final Unsafe f16044e;

        /* renamed from: f */
        private static final long f16045f;

        /* renamed from: g */
        r f16046g;

        /* renamed from: h */
        volatile r f16047h;

        /* renamed from: i */
        volatile Thread f16048i;
        volatile int lockState;

        static {
            try {
                Unsafe unsafeC = j$.util.concurrent.c.c();
                f16044e = unsafeC;
                f16045f = unsafeC.objectFieldOffset(q.class.getDeclaredField("lockState"));
            } catch (Exception e2) {
                throw new Error(e2);
            }
        }

        q(r rVar) {
            int iD;
            int iJ;
            super(-2, null, null, null);
            this.f16047h = rVar;
            r rVar2 = null;
            while (rVar != null) {
                r rVar3 = (r) rVar.f16033d;
                rVar.f16051g = null;
                rVar.f16050f = null;
                if (rVar2 == null) {
                    rVar.f16049e = null;
                    rVar.f16053i = false;
                } else {
                    Object obj = rVar.f16031b;
                    int i2 = rVar.a;
                    r rVar4 = rVar2;
                    Class clsC = null;
                    while (true) {
                        Object obj2 = rVar4.f16031b;
                        int i3 = rVar4.a;
                        iJ = i3 > i2 ? -1 : i3 < i2 ? 1 : ((clsC == null && (clsC = ConcurrentHashMap.c(obj)) == null) || (iD = ConcurrentHashMap.d(clsC, obj, obj2)) == 0) ? j(obj, obj2) : iD;
                        r rVar5 = iJ <= 0 ? rVar4.f16050f : rVar4.f16051g;
                        if (rVar5 == null) {
                            break;
                        } else {
                            rVar4 = rVar5;
                        }
                    }
                    rVar.f16049e = rVar4;
                    if (iJ <= 0) {
                        rVar4.f16050f = rVar;
                    } else {
                        rVar4.f16051g = rVar;
                    }
                    rVar = c(rVar2, rVar);
                }
                rVar2 = rVar;
                rVar = rVar3;
            }
            this.f16046g = rVar2;
        }

        static r b(r rVar, r rVar2) {
            while (rVar2 != null && rVar2 != rVar) {
                r rVar3 = rVar2.f16049e;
                if (rVar3 == null) {
                    rVar2.f16053i = false;
                    return rVar2;
                }
                if (rVar2.f16053i) {
                    rVar2.f16053i = false;
                    return rVar;
                }
                r rVar4 = rVar3.f16050f;
                r rVar5 = null;
                if (rVar4 == rVar2) {
                    rVar4 = rVar3.f16051g;
                    if (rVar4 != null && rVar4.f16053i) {
                        rVar4.f16053i = false;
                        rVar3.f16053i = true;
                        rVar = h(rVar, rVar3);
                        rVar3 = rVar2.f16049e;
                        rVar4 = rVar3 == null ? null : rVar3.f16051g;
                    }
                    if (rVar4 == null) {
                        rVar2 = rVar3;
                    } else {
                        r rVar6 = rVar4.f16050f;
                        r rVar7 = rVar4.f16051g;
                        if ((rVar7 == null || !rVar7.f16053i) && (rVar6 == null || !rVar6.f16053i)) {
                            rVar4.f16053i = true;
                            rVar2 = rVar3;
                        } else {
                            if (rVar7 == null || !rVar7.f16053i) {
                                if (rVar6 != null) {
                                    rVar6.f16053i = false;
                                }
                                rVar4.f16053i = true;
                                rVar = i(rVar, rVar4);
                                rVar3 = rVar2.f16049e;
                                if (rVar3 != null) {
                                    rVar5 = rVar3.f16051g;
                                }
                            } else {
                                rVar5 = rVar4;
                            }
                            if (rVar5 != null) {
                                rVar5.f16053i = rVar3 == null ? false : rVar3.f16053i;
                                r rVar8 = rVar5.f16051g;
                                if (rVar8 != null) {
                                    rVar8.f16053i = false;
                                }
                            }
                            if (rVar3 != null) {
                                rVar3.f16053i = false;
                                rVar = h(rVar, rVar3);
                            }
                            rVar2 = rVar;
                            rVar = rVar2;
                        }
                    }
                } else {
                    if (rVar4 != null && rVar4.f16053i) {
                        rVar4.f16053i = false;
                        rVar3.f16053i = true;
                        rVar = i(rVar, rVar3);
                        rVar3 = rVar2.f16049e;
                        rVar4 = rVar3 == null ? null : rVar3.f16050f;
                    }
                    if (rVar4 == null) {
                        rVar2 = rVar3;
                    } else {
                        r rVar9 = rVar4.f16050f;
                        r rVar10 = rVar4.f16051g;
                        if ((rVar9 == null || !rVar9.f16053i) && (rVar10 == null || !rVar10.f16053i)) {
                            rVar4.f16053i = true;
                            rVar2 = rVar3;
                        } else {
                            if (rVar9 == null || !rVar9.f16053i) {
                                if (rVar10 != null) {
                                    rVar10.f16053i = false;
                                }
                                rVar4.f16053i = true;
                                rVar = h(rVar, rVar4);
                                rVar3 = rVar2.f16049e;
                                if (rVar3 != null) {
                                    rVar5 = rVar3.f16050f;
                                }
                            } else {
                                rVar5 = rVar4;
                            }
                            if (rVar5 != null) {
                                rVar5.f16053i = rVar3 == null ? false : rVar3.f16053i;
                                r rVar11 = rVar5.f16050f;
                                if (rVar11 != null) {
                                    rVar11.f16053i = false;
                                }
                            }
                            if (rVar3 != null) {
                                rVar3.f16053i = false;
                                rVar = i(rVar, rVar3);
                            }
                            rVar2 = rVar;
                            rVar = rVar2;
                        }
                    }
                }
            }
            return rVar;
        }

        static r c(r rVar, r rVar2) {
            r rVar3;
            rVar2.f16053i = true;
            while (true) {
                r rVar4 = rVar2.f16049e;
                if (rVar4 == null) {
                    rVar2.f16053i = false;
                    return rVar2;
                }
                if (!rVar4.f16053i || (rVar3 = rVar4.f16049e) == null) {
                    break;
                }
                r rVar5 = rVar3.f16050f;
                if (rVar4 == rVar5) {
                    rVar5 = rVar3.f16051g;
                    if (rVar5 == null || !rVar5.f16053i) {
                        if (rVar2 == rVar4.f16051g) {
                            rVar = h(rVar, rVar4);
                            r rVar6 = rVar4.f16049e;
                            rVar3 = rVar6 == null ? null : rVar6.f16049e;
                            rVar4 = rVar6;
                            rVar2 = rVar4;
                        }
                        if (rVar4 != null) {
                            rVar4.f16053i = false;
                            if (rVar3 != null) {
                                rVar3.f16053i = true;
                                rVar = i(rVar, rVar3);
                            }
                        }
                    } else {
                        rVar5.f16053i = false;
                        rVar4.f16053i = false;
                        rVar3.f16053i = true;
                        rVar2 = rVar3;
                    }
                } else if (rVar5 == null || !rVar5.f16053i) {
                    if (rVar2 == rVar4.f16050f) {
                        rVar = i(rVar, rVar4);
                        r rVar7 = rVar4.f16049e;
                        rVar3 = rVar7 == null ? null : rVar7.f16049e;
                        rVar4 = rVar7;
                        rVar2 = rVar4;
                    }
                    if (rVar4 != null) {
                        rVar4.f16053i = false;
                        if (rVar3 != null) {
                            rVar3.f16053i = true;
                            rVar = h(rVar, rVar3);
                        }
                    }
                } else {
                    rVar5.f16053i = false;
                    rVar4.f16053i = false;
                    rVar3.f16053i = true;
                    rVar2 = rVar3;
                }
            }
            return rVar;
        }

        private final void d() {
            boolean z = false;
            while (true) {
                int i2 = this.lockState;
                if ((i2 & (-3)) == 0) {
                    if (f16044e.compareAndSwapInt(this, f16045f, i2, 1)) {
                        break;
                    }
                } else if ((i2 & 2) == 0) {
                    if (f16044e.compareAndSwapInt(this, f16045f, i2, i2 | 2)) {
                        z = true;
                        this.f16048i = Thread.currentThread();
                    }
                } else if (z) {
                    LockSupport.park(this);
                }
            }
            if (z) {
                this.f16048i = null;
            }
        }

        private final void e() {
            if (f16044e.compareAndSwapInt(this, f16045f, 0, 1)) {
                return;
            }
            d();
        }

        static r h(r rVar, r rVar2) {
            r rVar3 = rVar2.f16051g;
            if (rVar3 != null) {
                r rVar4 = rVar3.f16050f;
                rVar2.f16051g = rVar4;
                if (rVar4 != null) {
                    rVar4.f16049e = rVar2;
                }
                r rVar5 = rVar2.f16049e;
                rVar3.f16049e = rVar5;
                if (rVar5 == null) {
                    rVar3.f16053i = false;
                    rVar = rVar3;
                } else if (rVar5.f16050f == rVar2) {
                    rVar5.f16050f = rVar3;
                } else {
                    rVar5.f16051g = rVar3;
                }
                rVar3.f16050f = rVar2;
                rVar2.f16049e = rVar3;
            }
            return rVar;
        }

        static r i(r rVar, r rVar2) {
            r rVar3 = rVar2.f16050f;
            if (rVar3 != null) {
                r rVar4 = rVar3.f16051g;
                rVar2.f16050f = rVar4;
                if (rVar4 != null) {
                    rVar4.f16049e = rVar2;
                }
                r rVar5 = rVar2.f16049e;
                rVar3.f16049e = rVar5;
                if (rVar5 == null) {
                    rVar3.f16053i = false;
                    rVar = rVar3;
                } else if (rVar5.f16051g == rVar2) {
                    rVar5.f16051g = rVar3;
                } else {
                    rVar5.f16050f = rVar3;
                }
                rVar3.f16051g = rVar2;
                rVar2.f16049e = rVar3;
            }
            return rVar;
        }

        static int j(Object obj, Object obj2) {
            int iCompareTo;
            return (obj == null || obj2 == null || (iCompareTo = obj.getClass().getName().compareTo(obj2.getClass().getName())) == 0) ? System.identityHashCode(obj) <= System.identityHashCode(obj2) ? -1 : 1 : iCompareTo;
        }

        /* JADX WARN: Code restructure failed: missing block: B:110:0x001b, code lost:
        
            return r0;
         */
        @Override // j$.util.concurrent.ConcurrentHashMap.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final j$.util.concurrent.ConcurrentHashMap.l a(int r12, java.lang.Object r13) {
            /*
                r11 = this;
                j$.util.concurrent.ConcurrentHashMap$r r0 = r11.f16047h
            L2:
                r1 = 0
                if (r0 == 0) goto L5a
                int r6 = r11.lockState
                r2 = r6 & 3
                if (r2 == 0) goto L1f
                int r1 = r0.a
                if (r1 != r12) goto L1c
                java.lang.Object r1 = r0.f16031b
                if (r1 == r13) goto L1b
                if (r1 == 0) goto L1c
                boolean r1 = r13.equals(r1)
                if (r1 == 0) goto L1c
            L1b:
                return r0
            L1c:
                j$.util.concurrent.ConcurrentHashMap$l r0 = r0.f16033d
                goto L2
            L1f:
                sun.misc.Unsafe r8 = j$.util.concurrent.ConcurrentHashMap.q.f16044e
                long r9 = j$.util.concurrent.ConcurrentHashMap.q.f16045f
                int r7 = r6 + 4
                r2 = r8
                r3 = r11
                r4 = r9
                boolean r2 = r2.compareAndSwapInt(r3, r4, r6, r7)
                if (r2 == 0) goto L2
                r0 = 6
                r2 = -4
                j$.util.concurrent.ConcurrentHashMap$r r3 = r11.f16046g     // Catch: java.lang.Throwable -> L47
                if (r3 != 0) goto L35
                goto L39
            L35:
                j$.util.concurrent.ConcurrentHashMap$r r1 = r3.b(r12, r13, r1)     // Catch: java.lang.Throwable -> L47
            L39:
                int r12 = j$.util.concurrent.c.a(r8, r11, r9, r2)
                if (r12 != r0) goto L46
                java.lang.Thread r12 = r11.f16048i
                if (r12 == 0) goto L46
                java.util.concurrent.locks.LockSupport.unpark(r12)
            L46:
                return r1
            L47:
                r12 = move-exception
                sun.misc.Unsafe r13 = j$.util.concurrent.ConcurrentHashMap.q.f16044e
                long r3 = j$.util.concurrent.ConcurrentHashMap.q.f16045f
                int r13 = j$.util.concurrent.c.a(r13, r11, r3, r2)
                if (r13 != r0) goto L59
                java.lang.Thread r13 = r11.f16048i
                if (r13 == 0) goto L59
                java.util.concurrent.locks.LockSupport.unpark(r13)
            L59:
                throw r12
            L5a:
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.q.a(int, java.lang.Object):j$.util.concurrent.ConcurrentHashMap$l");
        }

        /* JADX WARN: Code restructure failed: missing block: B:158:0x0060, code lost:
        
            return r3;
         */
        /* JADX WARN: Code restructure failed: missing block: B:178:0x00a3, code lost:
        
            return null;
         */
        /* JADX WARN: Code restructure failed: missing block: B:183:0x00ab, code lost:
        
            return r10;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final j$.util.concurrent.ConcurrentHashMap.r f(int r16, java.lang.Object r17, java.lang.Object r18) {
            /*
                r15 = this;
                r1 = r15
                r0 = r16
                r4 = r17
                j$.util.concurrent.ConcurrentHashMap$r r2 = r1.f16046g
                r8 = 0
                r9 = 0
                r10 = r2
                r2 = r9
                r3 = 0
            Lc:
                if (r10 != 0) goto L22
                j$.util.concurrent.ConcurrentHashMap$r r8 = new j$.util.concurrent.ConcurrentHashMap$r
                r6 = 0
                r7 = 0
                r2 = r8
                r3 = r16
                r4 = r17
                r5 = r18
                r2.<init>(r3, r4, r5, r6, r7)
                r1.f16046g = r8
                r1.f16047h = r8
                goto La3
            L22:
                int r5 = r10.a
                r11 = 1
                if (r5 <= r0) goto L2a
                r5 = -1
                r12 = -1
                goto L69
            L2a:
                if (r5 >= r0) goto L2e
                r12 = 1
                goto L69
            L2e:
                java.lang.Object r5 = r10.f16031b
                if (r5 == r4) goto Lab
                if (r5 == 0) goto L3c
                boolean r6 = r4.equals(r5)
                if (r6 == 0) goto L3c
                goto Lab
            L3c:
                if (r2 != 0) goto L44
                java.lang.Class r2 = j$.util.concurrent.ConcurrentHashMap.c(r17)
                if (r2 == 0) goto L4a
            L44:
                int r6 = j$.util.concurrent.ConcurrentHashMap.d(r2, r4, r5)
                if (r6 != 0) goto L68
            L4a:
                if (r3 != 0) goto L62
                j$.util.concurrent.ConcurrentHashMap$r r3 = r10.f16050f
                if (r3 == 0) goto L56
                j$.util.concurrent.ConcurrentHashMap$r r3 = r3.b(r0, r4, r2)
                if (r3 != 0) goto L60
            L56:
                j$.util.concurrent.ConcurrentHashMap$r r3 = r10.f16051g
                if (r3 == 0) goto L61
                j$.util.concurrent.ConcurrentHashMap$r r3 = r3.b(r0, r4, r2)
                if (r3 == 0) goto L61
            L60:
                return r3
            L61:
                r3 = 1
            L62:
                int r5 = j(r4, r5)
                r12 = r5
                goto L69
            L68:
                r12 = r6
            L69:
                if (r12 > 0) goto L6e
                j$.util.concurrent.ConcurrentHashMap$r r5 = r10.f16050f
                goto L70
            L6e:
                j$.util.concurrent.ConcurrentHashMap$r r5 = r10.f16051g
            L70:
                if (r5 != 0) goto La8
                j$.util.concurrent.ConcurrentHashMap$r r13 = r1.f16047h
                j$.util.concurrent.ConcurrentHashMap$r r14 = new j$.util.concurrent.ConcurrentHashMap$r
                r2 = r14
                r3 = r16
                r4 = r17
                r5 = r18
                r6 = r13
                r7 = r10
                r2.<init>(r3, r4, r5, r6, r7)
                r1.f16047h = r14
                if (r13 == 0) goto L88
                r13.f16052h = r14
            L88:
                if (r12 > 0) goto L8d
                r10.f16050f = r14
                goto L8f
            L8d:
                r10.f16051g = r14
            L8f:
                boolean r0 = r10.f16053i
                if (r0 != 0) goto L96
                r14.f16053i = r11
                goto La3
            L96:
                r15.e()
                j$.util.concurrent.ConcurrentHashMap$r r0 = r1.f16046g     // Catch: java.lang.Throwable -> La4
                j$.util.concurrent.ConcurrentHashMap$r r0 = c(r0, r14)     // Catch: java.lang.Throwable -> La4
                r1.f16046g = r0     // Catch: java.lang.Throwable -> La4
                r1.lockState = r8
            La3:
                return r9
            La4:
                r0 = move-exception
                r1.lockState = r8
                throw r0
            La8:
                r10 = r5
                goto Lc
            Lab:
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.q.f(int, java.lang.Object, java.lang.Object):j$.util.concurrent.ConcurrentHashMap$r");
        }

        /* JADX WARN: Removed duplicated region for block: B:233:0x008b A[PHI: r0
  0x008b: PHI (r0v4 j$.util.concurrent.ConcurrentHashMap$r) = (r0v3 j$.util.concurrent.ConcurrentHashMap$r), (r0v12 j$.util.concurrent.ConcurrentHashMap$r) binds: [B:231:0x0087, B:227:0x0080] A[DONT_GENERATE, DONT_INLINE]] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        final boolean g(j$.util.concurrent.ConcurrentHashMap.r r11) {
            /*
                Method dump skipped, instructions count: 205
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.q.g(j$.util.concurrent.ConcurrentHashMap$r):boolean");
        }
    }

    static final class r<K, V> extends l<K, V> {

        /* renamed from: e */
        r f16049e;

        /* renamed from: f */
        r f16050f;

        /* renamed from: g */
        r f16051g;

        /* renamed from: h */
        r f16052h;

        /* renamed from: i */
        boolean f16053i;

        r(int i2, Object obj, Object obj2, l lVar, r rVar) {
            super(i2, obj, obj2, lVar);
            this.f16049e = rVar;
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.l
        l a(int i2, Object obj) {
            return b(i2, obj, null);
        }

        final r b(int i2, Object obj, Class cls) {
            int iD;
            if (obj == null) {
                return null;
            }
            r<K, V> rVar = this;
            do {
                r<K, V> rVar2 = rVar.f16050f;
                r<K, V> rVar3 = rVar.f16051g;
                int i3 = rVar.a;
                if (i3 <= i2) {
                    if (i3 >= i2) {
                        Object obj2 = rVar.f16031b;
                        if (obj2 == obj || (obj2 != null && obj.equals(obj2))) {
                            return rVar;
                        }
                        if (rVar2 != null) {
                            if (rVar3 != null) {
                                if ((cls == null && (cls = ConcurrentHashMap.c(obj)) == null) || (iD = ConcurrentHashMap.d(cls, obj, obj2)) == 0) {
                                    r rVarB = rVar3.b(i2, obj, cls);
                                    if (rVarB != null) {
                                        return rVarB;
                                    }
                                } else if (iD < 0) {
                                }
                            }
                            rVar = rVar2;
                        }
                    }
                    rVar = rVar3;
                } else {
                    rVar = rVar2;
                }
            } while (rVar != null);
            return null;
        }
    }

    static final class s<K, V> extends a<K, V> implements java.util.Iterator<V>, Enumeration<V>, j$.util.Iterator {
        s(l[] lVarArr, int i2, int i3, int i4, ConcurrentHashMap concurrentHashMap) {
            super(lVarArr, i2, i3, i4, concurrentHashMap);
        }

        @Override // j$.util.Iterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        @Override // java.util.Iterator
        public /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, C0387w.b(consumer));
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public final Object next() {
            l lVar = this.f16037b;
            if (lVar == null) {
                throw new NoSuchElementException();
            }
            Object obj = lVar.f16032c;
            this.f16024j = lVar;
            a();
            return obj;
        }

        @Override // java.util.Enumeration
        public final Object nextElement() {
            return next();
        }
    }

    static final class t<K, V> extends p<K, V> implements Spliterator<V> {

        /* renamed from: i */
        long f16054i;

        t(l[] lVarArr, int i2, int i3, int i4, long j2) {
            super(lVarArr, i2, i3, i4);
            this.f16054i = j2;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return 4352;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.f16054i;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            consumer.getClass();
            while (true) {
                l lVarA = a();
                if (lVarA == null) {
                    return;
                } else {
                    consumer.accept(lVarA.f16032c);
                }
            }
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ Comparator getComparator() {
            return Spliterator.CC.$default$getComparator(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i2) {
            return Spliterator.CC.$default$hasCharacteristics(this, i2);
        }

        @Override // j$.util.Spliterator
        public boolean tryAdvance(Consumer consumer) {
            consumer.getClass();
            l lVarA = a();
            if (lVarA == null) {
                return false;
            }
            consumer.accept(lVarA.f16032c);
            return true;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            int i2 = this.f16041f;
            int i3 = this.f16042g;
            int i4 = (i2 + i3) >>> 1;
            if (i4 <= i2) {
                return null;
            }
            l[] lVarArr = this.a;
            int i5 = this.f16043h;
            this.f16042g = i4;
            long j2 = this.f16054i >>> 1;
            this.f16054i = j2;
            return new t(lVarArr, i5, i4, i3, j2);
        }
    }

    static final class u<K, V> extends b<K, V, V> implements Collection<V>, Serializable, j$.util.Collection {
        u(ConcurrentHashMap concurrentHashMap) {
            super(concurrentHashMap);
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public final boolean add(Object obj) {
            throw new UnsupportedOperationException();
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public final boolean addAll(Collection collection) {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.b, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public final boolean contains(Object obj) {
            return this.a.containsValue(obj);
        }

        @Override // j$.util.Collection, j$.lang.Iterable
        public void forEach(Consumer consumer) {
            consumer.getClass();
            l[] lVarArr = this.a.f16019j;
            if (lVarArr == null) {
                return;
            }
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    return;
                } else {
                    consumer.accept(lVarA.f16032c);
                }
            }
        }

        @Override // java.lang.Iterable
        public /* synthetic */ void forEach(java.util.function.Consumer consumer) {
            forEach(C0387w.b(consumer));
        }

        @Override // j$.util.concurrent.ConcurrentHashMap.b, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
        public final java.util.Iterator iterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            l[] lVarArr = concurrentHashMap.f16019j;
            int length = lVarArr == null ? 0 : lVarArr.length;
            return new s(lVarArr, length, 0, length, concurrentHashMap);
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public final boolean remove(Object obj) {
            a aVar;
            if (obj == null) {
                return false;
            }
            Object it = iterator();
            do {
                aVar = (a) it;
                if (!aVar.hasNext()) {
                    return false;
                }
            } while (!obj.equals(((s) it).next()));
            aVar.remove();
            return true;
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
        public Spliterator spliterator() {
            ConcurrentHashMap concurrentHashMap = this.a;
            long jM = concurrentHashMap.m();
            l[] lVarArr = concurrentHashMap.f16019j;
            int length = lVarArr == null ? 0 : lVarArr.length;
            return new t(lVarArr, length, 0, length, jM >= 0 ? jM : 0L);
        }

        @Override // java.util.Collection, java.lang.Iterable
        public /* synthetic */ java.util.Spliterator spliterator() {
            return C$r8$wrapper$java$util$Spliterator$WRP.convert(spliterator());
        }
    }

    static {
        new ObjectStreamField("segments", n[].class);
        Class cls = Integer.TYPE;
        new ObjectStreamField("segmentMask", cls);
        new ObjectStreamField("segmentShift", cls);
        try {
            Unsafe unsafeC = j$.util.concurrent.c.c();
            f16011b = unsafeC;
            f16012c = unsafeC.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("sizeCtl"));
            f16013d = unsafeC.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("transferIndex"));
            f16014e = unsafeC.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("baseCount"));
            f16015f = unsafeC.objectFieldOffset(ConcurrentHashMap.class.getDeclaredField("cellsBusy"));
            f16016g = unsafeC.objectFieldOffset(c.class.getDeclaredField("value"));
            f16017h = unsafeC.arrayBaseOffset(l[].class);
            int iArrayIndexScale = unsafeC.arrayIndexScale(l[].class);
            if (((iArrayIndexScale - 1) & iArrayIndexScale) != 0) {
                throw new Error("data type scale not a power of two");
            }
            f16018i = 31 - Integer.numberOfLeadingZeros(iArrayIndexScale);
        } catch (Exception e2) {
            throw new Error(e2);
        }
    }

    public ConcurrentHashMap() {
    }

    public ConcurrentHashMap(int i2) {
        if (i2 < 0) {
            throw new IllegalArgumentException();
        }
        this.sizeCtl = i2 >= 536870912 ? 1073741824 : o(i2 + (i2 >>> 1) + 1);
    }

    public ConcurrentHashMap(int i2, float f2, int i3) {
        if (f2 <= 0.0f || i2 < 0 || i3 <= 0) {
            throw new IllegalArgumentException();
        }
        long j2 = (long) (((i2 < i3 ? i3 : i2) / f2) + 1.0d);
        this.sizeCtl = j2 >= 1073741824 ? 1073741824 : o((int) j2);
    }

    public ConcurrentHashMap(java.util.Map map) {
        this.sizeCtl = 16;
        putAll(map);
    }

    /* JADX WARN: Removed duplicated region for block: B:142:0x0014  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void a(long r12, int r14) {
        /*
            r11 = this;
            j$.util.concurrent.ConcurrentHashMap$c[] r0 = r11.f16021l
            if (r0 != 0) goto L14
            sun.misc.Unsafe r1 = j$.util.concurrent.ConcurrentHashMap.f16011b
            long r3 = j$.util.concurrent.ConcurrentHashMap.f16014e
            long r5 = r11.baseCount
            long r9 = r5 + r12
            r2 = r11
            r7 = r9
            boolean r1 = r1.compareAndSwapLong(r2, r3, r5, r7)
            if (r1 != 0) goto L3b
        L14:
            r1 = 1
            if (r0 == 0) goto L94
            int r2 = r0.length
            int r2 = r2 - r1
            if (r2 < 0) goto L94
            int r3 = j$.util.concurrent.ThreadLocalRandom.b()
            r2 = r2 & r3
            r4 = r0[r2]
            if (r4 == 0) goto L94
            sun.misc.Unsafe r3 = j$.util.concurrent.ConcurrentHashMap.f16011b
            long r5 = j$.util.concurrent.ConcurrentHashMap.f16016g
            long r7 = r4.value
            long r9 = r7 + r12
            boolean r0 = r3.compareAndSwapLong(r4, r5, r7, r9)
            if (r0 != 0) goto L34
            r1 = r0
            goto L94
        L34:
            if (r14 > r1) goto L37
            return
        L37:
            long r9 = r11.m()
        L3b:
            if (r14 < 0) goto L93
        L3d:
            int r4 = r11.sizeCtl
            long r12 = (long) r4
            int r14 = (r9 > r12 ? 1 : (r9 == r12 ? 0 : -1))
            if (r14 < 0) goto L93
            j$.util.concurrent.ConcurrentHashMap$l[] r12 = r11.f16019j
            if (r12 == 0) goto L93
            int r13 = r12.length
            r14 = 1073741824(0x40000000, float:2.0)
            if (r13 >= r14) goto L93
            int r13 = j(r13)
            if (r4 >= 0) goto L7b
            int r14 = r4 >>> 16
            if (r14 != r13) goto L93
            int r14 = r13 + 1
            if (r4 == r14) goto L93
            r14 = 65535(0xffff, float:9.1834E-41)
            int r13 = r13 + r14
            if (r4 == r13) goto L93
            j$.util.concurrent.ConcurrentHashMap$l[] r13 = r11.f16020k
            if (r13 == 0) goto L93
            int r14 = r11.transferIndex
            if (r14 > 0) goto L6a
            goto L93
        L6a:
            sun.misc.Unsafe r0 = j$.util.concurrent.ConcurrentHashMap.f16011b
            long r2 = j$.util.concurrent.ConcurrentHashMap.f16012c
            int r5 = r4 + 1
            r1 = r11
            boolean r14 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r14 == 0) goto L8e
            r11.p(r12, r13)
            goto L8e
        L7b:
            sun.misc.Unsafe r0 = j$.util.concurrent.ConcurrentHashMap.f16011b
            long r2 = j$.util.concurrent.ConcurrentHashMap.f16012c
            int r13 = r13 << 16
            int r5 = r13 + 2
            r1 = r11
            boolean r13 = r0.compareAndSwapInt(r1, r2, r4, r5)
            if (r13 == 0) goto L8e
            r13 = 0
            r11.p(r12, r13)
        L8e:
            long r9 = r11.m()
            goto L3d
        L93:
            return
        L94:
            r11.e(r12, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.a(long, int):void");
    }

    static final boolean b(l[] lVarArr, int i2, l lVar, l lVar2) {
        return f16011b.compareAndSwapObject(lVarArr, (i2 << f16018i) + f16017h, (Object) null, lVar2);
    }

    static Class c(Object obj) {
        Type[] actualTypeArguments;
        if (!(obj instanceof Comparable)) {
            return null;
        }
        Class<?> cls = obj.getClass();
        if (cls == String.class) {
            return cls;
        }
        Type[] genericInterfaces = cls.getGenericInterfaces();
        if (genericInterfaces == null) {
            return null;
        }
        for (Type type : genericInterfaces) {
            if (type instanceof ParameterizedType) {
                ParameterizedType parameterizedType = (ParameterizedType) type;
                if (parameterizedType.getRawType() == Comparable.class && (actualTypeArguments = parameterizedType.getActualTypeArguments()) != null && actualTypeArguments.length == 1 && actualTypeArguments[0] == cls) {
                    return cls;
                }
            }
        }
        return null;
    }

    static int d(Class cls, Object obj, Object obj2) {
        if (obj2 == null || obj2.getClass() != cls) {
            return 0;
        }
        return ((Comparable) obj).compareTo(obj2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:279:0x009b, code lost:
    
        if (r24.f16021l != r7) goto L321;
     */
    /* JADX WARN: Code restructure failed: missing block: B:280:0x009d, code lost:
    
        r1 = new j$.util.concurrent.ConcurrentHashMap.c[r8 << 1];
        r2 = 0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:281:0x00a2, code lost:
    
        if (r2 >= r8) goto L338;
     */
    /* JADX WARN: Code restructure failed: missing block: B:282:0x00a4, code lost:
    
        r1[r2] = r7[r2];
        r2 = r2 + 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:283:0x00ab, code lost:
    
        r24.f16021l = r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:255:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:316:0x0101 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:336:0x001b A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final void e(long r25, boolean r27) {
        /*
            Method dump skipped, instructions count: 258
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.e(long, boolean):void");
    }

    private final l[] g() {
        while (true) {
            l[] lVarArr = this.f16019j;
            if (lVarArr != null && lVarArr.length != 0) {
                return lVarArr;
            }
            int i2 = this.sizeCtl;
            if (i2 < 0) {
                Thread.yield();
            } else if (f16011b.compareAndSwapInt(this, f16012c, i2, -1)) {
                try {
                    l[] lVarArr2 = this.f16019j;
                    if (lVarArr2 == null || lVarArr2.length == 0) {
                        int i3 = i2 > 0 ? i2 : 16;
                        l[] lVarArr3 = new l[i3];
                        this.f16019j = lVarArr3;
                        i2 = i3 - (i3 >>> 2);
                        lVarArr2 = lVarArr3;
                    }
                    this.sizeCtl = i2;
                    return lVarArr2;
                } catch (Throwable th) {
                    this.sizeCtl = i2;
                    throw th;
                }
            }
        }
    }

    static final int j(int i2) {
        return Integer.numberOfLeadingZeros(i2) | 32768;
    }

    static final void k(l[] lVarArr, int i2, l lVar) {
        f16011b.putObjectVolatile(lVarArr, (i2 << f16018i) + f16017h, lVar);
    }

    static final int l(int i2) {
        return (i2 ^ (i2 >>> 16)) & Integer.MAX_VALUE;
    }

    static final l n(l[] lVarArr, int i2) {
        return (l) f16011b.getObjectVolatile(lVarArr, (i2 << f16018i) + f16017h);
    }

    private static final int o(int i2) {
        int i3 = i2 - 1;
        int i4 = i3 | (i3 >>> 1);
        int i5 = i4 | (i4 >>> 2);
        int i6 = i5 | (i5 >>> 4);
        int i7 = i6 | (i6 >>> 8);
        int i8 = i7 | (i7 >>> 16);
        if (i8 < 0) {
            return 1;
        }
        if (i8 >= 1073741824) {
            return 1073741824;
        }
        return 1 + i8;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r13v12, types: [j$.util.concurrent.ConcurrentHashMap$l] */
    /* JADX WARN: Type inference failed for: r13v14, types: [j$.util.concurrent.ConcurrentHashMap$l] */
    /* JADX WARN: Type inference failed for: r4v9, types: [j$.util.concurrent.ConcurrentHashMap$l] */
    /* JADX WARN: Type inference failed for: r6v17, types: [j$.util.concurrent.ConcurrentHashMap$l] */
    /* JADX WARN: Type inference failed for: r6v22, types: [j$.util.concurrent.ConcurrentHashMap$l] */
    private final void p(l[] lVarArr, l[] lVarArr2) {
        l[] lVarArr3;
        ConcurrentHashMap<K, V> concurrentHashMap;
        l[] lVarArr4;
        int i2;
        int i3;
        g gVar;
        ConcurrentHashMap<K, V> concurrentHashMap2;
        int i4;
        int i5;
        r lVar;
        int i6;
        ConcurrentHashMap<K, V> concurrentHashMap3 = this;
        int length = lVarArr.length;
        int i7 = a;
        int i8 = i7 > 1 ? (length >>> 3) / i7 : length;
        int i9 = i8 < 16 ? 16 : i8;
        if (lVarArr2 == null) {
            try {
                l[] lVarArr5 = new l[length << 1];
                concurrentHashMap3.f16020k = lVarArr5;
                concurrentHashMap3.transferIndex = length;
                lVarArr3 = lVarArr5;
            } catch (Throwable unused) {
                concurrentHashMap3.sizeCtl = Integer.MAX_VALUE;
                return;
            }
        } else {
            lVarArr3 = lVarArr2;
        }
        int length2 = lVarArr3.length;
        g gVar2 = new g(lVarArr3);
        l[] lVarArr6 = lVarArr;
        ConcurrentHashMap<K, V> concurrentHashMap4 = concurrentHashMap3;
        int i10 = 0;
        int i11 = 0;
        boolean zB = true;
        boolean z = false;
        while (true) {
            if (zB) {
                int i12 = i10 - 1;
                if (i12 >= i11 || z) {
                    concurrentHashMap = concurrentHashMap4;
                    lVarArr4 = lVarArr6;
                    i10 = i12;
                    i11 = i11;
                    lVarArr6 = lVarArr4;
                    concurrentHashMap4 = concurrentHashMap;
                    zB = false;
                } else {
                    int i13 = concurrentHashMap4.transferIndex;
                    if (i13 <= 0) {
                        concurrentHashMap = concurrentHashMap4;
                        lVarArr4 = lVarArr6;
                        i10 = -1;
                    } else {
                        Unsafe unsafe = f16011b;
                        long j2 = f16013d;
                        int i14 = i13 > i9 ? i13 - i9 : 0;
                        concurrentHashMap = concurrentHashMap4;
                        lVarArr4 = lVarArr6;
                        int i15 = i11;
                        if (unsafe.compareAndSwapInt(this, j2, i13, i14)) {
                            i10 = i13 - 1;
                            i11 = i14;
                        } else {
                            lVarArr6 = lVarArr4;
                            i10 = i12;
                            i11 = i15;
                            concurrentHashMap4 = concurrentHashMap;
                        }
                    }
                    lVarArr6 = lVarArr4;
                    concurrentHashMap4 = concurrentHashMap;
                    zB = false;
                }
            } else {
                ConcurrentHashMap<K, V> concurrentHashMap5 = concurrentHashMap4;
                l[] lVarArr7 = lVarArr6;
                int i16 = i11;
                r lVar2 = null;
                if (i10 < 0 || i10 >= length || (i5 = i10 + length) >= length2) {
                    i2 = i9;
                    i3 = length2;
                    gVar = gVar2;
                    if (z) {
                        this.f16020k = null;
                        this.f16019j = lVarArr3;
                        this.sizeCtl = (length << 1) - (length >>> 1);
                        return;
                    }
                    concurrentHashMap2 = this;
                    Unsafe unsafe2 = f16011b;
                    long j3 = f16012c;
                    int i17 = concurrentHashMap2.sizeCtl;
                    i4 = i10;
                    if (!unsafe2.compareAndSwapInt(this, j3, i17, i17 - 1)) {
                        lVarArr6 = lVarArr7;
                        concurrentHashMap4 = concurrentHashMap2;
                        i10 = i4;
                        gVar2 = gVar;
                        concurrentHashMap3 = concurrentHashMap2;
                        i11 = i16;
                        i9 = i2;
                        length2 = i3;
                    } else {
                        if (i17 - 2 != (j(length) << 16)) {
                            return;
                        }
                        i10 = length;
                        concurrentHashMap4 = concurrentHashMap2;
                        lVarArr6 = lVarArr7;
                        zB = true;
                        z = true;
                        gVar2 = gVar;
                        concurrentHashMap3 = concurrentHashMap2;
                        i11 = i16;
                        i9 = i2;
                        length2 = i3;
                    }
                } else {
                    ?? N = n(lVarArr7, i10);
                    if (N == 0) {
                        zB = b(lVarArr7, i10, null, gVar2);
                        concurrentHashMap2 = concurrentHashMap3;
                        i2 = i9;
                        gVar = gVar2;
                        lVarArr6 = lVarArr7;
                        concurrentHashMap4 = concurrentHashMap5;
                    } else {
                        int i18 = N.a;
                        if (i18 == -1) {
                            concurrentHashMap2 = concurrentHashMap3;
                            i2 = i9;
                            gVar = gVar2;
                            lVarArr6 = lVarArr7;
                            concurrentHashMap4 = concurrentHashMap5;
                            zB = true;
                        } else {
                            synchronized (N) {
                                if (n(lVarArr7, i10) == N) {
                                    if (i18 >= 0) {
                                        int i19 = i18 & length;
                                        r rVar = N;
                                        for (r rVar2 = N.f16033d; rVar2 != null; rVar2 = rVar2.f16033d) {
                                            int i20 = rVar2.a & length;
                                            if (i20 != i19) {
                                                rVar = rVar2;
                                                i19 = i20;
                                            }
                                        }
                                        if (i19 == 0) {
                                            lVar = rVar;
                                        } else {
                                            lVar = null;
                                            lVar2 = rVar;
                                        }
                                        l lVar3 = N;
                                        while (lVar3 != rVar) {
                                            int i21 = lVar3.a;
                                            r rVar3 = rVar;
                                            Object obj = lVar3.f16031b;
                                            int i22 = i9;
                                            Object obj2 = lVar3.f16032c;
                                            if ((i21 & length) == 0) {
                                                i6 = length2;
                                                lVar = new l(i21, obj, obj2, lVar);
                                            } else {
                                                i6 = length2;
                                                lVar2 = new l(i21, obj, obj2, lVar2);
                                            }
                                            lVar3 = lVar3.f16033d;
                                            rVar = rVar3;
                                            i9 = i22;
                                            length2 = i6;
                                        }
                                        i2 = i9;
                                        i3 = length2;
                                        k(lVarArr3, i10, lVar);
                                        k(lVarArr3, i5, lVar2);
                                        k(lVarArr7, i10, gVar2);
                                        gVar = gVar2;
                                    } else {
                                        i2 = i9;
                                        i3 = length2;
                                        if (N instanceof q) {
                                            q qVar = (q) N;
                                            r rVar4 = null;
                                            r rVar5 = null;
                                            l lVar4 = qVar.f16047h;
                                            int i23 = 0;
                                            int i24 = 0;
                                            r rVar6 = null;
                                            while (lVar4 != null) {
                                                q qVar2 = qVar;
                                                int i25 = lVar4.a;
                                                g gVar3 = gVar2;
                                                r rVar7 = new r(i25, lVar4.f16031b, lVar4.f16032c, null, null);
                                                if ((i25 & length) == 0) {
                                                    rVar7.f16052h = rVar5;
                                                    if (rVar5 == null) {
                                                        lVar2 = rVar7;
                                                    } else {
                                                        rVar5.f16033d = rVar7;
                                                    }
                                                    i23++;
                                                    rVar5 = rVar7;
                                                } else {
                                                    rVar7.f16052h = rVar4;
                                                    if (rVar4 == null) {
                                                        rVar6 = rVar7;
                                                    } else {
                                                        rVar4.f16033d = rVar7;
                                                    }
                                                    i24++;
                                                    rVar4 = rVar7;
                                                }
                                                lVar4 = lVar4.f16033d;
                                                qVar = qVar2;
                                                gVar2 = gVar3;
                                            }
                                            q qVar3 = qVar;
                                            g gVar4 = gVar2;
                                            l lVarS = i23 <= 6 ? s(lVar2) : i24 != 0 ? new q(lVar2) : qVar3;
                                            l lVarS2 = i24 <= 6 ? s(rVar6) : i23 != 0 ? new q(rVar6) : qVar3;
                                            k(lVarArr3, i10, lVarS);
                                            k(lVarArr3, i5, lVarS2);
                                            gVar = gVar4;
                                            k(lVarArr, i10, gVar);
                                            lVarArr7 = lVarArr;
                                        }
                                    }
                                    zB = true;
                                } else {
                                    i2 = i9;
                                    i3 = length2;
                                }
                                gVar = gVar2;
                            }
                            i4 = i10;
                            lVarArr6 = lVarArr7;
                            concurrentHashMap2 = this;
                            concurrentHashMap4 = concurrentHashMap2;
                            i10 = i4;
                            gVar2 = gVar;
                            concurrentHashMap3 = concurrentHashMap2;
                            i11 = i16;
                            i9 = i2;
                            length2 = i3;
                        }
                    }
                    i3 = length2;
                    gVar2 = gVar;
                    concurrentHashMap3 = concurrentHashMap2;
                    i11 = i16;
                    i9 = i2;
                    length2 = i3;
                }
            }
        }
    }

    private final void q(l[] lVarArr, int i2) {
        int length = lVarArr.length;
        if (length < 64) {
            r(length << 1);
            return;
        }
        l lVarN = n(lVarArr, i2);
        if (lVarN == null || lVarN.a < 0) {
            return;
        }
        synchronized (lVarN) {
            if (n(lVarArr, i2) == lVarN) {
                r rVar = null;
                l lVar = lVarN;
                r rVar2 = null;
                while (lVar != null) {
                    r rVar3 = new r(lVar.a, lVar.f16031b, lVar.f16032c, null, null);
                    rVar3.f16052h = rVar2;
                    if (rVar2 == null) {
                        rVar = rVar3;
                    } else {
                        rVar2.f16033d = rVar3;
                    }
                    lVar = lVar.f16033d;
                    rVar2 = rVar3;
                }
                k(lVarArr, i2, new q(rVar));
            }
        }
    }

    private final void r(int i2) {
        int length;
        l[] lVarArr;
        int iO = i2 >= 536870912 ? 1073741824 : o(i2 + (i2 >>> 1) + 1);
        while (true) {
            int i3 = this.sizeCtl;
            if (i3 < 0) {
                return;
            }
            l[] lVarArr2 = this.f16019j;
            if (lVarArr2 == null || (length = lVarArr2.length) == 0) {
                int i4 = i3 > iO ? i3 : iO;
                if (f16011b.compareAndSwapInt(this, f16012c, i3, -1)) {
                    try {
                        if (this.f16019j == lVarArr2) {
                            this.f16019j = new l[i4];
                            i3 = i4 - (i4 >>> 2);
                        }
                    } finally {
                        this.sizeCtl = i3;
                    }
                } else {
                    continue;
                }
            } else {
                if (iO <= i3 || length >= 1073741824) {
                    return;
                }
                if (lVarArr2 == this.f16019j) {
                    int iJ = j(length);
                    if (i3 < 0) {
                        if ((i3 >>> 16) != iJ || i3 == iJ + 1 || i3 == iJ + Settings.DEFAULT_INITIAL_WINDOW_SIZE || (lVarArr = this.f16020k) == null || this.transferIndex <= 0) {
                            return;
                        }
                        if (f16011b.compareAndSwapInt(this, f16012c, i3, i3 + 1)) {
                            p(lVarArr2, lVarArr);
                        }
                    } else if (f16011b.compareAndSwapInt(this, f16012c, i3, (iJ << 16) + 2)) {
                        p(lVarArr2, null);
                    }
                } else {
                    continue;
                }
            }
        }
    }

    static l s(l lVar) {
        l lVar2 = null;
        l lVar3 = null;
        while (lVar != null) {
            l lVar4 = new l(lVar.a, lVar.f16031b, lVar.f16032c, null);
            if (lVar3 == null) {
                lVar2 = lVar4;
            } else {
                lVar3.f16033d = lVar4;
            }
            lVar = lVar.f16033d;
            lVar3 = lVar4;
        }
        return lVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map, java.util.HashMap
    public void clear() {
        l lVarN;
        l[] lVarArrF = this.f16019j;
        long j2 = 0;
        loop0: while (true) {
            int i2 = 0;
            while (lVarArrF != null && i2 < lVarArrF.length) {
                lVarN = n(lVarArrF, i2);
                if (lVarN == null) {
                    i2++;
                } else {
                    int i3 = lVarN.a;
                    if (i3 == -1) {
                        break;
                    }
                    synchronized (lVarN) {
                        if (n(lVarArrF, i2) == lVarN) {
                            for (l lVar = i3 >= 0 ? lVarN : lVarN instanceof q ? ((q) lVarN).f16047h : null; lVar != null; lVar = lVar.f16033d) {
                                j2--;
                            }
                            k(lVarArrF, i2, null);
                            i2++;
                        }
                    }
                }
            }
            lVarArrF = f(lVarArrF, lVarN);
        }
        if (j2 != 0) {
            a(j2, -1);
        }
    }

    @Override // j$.util.Map
    public Object compute(Object obj, BiFunction biFunction) {
        int i2;
        l lVar;
        Object objApply;
        int i3;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int iL = l(obj.hashCode());
        l[] lVarArrG = this.f16019j;
        int i4 = 0;
        Object obj3 = null;
        int i5 = 0;
        while (true) {
            if (lVarArrG != null) {
                int length = lVarArrG.length;
                if (length != 0) {
                    int i6 = (length - 1) & iL;
                    l lVarN = n(lVarArrG, i6);
                    int i7 = 1;
                    if (lVarN == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            if (b(lVarArrG, i6, null, mVar)) {
                                try {
                                    Object objApply2 = biFunction.apply(obj, null);
                                    if (objApply2 != null) {
                                        lVar = new l(iL, obj, objApply2, null);
                                        i2 = 1;
                                    } else {
                                        i2 = i4;
                                        lVar = null;
                                    }
                                    k(lVarArrG, i6, lVar);
                                    i4 = i2;
                                    obj3 = objApply2;
                                    i5 = 1;
                                } catch (Throwable th) {
                                    k(lVarArrG, i6, null);
                                    throw th;
                                }
                            }
                        }
                        if (i5 != 0) {
                            break;
                        }
                    } else {
                        int i8 = lVarN.a;
                        if (i8 == -1) {
                            lVarArrG = f(lVarArrG, lVarN);
                        } else {
                            synchronized (lVarN) {
                                if (n(lVarArrG, i6) == lVarN) {
                                    if (i8 >= 0) {
                                        l lVar2 = null;
                                        l lVar3 = lVarN;
                                        i3 = 1;
                                        while (true) {
                                            if (lVar3.a == iL && ((obj2 = lVar3.f16031b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                break;
                                            }
                                            l lVar4 = lVar3.f16033d;
                                            if (lVar4 == null) {
                                                objApply = biFunction.apply(obj, null);
                                                if (objApply != null) {
                                                    lVar3.f16033d = new l(iL, obj, objApply, null);
                                                } else {
                                                    i5 = i3;
                                                    obj3 = objApply;
                                                }
                                            } else {
                                                i3++;
                                                lVar2 = lVar3;
                                                lVar3 = lVar4;
                                            }
                                        }
                                        Object objApply3 = biFunction.apply(obj, lVar3.f16032c);
                                        if (objApply3 != null) {
                                            lVar3.f16032c = objApply3;
                                            i5 = i3;
                                            obj3 = objApply3;
                                        } else {
                                            l lVar5 = lVar3.f16033d;
                                            if (lVar2 != null) {
                                                lVar2.f16033d = lVar5;
                                            } else {
                                                k(lVarArrG, i6, lVar5);
                                            }
                                            objApply = objApply3;
                                            i7 = i3;
                                            i5 = i7;
                                            obj3 = objApply;
                                            i4 = -1;
                                        }
                                    } else if (lVarN instanceof q) {
                                        q qVar = (q) lVarN;
                                        r rVar = qVar.f16046g;
                                        r rVarB = rVar != null ? rVar.b(iL, obj, null) : null;
                                        objApply = biFunction.apply(obj, rVarB == null ? null : rVarB.f16032c);
                                        if (objApply != null) {
                                            if (rVarB != null) {
                                                rVarB.f16032c = objApply;
                                            } else {
                                                qVar.f(iL, obj, objApply);
                                                i3 = 1;
                                                i5 = i3;
                                                obj3 = objApply;
                                                i4 = 1;
                                            }
                                        } else if (rVarB != null) {
                                            if (qVar.g(rVarB)) {
                                                k(lVarArrG, i6, s(qVar.f16047h));
                                            }
                                            i5 = i7;
                                            obj3 = objApply;
                                            i4 = -1;
                                        }
                                        obj3 = objApply;
                                        i5 = 1;
                                    }
                                }
                            }
                            if (i5 != 0) {
                                if (i5 >= 8) {
                                    q(lVarArrG, i6);
                                }
                            }
                        }
                    }
                }
            }
            lVarArrG = g();
        }
        if (i4 != 0) {
            a(i4, i5);
        }
        return obj3;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, C0269s.b(biFunction));
    }

    @Override // j$.util.Map
    public Object computeIfAbsent(Object obj, Function function) {
        r rVarB;
        Object obj2;
        if (obj == null || function == null) {
            throw null;
        }
        int iL = l(obj.hashCode());
        l[] lVarArrG = this.f16019j;
        Object objApply = null;
        int i2 = 0;
        while (true) {
            if (lVarArrG != null) {
                int length = lVarArrG.length;
                if (length != 0) {
                    int i3 = (length - 1) & iL;
                    l lVarN = n(lVarArrG, i3);
                    boolean z = true;
                    if (lVarN == null) {
                        m mVar = new m();
                        synchronized (mVar) {
                            if (b(lVarArrG, i3, null, mVar)) {
                                try {
                                    Object objApply2 = function.apply(obj);
                                    k(lVarArrG, i3, objApply2 != null ? new l(iL, obj, objApply2, null) : null);
                                    objApply = objApply2;
                                    i2 = 1;
                                } catch (Throwable th) {
                                    k(lVarArrG, i3, null);
                                    throw th;
                                }
                            }
                        }
                        if (i2 != 0) {
                            break;
                        }
                    } else {
                        int i4 = lVarN.a;
                        if (i4 == -1) {
                            lVarArrG = f(lVarArrG, lVarN);
                        } else {
                            synchronized (lVarN) {
                                if (n(lVarArrG, i3) == lVarN) {
                                    if (i4 >= 0) {
                                        l lVar = lVarN;
                                        i2 = 1;
                                        while (true) {
                                            if (lVar.a == iL && ((obj2 = lVar.f16031b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                                break;
                                            }
                                            l lVar2 = lVar.f16033d;
                                            if (lVar2 == null) {
                                                Object objApply3 = function.apply(obj);
                                                if (objApply3 != null) {
                                                    lVar.f16033d = new l(iL, obj, objApply3, null);
                                                    objApply = objApply3;
                                                } else {
                                                    objApply = objApply3;
                                                }
                                            } else {
                                                i2++;
                                                lVar = lVar2;
                                            }
                                        }
                                        objApply = lVar.f16032c;
                                    } else if (lVarN instanceof q) {
                                        q qVar = (q) lVarN;
                                        r rVar = qVar.f16046g;
                                        if (rVar == null || (rVarB = rVar.b(iL, obj, null)) == null) {
                                            objApply = function.apply(obj);
                                            if (objApply != null) {
                                                qVar.f(iL, obj, objApply);
                                                i2 = 2;
                                            }
                                        } else {
                                            objApply = rVarB.f16032c;
                                        }
                                        i2 = 2;
                                    }
                                }
                                z = false;
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    q(lVarArrG, i3);
                                }
                                if (!z) {
                                    return objApply;
                                }
                            }
                        }
                    }
                }
            }
            lVarArrG = g();
        }
        if (objApply != null) {
            a(1L, i2);
        }
        return objApply;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, M.c(function));
    }

    @Override // j$.util.Map
    public Object computeIfPresent(Object obj, BiFunction biFunction) {
        r rVarB;
        l lVarS;
        Object obj2;
        if (obj == null || biFunction == null) {
            throw null;
        }
        int iL = l(obj.hashCode());
        l[] lVarArrG = this.f16019j;
        int i2 = 0;
        Object objApply = null;
        int i3 = 0;
        while (true) {
            if (lVarArrG != null) {
                int length = lVarArrG.length;
                if (length != 0) {
                    int i4 = (length - 1) & iL;
                    l lVarN = n(lVarArrG, i4);
                    if (lVarN == null) {
                        break;
                    }
                    int i5 = lVarN.a;
                    if (i5 == -1) {
                        lVarArrG = f(lVarArrG, lVarN);
                    } else {
                        synchronized (lVarN) {
                            if (n(lVarArrG, i4) == lVarN) {
                                if (i5 >= 0) {
                                    i3 = 1;
                                    l lVar = null;
                                    l lVar2 = lVarN;
                                    while (true) {
                                        if (lVar2.a == iL && ((obj2 = lVar2.f16031b) == obj || (obj2 != null && obj.equals(obj2)))) {
                                            break;
                                        }
                                        l lVar3 = lVar2.f16033d;
                                        if (lVar3 == null) {
                                            break;
                                        }
                                        i3++;
                                        lVar = lVar2;
                                        lVar2 = lVar3;
                                    }
                                    objApply = biFunction.apply(obj, lVar2.f16032c);
                                    if (objApply != null) {
                                        lVar2.f16032c = objApply;
                                    } else {
                                        lVarS = lVar2.f16033d;
                                        if (lVar != null) {
                                            lVar.f16033d = lVarS;
                                        } else {
                                            k(lVarArrG, i4, lVarS);
                                        }
                                        i2 = -1;
                                    }
                                } else if (lVarN instanceof q) {
                                    i3 = 2;
                                    q qVar = (q) lVarN;
                                    r rVar = qVar.f16046g;
                                    if (rVar != null && (rVarB = rVar.b(iL, obj, null)) != null) {
                                        objApply = biFunction.apply(obj, rVarB.f16032c);
                                        if (objApply != null) {
                                            rVarB.f16032c = objApply;
                                        } else {
                                            if (qVar.g(rVarB)) {
                                                lVarS = s(qVar.f16047h);
                                                k(lVarArrG, i4, lVarS);
                                            }
                                            i2 = -1;
                                        }
                                    }
                                }
                            }
                        }
                        if (i3 != 0) {
                            break;
                        }
                    }
                }
            }
            lVarArrG = g();
        }
        if (i2 != 0) {
            a(i2, i3);
        }
        return objApply;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, C0269s.b(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean containsValue(Object obj) {
        obj.getClass();
        l[] lVarArr = this.f16019j;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                Object obj2 = lVarA.f16032c;
                if (obj2 == obj) {
                    return true;
                }
                if (obj2 != null && obj.equals(obj2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set entrySet() {
        e eVar = this.o;
        if (eVar != null) {
            return eVar;
        }
        e eVar2 = new e(this);
        this.o = eVar2;
        return eVar2;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean equals(Object obj) {
        V value;
        Object obj2;
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        l[] lVarArr = this.f16019j;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                for (Map.Entry<K, V> entry : map.entrySet()) {
                    K key = entry.getKey();
                    if (key == null || (value = entry.getValue()) == null || (obj2 = get(key)) == null || (value != obj2 && !value.equals(obj2))) {
                        return false;
                    }
                }
                return true;
            }
            Object obj3 = lVarA.f16032c;
            Object obj4 = map.get(lVarA.f16031b);
            if (obj4 == null || (obj4 != obj3 && !obj4.equals(obj3))) {
                break;
            }
        }
        return false;
    }

    final l[] f(l[] lVarArr, l lVar) {
        l[] lVarArr2;
        int i2;
        if (!(lVar instanceof g) || (lVarArr2 = ((g) lVar).f16027e) == null) {
            return this.f16019j;
        }
        int iJ = j(lVarArr.length);
        while (true) {
            if (lVarArr2 != this.f16020k || this.f16019j != lVarArr || (i2 = this.sizeCtl) >= 0 || (i2 >>> 16) != iJ || i2 == iJ + 1 || i2 == Settings.DEFAULT_INITIAL_WINDOW_SIZE + iJ || this.transferIndex <= 0) {
                break;
            }
            if (f16011b.compareAndSwapInt(this, f16012c, i2, i2 + 1)) {
                p(lVarArr, lVarArr2);
                break;
            }
        }
        return lVarArr2;
    }

    @Override // j$.util.concurrent.b, j$.util.Map
    public void forEach(BiConsumer biConsumer) {
        biConsumer.getClass();
        l[] lVarArr = this.f16019j;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            } else {
                biConsumer.accept(lVarA.f16031b, lVarA.f16032c);
            }
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(C0266q.b(biConsumer));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Object get(Object obj) {
        int length;
        l lVarN;
        Object obj2;
        int iL = l(obj.hashCode());
        l[] lVarArr = this.f16019j;
        if (lVarArr != null && (length = lVarArr.length) > 0 && (lVarN = n(lVarArr, (length - 1) & iL)) != null) {
            int i2 = lVarN.a;
            if (i2 == iL) {
                Object obj3 = lVarN.f16031b;
                if (obj3 == obj || (obj3 != null && obj.equals(obj3))) {
                    return lVarN.f16032c;
                }
            } else if (i2 < 0) {
                l lVarA = lVarN.a(iL, obj);
                if (lVarA != null) {
                    return lVarA.f16032c;
                }
                return null;
            }
            while (true) {
                lVarN = lVarN.f16033d;
                if (lVarN == null) {
                    break;
                }
                if (lVarN.a == iL && ((obj2 = lVarN.f16031b) == obj || (obj2 != null && obj.equals(obj2)))) {
                    break;
                }
            }
            return lVarN.f16032c;
        }
        return null;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map, java.util.HashMap
    public Object getOrDefault(Object obj, Object obj2) {
        Object obj3 = get(obj);
        return obj3 == null ? obj2 : obj3;
    }

    final Object h(Object obj, Object obj2, boolean z) {
        Object obj3;
        l lVarF;
        Object obj4;
        if (obj == null || obj2 == null) {
            throw null;
        }
        int iL = l(obj.hashCode());
        int i2 = 0;
        l[] lVarArrG = this.f16019j;
        while (true) {
            if (lVarArrG != null) {
                int length = lVarArrG.length;
                if (length != 0) {
                    int i3 = (length - 1) & iL;
                    l lVarN = n(lVarArrG, i3);
                    if (lVarN != null) {
                        int i4 = lVarN.a;
                        if (i4 == -1) {
                            lVarArrG = f(lVarArrG, lVarN);
                        } else {
                            synchronized (lVarN) {
                                if (n(lVarArrG, i3) == lVarN) {
                                    if (i4 >= 0) {
                                        i2 = 1;
                                        lVarF = lVarN;
                                        while (true) {
                                            if (lVarF.a == iL && ((obj4 = lVarF.f16031b) == obj || (obj4 != null && obj.equals(obj4)))) {
                                                break;
                                            }
                                            l lVar = lVarF.f16033d;
                                            if (lVar == null) {
                                                lVarF.f16033d = new l(iL, obj, obj2, null);
                                                break;
                                            }
                                            i2++;
                                            lVarF = lVar;
                                        }
                                        obj3 = lVarF.f16032c;
                                        if (!z) {
                                            lVarF.f16032c = obj2;
                                        }
                                    } else if (lVarN instanceof q) {
                                        i2 = 2;
                                        lVarF = ((q) lVarN).f(iL, obj, obj2);
                                        if (lVarF != null) {
                                            obj3 = lVarF.f16032c;
                                            if (!z) {
                                                lVarF.f16032c = obj2;
                                            }
                                        }
                                    }
                                }
                                obj3 = null;
                            }
                            if (i2 != 0) {
                                if (i2 >= 8) {
                                    q(lVarArrG, i3);
                                }
                                if (obj3 != null) {
                                    return obj3;
                                }
                            }
                        }
                    } else if (b(lVarArrG, i3, null, new l(iL, obj, obj2, null))) {
                        break;
                    }
                }
            }
            lVarArrG = g();
        }
        a(1L, i2);
        return null;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int hashCode() {
        l[] lVarArr = this.f16019j;
        int iHashCode = 0;
        if (lVarArr != null) {
            p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
            while (true) {
                l lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                iHashCode += lVarA.f16032c.hashCode() ^ lVarA.f16031b.hashCode();
            }
        }
        return iHashCode;
    }

    /* JADX WARN: Code restructure failed: missing block: B:194:0x0042, code lost:
    
        r8 = r5.f16032c;
     */
    /* JADX WARN: Code restructure failed: missing block: B:195:0x0044, code lost:
    
        if (r15 == null) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:196:0x0046, code lost:
    
        if (r15 == r8) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:197:0x0048, code lost:
    
        if (r8 == null) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:199:0x004e, code lost:
    
        if (r15.equals(r8) == false) goto L208;
     */
    /* JADX WARN: Code restructure failed: missing block: B:200:0x0050, code lost:
    
        if (r14 == null) goto L202;
     */
    /* JADX WARN: Code restructure failed: missing block: B:201:0x0052, code lost:
    
        r5.f16032c = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:202:0x0055, code lost:
    
        if (r7 == null) goto L204;
     */
    /* JADX WARN: Code restructure failed: missing block: B:203:0x0057, code lost:
    
        r7.f16033d = r5.f16033d;
     */
    /* JADX WARN: Code restructure failed: missing block: B:204:0x005c, code lost:
    
        r5 = r5.f16033d;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    final java.lang.Object i(java.lang.Object r13, java.lang.Object r14, java.lang.Object r15) {
        /*
            r12 = this;
            int r0 = r13.hashCode()
            int r0 = l(r0)
            j$.util.concurrent.ConcurrentHashMap$l[] r1 = r12.f16019j
        La:
            r2 = 0
            if (r1 == 0) goto Laf
            int r3 = r1.length
            if (r3 == 0) goto Laf
            int r3 = r3 + (-1)
            r3 = r3 & r0
            j$.util.concurrent.ConcurrentHashMap$l r4 = n(r1, r3)
            if (r4 != 0) goto L1b
            goto Laf
        L1b:
            int r5 = r4.a
            r6 = -1
            if (r5 != r6) goto L25
            j$.util.concurrent.ConcurrentHashMap$l[] r1 = r12.f(r1, r4)
            goto La
        L25:
            r7 = 0
            monitor-enter(r4)
            j$.util.concurrent.ConcurrentHashMap$l r8 = n(r1, r3)     // Catch: java.lang.Throwable -> Lac
            r9 = 1
            if (r8 != r4) goto L9d
            if (r5 < 0) goto L6c
            r7 = r2
            r5 = r4
        L32:
            int r8 = r5.a     // Catch: java.lang.Throwable -> Lac
            if (r8 != r0) goto L62
            java.lang.Object r8 = r5.f16031b     // Catch: java.lang.Throwable -> Lac
            if (r8 == r13) goto L42
            if (r8 == 0) goto L62
            boolean r8 = r13.equals(r8)     // Catch: java.lang.Throwable -> Lac
            if (r8 == 0) goto L62
        L42:
            java.lang.Object r8 = r5.f16032c     // Catch: java.lang.Throwable -> Lac
            if (r15 == 0) goto L50
            if (r15 == r8) goto L50
            if (r8 == 0) goto L66
            boolean r10 = r15.equals(r8)     // Catch: java.lang.Throwable -> Lac
            if (r10 == 0) goto L66
        L50:
            if (r14 == 0) goto L55
            r5.f16032c = r14     // Catch: java.lang.Throwable -> Lac
            goto L9f
        L55:
            if (r7 == 0) goto L5c
            j$.util.concurrent.ConcurrentHashMap$l r3 = r5.f16033d     // Catch: java.lang.Throwable -> Lac
            r7.f16033d = r3     // Catch: java.lang.Throwable -> Lac
            goto L9f
        L5c:
            j$.util.concurrent.ConcurrentHashMap$l r5 = r5.f16033d     // Catch: java.lang.Throwable -> Lac
        L5e:
            k(r1, r3, r5)     // Catch: java.lang.Throwable -> Lac
            goto L9f
        L62:
            j$.util.concurrent.ConcurrentHashMap$l r7 = r5.f16033d     // Catch: java.lang.Throwable -> Lac
            if (r7 != 0) goto L68
        L66:
            r7 = 1
            goto L9d
        L68:
            r11 = r7
            r7 = r5
            r5 = r11
            goto L32
        L6c:
            boolean r5 = r4 instanceof j$.util.concurrent.ConcurrentHashMap.q     // Catch: java.lang.Throwable -> Lac
            if (r5 == 0) goto L9d
            r5 = r4
            j$.util.concurrent.ConcurrentHashMap$q r5 = (j$.util.concurrent.ConcurrentHashMap.q) r5     // Catch: java.lang.Throwable -> Lac
            j$.util.concurrent.ConcurrentHashMap$r r7 = r5.f16046g     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L66
            j$.util.concurrent.ConcurrentHashMap$r r7 = r7.b(r0, r13, r2)     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L66
            java.lang.Object r8 = r7.f16032c     // Catch: java.lang.Throwable -> Lac
            if (r15 == 0) goto L8b
            if (r15 == r8) goto L8b
            if (r8 == 0) goto L66
            boolean r10 = r15.equals(r8)     // Catch: java.lang.Throwable -> Lac
            if (r10 == 0) goto L66
        L8b:
            if (r14 == 0) goto L90
            r7.f16032c = r14     // Catch: java.lang.Throwable -> Lac
            goto L9f
        L90:
            boolean r7 = r5.g(r7)     // Catch: java.lang.Throwable -> Lac
            if (r7 == 0) goto L9f
            j$.util.concurrent.ConcurrentHashMap$r r5 = r5.f16047h     // Catch: java.lang.Throwable -> Lac
            j$.util.concurrent.ConcurrentHashMap$l r5 = s(r5)     // Catch: java.lang.Throwable -> Lac
            goto L5e
        L9d:
            r8 = r2
            r9 = r7
        L9f:
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lac
            if (r9 == 0) goto La
            if (r8 == 0) goto Laf
            if (r14 != 0) goto Lab
            r13 = -1
            r12.a(r13, r6)
        Lab:
            return r8
        Lac:
            r13 = move-exception
            monitor-exit(r4)     // Catch: java.lang.Throwable -> Lac
            throw r13
        Laf:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.concurrent.ConcurrentHashMap.i(java.lang.Object, java.lang.Object, java.lang.Object):java.lang.Object");
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean isEmpty() {
        return m() <= 0;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set keySet() {
        i iVar = this.f16022m;
        if (iVar != null) {
            return iVar;
        }
        i iVar2 = new i(this, null);
        this.f16022m = iVar2;
        return iVar2;
    }

    final long m() {
        c[] cVarArr = this.f16021l;
        long j2 = this.baseCount;
        if (cVarArr != null) {
            for (c cVar : cVarArr) {
                if (cVar != null) {
                    j2 += cVar.value;
                }
            }
        }
        return j2;
    }

    @Override // j$.util.Map
    public Object merge(Object obj, Object obj2, BiFunction biFunction) {
        int i2;
        Object obj3;
        Object obj4 = obj2;
        if (obj == null || obj4 == null || biFunction == null) {
            throw null;
        }
        int iL = l(obj.hashCode());
        l[] lVarArrG = this.f16019j;
        int i3 = 0;
        Object obj5 = null;
        int i4 = 0;
        while (true) {
            if (lVarArrG != null) {
                int length = lVarArrG.length;
                if (length != 0) {
                    int i5 = (length - 1) & iL;
                    l lVarN = n(lVarArrG, i5);
                    i2 = 1;
                    if (lVarN != null) {
                        int i6 = lVarN.a;
                        if (i6 == -1) {
                            lVarArrG = f(lVarArrG, lVarN);
                        } else {
                            synchronized (lVarN) {
                                if (n(lVarArrG, i5) == lVarN) {
                                    if (i6 >= 0) {
                                        l lVar = null;
                                        l lVar2 = lVarN;
                                        int i7 = 1;
                                        while (true) {
                                            if (lVar2.a == iL && ((obj3 = lVar2.f16031b) == obj || (obj3 != null && obj.equals(obj3)))) {
                                                break;
                                            }
                                            l lVar3 = lVar2.f16033d;
                                            if (lVar3 == null) {
                                                lVar2.f16033d = new l(iL, obj, obj4, null);
                                                i3 = i7;
                                                i4 = 1;
                                                obj5 = obj4;
                                                break;
                                            }
                                            i7++;
                                            lVar = lVar2;
                                            lVar2 = lVar3;
                                        }
                                        Object objApply = biFunction.apply(lVar2.f16032c, obj4);
                                        if (objApply != null) {
                                            lVar2.f16032c = objApply;
                                            i3 = i7;
                                            obj5 = objApply;
                                        } else {
                                            l lVar4 = lVar2.f16033d;
                                            if (lVar != null) {
                                                lVar.f16033d = lVar4;
                                            } else {
                                                k(lVarArrG, i5, lVar4);
                                            }
                                            i3 = i7;
                                            obj5 = objApply;
                                            i4 = -1;
                                        }
                                    } else if (lVarN instanceof q) {
                                        i3 = 2;
                                        q qVar = (q) lVarN;
                                        r rVar = qVar.f16046g;
                                        r rVarB = rVar == null ? null : rVar.b(iL, obj, null);
                                        Object objApply2 = rVarB == null ? obj4 : biFunction.apply(rVarB.f16032c, obj4);
                                        if (objApply2 != null) {
                                            if (rVarB != null) {
                                                rVarB.f16032c = objApply2;
                                            } else {
                                                qVar.f(iL, obj, objApply2);
                                                obj5 = objApply2;
                                                i4 = 1;
                                            }
                                        } else if (rVarB != null) {
                                            if (qVar.g(rVarB)) {
                                                k(lVarArrG, i5, s(qVar.f16047h));
                                            }
                                            obj5 = objApply2;
                                            i4 = -1;
                                        }
                                        obj5 = objApply2;
                                    }
                                }
                            }
                            if (i3 != 0) {
                                if (i3 >= 8) {
                                    q(lVarArrG, i5);
                                }
                                i2 = i4;
                                obj4 = obj5;
                            }
                        }
                    } else if (b(lVarArrG, i5, null, new l(iL, obj, obj4, null))) {
                        break;
                    }
                }
            }
            lVarArrG = g();
        }
        if (i2 != 0) {
            a(i2, i3);
        }
        return obj4;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, C0269s.b(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Object put(Object obj, Object obj2) {
        return h(obj, obj2, false);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public void putAll(java.util.Map map) {
        r(map.size());
        for (Map.Entry<K, V> entry : map.entrySet()) {
            h(entry.getKey(), entry.getValue(), false);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public Object putIfAbsent(Object obj, Object obj2) {
        return h(obj, obj2, true);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Object remove(Object obj) {
        return i(obj, null, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean remove(Object obj, Object obj2) {
        obj.getClass();
        return (obj2 == null || i(obj, null, obj2) == null) ? false : true;
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public Object replace(Object obj, Object obj2) {
        if (obj == null || obj2 == null) {
            throw null;
        }
        return i(obj, obj2, null);
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap, j$.util.Map
    public boolean replace(Object obj, Object obj2, Object obj3) {
        if (obj == null || obj2 == null || obj3 == null) {
            throw null;
        }
        return i(obj, obj3, obj2) != null;
    }

    @Override // j$.util.Map
    public void replaceAll(BiFunction biFunction) {
        biFunction.getClass();
        l[] lVarArr = this.f16019j;
        if (lVarArr == null) {
            return;
        }
        p pVar = new p(lVarArr, lVarArr.length, 0, lVarArr.length);
        while (true) {
            l lVarA = pVar.a();
            if (lVarA == null) {
                return;
            }
            Object obj = lVarA.f16032c;
            Object obj2 = lVarA.f16031b;
            do {
                Object objApply = biFunction.apply(obj2, obj);
                objApply.getClass();
                if (i(obj2, objApply, obj) == null) {
                    obj = get(obj2);
                }
            } while (obj != null);
        }
    }

    @Override // java.util.Map, java.util.concurrent.ConcurrentMap
    public /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(C0269s.b(biFunction));
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int size() {
        long jM = m();
        if (jM < 0) {
            return 0;
        }
        if (jM > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        return (int) jM;
    }

    @Override // java.util.AbstractMap
    public String toString() {
        l[] lVarArr = this.f16019j;
        int length = lVarArr == null ? 0 : lVarArr.length;
        p pVar = new p(lVarArr, length, 0, length);
        StringBuilder sb = new StringBuilder();
        sb.append(CoreConstants.CURLY_LEFT);
        l lVarA = pVar.a();
        if (lVarA != null) {
            while (true) {
                Object obj = lVarA.f16031b;
                Object obj2 = lVarA.f16032c;
                if (obj == this) {
                    obj = "(this Map)";
                }
                sb.append(obj);
                sb.append('=');
                if (obj2 == this) {
                    obj2 = "(this Map)";
                }
                sb.append(obj2);
                lVarA = pVar.a();
                if (lVarA == null) {
                    break;
                }
                sb.append(CoreConstants.COMMA_CHAR);
                sb.append(' ');
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Collection values() {
        u uVar = this.n;
        if (uVar != null) {
            return uVar;
        }
        u uVar2 = new u(this);
        this.n = uVar2;
        return uVar2;
    }

    static abstract class b<K, V, E> implements Collection<E>, Serializable, j$.util.Collection {
        final ConcurrentHashMap a;

        b(ConcurrentHashMap concurrentHashMap) {
            this.a = concurrentHashMap;
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public final void clear() {
            this.a.clear();
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public abstract boolean contains(Object obj);

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public final boolean containsAll(Collection collection) {
            if (collection == this) {
                return true;
            }
            for (E e2 : collection) {
                if (e2 == null || !contains(e2)) {
                    return false;
                }
            }
            return true;
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public final boolean isEmpty() {
            return this.a.isEmpty();
        }

        @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
        public abstract java.util.Iterator iterator();

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream parallelStream() {
            return Q1.v(j$.time.a.L(this), true);
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream parallelStream() {
            return S0.m0(Q1.v(j$.time.a.L(this), true));
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public final boolean removeAll(Collection collection) {
            collection.getClass();
            java.util.Iterator it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // j$.util.Collection
        public /* synthetic */ boolean removeIf(Predicate predicate) {
            return Collection.CC.$default$removeIf(this, predicate);
        }

        @Override // java.util.Collection
        public /* synthetic */ boolean removeIf(java.util.function.Predicate predicate) {
            return Collection.CC.$default$removeIf(this, x0.c(predicate));
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public final boolean retainAll(java.util.Collection collection) {
            collection.getClass();
            java.util.Iterator it = iterator();
            boolean z = false;
            while (it.hasNext()) {
                if (!collection.contains(it.next())) {
                    it.remove();
                    z = true;
                }
            }
            return z;
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public final int size() {
            return this.a.size();
        }

        @Override // java.util.Collection, j$.util.Collection
        public /* synthetic */ Stream stream() {
            return Q1.v(j$.time.a.L(this), false);
        }

        @Override // java.util.Collection
        public /* synthetic */ java.util.stream.Stream stream() {
            return S0.m0(Q1.v(j$.time.a.L(this), false));
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public final Object[] toArray() {
            long jM = this.a.m();
            if (jM < 0) {
                jM = 0;
            }
            if (jM > 2147483639) {
                throw new OutOfMemoryError("Required array size too large");
            }
            int i2 = (int) jM;
            Object[] objArrCopyOf = new Object[i2];
            int i3 = 0;
            java.util.Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (i3 == i2) {
                    if (i2 >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    int i4 = i2 < 1073741819 ? (i2 >>> 1) + 1 + i2 : 2147483639;
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    i2 = i4;
                }
                objArrCopyOf[i3] = next;
                i3++;
            }
            return i3 == i2 ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i3);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append('[');
            java.util.Iterator it = iterator();
            if (it.hasNext()) {
                while (true) {
                    Object next = it.next();
                    if (next == this) {
                        next = "(this Collection)";
                    }
                    sb.append(next);
                    if (!it.hasNext()) {
                        break;
                    }
                    sb.append(CoreConstants.COMMA_CHAR);
                    sb.append(' ');
                }
            }
            sb.append(']');
            return sb.toString();
        }

        @Override // j$.util.Collection
        public Object[] toArray(x xVar) {
            return toArray((Object[]) xVar.apply(0));
        }

        @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
        public final Object[] toArray(Object[] objArr) {
            long jM = this.a.m();
            if (jM < 0) {
                jM = 0;
            }
            if (jM > 2147483639) {
                throw new OutOfMemoryError("Required array size too large");
            }
            int i2 = (int) jM;
            Object[] objArrCopyOf = objArr.length >= i2 ? objArr : (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i2);
            int length = objArrCopyOf.length;
            int i3 = 0;
            java.util.Iterator it = iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (i3 == length) {
                    if (length >= 2147483639) {
                        throw new OutOfMemoryError("Required array size too large");
                    }
                    int i4 = length < 1073741819 ? (length >>> 1) + 1 + length : 2147483639;
                    objArrCopyOf = Arrays.copyOf(objArrCopyOf, i4);
                    length = i4;
                }
                objArrCopyOf[i3] = next;
                i3++;
            }
            if (objArr != objArrCopyOf || i3 >= length) {
                return i3 == length ? objArrCopyOf : Arrays.copyOf(objArrCopyOf, i3);
            }
            objArrCopyOf[i3] = null;
            return objArrCopyOf;
        }
    }
}