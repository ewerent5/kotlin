package e.c.b.b.c.e;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class s7 extends a6<Integer> implements v7, m9, RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    private static final s7 f14831f;

    /* renamed from: g, reason: collision with root package name */
    private int[] f14832g;

    /* renamed from: h, reason: collision with root package name */
    private int f14833h;

    static {
        s7 s7Var = new s7(new int[0], 0);
        f14831f = s7Var;
        s7Var.C0();
    }

    s7() {
        this(new int[10], 0);
    }

    public static s7 e() {
        return f14831f;
    }

    private final void h(int i2) {
        if (i2 < 0 || i2 >= this.f14833h) {
            throw new IndexOutOfBoundsException(k(i2));
        }
    }

    private final String k(int i2) {
        int i3 = this.f14833h;
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
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f14833h)) {
            throw new IndexOutOfBoundsException(k(i2));
        }
        int[] iArr = this.f14832g;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f14832g, i2, iArr2, i2 + 1, this.f14833h - i2);
            this.f14832g = iArr2;
        }
        this.f14832g[i2] = iIntValue;
        this.f14833h++;
        ((AbstractList) this).modCount++;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        r7.d(collection);
        if (!(collection instanceof s7)) {
            return super.addAll(collection);
        }
        s7 s7Var = (s7) collection;
        int i2 = s7Var.f14833h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f14833h;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f14832g;
        if (i4 > iArr.length) {
            this.f14832g = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(s7Var.f14832g, 0, this.f14832g, this.f14833h, s7Var.f14833h);
        this.f14833h = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final int c(int i2) {
        h(i2);
        return this.f14832g[i2];
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
        if (!(obj instanceof s7)) {
            return super.equals(obj);
        }
        s7 s7Var = (s7) obj;
        if (this.f14833h != s7Var.f14833h) {
            return false;
        }
        int[] iArr = s7Var.f14832g;
        for (int i2 = 0; i2 < this.f14833h; i2++) {
            if (this.f14832g[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void f(int i2) {
        a();
        int i3 = this.f14833h;
        int[] iArr = this.f14832g;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f14832g = iArr2;
        }
        int[] iArr3 = this.f14832g;
        int i4 = this.f14833h;
        this.f14833h = i4 + 1;
        iArr3[i4] = i2;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object get(int i2) {
        return Integer.valueOf(c(i2));
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f14833h; i3++) {
            i2 = (i2 * 31) + this.f14832g[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f14832g[i2] == iIntValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        h(i2);
        int[] iArr = this.f14832g;
        int i3 = iArr[i2];
        if (i2 < this.f14833h - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f14833h--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f14832g;
        System.arraycopy(iArr, i3, iArr, i2, this.f14833h - i3);
        this.f14833h -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        h(i2);
        int[] iArr = this.f14832g;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f14833h;
    }

    @Override // e.c.b.b.c.e.x7
    /* renamed from: zzb, reason: merged with bridge method [inline-methods] */
    public final v7 b(int i2) {
        if (i2 >= this.f14833h) {
            return new s7(Arrays.copyOf(this.f14832g, i2), this.f14833h);
        }
        throw new IllegalArgumentException();
    }

    private s7(int[] iArr, int i2) {
        this.f14832g = iArr;
        this.f14833h = i2;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* synthetic */ boolean add(Object obj) {
        f(((Integer) obj).intValue());
        return true;
    }
}