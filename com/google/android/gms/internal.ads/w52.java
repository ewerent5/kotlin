package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executors;
import java.util.concurrent.RunnableFuture;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class w52<V> extends o42<V> implements RunnableFuture<V> {

    /* renamed from: l, reason: collision with root package name */
    private volatile f52<?> f9897l;

    w52(d42<V> d42Var) {
        this.f9897l = new u52(this, d42Var);
    }

    static <V> w52<V> E(Runnable runnable, @NullableDecl V v) {
        return new w52<>(Executors.callable(runnable, v));
    }

    @Override // com.google.android.gms.internal.ads.f32
    protected final String h() {
        f52<?> f52Var = this.f9897l;
        if (f52Var == null) {
            return super.h();
        }
        String strValueOf = String.valueOf(f52Var);
        StringBuilder sb = new StringBuilder(strValueOf.length() + 7);
        sb.append("task=[");
        sb.append(strValueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // com.google.android.gms.internal.ads.f32
    protected final void i() {
        f52<?> f52Var;
        if (k() && (f52Var = this.f9897l) != null) {
            f52Var.e();
        }
        this.f9897l = null;
    }

    @Override // java.util.concurrent.RunnableFuture, java.lang.Runnable
    public final void run() {
        f52<?> f52Var = this.f9897l;
        if (f52Var != null) {
            f52Var.run();
        }
        this.f9897l = null;
    }

    w52(Callable<V> callable) {
        this.f9897l = new v52(this, callable);
    }
}