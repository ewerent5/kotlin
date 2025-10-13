package com.google.android.gms.internal.ads;

import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class o52 {
    public static Executor a() {
        return m42.INSTANCE;
    }

    public static h52 b(ExecutorService executorService) {
        if (executorService instanceof h52) {
            return (h52) executorService;
        }
        return executorService instanceof ScheduledExecutorService ? new n52((ScheduledExecutorService) executorService) : new j52(executorService);
    }

    static Executor c(Executor executor, f32<?> f32Var) {
        Objects.requireNonNull(executor);
        return executor == m42.INSTANCE ? executor : new i52(executor, f32Var);
    }
}