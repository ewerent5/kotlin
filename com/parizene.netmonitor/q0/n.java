package com.parizene.netmonitor.q0;

import android.content.Context;
import android.os.PowerManager;

/* compiled from: AndroidModule_ProvidePowerManagerFactory.java */
/* loaded from: classes3.dex */
public final class n implements f.c.c<PowerManager> {
    private final h.a.a<Context> a;

    public n(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static n a(h.a.a<Context> aVar) {
        return new n(aVar);
    }

    public static PowerManager c(Context context) {
        return (PowerManager) f.c.f.c(d.j(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public PowerManager get() {
        return c(this.a.get());
    }
}