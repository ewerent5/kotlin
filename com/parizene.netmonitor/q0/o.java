package com.parizene.netmonitor.q0;

import android.content.Context;
import android.content.SharedPreferences;

/* compiled from: AndroidModule_ProvideSharedPreferencesFactory.java */
/* loaded from: classes3.dex */
public final class o implements f.c.c<SharedPreferences> {
    private final h.a.a<Context> a;

    public o(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static o a(h.a.a<Context> aVar) {
        return new o(aVar);
    }

    public static SharedPreferences c(Context context) {
        return (SharedPreferences) f.c.f.c(d.k(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public SharedPreferences get() {
        return c(this.a.get());
    }
}