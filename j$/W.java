package j$;

import java.util.function.IntPredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class W implements IntPredicate {
    final /* synthetic */ j$.util.function.y a;

    private /* synthetic */ W(j$.util.function.y yVar) {
        this.a = yVar;
    }

    public static /* synthetic */ IntPredicate a(j$.util.function.y yVar) {
        if (yVar == null) {
            return null;
        }
        return yVar instanceof V ? ((V) yVar).a : new W(yVar);
    }

    @Override // java.util.function.IntPredicate
    public /* synthetic */ IntPredicate and(IntPredicate intPredicate) {
        return a(V.a(((V) this.a).a.and(a(V.a(intPredicate)))));
    }

    @Override // java.util.function.IntPredicate
    public /* synthetic */ IntPredicate negate() {
        return a(V.a(((V) this.a).a.negate()));
    }

    @Override // java.util.function.IntPredicate
    public /* synthetic */ IntPredicate or(IntPredicate intPredicate) {
        return a(V.a(((V) this.a).a.or(a(V.a(intPredicate)))));
    }

    @Override // java.util.function.IntPredicate
    public /* synthetic */ boolean test(int i2) {
        return ((V) this.a).a.test(i2);
    }
}