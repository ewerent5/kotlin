package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.BiConsumer;
import j$.util.t;

/* renamed from: j$.util.stream.s1 */
/* loaded from: classes2.dex */
public interface InterfaceC0356s1 extends InterfaceC0329l1<Double, InterfaceC0356s1> {
    j$.util.p C(j$.util.function.p pVar);

    Object D(j$.util.function.J j2, j$.util.function.G g2, BiConsumer biConsumer);

    double G(double d2, j$.util.function.p pVar);

    InterfaceC0356s1 H(j$.util.function.u uVar);

    Stream I(j$.util.function.r rVar);

    boolean J(j$.util.function.s sVar);

    boolean O(j$.util.function.s sVar);

    boolean W(j$.util.function.s sVar);

    j$.util.p average();

    Stream boxed();

    long count();

    InterfaceC0356s1 d(j$.util.function.q qVar);

    InterfaceC0356s1 distinct();

    j$.util.p findAny();

    j$.util.p findFirst();

    @Override // j$.util.stream.InterfaceC0329l1
    t.a iterator();

    void k0(j$.util.function.q qVar);

    void l(j$.util.function.q qVar);

    InterfaceC0356s1 limit(long j2);

    j$.util.p max();

    j$.util.p min();

    C1 o(j$.G g2);

    @Override // j$.util.stream.InterfaceC0329l1
    InterfaceC0356s1 parallel();

    @Override // j$.util.stream.InterfaceC0329l1
    InterfaceC0356s1 sequential();

    InterfaceC0356s1 skip(long j2);

    InterfaceC0356s1 sorted();

    @Override // j$.util.stream.InterfaceC0329l1
    Spliterator.a spliterator();

    double sum();

    j$.util.l summaryStatistics();

    InterfaceC0356s1 t(j$.util.function.s sVar);

    double[] toArray();

    InterfaceC0356s1 u(j$.util.function.r rVar);

    H1 v(j$.util.function.t tVar);
}