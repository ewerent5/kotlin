package e.c.b.a.i;

import android.content.Context;
import e.c.b.a.i.r;
import e.c.b.a.i.w.j.b0;
import e.c.b.a.i.w.j.c0;
import e.c.b.a.i.w.j.i0;
import java.util.concurrent.Executor;

/* compiled from: DaggerTransportRuntimeComponent.java */
/* loaded from: classes.dex */
final class d extends r {

    /* renamed from: e, reason: collision with root package name */
    private h.a.a<Executor> f14251e;

    /* renamed from: f, reason: collision with root package name */
    private h.a.a<Context> f14252f;

    /* renamed from: g, reason: collision with root package name */
    private h.a.a f14253g;

    /* renamed from: h, reason: collision with root package name */
    private h.a.a f14254h;

    /* renamed from: i, reason: collision with root package name */
    private h.a.a f14255i;

    /* renamed from: j, reason: collision with root package name */
    private h.a.a<b0> f14256j;

    /* renamed from: k, reason: collision with root package name */
    private h.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.g> f14257k;

    /* renamed from: l, reason: collision with root package name */
    private h.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.s> f14258l;

    /* renamed from: m, reason: collision with root package name */
    private h.a.a<e.c.b.a.i.w.c> f14259m;
    private h.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.m> n;
    private h.a.a<com.google.android.datatransport.runtime.scheduling.jobscheduling.q> o;
    private h.a.a<q> p;

    /* compiled from: DaggerTransportRuntimeComponent.java */
    private static final class b implements r.a {
        private Context a;

        private b() {
        }

        @Override // e.c.b.a.i.r.a
        public r a() {
            e.c.b.a.i.t.a.d.a(this.a, Context.class);
            return new d(this.a);
        }

        @Override // e.c.b.a.i.r.a
        /* renamed from: c, reason: merged with bridge method [inline-methods] */
        public b b(Context context) {
            this.a = (Context) e.c.b.a.i.t.a.d.b(context);
            return this;
        }
    }

    public static r.a d() {
        return new b();
    }

    private void g(Context context) {
        this.f14251e = e.c.b.a.i.t.a.a.a(j.a());
        e.c.b.a.i.t.a.b bVarA = e.c.b.a.i.t.a.c.a(context);
        this.f14252f = bVarA;
        com.google.android.datatransport.runtime.backends.j jVarA = com.google.android.datatransport.runtime.backends.j.a(bVarA, e.c.b.a.i.y.c.a(), e.c.b.a.i.y.d.a());
        this.f14253g = jVarA;
        this.f14254h = e.c.b.a.i.t.a.a.a(com.google.android.datatransport.runtime.backends.l.a(this.f14252f, jVarA));
        this.f14255i = i0.a(this.f14252f, e.c.b.a.i.w.j.f.a(), e.c.b.a.i.w.j.g.a());
        this.f14256j = e.c.b.a.i.t.a.a.a(c0.a(e.c.b.a.i.y.c.a(), e.c.b.a.i.y.d.a(), e.c.b.a.i.w.j.h.a(), this.f14255i));
        e.c.b.a.i.w.g gVarB = e.c.b.a.i.w.g.b(e.c.b.a.i.y.c.a());
        this.f14257k = gVarB;
        e.c.b.a.i.w.i iVarA = e.c.b.a.i.w.i.a(this.f14252f, this.f14256j, gVarB, e.c.b.a.i.y.d.a());
        this.f14258l = iVarA;
        h.a.a<Executor> aVar = this.f14251e;
        h.a.a aVar2 = this.f14254h;
        h.a.a<b0> aVar3 = this.f14256j;
        this.f14259m = e.c.b.a.i.w.d.a(aVar, aVar2, iVarA, aVar3, aVar3);
        h.a.a<Context> aVar4 = this.f14252f;
        h.a.a aVar5 = this.f14254h;
        h.a.a<b0> aVar6 = this.f14256j;
        this.n = com.google.android.datatransport.runtime.scheduling.jobscheduling.n.a(aVar4, aVar5, aVar6, this.f14258l, this.f14251e, aVar6, e.c.b.a.i.y.c.a());
        h.a.a<Executor> aVar7 = this.f14251e;
        h.a.a<b0> aVar8 = this.f14256j;
        this.o = com.google.android.datatransport.runtime.scheduling.jobscheduling.r.a(aVar7, aVar8, this.f14258l, aVar8);
        this.p = e.c.b.a.i.t.a.a.a(s.a(e.c.b.a.i.y.c.a(), e.c.b.a.i.y.d.a(), this.f14259m, this.n, this.o));
    }

    @Override // e.c.b.a.i.r
    e.c.b.a.i.w.j.c b() {
        return this.f14256j.get();
    }

    @Override // e.c.b.a.i.r
    q c() {
        return this.p.get();
    }

    private d(Context context) {
        g(context);
    }
}