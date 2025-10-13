package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class r22<E> extends f22<E> {

    /* renamed from: g, reason: collision with root package name */
    static final r22<Object> f8565g = new r22<>(new Object[0], 0, null, 0, 0);

    /* renamed from: h, reason: collision with root package name */
    final transient Object[] f8566h;

    /* renamed from: i, reason: collision with root package name */
    final transient Object[] f8567i;

    /* renamed from: j, reason: collision with root package name */
    private final transient int f8568j;

    /* renamed from: k, reason: collision with root package name */
    private final transient int f8569k;

    /* renamed from: l, reason: collision with root package name */
    private final transient int f8570l;

    r22(Object[] objArr, int i2, Object[] objArr2, int i3, int i4) {
        this.f8566h = objArr;
        this.f8567i = objArr2;
        this.f8568j = i3;
        this.f8569k = i2;
        this.f8570l = i4;
    }

    @Override // com.google.android.gms.internal.ads.y12
    /* renamed from: a */
    public final w22<E> iterator() {
        return h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.y12
    final Object[] c() {
        return this.f8566h;
    }

    @Override // com.google.android.gms.internal.ads.y12, java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        Object[] objArr = this.f8567i;
        if (obj == null || objArr == null) {
            return false;
        }
        int iA = u12.a(obj.hashCode());
        while (true) {
            int i2 = iA & this.f8568j;
            Object obj2 = objArr[i2];
            if (obj2 == null) {
                return false;
            }
            if (obj2.equals(obj)) {
                return true;
            }
            iA = i2 + 1;
        }
    }

    @Override // com.google.android.gms.internal.ads.y12
    final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.y12
    final int f() {
        return this.f8570l;
    }

    @Override // com.google.android.gms.internal.ads.f22, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int hashCode() {
        return this.f8569k;
    }

    @Override // com.google.android.gms.internal.ads.f22, com.google.android.gms.internal.ads.y12, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.y12
    final int l(Object[] objArr, int i2) {
        System.arraycopy(this.f8566h, 0, objArr, i2, this.f8570l);
        return i2 + this.f8570l;
    }

    @Override // com.google.android.gms.internal.ads.f22
    final boolean p() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.f22
    final b22<E> r() {
        return b22.x(this.f8566h, this.f8570l);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f8570l;
    }
}