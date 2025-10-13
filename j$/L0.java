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
import java.util.stream.DoubleStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class L0 implements InterfaceC0356s1 {
    final /* synthetic */ DoubleStream a;

    private /* synthetic */ L0(DoubleStream doubleStream) {
        this.a = doubleStream;
    }

    public static /* synthetic */ InterfaceC0356s1 m0(DoubleStream doubleStream) {
        if (doubleStream == null) {
            return null;
        }
        return doubleStream instanceof M0 ? ((M0) doubleStream).a : new L0(doubleStream);
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ j$.util.p C(j$.util.function.p pVar) {
        return j$.time.a.o(this.a.reduce(C0390z.a(pVar)));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ Object D(j$.util.function.J j2, j$.util.function.G g2, BiConsumer biConsumer) {
        return this.a.collect(A0.a(j2), C0270s0.a(g2), r.a(biConsumer));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ double G(double d2, j$.util.function.p pVar) {
        return this.a.reduce(d2, C0390z.a(pVar));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ InterfaceC0356s1 H(j$.util.function.u uVar) {
        return m0(this.a.map(L.a(uVar)));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ Stream I(j$.util.function.r rVar) {
        return R0.m0(this.a.mapToObj(D.a(rVar)));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ boolean J(j$.util.function.s sVar) {
        return this.a.noneMatch(F.a(sVar));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ boolean O(j$.util.function.s sVar) {
        return this.a.allMatch(F.a(sVar));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ boolean W(j$.util.function.s sVar) {
        return this.a.anyMatch(F.a(sVar));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ j$.util.p average() {
        return j$.time.a.o(this.a.average());
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ Stream boxed() {
        return R0.m0(this.a.boxed());
    }

    @Override // j$.util.stream.InterfaceC0329l1, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ InterfaceC0356s1 d(j$.util.function.q qVar) {
        return m0(this.a.peek(B.a(qVar)));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ InterfaceC0356s1 distinct() {
        return m0(this.a.distinct());
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ j$.util.p findAny() {
        return j$.time.a.o(this.a.findAny());
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ j$.util.p findFirst() {
        return j$.time.a.o(this.a.findFirst());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfDouble] */
    @Override // j$.util.stream.InterfaceC0356s1, j$.util.stream.InterfaceC0329l1
    public /* synthetic */ t.a iterator() {
        return C0236b.a(this.a.iterator());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ void k0(j$.util.function.q qVar) {
        this.a.forEachOrdered(B.a(qVar));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ void l(j$.util.function.q qVar) {
        this.a.forEach(B.a(qVar));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ InterfaceC0356s1 limit(long j2) {
        return m0(this.a.limit(j2));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ j$.util.p max() {
        return j$.time.a.o(this.a.max());
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ j$.util.p min() {
        return j$.time.a.o(this.a.min());
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ C1 o(G g2) {
        return N0.m0(this.a.mapToInt(g2 == null ? null : g2.a));
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 onClose(Runnable runnable) {
        return H0.m0(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 parallel() {
        return H0.m0(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC0356s1, j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0356s1 parallel() {
        return m0(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 sequential() {
        return H0.m0(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC0356s1, j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0356s1 sequential() {
        return m0(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ InterfaceC0356s1 skip(long j2) {
        return m0(this.a.skip(j2));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ InterfaceC0356s1 sorted() {
        return m0(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfDouble] */
    @Override // j$.util.stream.InterfaceC0356s1, j$.util.stream.InterfaceC0329l1
    public /* synthetic */ Spliterator.a spliterator() {
        return C0250i.a(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ Spliterator spliterator() {
        return C0248h.a(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ double sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public j$.util.l summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.DoubleSummaryStatistics");
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ InterfaceC0356s1 t(j$.util.function.s sVar) {
        return m0(this.a.filter(F.a(sVar)));
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ double[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ InterfaceC0356s1 u(j$.util.function.r rVar) {
        return m0(this.a.flatMap(D.a(rVar)));
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 unordered() {
        return H0.m0(this.a.unordered());
    }

    @Override // j$.util.stream.InterfaceC0356s1
    public /* synthetic */ H1 v(j$.util.function.t tVar) {
        return P0.m0(this.a.mapToLong(J.a(tVar)));
    }
}