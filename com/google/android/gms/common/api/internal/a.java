package com.google.android.gms.common.api.internal;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.ComponentCallbacks2;
import android.content.res.Configuration;
import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
/* loaded from: classes.dex */
public final class a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: e, reason: collision with root package name */
    private static final a f4556e = new a();

    /* renamed from: f, reason: collision with root package name */
    private final AtomicBoolean f4557f = new AtomicBoolean();

    /* renamed from: g, reason: collision with root package name */
    private final AtomicBoolean f4558g = new AtomicBoolean();

    /* renamed from: h, reason: collision with root package name */
    @GuardedBy("sInstance")
    private final ArrayList<InterfaceC0111a> f4559h = new ArrayList<>();

    /* renamed from: i, reason: collision with root package name */
    @GuardedBy("sInstance")
    private boolean f4560i = false;

    /* compiled from: com.google.android.gms:play-services-basement@@17.6.0 */
    /* renamed from: com.google.android.gms.common.api.internal.a$a, reason: collision with other inner class name */
    public interface InterfaceC0111a {
        void a(boolean z);
    }

    private a() {
    }

    @RecentlyNonNull
    public static a b() {
        return f4556e;
    }

    public static void c(@RecentlyNonNull Application application) {
        a aVar = f4556e;
        synchronized (aVar) {
            if (!aVar.f4560i) {
                application.registerActivityLifecycleCallbacks(aVar);
                application.registerComponentCallbacks(aVar);
                aVar.f4560i = true;
            }
        }
    }

    private final void f(boolean z) {
        synchronized (f4556e) {
            Iterator<InterfaceC0111a> it = this.f4559h.iterator();
            while (it.hasNext()) {
                it.next().a(z);
            }
        }
    }

    public void a(@RecentlyNonNull InterfaceC0111a interfaceC0111a) {
        synchronized (f4556e) {
            this.f4559h.add(interfaceC0111a);
        }
    }

    public boolean d() {
        return this.f4557f.get();
    }

    @TargetApi(16)
    public boolean e(boolean z) {
        if (!this.f4558g.get()) {
            if (!com.google.android.gms.common.util.n.c()) {
                return z;
            }
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = new ActivityManager.RunningAppProcessInfo();
            ActivityManager.getMyMemoryState(runningAppProcessInfo);
            if (!this.f4558g.getAndSet(true) && runningAppProcessInfo.importance > 100) {
                this.f4557f.set(true);
            }
        }
        return d();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(@RecentlyNonNull Activity activity, Bundle bundle) {
        boolean zCompareAndSet = this.f4557f.compareAndSet(true, false);
        this.f4558g.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(@RecentlyNonNull Activity activity) {
        boolean zCompareAndSet = this.f4557f.compareAndSet(true, false);
        this.f4558g.set(true);
        if (zCompareAndSet) {
            f(false);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(@RecentlyNonNull Activity activity, @RecentlyNonNull Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(@RecentlyNonNull Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(@RecentlyNonNull Activity activity) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(@RecentlyNonNull Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i2) {
        if (i2 == 20 && this.f4557f.compareAndSet(false, true)) {
            this.f4558g.set(true);
            f(true);
        }
    }
}