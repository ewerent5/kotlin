package com.bumptech.glide.load.n;

import com.bumptech.glide.load.n.h;
import com.bumptech.glide.load.n.p;
import com.bumptech.glide.t.l.a;
import j$.lang.Iterable;
import j$.util.Spliterator;
import j$.util.function.Consumer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* compiled from: EngineJob.java */
/* loaded from: classes.dex */
class l<R> implements h.b<R>, a.f {

    /* renamed from: e, reason: collision with root package name */
    private static final c f3799e = new c();
    p<?> A;
    private h<R> B;
    private volatile boolean C;
    private boolean D;

    /* renamed from: f, reason: collision with root package name */
    final e f3800f;

    /* renamed from: g, reason: collision with root package name */
    private final com.bumptech.glide.t.l.c f3801g;

    /* renamed from: h, reason: collision with root package name */
    private final p.a f3802h;

    /* renamed from: i, reason: collision with root package name */
    private final c.h.k.e<l<?>> f3803i;

    /* renamed from: j, reason: collision with root package name */
    private final c f3804j;

    /* renamed from: k, reason: collision with root package name */
    private final m f3805k;

    /* renamed from: l, reason: collision with root package name */
    private final com.bumptech.glide.load.n.c0.a f3806l;

    /* renamed from: m, reason: collision with root package name */
    private final com.bumptech.glide.load.n.c0.a f3807m;
    private final com.bumptech.glide.load.n.c0.a n;
    private final com.bumptech.glide.load.n.c0.a o;
    private final AtomicInteger p;
    private com.bumptech.glide.load.g q;
    private boolean r;
    private boolean s;
    private boolean t;
    private boolean u;
    private v<?> v;
    com.bumptech.glide.load.a w;
    private boolean x;
    q y;
    private boolean z;

    /* compiled from: EngineJob.java */
    private class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final com.bumptech.glide.r.g f3808e;

        a(com.bumptech.glide.r.g gVar) {
            this.f3808e = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f3808e.h()) {
                synchronized (l.this) {
                    if (l.this.f3800f.c(this.f3808e)) {
                        l.this.f(this.f3808e);
                    }
                    l.this.i();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    private class b implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        private final com.bumptech.glide.r.g f3810e;

        b(com.bumptech.glide.r.g gVar) {
            this.f3810e = gVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            synchronized (this.f3810e.h()) {
                synchronized (l.this) {
                    if (l.this.f3800f.c(this.f3810e)) {
                        l.this.A.a();
                        l.this.g(this.f3810e);
                        l.this.r(this.f3810e);
                    }
                    l.this.i();
                }
            }
        }
    }

    /* compiled from: EngineJob.java */
    static class c {
        c() {
        }

        public <R> p<R> a(v<R> vVar, boolean z, com.bumptech.glide.load.g gVar, p.a aVar) {
            return new p<>(vVar, z, true, gVar, aVar);
        }
    }

    /* compiled from: EngineJob.java */
    static final class d {
        final com.bumptech.glide.r.g a;

        /* renamed from: b, reason: collision with root package name */
        final Executor f3812b;

        d(com.bumptech.glide.r.g gVar, Executor executor) {
            this.a = gVar;
            this.f3812b = executor;
        }

        public boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public int hashCode() {
            return this.a.hashCode();
        }
    }

    /* compiled from: EngineJob.java */
    static final class e implements Iterable<d>, Iterable {

        /* renamed from: e, reason: collision with root package name */
        private final List<d> f3813e;

        e() {
            this(new ArrayList(2));
        }

        private static d f(com.bumptech.glide.r.g gVar) {
            return new d(gVar, com.bumptech.glide.t.e.a());
        }

        void a(com.bumptech.glide.r.g gVar, Executor executor) {
            this.f3813e.add(new d(gVar, executor));
        }

        boolean c(com.bumptech.glide.r.g gVar) {
            return this.f3813e.contains(f(gVar));
        }

        void clear() {
            this.f3813e.clear();
        }

        e e() {
            return new e(new ArrayList(this.f3813e));
        }

        @Override // j$.lang.Iterable
        public /* synthetic */ void forEach(Consumer consumer) {
            Iterable.CC.$default$forEach(this, consumer);
        }

        void h(com.bumptech.glide.r.g gVar) {
            this.f3813e.remove(f(gVar));
        }

        boolean isEmpty() {
            return this.f3813e.isEmpty();
        }

        @Override // java.lang.Iterable, j$.lang.Iterable
        public Iterator<d> iterator() {
            return this.f3813e.iterator();
        }

        int size() {
            return this.f3813e.size();
        }

        @Override // java.lang.Iterable, j$.lang.Iterable
        public /* synthetic */ Spliterator spliterator() {
            return j$.util.v.o(iterator(), 0);
        }

        e(List<d> list) {
            this.f3813e = list;
        }
    }

    l(com.bumptech.glide.load.n.c0.a aVar, com.bumptech.glide.load.n.c0.a aVar2, com.bumptech.glide.load.n.c0.a aVar3, com.bumptech.glide.load.n.c0.a aVar4, m mVar, p.a aVar5, c.h.k.e<l<?>> eVar) {
        this(aVar, aVar2, aVar3, aVar4, mVar, aVar5, eVar, f3799e);
    }

    private com.bumptech.glide.load.n.c0.a j() {
        return this.s ? this.n : this.t ? this.o : this.f3807m;
    }

    private boolean m() {
        return this.z || this.x || this.C;
    }

    private synchronized void q() {
        if (this.q == null) {
            throw new IllegalArgumentException();
        }
        this.f3800f.clear();
        this.q = null;
        this.A = null;
        this.v = null;
        this.z = false;
        this.C = false;
        this.x = false;
        this.D = false;
        this.B.y(false);
        this.B = null;
        this.y = null;
        this.w = null;
        this.f3803i.a(this);
    }

    @Override // com.bumptech.glide.load.n.h.b
    public void a(q qVar) {
        synchronized (this) {
            this.y = qVar;
        }
        n();
    }

    synchronized void b(com.bumptech.glide.r.g gVar, Executor executor) {
        this.f3801g.c();
        this.f3800f.a(gVar, executor);
        boolean z = true;
        if (this.x) {
            k(1);
            executor.execute(new b(gVar));
        } else if (this.z) {
            k(1);
            executor.execute(new a(gVar));
        } else {
            if (this.C) {
                z = false;
            }
            com.bumptech.glide.t.j.a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.bumptech.glide.load.n.h.b
    public void c(v<R> vVar, com.bumptech.glide.load.a aVar, boolean z) {
        synchronized (this) {
            this.v = vVar;
            this.w = aVar;
            this.D = z;
        }
        o();
    }

    @Override // com.bumptech.glide.load.n.h.b
    public void d(h<?> hVar) {
        j().execute(hVar);
    }

    @Override // com.bumptech.glide.t.l.a.f
    public com.bumptech.glide.t.l.c e() {
        return this.f3801g;
    }

    void f(com.bumptech.glide.r.g gVar) {
        try {
            gVar.a(this.y);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.n.b(th);
        }
    }

    void g(com.bumptech.glide.r.g gVar) {
        try {
            gVar.c(this.A, this.w, this.D);
        } catch (Throwable th) {
            throw new com.bumptech.glide.load.n.b(th);
        }
    }

    void h() {
        if (m()) {
            return;
        }
        this.C = true;
        this.B.b();
        this.f3805k.c(this, this.q);
    }

    void i() {
        p<?> pVar;
        synchronized (this) {
            this.f3801g.c();
            com.bumptech.glide.t.j.a(m(), "Not yet complete!");
            int iDecrementAndGet = this.p.decrementAndGet();
            com.bumptech.glide.t.j.a(iDecrementAndGet >= 0, "Can't decrement below 0");
            if (iDecrementAndGet == 0) {
                pVar = this.A;
                q();
            } else {
                pVar = null;
            }
        }
        if (pVar != null) {
            pVar.g();
        }
    }

    synchronized void k(int i2) {
        p<?> pVar;
        com.bumptech.glide.t.j.a(m(), "Not yet complete!");
        if (this.p.getAndAdd(i2) == 0 && (pVar = this.A) != null) {
            pVar.a();
        }
    }

    synchronized l<R> l(com.bumptech.glide.load.g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.q = gVar;
        this.r = z;
        this.s = z2;
        this.t = z3;
        this.u = z4;
        return this;
    }

    void n() {
        synchronized (this) {
            this.f3801g.c();
            if (this.C) {
                q();
                return;
            }
            if (this.f3800f.isEmpty()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            }
            if (this.z) {
                throw new IllegalStateException("Already failed once");
            }
            this.z = true;
            com.bumptech.glide.load.g gVar = this.q;
            e eVarE = this.f3800f.e();
            k(eVarE.size() + 1);
            this.f3805k.b(this, gVar, null);
            Iterator<d> it = eVarE.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.f3812b.execute(new a(next.a));
            }
            i();
        }
    }

    void o() {
        synchronized (this) {
            this.f3801g.c();
            if (this.C) {
                this.v.b();
                q();
                return;
            }
            if (this.f3800f.isEmpty()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            }
            if (this.x) {
                throw new IllegalStateException("Already have resource");
            }
            this.A = this.f3804j.a(this.v, this.r, this.q, this.f3802h);
            this.x = true;
            e eVarE = this.f3800f.e();
            k(eVarE.size() + 1);
            this.f3805k.b(this, this.q, this.A);
            Iterator<d> it = eVarE.iterator();
            while (it.hasNext()) {
                d next = it.next();
                next.f3812b.execute(new b(next.a));
            }
            i();
        }
    }

    boolean p() {
        return this.u;
    }

    synchronized void r(com.bumptech.glide.r.g gVar) {
        this.f3801g.c();
        this.f3800f.h(gVar);
        if (this.f3800f.isEmpty()) {
            h();
            if ((this.x || this.z) && this.p.get() == 0) {
                q();
            }
        }
    }

    public synchronized void s(h<R> hVar) {
        this.B = hVar;
        (hVar.E() ? this.f3806l : j()).execute(hVar);
    }

    l(com.bumptech.glide.load.n.c0.a aVar, com.bumptech.glide.load.n.c0.a aVar2, com.bumptech.glide.load.n.c0.a aVar3, com.bumptech.glide.load.n.c0.a aVar4, m mVar, p.a aVar5, c.h.k.e<l<?>> eVar, c cVar) {
        this.f3800f = new e();
        this.f3801g = com.bumptech.glide.t.l.c.a();
        this.p = new AtomicInteger();
        this.f3806l = aVar;
        this.f3807m = aVar2;
        this.n = aVar3;
        this.o = aVar4;
        this.f3805k = mVar;
        this.f3802h = aVar5;
        this.f3803i = eVar;
        this.f3804j = cVar;
    }
}