package com.google.android.gms.measurement.internal;

import android.annotation.TargetApi;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.app.job.JobInfo;
import android.app.job.JobScheduler;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.PersistableBundle;
import ch.qos.logback.core.net.SyslogConstants;

/* compiled from: com.google.android.gms:play-services-measurement@@18.0.0 */
/* loaded from: classes.dex */
public final class p9 extends q9 {

    /* renamed from: d, reason: collision with root package name */
    private final AlarmManager f11132d;

    /* renamed from: e, reason: collision with root package name */
    private final j f11133e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f11134f;

    protected p9(t9 t9Var) {
        super(t9Var);
        this.f11132d = (AlarmManager) zzm().getSystemService("alarm");
        this.f11133e = new o9(this, t9Var.h0(), t9Var);
    }

    @TargetApi(SyslogConstants.LOG_DAEMON)
    private final void u() {
        ((JobScheduler) zzm().getSystemService("jobscheduler")).cancel(v());
    }

    private final int v() {
        if (this.f11134f == null) {
            String strValueOf = String.valueOf(zzm().getPackageName());
            this.f11134f = Integer.valueOf((strValueOf.length() != 0 ? "measurement".concat(strValueOf) : new String("measurement")).hashCode());
        }
        return this.f11134f.intValue();
    }

    private final PendingIntent w() {
        Context contextZzm = zzm();
        return PendingIntent.getBroadcast(contextZzm, 0, new Intent().setClassName(contextZzm, "com.google.android.gms.measurement.AppMeasurementReceiver").setAction("com.google.android.gms.measurement.UPLOAD"), 0);
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ void d() {
        super.d();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ l e() {
        return super.e();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ t3 f() {
        return super.f();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ da g() {
        return super.g();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ i4 h() {
        return super.h();
    }

    @Override // com.google.android.gms.measurement.internal.x5
    public final /* bridge */ /* synthetic */ c i() {
        return super.i();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ z9 j() {
        return super.j();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ y8 k() {
        return super.k();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ oa l() {
        return super.l();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ g m() {
        return super.m();
    }

    @Override // com.google.android.gms.measurement.internal.r9
    public final /* bridge */ /* synthetic */ u4 n() {
        return super.n();
    }

    @Override // com.google.android.gms.measurement.internal.q9
    protected final boolean r() {
        this.f11132d.cancel(w());
        if (Build.VERSION.SDK_INT < 24) {
            return false;
        }
        u();
        return false;
    }

    public final void s(long j2) {
        p();
        Context contextZzm = zzm();
        if (!s4.b(contextZzm)) {
            zzq().H().a("Receiver not registered/enabled");
        }
        if (!da.U(contextZzm, false)) {
            zzq().H().a("Service not registered/enabled");
        }
        t();
        zzq().I().b("Scheduling upload, millis", Long.valueOf(j2));
        long jC = zzl().c() + j2;
        if (j2 < Math.max(0L, t.y.a(null).longValue()) && !this.f11133e.d()) {
            this.f11133e.c(j2);
        }
        if (Build.VERSION.SDK_INT < 24) {
            this.f11132d.setInexactRepeating(2, jC, Math.max(t.t.a(null).longValue(), j2), w());
            return;
        }
        Context contextZzm2 = zzm();
        ComponentName componentName = new ComponentName(contextZzm2, "com.google.android.gms.measurement.AppMeasurementJobService");
        int iV = v();
        PersistableBundle persistableBundle = new PersistableBundle();
        persistableBundle.putString("action", "com.google.android.gms.measurement.UPLOAD");
        e.c.b.b.c.e.r6.b(contextZzm2, new JobInfo.Builder(iV, componentName).setMinimumLatency(j2).setOverrideDeadline(j2 << 1).setExtras(persistableBundle).build(), "com.google.android.gms", "UploadAlarm");
    }

    public final void t() {
        p();
        zzq().I().a("Unscheduling upload");
        this.f11132d.cancel(w());
        this.f11133e.e();
        if (Build.VERSION.SDK_INT >= 24) {
            u();
        }
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ com.google.android.gms.common.util.f zzl() {
        return super.zzl();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ Context zzm() {
        return super.zzm();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ w4 zzp() {
        return super.zzp();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ v3 zzq() {
        return super.zzq();
    }

    @Override // com.google.android.gms.measurement.internal.x5, com.google.android.gms.measurement.internal.z5
    public final /* bridge */ /* synthetic */ ta zzt() {
        return super.zzt();
    }
}