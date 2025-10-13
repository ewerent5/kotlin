package j$.util.stream;

import j$.util.Spliterator;
import java.util.Objects;

/* loaded from: classes2.dex */
final class O1<T> implements g3<T, Boolean> {
    private final U2 a;

    /* renamed from: b, reason: collision with root package name */
    final N1 f16152b;

    /* renamed from: c, reason: collision with root package name */
    final j$.util.function.J f16153c;

    O1(U2 u2, N1 n1, j$.util.function.J j2) {
        this.a = u2;
        this.f16152b = n1;
        this.f16153c = j2;
    }

    @Override // j$.util.stream.g3
    public int b() {
        return T2.p | T2.f16227m;
    }

    @Override // j$.util.stream.g3
    public Object c(T1 t1, Spliterator spliterator) {
        return new P1(this, t1, spliterator).invoke();
    }

    @Override // j$.util.stream.g3
    public Object d(T1 t1, Spliterator spliterator) {
        M1 m1 = (M1) this.f16153c.get();
        AbstractC0313h1 abstractC0313h1 = (AbstractC0313h1) t1;
        Objects.requireNonNull(m1);
        abstractC0313h1.m0(abstractC0313h1.u0(m1), spliterator);
        return Boolean.valueOf(m1.f16146b);
    }
}