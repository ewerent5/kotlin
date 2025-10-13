package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ak2 extends mh2<Long> implements RandomAccess, mj2, sk2 {

    /* renamed from: f, reason: collision with root package name */
    private static final ak2 f4929f;

    /* renamed from: g, reason: collision with root package name */
    private long[] f4930g;

    /* renamed from: h, reason: collision with root package name */
    private int f4931h;

    static {
        ak2 ak2Var = new ak2(new long[0], 0);
        f4929f = ak2Var;
        ak2Var.zzb();
    }

    ak2() {
        this(new long[10], 0);
    }

    private final void Z(int i2) {
        if (i2 < 0 || i2 >= this.f4931h) {
            throw new IndexOutOfBoundsException(h(i2));
        }
    }

    public static ak2 c() {
        return f4929f;
    }

    private final String h(int i2) {
        int i3 = this.f4931h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        long jLongValue = ((Long) obj).longValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f4931h)) {
            throw new IndexOutOfBoundsException(h(i2));
        }
        long[] jArr = this.f4930g;
        if (i3 < jArr.length) {
            System.arraycopy(jArr, i2, jArr, i2 + 1, i3 - i2);
        } else {
            long[] jArr2 = new long[((i3 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            System.arraycopy(this.f4930g, i2, jArr2, i2 + 1, this.f4931h - i2);
            this.f4930g = jArr2;
        }
        this.f4930g[i2] = jLongValue;
        this.f4931h++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean addAll(Collection<? extends Long> collection) {
        a();
        oj2.a(collection);
        if (!(collection instanceof ak2)) {
            return super.addAll(collection);
        }
        ak2 ak2Var = (ak2) collection;
        int i2 = ak2Var.f4931h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f4931h;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        long[] jArr = this.f4930g;
        if (i4 > jArr.length) {
            this.f4930g = Arrays.copyOf(jArr, i4);
        }
        System.arraycopy(ak2Var.f4930g, 0, this.f4930g, this.f4931h, ak2Var.f4931h);
        this.f4931h = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final long e(int i2) {
        Z(i2);
        return this.f4930g[i2];
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ak2)) {
            return super.equals(obj);
        }
        ak2 ak2Var = (ak2) obj;
        if (this.f4931h != ak2Var.f4931h) {
            return false;
        }
        long[] jArr = ak2Var.f4930g;
        for (int i2 = 0; i2 < this.f4931h; i2++) {
            if (this.f4930g[i2] != jArr[i2]) {
                return false;
            }
        }
        return true;
    }

    public final void f(long j2) {
        a();
        int i2 = this.f4931h;
        long[] jArr = this.f4930g;
        if (i2 == jArr.length) {
            long[] jArr2 = new long[((i2 * 3) / 2) + 1];
            System.arraycopy(jArr, 0, jArr2, 0, i2);
            this.f4930g = jArr2;
        }
        long[] jArr3 = this.f4930g;
        int i3 = this.f4931h;
        this.f4931h = i3 + 1;
        jArr3[i3] = j2;
    }

    @Override // com.google.android.gms.internal.ads.nj2
    /* renamed from: g, reason: merged with bridge method [inline-methods] */
    public final mj2 v(int i2) {
        if (i2 >= this.f4931h) {
            return new ak2(Arrays.copyOf(this.f4930g, i2), this.f4931h);
        }
        throw new IllegalArgumentException();
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        Z(i2);
        return Long.valueOf(this.f4930g[i2]);
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        int iE = 1;
        for (int i2 = 0; i2 < this.f4931h; i2++) {
            iE = (iE * 31) + oj2.e(this.f4930g[i2]);
        }
        return iE;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Long)) {
            return -1;
        }
        long jLongValue = ((Long) obj).longValue();
        int i2 = this.f4931h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f4930g[i3] == jLongValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        a();
        Z(i2);
        long[] jArr = this.f4930g;
        long j2 = jArr[i2];
        if (i2 < this.f4931h - 1) {
            System.arraycopy(jArr, i2 + 1, jArr, i2, (r3 - i2) - 1);
        }
        this.f4931h--;
        ((AbstractList) this).modCount++;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        long[] jArr = this.f4930g;
        System.arraycopy(jArr, i3, jArr, i2, this.f4931h - i3);
        this.f4931h -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        long jLongValue = ((Long) obj).longValue();
        a();
        Z(i2);
        long[] jArr = this.f4930g;
        long j2 = jArr[i2];
        jArr[i2] = jLongValue;
        return Long.valueOf(j2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f4931h;
    }

    private ak2(long[] jArr, int i2) {
        this.f4930g = jArr;
        this.f4931h = i2;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        f(((Long) obj).longValue());
        return true;
    }
}