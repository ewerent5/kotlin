package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class fj2 extends mh2<Integer> implements RandomAccess, jj2, sk2 {

    /* renamed from: f, reason: collision with root package name */
    private static final fj2 f5884f;

    /* renamed from: g, reason: collision with root package name */
    private int[] f5885g;

    /* renamed from: h, reason: collision with root package name */
    private int f5886h;

    static {
        fj2 fj2Var = new fj2(new int[0], 0);
        f5884f = fj2Var;
        fj2Var.zzb();
    }

    fj2() {
        this(new int[10], 0);
    }

    public static fj2 c() {
        return f5884f;
    }

    private final void f(int i2) {
        if (i2 < 0 || i2 >= this.f5886h) {
            throw new IndexOutOfBoundsException(h(i2));
        }
    }

    private final String h(int i2) {
        int i3 = this.f5886h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.jj2
    public final void Z(int i2) {
        a();
        int i3 = this.f5886h;
        int[] iArr = this.f5885g;
        if (i3 == iArr.length) {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i3);
            this.f5885g = iArr2;
        }
        int[] iArr3 = this.f5885g;
        int i4 = this.f5886h;
        this.f5886h = i4 + 1;
        iArr3[i4] = i2;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ void add(int i2, Object obj) {
        int i3;
        int iIntValue = ((Integer) obj).intValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f5886h)) {
            throw new IndexOutOfBoundsException(h(i2));
        }
        int[] iArr = this.f5885g;
        if (i3 < iArr.length) {
            System.arraycopy(iArr, i2, iArr, i2 + 1, i3 - i2);
        } else {
            int[] iArr2 = new int[((i3 * 3) / 2) + 1];
            System.arraycopy(iArr, 0, iArr2, 0, i2);
            System.arraycopy(this.f5885g, i2, iArr2, i2 + 1, this.f5886h - i2);
            this.f5885g = iArr2;
        }
        this.f5885g[i2] = iIntValue;
        this.f5886h++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean addAll(Collection<? extends Integer> collection) {
        a();
        oj2.a(collection);
        if (!(collection instanceof fj2)) {
            return super.addAll(collection);
        }
        fj2 fj2Var = (fj2) collection;
        int i2 = fj2Var.f5886h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f5886h;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        int[] iArr = this.f5885g;
        if (i4 > iArr.length) {
            this.f5885g = Arrays.copyOf(iArr, i4);
        }
        System.arraycopy(fj2Var.f5885g, 0, this.f5885g, this.f5886h, fj2Var.f5886h);
        this.f5886h = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    public final int e(int i2) {
        f(i2);
        return this.f5885g[i2];
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fj2)) {
            return super.equals(obj);
        }
        fj2 fj2Var = (fj2) obj;
        if (this.f5886h != fj2Var.f5886h) {
            return false;
        }
        int[] iArr = fj2Var.f5885g;
        for (int i2 = 0; i2 < this.f5886h; i2++) {
            if (this.f5885g[i2] != iArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        f(i2);
        return Integer.valueOf(this.f5885g[i2]);
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        int i2 = 1;
        for (int i3 = 0; i3 < this.f5886h; i3++) {
            i2 = (i2 * 31) + this.f5885g[i3];
        }
        return i2;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Integer)) {
            return -1;
        }
        int iIntValue = ((Integer) obj).intValue();
        int i2 = this.f5886h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f5885g[i3] == iIntValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.nj2
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    public final jj2 v(int i2) {
        if (i2 >= this.f5886h) {
            return new fj2(Arrays.copyOf(this.f5885g, i2), this.f5886h);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        a();
        f(i2);
        int[] iArr = this.f5885g;
        int i3 = iArr[i2];
        if (i2 < this.f5886h - 1) {
            System.arraycopy(iArr, i2 + 1, iArr, i2, (r2 - i2) - 1);
        }
        this.f5886h--;
        ((AbstractList) this).modCount++;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        int[] iArr = this.f5885g;
        System.arraycopy(iArr, i3, iArr, i2, this.f5886h - i3);
        this.f5886h -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        int iIntValue = ((Integer) obj).intValue();
        a();
        f(i2);
        int[] iArr = this.f5885g;
        int i3 = iArr[i2];
        iArr[i2] = iIntValue;
        return Integer.valueOf(i3);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f5886h;
    }

    private fj2(int[] iArr, int i2) {
        this.f5885g = iArr;
        this.f5886h = i2;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        Z(((Integer) obj).intValue());
        return true;
    }
}