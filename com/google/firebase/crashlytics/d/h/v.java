package com.google.firebase.crashlytics.d.h;

import java.util.Locale;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionHandler;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicLong;

/* compiled from: ExecutorUtils.java */
/* loaded from: classes.dex */
public final class v {

    /* compiled from: ExecutorUtils.java */
    class a implements ThreadFactory {
        final /* synthetic */ String a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ AtomicLong f12476b;

        /* compiled from: ExecutorUtils.java */
        /* renamed from: com.google.firebase.crashlytics.d.h.v$a$a, reason: collision with other inner class name */
        class C0131a extends d {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Runnable f12477e;

            C0131a(Runnable runnable) {
                this.f12477e = runnable;
            }

            @Override // com.google.firebase.crashlytics.d.h.d
            public void a() {
                this.f12477e.run();
            }
        }

        a(String str, AtomicLong atomicLong) {
            this.a = str;
            this.f12476b = atomicLong;
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(new C0131a(runnable));
            threadNewThread.setName(this.a + this.f12476b.getAndIncrement());
            return threadNewThread;
        }
    }

    /* compiled from: ExecutorUtils.java */
    class b extends d {

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f12479e;

        /* renamed from: f, reason: collision with root package name */
        final /* synthetic */ ExecutorService f12480f;

        /* renamed from: g, reason: collision with root package name */
        final /* synthetic */ long f12481g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ TimeUnit f12482h;

        b(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
            this.f12479e = str;
            this.f12480f = executorService;
            this.f12481g = j2;
            this.f12482h = timeUnit;
        }

        @Override // com.google.firebase.crashlytics.d.h.d
        public void a() {
            try {
                com.google.firebase.crashlytics.d.b.f().b("Executing shutdown hook for " + this.f12479e);
                this.f12480f.shutdown();
                if (this.f12480f.awaitTermination(this.f12481g, this.f12482h)) {
                    return;
                }
                com.google.firebase.crashlytics.d.b.f().b(this.f12479e + " did not shut down in the allocated time. Requesting immediate shutdown.");
                this.f12480f.shutdownNow();
            } catch (InterruptedException unused) {
                com.google.firebase.crashlytics.d.b.f().b(String.format(Locale.US, "Interrupted while waiting for %s to shut down. Requesting immediate shutdown.", this.f12479e));
                this.f12480f.shutdownNow();
            }
        }
    }

    private static void a(String str, ExecutorService executorService) {
        b(str, executorService, 2L, TimeUnit.SECONDS);
    }

    private static void b(String str, ExecutorService executorService, long j2, TimeUnit timeUnit) {
        Runtime.getRuntime().addShutdownHook(new Thread(new b(str, executorService, j2, timeUnit), "Crashlytics Shutdown Hook for " + str));
    }

    public static ExecutorService c(String str) {
        ExecutorService executorServiceE = e(d(str), new ThreadPoolExecutor.DiscardPolicy());
        a(str, executorServiceE);
        return executorServiceE;
    }

    public static final ThreadFactory d(String str) {
        return new a(str, new AtomicLong(1L));
    }

    private static ExecutorService e(ThreadFactory threadFactory, RejectedExecutionHandler rejectedExecutionHandler) {
        return Executors.unconfigurableExecutorService(new ThreadPoolExecutor(1, 1, 0L, TimeUnit.MILLISECONDS, new LinkedBlockingQueue(), threadFactory, rejectedExecutionHandler));
    }
}