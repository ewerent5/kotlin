package e.c.b.b.c.e;

import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.Set;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import java.util.AbstractSet;
import java.util.Iterator;
import java.util.Map;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* JADX INFO: Add missing generic type declarations: [K] */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class h4<K> extends AbstractSet<K> implements Set {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ b4 f14586e;

    h4(b4 b4Var) {
        this.f14586e = b4Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
    public final void clear() {
        this.f14586e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
    public final boolean contains(Object obj) {
        return this.f14586e.containsKey(obj);
    }

    @Override // j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Set, j$.util.Collection, j$.lang.Iterable
    public final Iterator<K> iterator() {
        return this.f14586e.r();
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Q1.v(j$.time.a.L(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
    public final boolean remove(@NullableDecl Object obj) {
        Map mapL = this.f14586e.l();
        return mapL != null ? mapL.keySet().remove(obj) : this.f14586e.k(obj) != b4.f14396e;
    }

    @Override // j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
    public final int size() {
        return this.f14586e.size();
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Set, j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Set.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Q1.v(j$.time.a.L(this), false);
    }
}