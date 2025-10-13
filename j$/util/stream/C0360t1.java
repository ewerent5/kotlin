package j$.util.stream;

import j$.util.Spliterator;
import j$.util.function.Predicate;
import java.util.Objects;

/* renamed from: j$.util.stream.t1, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0360t1<T, O> implements g3<T, O> {
    private final U2 a;

    /* renamed from: b, reason: collision with root package name */
    final boolean f16359b;

    /* renamed from: c, reason: collision with root package name */
    final Object f16360c;

    /* renamed from: d, reason: collision with root package name */
    final Predicate f16361d;

    /* renamed from: e, reason: collision with root package name */
    final j$.util.function.J f16362e;

    C0360t1(boolean z, U2 u2, Object obj, Predicate predicate, j$.util.function.J j2) {
        this.f16359b = z;
        this.a = u2;
        this.f16360c = obj;
        this.f16361d = predicate;
        this.f16362e = j2;
    }

    @Override // j$.util.stream.g3
    public int b() {
        return T2.p | (this.f16359b ? 0 : T2.f16227m);
    }

    @Override // j$.util.stream.g3
    public Object c(T1 t1, Spliterator spliterator) {
        return new C0368v1(this, t1, spliterator).invoke();
    }

    @Override // j$.util.stream.g3
    public Object d(T1 t1, Spliterator spliterator) {
        h3 h3Var = (h3) this.f16362e.get();
        AbstractC0313h1 abstractC0313h1 = (AbstractC0313h1) t1;
        Objects.requireNonNull(h3Var);
        abstractC0313h1.m0(abstractC0313h1.u0(h3Var), spliterator);
        Object obj = h3Var.get();
        return obj != null ? obj : this.f16360c;
    }
}