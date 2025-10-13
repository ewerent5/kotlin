package kotlinx.coroutines;

/* compiled from: CancellableContinuation.kt */
/* loaded from: classes3.dex */
public final class n {
    public static final void a(k<?> kVar, u0 u0Var) {
        kVar.f(new v0(u0Var));
    }

    public static final <T> l<T> b(i.v.d<? super T> dVar) {
        if (!(dVar instanceof kotlinx.coroutines.internal.e)) {
            return new l<>(dVar, 2);
        }
        l<T> lVarR = ((kotlinx.coroutines.internal.e) dVar).r();
        if (lVarR != null) {
            if (!lVarR.K()) {
                lVarR = null;
            }
            if (lVarR != null) {
                return lVarR;
            }
        }
        return new l<>(dVar, 2);
    }
}