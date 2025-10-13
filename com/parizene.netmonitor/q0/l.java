package com.parizene.netmonitor.q0;

import android.app.NotificationManager;
import android.content.Context;

/* compiled from: AndroidModule_ProvideNotificationManagerFactory.java */
/* loaded from: classes3.dex */
public final class l implements f.c.c<NotificationManager> {
    private final h.a.a<Context> a;

    public l(h.a.a<Context> aVar) {
        this.a = aVar;
    }

    public static l a(h.a.a<Context> aVar) {
        return new l(aVar);
    }

    public static NotificationManager c(Context context) {
        return (NotificationManager) f.c.f.c(d.h(context), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public NotificationManager get() {
        return c(this.a.get());
    }
}