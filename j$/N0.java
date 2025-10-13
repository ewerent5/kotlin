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
import java.util.stream.IntStream;

/* loaded from: classes2.dex */
public final /* synthetic */ class N0 implements C1 {
    final /* synthetic */ IntStream a;

    private /* synthetic */ N0(IntStream intStream) {
        this.a = intStream;
    }

    public static /* synthetic */ C1 m0(IntStream intStream) {
        if (intStream == null) {
            return null;
        }
        return intStream instanceof O0 ? ((O0) intStream).a : new N0(intStream);
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ void E(j$.util.function.w wVar) {
        this.a.forEachOrdered(S.a(wVar));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ Stream F(j$.util.function.x xVar) {
        return R0.m0(this.a.mapToObj(U.a(xVar)));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ int K(int i2, j$.util.function.v vVar) {
        return this.a.reduce(i2, P.a(vVar));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ boolean L(j$.util.function.y yVar) {
        return this.a.allMatch(W.a(yVar));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ C1 M(j$.util.function.x xVar) {
        return m0(this.a.flatMap(U.a(xVar)));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ void Q(j$.util.function.w wVar) {
        this.a.forEach(S.a(wVar));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ boolean R(j$.util.function.y yVar) {
        return this.a.noneMatch(W.a(yVar));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ C1 X(j$.util.function.y yVar) {
        return m0(this.a.filter(W.a(yVar)));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ j$.util.q Z(j$.util.function.v vVar) {
        return j$.time.a.p(this.a.reduce(P.a(vVar)));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ C1 a0(j$.util.function.w wVar) {
        return m0(this.a.peek(S.a(wVar)));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ InterfaceC0356s1 asDoubleStream() {
        return L0.m0(this.a.asDoubleStream());
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ H1 asLongStream() {
        return P0.m0(this.a.asLongStream());
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ j$.util.p average() {
        return j$.time.a.o(this.a.average());
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ boolean b(j$.util.function.y yVar) {
        return this.a.anyMatch(W.a(yVar));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ Stream boxed() {
        return R0.m0(this.a.boxed());
    }

    @Override // j$.util.stream.InterfaceC0329l1, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ C1 distinct() {
        return m0(this.a.distinct());
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ j$.util.q findAny() {
        return j$.time.a.p(this.a.findAny());
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ j$.util.q findFirst() {
        return j$.time.a.p(this.a.findFirst());
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ H1 h(j$.util.function.z zVar) {
        return P0.m0(this.a.mapToLong(C0235a0.a(zVar)));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ InterfaceC0356s1 i0(X x) {
        return L0.m0(this.a.mapToDouble(x == null ? null : x.a));
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.PrimitiveIterator$OfInt] */
    @Override // j$.util.stream.C1, j$.util.stream.InterfaceC0329l1
    public /* synthetic */ t.b iterator() {
        return C0240d.a(this.a.iterator());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ Object j0(j$.util.function.J j2, j$.util.function.H h2, BiConsumer biConsumer) {
        return this.a.collect(A0.a(j2), u0.a(h2), r.a(biConsumer));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ C1 limit(long j2) {
        return m0(this.a.limit(j2));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ j$.util.q max() {
        return j$.time.a.p(this.a.max());
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ j$.util.q min() {
        return j$.time.a.p(this.a.min());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 onClose(Runnable runnable) {
        return H0.m0(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.C1, j$.util.stream.InterfaceC0329l1
    public /* synthetic */ C1 parallel() {
        return m0(this.a.parallel());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 parallel() {
        return H0.m0(this.a.parallel());
    }

    @Override // j$.util.stream.C1, j$.util.stream.InterfaceC0329l1
    public /* synthetic */ C1 sequential() {
        return m0(this.a.sequential());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 sequential() {
        return H0.m0(this.a.sequential());
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ C1 skip(long j2) {
        return m0(this.a.skip(j2));
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ C1 sorted() {
        return m0(this.a.sorted());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.Spliterator$OfInt] */
    @Override // j$.util.stream.C1, j$.util.stream.InterfaceC0329l1
    public /* synthetic */ Spliterator.b spliterator() {
        return C0254k.a(this.a.spliterator());
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ Spliterator spliterator() {
        return C0248h.a(this.a.spliterator());
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ int sum() {
        return this.a.sum();
    }

    @Override // j$.util.stream.C1
    public j$.util.m summaryStatistics() {
        this.a.summaryStatistics();
        throw new Error("Java 8+ API desugaring (library desugaring) cannot convert from java.util.IntSummaryStatistics");
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ int[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 unordered() {
        return H0.m0(this.a.unordered());
    }

    @Override // j$.util.stream.C1
    public /* synthetic */ C1 y(j$.util.function.A a) {
        return m0(this.a.map(C0239c0.a(a)));
    }
}