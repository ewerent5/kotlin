package com.parizene.netmonitor.q0;

import android.content.Context;
import com.google.firebase.analytics.FirebaseAnalytics;

/* compiled from: AppModule_ProvideFirebaseAnalyticsFactory.java */
/* loaded from: classes3.dex */
public final class b0 implements f.c.c<FirebaseAnalytics> {
    private final h.a.a<Context> a;

    public b0(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static b0 a(h.a.a<Context> aVar) {
        return new b0(aVar);
    }

    public static FirebaseAnalytics c(Context context) {
        return (FirebaseAnalytics) f.c.f.c(t.h(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public FirebaseAnalytics get() {
        return c(this.a.get());
    }
}