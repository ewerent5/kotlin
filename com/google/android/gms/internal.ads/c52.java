package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class c52<V> implements g52<V> {

    /* renamed from: e, reason: collision with root package name */
    static final g52<?> f5262e = new c52(null);

    /* renamed from: f, reason: collision with root package name */
    private static final Logger f5263f = Logger.getLogger(c52.class.getName());

    /* renamed from: g, reason: collision with root package name */
    @NullableDecl
    private final V f5264g;

    c52(@NullableDecl V v) {
        this.f5264g = v;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.f5264g;
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) {
        Objects.requireNonNull(timeUnit);
        return this.f5264g;
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return false;
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return true;
    }

    public final String toString() {
        String string = super.toString();
        String strValueOf = String.valueOf(this.f5264g);
        StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 27 + strValueOf.length());
        sb.append(string);
        sb.append("[status=SUCCESS, result=[");
        sb.append(strValueOf);
        sb.append("]]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.g52
    public final void zze(Runnable runnable, Executor executor) {
        h12.b(runnable, "Runnable was null.");
        h12.b(executor, "Executor was null.");
        try {
            executor.execute(runnable);
        } catch (RuntimeException e2) {
            Logger logger = f5263f;
            Level level = Level.SEVERE;
            String strValueOf = String.valueOf(runnable);
            String strValueOf2 = String.valueOf(executor);
            StringBuilder sb = new StringBuilder(strValueOf.length() + 57 + strValueOf2.length());
            sb.append("RuntimeException while executing runnable ");
            sb.append(strValueOf);
            sb.append(" with executor ");
            sb.append(strValueOf2);
            logger.logp(level, "com.google.common.util.concurrent.ImmediateFuture", "addListener", sb.toString(), (Throwable) e2);
        }
    }
}