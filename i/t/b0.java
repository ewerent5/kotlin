package i.t;

import java.util.Collections;
import java.util.Map;

/* compiled from: MapsJVM.kt */
/* loaded from: classes3.dex */
class b0 extends a0 {
    public static int a(int i2) {
        if (i2 < 0) {
            return i2;
        }
        if (i2 < 3) {
            return i2 + 1;
        }
        if (i2 < 1073741824) {
            return (int) ((i2 / 0.75f) + 1.0f);
        }
        return Integer.MAX_VALUE;
    }

    public static final <K, V> Map<K, V> b(i.l<? extends K, ? extends V> lVar) {
        i.y.d.l.d(lVar, "pair");
        Map<K, V> mapSingletonMap = Collections.singletonMap(lVar.c(), lVar.d());
        i.y.d.l.c(mapSingletonMap, "java.util.Collections.si…(pair.first, pair.second)");
        return mapSingletonMap;
    }

    public static final <K, V> Map<K, V> c(Map<? extends K, ? extends V> map) {
        i.y.d.l.d(map, "$this$toSingletonMap");
        Map.Entry<? extends K, ? extends V> next = map.entrySet().iterator().next();
        Map<K, V> mapSingletonMap = Collections.singletonMap(next.getKey(), next.getValue());
        i.y.d.l.c(mapSingletonMap, "with(entries.iterator().…ingletonMap(key, value) }");
        return mapSingletonMap;
    }
}