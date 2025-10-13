package j$;

import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.stream.C1;
import j$.util.stream.H1;
import j$.util.stream.InterfaceC0329l1;
import j$.util.stream.InterfaceC0356s1;
import j$.util.stream.Stream;
import j$.util.t;
import java.util.Iterator;
import java.util.stream.LongStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class P0 implements H1 {
    final /* synthetic */ LongStream a;

    private /* synthetic */ P0(LongStream longStream) {
        this.a = longStream;
    }

    public static /* synthetic */ H1 m0(LongStream longStream) {
        if (longStream == null) {
            return null;
        }
        return longStream instanceof Q0 ? ((Q0) longStream).a : new P0(longStream);
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ long A(long j2, j$.util.function.B b2) {
        return this.a.reduce(j2, C0243e0.a(b2));
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ Stream N(j$.util.function.D d2) {
        return R0.m0(this.a.mapToObj(C0251i0.a(d2)));
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ void Y(j$.util.function.C c2) {
        this.a.forEachOrdered(C0247g0.a(c2));
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ InterfaceC0356s1 asDoubleStream() {
        return L0.m0(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ j$.util.p average() {
        return j$.time.a.o(this.a.average());
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ boolean b0(j$.util.function.E e2) {
        return this.a.anyMatch(C0255k0.a(e2));
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ Stream boxed() {
        return R0.m0(this.a.boxed());
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ boolean c(j$.util.function.E e2) {
        return this.a.noneMatch(C0255k0.a(e2));
    }

    @Override // j$.util.stream.InterfaceC0329l1, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ Object d0(j$.util.function.J j2, j$.util.function.I i2, BiConsumer biConsumer) {
        return this.a.collect(A0.a(j2), w0.a(i2), r.a(biConsumer));
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ H1 distinct() {
        return m0(this.a.distinct());
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ void f(j$.util.function.C c2) {
        this.a.forEach(C0247g0.a(c2));
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ boolean f0(j$.util.function.E e2) {
        return this.a.allMatch(C0255k0.a(e2));
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ j$.util.r findAny() {
        return j$.time.a.q(this.a.findAny());
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ j$.util.r findFirst() {
        return j$.time.a.q(this.a.findFirst());
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ H1 g0(j$.util.function.E e2) {
        return m0(this.a.filter(C0255k0.a(e2)));
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ j$.util.r i(j$.util.function.B b2) {
        return j$.time.a.q(this.a.reduce(C0243e0.a(b2)));
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfLong] */
    @Override // j$.util.stream.H1, j$.util.stream.InterfaceC0329l1
    public /* synthetic */ t.c iterator() {
        return C0244f.a(this.a.iterator());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ InterfaceC0356s1 j(C0257l0 c0257l0) {
        return L0.m0(this.a.mapToDouble(c0257l0 == null ? null : c0257l0.a));
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ H1 limit(long j2) {
        return m0(this.a.limit(j2));
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ j$.util.r max() {
        return j$.time.a.q(this.a.max());
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ j$.util.r min() {
        return j$.time.a.q(this.a.min());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 onClose(Runnable runnable) {
        return H0.m0(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.H1, j$.util.stream.InterfaceC0329l1
    public /* synthetic */ H1 parallel() {
        return m0(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 parallel() {
        return H0.m0(this.a.parallel());
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ H1 q(j$.util.function.C c2) {
        return m0(this.a.peek(C0247g0.a(c2)));
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ H1 r(j$.util.function.D d2) {
        return m0(this.a.flatMap(C0251i0.a(d2)));
    }

    @Override // j$.util.stream.H1, j$.util.stream.InterfaceC0329l1
    public /* synthetic */ H1 sequential() {
        return m0(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 sequential() {
        return H0.m0(this.a.sequential());
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ H1 skip(long j2) {
        return m0(this.a.skip(j2));
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ H1 sorted() {
        return m0(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfLong] */
    @Override // j$.util.stream.H1, j$.util.stream.InterfaceC0329l1
    public /* synthetic */ Spliterator.c spliterator() {
        return C0258m.a(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ Spliterator spliterator() {
        return C0248h.a(this.a.spliterator());
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ long sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.H1
    public j$.util.n summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.LongSummaryStatistics");
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ long[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 unordered() {
        return H0.m0(this.a.unordered());
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ C1 w(C0261n0 c0261n0) {
        return N0.m0(this.a.mapToInt(c0261n0 == null ? null : c0261n0.a));
    }

    @Override // j$.util.stream.H1
    public /* synthetic */ H1 x(j$.util.function.F f2) {
        return m0(this.a.map(C0267q0.a(f2)));
    }
}