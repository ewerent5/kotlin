package j$.util;

import j$.util.function.C;
import j$.util.function.C0280h;
import j$.util.function.Consumer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements C {
    public final /* synthetic */ Consumer a;

    @Override // j$.util.function.C
    public final void accept(long j2) {
        this.a.accept(Long.valueOf(j2));
    }

    @Override // j$.util.function.C
    public C f(C c2) {
        Objects.requireNonNull(c2);
        return new C0280h(this, c2);
    }
}