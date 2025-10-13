package e.c.b.b.c.e;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class g5<K> extends w4<K> {

    /* renamed from: g, reason: collision with root package name */
    private final transient s4<K, ?> f14542g;

    /* renamed from: h, reason: collision with root package name */
    private final transient r4<K> f14543h;

    g5(s4<K, ?> s4Var, r4<K> r4Var) {
        this.f14542g = s4Var;
        this.f14543h = r4Var;
    }

    @Override // e.c.b.b.c.e.n4
    final int a(Object[] objArr, int i2) {
        return k().a(objArr, i2);
    }

    @Override // e.c.b.b.c.e.n4
    /* renamed from: c */
    public final n5<K> iterator() {
        return (n5) k().iterator();
    }

    @Override // e.c.b.b.c.e.n4, java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        return this.f14542g.get(obj) != null;
    }

    @Override // e.c.b.b.c.e.w4, e.c.b.b.c.e.n4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // e.c.b.b.c.e.w4, e.c.b.b.c.e.n4
    public final r4<K> k() {
        return this.f14543h;
    }

    @Override // e.c.b.b.c.e.n4
    final boolean l() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f14542g.size();
    }
}