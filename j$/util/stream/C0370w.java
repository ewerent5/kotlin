package j$.util.stream;

import j$.util.function.BiFunction;
import j$.util.function.C0274b;
import j$.util.function.Function;
import java.util.Objects;

/* renamed from: j$.util.stream.w */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0370w implements j$.util.function.n {
    public /* synthetic */ C0370w() {
    }

    @Override // j$.util.function.BiFunction
    public BiFunction a(Function function) {
        Objects.requireNonNull(function);
        return new C0274b(this, function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        biConsumer.accept(obj, obj2);
        return obj;
    }
}