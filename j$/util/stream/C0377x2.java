package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.InterfaceC0365u2;
import java.util.concurrent.CountedCompleter;

/* renamed from: j$.util.stream.x2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C0377x2<P_IN, P_OUT, R, S extends InterfaceC0365u2<P_OUT, R, S>> extends AbstractC0325k1<P_IN, P_OUT, S, C0377x2<P_IN, P_OUT, R, S>> {

    /* renamed from: h, reason: collision with root package name */
    private final AbstractC0373w2 f16378h;

    C0377x2(AbstractC0373w2 abstractC0373w2, T1 t1, Spliterator spliterator) {
        super(t1, spliterator);
        this.f16378h = abstractC0373w2;
    }

    C0377x2(C0377x2 c0377x2, Spliterator spliterator) {
        super(c0377x2, spliterator);
        this.f16378h = c0377x2.f16378h;
    }

    @Override // j$.util.stream.AbstractC0325k1
    protected Object a() {
        T1 t1 = this.f16316b;
        InterfaceC0365u2 interfaceC0365u2A = this.f16378h.a();
        t1.t0(interfaceC0365u2A, this.f16317c);
        return interfaceC0365u2A;
    }

    @Override // j$.util.stream.AbstractC0325k1
    protected AbstractC0325k1 f(Spliterator spliterator) {
        return new C0377x2(this, spliterator);
    }

    @Override // j$.util.stream.AbstractC0325k1, java.util.concurrent.CountedCompleter
    public void onCompletion(CountedCompleter countedCompleter) {
        if (!d()) {
            InterfaceC0365u2 interfaceC0365u2 = (InterfaceC0365u2) ((C0377x2) this.f16319e).b();
            interfaceC0365u2.i((InterfaceC0365u2) ((C0377x2) this.f16320f).b());
            g(interfaceC0365u2);
        }
        this.f16317c = null;
        this.f16320f = null;
        this.f16319e = null;
    }
}