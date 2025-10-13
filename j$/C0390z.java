package j$;

import java.util.function.DoubleBinaryOperator;

/* renamed from: j$.z, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C0390z implements DoubleBinaryOperator {
    final /* synthetic */ j$.util.function.p a;

    private /* synthetic */ C0390z(j$.util.function.p pVar) {
        this.a = pVar;
    }

    public static /* synthetic */ DoubleBinaryOperator a(j$.util.function.p pVar) {
        if (pVar == null) {
            return null;
        }
        return pVar instanceof C0389y ? ((C0389y) pVar).a : new C0390z(pVar);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public /* synthetic */ double applyAsDouble(double d2, double d3) {
        return this.a.applyAsDouble(d2, d3);
    }
}