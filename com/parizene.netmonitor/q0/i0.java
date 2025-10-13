package com.parizene.netmonitor.q0;

import android.content.Context;
import okhttp3.OkHttpClient;

/* compiled from: AppModule_ProvideOkHttpClientFactory.java */
/* loaded from: classes3.dex */
public final class i0 implements f.c.c<OkHttpClient> {
    private final h.a.a<Context> a;

    public i0(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static i0 a(h.a.a<Context> aVar) {
        return new i0(aVar);
    }

    public static OkHttpClient c(Context context) {
        return (OkHttpClient) f.c.f.c(t.o(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public OkHttpClient get() {
        return c(this.a.get());
    }
}