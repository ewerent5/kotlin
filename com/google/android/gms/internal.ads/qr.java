package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class qr {
    public static final h52 a;

    /* renamed from: b, reason: collision with root package name */
    public static final h52 f8447b;

    /* renamed from: c, reason: collision with root package name */
    public static final h52 f8448c;

    /* renamed from: d, reason: collision with root package name */
    public static final ScheduledExecutorService f8449d;

    /* renamed from: e, reason: collision with root package name */
    public static final h52 f8450e;

    /* renamed from: f, reason: collision with root package name */
    public static final h52 f8451f;

    static {
        Executor threadPoolExecutor;
        Executor executorA;
        Executor executorB;
        if (com.google.android.gms.common.util.e.a()) {
            k02.a();
            threadPoolExecutor = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool(new nr("Default")));
        } else {
            threadPoolExecutor = new ThreadPoolExecutor(2, Integer.MAX_VALUE, 10L, TimeUnit.SECONDS, new SynchronousQueue(), new nr("Default"));
        }
        mr mrVar = null;
        a = new pr(threadPoolExecutor, mrVar);
        if (com.google.android.gms.common.util.e.a()) {
            executorA = k02.a().a(5, new nr("Loader"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor2 = new ThreadPoolExecutor(5, 5, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new nr("Loader"));
            threadPoolExecutor2.allowCoreThreadTimeOut(true);
            executorA = threadPoolExecutor2;
        }
        f8447b = new pr(executorA, mrVar);
        if (com.google.android.gms.common.util.e.a()) {
            executorB = k02.a().b(new nr("Activeview"), 1);
        } else {
            ThreadPoolExecutor threadPoolExecutor3 = new ThreadPoolExecutor(1, 1, 10L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new nr("Activeview"));
            threadPoolExecutor3.allowCoreThreadTimeOut(true);
            executorB = threadPoolExecutor3;
        }
        f8448c = new pr(executorB, mrVar);
        f8449d = new mr(3, new nr("Schedule"));
        f8450e = new pr(new or(), mrVar);
        f8451f = new pr(o52.a(), mrVar);
    }
}