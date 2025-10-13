package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class l22<E> extends b22<E> {

    /* renamed from: g, reason: collision with root package name */
    static final b22<Object> f7168g = new l22(new Object[0], 0);

    /* renamed from: h, reason: collision with root package name */
    final transient Object[] f7169h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f7170i;

    l22(Object[] objArr, int i2) {
        this.f7169h = objArr;
        this.f7170i = i2;
    }

    @Override // com.google.android.gms.internal.ads.y12
    final Object[] c() {
        return this.f7169h;
    }

    @Override // com.google.android.gms.internal.ads.y12
    final int e() {
        return 0;
    }

    @Override // com.google.android.gms.internal.ads.y12
    final int f() {
        return this.f7170i;
    }

    @Override // java.util.List, j$.util.List
    public final E get(int i2) {
        h12.d(i2, this.f7170i, "index");
        return (E) this.f7169h[i2];
    }

    @Override // com.google.android.gms.internal.ads.y12
    final boolean k() {
        return false;
    }

    @Override // com.google.android.gms.internal.ads.b22, com.google.android.gms.internal.ads.y12
    final int l(Object[] objArr, int i2) {
        System.arraycopy(this.f7169h, 0, objArr, i2, this.f7170i);
        return i2 + this.f7170i;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f7170i;
    }
}