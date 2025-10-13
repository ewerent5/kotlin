package androidx.room;

import java.util.Collection;
import java.util.Iterator;

/* compiled from: EntityInsertionAdapter.java */
/* loaded from: classes.dex */
public abstract class e0<T> extends y0 {
    public e0(q0 q0Var) {
        super(q0Var);
    }

    protected abstract void g(c.r.a.f fVar, T t);

    public final void h(T t) {
        c.r.a.f fVarA = a();
        try {
            g(fVarA, t);
            fVarA.N0();
        } finally {
            f(fVarA);
        }
    }

    public final long i(T t) {
        c.r.a.f fVarA = a();
        try {
            g(fVarA, t);
            return fVarA.N0();
        } finally {
            f(fVarA);
        }
    }

    public final long[] j(Collection<? extends T> collection) {
        c.r.a.f fVarA = a();
        try {
            long[] jArr = new long[collection.size()];
            int i2 = 0;
            Iterator<? extends T> it = collection.iterator();
            while (it.hasNext()) {
                g(fVarA, it.next());
                jArr[i2] = fVarA.N0();
                i2++;
            }
            return jArr;
        } finally {
            f(fVarA);
        }
    }
}