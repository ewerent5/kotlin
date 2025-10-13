package j$;

import java.util.function.DoublePredicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class E implements j$.util.function.s {
    final /* synthetic */ DoublePredicate a;

    private /* synthetic */ E(DoublePredicate doublePredicate) {
        this.a = doublePredicate;
    }

    public static /* synthetic */ j$.util.function.s a(DoublePredicate doublePredicate) {
        if (doublePredicate == null) {
            return null;
        }
        return doublePredicate instanceof F ? ((F) doublePredicate).a : new E(doublePredicate);
    }

    public /* synthetic */ boolean b(double d2) {
        return this.a.test(d2);
    }
}