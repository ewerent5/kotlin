package com.parizene.netmonitor.foreground;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.app.KeyguardManager;
import android.content.BroadcastReceiver;
import android.content.ComponentCallbacks2;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Configuration;
import android.os.Bundle;
import android.os.PowerManager;
import ch.qos.logback.core.CoreConstants;
import i.y.d.l;
import java.util.List;

/* compiled from: LegacyForegroundStateChangedReceiver.kt */
/* loaded from: classes3.dex */
public final class f extends com.parizene.netmonitor.foreground.a implements Application.ActivityLifecycleCallbacks, ComponentCallbacks2 {

    /* renamed from: g, reason: collision with root package name */
    private final Application f13190g;

    /* renamed from: h, reason: collision with root package name */
    private final KeyguardManager f13191h;

    /* renamed from: i, reason: collision with root package name */
    private final ActivityManager f13192i;

    /* renamed from: j, reason: collision with root package name */
    private final PowerManager f13193j;

    /* renamed from: k, reason: collision with root package name */
    private final BroadcastReceiver f13194k;

    /* compiled from: LegacyForegroundStateChangedReceiver.kt */
    public static final class a extends BroadcastReceiver {
        a() {
        }

        @Override // android.content.BroadcastReceiver
        public void onReceive(Context context, Intent intent) {
            l.d(context, CoreConstants.CONTEXT_SCOPE_VALUE);
            l.d(intent, "intent");
            String action = intent.getAction();
            if (l.a("android.intent.action.SCREEN_ON", action) && f.this.m() && !f.this.f13191h.isKeyguardLocked()) {
                f.this.i(b.FOREGROUND);
            } else if (l.a("android.intent.action.SCREEN_OFF", action)) {
                f.this.i(b.BACKGROUND);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(org.greenrobot.eventbus.c cVar, Application application, KeyguardManager keyguardManager, ActivityManager activityManager, PowerManager powerManager) {
        super(cVar);
        l.d(cVar, "eventBus");
        l.d(application, "application");
        l.d(keyguardManager, "keyguardManager");
        l.d(activityManager, "activityManager");
        l.d(powerManager, "powerManager");
        this.f13190g = application;
        this.f13191h = keyguardManager;
        this.f13192i = activityManager;
        this.f13193j = powerManager;
        this.f13194k = new a();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean m() throws SecurityException {
        List<ActivityManager.RunningTaskInfo> runningTasks = this.f13192i.getRunningTasks(1);
        if (runningTasks.size() <= 0) {
            return false;
        }
        String packageName = this.f13190g.getPackageName();
        ComponentName componentName = runningTasks.get(0).topActivity;
        return l.a(packageName, componentName == null ? null : componentName.getPackageName());
    }

    @Override // com.parizene.netmonitor.foreground.a
    public void h() {
        this.f13190g.registerActivityLifecycleCallbacks(this);
        this.f13190g.registerComponentCallbacks(this);
        IntentFilter intentFilter = new IntentFilter();
        intentFilter.addAction("android.intent.action.SCREEN_OFF");
        intentFilter.addAction("android.intent.action.SCREEN_ON");
        this.f13190g.registerReceiver(this.f13194k, intentFilter);
    }

    @Override // com.parizene.netmonitor.foreground.a
    public void j() {
        this.f13190g.unregisterReceiver(this.f13194k);
        this.f13190g.unregisterActivityLifecycleCallbacks(this);
        this.f13190g.unregisterComponentCallbacks(this);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityCreated(Activity activity, Bundle bundle) {
        l.d(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityDestroyed(Activity activity) {
        l.d(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityPaused(Activity activity) {
        l.d(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityResumed(Activity activity) {
        l.d(activity, "activity");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
        l.d(activity, "activity");
        l.d(bundle, "outState");
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStarted(Activity activity) {
        l.d(activity, "activity");
        i(this.f13193j.isScreenOn() ? b.FOREGROUND : b.BACKGROUND);
    }

    @Override // android.app.Application.ActivityLifecycleCallbacks
    public void onActivityStopped(Activity activity) {
        l.d(activity, "activity");
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        l.d(configuration, "newConfig");
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        if (i2 >= 20) {
            i(b.BACKGROUND);
        }
    }
}