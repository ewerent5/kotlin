package j$.util.stream;

import j$.util.function.BiFunction;
import j$.util.function.C0274b;
import j$.util.function.Function;
import j$.util.stream.S1;
import java.util.Objects;

/* loaded from: classes2.dex */
public final /* synthetic */ class P0 implements j$.util.function.n {
    public static final /* synthetic */ P0 a = ;

    private /* synthetic */ P0() {
    }

    @Override // j$.util.function.BiFunction
    public BiFunction a(Function function) {
        Objects.requireNonNull(function);
        return new C0274b(this, function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return new S1.f((R1) obj, (R1) obj2);
    }
}