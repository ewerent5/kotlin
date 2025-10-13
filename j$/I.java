package j$;

import java.util.function.DoubleToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class I implements j$.util.function.t {
    final /* synthetic */ DoubleToLongFunction a;

    private /* synthetic */ I(DoubleToLongFunction doubleToLongFunction) {
        this.a = doubleToLongFunction;
    }

    public static /* synthetic */ j$.util.function.t a(DoubleToLongFunction doubleToLongFunction) {
        if (doubleToLongFunction == null) {
            return null;
        }
        return doubleToLongFunction instanceof J ? ((J) doubleToLongFunction).a : new I(doubleToLongFunction);
    }

    @Override // j$.util.function.t
    public /* synthetic */ long applyAsLong(double d2) {
        return this.a.applyAsLong(d2);
    }
}