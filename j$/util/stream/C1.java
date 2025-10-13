package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.t;

/* loaded from: classes2.dex */
public interface C1 extends InterfaceC0329l1<Integer, C1> {
    void E(j$.util.function.w wVar);

    Stream F(j$.util.function.x xVar);

    int K(int i2, j$.util.function.v vVar);

    boolean L(j$.util.function.y yVar);

    C1 M(j$.util.function.x xVar);

    void Q(j$.util.function.w wVar);

    boolean R(j$.util.function.y yVar);

    C1 X(j$.util.function.y yVar);

    j$.util.q Z(j$.util.function.v vVar);

    C1 a0(j$.util.function.w wVar);

    InterfaceC0356s1 asDoubleStream();

    H1 asLongStream();

    j$.util.p average();

    boolean b(j$.util.function.y yVar);

    Stream boxed();

    long count();

    C1 distinct();

    j$.util.q findAny();

    j$.util.q findFirst();

    H1 h(j$.util.function.z zVar);

    InterfaceC0356s1 i0(j$.X x);

    @Override // j$.util.stream.InterfaceC0329l1
    t.b iterator();

    Object j0(j$.util.function.J j2, j$.util.function.H h2, BiConsumer biConsumer);

    C1 limit(long j2);

    j$.util.q max();

    j$.util.q min();

    @Override // j$.util.stream.InterfaceC0329l1
    C1 parallel();

    @Override // j$.util.stream.InterfaceC0329l1
    C1 sequential();

    C1 skip(long j2);

    C1 sorted();

    @Override // j$.util.stream.InterfaceC0329l1
    Spliterator.b spliterator();

    int sum();

    j$.util.m summaryStatistics();

    int[] toArray();

    C1 y(j$.util.function.A a);
}