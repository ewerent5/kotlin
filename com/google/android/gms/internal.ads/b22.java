package com.google.android.gms.internal.ads;

import j$.util.List;
import j$.util.Spliterator;
import j$.util.function.UnaryOperator;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Objects;
import java.util.RandomAccess;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class b22<E> extends y12<E> implements List<E>, RandomAccess, j$.util.List {

    /* renamed from: f, reason: collision with root package name */
    private static final y22<Object> f5052f = new z12(l22.f7168g, 0);

    b22() {
    }

    public static <E> b22<E> n() {
        return (b22<E>) l22.f7168g;
    }

    public static <E> b22<E> o(E e2) {
        Object[] objArr = {e2};
        k22.a(objArr, 1);
        return x(objArr, 1);
    }

    public static <E> b22<E> p(E e2, E e3, E e4) {
        Object[] objArr = {"2011", "1009", "3010"};
        k22.a(objArr, 3);
        return x(objArr, 3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static <E> b22<E> r(Iterable<? extends E> iterable) {
        Objects.requireNonNull(iterable);
        return t(iterable);
    }

    public static <E> b22<E> t(Collection<? extends E> collection) {
        if (!(collection instanceof y12)) {
            Object[] array = collection.toArray();
            int length = array.length;
            k22.a(array, length);
            return x(array, length);
        }
        b22<E> b22VarH = ((y12) collection).h();
        if (!b22VarH.k()) {
            return b22VarH;
        }
        Object[] array2 = b22VarH.toArray();
        return x(array2, array2.length);
    }

    public static <E> b22<E> u(E[] eArr) {
        Object[] objArr = (Object[]) eArr.clone();
        int length = objArr.length;
        k22.a(objArr, length);
        return x(objArr, length);
    }

    static <E> b22<E> w(Object[] objArr) {
        return x(objArr, objArr.length);
    }

    static <E> b22<E> x(Object[] objArr, int i2) {
        return i2 == 0 ? (b22<E>) l22.f7168g : new l22(objArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.y12
    /* renamed from: a */
    public final w22<E> iterator() {
        return listIterator(0);
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

    @Override // com.google.android.gms.internal.ads.y12, java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof List) {
            List list = (List) obj;
            int size = size();
            if (size == list.size()) {
                if (list instanceof RandomAccess) {
                    for (int i2 = 0; i2 < size; i2++) {
                        if (d12.a(get(i2), list.get(i2))) {
                        }
                    }
                    return true;
                }
                Iterator<E> it = iterator();
                Iterator<E> it2 = list.iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (!it2.hasNext() || !d12.a(it.next(), it2.next())) {
                            break;
                        }
                    } else if (!it2.hasNext()) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.y12
    public final b22<E> h() {
        return this;
    }

    @Override // java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        int size = size();
        int iHashCode = 1;
        for (int i2 = 0; i2 < size; i2++) {
            iHashCode = (iHashCode * 31) + get(i2).hashCode();
        }
        return iHashCode;
    }

    @Override // java.util.List, j$.util.List
    public final int indexOf(@NullableDecl Object obj) {
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

    @Override // com.google.android.gms.internal.ads.y12, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.y12
    int l(Object[] objArr, int i2) {
        int size = size();
        for (int i3 = 0; i3 < size; i3++) {
            objArr[i2 + i3] = get(i3);
        }
        return i2 + size;
    }

    @Override // java.util.List, j$.util.List
    public final int lastIndexOf(@NullableDecl Object obj) {
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
    public final /* bridge */ /* synthetic */ ListIterator listIterator() {
        return listIterator(0);
    }

    @Override // java.util.List, j$.util.List
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public b22<E> subList(int i2, int i3) {
        h12.f(i2, i3, size());
        int i4 = i3 - i2;
        return i4 == size() ? this : i4 == 0 ? (b22<E>) l22.f7168g : new a22(this, i2, i4);
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

    @Override // com.google.android.gms.internal.ads.y12, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.List, j$.util.List
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public final y22<E> listIterator(int i2) {
        h12.e(i2, size(), "index");
        return isEmpty() ? (y22<E>) f5052f : new z12(this, i2);
    }
}