package com.parizene.netmonitor;

import com.parizene.netmonitor.f0;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

/* compiled from: Threads.kt */
/* loaded from: classes.dex */
public final class f0 {
    public static final a a = new a(null);

    /* renamed from: b, reason: collision with root package name */
    private final ScheduledExecutorService f13183b;

    /* compiled from: Threads.kt */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(i.y.d.g gVar) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final ThreadFactory b(final String str, final int i2) {
            return new ThreadFactory() { // from class: com.parizene.netmonitor.j
                @Override // java.util.concurrent.ThreadFactory
                public final Thread newThread(Runnable runnable) {
                    return f0.a.c(str, i2, runnable);
                }
            };
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Thread c(String str, int i2, Runnable runnable) {
            i.y.d.l.d(str, "$name");
            Thread thread = new Thread(runnable, str);
            thread.setPriority(i2);
            return thread;
        }
    }

    public f0() {
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(7, a.b("IO", 5));
        scheduledThreadPoolExecutor.setKeepAliveTime(180L, TimeUnit.SECONDS);
        scheduledThreadPoolExecutor.allowCoreThreadTimeOut(true);
        this.f13183b = scheduledThreadPoolExecutor;
    }

    public final ScheduledExecutorService a() {
        return this.f13183b;
    }
}