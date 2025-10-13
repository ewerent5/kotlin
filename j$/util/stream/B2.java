package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.A2;
import j$.util.stream.AbstractC0345p1;
import j$.util.stream.AbstractC0381y2;
import j$.util.stream.AbstractC0384z1;
import j$.util.stream.D1;
import j$.util.stream.R1;
import j$.util.stream.c3;
import j$.util.stream.d3;

/* loaded from: classes2.dex */
final class B2 {

    /* JADX INFO: Add missing generic type declarations: [T] */
    class a<T> extends AbstractC0381y2.l<T, T> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f16092l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f16093m;

        /* renamed from: j$.util.stream.B2$a$a, reason: collision with other inner class name */
        class C0204a extends A2.d<T, T> {

            /* renamed from: b, reason: collision with root package name */
            long f16094b;

            /* renamed from: c, reason: collision with root package name */
            long f16095c;

            C0204a(A2 a2) {
                super(a2);
                this.f16094b = a.this.f16092l;
                long j2 = a.this.f16093m;
                this.f16095c = j2 < 0 ? Long.MAX_VALUE : j2;
            }

            @Override // j$.util.function.Consumer
            public void accept(Object obj) {
                long j2 = this.f16094b;
                if (j2 != 0) {
                    this.f16094b = j2 - 1;
                    return;
                }
                long j3 = this.f16095c;
                if (j3 > 0) {
                    this.f16095c = j3 - 1;
                    this.a.accept(obj);
                }
            }

            @Override // j$.util.stream.A2.d, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(B2.c(j2, a.this.f16092l, this.f16095c));
            }

            @Override // j$.util.stream.A2.d, j$.util.stream.A2
            public boolean o() {
                return this.f16095c == 0 || this.a.o();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(AbstractC0313h1 abstractC0313h1, U2 u2, int i2, long j2, long j3) {
            super(abstractC0313h1, u2, i2);
            this.f16092l = j2;
            this.f16093m = j3;
        }

        @Override // j$.util.stream.AbstractC0313h1
        R1 D0(T1 t1, Spliterator spliterator, j$.util.function.x xVar) {
            long jP0 = t1.p0(spliterator);
            return (jP0 <= 0 || !spliterator.hasCharacteristics(16384)) ? !T2.ORDERED.n(t1.r0()) ? S1.e(this, K0(t1.v0(spliterator), this.f16092l, this.f16093m, jP0), true, xVar) : new e(this, t1, spliterator, xVar, this.f16092l, this.f16093m).invoke() : S1.e(t1, B2.b(t1.q0(), spliterator, this.f16092l, this.f16093m), true, xVar);
        }

        @Override // j$.util.stream.AbstractC0313h1
        Spliterator E0(T1 t1, Spliterator spliterator) {
            long jP0 = t1.p0(spliterator);
            if (jP0 > 0 && spliterator.hasCharacteristics(16384)) {
                Spliterator spliteratorV0 = t1.v0(spliterator);
                long j2 = this.f16092l;
                return new c3.e(spliteratorV0, j2, B2.d(j2, this.f16093m));
            }
            return !T2.ORDERED.n(t1.r0()) ? K0(t1.v0(spliterator), this.f16092l, this.f16093m, jP0) : new e(this, t1, spliterator, new j$.util.function.x() { // from class: j$.util.stream.u0
                @Override // j$.util.function.x
                public final Object apply(int i2) {
                    return new Object[i2];
                }
            }, this.f16092l, this.f16093m).invoke().spliterator();
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new C0204a(a2);
        }

        Spliterator K0(Spliterator spliterator, long j2, long j3, long j4) {
            long j5;
            long jMin;
            if (j2 <= j4) {
                long j6 = j4 - j2;
                jMin = j3 >= 0 ? Math.min(j3, j6) : j6;
                j5 = 0;
            } else {
                j5 = j2;
                jMin = j3;
            }
            return new d3.e(spliterator, j5, jMin);
        }
    }

    class b extends AbstractC0384z1.j<Integer> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f16097l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f16098m;

        class a extends A2.b<Integer> {

            /* renamed from: b, reason: collision with root package name */
            long f16099b;

            /* renamed from: c, reason: collision with root package name */
            long f16100c;

            a(A2 a2) {
                super(a2);
                this.f16099b = b.this.f16097l;
                long j2 = b.this.f16098m;
                this.f16100c = j2 < 0 ? Long.MAX_VALUE : j2;
            }

            @Override // j$.util.stream.A2.f, j$.util.stream.A2, j$.util.function.w
            public void accept(int i2) {
                long j2 = this.f16099b;
                if (j2 != 0) {
                    this.f16099b = j2 - 1;
                    return;
                }
                long j3 = this.f16100c;
                if (j3 > 0) {
                    this.f16100c = j3 - 1;
                    this.a.accept(i2);
                }
            }

            @Override // j$.util.stream.A2.b, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(B2.c(j2, b.this.f16097l, this.f16100c));
            }

            @Override // j$.util.stream.A2.b, j$.util.stream.A2
            public boolean o() {
                return this.f16100c == 0 || this.a.o();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(AbstractC0313h1 abstractC0313h1, U2 u2, int i2, long j2, long j3) {
            super(abstractC0313h1, u2, i2);
            this.f16097l = j2;
            this.f16098m = j3;
        }

        @Override // j$.util.stream.AbstractC0313h1
        R1 D0(T1 t1, Spliterator spliterator, j$.util.function.x xVar) {
            long jP0 = t1.p0(spliterator);
            return (jP0 <= 0 || !spliterator.hasCharacteristics(16384)) ? !T2.ORDERED.n(t1.r0()) ? S1.g(this, M0((Spliterator.b) t1.v0(spliterator), this.f16097l, this.f16098m, jP0), true) : new e(this, t1, spliterator, xVar, this.f16097l, this.f16098m).invoke() : S1.g(t1, B2.b(t1.q0(), spliterator, this.f16097l, this.f16098m), true);
        }

        @Override // j$.util.stream.AbstractC0313h1
        Spliterator E0(T1 t1, Spliterator spliterator) {
            long jP0 = t1.p0(spliterator);
            if (jP0 > 0 && spliterator.hasCharacteristics(16384)) {
                Spliterator.b bVar = (Spliterator.b) t1.v0(spliterator);
                long j2 = this.f16097l;
                return new c3.b(bVar, j2, B2.d(j2, this.f16098m));
            }
            return !T2.ORDERED.n(t1.r0()) ? M0((Spliterator.b) t1.v0(spliterator), this.f16097l, this.f16098m, jP0) : new e(this, t1, spliterator, new j$.util.function.x() { // from class: j$.util.stream.t0
                @Override // j$.util.function.x
                public final Object apply(int i2) {
                    return new Integer[i2];
                }
            }, this.f16097l, this.f16098m).invoke().spliterator();
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }

        Spliterator.b M0(Spliterator.b bVar, long j2, long j3, long j4) {
            long j5;
            long jMin;
            if (j2 <= j4) {
                long j6 = j4 - j2;
                jMin = j3 >= 0 ? Math.min(j3, j6) : j6;
                j5 = 0;
            } else {
                j5 = j2;
                jMin = j3;
            }
            return new d3.b(bVar, j5, jMin);
        }
    }

    class c extends D1.h<Long> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f16102l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f16103m;

        class a extends A2.c<Long> {

            /* renamed from: b, reason: collision with root package name */
            long f16104b;

            /* renamed from: c, reason: collision with root package name */
            long f16105c;

            a(A2 a2) {
                super(a2);
                this.f16104b = c.this.f16102l;
                long j2 = c.this.f16103m;
                this.f16105c = j2 < 0 ? Long.MAX_VALUE : j2;
            }

            @Override // j$.util.stream.A2.g, j$.util.stream.A2
            public void accept(long j2) {
                long j3 = this.f16104b;
                if (j3 != 0) {
                    this.f16104b = j3 - 1;
                    return;
                }
                long j4 = this.f16105c;
                if (j4 > 0) {
                    this.f16105c = j4 - 1;
                    this.a.accept(j2);
                }
            }

            @Override // j$.util.stream.A2.c, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(B2.c(j2, c.this.f16102l, this.f16105c));
            }

            @Override // j$.util.stream.A2.c, j$.util.stream.A2
            public boolean o() {
                return this.f16105c == 0 || this.a.o();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(AbstractC0313h1 abstractC0313h1, U2 u2, int i2, long j2, long j3) {
            super(abstractC0313h1, u2, i2);
            this.f16102l = j2;
            this.f16103m = j3;
        }

        @Override // j$.util.stream.AbstractC0313h1
        R1 D0(T1 t1, Spliterator spliterator, j$.util.function.x xVar) {
            long jP0 = t1.p0(spliterator);
            return (jP0 <= 0 || !spliterator.hasCharacteristics(16384)) ? !T2.ORDERED.n(t1.r0()) ? S1.h(this, M0((Spliterator.c) t1.v0(spliterator), this.f16102l, this.f16103m, jP0), true) : new e(this, t1, spliterator, xVar, this.f16102l, this.f16103m).invoke() : S1.h(t1, B2.b(t1.q0(), spliterator, this.f16102l, this.f16103m), true);
        }

        @Override // j$.util.stream.AbstractC0313h1
        Spliterator E0(T1 t1, Spliterator spliterator) {
            long jP0 = t1.p0(spliterator);
            if (jP0 > 0 && spliterator.hasCharacteristics(16384)) {
                Spliterator.c cVar = (Spliterator.c) t1.v0(spliterator);
                long j2 = this.f16102l;
                return new c3.c(cVar, j2, B2.d(j2, this.f16103m));
            }
            return !T2.ORDERED.n(t1.r0()) ? M0((Spliterator.c) t1.v0(spliterator), this.f16102l, this.f16103m, jP0) : new e(this, t1, spliterator, new j$.util.function.x() { // from class: j$.util.stream.v0
                @Override // j$.util.function.x
                public final Object apply(int i2) {
                    return new Long[i2];
                }
            }, this.f16102l, this.f16103m).invoke().spliterator();
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }

        Spliterator.c M0(Spliterator.c cVar, long j2, long j3, long j4) {
            long j5;
            long jMin;
            if (j2 <= j4) {
                long j6 = j4 - j2;
                jMin = j3 >= 0 ? Math.min(j3, j6) : j6;
                j5 = 0;
            } else {
                j5 = j2;
                jMin = j3;
            }
            return new d3.c(cVar, j5, jMin);
        }
    }

    class d extends AbstractC0345p1.h<Double> {

        /* renamed from: l, reason: collision with root package name */
        final /* synthetic */ long f16107l;

        /* renamed from: m, reason: collision with root package name */
        final /* synthetic */ long f16108m;

        class a extends A2.a<Double> {

            /* renamed from: b, reason: collision with root package name */
            long f16109b;

            /* renamed from: c, reason: collision with root package name */
            long f16110c;

            a(A2 a2) {
                super(a2);
                this.f16109b = d.this.f16107l;
                long j2 = d.this.f16108m;
                this.f16110c = j2 < 0 ? Long.MAX_VALUE : j2;
            }

            @Override // j$.util.stream.A2.e, j$.util.stream.A2
            public void accept(double d2) {
                long j2 = this.f16109b;
                if (j2 != 0) {
                    this.f16109b = j2 - 1;
                    return;
                }
                long j3 = this.f16110c;
                if (j3 > 0) {
                    this.f16110c = j3 - 1;
                    this.a.accept(d2);
                }
            }

            @Override // j$.util.stream.A2.a, j$.util.stream.A2
            public void n(long j2) {
                this.a.n(B2.c(j2, d.this.f16107l, this.f16110c));
            }

            @Override // j$.util.stream.A2.a, j$.util.stream.A2
            public boolean o() {
                return this.f16110c == 0 || this.a.o();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(AbstractC0313h1 abstractC0313h1, U2 u2, int i2, long j2, long j3) {
            super(abstractC0313h1, u2, i2);
            this.f16107l = j2;
            this.f16108m = j3;
        }

        @Override // j$.util.stream.AbstractC0313h1
        R1 D0(T1 t1, Spliterator spliterator, j$.util.function.x xVar) {
            long jP0 = t1.p0(spliterator);
            return (jP0 <= 0 || !spliterator.hasCharacteristics(16384)) ? !T2.ORDERED.n(t1.r0()) ? S1.f(this, M0((Spliterator.a) t1.v0(spliterator), this.f16107l, this.f16108m, jP0), true) : new e(this, t1, spliterator, xVar, this.f16107l, this.f16108m).invoke() : S1.f(t1, B2.b(t1.q0(), spliterator, this.f16107l, this.f16108m), true);
        }

        @Override // j$.util.stream.AbstractC0313h1
        Spliterator E0(T1 t1, Spliterator spliterator) {
            long jP0 = t1.p0(spliterator);
            if (jP0 > 0 && spliterator.hasCharacteristics(16384)) {
                Spliterator.a aVar = (Spliterator.a) t1.v0(spliterator);
                long j2 = this.f16107l;
                return new c3.a(aVar, j2, B2.d(j2, this.f16108m));
            }
            return !T2.ORDERED.n(t1.r0()) ? M0((Spliterator.a) t1.v0(spliterator), this.f16107l, this.f16108m, jP0) : new e(this, t1, spliterator, new j$.util.function.x() { // from class: j$.util.stream.w0
                @Override // j$.util.function.x
                public final Object apply(int i2) {
                    return new Double[i2];
                }
            }, this.f16107l, this.f16108m).invoke().spliterator();
        }

        @Override // j$.util.stream.AbstractC0313h1
        A2 G0(int i2, A2 a2) {
            return new a(a2);
        }

        Spliterator.a M0(Spliterator.a aVar, long j2, long j3, long j4) {
            long j5;
            long jMin;
            if (j2 <= j4) {
                long j6 = j4 - j2;
                jMin = j3 >= 0 ? Math.min(j3, j6) : j6;
                j5 = 0;
            } else {
                j5 = j2;
                jMin = j3;
            }
            return new d3.a(aVar, j5, jMin);
        }
    }

    private static final class e<P_IN, P_OUT> extends AbstractC0317i1<P_IN, P_OUT, R1<P_OUT>, e<P_IN, P_OUT>> {

        /* renamed from: j, reason: collision with root package name */
        private final AbstractC0313h1 f16112j;

        /* renamed from: k, reason: collision with root package name */
        private final j$.util.function.x f16113k;

        /* renamed from: l, reason: collision with root package name */
        private final long f16114l;

        /* renamed from: m, reason: collision with root package name */
        private final long f16115m;
        private long n;
        private volatile boolean o;

        e(e eVar, Spliterator spliterator) {
            super(eVar, spliterator);
            this.f16112j = eVar.f16112j;
            this.f16113k = eVar.f16113k;
            this.f16114l = eVar.f16114l;
            this.f16115m = eVar.f16115m;
        }

        e(AbstractC0313h1 abstractC0313h1, T1 t1, Spliterator spliterator, j$.util.function.x xVar, long j2, long j3) {
            super(t1, spliterator);
            this.f16112j = abstractC0313h1;
            this.f16113k = xVar;
            this.f16114l = j2;
            this.f16115m = j3;
        }

        private long m(long j2) {
            if (this.o) {
                return this.n;
            }
            e eVar = (e) this.f16319e;
            e eVar2 = (e) this.f16320f;
            if (eVar == null || eVar2 == null) {
                return this.n;
            }
            long jM = eVar.m(j2);
            return jM >= j2 ? jM : jM + eVar2.m(j2);
        }

        @Override // j$.util.stream.AbstractC0325k1
        protected Object a() {
            if (e()) {
                R1.a aVarS0 = this.f16112j.s0(T2.SIZED.t(this.f16112j.f16293c) ? this.f16112j.p0(this.f16317c) : -1L, this.f16113k);
                A2 a2G0 = this.f16112j.G0(this.f16316b.r0(), aVarS0);
                T1 t1 = this.f16316b;
                t1.n0(t1.u0(a2G0), this.f16317c);
                return aVarS0.a();
            }
            T1 t12 = this.f16316b;
            R1.a aVarS02 = t12.s0(-1L, this.f16113k);
            t12.t0(aVarS02, this.f16317c);
            R1 r1A = aVarS02.a();
            this.n = r1A.count();
            this.o = true;
            this.f16317c = null;
            return r1A;
        }

        @Override // j$.util.stream.AbstractC0325k1
        protected AbstractC0325k1 f(Spliterator spliterator) {
            return new e(this, spliterator);
        }

        @Override // j$.util.stream.AbstractC0317i1
        protected void i() {
            this.f16306i = true;
            if (this.o) {
                g(k());
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        @Override // j$.util.stream.AbstractC0317i1
        /* renamed from: n, reason: merged with bridge method [inline-methods] */
        public final R1 k() {
            return S1.k(this.f16112j.A0());
        }

        /* JADX WARN: Removed duplicated region for block: B:18:0x0065  */
        @Override // j$.util.stream.AbstractC0325k1, java.util.concurrent.CountedCompleter
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void onCompletion(java.util.concurrent.CountedCompleter r12) {
            /*
                Method dump skipped, instructions count: 228
                To view this dump change 'Code comments level' option to 'DEBUG'
            */
            throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.B2.e.onCompletion(java.util.concurrent.CountedCompleter):void");
        }
    }

    static Spliterator b(U2 u2, Spliterator spliterator, long j2, long j3) {
        long jD = d(j2, j3);
        int iOrdinal = u2.ordinal();
        if (iOrdinal == 0) {
            return new c3.e(spliterator, j2, jD);
        }
        if (iOrdinal == 1) {
            return new c3.b((Spliterator.b) spliterator, j2, jD);
        }
        if (iOrdinal == 2) {
            return new c3.c((Spliterator.c) spliterator, j2, jD);
        }
        if (iOrdinal == 3) {
            return new c3.a((Spliterator.a) spliterator, j2, jD);
        }
        throw new IllegalStateException("Unknown shape " + u2);
    }

    static long c(long j2, long j3, long j4) {
        if (j2 >= 0) {
            return Math.max(-1L, Math.min(j2 - j3, j4));
        }
        return -1L;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static long d(long j2, long j3) {
        long j4 = j3 >= 0 ? j2 + j3 : Long.MAX_VALUE;
        if (j4 >= 0) {
            return j4;
        }
        return Long.MAX_VALUE;
    }

    private static int e(long j2) {
        return (j2 != -1 ? T2.p : 0) | T2.o;
    }

    public static InterfaceC0356s1 f(AbstractC0313h1 abstractC0313h1, long j2, long j3) {
        if (j2 >= 0) {
            return new d(abstractC0313h1, U2.DOUBLE_VALUE, e(j3), j2, j3);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j2);
    }

    public static C1 g(AbstractC0313h1 abstractC0313h1, long j2, long j3) {
        if (j2 >= 0) {
            return new b(abstractC0313h1, U2.INT_VALUE, e(j3), j2, j3);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j2);
    }

    public static H1 h(AbstractC0313h1 abstractC0313h1, long j2, long j3) {
        if (j2 >= 0) {
            return new c(abstractC0313h1, U2.LONG_VALUE, e(j3), j2, j3);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j2);
    }

    public static Stream i(AbstractC0313h1 abstractC0313h1, long j2, long j3) {
        if (j2 >= 0) {
            return new a(abstractC0313h1, U2.REFERENCE, e(j3), j2, j3);
        }
        throw new IllegalArgumentException("Skip must be non-negative: " + j2);
    }
}