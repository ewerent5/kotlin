package com.google.android.gms.internal.ads;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
class nl2<K extends Comparable<K>, V> extends AbstractMap<K, V> implements Map {

    /* renamed from: e, reason: collision with root package name */
    private final int f7735e;

    /* renamed from: h, reason: collision with root package name */
    private boolean f7738h;

    /* renamed from: i, reason: collision with root package name */
    private volatile ml2 f7739i;

    /* renamed from: f, reason: collision with root package name */
    private List<kl2> f7736f = Collections.emptyList();

    /* renamed from: g, reason: collision with root package name */
    private java.util.Map<K, V> f7737g = Collections.emptyMap();

    /* renamed from: j, reason: collision with root package name */
    private java.util.Map<K, V> f7740j = Collections.emptyMap();

    /* JADX INFO: Access modifiers changed from: private */
    public final V k(int i2) {
        m();
        V v = (V) this.f7736f.remove(i2).getValue();
        if (!this.f7737g.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = n().entrySet().iterator();
            List<kl2> list = this.f7736f;
            Map.Entry<K, V> next = it.next();
            list.add(new kl2(this, next.getKey(), next.getValue()));
            it.remove();
        }
        return v;
    }

    private final int l(K k2) {
        int size = this.f7736f.size() - 1;
        int i2 = 0;
        if (size >= 0) {
            int iCompareTo = k2.compareTo(this.f7736f.get(size).a());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int iCompareTo2 = k2.compareTo(this.f7736f.get(i3).a());
            if (iCompareTo2 < 0) {
                size = i3 - 1;
            } else {
                if (iCompareTo2 <= 0) {
                    return i3;
                }
                i2 = i3 + 1;
            }
        }
        return -(i2 + 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void m() {
        if (this.f7738h) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> n() {
        m();
        if (this.f7737g.isEmpty() && !(this.f7737g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f7737g = treeMap;
            this.f7740j = treeMap.descendingMap();
        }
        return (SortedMap) this.f7737g;
    }

    public void a() {
        if (this.f7738h) {
            return;
        }
        this.f7737g = this.f7737g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7737g);
        this.f7740j = this.f7740j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f7740j);
        this.f7738h = true;
    }

    public final boolean b() {
        return this.f7738h;
    }

    public final int c() {
        return this.f7736f.size();
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map, java.util.HashMap
    public final void clear() {
        m();
        if (!this.f7736f.isEmpty()) {
            this.f7736f.clear();
        }
        if (this.f7737g.isEmpty()) {
            return;
        }
        this.f7737g.clear();
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

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return l(comparable) >= 0 || this.f7737g.containsKey(comparable);
    }

    public final Map.Entry<K, V> d(int i2) {
        return this.f7736f.get(i2);
    }

    public final Iterable<Map.Entry<K, V>> e() {
        return this.f7737g.isEmpty() ? jl2.a() : this.f7737g.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f7739i == null) {
            this.f7739i = new ml2(this, null);
        }
        return this.f7739i;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nl2)) {
            return super.equals(obj);
        }
        nl2 nl2Var = (nl2) obj;
        int size = size();
        if (size != nl2Var.size()) {
            return false;
        }
        int iC = c();
        if (iC != nl2Var.c()) {
            return entrySet().equals(nl2Var.entrySet());
        }
        for (int i2 = 0; i2 < iC; i2++) {
            if (!d(i2).equals(nl2Var.d(i2))) {
                return false;
            }
        }
        if (iC != size) {
            return this.f7737g.equals(nl2Var.f7737g);
        }
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v) {
        m();
        int iL = l(k2);
        if (iL >= 0) {
            return (V) this.f7736f.get(iL).setValue(v);
        }
        m();
        if (this.f7736f.isEmpty() && !(this.f7736f instanceof ArrayList)) {
            this.f7736f = new ArrayList(this.f7735e);
        }
        int i2 = -(iL + 1);
        if (i2 >= this.f7735e) {
            return n().put(k2, v);
        }
        int size = this.f7736f.size();
        int i3 = this.f7735e;
        if (size == i3) {
            kl2 kl2VarRemove = this.f7736f.remove(i3 - 1);
            n().put(kl2VarRemove.a(), kl2VarRemove.getValue());
        }
        this.f7736f.add(i2, new kl2(this, k2, v));
        return null;
    }

    @Override // j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        return iL >= 0 ? (V) this.f7736f.get(iL).getValue() : this.f7737g.get(comparable);
    }

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final int hashCode() {
        int iC = c();
        int iHashCode = 0;
        for (int i2 = 0; i2 < iC; i2++) {
            iHashCode += this.f7736f.get(i2).hashCode();
        }
        return this.f7737g.size() > 0 ? iHashCode + this.f7737g.hashCode() : iHashCode;
    }

    @Override // j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final V remove(Object obj) {
        m();
        Comparable comparable = (Comparable) obj;
        int iL = l(comparable);
        if (iL >= 0) {
            return k(iL);
        }
        if (this.f7737g.isEmpty()) {
            return null;
        }
        return this.f7737g.remove(comparable);
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

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public final int size() {
        return this.f7736f.size() + this.f7737g.size();
    }
}