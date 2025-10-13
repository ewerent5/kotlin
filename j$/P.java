package j$;

import java.util.function.IntBinaryOperator;

/* loaded from: classes2.dex */
public final /* synthetic */ class P implements IntBinaryOperator {
    final /* synthetic */ j$.util.function.v a;

    private /* synthetic */ P(j$.util.function.v vVar) {
        this.a = vVar;
    }

    public static /* synthetic */ IntBinaryOperator a(j$.util.function.v vVar) {
        if (vVar == null) {
            return null;
        }
        return vVar instanceof O ? ((O) vVar).a : new P(vVar);
    }

    @Override // java.util.function.IntBinaryOperator
    public /* synthetic */ int applyAsInt(int i2, int i3) {
        return this.a.applyAsInt(i2, i3);
    }
}