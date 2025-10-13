package com.bumptech.glide.load.n;

import java.util.HashMap;
import java.util.Map;

/* compiled from: Jobs.java */
/* loaded from: classes.dex */
final class s {
    private final Map<com.bumptech.glide.load.g, l<?>> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private final Map<com.bumptech.glide.load.g, l<?>> f3839b = new HashMap();

    s() {
    }

    private Map<com.bumptech.glide.load.g, l<?>> b(boolean z) {
        return z ? this.f3839b : this.a;
    }

    l<?> a(com.bumptech.glide.load.g gVar, boolean z) {
        return b(z).get(gVar);
    }

    void c(com.bumptech.glide.load.g gVar, l<?> lVar) {
        b(lVar.p()).put(gVar, lVar);
    }

    void d(com.bumptech.glide.load.g gVar, l<?> lVar) {
        Map<com.bumptech.glide.load.g, l<?>> mapB = b(lVar.p());
        if (lVar.equals(mapB.get(gVar))) {
            mapB.remove(gVar);
        }
    }
}