package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qo2<K, V> extends io2<K, V, V> {

    /* renamed from: b, reason: collision with root package name */
    private static final wo2<Map<Object, Object>> f8416b = no2.a(Collections.emptyMap());

    /* synthetic */ qo2(Map map, oo2 oo2Var) {
        super(map);
    }

    public static <K, V> po2<K, V> b(int i2) {
        return new po2<>(i2, null);
    }

    @Override // com.google.android.gms.internal.ads.wo2
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final Map<K, V> zzb() {
        LinkedHashMap linkedHashMapC = jo2.c(a().size());
        for (Map.Entry<K, wo2<V>> entry : a().entrySet()) {
            linkedHashMapC.put(entry.getKey(), entry.getValue().zzb());
        }
        return Collections.unmodifiableMap(linkedHashMapC);
    }
}