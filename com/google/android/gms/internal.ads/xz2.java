package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xz2 {
    private final Map<String, String> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private Map<String, String> f10317b;

    public final synchronized Map<String, String> a() {
        if (this.f10317b == null) {
            this.f10317b = Collections.unmodifiableMap(new HashMap(this.a));
        }
        return this.f10317b;
    }
}