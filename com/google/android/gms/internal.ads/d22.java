package com.google.android.gms.internal.ads;

import ch.qos.logback.core.CoreConstants;
import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class d22<K, V> implements Map<K, V>, Serializable, j$.util.Map {

    /* renamed from: e, reason: collision with root package name */
    private transient f22<Map.Entry<K, V>> f5416e;

    /* renamed from: f, reason: collision with root package name */
    private transient f22<K> f5417f;

    /* renamed from: g, reason: collision with root package name */
    private transient y12<V> f5418g;

    d22() {
    }

    public static <K, V> d22<K, V> a(K k2, V v) {
        s12.a(k2, v);
        return q22.h(1, new Object[]{k2, v});
    }

    public static <K, V> c22<K, V> b(int i2) {
        return new c22<>(7);
    }

    @Override // java.util.Map, j$.util.Map
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final f22<Map.Entry<K, V>> entrySet() {
        f22<Map.Entry<K, V>> f22Var = this.f5416e;
        if (f22Var != null) {
            return f22Var;
        }
        f22<Map.Entry<K, V>> f22VarD = d();
        this.f5416e = f22VarD;
        return f22VarD;
    }

    @Override // java.util.Map, j$.util.Map, java.util.HashMap, java.util.AbstractMap
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // j$.util.Map
    public /* synthetic */ Object compute(Object obj, BiFunction biFunction) {
        return Map.CC.$default$compute(this, obj, biFunction);
    }

    @Override // j$.util.Map
    public /* synthetic */ Object computeIfAbsent(Object obj, Function function) {
        return Map.CC.$default$computeIfAbsent(this, obj, function);
    }

    @Override // j$.util.Map
    public /* synthetic */ Object computeIfPresent(Object obj, BiFunction biFunction) {
        return Map.CC.$default$computeIfPresent(this, obj, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean containsValue(@NullableDecl Object obj) {
        return values().contains(obj);
    }

    abstract f22<Map.Entry<K, V>> d();

    abstract f22<K> e();

    @Override // java.util.Map, j$.util.Map
    public final boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // java.util.Map, j$.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final y12<V> values() {
        y12<V> y12Var = this.f5418g;
        if (y12Var != null) {
            return y12Var;
        }
        y12<V> y12VarG = g();
        this.f5418g = y12VarG;
        return y12VarG;
    }

    @Override // j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    abstract y12<V> g();

    @Override // java.util.Map, j$.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map, j$.util.Map
    public final int hashCode() {
        return s22.a(entrySet());
    }

    @Override // java.util.Map, j$.util.Map
    public final boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public final /* bridge */ /* synthetic */ Set keySet() {
        f22<K> f22Var = this.f5417f;
        if (f22Var != null) {
            return f22Var;
        }
        f22<K> f22VarE = e();
        this.f5417f = f22VarE;
        return f22VarE;
    }

    @Override // j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final V put(K k2, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    public final String toString() {
        int size = size();
        s12.b(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(size * 8, 1073741824L));
        sb.append(CoreConstants.CURLY_LEFT);
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
            z = false;
        }
        sb.append(CoreConstants.CURLY_RIGHT);
        return sb.toString();
    }
}