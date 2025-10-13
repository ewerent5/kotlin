package j$.util.stream;

import j$.util.function.BiFunction;
import j$.util.function.C0274b;
import j$.util.function.Function;
import j$.util.stream.R1;
import j$.util.stream.S1;
import java.util.Objects;

/* renamed from: j$.util.stream.b0 */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0288b0 implements j$.util.function.n {
    public static final /* synthetic */ C0288b0 a = ;

    private /* synthetic */ C0288b0() {
    }

    @Override // j$.util.function.BiFunction
    public BiFunction a(Function function) {
        Objects.requireNonNull(function);
        return new C0274b(this, function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return new S1.f.a((R1.b) obj, (R1.b) obj2);
    }
}