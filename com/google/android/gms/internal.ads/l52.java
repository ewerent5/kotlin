package com.google.android.gms.internal.ads;

import java.util.concurrent.Delayed;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class l52<V> extends s42<V> implements ScheduledFuture<V>, g52 {

    /* renamed from: f, reason: collision with root package name */
    private final ScheduledFuture<?> f7200f;

    public l52(g52<V> g52Var, ScheduledFuture<?> scheduledFuture) {
        super(g52Var);
        this.f7200f = scheduledFuture;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        boolean zCancel = c().cancel(z);
        if (zCancel) {
            this.f7200f.cancel(z);
        }
        return zCancel;
    }

    @Override // java.lang.Comparable
    public final /* bridge */ /* synthetic */ int compareTo(Delayed delayed) {
        return this.f7200f.compareTo(delayed);
    }

    @Override // java.util.concurrent.Delayed
    public final long getDelay(TimeUnit timeUnit) {
        return this.f7200f.getDelay(timeUnit);
    }
}