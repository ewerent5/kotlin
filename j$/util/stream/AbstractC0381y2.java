package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0277e;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import j$.util.stream.A2;
import j$.util.stream.AbstractC0345p1;
import j$.util.stream.AbstractC0372w1;
import j$.util.stream.AbstractC0384z1;
import j$.util.stream.D1;
import j$.util.stream.InterfaceC0333m1;
import j$.util.stream.R1;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: j$.util.stream.y2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0381y2<P_IN, P_OUT> extends AbstractC0313h1<P_IN, P_OUT, Stream<P_OUT>> implements Stream<P_OUT> {

    /* renamed from: j$.util.stream.y2$a */
    class a extends D1.i<P_OUT> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function f16383l;

        /* renamed from: j$.util.stream.y2$a$a, reason: collision with other inner class name */
        class C0208a extends A2.d<P_OUT, Long> {

            /* renamed from: b, reason: collision with root package name */
            j$.util.function.C f16384b;

            C0208a(A2 a2) {
                super(a2);
                A2 a22 = this.a;
                Objects.requireNonNull(a22);
                this.f16384b = new K0(a22);
            }

            @Override // j$.util.function.Consumer
            public void accept(Object obj) {
                H1 h1 = (H1) a.this.f16383l.apply(obj);
                if (h1 != null) {
                    try {
                        h1.sequential().f(this.f16384b);
                    } catch (Throwable th) {
                        try {
                            h1.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (h1 != null) {
                    h1.close();
                }
            }

            @Override // j$.util.stream.A2.d, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(-1L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC0381y2 abstractC0381y2, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, Function function) {
            super(abstractC0313h1, u2, i2);
            this.f16383l = function;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new C0208a(a2);
        }
    }

    /* renamed from: j$.util.stream.y2$b */
    class b extends m<P_OUT, P_OUT> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Consumer f16386l;

        /* renamed from: j$.util.stream.y2$b$a */
        class a extends A2.d<P_OUT, P_OUT> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.function.Consumer
            public void accept(Object obj) {
                b.this.f16386l.accept(obj);
                this.a.accept(obj);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC0381y2 abstractC0381y2, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, Consumer consumer) {
            super(abstractC0313h1, u2, i2);
            this.f16386l = consumer;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.y2$c */
    class c extends m<P_OUT, P_OUT> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Predicate f16388l;

        /* renamed from: j$.util.stream.y2$c$a */
        class a extends A2.d<P_OUT, P_OUT> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.function.Consumer
            public void accept(Object obj) {
                if (c.this.f16388l.test(obj)) {
                    this.a.accept(obj);
                }
            }

            @Override // j$.util.stream.A2.d, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(-1L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC0381y2 abstractC0381y2, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, Predicate predicate) {
            super(abstractC0313h1, u2, i2);
            this.f16388l = predicate;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: j$.util.stream.y2$d */
    class d<R> extends m<P_OUT, R> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function f16390l;

        /* renamed from: j$.util.stream.y2$d$a */
        class a extends A2.d<P_OUT, R> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.function.Consumer
            public void accept(Object obj) {
                this.a.accept(d.this.f16390l.apply(obj));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC0381y2 abstractC0381y2, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, Function function) {
            super(abstractC0313h1, u2, i2);
            this.f16390l = function;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.y2$e */
    class e extends AbstractC0384z1.k<P_OUT> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ToIntFunction f16392l;

        /* renamed from: j$.util.stream.y2$e$a */
        class a extends A2.d<P_OUT, Integer> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.function.Consumer
            public void accept(Object obj) {
                this.a.accept(e.this.f16392l.applyAsInt(obj));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AbstractC0381y2 abstractC0381y2, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, ToIntFunction toIntFunction) {
            super(abstractC0313h1, u2, i2);
            this.f16392l = toIntFunction;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.y2$f */
    class f extends D1.i<P_OUT> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ToLongFunction f16394l;

        /* renamed from: j$.util.stream.y2$f$a */
        class a extends A2.d<P_OUT, Long> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.function.Consumer
            public void accept(Object obj) {
                this.a.accept(f.this.f16394l.applyAsLong(obj));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(AbstractC0381y2 abstractC0381y2, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, ToLongFunction toLongFunction) {
            super(abstractC0313h1, u2, i2);
            this.f16394l = toLongFunction;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.y2$g */
    class g extends AbstractC0345p1.i<P_OUT> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ ToDoubleFunction f16396l;

        /* renamed from: j$.util.stream.y2$g$a */
        class a extends A2.d<P_OUT, Double> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.function.Consumer
            public void accept(Object obj) {
                this.a.accept(g.this.f16396l.applyAsDouble(obj));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(AbstractC0381y2 abstractC0381y2, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, ToDoubleFunction toDoubleFunction) {
            super(abstractC0313h1, u2, i2);
            this.f16396l = toDoubleFunction;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [R] */
    /* renamed from: j$.util.stream.y2$h */
    class h<R> extends m<P_OUT, R> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function f16398l;

        /* renamed from: j$.util.stream.y2$h$a */
        class a extends A2.d<P_OUT, R> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.function.Consumer
            public void accept(Object obj) {
                Stream stream = (Stream) h.this.f16398l.apply(obj);
                if (stream != null) {
                    try {
                        ((Stream) stream.sequential()).forEach(this.a);
                    } catch (Throwable th) {
                        try {
                            stream.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (stream != null) {
                    stream.close();
                }
            }

            @Override // j$.util.stream.A2.d, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(-1L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(AbstractC0381y2 abstractC0381y2, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, Function function) {
            super(abstractC0313h1, u2, i2);
            this.f16398l = function;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.y2$i */
    class i extends AbstractC0384z1.k<P_OUT> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function f16400l;

        /* renamed from: j$.util.stream.y2$i$a */
        class a extends A2.d<P_OUT, Integer> {

            /* renamed from: b, reason: collision with root package name */
            j$.util.function.w f16401b;

            a(A2 a2) {
                super(a2);
                A2 a22 = this.a;
                Objects.requireNonNull(a22);
                this.f16401b = new C0291c(a22);
            }

            @Override // j$.util.function.Consumer
            public void accept(Object obj) {
                C1 c1 = (C1) i.this.f16400l.apply(obj);
                if (c1 != null) {
                    try {
                        c1.sequential().Q(this.f16401b);
                    } catch (Throwable th) {
                        try {
                            c1.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (c1 != null) {
                    c1.close();
                }
            }

            @Override // j$.util.stream.A2.d, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(-1L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(AbstractC0381y2 abstractC0381y2, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, Function function) {
            super(abstractC0313h1, u2, i2);
            this.f16400l = function;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.y2$j */
    class j extends AbstractC0345p1.i<P_OUT> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ Function f16403l;

        /* renamed from: j$.util.stream.y2$j$a */
        class a extends A2.d<P_OUT, Double> {

            /* renamed from: b, reason: collision with root package name */
            j$.util.function.q f16404b;

            a(A2 a2) {
                super(a2);
                A2 a22 = this.a;
                Objects.requireNonNull(a22);
                this.f16404b = new N(a22);
            }

            @Override // j$.util.function.Consumer
            public void accept(Object obj) {
                InterfaceC0356s1 interfaceC0356s1 = (InterfaceC0356s1) j.this.f16403l.apply(obj);
                if (interfaceC0356s1 != null) {
                    try {
                        interfaceC0356s1.sequential().l(this.f16404b);
                    } catch (Throwable th) {
                        try {
                            interfaceC0356s1.close();
                        } catch (Throwable th2) {
                            th.addSuppressed(th2);
                        }
                        throw th;
                    }
                }
                if (interfaceC0356s1 != null) {
                    interfaceC0356s1.close();
                }
            }

            @Override // j$.util.stream.A2.d, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(-1L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        j(AbstractC0381y2 abstractC0381y2, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, Function function) {
            super(abstractC0313h1, u2, i2);
            this.f16403l = function;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.y2$k */
    static class k<E_IN, E_OUT> extends AbstractC0381y2<E_IN, E_OUT> {
        k(Spliterator spliterator, int i2, boolean z) {
            super(spliterator, i2, z);
        }

        @Override // j$.util.stream.AbstractC0313h1
        final boolean F0() {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.stream.AbstractC0313h1
        final A2 G0(int i2, A2 a2) {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.stream.AbstractC0381y2, j$.util.stream.Stream
        public void forEach(Consumer consumer) {
            if (isParallel()) {
                super.forEach(consumer);
            } else {
                I0().forEachRemaining(consumer);
            }
        }

        @Override // j$.util.stream.AbstractC0381y2, j$.util.stream.Stream
        public void g(Consumer consumer) {
            if (!isParallel()) {
                I0().forEachRemaining(consumer);
            } else {
                Objects.requireNonNull(consumer);
                w0(new AbstractC0372w1.d(consumer, true));
            }
        }
    }

    /* renamed from: j$.util.stream.y2$l */
    static abstract class l<E_IN, E_OUT> extends AbstractC0381y2<E_IN, E_OUT> {
        l(AbstractC0313h1 abstractC0313h1, U2 u2, int i2) {
            super(abstractC0313h1, i2);
        }

        @Override // j$.util.stream.AbstractC0313h1
        final boolean F0() {
            return true;
        }
    }

    /* renamed from: j$.util.stream.y2$m */
    static abstract class m<E_IN, E_OUT> extends AbstractC0381y2<E_IN, E_OUT> {
        m(AbstractC0313h1 abstractC0313h1, U2 u2, int i2) {
            super(abstractC0313h1, i2);
        }

        @Override // j$.util.stream.AbstractC0313h1
        final boolean F0() {
            return false;
        }
    }

    AbstractC0381y2(Spliterator spliterator, int i2, boolean z) {
        super(spliterator, i2, z);
    }

    AbstractC0381y2(AbstractC0313h1 abstractC0313h1, int i2) {
        super(abstractC0313h1, i2);
    }

    @Override // j$.util.stream.AbstractC0313h1
    final U2 A0() {
        return U2.REFERENCE;
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0356s1 B(Function function) {
        Objects.requireNonNull(function);
        return new j(this, this, U2.REFERENCE, T2.f16225k | T2.f16223i | T2.o, function);
    }

    @Override // j$.util.stream.AbstractC0313h1
    final Spliterator J0(T1 t1, j$.util.function.J j2, boolean z) {
        return new e3(t1, j2, z);
    }

    @Override // j$.util.stream.Stream
    public final Stream P(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new c(this, this, U2.REFERENCE, T2.o, predicate);
    }

    @Override // j$.util.stream.Stream
    public final Stream S(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new b(this, this, U2.REFERENCE, 0, consumer);
    }

    @Override // j$.util.stream.Stream
    public final Object T(InterfaceC0333m1 interfaceC0333m1) {
        final Object objW0;
        if (isParallel() && interfaceC0333m1.characteristics().contains(InterfaceC0333m1.a.CONCURRENT) && (!B0() || interfaceC0333m1.characteristics().contains(InterfaceC0333m1.a.UNORDERED))) {
            objW0 = interfaceC0333m1.supplier().get();
            final BiConsumer biConsumerAccumulator = interfaceC0333m1.accumulator();
            forEach(new Consumer() { // from class: j$.util.stream.s0
                @Override // j$.util.function.Consumer
                public final void accept(Object obj) {
                    biConsumerAccumulator.accept(objW0, obj);
                }

                @Override // j$.util.function.Consumer
                public Consumer e(Consumer consumer) {
                    Objects.requireNonNull(consumer);
                    return new C0277e(this, consumer);
                }
            });
        } else {
            Objects.requireNonNull(interfaceC0333m1);
            j$.util.function.J jSupplier = interfaceC0333m1.supplier();
            objW0 = w0(new C0310g2(U2.REFERENCE, interfaceC0333m1.combiner(), interfaceC0333m1.accumulator(), jSupplier, interfaceC0333m1));
        }
        return interfaceC0333m1.characteristics().contains(InterfaceC0333m1.a.IDENTITY_FINISH) ? objW0 : interfaceC0333m1.finisher().apply(objW0);
    }

    @Override // j$.util.stream.Stream
    public final boolean U(Predicate predicate) {
        return ((Boolean) w0(Q1.u(predicate, N1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final H1 V(Function function) {
        Objects.requireNonNull(function);
        return new a(this, this, U2.REFERENCE, T2.f16225k | T2.f16223i | T2.o, function);
    }

    @Override // j$.util.stream.Stream
    public final boolean a(Predicate predicate) {
        return ((Boolean) w0(Q1.u(predicate, N1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean c0(Predicate predicate) {
        return ((Boolean) w0(Q1.u(predicate, N1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((D1) e0(new ToLongFunction() { // from class: j$.util.stream.q0
            @Override // j$.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return 1L;
            }
        })).sum();
    }

    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new C0341o1(this, U2.REFERENCE, T2.f16222h | T2.o);
    }

    @Override // j$.util.stream.Stream
    public final C1 e(Function function) {
        Objects.requireNonNull(function);
        return new i(this, this, U2.REFERENCE, T2.f16225k | T2.f16223i | T2.o, function);
    }

    @Override // j$.util.stream.Stream
    public final H1 e0(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new f(this, this, U2.REFERENCE, T2.f16225k | T2.f16223i, toLongFunction);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.o findAny() {
        return (j$.util.o) w0(new C0360t1(false, U2.REFERENCE, j$.util.o.a(), C0309g1.a, W0.a));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.o findFirst() {
        return (j$.util.o) w0(new C0360t1(true, U2.REFERENCE, j$.util.o.a(), C0309g1.a, W0.a));
    }

    @Override // j$.util.stream.Stream
    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        w0(new AbstractC0372w1.d(consumer, false));
    }

    @Override // j$.util.stream.Stream
    public void g(Consumer consumer) {
        Objects.requireNonNull(consumer);
        w0(new AbstractC0372w1.d(consumer, true));
    }

    @Override // j$.util.stream.Stream
    public final InterfaceC0356s1 h0(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new g(this, this, U2.REFERENCE, T2.f16225k | T2.f16223i, toDoubleFunction);
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public final Iterator iterator() {
        return j$.util.v.i(spliterator());
    }

    @Override // j$.util.stream.Stream
    public final Object k(j$.util.function.J j2, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(j2);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return w0(new C0318i2(U2.REFERENCE, biConsumer2, biConsumer, j2));
    }

    @Override // j$.util.stream.Stream
    public final Object l0(Object obj, j$.util.function.n nVar) {
        Objects.requireNonNull(nVar);
        return w0(new C0294c2(U2.REFERENCE, nVar, nVar, obj));
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j2) {
        if (j2 >= 0) {
            return B2.i(this, 0L, j2);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.Stream
    public final C1 m(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new e(this, this, U2.REFERENCE, T2.f16225k | T2.f16223i, toIntFunction);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.o max(final Comparator comparator) {
        Objects.requireNonNull(comparator);
        return s(new j$.util.function.n() { // from class: j$.util.function.d
            @Override // j$.util.function.BiFunction
            public BiFunction a(Function function) {
                Objects.requireNonNull(function);
                return new C0274b(this, function);
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return comparator.compare(obj, obj2) >= 0 ? obj : obj2;
            }
        });
    }

    @Override // j$.util.stream.Stream
    public final j$.util.o min(final Comparator comparator) {
        Objects.requireNonNull(comparator);
        return s(new j$.util.function.n() { // from class: j$.util.function.c
            @Override // j$.util.function.BiFunction
            public BiFunction a(Function function) {
                Objects.requireNonNull(function);
                return new C0274b(this, function);
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                return comparator.compare(obj, obj2) <= 0 ? obj : obj2;
            }
        });
    }

    @Override // j$.util.stream.Stream
    public final Stream n(Function function) {
        Objects.requireNonNull(function);
        return new d(this, this, U2.REFERENCE, T2.f16225k | T2.f16223i, function);
    }

    @Override // j$.util.stream.Stream
    public final Stream p(Function function) {
        Objects.requireNonNull(function);
        return new h(this, this, U2.REFERENCE, T2.f16225k | T2.f16223i | T2.o, function);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.o s(j$.util.function.n nVar) {
        Objects.requireNonNull(nVar);
        return (j$.util.o) w0(new C0302e2(U2.REFERENCE, nVar));
    }

    @Override // j$.util.stream.T1
    final R1.a s0(long j2, j$.util.function.x xVar) {
        return S1.d(j2, xVar);
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? this : B2.i(this, j2, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new M2(this);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        C0351r0 c0351r0 = new j$.util.function.x() { // from class: j$.util.stream.r0
            @Override // j$.util.function.x
            public final Object apply(int i2) {
                return new Object[i2];
            }
        };
        return S1.l(x0(c0351r0), c0351r0).q(c0351r0);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(j$.util.function.x xVar) {
        return S1.l(x0(xVar), xVar).q(xVar);
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public InterfaceC0329l1 unordered() {
        return !B0() ? this : new C0385z2(this, this, U2.REFERENCE, T2.f16227m);
    }

    @Override // j$.util.stream.AbstractC0313h1
    final R1 y0(T1 t1, Spliterator spliterator, boolean z, j$.util.function.x xVar) {
        return S1.e(t1, spliterator, z, xVar);
    }

    @Override // j$.util.stream.Stream
    public final Object z(Object obj, BiFunction biFunction, j$.util.function.n nVar) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(nVar);
        return w0(new C0294c2(U2.REFERENCE, nVar, biFunction, obj));
    }

    @Override // j$.util.stream.AbstractC0313h1
    final void z0(Spliterator spliterator, A2 a2) {
        while (!a2.o() && spliterator.tryAdvance(a2)) {
        }
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new M2(this, comparator);
    }
}