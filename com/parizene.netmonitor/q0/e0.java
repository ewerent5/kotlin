package com.parizene.netmonitor.q0;

import okhttp3.OkHttpClient;

/* compiled from: AppModule_ProvideGeolocationHelperFactory.java */
/* loaded from: classes3.dex */
public final class e0 implements f.c.c<com.parizene.netmonitor.r0.d> {
    private final h.a.a<OkHttpClient> a;

    public e0(h.a.a<OkHttpClient> aVar) {
        this.a = aVar;
    }

    public static e0 a(h.a.a<OkHttpClient> aVar) {
        return new e0(aVar);
    }

    public static com.parizene.netmonitor.r0.d c(OkHttpClient okHttpClient) {
        return (com.parizene.netmonitor.r0.d) f.c.f.c(t.k(okHttpClient), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.r0.d get() {
        return c(this.a.get());
    }
}