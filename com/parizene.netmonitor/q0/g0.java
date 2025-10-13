package com.parizene.netmonitor.q0;

import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.os.PowerManager;

/* compiled from: AppModule_ProvideLegacyForegroundStateChangedReceiverFactory.java */
/* loaded from: classes3.dex */
public final class g0 implements f.c.c<com.parizene.netmonitor.foreground.a> {
    private final h.a.a<org.greenrobot.eventbus.c> a;

    /* renamed from: b, reason: collision with root package name */
    private final h.a.a<Application> f13597b;

    /* renamed from: c, reason: collision with root package name */
    private final h.a.a<KeyguardManager> f13598c;

    /* renamed from: d, reason: collision with root package name */
    private final h.a.a<ActivityManager> f13599d;

    /* renamed from: e, reason: collision with root package name */
    private final h.a.a<PowerManager> f13600e;

    public g0(h.a.a<org.greenrobot.eventbus.c> aVar, h.a.a<Application> aVar2, h.a.a<KeyguardManager> aVar3, h.a.a<ActivityManager> aVar4, h.a.a<PowerManager> aVar5) {
        this.a = aVar;
        this.f13597b = aVar2;
        this.f13598c = aVar3;
        this.f13599d = aVar4;
        this.f13600e = aVar5;
    }

    public static g0 a(h.a.a<org.greenrobot.eventbus.c> aVar, h.a.a<Application> aVar2, h.a.a<KeyguardManager> aVar3, h.a.a<ActivityManager> aVar4, h.a.a<PowerManager> aVar5) {
        return new g0(aVar, aVar2, aVar3, aVar4, aVar5);
    }

    public static com.parizene.netmonitor.foreground.a c(org.greenrobot.eventbus.c cVar, Application application, KeyguardManager keyguardManager, ActivityManager activityManager, PowerManager powerManager) {
        return (com.parizene.netmonitor.foreground.a) f.c.f.c(t.m(cVar, application, keyguardManager, activityManager, powerManager), "Cannot return null from a non-@Nullable @Provides method");
    }

    @Override // h.a.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public com.parizene.netmonitor.foreground.a get() {
        return c(this.a.get(), this.f13597b.get(), this.f13598c.get(), this.f13599d.get(), this.f13600e.get());
    }
}