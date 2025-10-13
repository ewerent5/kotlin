package com.parizene.netmonitor.s0.c;

import android.content.Context;

/* compiled from: PremiumHelper_Factory.java */
/* loaded from: classes3.dex */
public final class d implements f.c.c<c> {
    private final h.a.a<Context> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<org.greenrobot.eventbus.c> f13683b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.k0.e> f13684c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<com.google.firebase.crashlytics.c> f13685d;

    public d(h.a.a<Context> aVar, h.a.a<org.greenrobot.eventbus.c> aVar2, h.a.a<com.parizene.netmonitor.k0.e> aVar3, h.a.a<com.google.firebase.crashlytics.c> aVar4) {
        this.a = aVar;
        this.f13683b = aVar2;
        this.f13684c = aVar3;
        this.f13685d = aVar4;
    }

    public static d a(h.a.a<Context> aVar, h.a.a<org.greenrobot.eventbus.c> aVar2, h.a.a<com.parizene.netmonitor.k0.e> aVar3, h.a.a<com.google.firebase.crashlytics.c> aVar4) {
        return new d(aVar, aVar2, aVar3, aVar4);
    }

    public static c c(Context context, org.greenrobot.eventbus.c cVar, f.a<com.parizene.netmonitor.k0.e> aVar, f.a<com.google.firebase.crashlytics.c> aVar2) {
        return new c(context, cVar, aVar, aVar2);
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public c get() {
        return c(this.a.get(), this.f13683b.get(), f.c.b.a(this.f13684c), f.c.b.a(this.f13685d));
    }
}