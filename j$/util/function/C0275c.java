package j$.util.function;

import java.util.Comparator;
import java.util.Objects;

/* renamed from: j$.util.function.c */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0275c implements n {
    public final /* synthetic */ Comparator a;

    @Override // j$.util.function.BiFunction
    public BiFunction a(Function function) {
        Objects.requireNonNull(function);
        return new C0274b(this, function);
    }

    @Override // j$.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        return comparator.compare(obj, obj2) <= 0 ? obj : obj2;
    }
}