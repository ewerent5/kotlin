package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
abstract class k42<T> extends f52<T> {

    /* renamed from: h, reason: collision with root package name */
    private final Executor f6955h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ l42 f6956i;

    k42(l42 l42Var, Executor executor) {
        this.f6956i = l42Var;
        Objects.requireNonNull(executor);
        this.f6955h = executor;
    }

    @Override // com.google.android.gms.internal.ads.f52
    final boolean c() {
        return this.f6956i.isDone();
    }

    @Override // com.google.android.gms.internal.ads.f52
    final void d(T t, Throwable th) {
        l42.V(this.f6956i, null);
        if (th == null) {
            f(t);
            return;
        }
        if (th instanceof ExecutionException) {
            this.f6956i.m(th.getCause());
        } else if (th instanceof CancellationException) {
            this.f6956i.cancel(false);
        } else {
            this.f6956i.m(th);
        }
    }

    abstract void f(T t);

    final void g() {
        try {
            this.f6955h.execute(this);
        } catch (RejectedExecutionException e2) {
            this.f6956i.m(e2);
        }
    }
}