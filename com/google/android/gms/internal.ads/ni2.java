package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ni2 extends mh2<Double> implements RandomAccess, nj2, sk2 {

    /* renamed from: f, reason: collision with root package name */
    private static final ni2 f7718f;

    /* renamed from: g, reason: collision with root package name */
    private double[] f7719g;

    /* renamed from: h, reason: collision with root package name */
    private int f7720h;

    static {
        ni2 ni2Var = new ni2(new double[0], 0);
        f7718f = ni2Var;
        ni2Var.zzb();
    }

    ni2() {
        this(new double[10], 0);
    }

    private final void e(int i2) {
        if (i2 < 0 || i2 >= this.f7720h) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    private final String f(int i2) {
        int i3 = this.f7720h;
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
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f7720h)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        double[] dArr = this.f7719g;
        if (i3 < dArr.length) {
            System.arraycopy(dArr, i2, dArr, i2 + 1, i3 - i2);
        } else {
            double[] dArr2 = new double[((i3 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            System.arraycopy(this.f7719g, i2, dArr2, i2 + 1, this.f7720h - i2);
            this.f7719g = dArr2;
        }
        this.f7719g[i2] = dDoubleValue;
        this.f7720h++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean addAll(Collection<? extends Double> collection) {
        a();
        oj2.a(collection);
        if (!(collection instanceof ni2)) {
            return super.addAll(collection);
        }
        ni2 ni2Var = (ni2) collection;
        int i2 = ni2Var.f7720h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f7720h;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        double[] dArr = this.f7719g;
        if (i4 > dArr.length) {
            this.f7719g = Arrays.copyOf(dArr, i4);
        }
        System.arraycopy(ni2Var.f7719g, 0, this.f7719g, this.f7720h, ni2Var.f7720h);
        this.f7720h = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(double d2) {
        a();
        int i2 = this.f7720h;
        double[] dArr = this.f7719g;
        if (i2 == dArr.length) {
            double[] dArr2 = new double[((i2 * 3) / 2) + 1];
            System.arraycopy(dArr, 0, dArr2, 0, i2);
            this.f7719g = dArr2;
        }
        double[] dArr3 = this.f7719g;
        int i3 = this.f7720h;
        this.f7720h = i3 + 1;
        dArr3[i3] = d2;
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
        if (!(obj instanceof ni2)) {
            return super.equals(obj);
        }
        ni2 ni2Var = (ni2) obj;
        if (this.f7720h != ni2Var.f7720h) {
            return false;
        }
        double[] dArr = ni2Var.f7719g;
        for (int i2 = 0; i2 < this.f7720h; i2++) {
            if (Double.doubleToLongBits(this.f7719g[i2]) != Double.doubleToLongBits(dArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        e(i2);
        return Double.valueOf(this.f7719g[i2]);
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        int iE = 1;
        for (int i2 = 0; i2 < this.f7720h; i2++) {
            iE = (iE * 31) + oj2.e(Double.doubleToLongBits(this.f7719g[i2]));
        }
        return iE;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Double)) {
            return -1;
        }
        double dDoubleValue = ((Double) obj).doubleValue();
        int i2 = this.f7720h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f7719g[i3] == dDoubleValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        a();
        e(i2);
        double[] dArr = this.f7719g;
        double d2 = dArr[i2];
        if (i2 < this.f7720h - 1) {
            System.arraycopy(dArr, i2 + 1, dArr, i2, (r3 - i2) - 1);
        }
        this.f7720h--;
        ((AbstractList) this).modCount++;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        double[] dArr = this.f7719g;
        System.arraycopy(dArr, i3, dArr, i2, this.f7720h - i3);
        this.f7720h -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        double dDoubleValue = ((Double) obj).doubleValue();
        a();
        e(i2);
        double[] dArr = this.f7719g;
        double d2 = dArr[i2];
        dArr[i2] = dDoubleValue;
        return Double.valueOf(d2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f7720h;
    }

    @Override // com.google.android.gms.internal.ads.nj2
    public final /* bridge */ /* synthetic */ nj2 v(int i2) {
        if (i2 >= this.f7720h) {
            return new ni2(Arrays.copyOf(this.f7719g, i2), this.f7720h);
        }
        throw new IllegalArgumentException();
    }

    private ni2(double[] dArr, int i2) {
        this.f7719g = dArr;
        this.f7720h = i2;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c(((Double) obj).doubleValue());
        return true;
    }
}