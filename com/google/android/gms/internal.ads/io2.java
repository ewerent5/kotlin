package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class io2<K, V, V2> implements mo2<Map<K, V2>> {
    private final Map<K, wo2<V>> a;

    io2(Map<K, wo2<V>> map) {
        this.a = Collections.unmodifiableMap(map);
    }

    final Map<K, wo2<V>> a() {
        return this.a;
    }
}