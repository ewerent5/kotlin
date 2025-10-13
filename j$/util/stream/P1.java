package j$.util.stream;

import j$.util.Spliterator;

/* loaded from: classes2.dex */
final class P1<P_IN, P_OUT> extends AbstractC0317i1<P_IN, P_OUT, Boolean, P1<P_IN, P_OUT>> {

    /* renamed from: j, reason: collision with root package name */
    private final O1 f16156j;

    P1(O1 o1, T1 t1, Spliterator spliterator) {
        super(t1, spliterator);
        this.f16156j = o1;
    }

    P1(P1 p1, Spliterator spliterator) {
        super(p1, spliterator);
        this.f16156j = p1.f16156j;
    }

    @Override // j$.util.stream.AbstractC0325k1
    protected Object a() {
        T1 t1 = this.f16316b;
        M1 m1 = (M1) this.f16156j.f16153c.get();
        t1.t0(m1, this.f16317c);
        boolean z = m1.f16146b;
        if (z != this.f16156j.f16152b.f16150c) {
            return null;
        }
        l(Boolean.valueOf(z));
        return null;
    }

    @Override // j$.util.stream.AbstractC0325k1
    protected AbstractC0325k1 f(Spliterator spliterator) {
        return new P1(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0317i1
    protected Object k() {
        return Boolean.valueOf(!this.f16156j.f16152b.f16150c);
    }
}