package com.parizene.netmonitor.q0;

import android.telephony.SubscriptionManager;

/* compiled from: CellModule_ProvideSubscriptionManagerWrapperFactory.java */
/* loaded from: classes3.dex */
public final class s0 implements f.c.c<com.parizene.netmonitor.m0.d0.c> {
    private final h.a.a<SubscriptionManager> a;

    public s0(h.a.a<SubscriptionManager> aVar) {
        this.a = aVar;
    }

    public static s0 a(h.a.a<SubscriptionManager> aVar) {
        return new s0(aVar);
    }

    public static com.parizene.netmonitor.m0.d0.c c(SubscriptionManager subscriptionManager) {
        return (com.parizene.netmonitor.m0.d0.c) f.c.f.c(p0.c(subscriptionManager), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.m0.d0.c get() {
        return c(this.a.get());
    }
}