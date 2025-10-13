package j$.util.stream;

import j$.util.function.C0279g;
import java.util.Objects;

/* renamed from: j$.util.stream.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0291c implements j$.util.function.w {
    public final /* synthetic */ A2 a;

    @Override // j$.util.function.w
    public final void accept(int i2) {
        this.a.accept(i2);
    }

    @Override // j$.util.function.w
    public j$.util.function.w l(j$.util.function.w wVar) {
        Objects.requireNonNull(wVar);
        return new C0279g(this, wVar);
    }
}