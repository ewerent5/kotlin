package com.google.android.gms.internal.ads;

import java.util.AbstractMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class m22 extends b22<Map.Entry> {

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ n22 f7410g;

    m22(n22 n22Var) {
        this.f7410g = n22Var;
    }

    @Override // java.util.List, j$.util.List
    public final /* bridge */ /* synthetic */ Object get(int i2) {
        h12.d(i2, this.f7410g.f7639i, "index");
        int i3 = i2 + i2;
        return new AbstractMap.SimpleImmutableEntry(this.f7410g.f7638h[i3], this.f7410g.f7638h[i3 + 1]);
    }

    @Override // com.google.android.gms.internal.ads.y12
    public final boolean k() {
        return true;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f7410g.f7639i;
    }
}