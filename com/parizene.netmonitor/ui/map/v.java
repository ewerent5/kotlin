package com.parizene.netmonitor.ui.map;

import android.app.ActivityManager;
import android.content.Context;

/* compiled from: GoogleMapsAvailability_Factory.java */
/* loaded from: classes3.dex */
public final class v implements f.c.c<u> {
    private final h.a.a<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<ActivityManager> f13990b;

    public v(h.a.a<Context> aVar, h.a.a<ActivityManager> aVar2) {
        this.a = aVar;
        this.f13990b = aVar2;
    }

    public static v a(h.a.a<Context> aVar, h.a.a<ActivityManager> aVar2) {
        return new v(aVar, aVar2);
    }

    public static u c(Context context, f.a<ActivityManager> aVar) {
        return new u(context, aVar);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.a.get(), f.c.b.a(this.f13990b));
    }
}