package j$.util.stream;

import j$.util.function.C0279g;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class F implements j$.util.function.w {
    public /* synthetic */ F() {
    }

    @Override // j$.util.function.w
    public final void accept(int i2) {
        this.a.a.accept(i2);
    }

    @Override // j$.util.function.w
    public j$.util.function.w l(j$.util.function.w wVar) {
        Objects.requireNonNull(wVar);
        return new C0279g(this, wVar);
    }
}