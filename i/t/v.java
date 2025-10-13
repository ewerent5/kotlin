package i.t;

import ch.qos.logback.core.CoreConstants;
import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.function.UnaryOperator;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import okhttp3.HttpUrl;

/* compiled from: Collections.kt */
/* loaded from: classes3.dex */
public final class v implements List, Serializable, RandomAccess, i.y.d.z.a, j$.util.List {

    /* renamed from: e, reason: collision with root package name */
    public static final v f15841e = new v();

    private v() {
    }

    public boolean a(Void r2) {
        i.y.d.l.d(r2, "element");
        return false;
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void add(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, java.util.AbstractCollection, j$.util.Collection, java.util.Set, j$.util.Set
    public /* synthetic */ boolean add(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public boolean addAll(int i2, Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean addAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public Void get(int i2) {
        throw new IndexOutOfBoundsException("Empty list doesn't contain element at index " + i2 + CoreConstants.DOT);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, java.util.AbstractCollection, j$.util.Collection, java.util.Set, j$.util.Set
    public void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ boolean contains(Object obj) {
        if (obj instanceof Void) {
            return a((Void) obj);
        }
        return false;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean containsAll(Collection collection) {
        i.y.d.l.d(collection, "elements");
        return collection.isEmpty();
    }

    public int e() {
        return 0;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean equals(Object obj) {
        return (obj instanceof List) && ((List) obj).isEmpty();
    }

    public int f(Void r2) {
        i.y.d.l.d(r2, "element");
        return -1;
    }

    @Override // j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    public int h(Void r2) {
        i.y.d.l.d(r2, "element");
        return -1;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public int hashCode() {
        return 1;
    }

    @Override // java.util.List, j$.util.List
    public final /* bridge */ int indexOf(Object obj) {
        if (obj instanceof Void) {
            return f((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean isEmpty() {
        return true;
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, java.util.AbstractCollection, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public Iterator iterator() {
        return u.f15840e;
    }

    @Override // java.util.List, j$.util.List
    public final /* bridge */ int lastIndexOf(Object obj) {
        if (obj instanceof Void) {
            return h((Void) obj);
        }
        return -1;
    }

    @Override // java.util.List, j$.util.List
    public ListIterator listIterator() {
        return u.f15840e;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Q1.v(j$.time.a.L(this), true);
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ Object remove(int i2) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean removeAll(Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean retainAll(java.util.Collection collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ Object set(int i2, Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ int size() {
        return e();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // java.util.List, java.util.Collection, java.lang.Iterable, j$.util.List, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Q1.v(j$.time.a.L(this), false);
    }

    @Override // java.util.List, j$.util.List
    public java.util.List subList(int i2, int i3) {
        if (i2 == 0 && i3 == 0) {
            return this;
        }
        throw new IndexOutOfBoundsException("fromIndex: " + i2 + ", toIndex: " + i3);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public Object[] toArray() {
        return i.y.d.f.a(this);
    }

    @Override // java.util.List, java.util.Collection, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public <T> T[] toArray(T[] tArr) {
        return (T[]) i.y.d.f.b(this, tArr);
    }

    public String toString() {
        return HttpUrl.PATH_SEGMENT_ENCODE_SET_URI;
    }

    @Override // java.util.List, j$.util.List
    public ListIterator listIterator(int i2) {
        if (i2 == 0) {
            return u.f15840e;
        }
        throw new IndexOutOfBoundsException("Index: " + i2);
    }
}