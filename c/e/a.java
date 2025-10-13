package c.e;

import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.util.Collection;
import java.util.Map;
import java.util.Set;

/* compiled from: ArrayMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends g<K, V> implements Map<K, V>, j$.util.Map {

    /* renamed from: l */
    f<K, V> f2702l;

    /* compiled from: ArrayMap.java */
    /* renamed from: c.e.a$a */
    class C0048a extends f<K, V> {
        C0048a() {
        }

        @Override // c.e.f
        protected void a() {
            a.this.clear();
        }

        @Override // c.e.f
        protected Object b(int i2, int i3) {
            return a.this.f2747j[(i2 << 1) + i3];
        }

        @Override // c.e.f
        protected Map<K, V> c() {
            return a.this;
        }

        @Override // c.e.f
        protected int d() {
            return a.this.f2748k;
        }

        @Override // c.e.f
        protected int e(Object obj) {
            return a.this.f(obj);
        }

        @Override // c.e.f
        protected int f(Object obj) {
            return a.this.h(obj);
        }

        @Override // c.e.f
        protected void g(K k2, V v) {
            a.this.put(k2, v);
        }

        @Override // c.e.f
        protected void h(int i2) {
            a.this.k(i2);
        }

        @Override // c.e.f
        protected V i(int i2, V v) {
            return a.this.l(i2, v);
        }
    }

    public a() {
    }

    private f<K, V> n() {
        if (this.f2702l == null) {
            this.f2702l = new C0048a();
        }
        return this.f2702l;
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
    public Set<Map.Entry<K, V>> entrySet() {
        return n().l();
    }

    @Override // j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    @Override // java.util.Map, j$.util.Map
    public Set<K> keySet() {
        return n().m();
    }

    @Override // j$.util.Map
    public /* synthetic */ Object merge(Object obj, Object obj2, BiFunction biFunction) {
        return Map.CC.$default$merge(this, obj, obj2, biFunction);
    }

    public boolean o(Collection<?> collection) {
        return f.p(this, collection);
    }

    @Override // java.util.Map, j$.util.Map
    public void putAll(java.util.Map<? extends K, ? extends V> map) {
        c(this.f2748k + map.size());
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }

    @Override // j$.util.Map
    public /* synthetic */ void replaceAll(BiFunction biFunction) {
        Map.CC.$default$replaceAll(this, biFunction);
    }

    @Override // java.util.Map, j$.util.Map
    public Collection<V> values() {
        return n().n();
    }

    public a(int i2) {
        super(i2);
    }

    public a(g gVar) {
        super(gVar);
    }
}