package j$;

import java.util.function.DoubleUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class L implements DoubleUnaryOperator {
    final /* synthetic */ j$.util.function.u a;

    private /* synthetic */ L(j$.util.function.u uVar) {
        this.a = uVar;
    }

    public static /* synthetic */ DoubleUnaryOperator a(j$.util.function.u uVar) {
        if (uVar == null) {
            return null;
        }
        return uVar instanceof K ? ((K) uVar).a : new L(uVar);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public /* synthetic */ DoubleUnaryOperator andThen(DoubleUnaryOperator doubleUnaryOperator) {
        return a(K.b(((K) this.a).a.andThen(a(K.b(doubleUnaryOperator)))));
    }

    @Override // java.util.function.DoubleUnaryOperator
    public /* synthetic */ double applyAsDouble(double d2) {
        return ((K) this.a).a.applyAsDouble(d2);
    }

    @Override // java.util.function.DoubleUnaryOperator
    public /* synthetic */ DoubleUnaryOperator compose(DoubleUnaryOperator doubleUnaryOperator) {
        return a(K.b(((K) this.a).a.compose(a(K.b(doubleUnaryOperator)))));
    }
}