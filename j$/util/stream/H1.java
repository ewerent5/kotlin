package j$.util.stream;

import j$.C0257l0;
import j$.C0261n0;
import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.t;

/* loaded from: classes2.dex */
public interface H1 extends InterfaceC0329l1<Long, H1> {
    long A(long j2, j$.util.function.B b2);

    Stream N(j$.util.function.D d2);

    void Y(j$.util.function.C c2);

    InterfaceC0356s1 asDoubleStream();

    j$.util.p average();

    boolean b0(j$.util.function.E e2);

    Stream boxed();

    boolean c(j$.util.function.E e2);

    long count();

    Object d0(j$.util.function.J j2, j$.util.function.I i2, BiConsumer biConsumer);

    H1 distinct();

    void f(j$.util.function.C c2);

    boolean f0(j$.util.function.E e2);

    j$.util.r findAny();

    j$.util.r findFirst();

    H1 g0(j$.util.function.E e2);

    j$.util.r i(j$.util.function.B b2);

    @Override // j$.util.stream.InterfaceC0329l1
    t.c iterator();

    InterfaceC0356s1 j(C0257l0 c0257l0);

    H1 limit(long j2);

    j$.util.r max();

    j$.util.r min();

    @Override // j$.util.stream.InterfaceC0329l1
    H1 parallel();

    H1 q(j$.util.function.C c2);

    H1 r(j$.util.function.D d2);

    @Override // j$.util.stream.InterfaceC0329l1
    H1 sequential();

    H1 skip(long j2);

    H1 sorted();

    @Override // j$.util.stream.InterfaceC0329l1
    Spliterator.c spliterator();

    long sum();

    j$.util.n summaryStatistics();

    long[] toArray();

    C1 w(C0261n0 c0261n0);

    H1 x(j$.util.function.F f2);
}