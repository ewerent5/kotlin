package j$;

import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.function.BinaryOperator;

/* renamed from: j$.u */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0272u implements j$.util.function.n {
    final /* synthetic */ BinaryOperator a;

    private /* synthetic */ C0272u(BinaryOperator binaryOperator) {
        this.a = binaryOperator;
    }

    public static /* synthetic */ j$.util.function.n b(BinaryOperator binaryOperator) {
        if (binaryOperator == null) {
            return null;
        }
        return binaryOperator instanceof C0386v ? ((C0386v) binaryOperator).a : new C0272u(binaryOperator);
    }

    @Override // j$.util.function.BiFunction
    public /* synthetic */ BiFunction a(Function function) {
        return C0269s.b(this.a.andThen(N.a(function)));
    }

    @Override // j$.util.function.BiFunction
    public /* synthetic */ Object apply(Object obj, Object obj2) {
        return this.a.apply(obj, obj2);
    }
}