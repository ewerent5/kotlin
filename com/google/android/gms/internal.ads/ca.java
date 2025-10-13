package com.google.android.gms.internal.ads;

import java.util.Map;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ca implements ba<Object> {
    private final gx0 a;

    public ca(gx0 gx0Var) {
        com.google.android.gms.common.internal.p.k(gx0Var, "The Inspector Manager must not be null");
        this.a = gx0Var;
    }

    @Override // com.google.android.gms.internal.ads.ba
    public final void a(Object obj, Map<String, String> map) throws NumberFormatException {
        if (map == null || !map.containsKey("extras")) {
            return;
        }
        long j2 = Long.MAX_VALUE;
        if (map.containsKey("expires")) {
            try {
                j2 = Long.parseLong(map.get("expires"));
            } catch (NumberFormatException unused) {
            }
        }
        this.a.f(map.get("extras"), j2);
    }
}