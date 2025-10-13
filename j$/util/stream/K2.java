package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.AbstractC0384z1;
import j$.util.stream.R1;
import j$.util.stream.S1;
import java.util.Arrays;
import java.util.Objects;

/* loaded from: classes2.dex */
final class K2 extends AbstractC0384z1.j<Integer> {
    K2(AbstractC0313h1 abstractC0313h1) {
        super(abstractC0313h1, U2.INT_VALUE, T2.f16226l | T2.f16224j);
    }

    @Override // j$.util.stream.AbstractC0313h1
    public R1 D0(T1 t1, Spliterator spliterator, j$.util.function.x xVar) {
        if (T2.SORTED.n(t1.r0())) {
            return t1.o0(spliterator, false, xVar);
        }
        int[] iArr = (int[]) ((R1.c) t1.o0(spliterator, true, xVar)).g();
        Arrays.sort(iArr);
        return new S1.l(iArr);
    }

    @Override // j$.util.stream.AbstractC0313h1
    public A2 G0(int i2, A2 a2) {
        Objects.requireNonNull(a2);
        return T2.SORTED.n(i2) ? a2 : T2.SIZED.n(i2) ? new P2(a2) : new H2(a2);
    }
}