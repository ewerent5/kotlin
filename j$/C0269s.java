package j$;

import j$.util.function.BiFunction;
import j$.util.function.Function;

/* renamed from: j$.s */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0269s implements BiFunction {
    final /* synthetic */ java.util.function.BiFunction a;

    private /* synthetic */ C0269s(java.util.function.BiFunction biFunction) {
        this.a = biFunction;
    }

    public static /* synthetic */ BiFunction b(java.util.function.BiFunction biFunction) {
        if (biFunction == null) {
            return null;
        }
        return biFunction instanceof C0271t ? ((C0271t) biFunction).a : new C0269s(biFunction);
    }

    @Override // j$.util.function.BiFunction
    public /* synthetic */ BiFunction a(Function function) {
        return b(this.a.andThen(N.a(function)));
    }

    @Override // j$.util.function.BiFunction
    public /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.a.apply(obj, obj2);
    }
}