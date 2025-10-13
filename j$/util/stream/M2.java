package j$.util.stream;

import j$.util.Comparator;
import j$.util.Spliterator;
import j$.util.stream.AbstractC0381y2;
import j$.util.stream.S1;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;

/* loaded from: classes2.dex */
final class M2<T> extends AbstractC0381y2.l<T, T> {

    /* renamed from: l, reason: collision with root package name */
    private final boolean f16147l;

    /* renamed from: m, reason: collision with root package name */
    private final Comparator f16148m;

    M2(AbstractC0313h1 abstractC0313h1) {
        super(abstractC0313h1, U2.REFERENCE, T2.f16226l | T2.f16224j);
        this.f16147l = true;
        this.f16148m = Comparator.CC.a();
    }

    M2(AbstractC0313h1 abstractC0313h1, java.util.Comparator comparator) {
        super(abstractC0313h1, U2.REFERENCE, T2.f16226l | T2.f16225k);
        this.f16147l = false;
        Objects.requireNonNull(comparator);
        this.f16148m = comparator;
    }

    @Override // j$.util.stream.AbstractC0313h1
    public R1 D0(T1 t1, Spliterator spliterator, j$.util.function.x xVar) {
        if (T2.SORTED.n(t1.r0()) && this.f16147l) {
            return t1.o0(spliterator, false, xVar);
        }
        Object[] objArrQ = t1.o0(spliterator, true, xVar).q(xVar);
        Arrays.sort(objArrQ, this.f16148m);
        return new S1.c(objArrQ);
    }

    @Override // j$.util.stream.AbstractC0313h1
    public A2 G0(int i2, A2 a2) {
        Objects.requireNonNull(a2);
        return (T2.SORTED.n(i2) && this.f16147l) ? a2 : T2.SIZED.n(i2) ? new R2(a2, this.f16148m) : new N2(a2, this.f16148m);
    }
}