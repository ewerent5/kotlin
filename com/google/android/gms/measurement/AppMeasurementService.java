package com.google.android.gms.measurement;

import android.app.Service;
import android.app.job.JobParameters;
import android.content.Intent;
import android.os.IBinder;
import c.n.a.a;
import com.google.android.gms.measurement.internal.b9;
import com.google.android.gms.measurement.internal.x8;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class AppMeasurementService extends Service implements b9 {

    /* renamed from: e, reason: collision with root package name */
    private x8<AppMeasurementService> f10735e;

    private final x8<AppMeasurementService> d() {
        if (this.f10735e == null) {
            this.f10735e = new x8<>(this);
        }
        return this.f10735e;
    }

    @Override // com.google.android.gms.measurement.internal.b9
    public final void a(Intent intent) {
        a.b(intent);
    }

    @Override // com.google.android.gms.measurement.internal.b9
    public final boolean b(int i2) {
        return stopSelfResult(i2);
    }

    @Override // com.google.android.gms.measurement.internal.b9
    public final void c(JobParameters jobParameters, boolean z) {
        throw new UnsupportedOperationException();
    }

    @Override // android.app.Service
    public final IBinder onBind(Intent intent) {
        return d().b(intent);
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

    @Override // android.app.Service
    public final int onStartCommand(Intent intent, int i2, int i3) {
        return d().a(intent, i2, i3);
    }

    @Override // android.app.Service
    public final boolean onUnbind(Intent intent) {
        return d().i(intent);
    }
}