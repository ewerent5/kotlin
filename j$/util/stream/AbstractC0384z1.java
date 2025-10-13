package j$.util.stream;

import j$.C0237b0;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.C0273a;
import j$.util.function.C0274b;
import j$.util.function.C0279g;
import j$.util.function.Function;
import j$.util.function.ToIntFunction;
import j$.util.stream.A2;
import j$.util.stream.AbstractC0345p1;
import j$.util.stream.AbstractC0372w1;
import j$.util.stream.AbstractC0381y2;
import j$.util.stream.D1;
import j$.util.stream.R1;
import j$.util.t;
import java.util.Iterator;
import java.util.Objects;

/* renamed from: j$.util.stream.z1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0384z1<E_IN> extends AbstractC0313h1<E_IN, Integer, C1> implements C1 {

    /* renamed from: j$.util.stream.z1$a */
    class a extends D1.i<Integer> {

        /* renamed from: j$.util.stream.z1$a$a, reason: collision with other inner class name */
        class C0209a extends A2.b<Long> {
            C0209a(a aVar, A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
            public void accept(int i2) {
                this.a.accept(i2);
            }
        }

        a(AbstractC0384z1 abstractC0384z1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2) {
            super(abstractC0313h1, u2, i2);
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new C0209a(this, a2);
        }
    }

    /* renamed from: j$.util.stream.z1$b */
    class b extends k<Integer> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.w f16406l;

        /* renamed from: j$.util.stream.z1$b$a */
        class a extends A2.b<Integer> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
            public void accept(int i2) {
                b.this.f16406l.accept(i2);
                this.a.accept(i2);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC0384z1 abstractC0384z1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.w wVar) {
            super(abstractC0313h1, u2, i2);
            this.f16406l = wVar;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.z1$c */
    class c extends AbstractC0345p1.i<Integer> {

        /* renamed from: j$.util.stream.z1$c$a */
        class a extends A2.b<Double> {
            a(c cVar, A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
            public void accept(int i2) {
                this.a.accept(i2);
            }
        }

        c(AbstractC0384z1 abstractC0384z1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2) {
            super(abstractC0313h1, u2, i2);
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(this, a2);
        }
    }

    /* renamed from: j$.util.stream.z1$d */
    class d extends k<Integer> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.A f16408l;

        /* renamed from: j$.util.stream.z1$d$a */
        class a extends A2.b<Integer> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
            public void accept(int i2) {
                this.a.accept(((C0237b0) d.this.f16408l).a(i2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC0384z1 abstractC0384z1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.A a2) {
            super(abstractC0313h1, u2, i2);
            this.f16408l = a2;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [U] */
    /* renamed from: j$.util.stream.z1$e */
    class e<U> extends AbstractC0381y2.m<Integer, U> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.x f16410l;

        /* renamed from: j$.util.stream.z1$e$a */
        class a extends A2.b<U> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
            public void accept(int i2) {
                this.a.accept(e.this.f16410l.apply(i2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(AbstractC0384z1 abstractC0384z1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.x xVar) {
            super(abstractC0313h1, u2, i2);
            this.f16410l = xVar;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.z1$f */
    class f extends D1.i<Integer> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.z f16412l;

        /* renamed from: j$.util.stream.z1$f$a */
        class a extends A2.b<Long> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
            public void accept(int i2) {
                this.a.accept(f.this.f16412l.applyAsLong(i2));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(AbstractC0384z1 abstractC0384z1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.z zVar) {
            super(abstractC0313h1, u2, i2);
            this.f16412l = zVar;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.z1$g */
    class g extends k<Integer> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.x f16414l;

        /* renamed from: j$.util.stream.z1$g$a */
        class a extends A2.b<Integer> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
            public void accept(int i2) {
                C1 c1 = (C1) g.this.f16414l.apply(i2);
                if (c1 != null) {
                    try {
                        c1.sequential().Q(new j$.util.function.w() { // from class: j$.util.stream.F
                            @Override // j$.util.function.w
                            public final void accept(int i3) {
                                this.a.a.accept(i3);
                            }

                            @Override // j$.util.function.w
                            public j$.util.function.w l(j$.util.function.w wVar) {
                                Objects.requireNonNull(wVar);
                                return new C0279g(this, wVar);
                            }
                        });
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

            @Override // j$.util.stream.A2.b, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(-1L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(AbstractC0384z1 abstractC0384z1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.x xVar) {
            super(abstractC0313h1, u2, i2);
            this.f16414l = xVar;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.z1$h */
    class h extends k<Integer> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ j$.util.function.y f16416l;

        /* renamed from: j$.util.stream.z1$h$a */
        class a extends A2.b<Integer> {
            a(A2 a2) {
                super(a2);
            }

            @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
            public void accept(int i2) {
                if (((j$.V) h.this.f16416l).b(i2)) {
                    this.a.accept(i2);
                }
            }

            @Override // j$.util.stream.A2.b, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(-1L);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(AbstractC0384z1 abstractC0384z1, AbstractC0313h1 abstractC0313h1, U2 u2, int i2, j$.util.function.y yVar) {
            super(abstractC0313h1, u2, i2);
            this.f16416l = yVar;
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }
    }

    /* renamed from: j$.util.stream.z1$i */
    static class i<E_IN> extends AbstractC0384z1<E_IN> {
        i(Spliterator spliterator, int i2, boolean z) {
            super(spliterator, i2, z);
        }

        @Override // j$.util.stream.AbstractC0384z1, j$.util.stream.C1
        public void E(j$.util.function.w wVar) {
            if (!isParallel()) {
                AbstractC0384z1.L0(I0()).d(wVar);
            } else {
                Objects.requireNonNull(wVar);
                w0(new AbstractC0372w1.b(wVar, true));
            }
        }

        @Override // j$.util.stream.AbstractC0313h1
        final boolean F0() {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.stream.AbstractC0313h1
        final A2 G0(int i2, A2 a2) {
            throw new UnsupportedOperationException();
        }

        @Override // j$.util.stream.AbstractC0384z1, j$.util.stream.C1
        public void Q(j$.util.function.w wVar) {
            if (isParallel()) {
                super.Q(wVar);
            } else {
                AbstractC0384z1.L0(I0()).d(wVar);
            }
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ C1 parallel() {
            parallel();
            return this;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ C1 sequential() {
            sequential();
            return this;
        }
    }

    /* renamed from: j$.util.stream.z1$j */
    static abstract class j<E_IN> extends AbstractC0384z1<E_IN> {
        j(AbstractC0313h1 abstractC0313h1, U2 u2, int i2) {
            super(abstractC0313h1, i2);
        }

        @Override // j$.util.stream.AbstractC0313h1
        final boolean F0() {
            return true;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ C1 parallel() {
            parallel();
            return this;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ C1 sequential() {
            sequential();
            return this;
        }
    }

    /* renamed from: j$.util.stream.z1$k */
    static abstract class k<E_IN> extends AbstractC0384z1<E_IN> {
        k(AbstractC0313h1 abstractC0313h1, U2 u2, int i2) {
            super(abstractC0313h1, i2);
        }

        @Override // j$.util.stream.AbstractC0313h1
        final boolean F0() {
            return false;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ C1 parallel() {
            parallel();
            return this;
        }

        @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
        public /* bridge */ /* synthetic */ C1 sequential() {
            sequential();
            return this;
        }
    }

    AbstractC0384z1(Spliterator spliterator, int i2, boolean z) {
        super(spliterator, i2, z);
    }

    AbstractC0384z1(AbstractC0313h1 abstractC0313h1, int i2) {
        super(abstractC0313h1, i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static Spliterator.b L0(Spliterator spliterator) {
        if (spliterator instanceof Spliterator.b) {
            return (Spliterator.b) spliterator;
        }
        if (!i3.a) {
            throw new UnsupportedOperationException("IntStream.adapt(Spliterator<Integer> s)");
        }
        i3.a(AbstractC0313h1.class, "using IntStream.adapt(Spliterator<Integer> s)");
        throw null;
    }

    @Override // j$.util.stream.AbstractC0313h1
    final U2 A0() {
        return U2.INT_VALUE;
    }

    @Override // j$.util.stream.C1
    public void E(j$.util.function.w wVar) {
        Objects.requireNonNull(wVar);
        w0(new AbstractC0372w1.b(wVar, true));
    }

    @Override // j$.util.stream.C1
    public final Stream F(j$.util.function.x xVar) {
        Objects.requireNonNull(xVar);
        return new e(this, this, U2.INT_VALUE, T2.f16225k | T2.f16223i, xVar);
    }

    @Override // j$.util.stream.AbstractC0313h1
    final Spliterator J0(T1 t1, j$.util.function.J j2, boolean z) {
        return new a3(t1, j2, z);
    }

    @Override // j$.util.stream.C1
    public final int K(int i2, j$.util.function.v vVar) {
        Objects.requireNonNull(vVar);
        return ((Integer) w0(new C0326k2(U2.INT_VALUE, vVar, i2))).intValue();
    }

    @Override // j$.util.stream.C1
    public final boolean L(j$.util.function.y yVar) {
        return ((Boolean) w0(Q1.s(yVar, N1.ALL))).booleanValue();
    }

    @Override // j$.util.stream.C1
    public final C1 M(j$.util.function.x xVar) {
        return new g(this, this, U2.INT_VALUE, T2.f16225k | T2.f16223i | T2.o, xVar);
    }

    @Override // j$.util.stream.C1
    public void Q(j$.util.function.w wVar) {
        Objects.requireNonNull(wVar);
        w0(new AbstractC0372w1.b(wVar, false));
    }

    @Override // j$.util.stream.C1
    public final boolean R(j$.util.function.y yVar) {
        return ((Boolean) w0(Q1.s(yVar, N1.NONE))).booleanValue();
    }

    @Override // j$.util.stream.C1
    public final C1 X(j$.util.function.y yVar) {
        Objects.requireNonNull(yVar);
        return new h(this, this, U2.INT_VALUE, T2.o, yVar);
    }

    @Override // j$.util.stream.C1
    public final j$.util.q Z(j$.util.function.v vVar) {
        Objects.requireNonNull(vVar);
        return (j$.util.q) w0(new C0334m2(U2.INT_VALUE, vVar));
    }

    @Override // j$.util.stream.C1
    public final C1 a0(j$.util.function.w wVar) {
        Objects.requireNonNull(wVar);
        return new b(this, this, U2.INT_VALUE, 0, wVar);
    }

    @Override // j$.util.stream.C1
    public final InterfaceC0356s1 asDoubleStream() {
        return new c(this, this, U2.INT_VALUE, T2.f16225k | T2.f16223i);
    }

    @Override // j$.util.stream.C1
    public final H1 asLongStream() {
        return new a(this, this, U2.INT_VALUE, T2.f16225k | T2.f16223i);
    }

    @Override // j$.util.stream.C1
    public final j$.util.p average() {
        return ((long[]) j0(new j$.util.function.J() { // from class: j$.util.stream.E
            @Override // j$.util.function.J
            public final Object get() {
                return new long[2];
            }
        }, new j$.util.function.H() { // from class: j$.util.stream.M
            @Override // j$.util.function.H
            public final void accept(Object obj, int i2) {
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i2;
            }
        }, new BiConsumer() { // from class: j$.util.stream.K
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

    @Override // j$.util.stream.C1
    public final boolean b(j$.util.function.y yVar) {
        return ((Boolean) w0(Q1.s(yVar, N1.ANY))).booleanValue();
    }

    @Override // j$.util.stream.C1
    public final Stream boxed() {
        return F(C0295d.a);
    }

    @Override // j$.util.stream.C1
    public final long count() {
        return ((D1) h(new j$.util.function.z() { // from class: j$.util.stream.I
            @Override // j$.util.function.z
            public final long applyAsLong(int i2) {
                return 1L;
            }
        })).sum();
    }

    @Override // j$.util.stream.C1
    public final C1 distinct() {
        return ((AbstractC0381y2) F(C0295d.a)).distinct().m(new ToIntFunction() { // from class: j$.util.stream.J
            @Override // j$.util.function.ToIntFunction
            public final int applyAsInt(Object obj) {
                return ((Integer) obj).intValue();
            }
        });
    }

    @Override // j$.util.stream.C1
    public final j$.util.q findAny() {
        return (j$.util.q) w0(new C0360t1(false, U2.INT_VALUE, j$.util.q.a(), R0.a, Y.a));
    }

    @Override // j$.util.stream.C1
    public final j$.util.q findFirst() {
        return (j$.util.q) w0(new C0360t1(true, U2.INT_VALUE, j$.util.q.a(), R0.a, Y.a));
    }

    @Override // j$.util.stream.C1
    public final H1 h(j$.util.function.z zVar) {
        Objects.requireNonNull(zVar);
        return new f(this, this, U2.INT_VALUE, T2.f16225k | T2.f16223i, zVar);
    }

    @Override // j$.util.stream.C1
    public final InterfaceC0356s1 i0(j$.X x) {
        Objects.requireNonNull(x);
        return new A1(this, this, U2.INT_VALUE, T2.f16225k | T2.f16223i, x);
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public final t.b iterator() {
        return j$.util.v.g(spliterator());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public Iterator iterator() {
        return j$.util.v.g(spliterator());
    }

    @Override // j$.util.stream.C1
    public final Object j0(j$.util.function.J j2, j$.util.function.H h2, final BiConsumer biConsumer) {
        j$.util.function.n nVar = new j$.util.function.n() { // from class: j$.util.stream.G
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
        Objects.requireNonNull(h2);
        return w0(new C0342o2(U2.INT_VALUE, nVar, h2, j2));
    }

    @Override // j$.util.stream.C1
    public final C1 limit(long j2) {
        if (j2 >= 0) {
            return B2.g(this, 0L, j2);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.C1
    public final j$.util.q max() {
        return Z(new j$.util.function.v() { // from class: j$.util.stream.Q0
            @Override // j$.util.function.v
            public final int applyAsInt(int i2, int i3) {
                return Math.max(i2, i3);
            }
        });
    }

    @Override // j$.util.stream.C1
    public final j$.util.q min() {
        return Z(new j$.util.function.v() { // from class: j$.util.stream.C
            @Override // j$.util.function.v
            public final int applyAsInt(int i2, int i3) {
                return Math.min(i2, i3);
            }
        });
    }

    @Override // j$.util.stream.T1
    final R1.a s0(long j2, j$.util.function.x xVar) {
        return S1.p(j2);
    }

    @Override // j$.util.stream.C1
    public final C1 skip(long j2) {
        if (j2 >= 0) {
            return j2 == 0 ? this : B2.g(this, j2, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j2));
    }

    @Override // j$.util.stream.C1
    public final C1 sorted() {
        return new K2(this);
    }

    @Override // j$.util.stream.AbstractC0313h1, j$.util.stream.InterfaceC0329l1
    public final Spliterator.b spliterator() {
        return L0(super.spliterator());
    }

    @Override // j$.util.stream.C1
    public final int sum() {
        return ((Integer) w0(new C0326k2(U2.INT_VALUE, new j$.util.function.v() { // from class: j$.util.stream.L
            @Override // j$.util.function.v
            public final int applyAsInt(int i2, int i3) {
                return i2 + i3;
            }
        }, 0))).intValue();
    }

    @Override // j$.util.stream.C1
    public final j$.util.m summaryStatistics() {
        return (j$.util.m) j0(new j$.util.function.J() { // from class: j$.util.stream.d1
            @Override // j$.util.function.J
            public final Object get() {
                return new j$.util.m();
            }
        }, new j$.util.function.H() { // from class: j$.util.stream.h
            @Override // j$.util.function.H
            public final void accept(Object obj, int i2) {
                ((j$.util.m) obj).accept(i2);
            }
        }, new BiConsumer() { // from class: j$.util.stream.a1
            @Override // j$.util.function.BiConsumer
            public BiConsumer a(BiConsumer biConsumer) {
                Objects.requireNonNull(biConsumer);
                return new C0273a(this, biConsumer);
            }

            @Override // j$.util.function.BiConsumer
            public final void accept(Object obj, Object obj2) {
                ((j$.util.m) obj).b((j$.util.m) obj2);
            }
        });
    }

    @Override // j$.util.stream.C1
    public final int[] toArray() {
        return (int[]) S1.n((R1.c) x0(new j$.util.function.x() { // from class: j$.util.stream.H
            @Override // j$.util.function.x
            public final Object apply(int i2) {
                return new Integer[i2];
            }
        })).g();
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public InterfaceC0329l1 unordered() {
        return !B0() ? this : new B1(this, this, U2.INT_VALUE, T2.f16227m);
    }

    @Override // j$.util.stream.C1
    public final C1 y(j$.util.function.A a2) {
        Objects.requireNonNull(a2);
        return new d(this, this, U2.INT_VALUE, T2.f16225k | T2.f16223i, a2);
    }

    @Override // j$.util.stream.AbstractC0313h1
    final R1 y0(T1 t1, Spliterator spliterator, boolean z, j$.util.function.x xVar) {
        return S1.g(t1, spliterator, z);
    }

    @Override // j$.util.stream.AbstractC0313h1
    final void z0(Spliterator spliterator, A2 a2) {
        j$.util.function.w c0291c;
        Spliterator.b bVarL0 = L0(spliterator);
        if (a2 instanceof j$.util.function.w) {
            c0291c = (j$.util.function.w) a2;
        } else {
            if (i3.a) {
                i3.a(AbstractC0313h1.class, "using IntStream.adapt(Sink<Integer> s)");
                throw null;
            }
            c0291c = new C0291c(a2);
        }
        while (!a2.o() && bVarL0.j(c0291c)) {
        }
    }
}