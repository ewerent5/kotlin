package androidx.room;

/* compiled from: EntityDeletionOrUpdateAdapter.java */
/* loaded from: classes.dex */
public abstract class d0<T> extends y0 {
    public d0(q0 q0Var) {
        super(q0Var);
    }

    protected abstract void g(c.r.a.f fVar, T t);

    public final int h(T t) {
        c.r.a.f fVarA = a();
        try {
            g(fVarA, t);
            return fVarA.w();
        } finally {
            f(fVarA);
        }
    }
}