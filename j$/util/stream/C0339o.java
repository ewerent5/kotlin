package j$.util.stream;

import j$.util.function.C0278f;
import java.util.Objects;

/* renamed from: j$.util.stream.o */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0339o implements j$.util.function.q {
    public /* synthetic */ C0339o() {
    }

    @Override // j$.util.function.q
    public final void accept(double d2) {
        this.a.a.accept(d2);
    }

    @Override // j$.util.function.q
    public j$.util.function.q k(j$.util.function.q qVar) {
        Objects.requireNonNull(qVar);
        return new C0278f(this, qVar);
    }
}