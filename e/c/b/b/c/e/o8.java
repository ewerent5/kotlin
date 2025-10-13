package e.c.b.b.c.e;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class o8 extends a6<Long> implements y7, m9, RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    private static final o8 f14750f;

    /* renamed from: g, reason: collision with root package name */
    private long[] f14751g;

    /* renamed from: h, reason: collision with root package name */
    private int f14752h;

    static {
        o8 o8Var = new o8(new long[0], 0);
        f14750f = o8Var;
        o8Var.C0();
    }

    o8() {
        this(new long[10], 0);
    }

    public static o8 e() {
        return f14750f;
    }

    private final void f(int i2) {
        if (i2 < 0 || i2 >= this.f14752h) {
            throw new IndexOutOfBoundsException(h(i2));
        }
    }

    private final String h(int i2) {
        int i3 = this.f14752h;
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
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f14752h)) {
            throw new IndexOutOfBoundsException(h(i2));
        }
        long[] jArr = this.f14751g;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f14751g, i2, jArr2, i2 + 1, this.f14752h - i2);
            this.f14751g = jArr2;
        }
        this.f14751g[i2] = jLongValue;
        this.f14752h++;
        ((AbstractList) this).modCount++;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        r7.d(collection);
        if (!(collection instanceof o8)) {
            return super.addAll(collection);
        }
        o8 o8Var = (o8) collection;
        int i2 = o8Var.f14752h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f14752h;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f14751g;
        if (i4 > jArr.length) {
            this.f14751g = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(o8Var.f14751g, 0, this.f14751g, this.f14752h, o8Var.f14752h);
        this.f14752h = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(long j2) {
        a();
        int i2 = this.f14752h;
        long[] jArr = this.f14751g;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f14751g = jArr2;
        }
        long[] jArr3 = this.f14751g;
        int i3 = this.f14752h;
        this.f14752h = i3 + 1;
        jArr3[i3] = j2;
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
        if (!(obj instanceof o8)) {
            return super.equals(obj);
        }
        o8 o8Var = (o8) obj;
        if (this.f14752h != o8Var.f14752h) {
            return false;
        }
        long[] jArr = o8Var.f14751g;
        for (int i2 = 0; i2 < this.f14752h; i2++) {
            if (this.f14751g[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // e.c.b.b.c.e.x7
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final y7 b(int i2) {
        if (i2 >= this.f14752h) {
            return new o8(Arrays.copyOf(this.f14751g, i2), this.f14752h);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object get(int i2) {
        return Long.valueOf(zzb(i2));
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        int iB = 1;
        for (int i2 = 0; i2 < this.f14752h; i2++) {
            iB = (iB * 31) + r7.b(this.f14751g[i2]);
        }
        return iB;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int size = size();
        for (int i2 = 0; i2 < size; i2++) {
            if (this.f14751g[i2] == jLongValue) {
                return i2;
            }
        }
        return -1;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object remove(int i2) {
        a();
        f(i2);
        long[] jArr = this.f14751g;
        long j2 = jArr[i2];
        if (i2 < this.f14752h - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f14752h--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f14751g;
        System.arraycopy(jArr, i3, jArr, i2, this.f14752h - i3);
        this.f14752h -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* synthetic */ Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        f(i2);
        long[] jArr = this.f14751g;
        long j2 = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f14752h;
    }

    @Override // e.c.b.b.c.e.y7
    public final long zzb(int i2) {
        f(i2);
        return this.f14751g[i2];
    }

    private o8(long[] jArr, int i2) {
        this.f14751g = jArr;
        this.f14752h = i2;
    }

    @Override // e.c.b.b.c.e.a6, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* synthetic */ boolean add(Object obj) {
        c(((Long) obj).longValue());
        return true;
    }
}