package com.parizene.netmonitor.q0;

import android.app.Application;
import android.content.pm.PackageManager;

/* compiled from: AppModule_ProvideAnalyticsTrackerFactory.java */
/* loaded from: classes3.dex */
public final class u implements f.c.c<com.parizene.netmonitor.k0.e> {
    private final h.a.a<Application> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<com.parizene.netmonitor.m0.d0.d> f13620b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<PackageManager> f13621c;

    public u(h.a.a<Application> aVar, h.a.a<com.parizene.netmonitor.m0.d0.d> aVar2, h.a.a<PackageManager> aVar3) {
        this.a = aVar;
        this.f13620b = aVar2;
        this.f13621c = aVar3;
    }

    public static u a(h.a.a<Application> aVar, h.a.a<com.parizene.netmonitor.m0.d0.d> aVar2, h.a.a<PackageManager> aVar3) {
        return new u(aVar, aVar2, aVar3);
    }

    public static com.parizene.netmonitor.k0.e c(Application application, com.parizene.netmonitor.m0.d0.d dVar, PackageManager packageManager) {
        return (com.parizene.netmonitor.k0.e) f.c.f.c(t.a(application, dVar, packageManager), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.k0.e get() {
        return c(this.a.get(), this.f13620b.get(), this.f13621c.get());
    }
}