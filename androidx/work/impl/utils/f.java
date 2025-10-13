package androidx.work.impl.utils;

import java.util.ArrayDeque;
import java.util.concurrent.Executor;

/* compiled from: SerialExecutor.java */
/* loaded from: classes.dex */
public class f implements Executor {

    /* renamed from: f, reason: collision with root package name */
    private final Executor f2358f;

    /* renamed from: h, reason: collision with root package name */
    private volatile Runnable f2360h;

    /* renamed from: e, reason: collision with root package name */
    private final ArrayDeque<a> f2357e = new ArrayDeque<>();

    /* renamed from: g, reason: collision with root package name */
    private final Object f2359g = new Object();

    /* compiled from: SerialExecutor.java */
    static class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final f f2361e;

        /* renamed from: f, reason: collision with root package name */
        final Runnable f2362f;

        a(f fVar, Runnable runnable) {
            this.f2361e = fVar;
            this.f2362f = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            try {
                this.f2362f.run();
            } finally {
                this.f2361e.a();
            }
        }
    }

    public f(Executor executor) {
        this.f2358f = executor;
    }

    void a() {
        synchronized (this.f2359g) {
            a aVarPoll = this.f2357e.poll();
            this.f2360h = aVarPoll;
            if (aVarPoll != null) {
                this.f2358f.execute(this.f2360h);
            }
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(Runnable runnable) {
        synchronized (this.f2359g) {
            this.f2357e.add(new a(this, runnable));
            if (this.f2360h == null) {
                a();
            }
        }
    }
}