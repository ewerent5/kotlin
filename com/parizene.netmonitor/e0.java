package com.parizene.netmonitor;

import android.content.Context;

/* compiled from: ServiceStarter_Factory.java */
/* loaded from: classes.dex */
public final class e0 implements f.c.c<d0> {
    private final h.a.a<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<org.greenrobot.eventbus.c> f13180b;

    public e0(h.a.a<Context> aVar, h.a.a<org.greenrobot.eventbus.c> aVar2) {
        this.a = aVar;
        this.f13180b = aVar2;
    }

    public static e0 a(h.a.a<Context> aVar, h.a.a<org.greenrobot.eventbus.c> aVar2) {
        return new e0(aVar, aVar2);
    }

    public static d0 c(Context context, org.greenrobot.eventbus.c cVar) {
        return new d0(context, cVar);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public d0 get() {
        return c(this.a.get(), this.f13180b.get());
    }
}