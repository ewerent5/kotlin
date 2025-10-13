package com.parizene.netmonitor.l0;

import android.content.Context;
import android.net.ConnectivityManager;

/* compiled from: ConnectivityStateChangedReceiver_Factory.java */
/* loaded from: classes.dex */
public final class d implements f.c.c<c> {
    private final h.a.a<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<org.greenrobot.eventbus.c> f13217b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<ConnectivityManager> f13218c;

    public d(h.a.a<Context> aVar, h.a.a<org.greenrobot.eventbus.c> aVar2, h.a.a<ConnectivityManager> aVar3) {
        this.a = aVar;
        this.f13217b = aVar2;
        this.f13218c = aVar3;
    }

    public static d a(h.a.a<Context> aVar, h.a.a<org.greenrobot.eventbus.c> aVar2, h.a.a<ConnectivityManager> aVar3) {
        return new d(aVar, aVar2, aVar3);
    }

    public static c c(Context context, org.greenrobot.eventbus.c cVar, ConnectivityManager connectivityManager) {
        return new c(context, cVar, connectivityManager);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.a.get(), this.f13217b.get(), this.f13218c.get());
    }
}