package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class i23 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    private final Application f6465e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f6466f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f6467g = false;

    public i23(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f6466f = new WeakReference<>(activityLifecycleCallbacks);
        this.f6465e = application;
    }

    protected final void a(h23 h23Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f6466f.get();
            if (activityLifecycleCallbacks != null) {
                h23Var.a(activityLifecycleCallbacks);
            } else {
                if (this.f6467g) {
                    return;
                }
                this.f6465e.unregisterActivityLifecycleCallbacks(this);
                this.f6467g = true;
            }
        } catch (Exception e2) {
            er.zzg("Error while dispatching lifecycle callback.", e2);
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new a23(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new g23(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new d23(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new c23(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new f23(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new b23(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new e23(this, activity));
    }
}