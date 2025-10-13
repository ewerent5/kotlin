package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class n52 extends j52 implements ScheduledExecutorService, h52 {

    /* renamed from: f, reason: collision with root package name */
    final ScheduledExecutorService f7656f;

    n52(ScheduledExecutorService scheduledExecutorService) {
        super(scheduledExecutorService);
        Objects.requireNonNull(scheduledExecutorService);
        this.f7656f = scheduledExecutorService;
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Runnable runnable, long j2, TimeUnit timeUnit) {
        w52 w52VarE = w52.E(runnable, null);
        return new l52(w52VarE, this.f7656f.schedule(w52VarE, j2, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleAtFixedRate(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        m52 m52Var = new m52(runnable);
        return new l52(m52Var, this.f7656f.scheduleAtFixedRate(m52Var, j2, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture scheduleWithFixedDelay(Runnable runnable, long j2, long j3, TimeUnit timeUnit) {
        m52 m52Var = new m52(runnable);
        return new l52(m52Var, this.f7656f.scheduleWithFixedDelay(m52Var, j2, j3, timeUnit));
    }

    @Override // java.util.concurrent.ScheduledExecutorService
    public final /* bridge */ /* synthetic */ ScheduledFuture schedule(Callable callable, long j2, TimeUnit timeUnit) {
        w52 w52Var = new w52(callable);
        return new l52(w52Var, this.f7656f.schedule(w52Var, j2, timeUnit));
    }
}