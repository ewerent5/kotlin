package com.parizene.netmonitor.q0;

import android.telephony.SubscriptionManager;
import android.telephony.TelephonyManager;

/* compiled from: CellModule.java */
/* loaded from: classes3.dex */
public abstract class p0 {
    static com.parizene.netmonitor.m0.c0.c a() {
        return new com.parizene.netmonitor.m0.c0.c();
    }

    static com.parizene.netmonitor.m0.d0.a b() {
        return new com.parizene.netmonitor.m0.d0.a(new com.parizene.netmonitor.m0.a0.f(), new com.parizene.netmonitor.m0.a0.a(), new com.parizene.netmonitor.m0.a0.b(), new com.parizene.netmonitor.m0.a0.c(), new com.parizene.netmonitor.m0.a0.d(), new com.parizene.netmonitor.m0.a0.e(), new com.parizene.netmonitor.m0.a0.g(), new com.parizene.netmonitor.m0.a0.h(), new com.parizene.netmonitor.m0.a0.i(), new com.parizene.netmonitor.m0.a0.k(), new com.parizene.netmonitor.m0.a0.l());
    }

    static com.parizene.netmonitor.m0.d0.c c(SubscriptionManager subscriptionManager) {
        return new com.parizene.netmonitor.m0.d0.c(subscriptionManager, new com.parizene.netmonitor.m0.a0.m());
    }

    static com.parizene.netmonitor.m0.d0.d d(TelephonyManager telephonyManager, com.parizene.netmonitor.m0.d0.c cVar) {
        return new com.parizene.netmonitor.m0.d0.d(telephonyManager, new com.parizene.netmonitor.m0.a0.n(), new com.parizene.netmonitor.m0.a0.j(), cVar);
    }

    static com.parizene.netmonitor.m0.d0.e e(com.parizene.netmonitor.m0.d0.d dVar) {
        return new com.parizene.netmonitor.m0.d0.e(dVar);
    }
}