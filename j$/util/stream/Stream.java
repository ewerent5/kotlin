package j$.util.stream;

import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Consumer;
import j$.util.function.Function;
import j$.util.function.Predicate;
import j$.util.function.ToDoubleFunction;
import j$.util.function.ToIntFunction;
import j$.util.function.ToLongFunction;
import java.util.Comparator;

/* loaded from: classes2.dex */
public interface Stream<T> extends InterfaceC0329l1<T, Stream<T>> {
    InterfaceC0356s1 B(Function function);

    Stream P(Predicate predicate);

    Stream S(Consumer consumer);

    Object T(InterfaceC0333m1 interfaceC0333m1);

    boolean U(Predicate predicate);

    H1 V(Function function);

    boolean a(Predicate predicate);

    boolean c0(Predicate predicate);

    long count();

    Stream distinct();

    C1 e(Function function);

    H1 e0(ToLongFunction toLongFunction);

    j$.util.o findAny();

    j$.util.o findFirst();

    void forEach(Consumer consumer);

    void g(Consumer consumer);

    InterfaceC0356s1 h0(ToDoubleFunction toDoubleFunction);

    Object k(j$.util.function.J j2, BiConsumer biConsumer, BiConsumer biConsumer2);

    Object l0(Object obj, j$.util.function.n nVar);

    Stream limit(long j2);

    C1 m(ToIntFunction toIntFunction);

    j$.util.o max(Comparator comparator);

    j$.util.o min(Comparator comparator);

    Stream n(Function function);

    Stream p(Function function);

    j$.util.o s(j$.util.function.n nVar);

    Stream skip(long j2);

    Stream sorted();

    Stream sorted(Comparator comparator);

    Object[] toArray();

    Object[] toArray(j$.util.function.x xVar);

    Object z(Object obj, BiFunction biFunction, j$.util.function.n nVar);
}