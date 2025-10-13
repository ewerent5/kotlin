package j$;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class F implements DoublePredicate {
    final /* synthetic */ j$.util.function.s a;

    private /* synthetic */ F(j$.util.function.s sVar) {
        this.a = sVar;
    }

    public static /* synthetic */ DoublePredicate a(j$.util.function.s sVar) {
        if (sVar == null) {
            return null;
        }
        return sVar instanceof E ? ((E) sVar).a : new F(sVar);
    }

    @Override // java.util.function.DoublePredicate
    public /* synthetic */ DoublePredicate and(DoublePredicate doublePredicate) {
        return a(E.a(((E) this.a).a.and(a(E.a(doublePredicate)))));
    }

    @Override // java.util.function.DoublePredicate
    public /* synthetic */ DoublePredicate negate() {
        return a(E.a(((E) this.a).a.negate()));
    }

    @Override // java.util.function.DoublePredicate
    public /* synthetic */ DoublePredicate or(DoublePredicate doublePredicate) {
        return a(E.a(((E) this.a).a.or(a(E.a(doublePredicate)))));
    }

    @Override // java.util.function.DoublePredicate
    public /* synthetic */ boolean test(double d2) {
        return ((E) this.a).a.test(d2);
    }
}