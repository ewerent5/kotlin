package com.google.android.gms.internal.ads;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qr2<T> {
    private final Map<String, AtomicReference<T>> a = new HashMap();

    public final AtomicReference<T> a(String str) {
        synchronized (this) {
            if (!this.a.containsKey(str)) {
                this.a.put(str, new AtomicReference<>());
            }
        }
        return this.a.get(str);
    }
}