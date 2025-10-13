package e.c.b.b.c.e;

import j$.util.Set;
import j$.util.Spliterator;
import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public abstract class w4<E> extends n4<E> implements Set<E>, j$.util.Set {

    /* renamed from: f, reason: collision with root package name */
    @NullableDecl
    private transient r4<E> f14917f;

    w4() {
    }

    static int m(int i2) {
        int iMax = Math.max(i2, 2);
        if (iMax >= 751619276) {
            q3.f(iMax < 1073741824, "collection too large");
            return 1073741824;
        }
        int iHighestOneBit = Integer.highestOneBit(iMax - 1) << 1;
        while (iHighestOneBit * 0.7d < iMax) {
            iHighestOneBit <<= 1;
        }
        return iHighestOneBit;
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if ((obj instanceof w4) && n() && ((w4) obj).n() && hashCode() != obj.hashCode()) {
            return false;
        }
        return l5.b(this, obj);
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public int hashCode() {
        return l5.a(this);
    }

    @Override // e.c.b.b.c.e.n4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // e.c.b.b.c.e.n4
    public r4<E> k() {
        r4<E> r4Var = this.f14917f;
        if (r4Var != null) {
            return r4Var;
        }
        r4<E> r4VarO = o();
        this.f14917f = r4VarO;
        return r4VarO;
    }

    boolean n() {
        return false;
    }

    r4<E> o() {
        return r4.o(toArray());
    }

    @Override // e.c.b.b.c.e.n4, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Set.CC.$default$spliterator(this);
    }
}