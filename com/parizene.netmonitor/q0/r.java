package com.parizene.netmonitor.q0;

import android.content.Context;
import android.net.wifi.WifiManager;

/* compiled from: AndroidModule_ProvideWifiManagerFactory.java */
/* loaded from: classes3.dex */
public final class r implements f.c.c<WifiManager> {
    private final h.a.a<Context> a;

    public r(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static r a(h.a.a<Context> aVar) {
        return new r(aVar);
    }

    public static WifiManager c(Context context) {
        return (WifiManager) f.c.f.c(d.n(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public WifiManager get() {
        return c(this.a.get());
    }
}