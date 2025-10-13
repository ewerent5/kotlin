package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import javax.annotation.ParametersAreNonnullByDefault;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public class wr<T> implements g52<T> {
    private final p52<T> zza = p52.D();

    private static final boolean zza(boolean z) {
        if (!z) {
            zzs.zzg().h(new IllegalStateException("Provided SettableFuture with multiple values."), "SettableFuture");
        }
        return z;
    }

    @Override // java.util.concurrent.Future
    public boolean cancel(boolean z) {
        return this.zza.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final T get() {
        return this.zza.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.zza.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.zza.isDone();
    }

    public final boolean zzc(T t) {
        boolean zL = this.zza.l(t);
        zza(zL);
        return zL;
    }

    public final boolean zzd(Throwable th) {
        boolean zM = this.zza.m(th);
        zza(zM);
        return zM;
    }

    @Override // com.google.android.gms.internal.ads.g52
    public final void zze(Runnable runnable, Executor executor) {
        this.zza.zze(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final T get(long j2, TimeUnit timeUnit) {
        return this.zza.get(j2, timeUnit);
    }
}