package com.bumptech.glide.t;

/* compiled from: CachedHashCodeArrayMap.java */
/* loaded from: classes.dex */
public final class b<K, V> extends c.e.a<K, V> {

    /* renamed from: m, reason: collision with root package name */
    private int f4238m;

    @Override // c.e.g, java.util.Map, j$.util.Map, java.util.HashMap, java.util.AbstractMap
    public void clear() {
        this.f4238m = 0;
        super.clear();
    }

    @Override // c.e.g, java.util.Map, j$.util.Map
    public int hashCode() {
        if (this.f4238m == 0) {
            this.f4238m = super.hashCode();
        }
        return this.f4238m;
    }

    @Override // c.e.g
    public void j(c.e.g<? extends K, ? extends V> gVar) {
        this.f4238m = 0;
        super.j(gVar);
    }

    @Override // c.e.g
    public V k(int i2) {
        this.f4238m = 0;
        return (V) super.k(i2);
    }

    @Override // c.e.g
    public V l(int i2, V v) {
        this.f4238m = 0;
        return (V) super.l(i2, v);
    }

    @Override // c.e.g, java.util.Map, j$.util.Map
    public V put(K k2, V v) {
        this.f4238m = 0;
        return (V) super.put(k2, v);
    }
}