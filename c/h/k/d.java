package c.h.k;

/* compiled from: Pair.java */
/* loaded from: classes.dex */
public class d<F, S> {
    public final F a;

    /* renamed from: b, reason: collision with root package name */
    public final S f3105b;

    public d(F f2, S s) {
        this.a = f2;
        this.f3105b = s;
    }

    public static <A, B> d<A, B> a(A a, B b2) {
        return new d<>(a, b2);
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return c.a(dVar.a, this.a) && c.a(dVar.f3105b, this.f3105b);
    }

    public int hashCode() {
        F f2 = this.a;
        int iHashCode = f2 == null ? 0 : f2.hashCode();
        S s = this.f3105b;
        return iHashCode ^ (s != null ? s.hashCode() : 0);
    }

    public String toString() {
        return "Pair{" + String.valueOf(this.a) + " " + String.valueOf(this.f3105b) + "}";
    }
}