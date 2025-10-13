package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.C0277e;
import j$.util.function.C0278f;
import j$.util.function.C0279g;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.A2;
import j$.util.stream.AbstractC0345p1;
import j$.util.stream.AbstractC0381y2;
import j$.util.stream.AbstractC0384z1;
import j$.util.stream.D1;
import j$.util.stream.R1;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class Q1 {
    public static void a(A2.e eVar, Double d2) {
        if (i3.a) {
            i3.a(eVar.getClass(), "{0} calling Sink.OfDouble.accept(Double)");
            throw null;
        }
        eVar.accept(d2.doubleValue());
    }

    public static void b(A2.f fVar, Integer num) {
        if (i3.a) {
            i3.a(fVar.getClass(), "{0} calling Sink.OfInt.accept(Integer)");
            throw null;
        }
        fVar.accept(num.intValue());
    }

    public static void c(A2.g gVar, Long l2) {
        if (i3.a) {
            i3.a(gVar.getClass(), "{0} calling Sink.OfLong.accept(Long)");
            throw null;
        }
        gVar.accept(l2.longValue());
    }

    public static Object[] d(R1.e eVar, j$.util.function.x xVar) {
        if (i3.a) {
            i3.a(eVar.getClass(), "{0} calling Node.OfPrimitive.asArray");
            throw null;
        }
        if (eVar.count() >= 2147483639) {
            throw new IllegalArgumentException("Stream size exceeds max array size");
        }
        Object[] objArr = (Object[]) xVar.apply((int) eVar.count());
        eVar.j(objArr, 0);
        return objArr;
    }

    public static void e(R1.b bVar, Double[] dArr, int i2) {
        if (i3.a) {
            i3.a(bVar.getClass(), "{0} calling Node.OfDouble.copyInto(Double[], int)");
            throw null;
        }
        double[] dArr2 = (double[]) bVar.g();
        for (int i3 = 0; i3 < dArr2.length; i3++) {
            dArr[i2 + i3] = Double.valueOf(dArr2[i3]);
        }
    }

    public static void f(R1.c cVar, Integer[] numArr, int i2) {
        if (i3.a) {
            i3.a(cVar.getClass(), "{0} calling Node.OfInt.copyInto(Integer[], int)");
            throw null;
        }
        int[] iArr = (int[]) cVar.g();
        for (int i3 = 0; i3 < iArr.length; i3++) {
            numArr[i2 + i3] = Integer.valueOf(iArr[i3]);
        }
    }

    public static void g(R1.d dVar, Long[] lArr, int i2) {
        if (i3.a) {
            i3.a(dVar.getClass(), "{0} calling Node.OfInt.copyInto(Long[], int)");
            throw null;
        }
        long[] jArr = (long[]) dVar.g();
        for (int i3 = 0; i3 < jArr.length; i3++) {
            lArr[i2 + i3] = Long.valueOf(jArr[i3]);
        }
    }

    public static void h(R1.b bVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.q) {
            bVar.h((j$.util.function.q) consumer);
        } else {
            if (i3.a) {
                i3.a(bVar.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.a) bVar.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void i(R1.c cVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.w) {
            cVar.h((j$.util.function.w) consumer);
        } else {
            if (i3.a) {
                i3.a(cVar.getClass(), "{0} calling Node.OfInt.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.b) cVar.spliterator()).forEachRemaining(consumer);
        }
    }

    public static void j(R1.d dVar, Consumer consumer) {
        if (consumer instanceof j$.util.function.C) {
            dVar.h((j$.util.function.C) consumer);
        } else {
            if (i3.a) {
                i3.a(dVar.getClass(), "{0} calling Node.OfLong.forEachRemaining(Consumer)");
                throw null;
            }
            ((Spliterator.c) dVar.spliterator()).forEachRemaining(consumer);
        }
    }

    public static R1.b k(R1.b bVar, long j2, long j3, j$.util.function.x xVar) {
        if (j2 == 0 && j3 == bVar.count()) {
            return bVar;
        }
        long j4 = j3 - j2;
        Spliterator.a aVar = (Spliterator.a) bVar.spliterator();
        R1.a.InterfaceC0206a interfaceC0206aJ = S1.j(j4);
        interfaceC0206aJ.n(j4);
        for (int i2 = 0; i2 < j2 && aVar.j(new j$.util.function.q() { // from class: j$.util.stream.i0
            @Override // j$.util.function.q
            public final void accept(double d2) {
            }

            @Override // j$.util.function.q
            public j$.util.function.q k(j$.util.function.q qVar) {
                Objects.requireNonNull(qVar);
                return new C0278f(this, qVar);
            }
        }); i2++) {
        }
        for (int i3 = 0; i3 < j4 && aVar.j(interfaceC0206aJ); i3++) {
        }
        interfaceC0206aJ.m();
        return interfaceC0206aJ.a();
    }

    public static R1.c l(R1.c cVar, long j2, long j3, j$.util.function.x xVar) {
        if (j2 == 0 && j3 == cVar.count()) {
            return cVar;
        }
        long j4 = j3 - j2;
        Spliterator.b bVar = (Spliterator.b) cVar.spliterator();
        R1.a.b bVarP = S1.p(j4);
        bVarP.n(j4);
        for (int i2 = 0; i2 < j2 && bVar.j(new j$.util.function.w() { // from class: j$.util.stream.j0
            @Override // j$.util.function.w
            public final void accept(int i3) {
            }

            @Override // j$.util.function.w
            public j$.util.function.w l(j$.util.function.w wVar) {
                Objects.requireNonNull(wVar);
                return new C0279g(this, wVar);
            }
        }); i2++) {
        }
        for (int i3 = 0; i3 < j4 && bVar.j(bVarP); i3++) {
        }
        bVarP.m();
        return bVarP.a();
    }

    public static R1.d m(R1.d dVar, long j2, long j3, j$.util.function.x xVar) {
        if (j2 == 0 && j3 == dVar.count()) {
            return dVar;
        }
        long j4 = j3 - j2;
        Spliterator.c cVar = (Spliterator.c) dVar.spliterator();
        R1.a.c cVarQ = S1.q(j4);
        cVarQ.n(j4);
        for (int i2 = 0; i2 < j2 && cVar.j(new j$.util.function.C() { // from class: j$.util.stream.k0
            @Override // j$.util.function.C
            public final void accept(long j5) {
            }

            @Override // j$.util.function.C
            public j$.util.function.C f(j$.util.function.C c2) {
                Objects.requireNonNull(c2);
                return new C0280h(this, c2);
            }
        }); i2++) {
        }
        for (int i3 = 0; i3 < j4 && cVar.j(cVarQ); i3++) {
        }
        cVarQ.m();
        return cVarQ.a();
    }

    public static R1 n(R1 r1, long j2, long j3, j$.util.function.x xVar) {
        if (j2 == 0 && j3 == r1.count()) {
            return r1;
        }
        Spliterator spliterator = r1.spliterator();
        long j4 = j3 - j2;
        R1.a aVarD = S1.d(j4, xVar);
        aVarD.n(j4);
        for (int i2 = 0; i2 < j2 && spliterator.tryAdvance(new Consumer() { // from class: j$.util.stream.h0
            @Override // j$.util.function.Consumer
            public final void accept(Object obj) {
            }

            @Override // j$.util.function.Consumer
            public Consumer e(Consumer consumer) {
                Objects.requireNonNull(consumer);
                return new C0277e(this, consumer);
            }
        }); i2++) {
        }
        for (int i3 = 0; i3 < j4 && spliterator.tryAdvance(aVarD); i3++) {
        }
        aVarD.m();
        return aVarD.a();
    }

    public static InterfaceC0356s1 o(Spliterator.a aVar, boolean z) {
        return new AbstractC0345p1.g(aVar, T2.l(aVar), z);
    }

    public static C1 p(Spliterator.b bVar, boolean z) {
        return new AbstractC0384z1.i(bVar, T2.l(bVar), z);
    }

    public static H1 q(Spliterator.c cVar, boolean z) {
        return new D1.g(cVar, T2.l(cVar), z);
    }

    public static g3 r(final j$.util.function.s sVar, final N1 n1) {
        Objects.requireNonNull(sVar);
        Objects.requireNonNull(n1);
        return new O1(U2.DOUBLE_VALUE, n1, new j$.util.function.J() { // from class: j$.util.stream.c0
            @Override // j$.util.function.J
            public final Object get() {
                return new L1(n1, sVar);
            }
        });
    }

    public static g3 s(final j$.util.function.y yVar, final N1 n1) {
        Objects.requireNonNull(yVar);
        Objects.requireNonNull(n1);
        return new O1(U2.INT_VALUE, n1, new j$.util.function.J() { // from class: j$.util.stream.e0
            @Override // j$.util.function.J
            public final Object get() {
                return new J1(n1, yVar);
            }
        });
    }

    public static g3 t(final j$.util.function.E e2, final N1 n1) {
        Objects.requireNonNull(e2);
        Objects.requireNonNull(n1);
        return new O1(U2.LONG_VALUE, n1, new j$.util.function.J() { // from class: j$.util.stream.f0
            @Override // j$.util.function.J
            public final Object get() {
                return new K1(n1, e2);
            }
        });
    }

    public static g3 u(final Predicate predicate, final N1 n1) {
        Objects.requireNonNull(predicate);
        Objects.requireNonNull(n1);
        return new O1(U2.REFERENCE, n1, new j$.util.function.J() { // from class: j$.util.stream.d0
            @Override // j$.util.function.J
            public final Object get() {
                return new I1(n1, predicate);
            }
        });
    }

    public static Stream v(Spliterator spliterator, boolean z) {
        Objects.requireNonNull(spliterator);
        return new AbstractC0381y2.k(spliterator, T2.l(spliterator), z);
    }
}