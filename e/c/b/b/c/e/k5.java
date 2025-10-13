package e.c.b.b.c.e;

import java.util.Iterator;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class k5<E> extends w4<E> {

    /* renamed from: g, reason: collision with root package name */
    private final transient E f14663g;

    /* renamed from: h, reason: collision with root package name */
    private transient int f14664h;

    k5(E e2) {
        this.f14663g = (E) q3.b(e2);
    }

    @Override // e.c.b.b.c.e.n4
    final int a(Object[] objArr, int i2) {
        objArr[i2] = this.f14663g;
        return i2 + 1;
    }

    @Override // e.c.b.b.c.e.n4
    /* renamed from: c */
    public final n5<E> iterator() {
        return new b5(this.f14663g);
    }

    @Override // e.c.b.b.c.e.n4, java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean contains(Object obj) {
        return this.f14663g.equals(obj);
    }

    @Override // e.c.b.b.c.e.w4, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        int i2 = this.f14664h;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.f14663g.hashCode();
        this.f14664h = iHashCode;
        return iHashCode;
    }

    @Override // e.c.b.b.c.e.w4, e.c.b.b.c.e.n4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // e.c.b.b.c.e.n4
    final boolean l() {
        return false;
    }

    @Override // e.c.b.b.c.e.w4
    final boolean n() {
        return this.f14664h != 0;
    }

    @Override // e.c.b.b.c.e.w4
    final r4<E> o() {
        return r4.n(this.f14663g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f14663g.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }

    k5(E e2, int i2) {
        this.f14663g = e2;
        this.f14664h = i2;
    }
}