package e.c.b.b.c.e;

import j$.util.List;
import j$.util.Spliterator;
import j$.util.function.UnaryOperator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public abstract class r4<E> extends n4<E> implements List<E>, RandomAccess, j$.util.List {

    /* renamed from: f, reason: collision with root package name */
    private static final m5<Object> f14811f = new q4(c5.f14422g, 0);

    r4() {
    }

    public static <E> r4<E> n(E e2) {
        Object[] objArr = {e2};
        for (int i2 = 0; i2 <= 0; i2++) {
            d5.a(objArr[0], 0);
        }
        return p(objArr, 1);
    }

    static <E> r4<E> o(Object[] objArr) {
        return p(objArr, objArr.length);
    }

    static <E> r4<E> p(Object[] objArr, int i2) {
        return i2 == 0 ? (r4<E>) c5.f14422g : new c5(objArr, i2);
    }

    public static <E> r4<E> r() {
        return (r4<E>) c5.f14422g;
    }

    @Override // e.c.b.b.c.e.n4
    int a(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // java.util.List, j$.util.List
    @Deprecated
    public final void add(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    @Deprecated
    public final boolean addAll(int i2, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // e.c.b.b.c.e.n4
    /* renamed from: c */
    public final n5<E> iterator() {
        return (m5) listIterator();
    }

    @Override // e.c.b.b.c.e.n4, java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == q3.b(this)) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (o3.a(get(i2), list.get(i2))) {
                        }
                    }
                    return true;
                }
                int size2 = size();
                Iterator<E> it = list.iterator();
                int i3 = 0;
                while (true) {
                    if (i3 < size2) {
                        if (!it.hasNext()) {
                            break;
                        }
                        E e2 = get(i3);
                        i3++;
                        if (!o3.a(e2, it.next())) {
                            break;
                        }
                    } else if (!it.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public int hashCode() {
        int size = size();
        int i2 = 1;
        for (int i3 = 0; i3 < size; i3++) {
            i2 = ~(~((i2 * 31) + get(i3).hashCode()));
        }
        return i2;
    }

    @Override // java.util.List, j$.util.List
    public int indexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (obj.equals(get(i2))) {
                return i2;
            }
        }
        return -1;
    }

    @Override // e.c.b.b.c.e.n4, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }

    @Override // e.c.b.b.c.e.n4
    public final r4<E> k() {
        return this;
    }

    @Override // java.util.List, j$.util.List
    public int lastIndexOf(@NullableDecl Object obj) {
        if (obj == null) {
            return -1;
        }
        for (int size = size() - 1; size >= 0; size--) {
            if (obj.equals(get(size))) {
                return size;
            }
        }
        return -1;
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ ListIterator listIterator(int i2) {
        q3.g(i2, size());
        return isEmpty() ? f14811f : new q4(this, i2);
    }

    @Override // java.util.List, j$.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public r4<E> subList(int i2, int i3) {
        q3.e(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? (r4<E>) c5.f14422g : new t4(this, i2, i4);
    }

    @Override // java.util.List, j$.util.List
    @Deprecated
    public final E remove(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.List, j$.util.List
    @Deprecated
    public final E set(int i2, E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void sort(Comparator comparator) {
        List.CC.$default$sort(this, comparator);
    }

    @Override // e.c.b.b.c.e.n4, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ ListIterator listIterator() {
        return (m5) listIterator(0);
    }
}