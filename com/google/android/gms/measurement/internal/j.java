package com.google.android.gms.measurement.internal;

import android.os.Handler;
import e.c.b.b.c.e.pf;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
abstract class j {
    private static volatile Handler a;

    /* renamed from: b, reason: collision with root package name */
    private final z5 f10959b;

    /* renamed from: c, reason: collision with root package name */
    private final Runnable f10960c;

    /* renamed from: d, reason: collision with root package name */
    private volatile long f10961d;

    j(z5 z5Var) {
        com.google.android.gms.common.internal.p.j(z5Var);
        this.f10959b = z5Var;
        this.f10960c = new m(this, z5Var);
    }

    static /* synthetic */ long a(j jVar, long j2) {
        jVar.f10961d = 0L;
        return 0L;
    }

    private final Handler f() {
        Handler handler;
        if (a != null) {
            return a;
        }
        synchronized (j.class) {
            if (a == null) {
                a = new pf(this.f10959b.zzm().getMainLooper());
            }
            handler = a;
        }
        return handler;
    }

    public abstract void b();

    public final void c(long j2) {
        e();
        if (j2 >= 0) {
            this.f10961d = this.f10959b.zzl().a();
            if (f().postDelayed(this.f10960c, j2)) {
                return;
            }
            this.f10959b.zzq().A().b("Failed to schedule delayed post. time", Long.valueOf(j2));
        }
    }

    public final boolean d() {
        return this.f10961d != 0;
    }

    final void e() {
        this.f10961d = 0L;
        f().removeCallbacks(this.f10960c);
    }
}