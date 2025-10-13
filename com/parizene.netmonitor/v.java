package com.parizene.netmonitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Handler;
import com.parizene.netmonitor.db.AppDatabase;

/* compiled from: GeolocationUpdater_Factory.java */
/* loaded from: classes.dex */
public final class v implements f.c.c<u> {
    private final h.a.a<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<AppDatabase> f14069b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.r0.d> f14070c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<org.greenrobot.eventbus.c> f14071d;

    /* renamed from: e, reason: collision with root package name */
    private final h.a.a<Handler> f14072e;

    /* renamed from: f, reason: collision with root package name */
    private final h.a.a<Handler> f14073f;

    /* renamed from: g, reason: collision with root package name */
    private final h.a.a<SharedPreferences> f14074g;

    public v(h.a.a<Context> aVar, h.a.a<AppDatabase> aVar2, h.a.a<com.parizene.netmonitor.r0.d> aVar3, h.a.a<org.greenrobot.eventbus.c> aVar4, h.a.a<Handler> aVar5, h.a.a<Handler> aVar6, h.a.a<SharedPreferences> aVar7) {
        this.a = aVar;
        this.f14069b = aVar2;
        this.f14070c = aVar3;
        this.f14071d = aVar4;
        this.f14072e = aVar5;
        this.f14073f = aVar6;
        this.f14074g = aVar7;
    }

    public static v a(h.a.a<Context> aVar, h.a.a<AppDatabase> aVar2, h.a.a<com.parizene.netmonitor.r0.d> aVar3, h.a.a<org.greenrobot.eventbus.c> aVar4, h.a.a<Handler> aVar5, h.a.a<Handler> aVar6, h.a.a<SharedPreferences> aVar7) {
        return new v(aVar, aVar2, aVar3, aVar4, aVar5, aVar6, aVar7);
    }

    public static u c(Context context, AppDatabase appDatabase, com.parizene.netmonitor.r0.d dVar, org.greenrobot.eventbus.c cVar, Handler handler, Handler handler2, SharedPreferences sharedPreferences) {
        return new u(context, appDatabase, dVar, cVar, handler, handler2, sharedPreferences);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public u get() {
        return c(this.a.get(), this.f14069b.get(), this.f14070c.get(), this.f14071d.get(), this.f14072e.get(), this.f14073f.get(), this.f14074g.get());
    }
}