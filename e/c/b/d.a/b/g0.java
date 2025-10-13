package e.c.b.d.a.b;

/* loaded from: classes.dex */
public final class g0<T> implements h0, e0 {
    private static final Object a = new Object();

    /* renamed from: b, reason: collision with root package name */
    private volatile h0<T> f15338b;

    /* renamed from: c, reason: collision with root package name */
    private volatile Object f15339c = a;

    private g0(h0<T> h0Var) {
        this.f15338b = h0Var;
    }

    public static <P extends h0<T>, T> h0<T> b(P p) {
        s.c(p);
        return p instanceof g0 ? p : new g0(p);
    }

    public static <P extends h0<T>, T> e0<T> c(P p) {
        if (p instanceof e0) {
            return (e0) p;
        }
        s.c(p);
        return new g0(p);
    }

    @Override // e.c.b.d.a.b.h0
    public final T a() {
        T tA = (T) this.f15339c;
        Object obj = a;
        if (tA == obj) {
            synchronized (this) {
                tA = (T) this.f15339c;
                if (tA == obj) {
                    tA = this.f15338b.a();
                    Object obj2 = this.f15339c;
                    if (obj2 != obj && obj2 != tA) {
                        String strValueOf = String.valueOf(obj2);
                        String strValueOf2 = String.valueOf(tA);
                        StringBuilder sb = new StringBuilder(strValueOf.length() + 118 + strValueOf2.length());
                        sb.append("Scoped provider was invoked recursively returning different results: ");
                        sb.append(strValueOf);
                        sb.append(" & ");
                        sb.append(strValueOf2);
                        sb.append(". This is likely due to a circular dependency.");
                        throw new IllegalStateException(sb.toString());
                    }
                    this.f15339c = tA;
                    this.f15338b = null;
                }
            }
        }
        return tA;
    }
}