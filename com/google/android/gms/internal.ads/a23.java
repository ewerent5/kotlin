package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.app.Application;
import android.os.Bundle;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class a23 implements h23 {
    final /* synthetic */ Activity a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ Bundle f4825b;

    a23(i23 i23Var, Activity activity, Bundle bundle) {
        this.a = activity;
        this.f4825b = bundle;
    }

    @Override // com.google.android.gms.internal.ads.h23
    public final void a(Application.ActivityLifecycleCallbacks activityLifecycleCallbacks) {
        activityLifecycleCallbacks.onActivityCreated(this.a, this.f4825b);
    }
}