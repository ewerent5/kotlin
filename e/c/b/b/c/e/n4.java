package e.c.b.b.c.e;

import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public abstract class n4<E> extends AbstractCollection<E> implements Serializable, Collection {

    /* renamed from: e, reason: collision with root package name */
    private static final Object[] f14722e = new Object[0];

    n4() {
    }

    int a(Object[] objArr, int i2) {
        n5 n5Var = (n5) iterator();
        while (n5Var.hasNext()) {
            objArr[i2] = n5Var.next();
            i2++;
        }
        return i2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    @Deprecated
    public final boolean add(E e2) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    @Deprecated
    public final boolean addAll(java.util.Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public abstract n5<E> iterator();

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public abstract boolean contains(@NullableDecl Object obj);

    @NullableDecl
    Object[] e() {
        return null;
    }

    int f() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    int h() {
        throw new UnsupportedOperationException();
    }

    public r4<E> k() {
        return isEmpty() ? r4.r() : r4.o(toArray());
    }

    abstract boolean l();

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Q1.v(j$.time.a.L(this), true);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    @Deprecated
    public final boolean removeAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    @Deprecated
    public final boolean retainAll(java.util.Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Collection.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Q1.v(j$.time.a.L(this), false);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final Object[] toArray() {
        return toArray(f14722e);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final <T> T[] toArray(T[] tArr) {
        q3.b(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] objArrE = e();
            if (objArrE != null) {
                return (T[]) Arrays.copyOfRange(objArrE, f(), h(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }
}