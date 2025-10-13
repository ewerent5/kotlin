package j$;

import java.util.function.BiFunction;
import java.util.function.Function;

/* renamed from: j$.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0271t implements BiFunction {
    final /* synthetic */ j$.util.function.BiFunction a;

    private /* synthetic */ C0271t(j$.util.function.BiFunction biFunction) {
        this.a = biFunction;
    }

    public static /* synthetic */ BiFunction a(j$.util.function.BiFunction biFunction) {
        if (biFunction == null) {
            return null;
        }
        return biFunction instanceof C0269s ? ((C0269s) biFunction).a : new C0271t(biFunction);
    }

    @Override // java.util.function.BiFunction
    public /* synthetic */ BiFunction andThen(Function function) {
        return a(this.a.a(M.c(function)));
    }

    @Override // java.util.function.BiFunction
    public /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.a.apply(obj, obj2);
    }
}