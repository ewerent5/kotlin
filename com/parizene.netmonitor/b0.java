package com.parizene.netmonitor;

import android.app.NotificationManager;
import android.content.Context;

/* compiled from: NotificationHelper_Factory.java */
/* loaded from: classes.dex */
public final class b0 implements f.c.c<a0> {
    private final h.a.a<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<NotificationManager> f13005b;

    public b0(h.a.a<Context> aVar, h.a.a<NotificationManager> aVar2) {
        this.a = aVar;
        this.f13005b = aVar2;
    }

    public static b0 a(h.a.a<Context> aVar, h.a.a<NotificationManager> aVar2) {
        return new b0(aVar, aVar2);
    }

    public static a0 c(Context context, NotificationManager notificationManager) {
        return new a0(context, notificationManager);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public a0 get() {
        return c(this.a.get(), this.f13005b.get());
    }
}