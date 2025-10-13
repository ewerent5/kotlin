package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class n22<K, V> extends f22<Map.Entry<K, V>> {

    /* renamed from: g, reason: collision with root package name */
    private final transient d22<K, V> f7637g;

    /* renamed from: h, reason: collision with root package name */
    private final transient Object[] f7638h;

    /* renamed from: i, reason: collision with root package name */
    private final transient int f7639i;

    n22(d22<K, V> d22Var, Object[] objArr, int i2, int i3) {
        this.f7637g = d22Var;
        this.f7638h = objArr;
        this.f7639i = i3;
    }

    @Override // com.google.android.gms.internal.ads.y12
    /* renamed from: a */
    public final w22<Map.Entry<K, V>> iterator() {
        return h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.y12, java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.f7637g.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.f22, com.google.android.gms.internal.ads.y12, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return h().listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.y12
    final int l(Object[] objArr, int i2) {
        return h().l(objArr, i2);
    }

    @Override // com.google.android.gms.internal.ads.f22
    final b22<Map.Entry<K, V>> r() {
        return new m22(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f7639i;
    }
}