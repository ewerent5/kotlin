package e.c.b.d.a.b;

/* loaded from: classes.dex */
public final class f0<T> implements h0<T> {
    private h0<T> a;

    public static <T> void b(h0<T> h0Var, h0<T> h0Var2) {
        s.c(h0Var2);
        f0 f0Var = (f0) h0Var;
        if (f0Var.a != null) {
            throw new IllegalStateException();
        }
        f0Var.a = h0Var2;
    }

    @Override // e.c.b.d.a.b.h0
    public final T a() {
        h0<T> h0Var = this.a;
        if (h0Var != null) {
            return h0Var.a();
        }
        throw new IllegalStateException();
    }
}