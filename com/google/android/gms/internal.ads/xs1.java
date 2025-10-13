package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class xs1<E, V> implements g52<V> {

    /* renamed from: e, reason: collision with root package name */
    private final E f10242e;

    /* renamed from: f, reason: collision with root package name */
    private final String f10243f;

    /* renamed from: g, reason: collision with root package name */
    private final g52<V> f10244g;

    public xs1(E e2, String str, g52<V> g52Var) {
        this.f10242e = e2;
        this.f10243f = str;
        this.f10244g = g52Var;
    }

    public final E b() {
        return this.f10242e;
    }

    public final String c() {
        return this.f10243f;
    }

    @Override // java.util.concurrent.Future
    public final boolean cancel(boolean z) {
        return this.f10244g.cancel(z);
    }

    @Override // java.util.concurrent.Future
    public final V get() {
        return this.f10244g.get();
    }

    @Override // java.util.concurrent.Future
    public final boolean isCancelled() {
        return this.f10244g.isCancelled();
    }

    @Override // java.util.concurrent.Future
    public final boolean isDone() {
        return this.f10244g.isDone();
    }

    public final String toString() {
        String str = this.f10243f;
        int iIdentityHashCode = System.identityHashCode(this);
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 12);
        sb.append(str);
        sb.append("@");
        sb.append(iIdentityHashCode);
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.g52
    public final void zze(Runnable runnable, Executor executor) {
        this.f10244g.zze(runnable, executor);
    }

    @Override // java.util.concurrent.Future
    public final V get(long j2, TimeUnit timeUnit) {
        return this.f10244g.get(j2, timeUnit);
    }
}