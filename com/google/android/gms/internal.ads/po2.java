package com.google.android.gms.internal.ads;

import ch.qos.logback.core.joran.action.Action;
import java.util.LinkedHashMap;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class po2<K, V> extends ho2<K, V, V> {
    /* synthetic */ po2(int i2, oo2 oo2Var) {
        super(i2);
    }

    public final po2<K, V> a(K k2, wo2<V> wo2Var) {
        LinkedHashMap<K, wo2<V>> linkedHashMap = this.a;
        ro2.a(k2, Action.KEY_ATTRIBUTE);
        ro2.a(wo2Var, "provider");
        linkedHashMap.put(k2, wo2Var);
        return this;
    }

    public final qo2<K, V> b() {
        return new qo2<>(this.a, null);
    }
}