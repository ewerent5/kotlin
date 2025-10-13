package e.c.b.b.c.e;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class e6 extends a6<Boolean> implements x7<Boolean>, m9, RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    private static final e6 f14475f;

    /* renamed from: g, reason: collision with root package name */
    private boolean[] f14476g;

    /* renamed from: h, reason: collision with root package name */
    private int f14477h;

    static {
        e6 e6Var = new e6(new boolean[0], 0);
        f14475f = e6Var;
        e6Var.C0();
    }

    e6() {
        this(new boolean[10], 0);
    }

    private final void e(int i2) {
        if (i2 < 0 || i2 >= this.f14477h) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    private final String f(int i2) {
        int i3 = this.f14477h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ void add(int i2, Object obj) {
        int i3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f14477h)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        boolean[] zArr = this.f14476g;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f14476g, i2, zArr2, i2 + 1, this.f14477h - i2);
            this.f14476g = zArr2;
        }
        this.f14476g[i2] = zBooleanValue;
        this.f14477h++;
        ((AbstractList) this).modCount++;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        r7.d(collection);
        if (!(collection instanceof e6)) {
            return super.addAll(collection);
        }
        e6 e6Var = (e6) collection;
        int i2 = e6Var.f14477h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f14477h;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f14476g;
        if (i4 > zArr.length) {
            this.f14476g = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(e6Var.f14476g, 0, this.f14476g, this.f14477h, e6Var.f14477h);
        this.f14477h = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // e.c.b.b.c.e.x7
    public final /* synthetic */ x7<Boolean> b(int i2) {
        if (i2 >= this.f14477h) {
            return new e6(Arrays.copyOf(this.f14476g, i2), this.f14477h);
        }
        throw new IllegalArgumentException();
    }

    public final void c(boolean z) {
        a();
        int i2 = this.f14477h;
        boolean[] zArr = this.f14476g;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f14476g = zArr2;
        }
        boolean[] zArr3 = this.f14476g;
        int i3 = this.f14477h;
        this.f14477h = i3 + 1;
        zArr3[i3] = z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e6)) {
            return super.equals(obj);
        }
        e6 e6Var = (e6) obj;
        if (this.f14477h != e6Var.f14477h) {
            return false;
        }
        boolean[] zArr = e6Var.f14476g;
        for (int i2 = 0; i2 < this.f14477h; i2++) {
            if (this.f14476g[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object get(int i2) {
        e(i2);
        return Boolean.valueOf(this.f14476g[i2]);
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        int iC = 1;
        for (int i2 = 0; i2 < this.f14477h; i2++) {
            iC = (iC * 31) + r7.c(this.f14476g[i2]);
        }
        return iC;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f14476g[i2] == zBooleanValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        e(i2);
        boolean[] zArr = this.f14476g;
        boolean z = zArr[i2];
        if (i2 < this.f14477h - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.f14477h--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f14476g;
        System.arraycopy(zArr, i3, zArr, i2, this.f14477h - i3);
        this.f14477h -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        e(i2);
        boolean[] zArr = this.f14476g;
        boolean z = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f14477h;
    }

    private e6(boolean[] zArr, int i2) {
        this.f14476g = zArr;
        this.f14477h = i2;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* synthetic */ boolean add(Object obj) {
        c(((Boolean) obj).booleanValue());
        return true;
    }
}