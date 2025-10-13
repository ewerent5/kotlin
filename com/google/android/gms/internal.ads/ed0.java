package com.google.android.gms.internal.ads;

import java.util.Collections;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ed0 extends sf0<fd0> {

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledExecutorService f5622f;

    /* renamed from: g, reason: collision with root package name */
    private final com.google.android.gms.common.util.f f5623g;

    /* renamed from: h, reason: collision with root package name */
    @GuardedBy("this")
    private long f5624h;

    /* renamed from: i, reason: collision with root package name */
    @GuardedBy("this")
    private long f5625i;

    /* renamed from: j, reason: collision with root package name */
    @GuardedBy("this")
    private boolean f5626j;

    /* renamed from: k, reason: collision with root package name */
    @GuardedBy("this")
    private ScheduledFuture<?> f5627k;

    public ed0(ScheduledExecutorService scheduledExecutorService, com.google.android.gms.common.util.f fVar) {
        super(Collections.emptySet());
        this.f5624h = -1L;
        this.f5625i = -1L;
        this.f5626j = false;
        this.f5622f = scheduledExecutorService;
        this.f5623g = fVar;
    }

    private final synchronized void M0(long j2) {
        ScheduledFuture<?> scheduledFuture = this.f5627k;
        if (scheduledFuture != null && !scheduledFuture.isDone()) {
            this.f5627k.cancel(true);
        }
        this.f5624h = this.f5623g.c() + j2;
        this.f5627k = this.f5622f.schedule(new dd0(this, null), j2, TimeUnit.MILLISECONDS);
    }

    public final synchronized void K0() {
        if (this.f5626j) {
            if (this.f5625i > 0 && this.f5627k.isCancelled()) {
                M0(this.f5625i);
            }
            this.f5626j = false;
        }
    }

    public final synchronized void L0(int i2) {
        if (i2 <= 0) {
            return;
        }
        long millis = TimeUnit.SECONDS.toMillis(i2);
        if (this.f5626j) {
            long j2 = this.f5625i;
            if (j2 <= 0 || millis >= j2) {
                millis = j2;
            }
            this.f5625i = millis;
            return;
        }
        long jC = this.f5623g.c();
        long j3 = this.f5624h;
        if (jC > j3 || j3 - this.f5623g.c() > millis) {
            M0(millis);
        }
    }

    public final synchronized void zza() {
        if (this.f5626j) {
            return;
        }
        ScheduledFuture<?> scheduledFuture = this.f5627k;
        if (scheduledFuture == null || scheduledFuture.isCancelled()) {
            this.f5625i = -1L;
        } else {
            this.f5627k.cancel(true);
            this.f5625i = this.f5624h - this.f5623g.c();
        }
        this.f5626j = true;
    }

    public final synchronized void zzc() {
        this.f5626j = false;
        M0(0L);
    }
}