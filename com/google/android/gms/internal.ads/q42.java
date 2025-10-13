package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class q42<V> extends p42<V> {

    /* renamed from: l, reason: collision with root package name */
    private final g52<V> f8326l;

    q42(g52<V> g52Var) {
        Objects.requireNonNull(g52Var);
        this.f8326l = g52Var;
    }

    @Override // com.google.android.gms.internal.ads.f32, java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f8326l.cancel(z);
    }

    @Override // com.google.android.gms.internal.ads.f32, java.util.concurrent.Future
    public final V get() {
        return this.f8326l.get();
    }

    @Override // com.google.android.gms.internal.ads.f32, java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f8326l.isCancelled();
    }

    @Override // com.google.android.gms.internal.ads.f32, java.util.concurrent.Future
    public final boolean isDone() {
        return this.f8326l.isDone();
    }

    @Override // com.google.android.gms.internal.ads.f32
    public final String toString() {
        return this.f8326l.toString();
    }

    @Override // com.google.android.gms.internal.ads.f32, com.google.android.gms.internal.ads.g52
    public final void zze(Runnable runnable, Executor executor) {
        this.f8326l.zze(runnable, executor);
    }

    @Override // com.google.android.gms.internal.ads.f32, java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) {
        return this.f8326l.get(j2, timeUnit);
    }
}