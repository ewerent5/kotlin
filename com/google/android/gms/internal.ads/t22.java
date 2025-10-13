package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Objects;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class t22<E> extends f22<E> {

    /* renamed from: g, reason: collision with root package name */
    final transient E f9067g;

    /* renamed from: h, reason: collision with root package name */
    private transient int f9068h;

    t22(E e2) {
        Objects.requireNonNull(e2);
        this.f9067g = e2;
    }

    @Override // com.google.android.gms.internal.ads.y12
    /* renamed from: a */
    public final w22<E> iterator() {
        return new g22(this.f9067g);
    }

    @Override // com.google.android.gms.internal.ads.y12, java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean contains(Object obj) {
        return this.f9067g.equals(obj);
    }

    @Override // com.google.android.gms.internal.ads.f22, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        int i2 = this.f9068h;
        if (i2 != 0) {
            return i2;
        }
        int iHashCode = this.f9067g.hashCode();
        this.f9068h = iHashCode;
        return iHashCode;
    }

    @Override // com.google.android.gms.internal.ads.f22, com.google.android.gms.internal.ads.y12, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return new g22(this.f9067g);
    }

    @Override // com.google.android.gms.internal.ads.y12
    final int l(Object[] objArr, int i2) {
        objArr[i2] = this.f9067g;
        return i2 + 1;
    }

    @Override // com.google.android.gms.internal.ads.f22
    final boolean p() {
        return this.f9068h != 0;
    }

    @Override // com.google.android.gms.internal.ads.f22
    final b22<E> r() {
        return b22.o(this.f9067g);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return 1;
    }

    @Override // java.util.AbstractCollection
    public final String toString() {
        String string = this.f9067g.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2);
        sb.append('[');
        sb.append(string);
        sb.append(']');
        return sb.toString();
    }

    t22(E e2, int i2) {
        this.f9067g = e2;
        this.f9068h = i2;
    }
}