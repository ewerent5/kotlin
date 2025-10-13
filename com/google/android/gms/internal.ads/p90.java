package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class p90 implements qa0, fh0, cf0, eb0 {

    /* renamed from: e, reason: collision with root package name */
    private final gb0 f8122e;

    /* renamed from: f, reason: collision with root package name */
    private final xo1 f8123f;

    /* renamed from: g, reason: collision with root package name */
    private final ScheduledExecutorService f8124g;

    /* renamed from: h, reason: collision with root package name */
    private final Executor f8125h;

    /* renamed from: i, reason: collision with root package name */
    private final p52<Boolean> f8126i = p52.D();

    /* renamed from: j, reason: collision with root package name */
    private ScheduledFuture<?> f8127j;

    public p90(gb0 gb0Var, xo1 xo1Var, ScheduledExecutorService scheduledExecutorService, Executor executor) {
        this.f8122e = gb0Var;
        this.f8123f = xo1Var;
        this.f8124g = scheduledExecutorService;
        this.f8125h = executor;
    }

    @Override // com.google.android.gms.internal.ads.eb0
    public final synchronized void I(g93 g93Var) {
        if (this.f8126i.isDone()) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f8127j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f8126i.m(new Exception());
    }

    final /* synthetic */ void a() {
        synchronized (this) {
            if (this.f8126i.isDone()) {
                return;
            }
            this.f8126i.l(Boolean.TRUE);
        }
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void d(gm gmVar, String str, String str2) {
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final void zza() {
        if (((Boolean) c.c().b(w3.a1)).booleanValue()) {
            xo1 xo1Var = this.f8123f;
            if (xo1Var.S == 2) {
                if (xo1Var.p == 0) {
                    this.f8122e.zza();
                } else {
                    y42.o(this.f8126i, new o90(this), this.f8125h);
                    this.f8127j = this.f8124g.schedule(new Runnable(this) { // from class: com.google.android.gms.internal.ads.n90

                        /* renamed from: e, reason: collision with root package name */
                        private final p90 f7670e;

                        {
                            this.f7670e = this;
                        }

                        @Override // java.lang.Runnable
                        public final void run() {
                            this.f7670e.a();
                        }
                    }, this.f8123f.p, TimeUnit.MILLISECONDS);
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final synchronized void zzb() {
        if (this.f8126i.isDone()) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f8127j;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(true);
        }
        this.f8126i.l(Boolean.TRUE);
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzc() {
        int i2 = this.f8123f.S;
        if (i2 == 0 || i2 == 1) {
            this.f8122e.zza();
        }
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzd() {
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zze() {
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzg() {
    }

    @Override // com.google.android.gms.internal.ads.qa0
    public final void zzh() {
    }

    @Override // com.google.android.gms.internal.ads.fh0
    public final void zzj() {
    }

    @Override // com.google.android.gms.internal.ads.cf0
    public final void zzk() {
    }
}