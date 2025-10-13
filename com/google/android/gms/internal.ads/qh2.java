package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class qh2 extends mh2<Boolean> implements RandomAccess, nj2, sk2 {

    /* renamed from: f, reason: collision with root package name */
    private static final qh2 f8384f;

    /* renamed from: g, reason: collision with root package name */
    private boolean[] f8385g;

    /* renamed from: h, reason: collision with root package name */
    private int f8386h;

    static {
        qh2 qh2Var = new qh2(new boolean[0], 0);
        f8384f = qh2Var;
        qh2Var.zzb();
    }

    qh2() {
        this(new boolean[10], 0);
    }

    private final void e(int i2) {
        if (i2 < 0 || i2 >= this.f8386h) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    private final String f(int i2) {
        int i3 = this.f8386h;
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
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f8386h)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        boolean[] zArr = this.f8385g;
        if (i3 < zArr.length) {
            System.arraycopy(zArr, i2, zArr, i2 + 1, i3 - i2);
        } else {
            boolean[] zArr2 = new boolean[((i3 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            System.arraycopy(this.f8385g, i2, zArr2, i2 + 1, this.f8386h - i2);
            this.f8385g = zArr2;
        }
        this.f8385g[i2] = zBooleanValue;
        this.f8386h++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean addAll(Collection<? extends Boolean> collection) {
        a();
        oj2.a(collection);
        if (!(collection instanceof qh2)) {
            return super.addAll(collection);
        }
        qh2 qh2Var = (qh2) collection;
        int i2 = qh2Var.f8386h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f8386h;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        boolean[] zArr = this.f8385g;
        if (i4 > zArr.length) {
            this.f8385g = Arrays.copyOf(zArr, i4);
        }
        System.arraycopy(qh2Var.f8385g, 0, this.f8385g, this.f8386h, qh2Var.f8386h);
        this.f8386h = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(boolean z) {
        a();
        int i2 = this.f8386h;
        boolean[] zArr = this.f8385g;
        if (i2 == zArr.length) {
            boolean[] zArr2 = new boolean[((i2 * 3) / 2) + 1];
            System.arraycopy(zArr, 0, zArr2, 0, i2);
            this.f8385g = zArr2;
        }
        boolean[] zArr3 = this.f8385g;
        int i3 = this.f8386h;
        this.f8386h = i3 + 1;
        zArr3[i3] = z;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean contains(Object obj) {
        return indexOf(obj) != -1;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qh2)) {
            return super.equals(obj);
        }
        qh2 qh2Var = (qh2) obj;
        if (this.f8386h != qh2Var.f8386h) {
            return false;
        }
        boolean[] zArr = qh2Var.f8385g;
        for (int i2 = 0; i2 < this.f8386h; i2++) {
            if (this.f8385g[i2] != zArr[i2]) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        e(i2);
        return Boolean.valueOf(this.f8385g[i2]);
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        int iF = 1;
        for (int i2 = 0; i2 < this.f8386h; i2++) {
            iF = (iF * 31) + oj2.f(this.f8385g[i2]);
        }
        return iF;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Boolean)) {
            return -1;
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        int i2 = this.f8386h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f8385g[i3] == zBooleanValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        a();
        e(i2);
        boolean[] zArr = this.f8385g;
        boolean z = zArr[i2];
        if (i2 < this.f8386h - 1) {
            System.arraycopy(zArr, i2 + 1, zArr, i2, (r2 - i2) - 1);
        }
        this.f8386h--;
        ((AbstractList) this).modCount++;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        boolean[] zArr = this.f8385g;
        System.arraycopy(zArr, i3, zArr, i2, this.f8386h - i3);
        this.f8386h -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        a();
        e(i2);
        boolean[] zArr = this.f8385g;
        boolean z = zArr[i2];
        zArr[i2] = zBooleanValue;
        return Boolean.valueOf(z);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f8386h;
    }

    @Override // com.google.android.gms.internal.ads.nj2
    public final /* bridge */ /* synthetic */ nj2 v(int i2) {
        if (i2 >= this.f8386h) {
            return new qh2(Arrays.copyOf(this.f8385g, i2), this.f8386h);
        }
        throw new IllegalArgumentException();
    }

    private qh2(boolean[] zArr, int i2) {
        this.f8385g = zArr;
        this.f8386h = i2;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c(((Boolean) obj).booleanValue());
        return true;
    }
}