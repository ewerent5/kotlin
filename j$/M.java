package j$;

import j$.util.function.Function;

/* loaded from: classes2.dex */
public final /* synthetic */ class M implements Function {
    final /* synthetic */ java.util.function.Function a;

    private /* synthetic */ M(java.util.function.Function function) {
        this.a = function;
    }

    public static /* synthetic */ Function c(java.util.function.Function function) {
        if (function == null) {
            return null;
        }
        return function instanceof N ? ((N) function).a : new M(function);
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function a(Function function) {
        return c(this.a.andThen(N.a(function)));
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Object apply(Object obj) {
        return this.a.apply(obj);
    }

    @Override // j$.util.function.Function
    public /* synthetic */ Function b(Function function) {
        return c(this.a.compose(N.a(function)));
    }
}