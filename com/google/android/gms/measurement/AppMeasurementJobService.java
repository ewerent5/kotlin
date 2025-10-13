package com.google.android.gms.measurement;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.measurement.internal.b9;
import com.google.android.gms.measurement.internal.x8;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
@TargetApi(SyslogConstants.LOG_DAEMON)
/* loaded from: classes.dex */
public final class AppMeasurementJobService extends JobService implements b9 {

    /* renamed from: e, reason: collision with root package name */
    private x8<AppMeasurementJobService> f10733e;

    private final x8<AppMeasurementJobService> d() {
        if (this.f10733e == null) {
            this.f10733e = new x8<>(this);
        }
        return this.f10733e;
    }

    @Override // com.google.android.gms.measurement.internal.b9
    public final void a(Intent intent) {
    }

    @Override // com.google.android.gms.measurement.internal.b9
    public final boolean b(int i2) {
        throw new UnsupportedOperationException();
    }

    @Override // com.google.android.gms.measurement.internal.b9
    @TargetApi(SyslogConstants.LOG_DAEMON)
    public final void c(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }

    @Override // android.app.Service
    public final void onCreate() {
        super.onCreate();
        d().c();
    }

    @Override // android.app.Service
    public final void onDestroy() {
        d().h();
        super.onDestroy();
    }

    @Override // android.app.Service
    public final void onRebind(Intent intent) {
        d().k(intent);
    }

    @Override // android.app.job.JobService
    public final boolean onStartJob(JobParameters jobParameters) {
        return d().g(jobParameters);
    }

    @Override // android.app.job.JobService
    public final boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return d().i(intent);
    }
}