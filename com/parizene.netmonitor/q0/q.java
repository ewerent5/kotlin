package com.parizene.netmonitor.q0;

import android.content.Context;
import android.telephony.TelephonyManager;

/* compiled from: AndroidModule_ProvideTelephonyManagerFactory.java */
/* loaded from: classes3.dex */
public final class q implements f.c.c<TelephonyManager> {
    private final h.a.a<Context> a;

    public q(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static q a(h.a.a<Context> aVar) {
        return new q(aVar);
    }

    public static TelephonyManager c(Context context) {
        return (TelephonyManager) f.c.f.c(d.m(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public TelephonyManager get() {
        return c(this.a.get());
    }
}