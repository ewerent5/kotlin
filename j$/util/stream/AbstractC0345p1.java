package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0273a;
import j$.util.function.C0274b;
import j$.util.function.C0278f;
import j$.util.function.Function;
import j$.util.function.ToDoubleFunction;
import j$.util.stream.A2;
import j$.util.stream.AbstractC0372w1;
import j$.util.stream.AbstractC0381y2;
import j$.util.stream.D1;
import j$.util.stream.R1;
import j$.util.t;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: j$.util.stream.p1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0345p1<E_IN> extends AbstractC0313h1<E_IN, Double, InterfaceC0356s1> implements InterfaceC0356s1 {

    /* renamed from: j$.util.stream.p1$a */
    class a extends i<Double> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.u f16336l;

        /* renamed from: j$.util.stream.p1$a$a, reason: collision with other inner class name */
        class C0207a extends A2.a<Double> {
            C0207a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.e, j$.util.stream.A2
            public void accept(double d2) {
                this.a.accept(((j$.K) a.this.f16336l).a(d2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC0345p1 abstractC0345p1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.u uVar) {
            super(abstractC0313h1, u2, i2);
            this.f16336l = uVar;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new C0207a(a2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* renamed from: j$.util.stream.p1$b */
    class b<U> extends AbstractC0381y2.m<Double, U> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.r f16338l;

        /* renamed from: j$.util.stream.p1$b$a */
        class a extends A2.a<U> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.e, j$.util.stream.A2
            public void accept(double d2) {
                this.a.accept(b.this.f16338l.apply(d2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC0345p1 abstractC0345p1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.r rVar) {
            super(abstractC0313h1, u2, i2);
            this.f16338l = rVar;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.p1$c */
    class c extends D1.i<Double> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.t f16340l;

        /* renamed from: j$.util.stream.p1$c$a */
        class a extends A2.a<Long> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.e, j$.util.stream.A2
            public void accept(double d2) {
                this.a.accept(c.this.f16340l.applyAsLong(d2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC0345p1 abstractC0345p1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.t tVar) {
            super(abstractC0313h1, u2, i2);
            this.f16340l = tVar;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.p1$d */
    class d extends i<Double> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.r f16342l;

        /* renamed from: j$.util.stream.p1$d$a */
        class a extends A2.a<Double> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.e, j$.util.stream.A2
            public void accept(double d2) {
                InterfaceC0356s1 interfaceC0356s1 = (InterfaceC0356s1) d.this.f16342l.apply(d2);
                if (interfaceC0356s1 != null) {
                    try {
                        interfaceC0356s1.sequential().l(new j$.util.function.q() { // from class: j$.util.stream.o
                            @Override // j$.util.function.q
                            public final void accept(double d3) {
                                this.a.a.accept(d3);
                            }

                            @Override // j$.util.function.q
                            public j$.util.function.q k(j$.util.function.q qVar) {
                                Objects.requireNonNull(qVar);
                                return new C0278f(this, qVar);
                            }
                        });
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

            @Override // j$.util.stream.A2.a, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(-1L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC0345p1 abstractC0345p1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.r rVar) {
            super(abstractC0313h1, u2, i2);
            this.f16342l = rVar;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.p1$e */
    class e extends i<Double> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.s f16344l;

        /* renamed from: j$.util.stream.p1$e$a */
        class a extends A2.a<Double> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.e, j$.util.stream.A2
            public void accept(double d2) {
                if (((j$.E) e.this.f16344l).b(d2)) {
                    this.a.accept(d2);
                }
            }

            @Override // j$.util.stream.A2.a, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(-1L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AbstractC0345p1 abstractC0345p1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.s sVar) {
            super(abstractC0313h1, u2, i2);
            this.f16344l = sVar;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.p1$f */
    class f extends i<Double> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.q f16346l;

        /* renamed from: j$.util.stream.p1$f$a */
        class a extends A2.a<Double> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.e, j$.util.stream.A2
            public void accept(double d2) {
                f.this.f16346l.accept(d2);
                this.a.accept(d2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(AbstractC0345p1 abstractC0345p1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.q qVar) {
            super(abstractC0313h1, u2, i2);
            this.f16346l = qVar;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.p1$g */
    static class g<E_IN> extends AbstractC0345p1<E_IN> {
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

        @Override // j$.util.stream.AbstractC0345p1, j$.util.stream.InterfaceC0356s1
        public void k0(j$.util.function.q qVar) {
            if (!isParallel()) {
                AbstractC0345p1.L0(I0()).d(qVar);
            } else {
                Objects.requireNonNull(qVar);
                w0(new AbstractC0372w1.a(qVar, true));
            }
        }

        @Override // j$.util.stream.AbstractC0345p1, j$.util.stream.InterfaceC0356s1
        public void l(j$.util.function.q qVar) {
            if (isParallel()) {
                super.l(qVar);
            } else {
                AbstractC0345p1.L0(I0()).d(qVar);
            }
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ InterfaceC0356s1 parallel() {
            parallel();
            return this;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ InterfaceC0356s1 sequential() {
            sequential();
            return this;
        }
    }

    /* renamed from: j$.util.stream.p1$h */
    static abstract class h<E_IN> extends AbstractC0345p1<E_IN> {
        h(AbstractC0313h1 abstractC0313h1, U2 u2, int i2) {
            super(abstractC0313h1, i2);
        }

        @Override // j$.util.stream.AbstractC0313h1
        final boolean F0() {
            return true;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ InterfaceC0356s1 parallel() {
            parallel();
            return this;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ InterfaceC0356s1 sequential() {
            sequential();
            return this;
        }
    }

    /* renamed from: j$.util.stream.p1$i */
    static abstract class i<E_IN> extends AbstractC0345p1<E_IN> {
        i(AbstractC0313h1 abstractC0313h1, U2 u2, int i2) {
            super(abstractC0313h1, i2);
        }

        @Override // j$.util.stream.AbstractC0313h1
        final boolean F0() {
            return false;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ InterfaceC0356s1 parallel() {
            parallel();
            return this;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ InterfaceC0356s1 sequential() {
            sequential();
            return this;
        }
    }

    AbstractC0345p1(Spliterator spliterator, int i2, boolean z) {
        super(spliterator, i2, z);
    }

    AbstractC0345p1(AbstractC0313h1 abstractC0313h1, int i2) {
        super(abstractC0313h1, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Spliterator.a L0(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.a) {
            return (Spliterator.a) spliterator;
        }
        if (!i3.a) {
            throw new UnsupportedOperationException("DoubleStream.adapt(Spliterator<Double> s)");
        }
        i3.a(AbstractC0313h1.class, "using DoubleStream.adapt(Spliterator<Double> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC0313h1
    final U2 A0() {
        return U2.DOUBLE_VALUE;
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final j$.util.p C(j$.util.function.p pVar) {
        Objects.requireNonNull(pVar);
        return (j$.util.p) w0(new Y1(U2.DOUBLE_VALUE, pVar));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final Object D(j$.util.function.J j2, j$.util.function.G g2, final BiConsumer biConsumer) {
        j$.util.function.n nVar = new j$.util.function.n() { // from class: j$.util.stream.w
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
        Objects.requireNonNull(g2);
        return w0(new C0286a2(U2.DOUBLE_VALUE, nVar, g2, j2));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final double G(double d2, j$.util.function.p pVar) {
        Objects.requireNonNull(pVar);
        return ((Double) w0(new W1(U2.DOUBLE_VALUE, pVar, d2))).doubleValue();
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final InterfaceC0356s1 H(j$.util.function.u uVar) {
        Objects.requireNonNull(uVar);
        return new a(this, this, U2.DOUBLE_VALUE, T2.f16225k | T2.f16223i, uVar);
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final Stream I(j$.util.function.r rVar) {
        Objects.requireNonNull(rVar);
        return new b(this, this, U2.DOUBLE_VALUE, T2.f16225k | T2.f16223i, rVar);
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final boolean J(j$.util.function.s sVar) {
        return ((Boolean) w0(Q1.r(sVar, N1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.AbstractC0313h1
    final Spliterator J0(T1 t1, j$.util.function.J j2, boolean z) {
        return new Z2(t1, j2, z);
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final boolean O(j$.util.function.s sVar) {
        return ((Boolean) w0(Q1.r(sVar, N1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final boolean W(j$.util.function.s sVar) {
        return ((Boolean) w0(Q1.r(sVar, N1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final j$.util.p average() {
        double[] dArr = (double[]) D(new j$.util.function.J() { // from class: j$.util.stream.x
            @Override // j$.util.function.J
            public final Object get() {
                return new double[4];
            }
        }, new j$.util.function.G() { // from class: j$.util.stream.t
            @Override // j$.util.function.G
            public final void accept(Object obj, double d2) {
                double[] dArr2 = (double[]) obj;
                dArr2[2] = dArr2[2] + 1.0d;
                C0337n1.b(dArr2, d2);
                dArr2[3] = dArr2[3] + d2;
            }
        }, new BiConsumer() { // from class: j$.util.stream.v
            @Override // j$.util.function.BiConsumer
            public BiConsumer a(BiConsumer biConsumer) {
                Objects.requireNonNull(biConsumer);
                return new C0273a(this, biConsumer);
            }

            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                double[] dArr2 = (double[]) obj;
                double[] dArr3 = (double[]) obj2;
                C0337n1.b(dArr2, dArr3[0]);
                C0337n1.b(dArr2, dArr3[1]);
                dArr2[2] = dArr2[2] + dArr3[2];
                dArr2[3] = dArr2[3] + dArr3[3];
            }
        });
        return dArr[2] > 0.0d ? j$.util.p.d(C0337n1.a(dArr) / dArr[2]) : j$.util.p.a();
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final Stream boxed() {
        return I(O0.a);
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final long count() {
        return ((D1) v(new j$.util.function.t() { // from class: j$.util.stream.s
            @Override // j$.util.function.t
            public final long applyAsLong(double d2) {
                return 1L;
            }
        })).sum();
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final InterfaceC0356s1 d(j$.util.function.q qVar) {
        Objects.requireNonNull(qVar);
        return new f(this, this, U2.DOUBLE_VALUE, 0, qVar);
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final InterfaceC0356s1 distinct() {
        return ((AbstractC0381y2) I(O0.a)).distinct().h0(new ToDoubleFunction() { // from class: j$.util.stream.n
            @Override // j$.util.function.ToDoubleFunction
            public final double applyAsDouble(Object obj) {
                return ((Double) obj).doubleValue();
            }
        });
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final j$.util.p findAny() {
        return (j$.util.p) w0(new C0360t1(false, U2.DOUBLE_VALUE, j$.util.p.a(), S0.a, U0.a));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final j$.util.p findFirst() {
        return (j$.util.p) w0(new C0360t1(true, U2.DOUBLE_VALUE, j$.util.p.a(), S0.a, U0.a));
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public final t.a iterator() {
        return j$.util.v.f(spliterator());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public Iterator iterator() {
        return j$.util.v.f(spliterator());
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public void k0(j$.util.function.q qVar) {
        Objects.requireNonNull(qVar);
        w0(new AbstractC0372w1.a(qVar, true));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public void l(j$.util.function.q qVar) {
        Objects.requireNonNull(qVar);
        w0(new AbstractC0372w1.a(qVar, false));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final InterfaceC0356s1 limit(long j2) {
        if (j2 >= 0) {
            return B2.f(this, 0L, j2);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final j$.util.p max() {
        return C(new j$.util.function.p() { // from class: j$.util.stream.D
            @Override // j$.util.function.p
            public final double applyAsDouble(double d2, double d3) {
                return Math.max(d2, d3);
            }
        });
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final j$.util.p min() {
        return C(new j$.util.function.p() { // from class: j$.util.stream.X0
            @Override // j$.util.function.p
            public final double applyAsDouble(double d2, double d3) {
                return Math.min(d2, d3);
            }
        });
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final C1 o(j$.G g2) {
        Objects.requireNonNull(g2);
        return new C0349q1(this, this, U2.DOUBLE_VALUE, T2.f16225k | T2.f16223i, g2);
    }

    @Override // j$.util.stream.T1
    final R1.a s0(long j2, j$.util.function.x xVar) {
        return S1.j(j2);
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final InterfaceC0356s1 skip(long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? this : B2.f(this, j2, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final InterfaceC0356s1 sorted() {
        return new J2(this);
    }

    @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
    public final Spliterator.a spliterator() {
        return L0(super.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final double sum() {
        return C0337n1.a((double[]) D(new j$.util.function.J() { // from class: j$.util.stream.u
            @Override // j$.util.function.J
            public final Object get() {
                return new double[3];
            }
        }, new j$.util.function.G() { // from class: j$.util.stream.r
            @Override // j$.util.function.G
            public final void accept(Object obj, double d2) {
                double[] dArr = (double[]) obj;
                C0337n1.b(dArr, d2);
                dArr[2] = dArr[2] + d2;
            }
        }, new BiConsumer() { // from class: j$.util.stream.p
            @Override // j$.util.function.BiConsumer
            public BiConsumer a(BiConsumer biConsumer) {
                Objects.requireNonNull(biConsumer);
                return new C0273a(this, biConsumer);
            }

            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                C0337n1.b(dArr, dArr2[0]);
                C0337n1.b(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
            }
        }));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final j$.util.l summaryStatistics() {
        return (j$.util.l) D(new j$.util.function.J() { // from class: j$.util.stream.I0
            @Override // j$.util.function.J
            public final Object get() {
                return new j$.util.l();
            }
        }, new j$.util.function.G() { // from class: j$.util.stream.Z
            @Override // j$.util.function.G
            public final void accept(Object obj, double d2) {
                ((j$.util.l) obj).accept(d2);
            }
        }, new BiConsumer() { // from class: j$.util.stream.m0
            @Override // j$.util.function.BiConsumer
            public BiConsumer a(BiConsumer biConsumer) {
                Objects.requireNonNull(biConsumer);
                return new C0273a(this, biConsumer);
            }

            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((j$.util.l) obj).b((j$.util.l) obj2);
            }
        });
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final InterfaceC0356s1 t(j$.util.function.s sVar) {
        Objects.requireNonNull(sVar);
        return new e(this, this, U2.DOUBLE_VALUE, T2.o, sVar);
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final double[] toArray() {
        return (double[]) S1.m((R1.b) x0(new j$.util.function.x() { // from class: j$.util.stream.q
            @Override // j$.util.function.x
            public final Object apply(int i2) {
                return new Double[i2];
            }
        })).g();
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final InterfaceC0356s1 u(j$.util.function.r rVar) {
        return new d(this, this, U2.DOUBLE_VALUE, T2.f16225k | T2.f16223i | T2.o, rVar);
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public InterfaceC0329l1 unordered() {
        return !B0() ? this : new C0352r1(this, this, U2.DOUBLE_VALUE, T2.f16227m);
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public final H1 v(j$.util.function.t tVar) {
        Objects.requireNonNull(tVar);
        return new c(this, this, U2.DOUBLE_VALUE, T2.f16225k | T2.f16223i, tVar);
    }

    @Override // j$.util.stream.AbstractC0313h1
    final R1 y0(T1 t1, Spliterator spliterator, boolean z, j$.util.function.x xVar) {
        return S1.f(t1, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC0313h1
    final void z0(Spliterator spliterator, A2 a2) {
        j$.util.function.q n;
        Spliterator.a aVarL0 = L0(spliterator);
        if (a2 instanceof j$.util.function.q) {
            n = (j$.util.function.q) a2;
        } else {
            if (i3.a) {
                i3.a(AbstractC0313h1.class, "using DoubleStream.adapt(Sink<Double> s)");
                throw null;
            }
            n = new N(a2);
        }
        while (!a2.o() && aVarL0.j(n)) {
        }
    }
}