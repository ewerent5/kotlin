package com.parizene.netmonitor.q0;

import android.app.ActivityManager;
import android.content.Context;

/* compiled from: AndroidModule_ProvideActivityManagerFactory.java */
/* loaded from: classes3.dex */
public final class e implements f.c.c<ActivityManager> {
    private final h.a.a<Context> a;

    public e(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static e a(h.a.a<Context> aVar) {
        return new e(aVar);
    }

    public static ActivityManager c(Context context) {
        return (ActivityManager) f.c.f.c(d.a(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public ActivityManager get() {
        return c(this.a.get());
    }
}