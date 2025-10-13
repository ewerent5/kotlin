package j$.util;

import j$.C0387w;
import j$.util.Iterator;
import j$.util.Spliterator;
import j$.util.function.C;
import j$.util.function.C0277e;
import j$.util.function.C0278f;
import j$.util.function.C0279g;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import j$.util.t;
import java.util.NoSuchElementException;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class v {
    private static final Spliterator a = new g.d();

    /* renamed from: b, reason: collision with root package name */
    private static final Spliterator.b f16419b = new g.b();

    /* renamed from: c, reason: collision with root package name */
    private static final Spliterator.c f16420c = new g.c();

    /* renamed from: d, reason: collision with root package name */
    private static final Spliterator.a f16421d = new g.a();

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> implements java.util.Iterator<T>, Consumer<T>, Iterator {
        boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        Object f16422b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Spliterator f16423c;

        a(Spliterator spliterator) {
            this.f16423c = spliterator;
        }

        @Override // j$.util.function.Consumer
        public void accept(Object obj) {
            this.a = true;
            this.f16422b = obj;
        }

        @Override // j$.util.function.Consumer
        public Consumer e(Consumer consumer) {
            Objects.requireNonNull(consumer);
            return new C0277e(this, consumer);
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
        public boolean hasNext() {
            if (!this.a) {
                this.f16423c.tryAdvance(this);
            }
            return this.a;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public Object next() {
            if (!this.a && !hasNext()) {
                throw new NoSuchElementException();
            }
            this.a = false;
            return this.f16422b;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public /* synthetic */ void remove() {
            Iterator.CC.a(this);
            throw null;
        }
    }

    class b implements t.b, j$.util.function.w {
        boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        int f16424b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Spliterator.b f16425c;

        b(Spliterator.b bVar) {
            this.f16425c = bVar;
        }

        @Override // j$.util.function.w
        public void accept(int i2) {
            this.a = true;
            this.f16424b = i2;
        }

        @Override // j$.util.t
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void forEachRemaining(j$.util.function.w wVar) {
            Objects.requireNonNull(wVar);
            while (hasNext()) {
                wVar.accept(nextInt());
            }
        }

        @Override // j$.util.t.b, j$.util.Iterator
        public void forEachRemaining(Consumer consumer) {
            if (consumer instanceof j$.util.function.w) {
                forEachRemaining((j$.util.function.w) consumer);
                return;
            }
            Objects.requireNonNull(consumer);
            if (w.a) {
                w.a(b.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
                throw null;
            }
            while (hasNext()) {
                consumer.accept(Integer.valueOf(nextInt()));
            }
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            if (!this.a) {
                this.f16425c.tryAdvance(this);
            }
            return this.a;
        }

        @Override // j$.util.function.w
        public j$.util.function.w l(j$.util.function.w wVar) {
            Objects.requireNonNull(wVar);
            return new C0279g(this, wVar);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public Integer next() {
            if (!w.a) {
                return Integer.valueOf(nextInt());
            }
            w.a(b.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
            throw null;
        }

        @Override // j$.util.t.b
        public int nextInt() {
            if (!this.a && !hasNext()) {
                throw new NoSuchElementException();
            }
            this.a = false;
            return this.f16424b;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public /* synthetic */ void remove() {
            Iterator.CC.a(this);
            throw null;
        }
    }

    class c implements t.c, C {
        boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        long f16426b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Spliterator.c f16427c;

        c(Spliterator.c cVar) {
            this.f16427c = cVar;
        }

        @Override // j$.util.function.C
        public void accept(long j2) {
            this.a = true;
            this.f16426b = j2;
        }

        @Override // j$.util.t
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public void forEachRemaining(C c2) {
            Objects.requireNonNull(c2);
            while (hasNext()) {
                c2.accept(nextLong());
            }
        }

        @Override // j$.util.function.C
        public C f(C c2) {
            Objects.requireNonNull(c2);
            return new C0280h(this, c2);
        }

        @Override // j$.util.t.c, j$.util.Iterator
        public void forEachRemaining(Consumer consumer) {
            if (consumer instanceof C) {
                forEachRemaining((C) consumer);
                return;
            }
            Objects.requireNonNull(consumer);
            if (w.a) {
                w.a(c.class, "{0} calling PrimitiveIterator.OfLong.forEachRemainingLong(action::accept)");
                throw null;
            }
            while (hasNext()) {
                consumer.accept(Long.valueOf(nextLong()));
            }
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            if (!this.a) {
                this.f16427c.tryAdvance(this);
            }
            return this.a;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public Long next() {
            if (!w.a) {
                return Long.valueOf(nextLong());
            }
            w.a(c.class, "{0} calling PrimitiveIterator.OfLong.nextLong()");
            throw null;
        }

        @Override // j$.util.t.c
        public long nextLong() {
            if (!this.a && !hasNext()) {
                throw new NoSuchElementException();
            }
            this.a = false;
            return this.f16426b;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public /* synthetic */ void remove() {
            Iterator.CC.a(this);
            throw null;
        }
    }

    class d implements t.a, j$.util.function.q {
        boolean a = false;

        /* renamed from: b, reason: collision with root package name */
        double f16428b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Spliterator.a f16429c;

        d(Spliterator.a aVar) {
            this.f16429c = aVar;
        }

        @Override // j$.util.function.q
        public void accept(double d2) {
            this.a = true;
            this.f16428b = d2;
        }

        @Override // j$.util.t
        /* renamed from: d, reason: merged with bridge method [inline-methods] */
        public void forEachRemaining(j$.util.function.q qVar) {
            Objects.requireNonNull(qVar);
            while (hasNext()) {
                qVar.accept(nextDouble());
            }
        }

        @Override // j$.util.t.a, j$.util.Iterator
        public void forEachRemaining(Consumer consumer) {
            if (consumer instanceof j$.util.function.q) {
                forEachRemaining((j$.util.function.q) consumer);
                return;
            }
            Objects.requireNonNull(consumer);
            if (w.a) {
                w.a(d.class, "{0} calling PrimitiveIterator.OfDouble.forEachRemainingDouble(action::accept)");
                throw null;
            }
            while (hasNext()) {
                consumer.accept(Double.valueOf(nextDouble()));
            }
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public boolean hasNext() {
            if (!this.a) {
                this.f16429c.tryAdvance(this);
            }
            return this.a;
        }

        @Override // j$.util.function.q
        public j$.util.function.q k(j$.util.function.q qVar) {
            Objects.requireNonNull(qVar);
            return new C0278f(this, qVar);
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public Double next() {
            if (!w.a) {
                return Double.valueOf(nextDouble());
            }
            w.a(d.class, "{0} calling PrimitiveIterator.OfDouble.nextLong()");
            throw null;
        }

        @Override // j$.util.t.a
        public double nextDouble() {
            if (!this.a && !hasNext()) {
                throw new NoSuchElementException();
            }
            this.a = false;
            return this.f16428b;
        }

        @Override // java.util.Iterator, j$.util.Iterator
        public /* synthetic */ void remove() {
            Iterator.CC.a(this);
            throw null;
        }
    }

    static final class e<T> implements Spliterator<T> {
        private final Object[] a;

        /* renamed from: b, reason: collision with root package name */
        private int f16430b;

        /* renamed from: c, reason: collision with root package name */
        private final int f16431c;

        /* renamed from: d, reason: collision with root package name */
        private final int f16432d;

        public e(Object[] objArr, int i2, int i3, int i4) {
            this.a = objArr;
            this.f16430b = i2;
            this.f16431c = i3;
            this.f16432d = i4 | 64 | 16384;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return this.f16432d;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.f16431c - this.f16430b;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            int i2;
            consumer.getClass();
            Object[] objArr = this.a;
            int length = objArr.length;
            int i3 = this.f16431c;
            if (length < i3 || (i2 = this.f16430b) < 0) {
                return;
            }
            this.f16430b = i3;
            if (i2 < i3) {
                do {
                    consumer.accept(objArr[i2]);
                    i2++;
                } while (i2 < i3);
            }
        }

        @Override // j$.util.Spliterator
        public java.util.Comparator getComparator() {
            if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
                return null;
            }
            throw new IllegalStateException();
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
            int i2 = this.f16430b;
            if (i2 < 0 || i2 >= this.f16431c) {
                return false;
            }
            Object[] objArr = this.a;
            this.f16430b = i2 + 1;
            consumer.accept(objArr[i2]);
            return true;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            int i2 = this.f16430b;
            int i3 = (this.f16431c + i2) >>> 1;
            if (i2 >= i3) {
                return null;
            }
            Object[] objArr = this.a;
            this.f16430b = i3;
            return new e(objArr, i2, i3, this.f16432d);
        }
    }

    static final class f implements Spliterator.a {
        private final double[] a;

        /* renamed from: b, reason: collision with root package name */
        private int f16433b;

        /* renamed from: c, reason: collision with root package name */
        private final int f16434c;

        /* renamed from: d, reason: collision with root package name */
        private final int f16435d;

        public f(double[] dArr, int i2, int i3, int i4) {
            this.a = dArr;
            this.f16433b = i2;
            this.f16434c = i3;
            this.f16435d = i4 | 64 | 16384;
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return this.f16435d;
        }

        @Override // j$.util.Spliterator.d
        /* renamed from: d */
        public void forEachRemaining(j$.util.function.q qVar) {
            int i2;
            qVar.getClass();
            double[] dArr = this.a;
            int length = dArr.length;
            int i3 = this.f16434c;
            if (length < i3 || (i2 = this.f16433b) < 0) {
                return;
            }
            this.f16433b = i3;
            if (i2 < i3) {
                do {
                    qVar.accept(dArr[i2]);
                    i2++;
                } while (i2 < i3);
            }
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.f16434c - this.f16433b;
        }

        @Override // j$.util.Spliterator.a, j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            s.a(this, consumer);
        }

        @Override // j$.util.Spliterator
        public java.util.Comparator getComparator() {
            if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
                return null;
            }
            throw new IllegalStateException();
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i2) {
            return Spliterator.CC.$default$hasCharacteristics(this, i2);
        }

        @Override // j$.util.Spliterator.d
        /* renamed from: j */
        public boolean tryAdvance(j$.util.function.q qVar) {
            qVar.getClass();
            int i2 = this.f16433b;
            if (i2 < 0 || i2 >= this.f16434c) {
                return false;
            }
            double[] dArr = this.a;
            this.f16433b = i2 + 1;
            qVar.accept(dArr[i2]);
            return true;
        }

        @Override // j$.util.Spliterator.a, j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return s.e(this, consumer);
        }

        @Override // j$.util.Spliterator
        public Spliterator.a trySplit() {
            int i2 = this.f16433b;
            int i3 = (this.f16434c + i2) >>> 1;
            if (i2 >= i3) {
                return null;
            }
            double[] dArr = this.a;
            this.f16433b = i3;
            return new f(dArr, i2, i3, this.f16435d);
        }
    }

    private static abstract class g<T, S extends Spliterator<T>, C> {

        private static final class a extends g<Double, Spliterator.a, j$.util.function.q> implements Spliterator.a {
            a() {
            }

            @Override // j$.util.Spliterator.a
            /* renamed from: d */
            public void forEachRemaining(j$.util.function.q qVar) {
                Objects.requireNonNull(qVar);
            }

            @Override // j$.util.Spliterator.a, j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                s.a(this, consumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ java.util.Comparator getComparator() {
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

            @Override // j$.util.Spliterator.a
            /* renamed from: j */
            public boolean tryAdvance(j$.util.function.q qVar) {
                Objects.requireNonNull(qVar);
                return false;
            }

            @Override // j$.util.Spliterator.a, j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return s.e(this, consumer);
            }

            @Override // j$.util.v.g, j$.util.Spliterator.a, j$.util.Spliterator.d, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.a trySplit() {
                return null;
            }

            @Override // j$.util.v.g, j$.util.Spliterator.a, j$.util.Spliterator.d, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.d trySplit() {
                return null;
            }
        }

        private static final class b extends g<Integer, Spliterator.b, j$.util.function.w> implements Spliterator.b {
            b() {
            }

            @Override // j$.util.Spliterator.b
            /* renamed from: b */
            public void forEachRemaining(j$.util.function.w wVar) {
                Objects.requireNonNull(wVar);
            }

            @Override // j$.util.Spliterator.b, j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                s.b(this, consumer);
            }

            @Override // j$.util.Spliterator.b
            /* renamed from: g */
            public boolean tryAdvance(j$.util.function.w wVar) {
                Objects.requireNonNull(wVar);
                return false;
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ java.util.Comparator getComparator() {
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

            @Override // j$.util.Spliterator.b, j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return s.f(this, consumer);
            }

            @Override // j$.util.v.g, j$.util.Spliterator.a, j$.util.Spliterator.d, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.b trySplit() {
                return null;
            }

            @Override // j$.util.v.g, j$.util.Spliterator.a, j$.util.Spliterator.d, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.d trySplit() {
                return null;
            }
        }

        private static final class c extends g<Long, Spliterator.c, C> implements Spliterator.c {
            c() {
            }

            @Override // j$.util.Spliterator.c
            /* renamed from: c */
            public void forEachRemaining(C c2) {
                Objects.requireNonNull(c2);
            }

            @Override // j$.util.Spliterator.c, j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                s.c(this, consumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ java.util.Comparator getComparator() {
                return Spliterator.CC.$default$getComparator(this);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ long getExactSizeIfKnown() {
                return Spliterator.CC.$default$getExactSizeIfKnown(this);
            }

            @Override // j$.util.Spliterator.c
            /* renamed from: h */
            public boolean tryAdvance(C c2) {
                Objects.requireNonNull(c2);
                return false;
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ boolean hasCharacteristics(int i2) {
                return Spliterator.CC.$default$hasCharacteristics(this, i2);
            }

            @Override // j$.util.Spliterator.c, j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return s.g(this, consumer);
            }

            @Override // j$.util.v.g, j$.util.Spliterator.a, j$.util.Spliterator.d, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.c trySplit() {
                return null;
            }

            @Override // j$.util.v.g, j$.util.Spliterator.a, j$.util.Spliterator.d, j$.util.Spliterator
            public /* bridge */ /* synthetic */ Spliterator.d trySplit() {
                return null;
            }
        }

        private static final class d<T> extends g<T, Spliterator<T>, Consumer<? super T>> implements Spliterator<T> {
            d() {
            }

            @Override // j$.util.Spliterator
            public void forEachRemaining(Consumer consumer) {
                Objects.requireNonNull(consumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ java.util.Comparator getComparator() {
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
                Objects.requireNonNull(consumer);
                return false;
            }
        }

        g() {
        }

        public int characteristics() {
            return 16448;
        }

        public long estimateSize() {
            return 0L;
        }

        public void forEachRemaining(Object obj) {
            Objects.requireNonNull(obj);
        }

        public boolean tryAdvance(Object obj) {
            Objects.requireNonNull(obj);
            return false;
        }

        public Spliterator trySplit() {
            return null;
        }
    }

    static final class h implements Spliterator.b {
        private final int[] a;

        /* renamed from: b, reason: collision with root package name */
        private int f16436b;

        /* renamed from: c, reason: collision with root package name */
        private final int f16437c;

        /* renamed from: d, reason: collision with root package name */
        private final int f16438d;

        public h(int[] iArr, int i2, int i3, int i4) {
            this.a = iArr;
            this.f16436b = i2;
            this.f16437c = i3;
            this.f16438d = i4 | 64 | 16384;
        }

        @Override // j$.util.Spliterator.d
        /* renamed from: b */
        public void forEachRemaining(j$.util.function.w wVar) {
            int i2;
            wVar.getClass();
            int[] iArr = this.a;
            int length = iArr.length;
            int i3 = this.f16437c;
            if (length < i3 || (i2 = this.f16436b) < 0) {
                return;
            }
            this.f16436b = i3;
            if (i2 < i3) {
                do {
                    wVar.accept(iArr[i2]);
                    i2++;
                } while (i2 < i3);
            }
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return this.f16438d;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.f16437c - this.f16436b;
        }

        @Override // j$.util.Spliterator.b, j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            s.b(this, consumer);
        }

        @Override // j$.util.Spliterator.d
        /* renamed from: g */
        public boolean tryAdvance(j$.util.function.w wVar) {
            wVar.getClass();
            int i2 = this.f16436b;
            if (i2 < 0 || i2 >= this.f16437c) {
                return false;
            }
            int[] iArr = this.a;
            this.f16436b = i2 + 1;
            wVar.accept(iArr[i2]);
            return true;
        }

        @Override // j$.util.Spliterator
        public java.util.Comparator getComparator() {
            if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
                return null;
            }
            throw new IllegalStateException();
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i2) {
            return Spliterator.CC.$default$hasCharacteristics(this, i2);
        }

        @Override // j$.util.Spliterator.b, j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return s.f(this, consumer);
        }

        @Override // j$.util.Spliterator
        public Spliterator.b trySplit() {
            int i2 = this.f16436b;
            int i3 = (this.f16437c + i2) >>> 1;
            if (i2 >= i3) {
                return null;
            }
            int[] iArr = this.a;
            this.f16436b = i3;
            return new h(iArr, i2, i3, this.f16438d);
        }
    }

    static class i<T> implements Spliterator<T> {
        private final java.util.Collection a;

        /* renamed from: b, reason: collision with root package name */
        private java.util.Iterator f16439b;

        /* renamed from: c, reason: collision with root package name */
        private final int f16440c;

        /* renamed from: d, reason: collision with root package name */
        private long f16441d;

        /* renamed from: e, reason: collision with root package name */
        private int f16442e;

        public i(java.util.Collection collection, int i2) {
            this.a = collection;
            this.f16439b = null;
            this.f16440c = (i2 & Spliterator.CONCURRENT) == 0 ? i2 | 64 | 16384 : i2;
        }

        public i(java.util.Iterator it, int i2) {
            this.a = null;
            this.f16439b = it;
            this.f16441d = Long.MAX_VALUE;
            this.f16440c = i2 & (-16449);
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return this.f16440c;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            if (this.f16439b != null) {
                return this.f16441d;
            }
            this.f16439b = this.a.iterator();
            long size = this.a.size();
            this.f16441d = size;
            return size;
        }

        @Override // j$.util.Spliterator
        public void forEachRemaining(Consumer consumer) {
            consumer.getClass();
            java.util.Iterator it = this.f16439b;
            if (it == null) {
                it = this.a.iterator();
                this.f16439b = it;
                this.f16441d = this.a.size();
            }
            Iterator.EL.forEachRemaining(it, consumer);
        }

        @Override // j$.util.Spliterator
        public java.util.Comparator getComparator() {
            if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
                return null;
            }
            throw new IllegalStateException();
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
            if (this.f16439b == null) {
                this.f16439b = this.a.iterator();
                this.f16441d = this.a.size();
            }
            if (!this.f16439b.hasNext()) {
                return false;
            }
            consumer.accept(this.f16439b.next());
            return true;
        }

        @Override // j$.util.Spliterator
        public Spliterator trySplit() {
            long size;
            java.util.Iterator it = this.f16439b;
            if (it == null) {
                it = this.a.iterator();
                this.f16439b = it;
                size = this.a.size();
                this.f16441d = size;
            } else {
                size = this.f16441d;
            }
            if (size <= 1 || !it.hasNext()) {
                return null;
            }
            int i2 = this.f16442e + Spliterator.IMMUTABLE;
            if (i2 > size) {
                i2 = (int) size;
            }
            if (i2 > 33554432) {
                i2 = 33554432;
            }
            Object[] objArr = new Object[i2];
            int i3 = 0;
            do {
                objArr[i3] = it.next();
                i3++;
                if (i3 >= i2) {
                    break;
                }
            } while (it.hasNext());
            this.f16442e = i3;
            long j2 = this.f16441d;
            if (j2 != Long.MAX_VALUE) {
                this.f16441d = j2 - i3;
            }
            return new e(objArr, 0, i3, this.f16440c);
        }
    }

    static final class j implements Spliterator.c {
        private final long[] a;

        /* renamed from: b, reason: collision with root package name */
        private int f16443b;

        /* renamed from: c, reason: collision with root package name */
        private final int f16444c;

        /* renamed from: d, reason: collision with root package name */
        private final int f16445d;

        public j(long[] jArr, int i2, int i3, int i4) {
            this.a = jArr;
            this.f16443b = i2;
            this.f16444c = i3;
            this.f16445d = i4 | 64 | 16384;
        }

        @Override // j$.util.Spliterator.d
        /* renamed from: c */
        public void forEachRemaining(C c2) {
            int i2;
            c2.getClass();
            long[] jArr = this.a;
            int length = jArr.length;
            int i3 = this.f16444c;
            if (length < i3 || (i2 = this.f16443b) < 0) {
                return;
            }
            this.f16443b = i3;
            if (i2 < i3) {
                do {
                    c2.accept(jArr[i2]);
                    i2++;
                } while (i2 < i3);
            }
        }

        @Override // j$.util.Spliterator
        public int characteristics() {
            return this.f16445d;
        }

        @Override // j$.util.Spliterator
        public long estimateSize() {
            return this.f16444c - this.f16443b;
        }

        @Override // j$.util.Spliterator.c, j$.util.Spliterator
        public /* synthetic */ void forEachRemaining(Consumer consumer) {
            s.c(this, consumer);
        }

        @Override // j$.util.Spliterator
        public java.util.Comparator getComparator() {
            if (Spliterator.CC.$default$hasCharacteristics(this, 4)) {
                return null;
            }
            throw new IllegalStateException();
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ long getExactSizeIfKnown() {
            return Spliterator.CC.$default$getExactSizeIfKnown(this);
        }

        @Override // j$.util.Spliterator.d
        /* renamed from: h */
        public boolean tryAdvance(C c2) {
            c2.getClass();
            int i2 = this.f16443b;
            if (i2 < 0 || i2 >= this.f16444c) {
                return false;
            }
            long[] jArr = this.a;
            this.f16443b = i2 + 1;
            c2.accept(jArr[i2]);
            return true;
        }

        @Override // j$.util.Spliterator
        public /* synthetic */ boolean hasCharacteristics(int i2) {
            return Spliterator.CC.$default$hasCharacteristics(this, i2);
        }

        @Override // j$.util.Spliterator.c, j$.util.Spliterator
        public /* synthetic */ boolean tryAdvance(Consumer consumer) {
            return s.g(this, consumer);
        }

        @Override // j$.util.Spliterator
        public Spliterator.c trySplit() {
            int i2 = this.f16443b;
            int i3 = (this.f16444c + i2) >>> 1;
            if (i2 >= i3) {
                return null;
            }
            long[] jArr = this.a;
            this.f16443b = i3;
            return new j(jArr, i2, i3, this.f16445d);
        }
    }

    private static void a(int i2, int i3, int i4) {
        if (i3 <= i4) {
            if (i3 < 0) {
                throw new ArrayIndexOutOfBoundsException(i3);
            }
            if (i4 > i2) {
                throw new ArrayIndexOutOfBoundsException(i4);
            }
            return;
        }
        throw new ArrayIndexOutOfBoundsException("origin(" + i3 + ") > fence(" + i4 + ")");
    }

    public static Spliterator.a b() {
        return f16421d;
    }

    public static Spliterator.b c() {
        return f16419b;
    }

    public static Spliterator.c d() {
        return f16420c;
    }

    public static Spliterator e() {
        return a;
    }

    public static t.a f(Spliterator.a aVar) {
        Objects.requireNonNull(aVar);
        return new d(aVar);
    }

    public static t.b g(Spliterator.b bVar) {
        Objects.requireNonNull(bVar);
        return new b(bVar);
    }

    public static t.c h(Spliterator.c cVar) {
        Objects.requireNonNull(cVar);
        return new c(cVar);
    }

    public static java.util.Iterator i(Spliterator spliterator) {
        Objects.requireNonNull(spliterator);
        return new a(spliterator);
    }

    public static Spliterator.a j(double[] dArr, int i2, int i3, int i4) {
        Objects.requireNonNull(dArr);
        a(dArr.length, i2, i3);
        return new f(dArr, i2, i3, i4);
    }

    public static Spliterator.b k(int[] iArr, int i2, int i3, int i4) {
        Objects.requireNonNull(iArr);
        a(iArr.length, i2, i3);
        return new h(iArr, i2, i3, i4);
    }

    public static Spliterator.c l(long[] jArr, int i2, int i3, int i4) {
        Objects.requireNonNull(jArr);
        a(jArr.length, i2, i3);
        return new j(jArr, i2, i3, i4);
    }

    public static Spliterator m(java.util.Collection collection, int i2) {
        Objects.requireNonNull(collection);
        return new i(collection, i2);
    }

    public static Spliterator n(Object[] objArr, int i2, int i3, int i4) {
        Objects.requireNonNull(objArr);
        a(objArr.length, i2, i3);
        return new e(objArr, i2, i3, i4);
    }

    public static Spliterator o(java.util.Iterator it, int i2) {
        Objects.requireNonNull(it);
        return new i(it, i2);
    }
}