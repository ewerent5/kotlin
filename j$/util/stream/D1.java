package j$.util.stream;

import j$.C0253j0;
import j$.C0257l0;
import j$.C0261n0;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0273a;
import j$.util.function.C0274b;
import j$.util.function.C0280h;
import j$.util.function.C0281i;
import j$.util.function.C0282j;
import j$.util.function.Function;
import j$.util.function.ToLongFunction;
import j$.util.stream.A2;
import j$.util.stream.AbstractC0345p1;
import j$.util.stream.AbstractC0372w1;
import j$.util.stream.AbstractC0381y2;
import j$.util.stream.R1;
import j$.util.t;
import java.util.Iterator;
import java.util.Objects;

/* loaded from: classes2.dex */
abstract class D1<E_IN> extends AbstractC0313h1<E_IN, Long, H1> implements H1 {

    class a extends AbstractC0345p1.i<Long> {

        /* renamed from: j$.util.stream.D1$a$a, reason: collision with other inner class name */
        class C0205a extends A2.c<Double> {
            C0205a(a aVar, A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.g, j$.util.stream.A2
            public void accept(long j2) {
                this.a.accept(j2);
            }
        }

        a(D1 d1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2) {
            super(abstractC0313h1, u2, i2);
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new C0205a(this, a2);
        }
    }

    class b extends i<Long> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.F f16117l;

        class a extends A2.c<Long> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.g, j$.util.stream.A2
            public void accept(long j2) {
                this.a.accept(b.this.f16117l.applyAsLong(j2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(D1 d1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.F f2) {
            super(abstractC0313h1, u2, i2);
            this.f16117l = f2;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    class c<U> extends AbstractC0381y2.m<Long, U> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.D f16119l;

        class a extends A2.c<U> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.g, j$.util.stream.A2
            public void accept(long j2) {
                this.a.accept(c.this.f16119l.apply(j2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(D1 d1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.D d2) {
            super(abstractC0313h1, u2, i2);
            this.f16119l = d2;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    class d extends i<Long> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.D f16121l;

        class a extends A2.c<Long> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.g, j$.util.stream.A2
            public void accept(long j2) {
                H1 h1 = (H1) d.this.f16121l.apply(j2);
                if (h1 != null) {
                    try {
                        h1.sequential().f(new j$.util.function.C() { // from class: j$.util.stream.Q
                            @Override // j$.util.function.C
                            public final void accept(long j3) {
                                this.a.a.accept(j3);
                            }

                            @Override // j$.util.function.C
                            public j$.util.function.C f(j$.util.function.C c2) {
                                Objects.requireNonNull(c2);
                                return new C0280h(this, c2);
                            }
                        });
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

            @Override // j$.util.stream.A2.c, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(-1L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(D1 d1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.D d2) {
            super(abstractC0313h1, u2, i2);
            this.f16121l = d2;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    class e extends i<Long> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.E f16123l;

        class a extends A2.c<Long> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.g, j$.util.stream.A2
            public void accept(long j2) {
                if (((C0253j0) e.this.f16123l).b(j2)) {
                    this.a.accept(j2);
                }
            }

            @Override // j$.util.stream.A2.c, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(-1L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(D1 d1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.E e2) {
            super(abstractC0313h1, u2, i2);
            this.f16123l = e2;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    class f extends i<Long> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.C f16125l;

        class a extends A2.c<Long> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.g, j$.util.stream.A2
            public void accept(long j2) {
                f.this.f16125l.accept(j2);
                this.a.accept(j2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(D1 d1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.C c2) {
            super(abstractC0313h1, u2, i2);
            this.f16125l = c2;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    static class g<E_IN> extends D1<E_IN> {
        g(Spliterator spliterator, int i2, boolean z) {
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

        @Override // j$.util.stream.D1, j$.util.stream.H1
        public void Y(j$.util.function.C c2) {
            if (!isParallel()) {
                D1.L0(I0()).d(c2);
            } else {
                Objects.requireNonNull(c2);
                w0(new AbstractC0372w1.c(c2, true));
            }
        }

        @Override // j$.util.stream.D1, j$.util.stream.H1
        public void f(j$.util.function.C c2) {
            if (isParallel()) {
                super.f(c2);
            } else {
                D1.L0(I0()).d(c2);
            }
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ H1 parallel() {
            parallel();
            return this;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ H1 sequential() {
            sequential();
            return this;
        }
    }

    static abstract class h<E_IN> extends D1<E_IN> {
        h(AbstractC0313h1 abstractC0313h1, U2 u2, int i2) {
            super(abstractC0313h1, i2);
        }

        @Override // j$.util.stream.AbstractC0313h1
        final boolean F0() {
            return true;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ H1 parallel() {
            parallel();
            return this;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ H1 sequential() {
            sequential();
            return this;
        }
    }

    static abstract class i<E_IN> extends D1<E_IN> {
        i(AbstractC0313h1 abstractC0313h1, U2 u2, int i2) {
            super(abstractC0313h1, i2);
        }

        @Override // j$.util.stream.AbstractC0313h1
        final boolean F0() {
            return false;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ H1 parallel() {
            parallel();
            return this;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ H1 sequential() {
            sequential();
            return this;
        }
    }

    D1(Spliterator spliterator, int i2, boolean z) {
        super(spliterator, i2, z);
    }

    D1(AbstractC0313h1 abstractC0313h1, int i2) {
        super(abstractC0313h1, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Spliterator.c L0(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.c) {
            return (Spliterator.c) spliterator;
        }
        if (!i3.a) {
            throw new UnsupportedOperationException("LongStream.adapt(Spliterator<Long> s)");
        }
        i3.a(AbstractC0313h1.class, "using LongStream.adapt(Spliterator<Long> s)");
        throw null;
    }

    @Override // j$.util.stream.H1
    public final long A(long j2, j$.util.function.B b2) {
        Objects.requireNonNull(b2);
        return ((Long) w0(new C0350q2(U2.LONG_VALUE, b2, j2))).longValue();
    }

    @Override // j$.util.stream.AbstractC0313h1
    final U2 A0() {
        return U2.LONG_VALUE;
    }

    @Override // j$.util.stream.AbstractC0313h1
    final Spliterator J0(T1 t1, j$.util.function.J j2, boolean z) {
        return new b3(t1, j2, z);
    }

    @Override // j$.util.stream.H1
    public final Stream N(j$.util.function.D d2) {
        Objects.requireNonNull(d2);
        return new c(this, this, U2.LONG_VALUE, T2.f16225k | T2.f16223i, d2);
    }

    @Override // j$.util.stream.H1
    public void Y(j$.util.function.C c2) {
        Objects.requireNonNull(c2);
        w0(new AbstractC0372w1.c(c2, true));
    }

    @Override // j$.util.stream.H1
    public final InterfaceC0356s1 asDoubleStream() {
        return new a(this, this, U2.LONG_VALUE, T2.f16225k | T2.f16223i);
    }

    @Override // j$.util.stream.H1
    public final j$.util.p average() {
        return ((long[]) d0(new j$.util.function.J() { // from class: j$.util.stream.W
            @Override // j$.util.function.J
            public final Object get() {
                return new long[2];
            }
        }, new j$.util.function.I() { // from class: j$.util.stream.P
            @Override // j$.util.function.I
            public final void accept(Object obj, long j2) {
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + j2;
            }
        }, new BiConsumer() { // from class: j$.util.stream.O
            @Override // j$.util.function.BiConsumer
            public BiConsumer a(BiConsumer biConsumer) {
                Objects.requireNonNull(biConsumer);
                return new C0273a(this, biConsumer);
            }

            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
            }
        }))[0] > 0 ? j$.util.p.d(r0[1] / r0[0]) : j$.util.p.a();
    }

    @Override // j$.util.stream.H1
    public final boolean b0(j$.util.function.E e2) {
        return ((Boolean) w0(Q1.t(e2, N1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.H1
    public final Stream boxed() {
        return N(C0283a.a);
    }

    @Override // j$.util.stream.H1
    public final boolean c(j$.util.function.E e2) {
        return ((Boolean) w0(Q1.t(e2, N1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.H1
    public final long count() {
        return ((D1) x(new j$.util.function.F() { // from class: j$.util.stream.V
            @Override // j$.util.function.F
            public j$.util.function.F a(j$.util.function.F f2) {
                Objects.requireNonNull(f2);
                return new C0281i(this, f2);
            }

            @Override // j$.util.function.F
            public final long applyAsLong(long j2) {
                return 1L;
            }

            @Override // j$.util.function.F
            public j$.util.function.F b(j$.util.function.F f2) {
                Objects.requireNonNull(f2);
                return new C0282j(this, f2);
            }
        })).sum();
    }

    @Override // j$.util.stream.H1
    public final Object d0(j$.util.function.J j2, j$.util.function.I i2, final BiConsumer biConsumer) {
        j$.util.function.n nVar = new j$.util.function.n() { // from class: j$.util.stream.T
            @Override // j$.util.function.BiFunction
            public BiFunction a(Function function) {
                Objects.requireNonNull(function);
                return new C0274b(this, function);
            }

            @Override // j$.util.function.BiFunction
            public final Object apply(Object obj, Object obj2) {
                biConsumer.accept(obj, obj2);
                return obj;
            }
        };
        Objects.requireNonNull(j2);
        Objects.requireNonNull(i2);
        return w0(new U1(U2.LONG_VALUE, nVar, i2, j2));
    }

    @Override // j$.util.stream.H1
    public final H1 distinct() {
        return ((AbstractC0381y2) N(C0283a.a)).distinct().e0(new ToLongFunction() { // from class: j$.util.stream.U
            @Override // j$.util.function.ToLongFunction
            public final long applyAsLong(Object obj) {
                return ((Long) obj).longValue();
            }
        });
    }

    @Override // j$.util.stream.H1
    public void f(j$.util.function.C c2) {
        Objects.requireNonNull(c2);
        w0(new AbstractC0372w1.c(c2, false));
    }

    @Override // j$.util.stream.H1
    public final boolean f0(j$.util.function.E e2) {
        return ((Boolean) w0(Q1.t(e2, N1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.H1
    public final j$.util.r findAny() {
        return (j$.util.r) w0(new C0360t1(false, U2.LONG_VALUE, j$.util.r.a(), Z0.a, C0308g0.a));
    }

    @Override // j$.util.stream.H1
    public final j$.util.r findFirst() {
        return (j$.util.r) w0(new C0360t1(true, U2.LONG_VALUE, j$.util.r.a(), Z0.a, C0308g0.a));
    }

    @Override // j$.util.stream.H1
    public final H1 g0(j$.util.function.E e2) {
        Objects.requireNonNull(e2);
        return new e(this, this, U2.LONG_VALUE, T2.o, e2);
    }

    @Override // j$.util.stream.H1
    public final j$.util.r i(j$.util.function.B b2) {
        Objects.requireNonNull(b2);
        return (j$.util.r) w0(new C0357s2(U2.LONG_VALUE, b2));
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public final t.c iterator() {
        return j$.util.v.h(spliterator());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public Iterator iterator() {
        return j$.util.v.h(spliterator());
    }

    @Override // j$.util.stream.H1
    public final InterfaceC0356s1 j(C0257l0 c0257l0) {
        Objects.requireNonNull(c0257l0);
        return new F1(this, this, U2.LONG_VALUE, T2.f16225k | T2.f16223i, c0257l0);
    }

    @Override // j$.util.stream.H1
    public final H1 limit(long j2) {
        if (j2 >= 0) {
            return B2.h(this, 0L, j2);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.H1
    public final j$.util.r max() {
        return i(new j$.util.function.B() { // from class: j$.util.stream.Y0
            @Override // j$.util.function.B
            public final long applyAsLong(long j2, long j3) {
                return Math.max(j2, j3);
            }
        });
    }

    @Override // j$.util.stream.H1
    public final j$.util.r min() {
        return i(new j$.util.function.B() { // from class: j$.util.stream.a0
            @Override // j$.util.function.B
            public final long applyAsLong(long j2, long j3) {
                return Math.min(j2, j3);
            }
        });
    }

    @Override // j$.util.stream.H1
    public final H1 q(j$.util.function.C c2) {
        Objects.requireNonNull(c2);
        return new f(this, this, U2.LONG_VALUE, 0, c2);
    }

    @Override // j$.util.stream.H1
    public final H1 r(j$.util.function.D d2) {
        return new d(this, this, U2.LONG_VALUE, T2.f16225k | T2.f16223i | T2.o, d2);
    }

    @Override // j$.util.stream.T1
    final R1.a s0(long j2, j$.util.function.x xVar) {
        return S1.q(j2);
    }

    @Override // j$.util.stream.H1
    public final H1 skip(long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? this : B2.h(this, j2, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.H1
    public final H1 sorted() {
        return new L2(this);
    }

    @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
    public final Spliterator.c spliterator() {
        return L0(super.spliterator());
    }

    @Override // j$.util.stream.H1
    public final long sum() {
        return ((Long) w0(new C0350q2(U2.LONG_VALUE, new j$.util.function.B() { // from class: j$.util.stream.X
            @Override // j$.util.function.B
            public final long applyAsLong(long j2, long j3) {
                return j2 + j3;
            }
        }, 0L))).longValue();
    }

    @Override // j$.util.stream.H1
    public final j$.util.n summaryStatistics() {
        return (j$.util.n) d0(new j$.util.function.J() { // from class: j$.util.stream.f1
            @Override // j$.util.function.J
            public final Object get() {
                return new j$.util.n();
            }
        }, new j$.util.function.I() { // from class: j$.util.stream.o0
            @Override // j$.util.function.I
            public final void accept(Object obj, long j2) {
                ((j$.util.n) obj).accept(j2);
            }
        }, new BiConsumer() { // from class: j$.util.stream.x0
            @Override // j$.util.function.BiConsumer
            public BiConsumer a(BiConsumer biConsumer) {
                Objects.requireNonNull(biConsumer);
                return new C0273a(this, biConsumer);
            }

            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((j$.util.n) obj).b((j$.util.n) obj2);
            }
        });
    }

    @Override // j$.util.stream.H1
    public final long[] toArray() {
        return (long[]) S1.o((R1.d) x0(new j$.util.function.x() { // from class: j$.util.stream.S
            @Override // j$.util.function.x
            public final Object apply(int i2) {
                return new Long[i2];
            }
        })).g();
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public InterfaceC0329l1 unordered() {
        return !B0() ? this : new G1(this, this, U2.LONG_VALUE, T2.f16227m);
    }

    @Override // j$.util.stream.H1
    public final C1 w(C0261n0 c0261n0) {
        Objects.requireNonNull(c0261n0);
        return new E1(this, this, U2.LONG_VALUE, T2.f16225k | T2.f16223i, c0261n0);
    }

    @Override // j$.util.stream.H1
    public final H1 x(j$.util.function.F f2) {
        Objects.requireNonNull(f2);
        return new b(this, this, U2.LONG_VALUE, T2.f16225k | T2.f16223i, f2);
    }

    @Override // j$.util.stream.AbstractC0313h1
    final R1 y0(T1 t1, Spliterator spliterator, boolean z, j$.util.function.x xVar) {
        return S1.h(t1, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC0313h1
    final void z0(Spliterator spliterator, A2 a2) {
        j$.util.function.C k0;
        Spliterator.c cVarL0 = L0(spliterator);
        if (a2 instanceof j$.util.function.C) {
            k0 = (j$.util.function.C) a2;
        } else {
            if (i3.a) {
                i3.a(AbstractC0313h1.class, "using LongStream.adapt(Sink<Long> s)");
                throw null;
            }
            k0 = new K0(a2);
        }
        while (!a2.o() && cVarL0.j(k0)) {
        }
    }
}