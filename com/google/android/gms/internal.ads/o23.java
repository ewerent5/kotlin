package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(14)
/* loaded from: classes.dex */
final class o23 implements Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    private Activity f7887e;

    /* renamed from: f, reason: collision with root package name */
    private Context f7888f;

    /* renamed from: l, reason: collision with root package name */
    private Runnable f7894l;
    private long n;

    /* renamed from: g, reason: collision with root package name */
    private final Object f7889g = new Object();

    /* renamed from: h, reason: collision with root package name */
    private boolean f7890h = true;

    /* renamed from: i, reason: collision with root package name */
    private boolean f7891i = false;

    /* renamed from: j, reason: collision with root package name */
    @GuardedBy("lock")
    private final List<p23> f7892j = new ArrayList();

    /* renamed from: k, reason: collision with root package name */
    @GuardedBy("lock")
    private final List<d33> f7893k = new ArrayList();

    /* renamed from: m, reason: collision with root package name */
    private boolean f7895m = false;

    o23() {
    }

    static /* synthetic */ boolean i(o23 o23Var, boolean z) {
        o23Var.f7890h = false;
        return false;
    }

    private final void k(Activity activity) {
        synchronized (this.f7889g) {
            if (!activity.getClass().getName().startsWith(MobileAds.ERROR_DOMAIN)) {
                this.f7887e = activity;
            }
        }
    }

    public final void a(Application application, Context context) {
        if (this.f7895m) {
            return;
        }
        application.registerActivityLifecycleCallbacks(this);
        if (context instanceof Activity) {
            k((Activity) context);
        }
        this.f7888f = application;
        this.n = ((Long) c.c().b(w3.D0)).longValue();
        this.f7895m = true;
    }

    public final void b(p23 p23Var) {
        synchronized (this.f7889g) {
            this.f7892j.add(p23Var);
        }
    }

    public final void c(p23 p23Var) {
        synchronized (this.f7889g) {
            this.f7892j.remove(p23Var);
        }
    }

    public final Activity d() {
        return this.f7887e;
    }

    public final Context e() {
        return this.f7888f;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        synchronized (this.f7889g) {
            Activity activity2 = this.f7887e;
            if (activity2 != null) {
                if (activity2.equals(activity)) {
                    this.f7887e = null;
                }
                Iterator<d33> it = this.f7893k.iterator();
                while (it.hasNext()) {
                    try {
                        if (it.next().zza()) {
                            it.remove();
                        }
                    } catch (Exception e2) {
                        zzs.zzg().g(e2, "AppActivityTracker.ActivityListener.onActivityDestroyed");
                        er.zzg("", e2);
                    }
                }
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        k(activity);
        synchronized (this.f7889g) {
            Iterator<d33> it = this.f7893k.iterator();
            while (it.hasNext()) {
                try {
                    it.next().zzb();
                } catch (Exception e2) {
                    zzs.zzg().g(e2, "AppActivityTracker.ActivityListener.onActivityPaused");
                    er.zzg("", e2);
                }
            }
        }
        this.f7891i = true;
        Runnable runnable = this.f7894l;
        if (runnable != null) {
            zzr.zza.removeCallbacks(runnable);
        }
        l02 l02Var = zzr.zza;
        m23 m23Var = new m23(this);
        this.f7894l = m23Var;
        l02Var.postDelayed(m23Var, this.n);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        k(activity);
        this.f7891i = false;
        boolean z = !this.f7890h;
        this.f7890h = true;
        Runnable runnable = this.f7894l;
        if (runnable != null) {
            zzr.zza.removeCallbacks(runnable);
        }
        synchronized (this.f7889g) {
            Iterator<d33> it = this.f7893k.iterator();
            while (it.hasNext()) {
                try {
                    it.next().zzc();
                } catch (Exception e2) {
                    zzs.zzg().g(e2, "AppActivityTracker.ActivityListener.onActivityResumed");
                    er.zzg("", e2);
                }
            }
            if (z) {
                Iterator<p23> it2 = this.f7892j.iterator();
                while (it2.hasNext()) {
                    try {
                        it2.next().zza(true);
                    } catch (Exception e3) {
                        er.zzg("", e3);
                    }
                }
            } else {
                er.zzd("App is still foreground.");
            }
        }
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        k(activity);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
    }
}