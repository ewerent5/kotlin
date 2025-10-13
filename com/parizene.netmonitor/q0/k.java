package com.parizene.netmonitor.q0;

import android.content.Context;
import android.location.LocationManager;

/* compiled from: AndroidModule_ProvideLocationManagerFactory.java */
/* loaded from: classes3.dex */
public final class k implements f.c.c<LocationManager> {
    private final h.a.a<Context> a;

    public k(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static k a(h.a.a<Context> aVar) {
        return new k(aVar);
    }

    public static LocationManager c(Context context) {
        return (LocationManager) f.c.f.c(d.g(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public LocationManager get() {
        return c(this.a.get());
    }
}