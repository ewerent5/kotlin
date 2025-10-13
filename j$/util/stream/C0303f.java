package j$.util.stream;

import j$.util.function.BiFunction;
import j$.util.function.C0274b;
import j$.util.function.Function;
import j$.util.stream.R1;
import j$.util.stream.S1;
import java.util.Objects;

/* renamed from: j$.util.stream.f */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0303f implements j$.util.function.n {
    public static final /* synthetic */ C0303f a = ;

    private /* synthetic */ C0303f() {
    }

    @Override // j$.util.function.BiFunction
    public BiFunction a(Function function) {
        Objects.requireNonNull(function);
        return new C0274b(this, function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return new S1.f.b((R1.c) obj, (R1.c) obj2);
    }
}