package j$;

import java.util.Comparator;
import java.util.Iterator;
import java.util.Optional;
import java.util.Spliterator;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;
import java.util.stream.BaseStream;
import java.util.stream.Collector;
import java.util.stream.DoubleStream;
import java.util.stream.IntStream;
import java.util.stream.LongStream;
import java.util.stream.Stream;

/* loaded from: classes2.dex */
public final /* synthetic */ class S0 implements Stream {
    final /* synthetic */ j$.util.stream.Stream a;

    private /* synthetic */ S0(j$.util.stream.Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ Stream m0(j$.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof R0 ? ((R0) stream).a : new S0(stream);
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.a.U(x0.c(predicate));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.a.a(x0.c(predicate));
    }

    @Override // java.util.stream.BaseStream, java.lang.AutoCloseable
    public /* synthetic */ void close() {
        this.a.close();
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.a.k(z0.a(supplier), C0266q.b(biConsumer), C0266q.b(biConsumer2));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Object collect(Collector collector) {
        return this.a.T(J0.a(collector));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Stream distinct() {
        return m0(this.a.distinct());
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Stream filter(Predicate predicate) {
        return m0(this.a.P(x0.c(predicate)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Optional findAny() {
        return j$.time.a.r(this.a.findAny());
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Optional findFirst() {
        return j$.time.a.r(this.a.findFirst());
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Stream flatMap(Function function) {
        return m0(this.a.p(M.c(function)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ DoubleStream flatMapToDouble(Function function) {
        return M0.m0(this.a.B(M.c(function)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ IntStream flatMapToInt(Function function) {
        return O0.m0(this.a.e(M.c(function)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ LongStream flatMapToLong(Function function) {
        return Q0.m0(this.a.V(M.c(function)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ void forEach(Consumer consumer) {
        this.a.forEach(C0387w.b(consumer));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.a.g(C0387w.b(consumer));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Stream limit(long j2) {
        return m0(this.a.limit(j2));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Stream map(Function function) {
        return m0(this.a.n(M.c(function)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ DoubleStream mapToDouble(ToDoubleFunction toDoubleFunction) {
        return M0.m0(this.a.h0(B0.a(toDoubleFunction)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return O0.m0(this.a.m(D0.a(toIntFunction)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ LongStream mapToLong(ToLongFunction toLongFunction) {
        return Q0.m0(this.a.e0(F0.a(toLongFunction)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Optional max(Comparator comparator) {
        return j$.time.a.r(this.a.max(comparator));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Optional min(Comparator comparator) {
        return j$.time.a.r(this.a.min(comparator));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.a.c0(x0.c(predicate));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream onClose(Runnable runnable) {
        return I0.m0(this.a.onClose(runnable));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream parallel() {
        return I0.m0(this.a.parallel());
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Stream peek(Consumer consumer) {
        return m0(this.a.S(C0387w.b(consumer)));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.a.z(obj, C0269s.b(biFunction), C0272u.b(binaryOperator));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.a.l0(obj, C0272u.b(binaryOperator));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Optional reduce(BinaryOperator binaryOperator) {
        return j$.time.a.r(this.a.s(C0272u.b(binaryOperator)));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream sequential() {
        return I0.m0(this.a.sequential());
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Stream skip(long j2) {
        return m0(this.a.skip(j2));
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Stream sorted() {
        return m0(this.a.sorted());
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Stream sorted(Comparator comparator) {
        return m0(this.a.sorted(comparator));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ Spliterator spliterator() {
        return C$r8$wrapper$java$util$Spliterator$WRP.convert(this.a.spliterator());
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Object[] toArray() {
        return this.a.toArray();
    }

    @Override // java.util.stream.Stream
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.a.toArray(T.a(intFunction));
    }

    @Override // java.util.stream.BaseStream
    public /* synthetic */ BaseStream unordered() {
        return I0.m0(this.a.unordered());
    }
}