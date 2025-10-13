package e.c.d;

import java.io.IOException;

/* compiled from: TypeAdapter.java */
/* loaded from: classes.dex */
public abstract class v<T> {

    /* compiled from: TypeAdapter.java */
    class a extends v<T> {
        a() {
        }

        @Override // e.c.d.v
        public T b(e.c.d.a0.a aVar) throws IOException {
            if (aVar.k0() != e.c.d.a0.b.NULL) {
                return (T) v.this.b(aVar);
            }
            aVar.a0();
            return null;
        }

        @Override // e.c.d.v
        public void d(e.c.d.a0.c cVar, T t) throws IOException {
            if (t == null) {
                cVar.C();
            } else {
                v.this.d(cVar, t);
            }
        }
    }

    public final v<T> a() {
        return new a();
    }

    public abstract T b(e.c.d.a0.a aVar);

    public final l c(T t) {
        try {
            e.c.d.y.n.f fVar = new e.c.d.y.n.f();
            d(fVar, t);
            return fVar.q0();
        } catch (IOException e2) {
            throw new m(e2);
        }
    }

    public abstract void d(e.c.d.a0.c cVar, T t);
}