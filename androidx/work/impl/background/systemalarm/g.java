package androidx.work.impl.background.systemalarm;

import androidx.work.h;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: WorkTimer.java */
/* loaded from: classes.dex */
class g {
    private static final String a = h.f("WorkTimer");

    /* renamed from: b, reason: collision with root package name */
    private final ThreadFactory f2179b;

    /* renamed from: c, reason: collision with root package name */
    private final ScheduledExecutorService f2180c;

    /* renamed from: d, reason: collision with root package name */
    final Map<String, c> f2181d;

    /* renamed from: e, reason: collision with root package name */
    final Map<String, b> f2182e;

    /* renamed from: f, reason: collision with root package name */
    final Object f2183f;

    /* compiled from: WorkTimer.java */
    class a implements ThreadFactory {
        private int a = 0;

        a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            Thread threadNewThread = Executors.defaultThreadFactory().newThread(runnable);
            threadNewThread.setName("WorkManager-WorkTimer-thread-" + this.a);
            this.a = this.a + 1;
            return threadNewThread;
        }
    }

    /* compiled from: WorkTimer.java */
    interface b {
        void a(String str);
    }

    /* compiled from: WorkTimer.java */
    static class c implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final g f2185e;

        /* renamed from: f, reason: collision with root package name */
        private final String f2186f;

        c(g gVar, String str) {
            this.f2185e = gVar;
            this.f2186f = str;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f2185e.f2183f) {
                if (this.f2185e.f2181d.remove(this.f2186f) != null) {
                    b bVarRemove = this.f2185e.f2182e.remove(this.f2186f);
                    if (bVarRemove != null) {
                        bVarRemove.a(this.f2186f);
                    }
                } else {
                    h.c().a("WrkTimerRunnable", String.format("Timer with %s is already marked as complete.", this.f2186f), new Throwable[0]);
                }
            }
        }
    }

    g() {
        a aVar = new a();
        this.f2179b = aVar;
        this.f2181d = new HashMap();
        this.f2182e = new HashMap();
        this.f2183f = new Object();
        this.f2180c = Executors.newSingleThreadScheduledExecutor(aVar);
    }

    void a() {
        if (this.f2180c.isShutdown()) {
            return;
        }
        this.f2180c.shutdownNow();
    }

    void b(String str, long j2, b bVar) {
        synchronized (this.f2183f) {
            h.c().a(a, String.format("Starting timer for %s", str), new Throwable[0]);
            c(str);
            c cVar = new c(this, str);
            this.f2181d.put(str, cVar);
            this.f2182e.put(str, bVar);
            this.f2180c.schedule(cVar, j2, TimeUnit.MILLISECONDS);
        }
    }

    void c(String str) {
        synchronized (this.f2183f) {
            if (this.f2181d.remove(str) != null) {
                h.c().a(a, String.format("Stopping timer for %s", str), new Throwable[0]);
                this.f2182e.remove(str);
            }
        }
    }
}