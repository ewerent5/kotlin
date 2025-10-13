package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class sp2 implements up2 {
    final /* synthetic */ Activity a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f8958b;

    sp2(vp2 vp2Var, Activity activity, Bundle bundle) {
        this.a = activity;
        this.f8958b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.up2
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivitySaveInstanceState(this.a, this.f8958b);
    }
}