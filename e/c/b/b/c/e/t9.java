package e.c.b.b.c.e;

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

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
class t9<K extends Comparable<K>, V> extends AbstractMap<K, V> implements Map {

    /* renamed from: e, reason: collision with root package name */
    private final int f14859e;

    /* renamed from: f, reason: collision with root package name */
    private List<ca> f14860f;

    /* renamed from: g, reason: collision with root package name */
    private java.util.Map<K, V> f14861g;

    /* renamed from: h, reason: collision with root package name */
    private boolean f14862h;

    /* renamed from: i, reason: collision with root package name */
    private volatile ea f14863i;

    /* renamed from: j, reason: collision with root package name */
    private java.util.Map<K, V> f14864j;

    /* renamed from: k, reason: collision with root package name */
    private volatile y9 f14865k;

    private t9(int i2) {
        this.f14859e = i2;
        this.f14860f = Collections.emptyList();
        this.f14861g = Collections.emptyMap();
        this.f14864j = Collections.emptyMap();
    }

    private final int a(K k2) {
        int size = this.f14860f.size() - 1;
        if (size >= 0) {
            int iCompareTo = k2.compareTo((Comparable) this.f14860f.get(size).getKey());
            if (iCompareTo > 0) {
                return -(size + 2);
            }
            if (iCompareTo == 0) {
                return size;
            }
        }
        int i2 = 0;
        while (i2 <= size) {
            int i3 = (i2 + size) / 2;
            int iCompareTo2 = k2.compareTo((Comparable) this.f14860f.get(i3).getKey());
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

    static <FieldDescriptorType extends j7<FieldDescriptorType>> t9<FieldDescriptorType, Object> b(int i2) {
        return new w9(i2);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final V k(int i2) {
        p();
        V v = (V) this.f14860f.remove(i2).getValue();
        if (!this.f14861g.isEmpty()) {
            Iterator<Map.Entry<K, V>> it = q().entrySet().iterator();
            this.f14860f.add(new ca(this, it.next()));
            it.remove();
        }
        return v;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p() {
        if (this.f14862h) {
            throw new UnsupportedOperationException();
        }
    }

    private final SortedMap<K, V> q() {
        p();
        if (this.f14861g.isEmpty() && !(this.f14861g instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f14861g = treeMap;
            this.f14864j = treeMap.descendingMap();
        }
        return (SortedMap) this.f14861g;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map, java.util.HashMap
    public void clear() {
        p();
        if (!this.f14860f.isEmpty()) {
            this.f14860f.clear();
        }
        if (this.f14861g.isEmpty()) {
            return;
        }
        this.f14861g.clear();
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
    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        return a(comparable) >= 0 || this.f14861g.containsKey(comparable);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public final V put(K k2, V v) {
        p();
        int iA = a(k2);
        if (iA >= 0) {
            return (V) this.f14860f.get(iA).setValue(v);
        }
        p();
        if (this.f14860f.isEmpty() && !(this.f14860f instanceof ArrayList)) {
            this.f14860f = new ArrayList(this.f14859e);
        }
        int i2 = -(iA + 1);
        if (i2 >= this.f14859e) {
            return q().put(k2, v);
        }
        int size = this.f14860f.size();
        int i3 = this.f14859e;
        if (size == i3) {
            ca caVarRemove = this.f14860f.remove(i3 - 1);
            q().put((Comparable) caVarRemove.getKey(), caVarRemove.getValue());
        }
        this.f14860f.add(i2, new ca(this, k2, v));
        return null;
    }

    public void e() {
        if (this.f14862h) {
            return;
        }
        this.f14861g = this.f14861g.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14861g);
        this.f14864j = this.f14864j.isEmpty() ? Collections.emptyMap() : Collections.unmodifiableMap(this.f14864j);
        this.f14862h = true;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f14863i == null) {
            this.f14863i = new ea(this, null);
        }
        return this.f14863i;
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t9)) {
            return super.equals(obj);
        }
        t9 t9Var = (t9) obj;
        int size = size();
        if (size != t9Var.size()) {
            return false;
        }
        int iJ = j();
        if (iJ != t9Var.j()) {
            return entrySet().equals(t9Var.entrySet());
        }
        for (int i2 = 0; i2 < iJ; i2++) {
            if (!h(i2).equals(t9Var.h(i2))) {
                return false;
            }
        }
        if (iJ != size) {
            return this.f14861g.equals(t9Var.f14861g);
        }
        return true;
    }

    @Override // j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        return iA >= 0 ? (V) this.f14860f.get(iA).getValue() : this.f14861g.get(comparable);
    }

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public /* synthetic */ Object getOrDefault(Object obj, Object obj2) {
        return Map.CC.$default$getOrDefault(this, obj, obj2);
    }

    public final Map.Entry<K, V> h(int i2) {
        return this.f14860f.get(i2);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public int hashCode() {
        int iJ = j();
        int iHashCode = 0;
        for (int i2 = 0; i2 < iJ; i2++) {
            iHashCode += this.f14860f.get(i2).hashCode();
        }
        return this.f14861g.size() > 0 ? iHashCode + this.f14861g.hashCode() : iHashCode;
    }

    public final boolean i() {
        return this.f14862h;
    }

    public final int j() {
        return this.f14860f.size();
    }

    public final Iterable<Map.Entry<K, V>> m() {
        return this.f14861g.isEmpty() ? x9.a() : this.f14861g.entrySet();
    }

    @Override // j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    final Set<Map.Entry<K, V>> o() {
        if (this.f14865k == null) {
            this.f14865k = new y9(this, null);
        }
        return this.f14865k;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Object putIfAbsent(Object obj, Object obj2) {
        return Map.CC.$default$putIfAbsent(this, obj, obj2);
    }

    @Override // java.util.AbstractMap, java.util.Map, j$.util.Map
    public V remove(Object obj) {
        p();
        Comparable comparable = (Comparable) obj;
        int iA = a(comparable);
        if (iA >= 0) {
            return k(iA);
        }
        if (this.f14861g.isEmpty()) {
            return null;
        }
        return this.f14861g.remove(comparable);
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
    public int size() {
        return this.f14860f.size() + this.f14861g.size();
    }

    /* synthetic */ t9(int i2, w9 w9Var) {
        this(i2);
    }
}