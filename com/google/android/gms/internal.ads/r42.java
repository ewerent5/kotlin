package com.google.android.gms.internal.ads;

import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class r42<V> extends t12 implements Future<V> {
    protected r42() {
    }

    protected abstract Future<? extends V> c();

    @Override // java.util.concurrent.Future
    public final V get() {
        return c().get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return c().isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return c().isDone();
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) {
        return c().get(j2, timeUnit);
    }
}