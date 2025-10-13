package com.parizene.netmonitor.q0;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: AppModule_ProvideProviderFactory.java */
/* loaded from: classes3.dex */
public final class k0 implements f.c.c<com.parizene.netmonitor.t0.g> {
    public static com.parizene.netmonitor.t0.g a(Context context, SharedPreferences sharedPreferences) {
        return (com.parizene.netmonitor.t0.g) f.c.f.c(t.q(context, sharedPreferences), "Cannot return null from a non-@Nullable @Provides method");
    }
}