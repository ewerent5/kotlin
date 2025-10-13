package com.google.android.gms.internal.ads;

import android.annotation.TargetApi;
import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.PowerManager;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.util.zzbp;
import com.google.android.gms.ads.internal.util.zzr;
import com.google.android.gms.ads.internal.zzs;
import java.lang.ref.WeakReference;
import java.util.HashSet;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(14)
/* loaded from: classes.dex */
public final class w13 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    private static final long f9846e = ((Long) c.c().b(w3.Q0)).longValue();

    /* renamed from: f, reason: collision with root package name */
    private final Context f9847f;

    /* renamed from: g, reason: collision with root package name */
    private Application f9848g;

    /* renamed from: h, reason: collision with root package name */
    private final WindowManager f9849h;

    /* renamed from: i, reason: collision with root package name */
    private final PowerManager f9850i;

    /* renamed from: j, reason: collision with root package name */
    private final KeyguardManager f9851j;

    /* renamed from: k, reason: collision with root package name */
    BroadcastReceiver f9852k;

    /* renamed from: l, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f9853l;

    /* renamed from: m, reason: collision with root package name */
    final WeakReference<View> f9854m;
    private i23 n;
    private final zzbp o = new zzbp(f9846e);
    private boolean p = false;
    private int q = -1;
    private final HashSet<v13> r = new HashSet<>();
    private final DisplayMetrics s;
    private final Rect t;

    public w13(Context context, View view) {
        Context applicationContext = context.getApplicationContext();
        this.f9847f = applicationContext;
        WindowManager windowManager = (WindowManager) context.getSystemService("window");
        this.f9849h = windowManager;
        this.f9850i = (PowerManager) applicationContext.getSystemService("power");
        this.f9851j = (KeyguardManager) context.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f9848g = application;
            this.n = new i23(application, this);
        }
        this.s = context.getResources().getDisplayMetrics();
        Rect rect = new Rect();
        this.t = rect;
        rect.right = windowManager.getDefaultDisplay().getWidth();
        rect.bottom = windowManager.getDefaultDisplay().getHeight();
        WeakReference<View> weakReference = this.f9854m;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (view2 != null) {
            view2.removeOnAttachStateChangeListener(this);
            m(view2);
        }
        this.f9854m = new WeakReference<>(view);
        if (view != null) {
            if (zzs.zze().zzg(view)) {
                l(view);
            }
            view.addOnAttachStateChangeListener(this);
        }
    }

    private final void h() {
        zzr.zza.post(new Runnable(this) { // from class: com.google.android.gms.internal.ads.s13

            /* renamed from: e, reason: collision with root package name */
            private final w13 f8809e;

            {
                this.f8809e = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f8809e.f();
            }
        });
    }

    private final void i(Activity activity, int i2) {
        Window window;
        if (this.f9854m == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View view = this.f9854m.get();
        if (view == null || viewPeekDecorView == null || view.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.q = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00f0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void j(int r28) {
        /*
            Method dump skipped, instructions count: 368
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.w13.j(int):void");
    }

    private final int k(int i2) {
        return (int) (i2 / this.s.density);
    }

    private final void l(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f9853l = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f9852k == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            this.f9852k = new t13(this);
            zzs.zzx().zzb(this.f9847f, this.f9852k, intentFilter);
        }
        Application application = this.f9848g;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.n);
            } catch (Exception e2) {
                er.zzg("Error registering activity lifecycle callbacks.", e2);
            }
        }
    }

    private final void m(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.f9853l;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f9853l = null;
            }
        } catch (Exception e2) {
            er.zzg("Error while unregistering listeners from the last ViewTreeObserver.", e2);
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception e3) {
            er.zzg("Error while unregistering listeners from the ViewTreeObserver.", e3);
        }
        if (this.f9852k != null) {
            try {
                zzs.zzx().zzc(this.f9847f, this.f9852k);
            } catch (IllegalStateException e4) {
                er.zzg("Failed trying to unregister the receiver", e4);
            } catch (Exception e5) {
                zzs.zzg().g(e5, "ActiveViewUnit.stopScreenStatusMonitoring");
            }
            this.f9852k = null;
        }
        Application application = this.f9848g;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.n);
            } catch (Exception e6) {
                er.zzg("Error registering activity lifecycle callbacks.", e6);
            }
        }
    }

    public final void a(v13 v13Var) {
        this.r.add(v13Var);
        j(3);
    }

    public final void b(v13 v13Var) {
        this.r.remove(v13Var);
    }

    final Rect c(Rect rect) {
        return new Rect(k(rect.left), k(rect.top), k(rect.right), k(rect.bottom));
    }

    public final void d(long j2) {
        this.o.zzb(j2);
    }

    public final void e() {
        this.o.zzb(f9846e);
    }

    final /* synthetic */ void f() {
        j(3);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        i(activity, 0);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        i(activity, 4);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        i(activity, 0);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        i(activity, 0);
        j(3);
        h();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        j(3);
        h();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        j(2);
        h();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        j(1);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.q = -1;
        l(view);
        j(3);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.q = -1;
        j(3);
        h();
        m(view);
    }
}