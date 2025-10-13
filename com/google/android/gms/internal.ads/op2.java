package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class op2 implements up2 {
    final /* synthetic */ Activity a;

    op2(vp2 vp2Var, Activity activity) {
        this.a = activity;
    }

    @Override // com.google.android.gms.internal.ads.up2
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityStarted(this.a);
    }
}