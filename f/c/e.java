package f.c;

import java.util.Collections;
import java.util.Map;

/* compiled from: MapBuilder.java */
/* loaded from: classes3.dex */
public final class e<K, V> {
    private final Map<K, V> a;

    private e(int i2) {
        this.a = a.b(i2);
    }

    public static <K, V> e<K, V> b(int i2) {
        return new e<>(i2);
    }

    public Map<K, V> a() {
        return this.a.size() != 0 ? Collections.unmodifiableMap(this.a) : Collections.emptyMap();
    }

    public e<K, V> c(K k2, V v) {
        this.a.put(k2, v);
        return this;
    }
}