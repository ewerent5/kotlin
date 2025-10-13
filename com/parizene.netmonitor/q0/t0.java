package com.parizene.netmonitor.q0;

import android.telephony.TelephonyManager;

/* compiled from: CellModule_ProvideTelephonyManagerWrapperFactory.java */
/* loaded from: classes3.dex */
public final class t0 implements f.c.c<com.parizene.netmonitor.m0.d0.d> {
    private final h.a.a<TelephonyManager> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.c> f13619b;

    public t0(h.a.a<TelephonyManager> aVar, h.a.a<com.parizene.netmonitor.m0.d0.c> aVar2) {
        this.a = aVar;
        this.f13619b = aVar2;
    }

    public static t0 a(h.a.a<TelephonyManager> aVar, h.a.a<com.parizene.netmonitor.m0.d0.c> aVar2) {
        return new t0(aVar, aVar2);
    }

    public static com.parizene.netmonitor.m0.d0.d c(TelephonyManager telephonyManager, com.parizene.netmonitor.m0.d0.c cVar) {
        return (com.parizene.netmonitor.m0.d0.d) f.c.f.c(p0.d(telephonyManager, cVar), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.m0.d0.d get() {
        return c(this.a.get(), this.f13619b.get());
    }
}