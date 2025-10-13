package com.parizene.netmonitor.s0.e;

import android.content.Context;
import android.net.wifi.WifiManager;
import android.os.Handler;

/* compiled from: WifiHelper_Factory.java */
/* loaded from: classes3.dex */
public final class e implements f.c.c<c> {
    private final h.a.a<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<WifiManager> f13712b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<Handler> f13713c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<Handler> f13714d;

    public e(h.a.a<Context> aVar, h.a.a<WifiManager> aVar2, h.a.a<Handler> aVar3, h.a.a<Handler> aVar4) {
        this.a = aVar;
        this.f13712b = aVar2;
        this.f13713c = aVar3;
        this.f13714d = aVar4;
    }

    public static e a(h.a.a<Context> aVar, h.a.a<WifiManager> aVar2, h.a.a<Handler> aVar3, h.a.a<Handler> aVar4) {
        return new e(aVar, aVar2, aVar3, aVar4);
    }

    public static c c(Context context, WifiManager wifiManager, Handler handler, Handler handler2) {
        return new c(context, wifiManager, handler, handler2);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.a.get(), this.f13712b.get(), this.f13713c.get(), this.f13714d.get());
    }
}