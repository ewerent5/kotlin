package kotlinx.coroutines.internal;

import kotlinx.coroutines.n0;

/* compiled from: Atomic.kt */
/* loaded from: classes3.dex */
public abstract class t {
    public abstract c<?> a();

    public final boolean b(t tVar) {
        c<?> cVarA;
        c<?> cVarA2 = a();
        return (cVarA2 == null || (cVarA = tVar.a()) == null || cVarA2.f() >= cVarA.f()) ? false : true;
    }

    public abstract Object c(Object obj);

    public String toString() {
        return n0.a(this) + '@' + n0.b(this);
    }
}