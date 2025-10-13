package j$.util.stream;

import j$.util.function.C0280h;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class Q implements j$.util.function.C {
    public /* synthetic */ Q() {
    }

    @Override // j$.util.function.C
    public final void accept(long j2) {
        this.a.a.accept(j2);
    }

    @Override // j$.util.function.C
    public j$.util.function.C f(j$.util.function.C c2) {
        Objects.requireNonNull(c2);
        return new C0280h(this, c2);
    }
}