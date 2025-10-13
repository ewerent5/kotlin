package com.google.android.gms.internal.ads;

import android.app.Activity;
import android.content.Context;
import android.view.View;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class dp2 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ Context f5498e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ String f5499f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ View f5500g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Activity f5501h;

    dp2(gp2 gp2Var, Context context, String str, View view, Activity activity) {
        this.f5498e = context;
        this.f5499f = str;
        this.f5500g = view;
        this.f5501h = activity;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            gp2.y.zzh(this.f5498e, this.f5499f, this.f5500g, this.f5501h);
        } catch (Exception e2) {
            gp2.A.d(2021, -1L, e2);
        }
    }
}