package com.parizene.netmonitor.q0;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: AndroidModule_ProvideConnectivityManagerFactory.java */
/* loaded from: classes3.dex */
public final class g implements f.c.c<ConnectivityManager> {
    private final h.a.a<Context> a;

    public g(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static g a(h.a.a<Context> aVar) {
        return new g(aVar);
    }

    public static ConnectivityManager c(Context context) {
        return (ConnectivityManager) f.c.f.c(d.c(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ConnectivityManager get() {
        return c(this.a.get());
    }
}