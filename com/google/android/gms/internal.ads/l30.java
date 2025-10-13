package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class l30 implements p23 {
    private final ScheduledExecutorService a;

    /* renamed from: b, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f7173b;

    /* renamed from: c, reason: collision with root package name */
    @GuardedBy("this")
    private ScheduledFuture<?> f7174c;

    /* renamed from: d, reason: collision with root package name */
    @GuardedBy("this")
    private long f7175d = -1;

    /* renamed from: e, reason: collision with root package name */
    @GuardedBy("this")
    private long f7176e = -1;

    /* renamed from: f, reason: collision with root package name */
    @GuardedBy("this")
    private Runnable f7177f = null;

    /* renamed from: g, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f7178g = false;

    public l30(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.f fVar) {
        this.a = scheduledExecutorService;
        this.f7173b = fVar;
        zzs.zzf().b(this);
    }

    public final synchronized void a(int i2, Runnable runnable) {
        this.f7177f = runnable;
        long j2 = i2;
        this.f7175d = this.f7173b.c() + j2;
        this.f7174c = this.a.schedule(runnable, j2, TimeUnit.MILLISECONDS);
    }

    final synchronized void b() {
        if (this.f7178g) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f7174c;
        if (scheduledFuture == null || scheduledFuture.isDone()) {
            this.f7176e = -1L;
        } else {
            this.f7174c.cancel(true);
            this.f7176e = this.f7175d - this.f7173b.c();
        }
        this.f7178g = true;
    }

    final synchronized void c() {
        ScheduledFuture<?> scheduledFuture;
        if (this.f7178g) {
            if (this.f7176e > 0 && (scheduledFuture = this.f7174c) != null && scheduledFuture.isCancelled()) {
                this.f7174c = this.a.schedule(this.f7177f, this.f7176e, TimeUnit.MILLISECONDS);
            }
            this.f7178g = false;
        }
    }

    @Override // com.google.android.gms.internal.ads.p23
    public final void zza(boolean z) {
        if (z) {
            c();
        } else {
            b();
        }
    }
}