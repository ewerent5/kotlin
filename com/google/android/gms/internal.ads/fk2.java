package com.google.android.gms.internal.ads;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class fk2<K, V> extends LinkedHashMap<K, V> implements Map {

    /* renamed from: e, reason: collision with root package name */
    private static final fk2 f5887e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f5888f;

    static {
        fk2 fk2Var = new fk2();
        f5887e = fk2Var;
        fk2Var.f5888f = false;
    }

    private fk2() {
        this.f5888f = true;
    }

    public static <K, V> fk2<K, V> a() {
        return f5887e;
    }

    private static int g(Object obj) {
        if (obj instanceof byte[]) {
            return oj2.g((byte[]) obj);
        }
        if (obj instanceof gj2) {
            throw new UnsupportedOperationException();
        }
        return obj.hashCode();
    }

    private final void h() {
        if (!this.f5888f) {
            throw new UnsupportedOperationException();
        }
    }

    public final void b(fk2<K, V> fk2Var) {
        h();
        if (fk2Var.isEmpty()) {
            return;
        }
        putAll(fk2Var);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map, j$.util.Map
    public final void clear() {
        h();
        super.clear();
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

    public final fk2<K, V> d() {
        return isEmpty() ? new fk2<>() : new fk2<>(this);
    }

    public final void e() {
        this.f5888f = false;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        return isEmpty() ? Collections.emptySet() : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        if (!(obj instanceof java.util.Map)) {
            return false;
        }
        java.util.Map map = (java.util.Map) obj;
        if (this == map) {
            return true;
        }
        if (size() != map.size()) {
            return false;
        }
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!map.containsKey(entry.getKey())) {
                return false;
            }
            V value = entry.getValue();
            Object obj2 = map.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj2 instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj2) : value.equals(obj2))) {
                return false;
            }
        }
        return true;
    }

    public final boolean f() {
        return this.f5888f;
    }

    @Override // j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final int hashCode() {
        int iG = 0;
        for (Map.Entry<K, V> entry : entrySet()) {
            iG += g(entry.getValue()) ^ g(entry.getKey());
        }
        return iG;
    }

    @Override // j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map, j$.util.Map
    public final V put(K k2, V v) {
        h();
        oj2.a(k2);
        oj2.a(v);
        return (V) super.put(k2, v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map, j$.util.Map
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        h();
        for (K k2 : map.keySet()) {
            oj2.a(k2);
            oj2.a(map.get(k2));
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map, j$.util.Map
    public final V remove(Object obj) {
        h();
        return (V) super.remove(obj);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ boolean remove(Object obj, Object obj2) {
        return Map.CC.$default$remove(this, obj, obj2);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ Object replace(Object obj, Object obj2) {
        return Map.CC.$default$replace(this, obj, obj2);
    }

    @Override // java.util.HashMap, java.util.Map, j$.util.Map
    public /* synthetic */ boolean replace(Object obj, Object obj2, Object obj3) {
        return Map.CC.$default$replace(this, obj, obj2, obj3);
    }

    @Override // j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    private fk2(java.util.Map<K, V> map) {
        super(map);
        this.f5888f = true;
    }
}