package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class cp2 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f5349e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ View f5350f;

    cp2(gp2 gp2Var, Context context, View view, Activity activity) {
        this.f5349e = context;
        this.f5350f = view;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            gp2.y.zzk(this.f5349e, this.f5350f, null);
        } catch (Exception e2) {
            gp2.A.d(2020, -1L, e2);
        }
    }
}