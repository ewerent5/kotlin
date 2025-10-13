package i.t;

import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.Set;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import okhttp3.HttpUrl;

/* compiled from: Sets.kt */
/* loaded from: classes3.dex */
public final class x implements Set, Serializable, i.y.d.z.a, j$.util.Set {

    /* renamed from: e, reason: collision with root package name */
    public static final x f15843e = new x();

    private x() {
    }

    public boolean a(Void r2) {
        i.y.d.l.d(r2, "element");
        return false;
    }

    @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public int c() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return a((Void) obj);
        }
        return false;
    }

    @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
    public boolean containsAll(Collection collection) {
        i.y.d.l.d(collection, "elements");
        return collection.isEmpty();
    }

    @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
    public boolean equals(Object obj) {
        return (obj instanceof Set) && ((Set) obj).isEmpty();
    }

    @Override // j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
    public int hashCode() {
        return 0;
    }

    @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable, j$.util.Set, j$.util.Collection, j$.lang.Iterable
    public Iterator iterator() {
        return u.f15840e;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Q1.v(j$.time.a.L(this), true);
    }

    @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
    public boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
    public final /* bridge */ int size() {
        return c();
    }

    @Override // java.util.Set, java.util.Collection, java.lang.Iterable, j$.util.Set, j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Set.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Q1.v(j$.time.a.L(this), false);
    }

    @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
    public Object[] toArray() {
        return i.y.d.f.a(this);
    }

    @Override // java.util.Set, java.util.Collection, j$.util.Set, j$.util.Collection
    public <T> T[] toArray(T[] tArr) {
        return (T[]) i.y.d.f.b(this, tArr);
    }

    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }
}