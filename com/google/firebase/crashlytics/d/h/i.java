package com.google.firebase.crashlytics.d.h;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

/* compiled from: CrashlyticsBackgroundWorker.java */
/* loaded from: classes.dex */
class i {
    private final Executor a;

    /* renamed from: b, reason: collision with root package name */
    private e.c.b.b.e.h<Void> f12368b = e.c.b.b.e.k.d(null);

    /* renamed from: c, reason: collision with root package name */
    private final Object f12369c = new Object();

    /* renamed from: d, reason: collision with root package name */
    private ThreadLocal<Boolean> f12370d = new ThreadLocal<>();

    /* compiled from: CrashlyticsBackgroundWorker.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            i.this.f12370d.set(Boolean.TRUE);
        }
    }

    /* compiled from: CrashlyticsBackgroundWorker.java */
    class b implements Callable<Void> {
        final /* synthetic */ Runnable a;

        b(Runnable runnable) {
            this.a = runnable;
        }

        @Override // java.util.concurrent.Callable
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Void call() {
            this.a.run();
            return null;
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    class c<T> implements e.c.b.b.e.a<Void, T> {
        final /* synthetic */ Callable a;

        c(Callable callable) {
            this.a = callable;
        }

        @Override // e.c.b.b.e.a
        public T a(e.c.b.b.e.h<Void> hVar) {
            return (T) this.a.call();
        }
    }

    /* JADX INFO: Add missing generic type declarations: [T] */
    /* compiled from: CrashlyticsBackgroundWorker.java */
    class d<T> implements e.c.b.b.e.a<T, Void> {
        d() {
        }

        @Override // e.c.b.b.e.a
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public Void a(e.c.b.b.e.h<T> hVar) {
            return null;
        }
    }

    public i(Executor executor) {
        this.a = executor;
        executor.execute(new a());
    }

    private <T> e.c.b.b.e.h<Void> d(e.c.b.b.e.h<T> hVar) {
        return hVar.g(this.a, new d());
    }

    private boolean e() {
        return Boolean.TRUE.equals(this.f12370d.get());
    }

    private <T> e.c.b.b.e.a<Void, T> f(Callable<T> callable) {
        return new c(callable);
    }

    public void b() {
        if (!e()) {
            throw new IllegalStateException("Not running on background worker thread as intended.");
        }
    }

    public Executor c() {
        return this.a;
    }

    e.c.b.b.e.h<Void> g(Runnable runnable) {
        return h(new b(runnable));
    }

    public <T> e.c.b.b.e.h<T> h(Callable<T> callable) {
        e.c.b.b.e.h<T> hVarG;
        synchronized (this.f12369c) {
            hVarG = this.f12368b.g(this.a, f(callable));
            this.f12368b = d(hVarG);
        }
        return hVarG;
    }

    public <T> e.c.b.b.e.h<T> i(Callable<e.c.b.b.e.h<T>> callable) {
        e.c.b.b.e.h<T> hVarI;
        synchronized (this.f12369c) {
            hVarI = this.f12368b.i(this.a, f(callable));
            this.f12368b = d(hVarI);
        }
        return hVarI;
    }
}