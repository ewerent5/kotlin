package j$;

import java.util.function.DoubleToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class J implements DoubleToLongFunction {
    final /* synthetic */ j$.util.function.t a;

    private /* synthetic */ J(j$.util.function.t tVar) {
        this.a = tVar;
    }

    public static /* synthetic */ DoubleToLongFunction a(j$.util.function.t tVar) {
        if (tVar == null) {
            return null;
        }
        return tVar instanceof I ? ((I) tVar).a : new J(tVar);
    }

    @Override // java.util.function.DoubleToLongFunction
    public /* synthetic */ long applyAsLong(double d2) {
        return this.a.applyAsLong(d2);
    }
}