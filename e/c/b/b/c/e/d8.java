package e.c.b.b.c.e;

import j$.util.Map;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-base@@18.0.0 */
/* loaded from: classes.dex */
final class d8<K> implements Map.Entry<K, Object>, Map.Entry {

    /* renamed from: e, reason: collision with root package name */
    private Map.Entry<K, b8> f14462e;

    private d8(Map.Entry<K, b8> entry) {
        this.f14462e = entry;
    }

    public final b8 a() {
        return this.f14462e.getValue();
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final K getKey() {
        return this.f14462e.getKey();
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object getValue() {
        if (this.f14462e.getValue() == null) {
            return null;
        }
        return b8.e();
    }

    @Override // java.util.Map.Entry, j$.util.Map.Entry
    public final Object setValue(Object obj) {
        if (obj instanceof b9) {
            return this.f14462e.getValue().a((b9) obj);
        }
        throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
    }
}