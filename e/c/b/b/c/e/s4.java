package e.c.b.b.c.e;

import ch.qos.logback.core.CoreConstants;
import j$.util.Map;
import j$.util.function.BiConsumer;
import j$.util.function.BiFunction;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public abstract class s4<K, V> implements Serializable, Map<K, V>, j$.util.Map {

    /* renamed from: e, reason: collision with root package name */
    private static final Map.Entry<?, ?>[] f14826e = new Map.Entry[0];

    /* renamed from: f, reason: collision with root package name */
    private transient w4<Map.Entry<K, V>> f14827f;

    /* renamed from: g, reason: collision with root package name */
    private transient w4<K> f14828g;

    /* renamed from: h, reason: collision with root package name */
    private transient n4<V> f14829h;

    s4() {
    }

    abstract w4<Map.Entry<K, V>> a();

    abstract w4<K> b();

    abstract n4<V> c();

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
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map, j$.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return ((n4) values()).contains(obj);
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Set entrySet() {
        w4<Map.Entry<K, V>> w4Var = this.f14827f;
        if (w4Var != null) {
            return w4Var;
        }
        w4<Map.Entry<K, V>> w4VarA = a();
        this.f14827f = w4VarA;
        return w4VarA;
    }

    @Override // java.util.Map, j$.util.Map
    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof java.util.Map) {
            return entrySet().equals(((java.util.Map) obj).entrySet());
        }
        return false;
    }

    @Override // j$.util.Map
    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map, j$.util.Map, java.util.HashMap
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map, j$.util.Map
    public int hashCode() {
        return l5.a((w4) entrySet());
    }

    @Override // java.util.Map, j$.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Set keySet() {
        w4<K> w4Var = this.f14828g;
        if (w4Var != null) {
            return w4Var;
        }
        w4<K> w4VarB = b();
        this.f14828g = w4VarB;
        return w4VarB;
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

    public String toString() {
        int size = size();
        if (size < 0) {
            StringBuilder sb = new StringBuilder("size".length() + 40);
            sb.append("size");
            sb.append(" cannot be negative but was: ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb2.append(CoreConstants.CURLY_LEFT);
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb2.append(", ");
            }
            z = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append(CoreConstants.CURLY_RIGHT);
        return sb2.toString();
    }

    @Override // java.util.Map, j$.util.Map
    public /* synthetic */ Collection values() {
        n4<V> n4Var = this.f14829h;
        if (n4Var != null) {
            return n4Var;
        }
        n4<V> n4VarC = c();
        this.f14829h = n4VarC;
        return n4VarC;
    }
}