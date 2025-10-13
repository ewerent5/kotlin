package com.parizene.netmonitor.s0.d;

import android.content.Context;
import android.location.LocationManager;
import android.os.Handler;

/* compiled from: LocationHelper_Factory.java */
/* loaded from: classes3.dex */
public final class e implements f.c.c<c> {
    private final h.a.a<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<LocationManager> f13697b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<Handler> f13698c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<Handler> f13699d;

    public e(h.a.a<Context> aVar, h.a.a<LocationManager> aVar2, h.a.a<Handler> aVar3, h.a.a<Handler> aVar4) {
        this.a = aVar;
        this.f13697b = aVar2;
        this.f13698c = aVar3;
        this.f13699d = aVar4;
    }

    public static e a(h.a.a<Context> aVar, h.a.a<LocationManager> aVar2, h.a.a<Handler> aVar3, h.a.a<Handler> aVar4) {
        return new e(aVar, aVar2, aVar3, aVar4);
    }

    public static c c(Context context, LocationManager locationManager, Handler handler, Handler handler2) {
        return new c(context, locationManager, handler, handler2);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.a.get(), this.f13697b.get(), this.f13698c.get(), this.f13699d.get());
    }
}