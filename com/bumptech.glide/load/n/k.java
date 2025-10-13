package com.bumptech.glide.load.n;

import android.util.Log;
import com.bumptech.glide.load.n.b0.a;
import com.bumptech.glide.load.n.b0.h;
import com.bumptech.glide.load.n.h;
import com.bumptech.glide.load.n.p;
import com.bumptech.glide.t.l.a;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: Engine.java */
/* loaded from: classes.dex */
public class k implements m, h.a, p.a {
    private static final boolean a = Log.isLoggable("Engine", 2);

    /* renamed from: b */
    private final s f3780b;

    /* renamed from: c */
    private final o f3781c;

    /* renamed from: d */
    private final com.bumptech.glide.load.n.b0.h f3782d;

    /* renamed from: e */
    private final b f3783e;

    /* renamed from: f */
    private final y f3784f;

    /* renamed from: g */
    private final c f3785g;

    /* renamed from: h */
    private final a f3786h;

    /* renamed from: i */
    private final com.bumptech.glide.load.n.a f3787i;

    /* compiled from: Engine.java */
    static class a {
        final h.e a;

        /* renamed from: b */
        final c.h.k.e<h<?>> f3788b = com.bumptech.glide.t.l.a.d(150, new C0087a());

        /* renamed from: c */
        private int f3789c;

        /* compiled from: Engine.java */
        /* renamed from: com.bumptech.glide.load.n.k$a$a */
        class C0087a implements a.d<h<?>> {
            C0087a() {
            }

            @Override // com.bumptech.glide.t.l.a.d
            /* renamed from: b */
            public h<?> a() {
                a aVar = a.this;
                return new h<>(aVar.a, aVar.f3788b);
            }
        }

        a(h.e eVar) {
            this.a = eVar;
        }

        <R> h<R> a(com.bumptech.glide.d dVar, Object obj, n nVar, com.bumptech.glide.load.g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, j jVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z, boolean z2, boolean z3, com.bumptech.glide.load.i iVar, h.b<R> bVar) {
            h hVar = (h) com.bumptech.glide.t.j.d(this.f3788b.b());
            int i4 = this.f3789c;
            this.f3789c = i4 + 1;
            return hVar.p(dVar, obj, nVar, gVar, i2, i3, cls, cls2, gVar2, jVar, map, z, z2, z3, iVar, bVar, i4);
        }
    }

    /* compiled from: Engine.java */
    static class b {
        final com.bumptech.glide.load.n.c0.a a;

        /* renamed from: b */
        final com.bumptech.glide.load.n.c0.a f3790b;

        /* renamed from: c */
        final com.bumptech.glide.load.n.c0.a f3791c;

        /* renamed from: d */
        final com.bumptech.glide.load.n.c0.a f3792d;

        /* renamed from: e */
        final m f3793e;

        /* renamed from: f */
        final p.a f3794f;

        /* renamed from: g */
        final c.h.k.e<l<?>> f3795g = com.bumptech.glide.t.l.a.d(150, new a());

        /* compiled from: Engine.java */
        class a implements a.d<l<?>> {
            a() {
            }

            @Override // com.bumptech.glide.t.l.a.d
            /* renamed from: b */
            public l<?> a() {
                b bVar = b.this;
                return new l<>(bVar.a, bVar.f3790b, bVar.f3791c, bVar.f3792d, bVar.f3793e, bVar.f3794f, bVar.f3795g);
            }
        }

        b(com.bumptech.glide.load.n.c0.a aVar, com.bumptech.glide.load.n.c0.a aVar2, com.bumptech.glide.load.n.c0.a aVar3, com.bumptech.glide.load.n.c0.a aVar4, m mVar, p.a aVar5) {
            this.a = aVar;
            this.f3790b = aVar2;
            this.f3791c = aVar3;
            this.f3792d = aVar4;
            this.f3793e = mVar;
            this.f3794f = aVar5;
        }

        <R> l<R> a(com.bumptech.glide.load.g gVar, boolean z, boolean z2, boolean z3, boolean z4) {
            return ((l) com.bumptech.glide.t.j.d(this.f3795g.b())).l(gVar, z, z2, z3, z4);
        }
    }

    /* compiled from: Engine.java */
    private static class c implements h.e {
        private final a.InterfaceC0081a a;

        /* renamed from: b */
        private volatile com.bumptech.glide.load.n.b0.a f3796b;

        c(a.InterfaceC0081a interfaceC0081a) {
            this.a = interfaceC0081a;
        }

        @Override // com.bumptech.glide.load.n.h.e
        public com.bumptech.glide.load.n.b0.a a() {
            if (this.f3796b == null) {
                synchronized (this) {
                    if (this.f3796b == null) {
                        this.f3796b = this.a.a();
                    }
                    if (this.f3796b == null) {
                        this.f3796b = new com.bumptech.glide.load.n.b0.b();
                    }
                }
            }
            return this.f3796b;
        }
    }

    /* compiled from: Engine.java */
    public class d {
        private final l<?> a;

        /* renamed from: b */
        private final com.bumptech.glide.r.g f3797b;

        d(com.bumptech.glide.r.g gVar, l<?> lVar) {
            this.f3797b = gVar;
            this.a = lVar;
        }

        public void a() {
            synchronized (k.this) {
                this.a.r(this.f3797b);
            }
        }
    }

    public k(com.bumptech.glide.load.n.b0.h hVar, a.InterfaceC0081a interfaceC0081a, com.bumptech.glide.load.n.c0.a aVar, com.bumptech.glide.load.n.c0.a aVar2, com.bumptech.glide.load.n.c0.a aVar3, com.bumptech.glide.load.n.c0.a aVar4, boolean z) {
        this(hVar, interfaceC0081a, aVar, aVar2, aVar3, aVar4, null, null, null, null, null, null, z);
    }

    private p<?> e(com.bumptech.glide.load.g gVar) {
        v<?> vVarD = this.f3782d.d(gVar);
        if (vVarD == null) {
            return null;
        }
        return vVarD instanceof p ? (p) vVarD : new p<>(vVarD, true, true, gVar, this);
    }

    private p<?> g(com.bumptech.glide.load.g gVar) {
        p<?> pVarE = this.f3787i.e(gVar);
        if (pVarE != null) {
            pVarE.a();
        }
        return pVarE;
    }

    private p<?> h(com.bumptech.glide.load.g gVar) {
        p<?> pVarE = e(gVar);
        if (pVarE != null) {
            pVarE.a();
            this.f3787i.a(gVar, pVarE);
        }
        return pVarE;
    }

    private p<?> i(n nVar, boolean z, long j2) {
        if (!z) {
            return null;
        }
        p<?> pVarG = g(nVar);
        if (pVarG != null) {
            if (a) {
                j("Loaded resource from active resources", j2, nVar);
            }
            return pVarG;
        }
        p<?> pVarH = h(nVar);
        if (pVarH == null) {
            return null;
        }
        if (a) {
            j("Loaded resource from cache", j2, nVar);
        }
        return pVarH;
    }

    private static void j(String str, long j2, com.bumptech.glide.load.g gVar) {
        Log.v("Engine", str + " in " + com.bumptech.glide.t.f.a(j2) + "ms, key: " + gVar);
    }

    private <R> d l(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, j jVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z, boolean z2, com.bumptech.glide.load.i iVar, boolean z3, boolean z4, boolean z5, boolean z6, com.bumptech.glide.r.g gVar3, Executor executor, n nVar, long j2) {
        l<?> lVarA = this.f3780b.a(nVar, z6);
        if (lVarA != null) {
            lVarA.b(gVar3, executor);
            if (a) {
                j("Added to existing load", j2, nVar);
            }
            return new d(gVar3, lVarA);
        }
        l<R> lVarA2 = this.f3783e.a(nVar, z3, z4, z5, z6);
        h<R> hVarA = this.f3786h.a(dVar, obj, nVar, gVar, i2, i3, cls, cls2, gVar2, jVar, map, z, z2, z6, iVar, lVarA2);
        this.f3780b.c(nVar, lVarA2);
        lVarA2.b(gVar3, executor);
        lVarA2.s(hVarA);
        if (a) {
            j("Started new load", j2, nVar);
        }
        return new d(gVar3, lVarA2);
    }

    @Override // com.bumptech.glide.load.n.b0.h.a
    public void a(v<?> vVar) {
        this.f3784f.a(vVar, true);
    }

    @Override // com.bumptech.glide.load.n.m
    public synchronized void b(l<?> lVar, com.bumptech.glide.load.g gVar, p<?> pVar) {
        if (pVar != null) {
            if (pVar.f()) {
                this.f3787i.a(gVar, pVar);
            }
            this.f3780b.d(gVar, lVar);
        } else {
            this.f3780b.d(gVar, lVar);
        }
    }

    @Override // com.bumptech.glide.load.n.m
    public synchronized void c(l<?> lVar, com.bumptech.glide.load.g gVar) {
        this.f3780b.d(gVar, lVar);
    }

    @Override // com.bumptech.glide.load.n.p.a
    public void d(com.bumptech.glide.load.g gVar, p<?> pVar) {
        this.f3787i.d(gVar);
        if (pVar.f()) {
            this.f3782d.c(gVar, pVar);
        } else {
            this.f3784f.a(pVar, false);
        }
    }

    public <R> d f(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.g gVar, int i2, int i3, Class<?> cls, Class<R> cls2, com.bumptech.glide.g gVar2, j jVar, Map<Class<?>, com.bumptech.glide.load.m<?>> map, boolean z, boolean z2, com.bumptech.glide.load.i iVar, boolean z3, boolean z4, boolean z5, boolean z6, com.bumptech.glide.r.g gVar3, Executor executor) {
        long jB = a ? com.bumptech.glide.t.f.b() : 0L;
        n nVarA = this.f3781c.a(obj, gVar, i2, i3, map, cls, cls2, iVar);
        synchronized (this) {
            p<?> pVarI = i(nVarA, z3, jB);
            if (pVarI == null) {
                return l(dVar, obj, gVar, i2, i3, cls, cls2, gVar2, jVar, map, z, z2, iVar, z3, z4, z5, z6, gVar3, executor, nVarA, jB);
            }
            gVar3.c(pVarI, com.bumptech.glide.load.a.MEMORY_CACHE, false);
            return null;
        }
    }

    public void k(v<?> vVar) {
        if (!(vVar instanceof p)) {
            throw new IllegalArgumentException("Cannot release anything but an EngineResource");
        }
        ((p) vVar).g();
    }

    k(com.bumptech.glide.load.n.b0.h hVar, a.InterfaceC0081a interfaceC0081a, com.bumptech.glide.load.n.c0.a aVar, com.bumptech.glide.load.n.c0.a aVar2, com.bumptech.glide.load.n.c0.a aVar3, com.bumptech.glide.load.n.c0.a aVar4, s sVar, o oVar, com.bumptech.glide.load.n.a aVar5, b bVar, a aVar6, y yVar, boolean z) {
        this.f3782d = hVar;
        c cVar = new c(interfaceC0081a);
        this.f3785g = cVar;
        com.bumptech.glide.load.n.a aVar7 = aVar5 == null ? new com.bumptech.glide.load.n.a(z) : aVar5;
        this.f3787i = aVar7;
        aVar7.f(this);
        this.f3781c = oVar == null ? new o() : oVar;
        this.f3780b = sVar == null ? new s() : sVar;
        this.f3783e = bVar == null ? new b(aVar, aVar2, aVar3, aVar4, this, this) : bVar;
        this.f3786h = aVar6 == null ? new a(cVar) : aVar6;
        this.f3784f = yVar == null ? new y() : yVar;
        hVar.e(this);
    }
}