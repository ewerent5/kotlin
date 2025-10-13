package j$.util.stream;

import j$.util.Spliterator;
import j$.util.concurrent.ConcurrentHashMap;
import j$.util.function.BiConsumer;
import j$.util.function.C0273a;
import j$.util.function.C0277e;
import j$.util.function.Consumer;
import j$.util.stream.A2;
import j$.util.stream.AbstractC0372w1;
import j$.util.stream.AbstractC0381y2;
import j$.util.stream.S1;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;

/* JADX INFO: Add missing generic type declarations: [T] */
/* renamed from: j$.util.stream.o1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
class C0341o1<T> extends AbstractC0381y2.l<T, T> {

    /* renamed from: j$.util.stream.o1$a */
    class a extends A2.d<T, T> {

        /* renamed from: b, reason: collision with root package name */
        boolean f16330b;

        /* renamed from: c, reason: collision with root package name */
        Object f16331c;

        a(C0341o1 c0341o1, A2 a2) {
            super(a2);
        }

        @Override // j$.util.function.Consumer
        public void accept(Object obj) {
            if (obj == null) {
                if (this.f16330b) {
                    return;
                }
                this.f16330b = true;
                A2 a2 = this.a;
                this.f16331c = null;
                a2.accept((Object) null);
                return;
            }
            Object obj2 = this.f16331c;
            if (obj2 == null || !obj.equals(obj2)) {
                A2 a22 = this.a;
                this.f16331c = obj;
                a22.accept(obj);
            }
        }

        @Override // j$.util.stream.A2.d, j$.util.stream.A2
        public void m() {
            this.f16330b = false;
            this.f16331c = null;
            this.a.m();
        }

        @Override // j$.util.stream.A2.d, j$.util.stream.A2
        public void n(long j2) {
            this.f16330b = false;
            this.f16331c = null;
            this.a.n(-1L);
        }
    }

    /* renamed from: j$.util.stream.o1$b */
    class b extends A2.d<T, T> {

        /* renamed from: b, reason: collision with root package name */
        Set f16332b;

        b(C0341o1 c0341o1, A2 a2) {
            super(a2);
        }

        @Override // j$.util.function.Consumer
        public void accept(Object obj) {
            if (this.f16332b.contains(obj)) {
                return;
            }
            this.f16332b.add(obj);
            this.a.accept(obj);
        }

        @Override // j$.util.stream.A2.d, j$.util.stream.A2
        public void m() {
            this.f16332b = null;
            this.a.m();
        }

        @Override // j$.util.stream.A2.d, j$.util.stream.A2
        public void n(long j2) {
            this.f16332b = new HashSet();
            this.a.n(-1L);
        }
    }

    C0341o1(AbstractC0313h1 abstractC0313h1, U2 u2, int i2) {
        super(abstractC0313h1, u2, i2);
    }

    @Override // j$.util.stream.AbstractC0313h1
    R1 D0(T1 t1, Spliterator spliterator, j$.util.function.x xVar) {
        if (T2.DISTINCT.n(t1.r0())) {
            return t1.o0(spliterator, false, xVar);
        }
        if (T2.ORDERED.n(t1.r0())) {
            return K0(t1, spliterator);
        }
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        final ConcurrentHashMap concurrentHashMap = new ConcurrentHashMap();
        new AbstractC0372w1.d(new Consumer() { // from class: j$.util.stream.m
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
                AtomicBoolean atomicBoolean2 = atomicBoolean;
                ConcurrentHashMap concurrentHashMap2 = concurrentHashMap;
                if (obj == null) {
                    atomicBoolean2.set(true);
                } else {
                    concurrentHashMap2.putIfAbsent(obj, Boolean.TRUE);
                }
            }

            @Override // j$.util.function.Consumer
            public Consumer e(Consumer consumer) {
                Objects.requireNonNull(consumer);
                return new C0277e(this, consumer);
            }
        }, false).c(t1, spliterator);
        Collection collectionKeySet = concurrentHashMap.keySet();
        if (atomicBoolean.get()) {
            HashSet hashSet = new HashSet(collectionKeySet);
            hashSet.add(null);
            collectionKeySet = hashSet;
        }
        return new S1.d(collectionKeySet);
    }

    @Override // j$.util.stream.AbstractC0313h1
    Spliterator E0(T1 t1, Spliterator spliterator) {
        return T2.DISTINCT.n(t1.r0()) ? t1.v0(spliterator) : T2.ORDERED.n(t1.r0()) ? ((S1.d) K0(t1, spliterator)).spliterator() : new Y2(t1.v0(spliterator));
    }

    @Override // j$.util.stream.AbstractC0313h1
    A2 G0(int i2, A2 a2) {
        Objects.requireNonNull(a2);
        return T2.DISTINCT.n(i2) ? a2 : T2.SORTED.n(i2) ? new a(this, a2) : new b(this, a2);
    }

    R1 K0(T1 t1, Spliterator spliterator) {
        A a2 = new j$.util.function.J() { // from class: j$.util.stream.A
            @Override // j$.util.function.J
            public final Object get() {
                return new LinkedHashSet();
            }
        };
        M0 m0 = new BiConsumer() { // from class: j$.util.stream.M0
            @Override // j$.util.function.BiConsumer
            public BiConsumer a(BiConsumer biConsumer) {
                Objects.requireNonNull(biConsumer);
                return new C0273a(this, biConsumer);
            }

            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((LinkedHashSet) obj).add(obj2);
            }
        };
        return new S1.d((Collection) new C0318i2(U2.REFERENCE, new BiConsumer() { // from class: j$.util.stream.i
            @Override // j$.util.function.BiConsumer
            public BiConsumer a(BiConsumer biConsumer) {
                Objects.requireNonNull(biConsumer);
                return new C0273a(this, biConsumer);
            }

            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
            }
        }, m0, a2).c(t1, spliterator));
    }
}