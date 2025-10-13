package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class vp2 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    private final Application f9753e;

    /* renamed from: f, reason: collision with root package name */
    private final WeakReference<Application.ActivityLifecycleCallbacks> f9754f;

    /* renamed from: g, reason: collision with root package name */
    private boolean f9755g = false;

    public vp2(Application application, Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        this.f9754f = new WeakReference<>(activityLifecycleCallbacks);
        this.f9753e = application;
    }

    protected final void a(up2 up2Var) {
        try {
            Application.ActivityLifecycleCallbacks activityLifecycleCallbacks = this.f9754f.get();
            if (activityLifecycleCallbacks != null) {
                up2Var.a(activityLifecycleCallbacks);
            } else {
                if (this.f9755g) {
                    return;
                }
                this.f9753e.unregisterActivityLifecycleCallbacks(this);
                this.f9755g = true;
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        a(new np2(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        a(new tp2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        a(new qp2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        a(new pp2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        a(new sp2(this, activity, bundle));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        a(new op2(this, activity));
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        a(new rp2(this, activity));
    }
}