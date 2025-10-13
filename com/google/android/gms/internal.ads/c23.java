package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class c23 implements h23 {
    final /* synthetic */ Activity a;

    c23(i23 i23Var, Activity activity) {
        this.a = activity;
    }

    @Override // com.google.android.gms.internal.ads.h23
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityResumed(this.a);
    }
}