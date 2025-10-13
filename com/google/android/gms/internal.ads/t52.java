package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class t52<V> extends o42<V> {

    /* renamed from: l, reason: collision with root package name */
    @NullableDecl
    private g52<V> f9081l;

    /* renamed from: m, reason: collision with root package name */
    @NullableDecl
    private ScheduledFuture<?> f9082m;

    private t52(g52<V> g52Var) {
        Objects.requireNonNull(g52Var);
        this.f9081l = g52Var;
    }

    static <V> g52<V> E(g52<V> g52Var, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        t52 t52Var = new t52(g52Var);
        r52 r52Var = new r52(t52Var);
        t52Var.f9082m = scheduledExecutorService.schedule(r52Var, j2, timeUnit);
        g52Var.zze(r52Var, m42.INSTANCE);
        return t52Var;
    }

    static /* synthetic */ ScheduledFuture H(t52 t52Var, ScheduledFuture scheduledFuture) {
        t52Var.f9082m = null;
        return null;
    }

    @Override // com.google.android.gms.internal.ads.f32
    protected final String h() {
        g52<V> g52Var = this.f9081l;
        ScheduledFuture<?> scheduledFuture = this.f9082m;
        if (g52Var == null) {
            return null;
        }
        String strValueOf = String.valueOf(g52Var);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 14);
        sb.append("inputFuture=[");
        sb.append(strValueOf);
        sb.append("]");
        String string = sb.toString();
        if (scheduledFuture == null) {
            return string;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return string;
        }
        String strValueOf2 = String.valueOf(string);
        StringBuilder sb2 = new StringBuilder(strValueOf2.length() + 43);
        sb2.append(strValueOf2);
        sb2.append(", remaining delay=[");
        sb2.append(delay);
        sb2.append(" ms]");
        return sb2.toString();
    }

    @Override // com.google.android.gms.internal.ads.f32
    protected final void i() {
        o(this.f9081l);
        ScheduledFuture<?> scheduledFuture = this.f9082m;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.f9081l = null;
        this.f9082m = null;
    }
}