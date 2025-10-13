package com.google.firebase.remoteconfig.internal;

import android.util.Log;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* compiled from: ConfigCacheClient.java */
/* loaded from: classes.dex */
public class e {
    private static final Map<String, e> a = new HashMap();

    /* renamed from: b, reason: collision with root package name */
    private static final Executor f12924b = d.a();

    /* renamed from: c, reason: collision with root package name */
    private final ExecutorService f12925c;

    /* renamed from: d, reason: collision with root package name */
    private final o f12926d;

    /* renamed from: e, reason: collision with root package name */
    private e.c.b.b.e.h<f> f12927e = null;

    /* compiled from: ConfigCacheClient.java */
    private static class b<TResult> implements e.c.b.b.e.e<TResult>, e.c.b.b.e.d, e.c.b.b.e.b {
        private final CountDownLatch a;

        private b() {
            this.a = new CountDownLatch(1);
        }

        @Override // e.c.b.b.e.d
        public void a(Exception exc) {
            this.a.countDown();
        }

        public boolean b(long j2, TimeUnit timeUnit) {
            return this.a.await(j2, timeUnit);
        }

        @Override // e.c.b.b.e.b
        public void c() {
            this.a.countDown();
        }

        @Override // e.c.b.b.e.e
        public void onSuccess(TResult tresult) {
            this.a.countDown();
        }
    }

    private e(ExecutorService executorService, o oVar) {
        this.f12925c = executorService;
        this.f12926d = oVar;
    }

    private static <TResult> TResult a(e.c.b.b.e.h<TResult> hVar, long j2, TimeUnit timeUnit) throws ExecutionException, TimeoutException {
        b bVar = new b();
        Executor executor = f12924b;
        hVar.e(executor, bVar);
        hVar.d(executor, bVar);
        hVar.a(executor, bVar);
        if (!bVar.b(j2, timeUnit)) {
            throw new TimeoutException("Task await timed out.");
        }
        if (hVar.n()) {
            return hVar.k();
        }
        throw new ExecutionException(hVar.j());
    }

    public static synchronized e f(ExecutorService executorService, o oVar) {
        String strB;
        Map<String, e> map;
        strB = oVar.b();
        map = a;
        if (!map.containsKey(strB)) {
            map.put(strB, new e(executorService, oVar));
        }
        return map.get(strB);
    }

    static /* synthetic */ e.c.b.b.e.h h(e eVar, boolean z, f fVar, Void r3) {
        if (z) {
            eVar.k(fVar);
        }
        return e.c.b.b.e.k.d(fVar);
    }

    private synchronized void k(f fVar) {
        this.f12927e = e.c.b.b.e.k.d(fVar);
    }

    public void b() {
        synchronized (this) {
            this.f12927e = e.c.b.b.e.k.d(null);
        }
        this.f12926d.a();
    }

    public synchronized e.c.b.b.e.h<f> c() {
        e.c.b.b.e.h<f> hVar = this.f12927e;
        if (hVar == null || (hVar.m() && !this.f12927e.n())) {
            ExecutorService executorService = this.f12925c;
            o oVar = this.f12926d;
            oVar.getClass();
            this.f12927e = e.c.b.b.e.k.b(executorService, c.a(oVar));
        }
        return this.f12927e;
    }

    public f d() {
        return e(5L);
    }

    f e(long j2) {
        synchronized (this) {
            e.c.b.b.e.h<f> hVar = this.f12927e;
            if (hVar != null && hVar.n()) {
                return this.f12927e.k();
            }
            try {
                return (f) a(c(), j2, TimeUnit.SECONDS);
            } catch (InterruptedException | ExecutionException | TimeoutException e2) {
                Log.d("FirebaseRemoteConfig", "Reading from storage file failed.", e2);
                return null;
            }
        }
    }

    public e.c.b.b.e.h<f> i(f fVar) {
        return j(fVar, true);
    }

    public e.c.b.b.e.h<f> j(f fVar, boolean z) {
        return e.c.b.b.e.k.b(this.f12925c, com.google.firebase.remoteconfig.internal.a.a(this, fVar)).p(this.f12925c, com.google.firebase.remoteconfig.internal.b.b(this, z, fVar));
    }
}