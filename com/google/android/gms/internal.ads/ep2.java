package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class ep2 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ MotionEvent f5684e;

    ep2(gp2 gp2Var, MotionEvent motionEvent) {
        this.f5684e = motionEvent;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            gp2.y.zzf(this.f5684e);
        } catch (Exception e2) {
            gp2.A.d(2022, -1L, e2);
        }
    }
}