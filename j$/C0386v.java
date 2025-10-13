package j$;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Function;

/* renamed from: j$.v, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0386v implements BinaryOperator {
    final /* synthetic */ j$.util.function.n a;

    private /* synthetic */ C0386v(j$.util.function.n nVar) {
        this.a = nVar;
    }

    public static /* synthetic */ BinaryOperator a(j$.util.function.n nVar) {
        if (nVar == null) {
            return null;
        }
        return nVar instanceof C0272u ? ((C0272u) nVar).a : new C0386v(nVar);
    }

    @Override // java.util.function.BiFunction
    public /* synthetic */ BiFunction andThen(Function function) {
        return C0271t.a(this.a.a(M.c(function)));
    }

    @Override // java.util.function.BiFunction
    public /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.a.apply(obj, obj2);
    }
}