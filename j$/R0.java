package j$;

import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import j$.util.stream.C1;
import j$.util.stream.H1;
import j$.util.stream.InterfaceC0329l1;
import j$.util.stream.InterfaceC0333m1;
import j$.util.stream.InterfaceC0356s1;
import j$.util.stream.Stream;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: classes2.dex */
public final /* synthetic */ class R0 implements Stream {
    final /* synthetic */ java.util.stream.Stream a;

    private /* synthetic */ R0(java.util.stream.Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ Stream m0(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof S0 ? ((S0) stream).a : new R0(stream);
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ InterfaceC0356s1 B(Function function) {
        return L0.m0(this.a.flatMapToDouble(N.a(function)));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Stream P(Predicate predicate) {
        return m0(this.a.filter(y0.a(predicate)));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Stream S(Consumer consumer) {
        return m0(this.a.peek(C0388x.a(consumer)));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Object T(InterfaceC0333m1 interfaceC0333m1) {
        return this.a.collect(K0.a(interfaceC0333m1));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ boolean U(Predicate predicate) {
        return this.a.allMatch(y0.a(predicate));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ H1 V(Function function) {
        return P0.m0(this.a.flatMapToLong(N.a(function)));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ boolean a(Predicate predicate) {
        return this.a.anyMatch(y0.a(predicate));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ boolean c0(Predicate predicate) {
        return this.a.noneMatch(y0.a(predicate));
    }

    @Override // j$.util.stream.InterfaceC0329l1, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Stream distinct() {
        return m0(this.a.distinct());
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ C1 e(Function function) {
        return N0.m0(this.a.flatMapToInt(N.a(function)));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ H1 e0(ToLongFunction toLongFunction) {
        return P0.m0(this.a.mapToLong(G0.a(toLongFunction)));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ j$.util.o findAny() {
        return j$.time.a.n(this.a.findAny());
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ j$.util.o findFirst() {
        return j$.time.a.n(this.a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ void forEach(Consumer consumer) {
        this.a.forEach(C0388x.a(consumer));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ void g(Consumer consumer) {
        this.a.forEachOrdered(C0388x.a(consumer));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ InterfaceC0356s1 h0(ToDoubleFunction toDoubleFunction) {
        return L0.m0(this.a.mapToDouble(C0.a(toDoubleFunction)));
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Object k(j$.util.function.J j2, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.a.collect(A0.a(j2), r.a(biConsumer), r.a(biConsumer2));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Object l0(Object obj, j$.util.function.n nVar) {
        return this.a.reduce(obj, C0386v.a(nVar));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Stream limit(long j2) {
        return m0(this.a.limit(j2));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ C1 m(ToIntFunction toIntFunction) {
        return N0.m0(this.a.mapToInt(E0.a(toIntFunction)));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ j$.util.o max(Comparator comparator) {
        return j$.time.a.n(this.a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ j$.util.o min(Comparator comparator) {
        return j$.time.a.n(this.a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Stream n(Function function) {
        return m0(this.a.map(N.a(function)));
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 onClose(Runnable runnable) {
        return H0.m0(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Stream p(Function function) {
        return m0(this.a.flatMap(N.a(function)));
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 parallel() {
        return H0.m0(this.a.parallel());
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ j$.util.o s(j$.util.function.n nVar) {
        return j$.time.a.n(this.a.reduce(C0386v.a(nVar)));
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 sequential() {
        return H0.m0(this.a.sequential());
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Stream skip(long j2) {
        return m0(this.a.skip(j2));
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Stream sorted() {
        return m0(this.a.sorted());
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Stream sorted(Comparator comparator) {
        return m0(this.a.sorted(comparator));
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ Spliterator spliterator() {
        return C0248h.a(this.a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Object[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Object[] toArray(j$.util.function.x xVar) {
        return this.a.toArray(U.a(xVar));
    }

    @Override // j$.util.stream.InterfaceC0329l1
    public /* synthetic */ InterfaceC0329l1 unordered() {
        return H0.m0(this.a.unordered());
    }

    @Override // j$.util.stream.Stream
    public /* synthetic */ Object z(Object obj, BiFunction biFunction, j$.util.function.n nVar) {
        return this.a.reduce(obj, C0271t.a(biFunction), C0386v.a(nVar));
    }
}