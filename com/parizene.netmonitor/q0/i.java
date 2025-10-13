package com.parizene.netmonitor.q0;

import android.app.KeyguardManager;
import android.content.Context;

/* compiled from: AndroidModule_ProvideKeyguardManagerFactory.java */
/* loaded from: classes3.dex */
public final class i implements f.c.c<KeyguardManager> {
    private final h.a.a<Context> a;

    public i(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static i a(h.a.a<Context> aVar) {
        return new i(aVar);
    }

    public static KeyguardManager c(Context context) {
        return (KeyguardManager) f.c.f.c(d.e(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public KeyguardManager get() {
        return c(this.a.get());
    }
}