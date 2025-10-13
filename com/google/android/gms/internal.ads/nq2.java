package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.PowerManager;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.Window;
import java.lang.ref.WeakReference;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class nq2 implements View.OnAttachStateChangeListener, ViewTreeObserver.OnGlobalLayoutListener, ViewTreeObserver.OnScrollChangedListener, Application.ActivityLifecycleCallbacks {

    /* renamed from: e, reason: collision with root package name */
    private static final Handler f7780e = new Handler(Looper.getMainLooper());

    /* renamed from: f, reason: collision with root package name */
    private final Context f7781f;

    /* renamed from: g, reason: collision with root package name */
    private Application f7782g;

    /* renamed from: h, reason: collision with root package name */
    private final PowerManager f7783h;

    /* renamed from: i, reason: collision with root package name */
    private final KeyguardManager f7784i;

    /* renamed from: j, reason: collision with root package name */
    private BroadcastReceiver f7785j;

    /* renamed from: k, reason: collision with root package name */
    private final yp2 f7786k;

    /* renamed from: l, reason: collision with root package name */
    private WeakReference<ViewTreeObserver> f7787l;

    /* renamed from: m, reason: collision with root package name */
    private WeakReference<View> f7788m;
    private vp2 n;
    private byte o = -1;
    private int p = -1;
    private long q = -3;

    public nq2(Context context, yp2 yp2Var) {
        Context applicationContext = context.getApplicationContext();
        this.f7781f = applicationContext;
        this.f7786k = yp2Var;
        this.f7783h = (PowerManager) applicationContext.getSystemService("power");
        this.f7784i = (KeyguardManager) applicationContext.getSystemService("keyguard");
        if (applicationContext instanceof Application) {
            Application application = (Application) applicationContext;
            this.f7782g = application;
            this.n = new vp2(application, this);
        }
        a(null);
    }

    private final void e() {
        f7780e.post(new lq2(this));
    }

    private final void f(Activity activity, int i2) {
        Window window;
        if (this.f7788m == null || (window = activity.getWindow()) == null) {
            return;
        }
        View viewPeekDecorView = window.peekDecorView();
        View viewB = b();
        if (viewB == null || viewPeekDecorView == null || viewB.getRootView() != viewPeekDecorView.getRootView()) {
            return;
        }
        this.p = i2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void g() {
        /*
            r7 = this;
            java.lang.ref.WeakReference<android.view.View> r0 = r7.f7788m
            if (r0 != 0) goto L5
            return
        L5:
            android.view.View r0 = r7.b()
            r1 = -1
            r2 = -3
            if (r0 != 0) goto L13
            r7.q = r2
            r7.o = r1
            return
        L13:
            int r4 = r0.getVisibility()
            if (r4 == 0) goto L1b
            r4 = 1
            goto L1c
        L1b:
            r4 = 0
        L1c:
            boolean r5 = r0.isShown()
            if (r5 != 0) goto L24
            r4 = r4 | 2
        L24:
            android.os.PowerManager r5 = r7.f7783h
            if (r5 == 0) goto L30
            boolean r5 = r5.isScreenOn()
            if (r5 != 0) goto L30
            r4 = r4 | 4
        L30:
            com.google.android.gms.internal.ads.yp2 r5 = r7.f7786k
            boolean r5 = r5.a()
            if (r5 != 0) goto L60
            android.app.KeyguardManager r5 = r7.f7784i
            if (r5 == 0) goto L5e
            boolean r5 = r5.inKeyguardRestrictedInputMode()
            if (r5 == 0) goto L5e
            android.app.Activity r5 = com.google.android.gms.internal.ads.jq2.g(r0)
            if (r5 != 0) goto L49
            goto L5e
        L49:
            android.view.Window r5 = r5.getWindow()
            if (r5 != 0) goto L51
            r5 = 0
            goto L55
        L51:
            android.view.WindowManager$LayoutParams r5 = r5.getAttributes()
        L55:
            if (r5 == 0) goto L5e
            int r5 = r5.flags
            r6 = 524288(0x80000, float:7.34684E-40)
            r5 = r5 & r6
            if (r5 != 0) goto L60
        L5e:
            r4 = r4 | 8
        L60:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getGlobalVisibleRect(r5)
            if (r5 != 0) goto L6d
            r4 = r4 | 16
        L6d:
            android.graphics.Rect r5 = new android.graphics.Rect
            r5.<init>()
            boolean r5 = r0.getLocalVisibleRect(r5)
            if (r5 != 0) goto L7a
            r4 = r4 | 32
        L7a:
            int r0 = r0.getWindowVisibility()
            int r5 = r7.p
            if (r5 == r1) goto L83
            r0 = r5
        L83:
            if (r0 == 0) goto L87
            r4 = r4 | 64
        L87:
            byte r0 = r7.o
            if (r0 == r4) goto L9a
            byte r0 = (byte) r4
            r7.o = r0
            if (r4 != 0) goto L95
            long r0 = android.os.SystemClock.elapsedRealtime()
            goto L98
        L95:
            long r0 = (long) r4
            long r0 = r2 - r0
        L98:
            r7.q = r0
        L9a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.ads.nq2.g():void");
    }

    private final void h(View view) {
        ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            this.f7787l = new WeakReference<>(viewTreeObserver);
            viewTreeObserver.addOnScrollChangedListener(this);
            viewTreeObserver.addOnGlobalLayoutListener(this);
        }
        if (this.f7785j == null) {
            IntentFilter intentFilter = new IntentFilter();
            intentFilter.addAction("android.intent.action.SCREEN_ON");
            intentFilter.addAction("android.intent.action.SCREEN_OFF");
            intentFilter.addAction("android.intent.action.USER_PRESENT");
            mq2 mq2Var = new mq2(this);
            this.f7785j = mq2Var;
            this.f7781f.registerReceiver(mq2Var, intentFilter);
        }
        Application application = this.f7782g;
        if (application != null) {
            try {
                application.registerActivityLifecycleCallbacks(this.n);
            } catch (Exception unused) {
            }
        }
    }

    private final void i(View view) {
        try {
            WeakReference<ViewTreeObserver> weakReference = this.f7787l;
            if (weakReference != null) {
                ViewTreeObserver viewTreeObserver = weakReference.get();
                if (viewTreeObserver != null && viewTreeObserver.isAlive()) {
                    viewTreeObserver.removeOnScrollChangedListener(this);
                    viewTreeObserver.removeGlobalOnLayoutListener(this);
                }
                this.f7787l = null;
            }
        } catch (Exception unused) {
        }
        try {
            ViewTreeObserver viewTreeObserver2 = view.getViewTreeObserver();
            if (viewTreeObserver2.isAlive()) {
                viewTreeObserver2.removeOnScrollChangedListener(this);
                viewTreeObserver2.removeGlobalOnLayoutListener(this);
            }
        } catch (Exception unused2) {
        }
        BroadcastReceiver broadcastReceiver = this.f7785j;
        if (broadcastReceiver != null) {
            try {
                this.f7781f.unregisterReceiver(broadcastReceiver);
            } catch (Exception unused3) {
            }
            this.f7785j = null;
        }
        Application application = this.f7782g;
        if (application != null) {
            try {
                application.unregisterActivityLifecycleCallbacks(this.n);
            } catch (Exception unused4) {
            }
        }
    }

    final void a(View view) {
        long j2;
        View viewB = b();
        if (viewB != null) {
            viewB.removeOnAttachStateChangeListener(this);
            i(viewB);
        }
        this.f7788m = new WeakReference<>(view);
        if (view != null) {
            if (view.getWindowToken() != null || view.getWindowVisibility() != 8) {
                h(view);
            }
            view.addOnAttachStateChangeListener(this);
            j2 = -2;
        } else {
            j2 = -3;
        }
        this.q = j2;
    }

    final View b() {
        WeakReference<View> weakReference = this.f7788m;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public final long c() {
        if (this.q <= -2 && b() == null) {
            this.q = -3L;
        }
        return this.q;
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityCreated(Activity activity, Bundle bundle) {
        f(activity, 0);
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityDestroyed(Activity activity) {
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityPaused(Activity activity) {
        f(activity, 4);
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityResumed(Activity activity) {
        f(activity, 0);
        g();
        e();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStarted(Activity activity) {
        f(activity, 0);
        g();
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public final void onActivityStopped(Activity activity) {
        g();
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        g();
    }

    @Override // android.view.ViewTreeObserver.OnScrollChangedListener
    public final void onScrollChanged() {
        g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(View view) {
        this.p = -1;
        h(view);
        g();
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(View view) {
        this.p = -1;
        g();
        e();
        i(view);
    }
}