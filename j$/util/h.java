package j$.util;

import j$.util.function.C0279g;
import j$.util.function.Consumer;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class h implements j$.util.function.w {
    public final /* synthetic */ Consumer a;

    @Override // j$.util.function.w
    public final void accept(int i2) {
        this.a.accept(Integer.valueOf(i2));
    }

    @Override // j$.util.function.w
    public j$.util.function.w l(j$.util.function.w wVar) {
        Objects.requireNonNull(wVar);
        return new C0279g(this, wVar);
    }
}