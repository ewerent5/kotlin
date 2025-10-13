package com.google.android.gms.internal.ads;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class y42 extends a52 {
    public static <V> g52<V> a(@NullableDecl V v) {
        return v == null ? (g52<V>) c52.f5262e : new c52(v);
    }

    public static <V> g52<V> b(Throwable th) {
        Objects.requireNonNull(th);
        return new b52(th);
    }

    public static <O> g52<O> c(Callable<O> callable, Executor executor) {
        w52 w52Var = new w52(callable);
        executor.execute(w52Var);
        return w52Var;
    }

    public static <O> g52<O> d(d42<O> d42Var, Executor executor) {
        w52 w52Var = new w52(d42Var);
        executor.execute(w52Var);
        return w52Var;
    }

    public static <V, X extends Throwable> g52<V> e(g52<? extends V> g52Var, Class<X> cls, x02<? super X, ? extends V> x02Var, Executor executor) {
        d32 d32Var = new d32(g52Var, cls, x02Var);
        g52Var.zze(d32Var, o52.c(executor, d32Var));
        return d32Var;
    }

    public static <V, X extends Throwable> g52<V> f(g52<? extends V> g52Var, Class<X> cls, e42<? super X, ? extends V> e42Var, Executor executor) {
        c32 c32Var = new c32(g52Var, cls, e42Var);
        g52Var.zze(c32Var, o52.c(executor, c32Var));
        return c32Var;
    }

    public static <V> g52<V> g(g52<V> g52Var, long j2, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        return g52Var.isDone() ? g52Var : t52.E(g52Var, j2, timeUnit, scheduledExecutorService);
    }

    public static <I, O> g52<O> h(g52<I> g52Var, e42<? super I, ? extends O> e42Var, Executor executor) {
        int i2 = u32.f9371l;
        Objects.requireNonNull(executor);
        s32 s32Var = new s32(g52Var, e42Var);
        g52Var.zze(s32Var, o52.c(executor, s32Var));
        return s32Var;
    }

    public static <I, O> g52<O> i(g52<I> g52Var, x02<? super I, ? extends O> x02Var, Executor executor) {
        int i2 = u32.f9371l;
        Objects.requireNonNull(x02Var);
        t32 t32Var = new t32(g52Var, x02Var);
        g52Var.zze(t32Var, o52.c(executor, t32Var));
        return t32Var;
    }

    public static <V> g52<List<V>> j(Iterable<? extends g52<? extends V>> iterable) {
        return new f42(b22.r(iterable), true);
    }

    @SafeVarargs
    public static <V> x42<V> k(g52<? extends V>... g52VarArr) {
        return new x42<>(false, b22.u(g52VarArr), null);
    }

    public static <V> x42<V> l(Iterable<? extends g52<? extends V>> iterable) {
        return new x42<>(false, b22.r(iterable), null);
    }

    @SafeVarargs
    public static <V> x42<V> m(g52<? extends V>... g52VarArr) {
        return new x42<>(true, b22.u(g52VarArr), null);
    }

    public static <V> x42<V> n(Iterable<? extends g52<? extends V>> iterable) {
        return new x42<>(true, b22.r(iterable), null);
    }

    public static <V> void o(g52<V> g52Var, u42<? super V> u42Var, Executor executor) {
        Objects.requireNonNull(u42Var);
        g52Var.zze(new w42(g52Var, u42Var), executor);
    }

    public static <V> V p(Future<V> future) {
        if (future.isDone()) {
            return (V) y52.a(future);
        }
        throw new IllegalStateException(o12.d("Future was expected to be done: %s", future));
    }

    public static <V> V q(Future<V> future) {
        try {
            return (V) y52.a(future);
        } catch (ExecutionException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof Error) {
                throw new n42((Error) cause);
            }
            throw new x52(cause);
        }
    }
}