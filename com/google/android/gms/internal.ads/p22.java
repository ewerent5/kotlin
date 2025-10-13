package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class p22 extends b22<Object> {

    /* renamed from: g, reason: collision with root package name */
    private final transient Object[] f8072g;

    /* renamed from: h, reason: collision with root package name */
    private final transient int f8073h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f8074i;

    p22(Object[] objArr, int i2, int i3) {
        this.f8072g = objArr;
        this.f8073h = i2;
        this.f8074i = i3;
    }

    @Override // java.util.List, j$.util.List
    public final Object get(int i2) {
        h12.d(i2, this.f8074i, "index");
        return this.f8072g[i2 + i2 + this.f8073h];
    }

    @Override // com.google.android.gms.internal.ads.y12
    final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f8074i;
    }
}