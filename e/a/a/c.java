package e.a.a;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: AmplitudeCallbacks.java */
/* loaded from: classes.dex */
class c implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    private static final String f14124e = c.class.getName();

    /* renamed from: f, reason: collision with root package name */
    private static e f14125f = e.d();

    /* renamed from: g, reason: collision with root package name */
    private d f14126g;

    public c(d dVar) {
        this.f14126g = null;
        if (dVar == null) {
            f14125f.b(f14124e, "Need to initialize AmplitudeCallbacks with AmplitudeClient instance");
        } else {
            this.f14126g = dVar;
            dVar.t0();
        }
    }

    protected long a() {
        return System.currentTimeMillis();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        d dVar = this.f14126g;
        if (dVar == null) {
            f14125f.b(f14124e, "Need to initialize AmplitudeCallbacks with AmplitudeClient instance");
        } else {
            dVar.Q(a());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        d dVar = this.f14126g;
        if (dVar == null) {
            f14125f.b(f14124e, "Need to initialize AmplitudeCallbacks with AmplitudeClient instance");
        } else {
            dVar.P(a());
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
    }
}