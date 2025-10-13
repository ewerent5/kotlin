package j$;

import java.util.function.IntFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class U implements IntFunction {
    final /* synthetic */ j$.util.function.x a;

    private /* synthetic */ U(j$.util.function.x xVar) {
        this.a = xVar;
    }

    public static /* synthetic */ IntFunction a(j$.util.function.x xVar) {
        if (xVar == null) {
            return null;
        }
        return xVar instanceof T ? ((T) xVar).a : new U(xVar);
    }

    @Override // java.util.function.IntFunction
    public /* synthetic */ Object apply(int i2) {
        return this.a.apply(i2);
    }
}