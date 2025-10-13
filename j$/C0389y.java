package j$;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.y */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0389y implements j$.util.function.p {
    final /* synthetic */ DoubleBinaryOperator a;

    private /* synthetic */ C0389y(DoubleBinaryOperator doubleBinaryOperator) {
        this.a = doubleBinaryOperator;
    }

    public static /* synthetic */ j$.util.function.p a(DoubleBinaryOperator doubleBinaryOperator) {
        if (doubleBinaryOperator == null) {
            return null;
        }
        return doubleBinaryOperator instanceof C0390z ? ((C0390z) doubleBinaryOperator).a : new C0389y(doubleBinaryOperator);
    }

    @Override // j$.util.function.p
    public /* synthetic */ double applyAsDouble(double d2, double d3) {
        return this.a.applyAsDouble(d2, d3);
    }
}