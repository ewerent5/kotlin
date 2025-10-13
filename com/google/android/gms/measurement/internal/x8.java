package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import ch.qos.logback.core.net.SyslogConstants;
import com.google.android.gms.measurement.internal.b9;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class x8<T extends Context & b9> {
    private final T a;

    public x8(T t) {
        com.google.android.gms.common.internal.p.j(t);
        this.a = t;
    }

    private final void f(Runnable runnable) {
        t9 t9VarE = t9.e(this.a);
        t9VarE.zzp().u(new c9(this, t9VarE, runnable));
    }

    private final v3 j() {
        return z4.b(this.a, null, null).zzq();
    }

    public final int a(final Intent intent, int i2, final int i3) {
        final v3 v3VarZzq = z4.b(this.a, null, null).zzq();
        if (intent == null) {
            v3VarZzq.D().a("AppMeasurementService started with null intent");
            return 2;
        }
        String action = intent.getAction();
        v3VarZzq.I().c("Local AppMeasurementService called. startId, action", Integer.valueOf(i3), action);
        if ("com.google.android.gms.measurement.UPLOAD".equals(action)) {
            f(new Runnable(this, i3, v3VarZzq, intent) { // from class: com.google.android.gms.measurement.internal.a9

                /* renamed from: e, reason: collision with root package name */
                private final x8 f10758e;

                /* renamed from: f, reason: collision with root package name */
                private final int f10759f;

                /* renamed from: g, reason: collision with root package name */
                private final v3 f10760g;

                /* renamed from: h, reason: collision with root package name */
                private final Intent f10761h;

                {
                    this.f10758e = this;
                    this.f10759f = i3;
                    this.f10760g = v3VarZzq;
                    this.f10761h = intent;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    this.f10758e.d(this.f10759f, this.f10760g, this.f10761h);
                }
            });
        }
        return 2;
    }

    public final IBinder b(Intent intent) {
        if (intent == null) {
            j().A().a("onBind called with null intent");
            return null;
        }
        String action = intent.getAction();
        if ("com.google.android.gms.measurement.START".equals(action)) {
            return new e5(t9.e(this.a));
        }
        j().D().b("onBind received unknown action", action);
        return null;
    }

    public final void c() {
        z4.b(this.a, null, null).zzq().I().a("Local AppMeasurementService is starting up");
    }

    final /* synthetic */ void d(int i2, v3 v3Var, Intent intent) {
        if (this.a.b(i2)) {
            v3Var.I().b("Local AppMeasurementService processed last upload request. StartId", Integer.valueOf(i2));
            j().I().a("Completed wakeful intent.");
            this.a.a(intent);
        }
    }

    final /* synthetic */ void e(v3 v3Var, JobParameters jobParameters) {
        v3Var.I().a("AppMeasurementJobService processed last upload request.");
        this.a.c(jobParameters, false);
    }

    @TargetApi(SyslogConstants.LOG_DAEMON)
    public final boolean g(final JobParameters jobParameters) {
        final v3 v3VarZzq = z4.b(this.a, null, null).zzq();
        String string = jobParameters.getExtras().getString("action");
        v3VarZzq.I().b("Local AppMeasurementJobService called. action", string);
        if (!"com.google.android.gms.measurement.UPLOAD".equals(string)) {
            return true;
        }
        f(new Runnable(this, v3VarZzq, jobParameters) { // from class: com.google.android.gms.measurement.internal.z8

            /* renamed from: e, reason: collision with root package name */
            private final x8 f11385e;

            /* renamed from: f, reason: collision with root package name */
            private final v3 f11386f;

            /* renamed from: g, reason: collision with root package name */
            private final JobParameters f11387g;

            {
                this.f11385e = this;
                this.f11386f = v3VarZzq;
                this.f11387g = jobParameters;
            }

            @Override // java.lang.Runnable
            public final void run() {
                this.f11385e.e(this.f11386f, this.f11387g);
            }
        });
        return true;
    }

    public final void h() {
        z4.b(this.a, null, null).zzq().I().a("Local AppMeasurementService is shutting down");
    }

    public final boolean i(Intent intent) {
        if (intent == null) {
            j().A().a("onUnbind called with null intent");
            return true;
        }
        j().I().b("onUnbind called for intent. action", intent.getAction());
        return true;
    }

    public final void k(Intent intent) {
        if (intent == null) {
            j().A().a("onRebind called with null intent");
        } else {
            j().I().b("onRebind called. action", intent.getAction());
        }
    }
}