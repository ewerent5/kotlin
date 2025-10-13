package com.bumptech.glide.load.n.c0;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import android.util.Log;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: GlideExecutor.java */
/* loaded from: classes.dex */
public final class a implements ExecutorService {

    /* renamed from: e, reason: collision with root package name */
    private static final long f3714e = TimeUnit.SECONDS.toMillis(10);

    /* renamed from: f, reason: collision with root package name */
    private static volatile int f3715f;

    /* renamed from: g, reason: collision with root package name */
    private final ExecutorService f3716g;

    /* compiled from: GlideExecutor.java */
    /* renamed from: com.bumptech.glide.load.n.c0.a$a, reason: collision with other inner class name */
    public static final class C0082a {
        private final boolean a;

        /* renamed from: b, reason: collision with root package name */
        private int f3717b;

        /* renamed from: c, reason: collision with root package name */
        private int f3718c;

        /* renamed from: d, reason: collision with root package name */
        private c f3719d = c.f3728d;

        /* renamed from: e, reason: collision with root package name */
        private String f3720e;

        /* renamed from: f, reason: collision with root package name */
        private long f3721f;

        C0082a(boolean z) {
            this.a = z;
        }

        public a a() {
            if (TextUtils.isEmpty(this.f3720e)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.f3720e);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.f3717b, this.f3718c, this.f3721f, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new b(this.f3720e, this.f3719d, this.a));
            if (this.f3721f != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new a(threadPoolExecutor);
        }

        public C0082a b(String str) {
            this.f3720e = str;
            return this;
        }

        public C0082a c(int i2) {
            this.f3717b = i2;
            this.f3718c = i2;
            return this;
        }
    }

    /* compiled from: GlideExecutor.java */
    private static final class b implements ThreadFactory {
        private final String a;

        /* renamed from: b, reason: collision with root package name */
        final c f3722b;

        /* renamed from: c, reason: collision with root package name */
        final boolean f3723c;

        /* renamed from: d, reason: collision with root package name */
        private int f3724d;

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.n.c0.a$b$a, reason: collision with other inner class name */
        class C0083a extends Thread {
            C0083a(Runnable runnable, String str) {
                super(runnable, str);
            }

            @Override // java.lang.Thread, java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(9);
                if (b.this.f3723c) {
                    StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                }
                try {
                    super.run();
                } catch (Throwable th) {
                    b.this.f3722b.a(th);
                }
            }
        }

        b(String str, c cVar, boolean z) {
            this.a = str;
            this.f3722b = cVar;
            this.f3723c = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public synchronized Thread newThread(Runnable runnable) {
            C0083a c0083a;
            c0083a = new C0083a(runnable, "glide-" + this.a + "-thread-" + this.f3724d);
            this.f3724d = this.f3724d + 1;
            return c0083a;
        }
    }

    /* compiled from: GlideExecutor.java */
    public interface c {
        public static final c a = new C0084a();

        /* renamed from: b, reason: collision with root package name */
        public static final c f3726b;

        /* renamed from: c, reason: collision with root package name */
        public static final c f3727c;

        /* renamed from: d, reason: collision with root package name */
        public static final c f3728d;

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.n.c0.a$c$a, reason: collision with other inner class name */
        class C0084a implements c {
            C0084a() {
            }

            @Override // com.bumptech.glide.load.n.c0.a.c
            public void a(Throwable th) {
            }
        }

        /* compiled from: GlideExecutor.java */
        class b implements c {
            b() {
            }

            @Override // com.bumptech.glide.load.n.c0.a.c
            public void a(Throwable th) {
                if (th == null || !Log.isLoggable("GlideExecutor", 6)) {
                    return;
                }
                Log.e("GlideExecutor", "Request threw uncaught throwable", th);
            }
        }

        /* compiled from: GlideExecutor.java */
        /* renamed from: com.bumptech.glide.load.n.c0.a$c$c, reason: collision with other inner class name */
        class C0085c implements c {
            C0085c() {
            }

            @Override // com.bumptech.glide.load.n.c0.a.c
            public void a(Throwable th) {
                if (th != null) {
                    throw new RuntimeException("Request threw uncaught throwable", th);
                }
            }
        }

        static {
            b bVar = new b();
            f3726b = bVar;
            f3727c = new C0085c();
            f3728d = bVar;
        }

        void a(Throwable th);
    }

    a(ExecutorService executorService) {
        this.f3716g = executorService;
    }

    public static int a() {
        if (f3715f == 0) {
            f3715f = Math.min(4, com.bumptech.glide.load.n.c0.b.a());
        }
        return f3715f;
    }

    public static C0082a b() {
        return new C0082a(true).c(a() >= 4 ? 2 : 1).b("animation");
    }

    public static a d() {
        return b().a();
    }

    public static C0082a e() {
        return new C0082a(true).c(1).b("disk-cache");
    }

    public static a f() {
        return e().a();
    }

    public static C0082a g() {
        return new C0082a(false).c(a()).b("source");
    }

    public static a h() {
        return g().a();
    }

    public static a i() {
        return new a(new ThreadPoolExecutor(0, Integer.MAX_VALUE, f3714e, TimeUnit.MILLISECONDS, new SynchronousQueue(), new b("source-unlimited", c.f3728d, false)));
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean awaitTermination(long j2, TimeUnit timeUnit) {
        return this.f3716g.awaitTermination(j2, timeUnit);
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        this.f3716g.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) {
        return this.f3716g.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection) {
        return (T) this.f3716g.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isShutdown() {
        return this.f3716g.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public boolean isTerminated() {
        return this.f3716g.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public void shutdown() {
        this.f3716g.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public List<Runnable> shutdownNow() {
        return this.f3716g.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public Future<?> submit(Runnable runnable) {
        return this.f3716g.submit(runnable);
    }

    public String toString() {
        return this.f3716g.toString();
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
        return this.f3716g.invokeAll(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> T invokeAny(Collection<? extends Callable<T>> collection, long j2, TimeUnit timeUnit) {
        return (T) this.f3716g.invokeAny(collection, j2, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Runnable runnable, T t) {
        return this.f3716g.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public <T> Future<T> submit(Callable<T> callable) {
        return this.f3716g.submit(callable);
    }
}