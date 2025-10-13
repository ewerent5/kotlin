package com.google.android.gms.measurement.internal;

import android.content.ComponentName;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
final class w8 implements Runnable {

    /* renamed from: e */
    private final /* synthetic */ s8 f11317e;

    w8(s8 s8Var) {
        this.f11317e = s8Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11317e.f11213c.y(new ComponentName(this.f11317e.f11213c.zzm(), "com.google.android.gms.measurement.AppMeasurementService"));
    }
}