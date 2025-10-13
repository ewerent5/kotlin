package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class yi2 extends mh2<Float> implements RandomAccess, nj2, sk2 {

    /* renamed from: f, reason: collision with root package name */
    private static final yi2 f10430f;

    /* renamed from: g, reason: collision with root package name */
    private float[] f10431g;

    /* renamed from: h, reason: collision with root package name */
    private int f10432h;

    static {
        yi2 yi2Var = new yi2(new float[0], 0);
        f10430f = yi2Var;
        yi2Var.zzb();
    }

    yi2() {
        this(new float[10], 0);
    }

    private final void e(int i2) {
        if (i2 < 0 || i2 >= this.f10432h) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    private final String f(int i2) {
        int i3 = this.f10432h;
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
        float fFloatValue = ((Float) obj).floatValue();
        a();
        if (i2 < 0 || i2 > (i3 = this.f10432h)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        float[] fArr = this.f10431g;
        if (i3 < fArr.length) {
            System.arraycopy(fArr, i2, fArr, i2 + 1, i3 - i2);
        } else {
            float[] fArr2 = new float[((i3 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            System.arraycopy(this.f10431g, i2, fArr2, i2 + 1, this.f10432h - i2);
            this.f10431g = fArr2;
        }
        this.f10431g[i2] = fFloatValue;
        this.f10432h++;
        ((AbstractList) this).modCount++;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean addAll(Collection<? extends Float> collection) {
        a();
        oj2.a(collection);
        if (!(collection instanceof yi2)) {
            return super.addAll(collection);
        }
        yi2 yi2Var = (yi2) collection;
        int i2 = yi2Var.f10432h;
        if (i2 == 0) {
            return false;
        }
        int i3 = this.f10432h;
        if (Integer.MAX_VALUE - i3 < i2) {
            throw new OutOfMemoryError();
        }
        int i4 = i3 + i2;
        float[] fArr = this.f10431g;
        if (i4 > fArr.length) {
            this.f10431g = Arrays.copyOf(fArr, i4);
        }
        System.arraycopy(yi2Var.f10431g, 0, this.f10431g, this.f10432h, yi2Var.f10432h);
        this.f10432h = i4;
        ((AbstractList) this).modCount++;
        return true;
    }

    public final void c(float f2) {
        a();
        int i2 = this.f10432h;
        float[] fArr = this.f10431g;
        if (i2 == fArr.length) {
            float[] fArr2 = new float[((i2 * 3) / 2) + 1];
            System.arraycopy(fArr, 0, fArr2, 0, i2);
            this.f10431g = fArr2;
        }
        float[] fArr3 = this.f10431g;
        int i3 = this.f10432h;
        this.f10432h = i3 + 1;
        fArr3[i3] = f2;
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
        if (!(obj instanceof yi2)) {
            return super.equals(obj);
        }
        yi2 yi2Var = (yi2) obj;
        if (this.f10432h != yi2Var.f10432h) {
            return false;
        }
        float[] fArr = yi2Var.f10431g;
        for (int i2 = 0; i2 < this.f10432h; i2++) {
            if (Float.floatToIntBits(this.f10431g[i2]) != Float.floatToIntBits(fArr[i2])) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        e(i2);
        return Float.valueOf(this.f10431g[i2]);
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        int iFloatToIntBits = 1;
        for (int i2 = 0; i2 < this.f10432h; i2++) {
            iFloatToIntBits = (iFloatToIntBits * 31) + Float.floatToIntBits(this.f10431g[i2]);
        }
        return iFloatToIntBits;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Float)) {
            return -1;
        }
        float fFloatValue = ((Float) obj).floatValue();
        int i2 = this.f10432h;
        for (int i3 = 0; i3 < i2; i3++) {
            if (this.f10431g[i3] == fFloatValue) {
                return i3;
            }
        }
        return -1;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object remove(int i2) {
        a();
        e(i2);
        float[] fArr = this.f10431g;
        float f2 = fArr[i2];
        if (i2 < this.f10432h - 1) {
            System.arraycopy(fArr, i2 + 1, fArr, i2, (r2 - i2) - 1);
        }
        this.f10432h--;
        ((AbstractList) this).modCount++;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractList
    protected final void removeRange(int i2, int i3) {
        a();
        if (i3 < i2) {
            throw new IndexOutOfBoundsException("toIndex < fromIndex");
        }
        float[] fArr = this.f10431g;
        System.arraycopy(fArr, i3, fArr, i2, this.f10432h - i3);
        this.f10432h -= i3 - i2;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object set(int i2, Object obj) {
        float fFloatValue = ((Float) obj).floatValue();
        a();
        e(i2);
        float[] fArr = this.f10431g;
        float f2 = fArr[i2];
        fArr[i2] = fFloatValue;
        return Float.valueOf(f2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f10432h;
    }

    @Override // com.google.android.gms.internal.ads.nj2
    public final /* bridge */ /* synthetic */ nj2 v(int i2) {
        if (i2 >= this.f10432h) {
            return new yi2(Arrays.copyOf(this.f10431g, i2), this.f10432h);
        }
        throw new IllegalArgumentException();
    }

    private yi2(float[] fArr, int i2) {
        this.f10431g = fArr;
        this.f10432h = i2;
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        c(((Float) obj).floatValue());
        return true;
    }
}