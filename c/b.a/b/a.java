package c.b.a.b;

import c.b.a.b.b;
import java.util.HashMap;
import java.util.Map;

/* compiled from: FastSafeIterableMap.java */
/* loaded from: classes.dex */
public class a<K, V> extends b<K, V> {

    /* renamed from: i, reason: collision with root package name */
    private HashMap<K, b.c<K, V>> f2628i = new HashMap<>();

    @Override // c.b.a.b.b
    protected b.c<K, V> c(K k2) {
        return this.f2628i.get(k2);
    }

    public boolean contains(K k2) {
        return this.f2628i.containsKey(k2);
    }

    @Override // c.b.a.b.b
    public V k(K k2, V v) {
        b.c<K, V> cVarC = c(k2);
        if (cVarC != null) {
            return cVarC.f2634f;
        }
        this.f2628i.put(k2, h(k2, v));
        return null;
    }

    @Override // c.b.a.b.b
    public V l(K k2) {
        V v = (V) super.l(k2);
        this.f2628i.remove(k2);
        return v;
    }

    public Map.Entry<K, V> m(K k2) {
        if (contains(k2)) {
            return this.f2628i.get(k2).f2636h;
        }
        return null;
    }
}