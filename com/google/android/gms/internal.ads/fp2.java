package com.google.android.gms.internal.ads;

import android.view.MotionEvent;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class fp2 implements Runnable {

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f5927e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ int f5928f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ int f5929g;

    fp2(gp2 gp2Var, int i2, int i3, int i4) {
        this.f5927e = i2;
        this.f5928f = i3;
        this.f5929g = i4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            gp2.y.zzf(MotionEvent.obtain(0L, this.f5927e, 0, this.f5928f, this.f5929g, 0));
        } catch (Exception e2) {
            gp2.A.d(2022, -1L, e2);
        }
    }
}