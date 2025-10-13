package com.google.android.gms.internal.ads;

import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class a22 extends b22 {

    /* renamed from: g, reason: collision with root package name */
    final transient int f4822g;

    /* renamed from: h, reason: collision with root package name */
    final transient int f4823h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ b22 f4824i;

    a22(b22 b22Var, int i2, int i3) {
        this.f4824i = b22Var;
        this.f4822g = i2;
        this.f4823h = i3;
    }

    @Override // com.google.android.gms.internal.ads.y12
    final Object[] c() {
        return this.f4824i.c();
    }

    @Override // com.google.android.gms.internal.ads.y12
    final int e() {
        return this.f4824i.e() + this.f4822g;
    }

    @Override // com.google.android.gms.internal.ads.y12
    final int f() {
        return this.f4824i.e() + this.f4822g + this.f4823h;
    }

    @Override // java.util.List, j$.util.List
    public final Object get(int i2) {
        h12.d(i2, this.f4823h, "index");
        return this.f4824i.get(i2 + this.f4822g);
    }

    @Override // com.google.android.gms.internal.ads.y12
    final boolean k() {
        return true;
    }

    @Override // com.google.android.gms.internal.ads.b22
    /* renamed from: m */
    public final b22 subList(int i2, int i3) {
        h12.f(i2, i3, this.f4823h);
        b22 b22Var = this.f4824i;
        int i4 = this.f4822g;
        return b22Var.subList(i2 + i4, i3 + i4);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f4823h;
    }

    @Override // com.google.android.gms.internal.ads.b22, java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ List subList(int i2, int i3) {
        return subList(i2, i3);
    }
}