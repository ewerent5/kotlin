package com.google.android.gms.internal.ads;

import java.util.AbstractList;
import java.util.Arrays;
import java.util.RandomAccess;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class uk2<E> extends mh2<E> implements RandomAccess {

    /* renamed from: f, reason: collision with root package name */
    private static final uk2<Object> f9487f;

    /* renamed from: g, reason: collision with root package name */
    private E[] f9488g;

    /* renamed from: h, reason: collision with root package name */
    private int f9489h;

    static {
        uk2<Object> uk2Var = new uk2<>(new Object[0], 0);
        f9487f = uk2Var;
        uk2Var.zzb();
    }

    private uk2(E[] eArr, int i2) {
        this.f9488g = eArr;
        this.f9489h = i2;
    }

    public static <E> uk2<E> c() {
        return (uk2<E>) f9487f;
    }

    private final void e(int i2) {
        if (i2 < 0 || i2 >= this.f9489h) {
            throw new IndexOutOfBoundsException(f(i2));
        }
    }

    private final String f(int i2) {
        int i3 = this.f9489h;
        StringBuilder sb = new StringBuilder(35);
        sb.append("Index:");
        sb.append(i2);
        sb.append(", Size:");
        sb.append(i3);
        return sb.toString();
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final void add(int i2, E e2) {
        int i3;
        a();
        if (i2 < 0 || i2 > (i3 = this.f9489h)) {
            throw new IndexOutOfBoundsException(f(i2));
        }
        E[] eArr = this.f9488g;
        if (i3 < eArr.length) {
            System.arraycopy(eArr, i2, eArr, i2 + 1, i3 - i2);
        } else {
            E[] eArr2 = (E[]) new Object[((i3 * 3) / 2) + 1];
            System.arraycopy(eArr, 0, eArr2, 0, i2);
            System.arraycopy(this.f9488g, i2, eArr2, i2 + 1, this.f9489h - i2);
            this.f9488g = eArr2;
        }
        this.f9488g[i2] = e2;
        this.f9489h++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final E get(int i2) {
        e(i2);
        return this.f9488g[i2];
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.List, j$.util.List
    public final E remove(int i2) {
        a();
        e(i2);
        E[] eArr = this.f9488g;
        E e2 = eArr[i2];
        if (i2 < this.f9489h - 1) {
            System.arraycopy(eArr, i2 + 1, eArr, i2, (r2 - i2) - 1);
        }
        this.f9489h--;
        ((AbstractList) this).modCount++;
        return e2;
    }

    @Override // java.util.AbstractList, java.util.List, j$.util.List
    public final E set(int i2, E e2) {
        a();
        e(i2);
        E[] eArr = this.f9488g;
        E e3 = eArr[i2];
        eArr[i2] = e2;
        ((AbstractList) this).modCount++;
        return e3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f9489h;
    }

    @Override // com.google.android.gms.internal.ads.nj2
    public final /* bridge */ /* synthetic */ nj2 v(int i2) {
        if (i2 >= this.f9489h) {
            return new uk2(Arrays.copyOf(this.f9488g, i2), this.f9489h);
        }
        throw new IllegalArgumentException();
    }

    @Override // com.google.android.gms.internal.ads.mh2, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List, j$.util.List, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean add(E e2) {
        a();
        int i2 = this.f9489h;
        E[] eArr = this.f9488g;
        if (i2 == eArr.length) {
            this.f9488g = (E[]) Arrays.copyOf(eArr, ((i2 * 3) / 2) + 1);
        }
        E[] eArr2 = this.f9488g;
        int i3 = this.f9489h;
        this.f9489h = i3 + 1;
        eArr2[i3] = e2;
        ((AbstractList) this).modCount++;
        return true;
    }
}