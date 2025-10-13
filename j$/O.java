package j$;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class O implements j$.util.function.v {
    final /* synthetic */ IntBinaryOperator a;

    private /* synthetic */ O(IntBinaryOperator intBinaryOperator) {
        this.a = intBinaryOperator;
    }

    public static /* synthetic */ j$.util.function.v a(IntBinaryOperator intBinaryOperator) {
        if (intBinaryOperator == null) {
            return null;
        }
        return intBinaryOperator instanceof P ? ((P) intBinaryOperator).a : new O(intBinaryOperator);
    }

    @Override // j$.util.function.v
    public /* synthetic */ int applyAsInt(int i2, int i3) {
        return this.a.applyAsInt(i2, i3);
    }
}