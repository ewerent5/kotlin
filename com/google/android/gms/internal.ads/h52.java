package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public interface h52 extends ExecutorService {
    <T> g52<T> N(Callable<T> callable);

    g52<?> c(Runnable runnable);
}