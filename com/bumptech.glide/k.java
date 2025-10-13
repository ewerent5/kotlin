package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.o.c;
import com.bumptech.glide.o.m;
import com.bumptech.glide.o.q;
import com.bumptech.glide.o.r;
import com.bumptech.glide.o.t;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: RequestManager.java */
/* loaded from: classes.dex */
public class k implements ComponentCallbacks2, m {

    /* renamed from: e, reason: collision with root package name */
    private static final com.bumptech.glide.r.f f3564e = com.bumptech.glide.r.f.g0(Bitmap.class).L();

    /* renamed from: f, reason: collision with root package name */
    private static final com.bumptech.glide.r.f f3565f = com.bumptech.glide.r.f.g0(com.bumptech.glide.load.p.h.c.class).L();

    /* renamed from: g, reason: collision with root package name */
    private static final com.bumptech.glide.r.f f3566g = com.bumptech.glide.r.f.h0(com.bumptech.glide.load.n.j.f3777c).S(g.LOW).Z(true);

    /* renamed from: h, reason: collision with root package name */
    protected final com.bumptech.glide.b f3567h;

    /* renamed from: i, reason: collision with root package name */
    protected final Context f3568i;

    /* renamed from: j, reason: collision with root package name */
    final com.bumptech.glide.o.l f3569j;

    /* renamed from: k, reason: collision with root package name */
    private final r f3570k;

    /* renamed from: l, reason: collision with root package name */
    private final q f3571l;

    /* renamed from: m, reason: collision with root package name */
    private final t f3572m;
    private final Runnable n;
    private final com.bumptech.glide.o.c o;
    private final CopyOnWriteArrayList<com.bumptech.glide.r.e<Object>> p;
    private com.bumptech.glide.r.f q;
    private boolean r;

    /* compiled from: RequestManager.java */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            k kVar = k.this;
            kVar.f3569j.a(kVar);
        }
    }

    /* compiled from: RequestManager.java */
    private class b implements c.a {
        private final r a;

        b(r rVar) {
            this.a = rVar;
        }

        @Override // com.bumptech.glide.o.c.a
        public void a(boolean z) {
            if (z) {
                synchronized (k.this) {
                    this.a.e();
                }
            }
        }
    }

    public k(com.bumptech.glide.b bVar, com.bumptech.glide.o.l lVar, q qVar, Context context) {
        this(bVar, lVar, qVar, new r(), bVar.g(), context);
    }

    private void z(com.bumptech.glide.r.j.h<?> hVar) {
        boolean zY = y(hVar);
        com.bumptech.glide.r.c cVarF = hVar.f();
        if (zY || this.f3567h.p(hVar) || cVarF == null) {
            return;
        }
        hVar.c(null);
        cVarF.clear();
    }

    @Override // com.bumptech.glide.o.m
    public synchronized void h() {
        v();
        this.f3572m.h();
    }

    public <ResourceType> j<ResourceType> j(Class<ResourceType> cls) {
        return new j<>(this.f3567h, this, cls, this.f3568i);
    }

    public j<Bitmap> k() {
        return j(Bitmap.class).a(f3564e);
    }

    @Override // com.bumptech.glide.o.m
    public synchronized void l() {
        u();
        this.f3572m.l();
    }

    public j<Drawable> m() {
        return j(Drawable.class);
    }

    public void n(com.bumptech.glide.r.j.h<?> hVar) {
        if (hVar == null) {
            return;
        }
        z(hVar);
    }

    List<com.bumptech.glide.r.e<Object>> o() {
        return this.p;
    }

    @Override // android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
    }

    @Override // com.bumptech.glide.o.m
    public synchronized void onDestroy() {
        this.f3572m.onDestroy();
        Iterator<com.bumptech.glide.r.j.h<?>> it = this.f3572m.k().iterator();
        while (it.hasNext()) {
            n(it.next());
        }
        this.f3572m.j();
        this.f3570k.b();
        this.f3569j.b(this);
        this.f3569j.b(this.o);
        com.bumptech.glide.t.k.u(this.n);
        this.f3567h.s(this);
    }

    @Override // android.content.ComponentCallbacks
    public void onLowMemory() {
    }

    @Override // android.content.ComponentCallbacks2
    public void onTrimMemory(int i2) {
        if (i2 == 60 && this.r) {
            t();
        }
    }

    synchronized com.bumptech.glide.r.f p() {
        return this.q;
    }

    <T> l<?, T> q(Class<T> cls) {
        return this.f3567h.i().e(cls);
    }

    public j<Drawable> r(String str) {
        return m().u0(str);
    }

    public synchronized void s() {
        this.f3570k.c();
    }

    public synchronized void t() {
        s();
        Iterator<k> it = this.f3571l.a().iterator();
        while (it.hasNext()) {
            it.next().s();
        }
    }

    public synchronized String toString() {
        return super.toString() + "{tracker=" + this.f3570k + ", treeNode=" + this.f3571l + "}";
    }

    public synchronized void u() {
        this.f3570k.d();
    }

    public synchronized void v() {
        this.f3570k.f();
    }

    protected synchronized void w(com.bumptech.glide.r.f fVar) {
        this.q = fVar.d().b();
    }

    synchronized void x(com.bumptech.glide.r.j.h<?> hVar, com.bumptech.glide.r.c cVar) {
        this.f3572m.m(hVar);
        this.f3570k.g(cVar);
    }

    synchronized boolean y(com.bumptech.glide.r.j.h<?> hVar) {
        com.bumptech.glide.r.c cVarF = hVar.f();
        if (cVarF == null) {
            return true;
        }
        if (!this.f3570k.a(cVarF)) {
            return false;
        }
        this.f3572m.n(hVar);
        hVar.c(null);
        return true;
    }

    k(com.bumptech.glide.b bVar, com.bumptech.glide.o.l lVar, q qVar, r rVar, com.bumptech.glide.o.d dVar, Context context) {
        this.f3572m = new t();
        a aVar = new a();
        this.n = aVar;
        this.f3567h = bVar;
        this.f3569j = lVar;
        this.f3571l = qVar;
        this.f3570k = rVar;
        this.f3568i = context;
        com.bumptech.glide.o.c cVarA = dVar.a(context.getApplicationContext(), new b(rVar));
        this.o = cVarA;
        if (com.bumptech.glide.t.k.p()) {
            com.bumptech.glide.t.k.t(aVar);
        } else {
            lVar.a(this);
        }
        lVar.a(cVarA);
        this.p = new CopyOnWriteArrayList<>(bVar.i().c());
        w(bVar.i().d());
        bVar.o(this);
    }
}