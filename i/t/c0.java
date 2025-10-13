package i.t;

import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* compiled from: Maps.kt */
/* loaded from: classes3.dex */
public class c0 extends b0 {
    public static <K, V> Map<K, V> d() {
        w wVar = w.f15842e;
        Objects.requireNonNull(wVar, "null cannot be cast to non-null type kotlin.collections.Map<K, V>");
        return wVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final <K, V> Map<K, V> e(Map<K, ? extends V> map) {
        i.y.d.l.d(map, "$this$optimizeReadOnlyMap");
        int size = map.size();
        return size != 0 ? size != 1 ? map : b0.c(map) : d();
    }

    public static final <K, V> void f(Map<? super K, ? super V> map, Iterable<? extends i.l<? extends K, ? extends V>> iterable) {
        i.y.d.l.d(map, "$this$putAll");
        i.y.d.l.d(iterable, "pairs");
        for (i.l<? extends K, ? extends V> lVar : iterable) {
            map.put(lVar.a(), lVar.b());
        }
    }

    public static <K, V> Map<K, V> g(Iterable<? extends i.l<? extends K, ? extends V>> iterable) {
        i.y.d.l.d(iterable, "$this$toMap");
        if (!(iterable instanceof Collection)) {
            return e(h(iterable, new LinkedHashMap()));
        }
        Collection collection = (Collection) iterable;
        int size = collection.size();
        if (size == 0) {
            return d();
        }
        if (size != 1) {
            return h(iterable, new LinkedHashMap(b0.a(collection.size())));
        }
        return b0.b(iterable instanceof List ? (i.l<? extends K, ? extends V>) ((List) iterable).get(0) : iterable.iterator().next());
    }

    public static final <K, V, M extends Map<? super K, ? super V>> M h(Iterable<? extends i.l<? extends K, ? extends V>> iterable, M m2) {
        i.y.d.l.d(iterable, "$this$toMap");
        i.y.d.l.d(m2, "destination");
        f(m2, iterable);
        return m2;
    }

    public static <K, V> Map<K, V> i(Map<? extends K, ? extends V> map) {
        i.y.d.l.d(map, "$this$toMap");
        int size = map.size();
        return size != 0 ? size != 1 ? j(map) : b0.c(map) : d();
    }

    public static <K, V> Map<K, V> j(Map<? extends K, ? extends V> map) {
        i.y.d.l.d(map, "$this$toMutableMap");
        return new LinkedHashMap(map);
    }
}