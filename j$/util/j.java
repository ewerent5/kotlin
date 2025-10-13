package j$.util;

import j$.util.function.C0278f;
import j$.util.function.Consumer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class j implements j$.util.function.q {
    public final /* synthetic */ Consumer a;

    @Override // j$.util.function.q
    public final void accept(double d2) {
        this.a.accept(Double.valueOf(d2));
    }

    @Override // j$.util.function.q
    public j$.util.function.q k(j$.util.function.q qVar) {
        Objects.requireNonNull(qVar);
        return new C0278f(this, qVar);
    }
}