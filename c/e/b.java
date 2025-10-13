package c.e;

import ch.qos.logback.core.CoreConstants;
import j$.lang.Iterable;
import j$.util.Collection;
import j$.util.Set;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import j$.util.function.Predicate;
import j$.util.stream.Q1;
import j$.util.stream.Stream;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* compiled from: ArraySet.java */
/* loaded from: classes.dex */
public final class b<E> implements Collection<E>, Set<E>, j$.util.Collection, j$.util.Set {

    /* renamed from: e, reason: collision with root package name */
    private static final int[] f2704e = new int[0];

    /* renamed from: f, reason: collision with root package name */
    private static final Object[] f2705f = new Object[0];

    /* renamed from: g, reason: collision with root package name */
    private static Object[] f2706g;

    /* renamed from: h, reason: collision with root package name */
    private static int f2707h;

    /* renamed from: i, reason: collision with root package name */
    private static Object[] f2708i;

    /* renamed from: j, reason: collision with root package name */
    private static int f2709j;

    /* renamed from: k, reason: collision with root package name */
    private int[] f2710k;

    /* renamed from: l, reason: collision with root package name */
    Object[] f2711l;

    /* renamed from: m, reason: collision with root package name */
    int f2712m;
    private f<E, E> n;

    /* compiled from: ArraySet.java */
    class a extends f<E, E> {
        a() {
        }

        @Override // c.e.f
        protected void a() {
            b.this.clear();
        }

        @Override // c.e.f
        protected Object b(int i2, int i3) {
            return b.this.f2711l[i2];
        }

        @Override // c.e.f
        protected Map<E, E> c() {
            throw new UnsupportedOperationException("not a map");
        }

        @Override // c.e.f
        protected int d() {
            return b.this.f2712m;
        }

        @Override // c.e.f
        protected int e(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // c.e.f
        protected int f(Object obj) {
            return b.this.indexOf(obj);
        }

        @Override // c.e.f
        protected void g(E e2, E e3) {
            b.this.add(e2);
        }

        @Override // c.e.f
        protected void h(int i2) {
            b.this.l(i2);
        }

        @Override // c.e.f
        protected E i(int i2, E e2) {
            throw new UnsupportedOperationException("not a map");
        }
    }

    public b() {
        this(0);
    }

    private void a(int i2) {
        if (i2 == 8) {
            synchronized (b.class) {
                Object[] objArr = f2708i;
                if (objArr != null) {
                    this.f2711l = objArr;
                    f2708i = (Object[]) objArr[0];
                    this.f2710k = (int[]) objArr[1];
                    objArr[1] = null;
                    objArr[0] = null;
                    f2709j--;
                    return;
                }
            }
        } else if (i2 == 4) {
            synchronized (b.class) {
                Object[] objArr2 = f2706g;
                if (objArr2 != null) {
                    this.f2711l = objArr2;
                    f2706g = (Object[]) objArr2[0];
                    this.f2710k = (int[]) objArr2[1];
                    objArr2[1] = null;
                    objArr2[0] = null;
                    f2707h--;
                    return;
                }
            }
        }
        this.f2710k = new int[i2];
        this.f2711l = new Object[i2];
    }

    private static void e(int[] iArr, Object[] objArr, int i2) {
        if (iArr.length == 8) {
            synchronized (b.class) {
                if (f2709j < 10) {
                    objArr[0] = f2708i;
                    objArr[1] = iArr;
                    for (int i3 = i2 - 1; i3 >= 2; i3--) {
                        objArr[i3] = null;
                    }
                    f2708i = objArr;
                    f2709j++;
                }
            }
            return;
        }
        if (iArr.length == 4) {
            synchronized (b.class) {
                if (f2707h < 10) {
                    objArr[0] = f2706g;
                    objArr[1] = iArr;
                    for (int i4 = i2 - 1; i4 >= 2; i4--) {
                        objArr[i4] = null;
                    }
                    f2706g = objArr;
                    f2707h++;
                }
            }
        }
    }

    private f<E, E> f() {
        if (this.n == null) {
            this.n = new a();
        }
        return this.n;
    }

    private int h(Object obj, int i2) {
        int i3 = this.f2712m;
        if (i3 == 0) {
            return -1;
        }
        int iA = c.a(this.f2710k, i3, i2);
        if (iA < 0 || obj.equals(this.f2711l[iA])) {
            return iA;
        }
        int i4 = iA + 1;
        while (i4 < i3 && this.f2710k[i4] == i2) {
            if (obj.equals(this.f2711l[i4])) {
                return i4;
            }
            i4++;
        }
        for (int i5 = iA - 1; i5 >= 0 && this.f2710k[i5] == i2; i5--) {
            if (obj.equals(this.f2711l[i5])) {
                return i5;
            }
        }
        return ~i4;
    }

    private int k() {
        int i2 = this.f2712m;
        if (i2 == 0) {
            return -1;
        }
        int iA = c.a(this.f2710k, i2, 0);
        if (iA < 0 || this.f2711l[iA] == null) {
            return iA;
        }
        int i3 = iA + 1;
        while (i3 < i2 && this.f2710k[i3] == 0) {
            if (this.f2711l[i3] == null) {
                return i3;
            }
            i3++;
        }
        for (int i4 = iA - 1; i4 >= 0 && this.f2710k[i4] == 0; i4--) {
            if (this.f2711l[i4] == null) {
                return i4;
            }
        }
        return ~i3;
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.Set
    public boolean add(E e2) {
        int i2;
        int iH;
        if (e2 == null) {
            iH = k();
            i2 = 0;
        } else {
            int iHashCode = e2.hashCode();
            i2 = iHashCode;
            iH = h(e2, iHashCode);
        }
        if (iH >= 0) {
            return false;
        }
        int i3 = ~iH;
        int i4 = this.f2712m;
        int[] iArr = this.f2710k;
        if (i4 >= iArr.length) {
            int i5 = 4;
            if (i4 >= 8) {
                i5 = (i4 >> 1) + i4;
            } else if (i4 >= 4) {
                i5 = 8;
            }
            Object[] objArr = this.f2711l;
            a(i5);
            int[] iArr2 = this.f2710k;
            if (iArr2.length > 0) {
                System.arraycopy(iArr, 0, iArr2, 0, iArr.length);
                System.arraycopy(objArr, 0, this.f2711l, 0, objArr.length);
            }
            e(iArr, objArr, this.f2712m);
        }
        int i6 = this.f2712m;
        if (i3 < i6) {
            int[] iArr3 = this.f2710k;
            int i7 = i3 + 1;
            System.arraycopy(iArr3, i3, iArr3, i7, i6 - i3);
            Object[] objArr2 = this.f2711l;
            System.arraycopy(objArr2, i3, objArr2, i7, this.f2712m - i3);
        }
        this.f2710k[i3] = i2;
        this.f2711l[i3] = e2;
        this.f2712m++;
        return true;
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.Set
    public boolean addAll(Collection<? extends E> collection) {
        c(this.f2712m + collection.size());
        Iterator<? extends E> it = collection.iterator();
        boolean zAdd = false;
        while (it.hasNext()) {
            zAdd |= add(it.next());
        }
        return zAdd;
    }

    public void c(int i2) {
        int[] iArr = this.f2710k;
        if (iArr.length < i2) {
            Object[] objArr = this.f2711l;
            a(i2);
            int i3 = this.f2712m;
            if (i3 > 0) {
                System.arraycopy(iArr, 0, this.f2710k, 0, i3);
                System.arraycopy(objArr, 0, this.f2711l, 0, this.f2712m);
            }
            e(iArr, objArr, this.f2712m);
        }
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.Set
    public void clear() {
        int i2 = this.f2712m;
        if (i2 != 0) {
            e(this.f2710k, this.f2711l, i2);
            this.f2710k = f2704e;
            this.f2711l = f2705f;
            this.f2712m = 0;
        }
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.Set
    public boolean contains(Object obj) {
        return indexOf(obj) >= 0;
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.Set
    public boolean containsAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.Set
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set = (Set) obj;
            if (size() != set.size()) {
                return false;
            }
            for (int i2 = 0; i2 < this.f2712m; i2++) {
                try {
                    if (!set.contains(m(i2))) {
                        return false;
                    }
                } catch (ClassCastException | NullPointerException unused) {
                }
            }
            return true;
        }
        return false;
    }

    @Override // j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable.CC.$default$forEach(this, consumer);
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.Set
    public int hashCode() {
        int[] iArr = this.f2710k;
        int i2 = this.f2712m;
        int i3 = 0;
        for (int i4 = 0; i4 < i2; i4++) {
            i3 += iArr[i4];
        }
        return i3;
    }

    public int indexOf(Object obj) {
        return obj == null ? k() : h(obj, obj.hashCode());
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.Set
    public boolean isEmpty() {
        return this.f2712m <= 0;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection, j$.lang.Iterable
    public Iterator<E> iterator() {
        return f().m().iterator();
    }

    public E l(int i2) {
        Object[] objArr = this.f2711l;
        E e2 = (E) objArr[i2];
        int i3 = this.f2712m;
        if (i3 <= 1) {
            e(this.f2710k, objArr, i3);
            this.f2710k = f2704e;
            this.f2711l = f2705f;
            this.f2712m = 0;
        } else {
            int[] iArr = this.f2710k;
            if (iArr.length <= 8 || i3 >= iArr.length / 3) {
                int i4 = i3 - 1;
                this.f2712m = i4;
                if (i2 < i4) {
                    int i5 = i2 + 1;
                    System.arraycopy(iArr, i5, iArr, i2, i4 - i2);
                    Object[] objArr2 = this.f2711l;
                    System.arraycopy(objArr2, i5, objArr2, i2, this.f2712m - i2);
                }
                this.f2711l[this.f2712m] = null;
            } else {
                a(i3 > 8 ? i3 + (i3 >> 1) : 8);
                this.f2712m--;
                if (i2 > 0) {
                    System.arraycopy(iArr, 0, this.f2710k, 0, i2);
                    System.arraycopy(objArr, 0, this.f2711l, 0, i2);
                }
                int i6 = this.f2712m;
                if (i2 < i6) {
                    int i7 = i2 + 1;
                    System.arraycopy(iArr, i7, this.f2710k, i2, i6 - i2);
                    System.arraycopy(objArr, i7, this.f2711l, i2, this.f2712m - i2);
                }
            }
        }
        return e2;
    }

    public E m(int i2) {
        return (E) this.f2711l[i2];
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Q1.v(j$.time.a.L(this), true);
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.Set
    public boolean remove(Object obj) {
        int iIndexOf = indexOf(obj);
        if (iIndexOf < 0) {
            return false;
        }
        l(iIndexOf);
        return true;
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.Set
    public boolean removeAll(Collection<?> collection) {
        Iterator<?> it = collection.iterator();
        boolean zRemove = false;
        while (it.hasNext()) {
            zRemove |= remove(it.next());
        }
        return zRemove;
    }

    @Override // j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.Set
    public boolean retainAll(java.util.Collection<?> collection) {
        boolean z = false;
        for (int i2 = this.f2712m - 1; i2 >= 0; i2--) {
            if (!collection.contains(this.f2711l[i2])) {
                l(i2);
                z = true;
            }
        }
        return z;
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.Set
    public int size() {
        return this.f2712m;
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.Set, j$.util.Collection, j$.lang.Iterable
    public /* synthetic */ Spliterator spliterator() {
        return Set.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Q1.v(j$.time.a.L(this), false);
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.Set
    public Object[] toArray() {
        int i2 = this.f2712m;
        Object[] objArr = new Object[i2];
        System.arraycopy(this.f2711l, 0, objArr, 0, i2);
        return objArr;
    }

    public String toString() {
        if (isEmpty()) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f2712m * 14);
        sb.append(CoreConstants.CURLY_LEFT);
        for (int i2 = 0; i2 < this.f2712m; i2++) {
            if (i2 > 0) {
                sb.append(", ");
            }
            E eM = m(i2);
            if (eM != this) {
                sb.append(eM);
            } else {
                sb.append("(this Set)");
            }
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }

    public b(int i2) {
        if (i2 == 0) {
            this.f2710k = f2704e;
            this.f2711l = f2705f;
        } else {
            a(i2);
        }
        this.f2712m = 0;
    }

    @Override // java.util.Collection, java.util.Set, j$.util.Collection, j$.util.Set
    public <T> T[] toArray(T[] tArr) {
        if (tArr.length < this.f2712m) {
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), this.f2712m));
        }
        System.arraycopy(this.f2711l, 0, tArr, 0, this.f2712m);
        int length = tArr.length;
        int i2 = this.f2712m;
        if (length > i2) {
            tArr[i2] = null;
        }
        return tArr;
    }
}