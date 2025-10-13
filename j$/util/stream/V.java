package j$.util.stream;

import j$.util.function.C0281i;
import j$.util.function.C0282j;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class V implements j$.util.function.F {
    public static final /* synthetic */ V a = ;

    private /* synthetic */ V() {
    }

    @Override // j$.util.function.F
    public j$.util.function.F a(j$.util.function.F f2) {
        Objects.requireNonNull(f2);
        return new C0281i(this, f2);
    }

    @Override // j$.util.function.F
    public final long applyAsLong(long j2) {
        return 1L;
    }

    @Override // j$.util.function.F
    public j$.util.function.F b(j$.util.function.F f2) {
        Objects.requireNonNull(f2);
        return new C0282j(this, f2);
    }
}