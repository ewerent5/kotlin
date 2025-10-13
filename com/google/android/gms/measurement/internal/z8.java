package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
final /* synthetic */ class z8 implements Runnable {

    /* renamed from: e */
    private final x8 f11385e;

    /* renamed from: f */
    private final v3 f11386f;

    /* renamed from: g */
    private final JobParameters f11387g;

    z8(x8 x8Var, v3 v3Var, JobParameters jobParameters) {
        this.f11385e = x8Var;
        this.f11386f = v3Var;
        this.f11387g = jobParameters;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.f11385e.e(this.f11386f, this.f11387g);
    }
}