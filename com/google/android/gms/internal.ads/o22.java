package com.google.android.gms.internal.ads;

import java.util.Iterator;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class o22<K> extends f22<K> {

    /* renamed from: g, reason: collision with root package name */
    private final transient d22<K, ?> f7885g;

    /* renamed from: h, reason: collision with root package name */
    private final transient b22<K> f7886h;

    o22(d22<K, ?> d22Var, b22<K> b22Var) {
        this.f7885g = d22Var;
        this.f7886h = b22Var;
    }

    @Override // com.google.android.gms.internal.ads.y12
    /* renamed from: a */
    public final w22<K> iterator() {
        return this.f7886h.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.y12, java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final boolean contains(@NullableDecl Object obj) {
        return this.f7885g.get(obj) != null;
    }

    @Override // com.google.android.gms.internal.ads.f22, com.google.android.gms.internal.ads.y12
    public final b22<K> h() {
        return this.f7886h;
    }

    @Override // com.google.android.gms.internal.ads.f22, com.google.android.gms.internal.ads.y12, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, j$.util.Collection, java.util.Set, j$.lang.Iterable
    public final /* bridge */ /* synthetic */ Iterator iterator() {
        return this.f7886h.listIterator(0);
    }

    @Override // com.google.android.gms.internal.ads.y12
    final int l(Object[] objArr, int i2) {
        return this.f7886h.l(objArr, i2);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, j$.util.Collection, java.util.Set, j$.util.Set
    public final int size() {
        return this.f7885g.size();
    }
}