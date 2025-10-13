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

/* JADX INFO: Add missing generic type declarations: [V, K] */
/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class f4<K, V> extends AbstractSet<Map.Entry<K, V>> implements Set {

    /* renamed from: e, reason: collision with root package name */
    private final /* synthetic */ b4 f14510e;

    f4(b4 b4Var) {
        this.f14510e = b4Var;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
    public final void clear() {
        this.f14510e.clear();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
    public final boolean contains(@NullableDecl Object obj) {
        Map<K, V> mapL = this.f14510e.l();
        if (mapL != null) {
            return mapL.entrySet().contains(obj);
        }
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            int iD = this.f14510e.d(entry.getKey());
            if (iD != -1 && o3.a(this.f14510e.f14400i[iD], entry.getValue())) {
                return true;
            }
        }
        return false;
    }

    @Override // j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Set, j$.util.Collection, j$.lang.Iterable
    public final Iterator<Map.Entry<K, V>> iterator() {
        return this.f14510e.s();
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Q1.v(j$.time.a.L(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
    public final boolean remove(@NullableDecl Object obj) {
        Map<K, V> mapL = this.f14510e.l();
        if (mapL != null) {
            return mapL.entrySet().remove(obj);
        }
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (this.f14510e.g()) {
            return false;
        }
        int iV = this.f14510e.v();
        Object key = entry.getKey();
        Object value = entry.getValue();
        Object obj2 = this.f14510e.f14397f;
        b4 b4Var = this.f14510e;
        int iC = m4.c(key, value, iV, obj2, b4Var.f14398g, b4Var.f14399h, b4Var.f14400i);
        if (iC == -1) {
            return false;
        }
        this.f14510e.f(iC, iV);
        b4.q(this.f14510e);
        this.f14510e.o();
        return true;
    }

    @Override // j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set, j$.util.Set, j$.util.Collection
    public final int size() {
        return this.f14510e.size();
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