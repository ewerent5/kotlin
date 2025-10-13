package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BiFunction;
import j$.util.function.C0274b;
import j$.util.function.C0277e;
import j$.util.function.C0278f;
import j$.util.function.C0279g;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.stream.A2;
import j$.util.stream.R1;
import j$.util.stream.S1;
import j$.util.stream.S2;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CountedCompleter;

/* loaded from: classes2.dex */
final class S1 {
    private static final R1 a = new j.d(null);

    /* renamed from: b, reason: collision with root package name */
    private static final R1.c f16163b = new j.b();

    /* renamed from: c, reason: collision with root package name */
    private static final R1.d f16164c = new j.c();

    /* renamed from: d, reason: collision with root package name */
    private static final R1.b f16165d = new j.a();

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f16166e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    private static final long[] f16167f = new long[0];

    /* renamed from: g, reason: collision with root package name */
    private static final double[] f16168g = new double[0];

    private static abstract class b<T, T_NODE extends R1<T>> implements R1<T> {
        protected final R1 a;

        /* renamed from: b, reason: collision with root package name */
        protected final R1 f16169b;

        /* renamed from: c, reason: collision with root package name */
        private final long f16170c;

        b(R1 r1, R1 r12) {
            this.a = r1;
            this.f16169b = r12;
            this.f16170c = r1.count() + r12.count();
        }

        @Override // j$.util.stream.R1
        public /* bridge */ /* synthetic */ R1.e b(int i2) {
            return (R1.e) b(i2);
        }

        @Override // j$.util.stream.R1
        public R1 b(int i2) {
            if (i2 == 0) {
                return this.a;
            }
            if (i2 == 1) {
                return this.f16169b;
            }
            throw new IndexOutOfBoundsException();
        }

        @Override // j$.util.stream.R1
        public long count() {
            return this.f16170c;
        }

        @Override // j$.util.stream.R1
        public int p() {
            return 2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c<T> implements R1<T> {
        final Object[] a;

        /* renamed from: b, reason: collision with root package name */
        int f16171b;

        c(long j2, j$.util.function.x xVar) {
            if (j2 >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.a = (Object[]) xVar.apply((int) j2);
            this.f16171b = 0;
        }

        c(Object[] objArr) {
            this.a = objArr;
            this.f16171b = objArr.length;
        }

        @Override // j$.util.stream.R1
        public R1 b(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j$.util.stream.R1
        public long count() {
            return this.f16171b;
        }

        @Override // j$.util.stream.R1
        public void forEach(Consumer consumer) {
            for (int i2 = 0; i2 < this.f16171b; i2++) {
                consumer.accept(this.a[i2]);
            }
        }

        @Override // j$.util.stream.R1
        public void j(Object[] objArr, int i2) {
            System.arraycopy(this.a, 0, objArr, i2, this.f16171b);
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ int p() {
            return 0;
        }

        @Override // j$.util.stream.R1
        public Object[] q(j$.util.function.x xVar) {
            Object[] objArr = this.a;
            if (objArr.length == this.f16171b) {
                return objArr;
            }
            throw new IllegalStateException();
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ R1 r(long j2, long j3, j$.util.function.x xVar) {
            return Q1.n(this, j2, j3, xVar);
        }

        @Override // j$.util.stream.R1
        public Spliterator spliterator() {
            return j$.util.v.n(this.a, 0, this.f16171b, 1040);
        }

        public String toString() {
            return String.format("ArrayNode[%d][%s]", Integer.valueOf(this.a.length - this.f16171b), Arrays.toString(this.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static final class d<T> implements R1<T> {
        private final Collection a;

        d(Collection collection) {
            this.a = collection;
        }

        @Override // j$.util.stream.R1
        public R1 b(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j$.util.stream.R1
        public long count() {
            return this.a.size();
        }

        @Override // j$.util.stream.R1
        public void forEach(Consumer consumer) {
            j$.time.a.w(this.a, consumer);
        }

        @Override // j$.util.stream.R1
        public void j(Object[] objArr, int i2) {
            Iterator it = this.a.iterator();
            while (it.hasNext()) {
                objArr[i2] = it.next();
                i2++;
            }
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ int p() {
            return 0;
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // j$.util.stream.R1
        public Object[] q(j$.util.function.x xVar) {
            Collection collection = this.a;
            return collection.toArray((Object[]) xVar.apply(collection.size()));
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ R1 r(long j2, long j3, j$.util.function.x xVar) {
            return Q1.n(this, j2, j3, xVar);
        }

        @Override // j$.util.stream.R1
        public Spliterator spliterator() {
            Collection collection = this.a;
            return (collection instanceof j$.util.Collection ? ((j$.util.Collection) collection).stream() : Q1.v(j$.time.a.L(collection), false)).spliterator();
        }

        public String toString() {
            return String.format("CollectionNode[%d][%s]", Integer.valueOf(this.a.size()), this.a);
        }
    }

    private static class e<P_IN, P_OUT, T_NODE extends R1<P_OUT>, T_BUILDER extends R1.a<P_OUT>> extends AbstractC0325k1<P_IN, P_OUT, T_NODE, e<P_IN, P_OUT, T_NODE, T_BUILDER>> {

        /* renamed from: h, reason: collision with root package name */
        protected final T1 f16172h;

        /* renamed from: i, reason: collision with root package name */
        protected final j$.util.function.D f16173i;

        /* renamed from: j, reason: collision with root package name */
        protected final j$.util.function.n f16174j;

        private static final class a<P_IN> extends e<P_IN, Double, R1.b, R1.a.InterfaceC0206a> {
            a(T1 t1, Spliterator spliterator) {
                super(t1, spliterator, new j$.util.function.D() { // from class: j$.util.stream.e1
                    @Override // j$.util.function.D
                    public final Object apply(long j2) {
                        return S1.j(j2);
                    }
                }, new j$.util.function.n() { // from class: j$.util.stream.b0
                    @Override // j$.util.function.BiFunction
                    public BiFunction a(Function function) {
                        Objects.requireNonNull(function);
                        return new C0274b(this, function);
                    }

                    @Override // j$.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return new S1.f.a((R1.b) obj, (R1.b) obj2);
                    }
                });
            }
        }

        private static final class b<P_IN> extends e<P_IN, Integer, R1.c, R1.a.b> {
            b(T1 t1, Spliterator spliterator) {
                super(t1, spliterator, new j$.util.function.D() { // from class: j$.util.stream.c1
                    @Override // j$.util.function.D
                    public final Object apply(long j2) {
                        return S1.p(j2);
                    }
                }, new j$.util.function.n() { // from class: j$.util.stream.f
                    @Override // j$.util.function.BiFunction
                    public BiFunction a(Function function) {
                        Objects.requireNonNull(function);
                        return new C0274b(this, function);
                    }

                    @Override // j$.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return new S1.f.b((R1.c) obj, (R1.c) obj2);
                    }
                });
            }
        }

        private static final class c<P_IN> extends e<P_IN, Long, R1.d, R1.a.c> {
            c(T1 t1, Spliterator spliterator) {
                super(t1, spliterator, new j$.util.function.D() { // from class: j$.util.stream.B
                    @Override // j$.util.function.D
                    public final Object apply(long j2) {
                        return S1.q(j2);
                    }
                }, new j$.util.function.n() { // from class: j$.util.stream.y
                    @Override // j$.util.function.BiFunction
                    public BiFunction a(Function function) {
                        Objects.requireNonNull(function);
                        return new C0274b(this, function);
                    }

                    @Override // j$.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return new S1.f.c((R1.d) obj, (R1.d) obj2);
                    }
                });
            }
        }

        private static final class d<P_IN, P_OUT> extends e<P_IN, P_OUT, R1<P_OUT>, R1.a<P_OUT>> {
            d(T1 t1, final j$.util.function.x xVar, Spliterator spliterator) {
                super(t1, spliterator, new j$.util.function.D() { // from class: j$.util.stream.l0
                    @Override // j$.util.function.D
                    public final Object apply(long j2) {
                        return S1.d(j2, xVar);
                    }
                }, new j$.util.function.n() { // from class: j$.util.stream.P0
                    @Override // j$.util.function.BiFunction
                    public BiFunction a(Function function) {
                        Objects.requireNonNull(function);
                        return new C0274b(this, function);
                    }

                    @Override // j$.util.function.BiFunction
                    public final Object apply(Object obj, Object obj2) {
                        return new S1.f((R1) obj, (R1) obj2);
                    }
                });
            }
        }

        e(e eVar, Spliterator spliterator) {
            super(eVar, spliterator);
            this.f16172h = eVar.f16172h;
            this.f16173i = eVar.f16173i;
            this.f16174j = eVar.f16174j;
        }

        e(T1 t1, Spliterator spliterator, j$.util.function.D d2, j$.util.function.n nVar) {
            super(t1, spliterator);
            this.f16172h = t1;
            this.f16173i = d2;
            this.f16174j = nVar;
        }

        @Override // j$.util.stream.AbstractC0325k1
        protected Object a() {
            R1.a aVar = (R1.a) this.f16173i.apply(this.f16172h.p0(this.f16317c));
            this.f16172h.t0(aVar, this.f16317c);
            return aVar.a();
        }

        @Override // j$.util.stream.AbstractC0325k1
        protected AbstractC0325k1 f(Spliterator spliterator) {
            return new e(this, spliterator);
        }

        @Override // j$.util.stream.AbstractC0325k1, java.util.concurrent.CountedCompleter
        public void onCompletion(CountedCompleter countedCompleter) {
            if (!d()) {
                g((R1) this.f16174j.apply((R1) ((e) this.f16319e).b(), (R1) ((e) this.f16320f).b()));
            }
            this.f16317c = null;
            this.f16320f = null;
            this.f16319e = null;
        }
    }

    static final class f<T> extends b<T, R1<T>> implements R1<T> {

        static final class a extends d<Double, j$.util.function.q, double[], Spliterator.a, R1.b> implements R1.b {
            a(R1.b bVar, R1.b bVar2) {
                super(bVar, bVar2);
            }

            @Override // j$.util.stream.R1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void j(Double[] dArr, int i2) {
                Q1.e(this, dArr, i2);
            }

            @Override // j$.util.stream.R1.e
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public double[] c(int i2) {
                return new double[i2];
            }

            @Override // j$.util.stream.R1
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ R1.b r(long j2, long j3, j$.util.function.x xVar) {
                return Q1.k(this, j2, j3, xVar);
            }

            @Override // j$.util.stream.R1
            public /* synthetic */ void forEach(Consumer consumer) {
                Q1.h(this, consumer);
            }

            @Override // j$.util.stream.R1
            public Spliterator.d spliterator() {
                return new o.a(this);
            }

            @Override // j$.util.stream.R1
            public Spliterator spliterator() {
                return new o.a(this);
            }
        }

        static final class b extends d<Integer, j$.util.function.w, int[], Spliterator.b, R1.c> implements R1.c {
            b(R1.c cVar, R1.c cVar2) {
                super(cVar, cVar2);
            }

            @Override // j$.util.stream.R1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void j(Integer[] numArr, int i2) {
                Q1.f(this, numArr, i2);
            }

            @Override // j$.util.stream.R1.e
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public int[] c(int i2) {
                return new int[i2];
            }

            @Override // j$.util.stream.R1
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ R1.c r(long j2, long j3, j$.util.function.x xVar) {
                return Q1.l(this, j2, j3, xVar);
            }

            @Override // j$.util.stream.R1
            public /* synthetic */ void forEach(Consumer consumer) {
                Q1.i(this, consumer);
            }

            @Override // j$.util.stream.R1
            public Spliterator.d spliterator() {
                return new o.b(this);
            }

            @Override // j$.util.stream.R1
            public Spliterator spliterator() {
                return new o.b(this);
            }
        }

        static final class c extends d<Long, j$.util.function.C, long[], Spliterator.c, R1.d> implements R1.d {
            c(R1.d dVar, R1.d dVar2) {
                super(dVar, dVar2);
            }

            @Override // j$.util.stream.R1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void j(Long[] lArr, int i2) {
                Q1.g(this, lArr, i2);
            }

            @Override // j$.util.stream.R1.e
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public long[] c(int i2) {
                return new long[i2];
            }

            @Override // j$.util.stream.R1
            /* renamed from: f, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ R1.d r(long j2, long j3, j$.util.function.x xVar) {
                return Q1.m(this, j2, j3, xVar);
            }

            @Override // j$.util.stream.R1
            public /* synthetic */ void forEach(Consumer consumer) {
                Q1.j(this, consumer);
            }

            @Override // j$.util.stream.R1
            public Spliterator.d spliterator() {
                return new o.c(this);
            }

            @Override // j$.util.stream.R1
            public Spliterator spliterator() {
                return new o.c(this);
            }
        }

        private static abstract class d<E, T_CONS, T_ARR, T_SPLITR extends Spliterator.d<E, T_CONS, T_SPLITR>, T_NODE extends R1.e<E, T_CONS, T_ARR, T_SPLITR, T_NODE>> extends b<E, T_NODE> implements R1.e<E, T_CONS, T_ARR, T_SPLITR, T_NODE> {
            d(R1.e eVar, R1.e eVar2) {
                super(eVar, eVar2);
            }

            @Override // j$.util.stream.R1.e
            public void d(Object obj, int i2) {
                ((R1.e) this.a).d(obj, i2);
                ((R1.e) this.f16169b).d(obj, i2 + ((int) ((R1.e) this.a).count()));
            }

            @Override // j$.util.stream.R1.e
            public Object g() {
                long jCount = count();
                if (jCount >= 2147483639) {
                    throw new IllegalArgumentException("Stream size exceeds max array size");
                }
                Object objC = c((int) jCount);
                d(objC, 0);
                return objC;
            }

            @Override // j$.util.stream.R1.e
            public void h(Object obj) {
                ((R1.e) this.a).h(obj);
                ((R1.e) this.f16169b).h(obj);
            }

            @Override // j$.util.stream.R1
            public /* synthetic */ Object[] q(j$.util.function.x xVar) {
                return Q1.d(this, xVar);
            }

            public String toString() {
                return count() < 32 ? String.format("%s[%s.%s]", getClass().getName(), this.a, this.f16169b) : String.format("%s[size=%d]", getClass().getName(), Long.valueOf(count()));
            }
        }

        f(R1 r1, R1 r12) {
            super(r1, r12);
        }

        @Override // j$.util.stream.R1
        public void forEach(Consumer consumer) {
            this.a.forEach(consumer);
            this.f16169b.forEach(consumer);
        }

        @Override // j$.util.stream.R1
        public void j(Object[] objArr, int i2) {
            Objects.requireNonNull(objArr);
            this.a.j(objArr, i2);
            this.f16169b.j(objArr, i2 + ((int) this.a.count()));
        }

        @Override // j$.util.stream.R1
        public Object[] q(j$.util.function.x xVar) {
            long jCount = count();
            if (jCount >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            Object[] objArr = (Object[]) xVar.apply((int) jCount);
            j(objArr, 0);
            return objArr;
        }

        @Override // j$.util.stream.R1
        public R1 r(long j2, long j3, j$.util.function.x xVar) {
            if (j2 == 0 && j3 == count()) {
                return this;
            }
            long jCount = this.a.count();
            return j2 >= jCount ? this.f16169b.r(j2 - jCount, j3 - jCount, xVar) : j3 <= jCount ? this.a.r(j2, j3, xVar) : S1.i(U2.REFERENCE, this.a.r(j2, jCount, xVar), this.f16169b.r(0L, j3 - jCount, xVar));
        }

        @Override // j$.util.stream.R1
        public Spliterator spliterator() {
            return new o.e(this);
        }

        public String toString() {
            return count() < 32 ? String.format("ConcNode[%s.%s]", this.a, this.f16169b) : String.format("ConcNode[size=%d]", Long.valueOf(count()));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class g implements R1.b {
        final double[] a;

        /* renamed from: b, reason: collision with root package name */
        int f16175b;

        g(long j2) {
            if (j2 >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.a = new double[(int) j2];
            this.f16175b = 0;
        }

        g(double[] dArr) {
            this.a = dArr;
            this.f16175b = dArr.length;
        }

        @Override // j$.util.stream.R1.e, j$.util.stream.R1
        public R1.e b(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j$.util.stream.R1
        public long count() {
            return this.f16175b;
        }

        @Override // j$.util.stream.R1.e
        public void d(Object obj, int i2) {
            System.arraycopy(this.a, 0, (double[]) obj, i2, this.f16175b);
        }

        @Override // j$.util.stream.R1
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void j(Double[] dArr, int i2) {
            Q1.e(this, dArr, i2);
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ void forEach(Consumer consumer) {
            Q1.h(this, consumer);
        }

        @Override // j$.util.stream.R1.e
        public Object g() {
            double[] dArr = this.a;
            int length = dArr.length;
            int i2 = this.f16175b;
            return length == i2 ? dArr : Arrays.copyOf(dArr, i2);
        }

        @Override // j$.util.stream.R1.e
        public void h(Object obj) {
            j$.util.function.q qVar = (j$.util.function.q) obj;
            for (int i2 = 0; i2 < this.f16175b; i2++) {
                qVar.accept(this.a[i2]);
            }
        }

        @Override // j$.util.stream.R1
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ R1.b r(long j2, long j3, j$.util.function.x xVar) {
            return Q1.k(this, j2, j3, xVar);
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ int p() {
            return 0;
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ Object[] q(j$.util.function.x xVar) {
            return Q1.d(this, xVar);
        }

        @Override // j$.util.stream.R1.e, j$.util.stream.R1
        public Spliterator.d spliterator() {
            return j$.util.v.j(this.a, 0, this.f16175b, 1040);
        }

        public String toString() {
            return String.format("DoubleArrayNode[%d][%s]", Integer.valueOf(this.a.length - this.f16175b), Arrays.toString(this.a));
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ R1 b(int i2) {
            b(i2);
            throw null;
        }

        @Override // j$.util.stream.R1
        public Spliterator spliterator() {
            return j$.util.v.j(this.a, 0, this.f16175b, 1040);
        }
    }

    private static final class h extends g implements R1.a.InterfaceC0206a {
        h(long j2) {
            super(j2);
        }

        @Override // j$.util.stream.R1.a.InterfaceC0206a, j$.util.stream.R1.a
        public R1.b a() {
            if (this.f16175b >= this.a.length) {
                return this;
            }
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f16175b), Integer.valueOf(this.a.length)));
        }

        @Override // j$.util.stream.R1.a
        public /* bridge */ /* synthetic */ R1 a() {
            a();
            return this;
        }

        @Override // j$.util.stream.A2
        public void accept(double d2) {
            int i2 = this.f16175b;
            double[] dArr = this.a;
            if (i2 >= dArr.length) {
                throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.a.length)));
            }
            this.f16175b = i2 + 1;
            dArr[i2] = d2;
        }

        @Override // j$.util.stream.A2, j$.util.function.w
        public /* synthetic */ void accept(int i2) {
            j$.time.a.a(this);
            throw null;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(long j2) {
            j$.time.a.b(this);
            throw null;
        }

        @Override // j$.util.function.Consumer
        public Consumer e(Consumer consumer) {
            Objects.requireNonNull(consumer);
            return new C0277e(this, consumer);
        }

        @Override // j$.util.function.q
        public j$.util.function.q k(j$.util.function.q qVar) {
            Objects.requireNonNull(qVar);
            return new C0278f(this, qVar);
        }

        @Override // j$.util.stream.A2
        public void m() {
            if (this.f16175b < this.a.length) {
                throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f16175b), Integer.valueOf(this.a.length)));
            }
        }

        @Override // j$.util.stream.A2
        public void n(long j2) {
            if (j2 != this.a.length) {
                throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j2), Integer.valueOf(this.a.length)));
            }
            this.f16175b = 0;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ boolean o() {
            return false;
        }

        @Override // j$.util.function.Consumer
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void accept(Double d2) {
            Q1.a(this, d2);
        }

        @Override // j$.util.stream.S1.g
        public String toString() {
            return String.format("DoubleFixedNodeBuilder[%d][%s]", Integer.valueOf(this.a.length - this.f16175b), Arrays.toString(this.a));
        }
    }

    private static final class i extends S2.b implements R1.b, R1.a.InterfaceC0206a {

        /* renamed from: g, reason: collision with root package name */
        private boolean f16176g = false;

        i() {
        }

        @Override // j$.util.stream.S2.b
        /* renamed from: B */
        public Spliterator.a spliterator() {
            return super.spliterator();
        }

        @Override // j$.util.function.Consumer
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void accept(Double d2) {
            Q1.a(this, d2);
        }

        @Override // j$.util.stream.R1
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void j(Double[] dArr, int i2) {
            Q1.e(this, dArr, i2);
        }

        @Override // j$.util.stream.R1
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ R1.b r(long j2, long j3, j$.util.function.x xVar) {
            return Q1.k(this, j2, j3, xVar);
        }

        @Override // j$.util.stream.R1.a.InterfaceC0206a, j$.util.stream.R1.a
        public R1.b a() {
            return this;
        }

        @Override // j$.util.stream.R1.a
        public R1 a() {
            return this;
        }

        @Override // j$.util.stream.S2.b, j$.util.function.q
        public void accept(double d2) {
            super.accept(d2);
        }

        @Override // j$.util.stream.A2, j$.util.function.w
        public /* synthetic */ void accept(int i2) {
            j$.time.a.a(this);
            throw null;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(long j2) {
            j$.time.a.b(this);
            throw null;
        }

        @Override // j$.util.stream.R1.e, j$.util.stream.R1
        public R1.e b(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j$.util.stream.S2.e, j$.util.stream.R1.e
        public void d(Object obj, int i2) {
            super.d((double[]) obj, i2);
        }

        @Override // j$.util.function.Consumer
        public Consumer e(Consumer consumer) {
            Objects.requireNonNull(consumer);
            return new C0277e(this, consumer);
        }

        @Override // j$.util.stream.S2.e, j$.util.stream.R1.e
        public Object g() {
            return (double[]) super.g();
        }

        @Override // j$.util.stream.S2.e, j$.util.stream.R1.e
        public void h(Object obj) {
            super.h((j$.util.function.q) obj);
        }

        @Override // j$.util.stream.A2
        public void m() {
            this.f16176g = false;
        }

        @Override // j$.util.stream.A2
        public void n(long j2) {
            this.f16176g = true;
            clear();
            x(j2);
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ boolean o() {
            return false;
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ int p() {
            return 0;
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ Object[] q(j$.util.function.x xVar) {
            return Q1.d(this, xVar);
        }

        @Override // j$.util.stream.S2.b, j$.util.stream.S2.e, java.lang.Iterable, j$.lang.Iterable
        public Spliterator.d spliterator() {
            return super.spliterator();
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ R1 b(int i2) {
            b(i2);
            throw null;
        }

        @Override // j$.util.stream.S2.b, j$.util.stream.S2.e, java.lang.Iterable, j$.lang.Iterable
        public Spliterator spliterator() {
            return super.spliterator();
        }
    }

    private static abstract class j<T, T_ARR, T_CONS> implements R1<T> {

        private static final class a extends j<Double, double[], j$.util.function.q> implements R1.b {
            a() {
            }

            @Override // j$.util.stream.R1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void j(Double[] dArr, int i2) {
                Q1.e(this, dArr, i2);
            }

            @Override // j$.util.stream.S1.j, j$.util.stream.R1
            public R1.e b(int i2) {
                throw new IndexOutOfBoundsException();
            }

            @Override // j$.util.stream.S1.j, j$.util.stream.R1
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ R1.b r(long j2, long j3, j$.util.function.x xVar) {
                return Q1.k(this, j2, j3, xVar);
            }

            @Override // j$.util.stream.R1
            public /* synthetic */ void forEach(Consumer consumer) {
                Q1.h(this, consumer);
            }

            @Override // j$.util.stream.R1.e
            public Object g() {
                return S1.f16168g;
            }

            @Override // j$.util.stream.R1
            public Spliterator.d spliterator() {
                return j$.util.v.b();
            }

            @Override // j$.util.stream.S1.j, j$.util.stream.R1
            public /* synthetic */ R1 b(int i2) {
                b(i2);
                throw null;
            }

            @Override // j$.util.stream.R1
            public Spliterator spliterator() {
                return j$.util.v.b();
            }
        }

        private static final class b extends j<Integer, int[], j$.util.function.w> implements R1.c {
            b() {
            }

            @Override // j$.util.stream.R1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void j(Integer[] numArr, int i2) {
                Q1.f(this, numArr, i2);
            }

            @Override // j$.util.stream.S1.j, j$.util.stream.R1
            public R1.e b(int i2) {
                throw new IndexOutOfBoundsException();
            }

            @Override // j$.util.stream.S1.j, j$.util.stream.R1
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ R1.c r(long j2, long j3, j$.util.function.x xVar) {
                return Q1.l(this, j2, j3, xVar);
            }

            @Override // j$.util.stream.R1
            public /* synthetic */ void forEach(Consumer consumer) {
                Q1.i(this, consumer);
            }

            @Override // j$.util.stream.R1.e
            public Object g() {
                return S1.f16166e;
            }

            @Override // j$.util.stream.R1
            public Spliterator.d spliterator() {
                return j$.util.v.c();
            }

            @Override // j$.util.stream.S1.j, j$.util.stream.R1
            public /* synthetic */ R1 b(int i2) {
                b(i2);
                throw null;
            }

            @Override // j$.util.stream.R1
            public Spliterator spliterator() {
                return j$.util.v.c();
            }
        }

        private static final class c extends j<Long, long[], j$.util.function.C> implements R1.d {
            c() {
            }

            @Override // j$.util.stream.R1
            /* renamed from: a, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void j(Long[] lArr, int i2) {
                Q1.g(this, lArr, i2);
            }

            @Override // j$.util.stream.S1.j, j$.util.stream.R1
            public R1.e b(int i2) {
                throw new IndexOutOfBoundsException();
            }

            @Override // j$.util.stream.S1.j, j$.util.stream.R1
            /* renamed from: e, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ R1.d r(long j2, long j3, j$.util.function.x xVar) {
                return Q1.m(this, j2, j3, xVar);
            }

            @Override // j$.util.stream.R1
            public /* synthetic */ void forEach(Consumer consumer) {
                Q1.j(this, consumer);
            }

            @Override // j$.util.stream.R1.e
            public Object g() {
                return S1.f16167f;
            }

            @Override // j$.util.stream.R1
            public Spliterator.d spliterator() {
                return j$.util.v.d();
            }

            @Override // j$.util.stream.S1.j, j$.util.stream.R1
            public /* synthetic */ R1 b(int i2) {
                b(i2);
                throw null;
            }

            @Override // j$.util.stream.R1
            public Spliterator spliterator() {
                return j$.util.v.d();
            }
        }

        private static class d<T> extends j<T, T[], Consumer<? super T>> {
            d(a aVar) {
            }

            @Override // j$.util.stream.R1
            public void forEach(Consumer consumer) {
            }

            @Override // j$.util.stream.R1
            public void j(Object[] objArr, int i2) {
            }

            @Override // j$.util.stream.R1
            public Spliterator spliterator() {
                return j$.util.v.e();
            }
        }

        j() {
        }

        @Override // j$.util.stream.R1
        public R1 b(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j$.util.stream.R1
        public long count() {
            return 0L;
        }

        public void d(Object obj, int i2) {
        }

        public void h(Object obj) {
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ int p() {
            return 0;
        }

        @Override // j$.util.stream.R1
        public Object[] q(j$.util.function.x xVar) {
            return (Object[]) xVar.apply(0);
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ R1 r(long j2, long j3, j$.util.function.x xVar) {
            return Q1.n(this, j2, j3, xVar);
        }
    }

    private static final class k<T> extends c<T> implements R1.a<T> {
        k(long j2, j$.util.function.x xVar) {
            super(j2, xVar);
        }

        @Override // j$.util.stream.R1.a
        public R1 a() {
            if (this.f16171b >= this.a.length) {
                return this;
            }
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f16171b), Integer.valueOf(this.a.length)));
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(double d2) {
            j$.time.a.c(this);
            throw null;
        }

        @Override // j$.util.stream.A2, j$.util.function.w
        public /* synthetic */ void accept(int i2) {
            j$.time.a.a(this);
            throw null;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(long j2) {
            j$.time.a.b(this);
            throw null;
        }

        @Override // j$.util.function.Consumer
        public void accept(Object obj) {
            int i2 = this.f16171b;
            Object[] objArr = this.a;
            if (i2 >= objArr.length) {
                throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.a.length)));
            }
            this.f16171b = i2 + 1;
            objArr[i2] = obj;
        }

        @Override // j$.util.function.Consumer
        public Consumer e(Consumer consumer) {
            Objects.requireNonNull(consumer);
            return new C0277e(this, consumer);
        }

        @Override // j$.util.stream.A2
        public void m() {
            if (this.f16171b < this.a.length) {
                throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f16171b), Integer.valueOf(this.a.length)));
            }
        }

        @Override // j$.util.stream.A2
        public void n(long j2) {
            if (j2 != this.a.length) {
                throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j2), Integer.valueOf(this.a.length)));
            }
            this.f16171b = 0;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ boolean o() {
            return false;
        }

        @Override // j$.util.stream.S1.c
        public String toString() {
            return String.format("FixedNodeBuilder[%d][%s]", Integer.valueOf(this.a.length - this.f16171b), Arrays.toString(this.a));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class l implements R1.c {
        final int[] a;

        /* renamed from: b, reason: collision with root package name */
        int f16177b;

        l(long j2) {
            if (j2 >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.a = new int[(int) j2];
            this.f16177b = 0;
        }

        l(int[] iArr) {
            this.a = iArr;
            this.f16177b = iArr.length;
        }

        @Override // j$.util.stream.R1.e, j$.util.stream.R1
        public R1.e b(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j$.util.stream.R1
        public long count() {
            return this.f16177b;
        }

        @Override // j$.util.stream.R1.e
        public void d(Object obj, int i2) {
            System.arraycopy(this.a, 0, (int[]) obj, i2, this.f16177b);
        }

        @Override // j$.util.stream.R1
        /* renamed from: f, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void j(Integer[] numArr, int i2) {
            Q1.f(this, numArr, i2);
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ void forEach(Consumer consumer) {
            Q1.i(this, consumer);
        }

        @Override // j$.util.stream.R1.e
        public Object g() {
            int[] iArr = this.a;
            int length = iArr.length;
            int i2 = this.f16177b;
            return length == i2 ? iArr : Arrays.copyOf(iArr, i2);
        }

        @Override // j$.util.stream.R1.e
        public void h(Object obj) {
            j$.util.function.w wVar = (j$.util.function.w) obj;
            for (int i2 = 0; i2 < this.f16177b; i2++) {
                wVar.accept(this.a[i2]);
            }
        }

        @Override // j$.util.stream.R1
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ R1.c r(long j2, long j3, j$.util.function.x xVar) {
            return Q1.l(this, j2, j3, xVar);
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ int p() {
            return 0;
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ Object[] q(j$.util.function.x xVar) {
            return Q1.d(this, xVar);
        }

        @Override // j$.util.stream.R1.e, j$.util.stream.R1
        public Spliterator.d spliterator() {
            return j$.util.v.k(this.a, 0, this.f16177b, 1040);
        }

        public String toString() {
            return String.format("IntArrayNode[%d][%s]", Integer.valueOf(this.a.length - this.f16177b), Arrays.toString(this.a));
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ R1 b(int i2) {
            b(i2);
            throw null;
        }

        @Override // j$.util.stream.R1
        public Spliterator spliterator() {
            return j$.util.v.k(this.a, 0, this.f16177b, 1040);
        }
    }

    private static final class m extends l implements R1.a.b {
        m(long j2) {
            super(j2);
        }

        @Override // j$.util.stream.R1.a.b, j$.util.stream.R1.a
        public R1.c a() {
            if (this.f16177b >= this.a.length) {
                return this;
            }
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f16177b), Integer.valueOf(this.a.length)));
        }

        @Override // j$.util.stream.R1.a
        public /* bridge */ /* synthetic */ R1 a() {
            a();
            return this;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(double d2) {
            j$.time.a.c(this);
            throw null;
        }

        @Override // j$.util.stream.A2, j$.util.function.w
        public void accept(int i2) {
            int i3 = this.f16177b;
            int[] iArr = this.a;
            if (i3 >= iArr.length) {
                throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.a.length)));
            }
            this.f16177b = i3 + 1;
            iArr[i3] = i2;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(long j2) {
            j$.time.a.b(this);
            throw null;
        }

        @Override // j$.util.function.Consumer
        public Consumer e(Consumer consumer) {
            Objects.requireNonNull(consumer);
            return new C0277e(this, consumer);
        }

        @Override // j$.util.function.w
        public j$.util.function.w l(j$.util.function.w wVar) {
            Objects.requireNonNull(wVar);
            return new C0279g(this, wVar);
        }

        @Override // j$.util.stream.A2
        public void m() {
            if (this.f16177b < this.a.length) {
                throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f16177b), Integer.valueOf(this.a.length)));
            }
        }

        @Override // j$.util.stream.A2
        public void n(long j2) {
            if (j2 != this.a.length) {
                throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j2), Integer.valueOf(this.a.length)));
            }
            this.f16177b = 0;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ boolean o() {
            return false;
        }

        @Override // j$.util.function.Consumer
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void accept(Integer num) {
            Q1.b(this, num);
        }

        @Override // j$.util.stream.S1.l
        public String toString() {
            return String.format("IntFixedNodeBuilder[%d][%s]", Integer.valueOf(this.a.length - this.f16177b), Arrays.toString(this.a));
        }
    }

    private static final class n extends S2.c implements R1.c, R1.a.b {

        /* renamed from: g, reason: collision with root package name */
        private boolean f16178g = false;

        n() {
        }

        @Override // j$.util.stream.S2.c
        /* renamed from: B */
        public Spliterator.b spliterator() {
            return super.spliterator();
        }

        @Override // j$.util.function.Consumer
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void accept(Integer num) {
            Q1.b(this, num);
        }

        @Override // j$.util.stream.R1
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void j(Integer[] numArr, int i2) {
            Q1.f(this, numArr, i2);
        }

        @Override // j$.util.stream.R1
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ R1.c r(long j2, long j3, j$.util.function.x xVar) {
            return Q1.l(this, j2, j3, xVar);
        }

        @Override // j$.util.stream.R1.a.b, j$.util.stream.R1.a
        public R1.c a() {
            return this;
        }

        @Override // j$.util.stream.R1.a
        public R1 a() {
            return this;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(double d2) {
            j$.time.a.c(this);
            throw null;
        }

        @Override // j$.util.stream.S2.c, j$.util.function.w
        public void accept(int i2) {
            super.accept(i2);
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(long j2) {
            j$.time.a.b(this);
            throw null;
        }

        @Override // j$.util.stream.R1.e, j$.util.stream.R1
        public R1.e b(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j$.util.stream.S2.e, j$.util.stream.R1.e
        public void d(Object obj, int i2) {
            super.d((int[]) obj, i2);
        }

        @Override // j$.util.function.Consumer
        public Consumer e(Consumer consumer) {
            Objects.requireNonNull(consumer);
            return new C0277e(this, consumer);
        }

        @Override // j$.util.stream.S2.e, j$.util.stream.R1.e
        public Object g() {
            return (int[]) super.g();
        }

        @Override // j$.util.stream.S2.e, j$.util.stream.R1.e
        public void h(Object obj) {
            super.h((j$.util.function.w) obj);
        }

        @Override // j$.util.stream.A2
        public void m() {
            this.f16178g = false;
        }

        @Override // j$.util.stream.A2
        public void n(long j2) {
            this.f16178g = true;
            clear();
            x(j2);
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ boolean o() {
            return false;
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ int p() {
            return 0;
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ Object[] q(j$.util.function.x xVar) {
            return Q1.d(this, xVar);
        }

        @Override // j$.util.stream.S2.c, j$.util.stream.S2.e, java.lang.Iterable, j$.lang.Iterable
        public Spliterator.d spliterator() {
            return super.spliterator();
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ R1 b(int i2) {
            b(i2);
            throw null;
        }

        @Override // j$.util.stream.S2.c, j$.util.stream.S2.e, java.lang.Iterable, j$.lang.Iterable
        public Spliterator spliterator() {
            return super.spliterator();
        }
    }

    private static abstract class o<T, S extends Spliterator<T>, N extends R1<T>> implements Spliterator<T> {
        R1 a;

        /* renamed from: b, reason: collision with root package name */
        int f16179b;

        /* renamed from: c, reason: collision with root package name */
        Spliterator f16180c;

        /* renamed from: d, reason: collision with root package name */
        Spliterator f16181d;

        /* renamed from: e, reason: collision with root package name */
        Deque f16182e;

        private static final class a extends d<Double, j$.util.function.q, double[], Spliterator.a, R1.b> implements Spliterator.a {
            a(R1.b bVar) {
                super(bVar);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                j$.util.s.a(this, consumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return j$.util.s.e(this, consumer);
            }
        }

        private static final class b extends d<Integer, j$.util.function.w, int[], Spliterator.b, R1.c> implements Spliterator.b {
            b(R1.c cVar) {
                super(cVar);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                j$.util.s.b(this, consumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return j$.util.s.f(this, consumer);
            }
        }

        private static final class c extends d<Long, j$.util.function.C, long[], Spliterator.c, R1.d> implements Spliterator.c {
            c(R1.d dVar) {
                super(dVar);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ void forEachRemaining(Consumer consumer) {
                j$.util.s.c(this, consumer);
            }

            @Override // j$.util.Spliterator
            public /* synthetic */ boolean tryAdvance(Consumer consumer) {
                return j$.util.s.g(this, consumer);
            }
        }

        private static abstract class d<T, T_CONS, T_ARR, T_SPLITR extends Spliterator.d<T, T_CONS, T_SPLITR>, N extends R1.e<T, T_CONS, T_ARR, T_SPLITR, N>> extends o<T, T_SPLITR, N> implements Spliterator.d<T, T_CONS, T_SPLITR> {
            d(R1.e eVar) {
                super(eVar);
            }

            @Override // j$.util.Spliterator.d
            /* renamed from: forEachRemaining, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public void d(Object obj) {
                if (this.a == null) {
                    return;
                }
                if (this.f16181d != null) {
                    while (j(obj)) {
                    }
                    return;
                }
                Spliterator spliterator = this.f16180c;
                if (spliterator != null) {
                    ((Spliterator.d) spliterator).d(obj);
                    return;
                }
                Deque dequeE = e();
                while (true) {
                    R1.e eVar = (R1.e) a(dequeE);
                    if (eVar == null) {
                        this.a = null;
                        return;
                    }
                    eVar.h(obj);
                }
            }

            @Override // j$.util.Spliterator.d
            /* renamed from: tryAdvance, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
            public boolean j(Object obj) {
                R1.e eVar;
                if (!f()) {
                    return false;
                }
                boolean zJ = ((Spliterator.d) this.f16181d).j(obj);
                if (!zJ) {
                    if (this.f16180c == null && (eVar = (R1.e) a(this.f16182e)) != null) {
                        Spliterator.d dVarSpliterator = eVar.spliterator();
                        this.f16181d = dVarSpliterator;
                        return dVarSpliterator.j(obj);
                    }
                    this.a = null;
                }
                return zJ;
            }
        }

        private static final class e<T> extends o<T, Spliterator<T>, R1<T>> {
            e(R1 r1) {
                super(r1);
            }

            @Override // j$.util.Spliterator
            public void forEachRemaining(Consumer consumer) {
                if (this.a == null) {
                    return;
                }
                if (this.f16181d != null) {
                    while (tryAdvance(consumer)) {
                    }
                    return;
                }
                Spliterator spliterator = this.f16180c;
                if (spliterator != null) {
                    spliterator.forEachRemaining(consumer);
                    return;
                }
                Deque dequeE = e();
                while (true) {
                    R1 r1A = a(dequeE);
                    if (r1A == null) {
                        this.a = null;
                        return;
                    }
                    r1A.forEach(consumer);
                }
            }

            @Override // j$.util.Spliterator
            public boolean tryAdvance(Consumer consumer) {
                R1 r1A;
                if (!f()) {
                    return false;
                }
                boolean zTryAdvance = this.f16181d.tryAdvance(consumer);
                if (!zTryAdvance) {
                    if (this.f16180c == null && (r1A = a(this.f16182e)) != null) {
                        Spliterator spliterator = r1A.spliterator();
                        this.f16181d = spliterator;
                        return spliterator.tryAdvance(consumer);
                    }
                    this.a = null;
                }
                return zTryAdvance;
            }
        }

        o(R1 r1) {
            this.a = r1;
        }

        protected final R1 a(Deque deque) {
            while (true) {
                R1 r1 = (R1) deque.pollFirst();
                if (r1 == null) {
                    return null;
                }
                if (r1.p() != 0) {
                    for (int iP = r1.p() - 1; iP >= 0; iP--) {
                        deque.addFirst(r1.b(iP));
                    }
                } else if (r1.count() > 0) {
                    return r1;
                }
            }
        }

        @Override // j$.util.Spliterator
        public final int characteristics() {
            return 64;
        }

        protected final Deque e() {
            ArrayDeque arrayDeque = new ArrayDeque(8);
            int iP = this.a.p();
            while (true) {
                iP--;
                if (iP < this.f16179b) {
                    return arrayDeque;
                }
                arrayDeque.addFirst(this.a.b(iP));
            }
        }

        @Override // j$.util.Spliterator
        public final long estimateSize() {
            long jCount = 0;
            if (this.a == null) {
                return 0L;
            }
            Spliterator spliterator = this.f16180c;
            if (spliterator != null) {
                return spliterator.estimateSize();
            }
            for (int i2 = this.f16179b; i2 < this.a.p(); i2++) {
                jCount += this.a.b(i2).count();
            }
            return jCount;
        }

        protected final boolean f() {
            if (this.a == null) {
                return false;
            }
            if (this.f16181d != null) {
                return true;
            }
            Spliterator spliterator = this.f16180c;
            if (spliterator == null) {
                Deque dequeE = e();
                this.f16182e = dequeE;
                R1 r1A = a(dequeE);
                if (r1A == null) {
                    this.a = null;
                    return false;
                }
                spliterator = r1A.spliterator();
            }
            this.f16181d = spliterator;
            return true;
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
        public /* bridge */ /* synthetic */ Spliterator.a trySplit() {
            return (Spliterator.a) trySplit();
        }

        @Override // j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.b trySplit() {
            return (Spliterator.b) trySplit();
        }

        @Override // j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.c trySplit() {
            return (Spliterator.c) trySplit();
        }

        @Override // j$.util.Spliterator
        public /* bridge */ /* synthetic */ Spliterator.d trySplit() {
            return (Spliterator.d) trySplit();
        }

        @Override // j$.util.Spliterator
        public final Spliterator trySplit() {
            R1 r1 = this.a;
            if (r1 == null || this.f16181d != null) {
                return null;
            }
            Spliterator spliterator = this.f16180c;
            if (spliterator != null) {
                return spliterator.trySplit();
            }
            if (this.f16179b < r1.p() - 1) {
                R1 r12 = this.a;
                int i2 = this.f16179b;
                this.f16179b = i2 + 1;
                return r12.b(i2).spliterator();
            }
            R1 r1B = this.a.b(this.f16179b);
            this.a = r1B;
            if (r1B.p() == 0) {
                Spliterator spliterator2 = this.a.spliterator();
                this.f16180c = spliterator2;
                return spliterator2.trySplit();
            }
            this.f16179b = 0;
            R1 r13 = this.a;
            this.f16179b = 1;
            return r13.b(0).spliterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class p implements R1.d {
        final long[] a;

        /* renamed from: b, reason: collision with root package name */
        int f16183b;

        p(long j2) {
            if (j2 >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            this.a = new long[(int) j2];
            this.f16183b = 0;
        }

        p(long[] jArr) {
            this.a = jArr;
            this.f16183b = jArr.length;
        }

        @Override // j$.util.stream.R1.e, j$.util.stream.R1
        public R1.e b(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j$.util.stream.R1
        public long count() {
            return this.f16183b;
        }

        @Override // j$.util.stream.R1.e
        public void d(Object obj, int i2) {
            System.arraycopy(this.a, 0, (long[]) obj, i2, this.f16183b);
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ void forEach(Consumer consumer) {
            Q1.j(this, consumer);
        }

        @Override // j$.util.stream.R1.e
        public Object g() {
            long[] jArr = this.a;
            int length = jArr.length;
            int i2 = this.f16183b;
            return length == i2 ? jArr : Arrays.copyOf(jArr, i2);
        }

        @Override // j$.util.stream.R1.e
        public void h(Object obj) {
            j$.util.function.C c2 = (j$.util.function.C) obj;
            for (int i2 = 0; i2 < this.f16183b; i2++) {
                c2.accept(this.a[i2]);
            }
        }

        @Override // j$.util.stream.R1
        /* renamed from: k, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void j(Long[] lArr, int i2) {
            Q1.g(this, lArr, i2);
        }

        @Override // j$.util.stream.R1
        /* renamed from: l, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ R1.d r(long j2, long j3, j$.util.function.x xVar) {
            return Q1.m(this, j2, j3, xVar);
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ int p() {
            return 0;
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ Object[] q(j$.util.function.x xVar) {
            return Q1.d(this, xVar);
        }

        @Override // j$.util.stream.R1.e, j$.util.stream.R1
        public Spliterator.d spliterator() {
            return j$.util.v.l(this.a, 0, this.f16183b, 1040);
        }

        public String toString() {
            return String.format("LongArrayNode[%d][%s]", Integer.valueOf(this.a.length - this.f16183b), Arrays.toString(this.a));
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ R1 b(int i2) {
            b(i2);
            throw null;
        }

        @Override // j$.util.stream.R1
        public Spliterator spliterator() {
            return j$.util.v.l(this.a, 0, this.f16183b, 1040);
        }
    }

    private static final class q extends p implements R1.a.c {
        q(long j2) {
            super(j2);
        }

        @Override // j$.util.stream.R1.a.c, j$.util.stream.R1.a
        public R1.d a() {
            if (this.f16183b >= this.a.length) {
                return this;
            }
            throw new IllegalStateException(String.format("Current size %d is less than fixed size %d", Integer.valueOf(this.f16183b), Integer.valueOf(this.a.length)));
        }

        @Override // j$.util.stream.R1.a
        public /* bridge */ /* synthetic */ R1 a() {
            a();
            return this;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(double d2) {
            j$.time.a.c(this);
            throw null;
        }

        @Override // j$.util.stream.A2, j$.util.function.w
        public /* synthetic */ void accept(int i2) {
            j$.time.a.a(this);
            throw null;
        }

        @Override // j$.util.stream.A2
        public void accept(long j2) {
            int i2 = this.f16183b;
            long[] jArr = this.a;
            if (i2 >= jArr.length) {
                throw new IllegalStateException(String.format("Accept exceeded fixed size of %d", Integer.valueOf(this.a.length)));
            }
            this.f16183b = i2 + 1;
            jArr[i2] = j2;
        }

        @Override // j$.util.function.Consumer
        public Consumer e(Consumer consumer) {
            Objects.requireNonNull(consumer);
            return new C0277e(this, consumer);
        }

        @Override // j$.util.function.C
        public j$.util.function.C f(j$.util.function.C c2) {
            Objects.requireNonNull(c2);
            return new C0280h(this, c2);
        }

        @Override // j$.util.stream.A2
        public void m() {
            if (this.f16183b < this.a.length) {
                throw new IllegalStateException(String.format("End size %d is less than fixed size %d", Integer.valueOf(this.f16183b), Integer.valueOf(this.a.length)));
            }
        }

        @Override // j$.util.stream.A2
        public void n(long j2) {
            if (j2 != this.a.length) {
                throw new IllegalStateException(String.format("Begin size %d is not equal to fixed size %d", Long.valueOf(j2), Integer.valueOf(this.a.length)));
            }
            this.f16183b = 0;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ boolean o() {
            return false;
        }

        @Override // j$.util.function.Consumer
        /* renamed from: s, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void accept(Long l2) {
            Q1.c(this, l2);
        }

        @Override // j$.util.stream.S1.p
        public String toString() {
            return String.format("LongFixedNodeBuilder[%d][%s]", Integer.valueOf(this.a.length - this.f16183b), Arrays.toString(this.a));
        }
    }

    private static final class r extends S2.d implements R1.d, R1.a.c {

        /* renamed from: g, reason: collision with root package name */
        private boolean f16184g = false;

        r() {
        }

        @Override // j$.util.stream.S2.d
        /* renamed from: B */
        public Spliterator.c spliterator() {
            return super.spliterator();
        }

        @Override // j$.util.function.Consumer
        /* renamed from: C, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void accept(Long l2) {
            Q1.c(this, l2);
        }

        @Override // j$.util.stream.R1
        /* renamed from: D, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ void j(Long[] lArr, int i2) {
            Q1.g(this, lArr, i2);
        }

        @Override // j$.util.stream.R1
        /* renamed from: E, reason: merged with bridge method [inline-methods] */
        public /* synthetic */ R1.d r(long j2, long j3, j$.util.function.x xVar) {
            return Q1.m(this, j2, j3, xVar);
        }

        @Override // j$.util.stream.R1.a.c, j$.util.stream.R1.a
        public R1.d a() {
            return this;
        }

        @Override // j$.util.stream.R1.a
        public R1 a() {
            return this;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(double d2) {
            j$.time.a.c(this);
            throw null;
        }

        @Override // j$.util.stream.A2, j$.util.function.w
        public /* synthetic */ void accept(int i2) {
            j$.time.a.a(this);
            throw null;
        }

        @Override // j$.util.stream.S2.d, j$.util.function.C
        public void accept(long j2) {
            super.accept(j2);
        }

        @Override // j$.util.stream.R1.e, j$.util.stream.R1
        public R1.e b(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j$.util.stream.S2.e, j$.util.stream.R1.e
        public void d(Object obj, int i2) {
            super.d((long[]) obj, i2);
        }

        @Override // j$.util.function.Consumer
        public Consumer e(Consumer consumer) {
            Objects.requireNonNull(consumer);
            return new C0277e(this, consumer);
        }

        @Override // j$.util.stream.S2.e, j$.util.stream.R1.e
        public Object g() {
            return (long[]) super.g();
        }

        @Override // j$.util.stream.S2.e, j$.util.stream.R1.e
        public void h(Object obj) {
            super.h((j$.util.function.C) obj);
        }

        @Override // j$.util.stream.A2
        public void m() {
            this.f16184g = false;
        }

        @Override // j$.util.stream.A2
        public void n(long j2) {
            this.f16184g = true;
            clear();
            x(j2);
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ boolean o() {
            return false;
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ int p() {
            return 0;
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ Object[] q(j$.util.function.x xVar) {
            return Q1.d(this, xVar);
        }

        @Override // j$.util.stream.S2.d, j$.util.stream.S2.e, java.lang.Iterable, j$.lang.Iterable
        public Spliterator.d spliterator() {
            return super.spliterator();
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ R1 b(int i2) {
            b(i2);
            throw null;
        }

        @Override // j$.util.stream.S2.d, j$.util.stream.S2.e, java.lang.Iterable, j$.lang.Iterable
        public Spliterator spliterator() {
            return super.spliterator();
        }
    }

    private static abstract class s<P_IN, P_OUT, T_SINK extends A2<P_OUT>, K extends s<P_IN, P_OUT, T_SINK, K>> extends CountedCompleter<Void> implements A2<P_OUT> {
        protected final Spliterator a;

        /* renamed from: b, reason: collision with root package name */
        protected final T1 f16185b;

        /* renamed from: c, reason: collision with root package name */
        protected final long f16186c;

        /* renamed from: d, reason: collision with root package name */
        protected long f16187d;

        /* renamed from: e, reason: collision with root package name */
        protected long f16188e;

        /* renamed from: f, reason: collision with root package name */
        protected int f16189f;

        /* renamed from: g, reason: collision with root package name */
        protected int f16190g;

        static final class a<P_IN> extends s<P_IN, Double, A2.e, a<P_IN>> implements A2.e {

            /* renamed from: h, reason: collision with root package name */
            private final double[] f16191h;

            a(Spliterator spliterator, T1 t1, double[] dArr) {
                super(spliterator, t1, dArr.length);
                this.f16191h = dArr;
            }

            a(a aVar, Spliterator spliterator, long j2, long j3) {
                super(aVar, spliterator, j2, j3, aVar.f16191h.length);
                this.f16191h = aVar.f16191h;
            }

            @Override // j$.util.stream.S1.s, j$.util.stream.A2
            public void accept(double d2) {
                int i2 = this.f16189f;
                if (i2 >= this.f16190g) {
                    throw new IndexOutOfBoundsException(Integer.toString(this.f16189f));
                }
                double[] dArr = this.f16191h;
                this.f16189f = i2 + 1;
                dArr[i2] = d2;
            }

            @Override // j$.util.stream.S1.s
            s b(Spliterator spliterator, long j2, long j3) {
                return new a(this, spliterator, j2, j3);
            }

            @Override // j$.util.function.Consumer
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void accept(Double d2) {
                Q1.a(this, d2);
            }

            @Override // j$.util.function.q
            public j$.util.function.q k(j$.util.function.q qVar) {
                Objects.requireNonNull(qVar);
                return new C0278f(this, qVar);
            }
        }

        static final class b<P_IN> extends s<P_IN, Integer, A2.f, b<P_IN>> implements A2.f {

            /* renamed from: h, reason: collision with root package name */
            private final int[] f16192h;

            b(Spliterator spliterator, T1 t1, int[] iArr) {
                super(spliterator, t1, iArr.length);
                this.f16192h = iArr;
            }

            b(b bVar, Spliterator spliterator, long j2, long j3) {
                super(bVar, spliterator, j2, j3, bVar.f16192h.length);
                this.f16192h = bVar.f16192h;
            }

            @Override // j$.util.stream.S1.s, j$.util.stream.A2, j$.util.function.w
            public void accept(int i2) {
                int i3 = this.f16189f;
                if (i3 >= this.f16190g) {
                    throw new IndexOutOfBoundsException(Integer.toString(this.f16189f));
                }
                int[] iArr = this.f16192h;
                this.f16189f = i3 + 1;
                iArr[i3] = i2;
            }

            @Override // j$.util.stream.S1.s
            s b(Spliterator spliterator, long j2, long j3) {
                return new b(this, spliterator, j2, j3);
            }

            @Override // j$.util.function.Consumer
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void accept(Integer num) {
                Q1.b(this, num);
            }

            @Override // j$.util.function.w
            public j$.util.function.w l(j$.util.function.w wVar) {
                Objects.requireNonNull(wVar);
                return new C0279g(this, wVar);
            }
        }

        static final class c<P_IN> extends s<P_IN, Long, A2.g, c<P_IN>> implements A2.g {

            /* renamed from: h, reason: collision with root package name */
            private final long[] f16193h;

            c(Spliterator spliterator, T1 t1, long[] jArr) {
                super(spliterator, t1, jArr.length);
                this.f16193h = jArr;
            }

            c(c cVar, Spliterator spliterator, long j2, long j3) {
                super(cVar, spliterator, j2, j3, cVar.f16193h.length);
                this.f16193h = cVar.f16193h;
            }

            @Override // j$.util.stream.S1.s, j$.util.stream.A2
            public void accept(long j2) {
                int i2 = this.f16189f;
                if (i2 >= this.f16190g) {
                    throw new IndexOutOfBoundsException(Integer.toString(this.f16189f));
                }
                long[] jArr = this.f16193h;
                this.f16189f = i2 + 1;
                jArr[i2] = j2;
            }

            @Override // j$.util.stream.S1.s
            s b(Spliterator spliterator, long j2, long j3) {
                return new c(this, spliterator, j2, j3);
            }

            @Override // j$.util.function.Consumer
            /* renamed from: c, reason: merged with bridge method [inline-methods] */
            public /* synthetic */ void accept(Long l2) {
                Q1.c(this, l2);
            }

            @Override // j$.util.function.C
            public j$.util.function.C f(j$.util.function.C c2) {
                Objects.requireNonNull(c2);
                return new C0280h(this, c2);
            }
        }

        static final class d<P_IN, P_OUT> extends s<P_IN, P_OUT, A2<P_OUT>, d<P_IN, P_OUT>> implements A2<P_OUT> {

            /* renamed from: h, reason: collision with root package name */
            private final Object[] f16194h;

            d(Spliterator spliterator, T1 t1, Object[] objArr) {
                super(spliterator, t1, objArr.length);
                this.f16194h = objArr;
            }

            d(d dVar, Spliterator spliterator, long j2, long j3) {
                super(dVar, spliterator, j2, j3, dVar.f16194h.length);
                this.f16194h = dVar.f16194h;
            }

            @Override // j$.util.function.Consumer
            public void accept(Object obj) {
                int i2 = this.f16189f;
                if (i2 >= this.f16190g) {
                    throw new IndexOutOfBoundsException(Integer.toString(this.f16189f));
                }
                Object[] objArr = this.f16194h;
                this.f16189f = i2 + 1;
                objArr[i2] = obj;
            }

            @Override // j$.util.stream.S1.s
            s b(Spliterator spliterator, long j2, long j3) {
                return new d(this, spliterator, j2, j3);
            }
        }

        s(Spliterator spliterator, T1 t1, int i2) {
            this.a = spliterator;
            this.f16185b = t1;
            this.f16186c = AbstractC0325k1.h(spliterator.estimateSize());
            this.f16187d = 0L;
            this.f16188e = i2;
        }

        s(s sVar, Spliterator spliterator, long j2, long j3, int i2) {
            super(sVar);
            this.a = spliterator;
            this.f16185b = sVar.f16185b;
            this.f16186c = sVar.f16186c;
            this.f16187d = j2;
            this.f16188e = j3;
            if (j2 < 0 || j3 < 0 || (j2 + j3) - 1 >= i2) {
                throw new IllegalArgumentException(String.format("offset and length interval [%d, %d + %d) is not within array size interval [0, %d)", Long.valueOf(j2), Long.valueOf(j2), Long.valueOf(j3), Integer.valueOf(i2)));
            }
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(double d2) {
            j$.time.a.c(this);
            throw null;
        }

        @Override // j$.util.stream.A2, j$.util.function.w
        public /* synthetic */ void accept(int i2) {
            j$.time.a.a(this);
            throw null;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(long j2) {
            j$.time.a.b(this);
            throw null;
        }

        abstract s b(Spliterator spliterator, long j2, long j3);

        @Override // java.util.concurrent.CountedCompleter
        public void compute() {
            Spliterator spliteratorTrySplit;
            Spliterator spliterator = this.a;
            s<P_IN, P_OUT, T_SINK, K> sVarB = this;
            while (spliterator.estimateSize() > sVarB.f16186c && (spliteratorTrySplit = spliterator.trySplit()) != null) {
                sVarB.setPendingCount(1);
                long jEstimateSize = spliteratorTrySplit.estimateSize();
                sVarB.b(spliteratorTrySplit, sVarB.f16187d, jEstimateSize).fork();
                sVarB = sVarB.b(spliterator, sVarB.f16187d + jEstimateSize, sVarB.f16188e - jEstimateSize);
            }
            AbstractC0313h1 abstractC0313h1 = (AbstractC0313h1) sVarB.f16185b;
            Objects.requireNonNull(abstractC0313h1);
            abstractC0313h1.m0(abstractC0313h1.u0(sVarB), spliterator);
            sVarB.propagateCompletion();
        }

        @Override // j$.util.function.Consumer
        public Consumer e(Consumer consumer) {
            Objects.requireNonNull(consumer);
            return new C0277e(this, consumer);
        }

        @Override // j$.util.stream.A2
        public void m() {
        }

        @Override // j$.util.stream.A2
        public void n(long j2) {
            long j3 = this.f16188e;
            if (j2 > j3) {
                throw new IllegalStateException("size passed to Sink.begin exceeds array length");
            }
            int i2 = (int) this.f16187d;
            this.f16189f = i2;
            this.f16190g = i2 + ((int) j3);
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ boolean o() {
            return false;
        }
    }

    private static final class t<T> extends S2<T> implements R1<T>, R1.a<T> {

        /* renamed from: g, reason: collision with root package name */
        private boolean f16195g = false;

        t() {
        }

        @Override // j$.util.stream.R1.a
        public R1 a() {
            return this;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(double d2) {
            j$.time.a.c(this);
            throw null;
        }

        @Override // j$.util.stream.A2, j$.util.function.w
        public /* synthetic */ void accept(int i2) {
            j$.time.a.a(this);
            throw null;
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ void accept(long j2) {
            j$.time.a.b(this);
            throw null;
        }

        @Override // j$.util.stream.S2, j$.util.function.Consumer
        public void accept(Object obj) {
            super.accept(obj);
        }

        @Override // j$.util.stream.R1
        public R1 b(int i2) {
            throw new IndexOutOfBoundsException();
        }

        @Override // j$.util.stream.S2, j$.lang.Iterable
        public void forEach(Consumer consumer) {
            super.forEach(consumer);
        }

        @Override // j$.util.stream.S2, j$.util.stream.R1
        public void j(Object[] objArr, int i2) {
            super.j(objArr, i2);
        }

        @Override // j$.util.stream.A2
        public void m() {
            this.f16195g = false;
        }

        @Override // j$.util.stream.A2
        public void n(long j2) {
            this.f16195g = true;
            clear();
            u(j2);
        }

        @Override // j$.util.stream.A2
        public /* synthetic */ boolean o() {
            return false;
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ int p() {
            return 0;
        }

        @Override // j$.util.stream.R1
        public Object[] q(j$.util.function.x xVar) {
            long jCount = count();
            if (jCount >= 2147483639) {
                throw new IllegalArgumentException("Stream size exceeds max array size");
            }
            Object[] objArr = (Object[]) xVar.apply((int) jCount);
            j(objArr, 0);
            return objArr;
        }

        @Override // j$.util.stream.R1
        public /* synthetic */ R1 r(long j2, long j3, j$.util.function.x xVar) {
            return Q1.n(this, j2, j3, xVar);
        }

        @Override // j$.util.stream.S2, java.lang.Iterable, j$.lang.Iterable
        public Spliterator spliterator() {
            return super.spliterator();
        }
    }

    private static abstract class u<T, T_NODE extends R1<T>, K extends u<T, T_NODE, K>> extends CountedCompleter<Void> {
        protected final R1 a;

        /* renamed from: b, reason: collision with root package name */
        protected final int f16196b;

        private static final class a extends d<Double, j$.util.function.q, double[], Spliterator.a, R1.b> {
            a(R1.b bVar, double[] dArr, int i2, a aVar) {
                super(bVar, dArr, i2, null);
            }
        }

        private static final class b extends d<Integer, j$.util.function.w, int[], Spliterator.b, R1.c> {
            b(R1.c cVar, int[] iArr, int i2, a aVar) {
                super(cVar, iArr, i2, null);
            }
        }

        private static final class c extends d<Long, j$.util.function.C, long[], Spliterator.c, R1.d> {
            c(R1.d dVar, long[] jArr, int i2, a aVar) {
                super(dVar, jArr, i2, null);
            }
        }

        private static class d<T, T_CONS, T_ARR, T_SPLITR extends Spliterator.d<T, T_CONS, T_SPLITR>, T_NODE extends R1.e<T, T_CONS, T_ARR, T_SPLITR, T_NODE>> extends u<T, T_NODE, d<T, T_CONS, T_ARR, T_SPLITR, T_NODE>> {

            /* renamed from: c, reason: collision with root package name */
            private final Object f16197c;

            d(R1.e eVar, Object obj, int i2, a aVar) {
                super(eVar, i2);
                this.f16197c = obj;
            }

            private d(d dVar, R1.e eVar, int i2) {
                super(dVar, eVar, i2);
                this.f16197c = dVar.f16197c;
            }

            @Override // j$.util.stream.S1.u
            void a() {
                ((R1.e) this.a).d(this.f16197c, this.f16196b);
            }

            @Override // j$.util.stream.S1.u
            u b(int i2, int i3) {
                return new d(this, ((R1.e) this.a).b(i2), i3);
            }
        }

        private static final class e<T> extends u<T, R1<T>, e<T>> {

            /* renamed from: c, reason: collision with root package name */
            private final Object[] f16198c;

            e(R1 r1, Object[] objArr, int i2, a aVar) {
                super(r1, i2);
                this.f16198c = objArr;
            }

            private e(e eVar, R1 r1, int i2) {
                super(eVar, r1, i2);
                this.f16198c = eVar.f16198c;
            }

            @Override // j$.util.stream.S1.u
            void a() {
                this.a.j(this.f16198c, this.f16196b);
            }

            @Override // j$.util.stream.S1.u
            u b(int i2, int i3) {
                return new e(this, this.a.b(i2), i3);
            }
        }

        u(R1 r1, int i2) {
            this.a = r1;
            this.f16196b = i2;
        }

        u(u uVar, R1 r1, int i2) {
            super(uVar);
            this.a = r1;
            this.f16196b = i2;
        }

        abstract void a();

        abstract u b(int i2, int i3);

        @Override // java.util.concurrent.CountedCompleter
        public void compute() {
            u<T, T_NODE, K> uVarB = this;
            while (uVarB.a.p() != 0) {
                uVarB.setPendingCount(uVarB.a.p() - 1);
                int i2 = 0;
                int iCount = 0;
                while (i2 < uVarB.a.p() - 1) {
                    u uVarB2 = uVarB.b(i2, uVarB.f16196b + iCount);
                    iCount = (int) (iCount + uVarB2.a.count());
                    uVarB2.fork();
                    i2++;
                }
                uVarB = uVarB.b(i2, uVarB.f16196b + iCount);
            }
            uVarB.a();
            uVarB.propagateCompletion();
        }
    }

    static R1.a d(long j2, j$.util.function.x xVar) {
        return (j2 < 0 || j2 >= 2147483639) ? new t() : new k(j2, xVar);
    }

    public static R1 e(T1 t1, Spliterator spliterator, boolean z, j$.util.function.x xVar) {
        long jP0 = t1.p0(spliterator);
        if (jP0 < 0 || !spliterator.hasCharacteristics(16384)) {
            R1 r1 = (R1) new e.d(t1, xVar, spliterator).invoke();
            return z ? l(r1, xVar) : r1;
        }
        if (jP0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) xVar.apply((int) jP0);
        new s.d(spliterator, t1, objArr).invoke();
        return new c(objArr);
    }

    public static R1.b f(T1 t1, Spliterator spliterator, boolean z) {
        long jP0 = t1.p0(spliterator);
        if (jP0 < 0 || !spliterator.hasCharacteristics(16384)) {
            R1.b bVar = (R1.b) new e.a(t1, spliterator).invoke();
            return z ? m(bVar) : bVar;
        }
        if (jP0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jP0];
        new s.a(spliterator, t1, dArr).invoke();
        return new g(dArr);
    }

    public static R1.c g(T1 t1, Spliterator spliterator, boolean z) {
        long jP0 = t1.p0(spliterator);
        if (jP0 < 0 || !spliterator.hasCharacteristics(16384)) {
            R1.c cVar = (R1.c) new e.b(t1, spliterator).invoke();
            return z ? n(cVar) : cVar;
        }
        if (jP0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jP0];
        new s.b(spliterator, t1, iArr).invoke();
        return new l(iArr);
    }

    public static R1.d h(T1 t1, Spliterator spliterator, boolean z) {
        long jP0 = t1.p0(spliterator);
        if (jP0 < 0 || !spliterator.hasCharacteristics(16384)) {
            R1.d dVar = (R1.d) new e.c(t1, spliterator).invoke();
            return z ? o(dVar) : dVar;
        }
        if (jP0 >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jP0];
        new s.c(spliterator, t1, jArr).invoke();
        return new p(jArr);
    }

    static R1 i(U2 u2, R1 r1, R1 r12) {
        int iOrdinal = u2.ordinal();
        if (iOrdinal == 0) {
            return new f(r1, r12);
        }
        if (iOrdinal == 1) {
            return new f.b((R1.c) r1, (R1.c) r12);
        }
        if (iOrdinal == 2) {
            return new f.c((R1.d) r1, (R1.d) r12);
        }
        if (iOrdinal == 3) {
            return new f.a((R1.b) r1, (R1.b) r12);
        }
        throw new IllegalStateException("Unknown shape " + u2);
    }

    static R1.a.InterfaceC0206a j(long j2) {
        return (j2 < 0 || j2 >= 2147483639) ? new i() : new h(j2);
    }

    static R1 k(U2 u2) {
        int iOrdinal = u2.ordinal();
        if (iOrdinal == 0) {
            return a;
        }
        if (iOrdinal == 1) {
            return f16163b;
        }
        if (iOrdinal == 2) {
            return f16164c;
        }
        if (iOrdinal == 3) {
            return f16165d;
        }
        throw new IllegalStateException("Unknown shape " + u2);
    }

    public static R1 l(R1 r1, j$.util.function.x xVar) {
        if (r1.p() <= 0) {
            return r1;
        }
        long jCount = r1.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) xVar.apply((int) jCount);
        new u.e(r1, objArr, 0, null).invoke();
        return new c(objArr);
    }

    public static R1.b m(R1.b bVar) {
        if (bVar.p() <= 0) {
            return bVar;
        }
        long jCount = bVar.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        double[] dArr = new double[(int) jCount];
        new u.a(bVar, dArr, 0, null).invoke();
        return new g(dArr);
    }

    public static R1.c n(R1.c cVar) {
        if (cVar.p() <= 0) {
            return cVar;
        }
        long jCount = cVar.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        int[] iArr = new int[(int) jCount];
        new u.b(cVar, iArr, 0, null).invoke();
        return new l(iArr);
    }

    public static R1.d o(R1.d dVar) {
        if (dVar.p() <= 0) {
            return dVar;
        }
        long jCount = dVar.count();
        if (jCount >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        long[] jArr = new long[(int) jCount];
        new u.c(dVar, jArr, 0, null).invoke();
        return new p(jArr);
    }

    static R1.a.b p(long j2) {
        return (j2 < 0 || j2 >= 2147483639) ? new n() : new m(j2);
    }

    static R1.a.c q(long j2) {
        return (j2 < 0 || j2 >= 2147483639) ? new r() : new q(j2);
    }
}