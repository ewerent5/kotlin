package j$;

import java.util.function.DoubleFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class D implements DoubleFunction {
    final /* synthetic */ j$.util.function.r a;

    private /* synthetic */ D(j$.util.function.r rVar) {
        this.a = rVar;
    }

    public static /* synthetic */ DoubleFunction a(j$.util.function.r rVar) {
        if (rVar == null) {
            return null;
        }
        return rVar instanceof C ? ((C) rVar).a : new D(rVar);
    }

    @Override // java.util.function.DoubleFunction
    public /* synthetic */ Object apply(double d2) {
        return this.a.apply(d2);
    }
}