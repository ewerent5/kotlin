package com.parizene.netmonitor.q0;

import android.content.Context;
import android.telephony.SubscriptionManager;

/* compiled from: AndroidModule_ProvideSubscriptionManagerFactory.java */
/* loaded from: classes3.dex */
public final class p implements f.c.c<SubscriptionManager> {
    private final h.a.a<Context> a;

    public p(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static p a(h.a.a<Context> aVar) {
        return new p(aVar);
    }

    public static SubscriptionManager c(Context context) {
        return (SubscriptionManager) f.c.f.c(d.l(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SubscriptionManager get() {
        return c(this.a.get());
    }
}