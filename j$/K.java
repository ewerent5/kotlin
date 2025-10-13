package j$;

import java.util.function.DoubleUnaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class K implements j$.util.function.u {
    final /* synthetic */ DoubleUnaryOperator a;

    private /* synthetic */ K(DoubleUnaryOperator doubleUnaryOperator) {
        this.a = doubleUnaryOperator;
    }

    public static /* synthetic */ j$.util.function.u b(DoubleUnaryOperator doubleUnaryOperator) {
        if (doubleUnaryOperator == null) {
            return null;
        }
        return doubleUnaryOperator instanceof L ? ((L) doubleUnaryOperator).a : new K(doubleUnaryOperator);
    }

    public /* synthetic */ double a(double d2) {
        return this.a.applyAsDouble(d2);
    }
}