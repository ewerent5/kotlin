package com.bumptech.glide.load.n;

import android.os.Process;
import com.bumptech.glide.load.n.p;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* compiled from: ActiveResources.java */
/* loaded from: classes.dex */
final class a {
    private final boolean a;

    /* renamed from: b, reason: collision with root package name */
    private final Executor f3637b;

    /* renamed from: c, reason: collision with root package name */
    final Map<com.bumptech.glide.load.g, d> f3638c;

    /* renamed from: d, reason: collision with root package name */
    private final ReferenceQueue<p<?>> f3639d;

    /* renamed from: e, reason: collision with root package name */
    private p.a f3640e;

    /* renamed from: f, reason: collision with root package name */
    private volatile boolean f3641f;

    /* renamed from: g, reason: collision with root package name */
    private volatile c f3642g;

    /* compiled from: ActiveResources.java */
    /* renamed from: com.bumptech.glide.load.n.a$a, reason: collision with other inner class name */
    class ThreadFactoryC0079a implements ThreadFactory {

        /* compiled from: ActiveResources.java */
        /* renamed from: com.bumptech.glide.load.n.a$a$a, reason: collision with other inner class name */
        class RunnableC0080a implements Runnable {

            /* renamed from: e, reason: collision with root package name */
            final /* synthetic */ Runnable f3643e;

            RunnableC0080a(Runnable runnable) {
                this.f3643e = runnable;
            }

            @Override // java.lang.Runnable
            public void run() throws SecurityException, IllegalArgumentException {
                Process.setThreadPriority(10);
                this.f3643e.run();
            }
        }

        ThreadFactoryC0079a() {
        }

        @Override // java.util.concurrent.ThreadFactory
        public Thread newThread(Runnable runnable) {
            return new Thread(new RunnableC0080a(runnable), "glide-active-resources");
        }
    }

    /* compiled from: ActiveResources.java */
    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            a.this.b();
        }
    }

    /* compiled from: ActiveResources.java */
    interface c {
        void a();
    }

    /* compiled from: ActiveResources.java */
    static final class d extends WeakReference<p<?>> {
        final com.bumptech.glide.load.g a;

        /* renamed from: b, reason: collision with root package name */
        final boolean f3646b;

        /* renamed from: c, reason: collision with root package name */
        v<?> f3647c;

        d(com.bumptech.glide.load.g gVar, p<?> pVar, ReferenceQueue<? super p<?>> referenceQueue, boolean z) {
            super(pVar, referenceQueue);
            this.a = (com.bumptech.glide.load.g) com.bumptech.glide.t.j.d(gVar);
            this.f3647c = (pVar.f() && z) ? (v) com.bumptech.glide.t.j.d(pVar.e()) : null;
            this.f3646b = pVar.f();
        }

        void a() {
            this.f3647c = null;
            clear();
        }
    }

    a(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactoryC0079a()));
    }

    synchronized void a(com.bumptech.glide.load.g gVar, p<?> pVar) {
        d dVarPut = this.f3638c.put(gVar, new d(gVar, pVar, this.f3639d, this.a));
        if (dVarPut != null) {
            dVarPut.a();
        }
    }

    void b() {
        while (!this.f3641f) {
            try {
                c((d) this.f3639d.remove());
                c cVar = this.f3642g;
                if (cVar != null) {
                    cVar.a();
                }
            } catch (InterruptedException unused) {
                Thread.currentThread().interrupt();
            }
        }
    }

    void c(d dVar) {
        v<?> vVar;
        synchronized (this) {
            this.f3638c.remove(dVar.a);
            if (dVar.f3646b && (vVar = dVar.f3647c) != null) {
                this.f3640e.d(dVar.a, new p<>(vVar, true, false, dVar.a, this.f3640e));
            }
        }
    }

    synchronized void d(com.bumptech.glide.load.g gVar) {
        d dVarRemove = this.f3638c.remove(gVar);
        if (dVarRemove != null) {
            dVarRemove.a();
        }
    }

    synchronized p<?> e(com.bumptech.glide.load.g gVar) {
        d dVar = this.f3638c.get(gVar);
        if (dVar == null) {
            return null;
        }
        p<?> pVar = dVar.get();
        if (pVar == null) {
            c(dVar);
        }
        return pVar;
    }

    void f(p.a aVar) {
        synchronized (aVar) {
            synchronized (this) {
                this.f3640e = aVar;
            }
        }
    }

    a(boolean z, Executor executor) {
        this.f3638c = new HashMap();
        this.f3639d = new ReferenceQueue<>();
        this.a = z;
        this.f3637b = executor;
        executor.execute(new b());
    }
}