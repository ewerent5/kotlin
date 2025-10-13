package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.InterfaceC0365u2;
import java.util.Objects;

/* renamed from: j$.util.stream.w2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
abstract class AbstractC0373w2<T, R, S extends InterfaceC0365u2<T, R, S>> implements g3<T, R> {
    private final U2 a;

    AbstractC0373w2(U2 u2) {
        this.a = u2;
    }

    public abstract InterfaceC0365u2 a();

    @Override // j$.util.stream.g3
    public /* synthetic */ int b() {
        return 0;
    }

    @Override // j$.util.stream.g3
    public Object c(T1 t1, Spliterator spliterator) {
        return ((InterfaceC0365u2) new C0377x2(this, t1, spliterator).invoke()).get();
    }

    @Override // j$.util.stream.g3
    public Object d(T1 t1, Spliterator spliterator) {
        InterfaceC0365u2 interfaceC0365u2A = a();
        AbstractC0313h1 abstractC0313h1 = (AbstractC0313h1) t1;
        Objects.requireNonNull(interfaceC0365u2A);
        abstractC0313h1.m0(abstractC0313h1.u0(interfaceC0365u2A), spliterator);
        return interfaceC0365u2A.get();
    }
}