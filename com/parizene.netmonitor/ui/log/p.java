package com.parizene.netmonitor.ui.log;

import android.os.Bundle;
import android.os.Handler;
import com.parizene.netmonitor.k0.d;
import com.parizene.netmonitor.ui.p0;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: LogPresenterImpl.java */
/* loaded from: classes3.dex */
class p implements o {

    /* renamed from: e */
    private static final s f13922e = new a();

    /* renamed from: f */
    private s f13923f = f13922e;

    /* renamed from: g */
    private boolean f13924g;

    /* renamed from: h */
    private com.parizene.netmonitor.db.celllog.b f13925h;

    /* renamed from: i */
    private com.parizene.netmonitor.k0.e f13926i;

    /* renamed from: j */
    private Handler f13927j;

    /* renamed from: k */
    private Handler f13928k;

    /* renamed from: l */
    private q f13929l;

    /* compiled from: LogPresenterImpl.java */
    class a implements s {
        a() {
        }

        @Override // com.parizene.netmonitor.ui.log.s
        public /* synthetic */ void G(g gVar) {
            r.c(this, gVar);
        }

        @Override // com.parizene.netmonitor.ui.log.s
        public /* synthetic */ void H(n nVar) {
            r.g(this, nVar);
        }

        @Override // com.parizene.netmonitor.ui.log.s
        public /* synthetic */ void L(g gVar, String str) {
            r.b(this, gVar, str);
        }

        @Override // com.parizene.netmonitor.ui.log.s
        public /* synthetic */ void Z(q qVar) {
            r.a(this, qVar);
        }

        @Override // com.parizene.netmonitor.ui.log.s
        public /* synthetic */ void q(String str) {
            r.f(this, str);
        }

        @Override // com.parizene.netmonitor.ui.log.s
        public /* synthetic */ void r(Map map, String str) {
            r.e(this, map, str);
        }

        @Override // com.parizene.netmonitor.ui.log.s
        public /* synthetic */ void x(int i2) {
            r.d(this, i2);
        }

        @Override // com.parizene.netmonitor.ui.log.s
        public /* synthetic */ void z(q qVar) {
            r.h(this, qVar);
        }
    }

    p(com.parizene.netmonitor.db.celllog.b bVar, com.parizene.netmonitor.k0.e eVar, Handler handler, Handler handler2) {
        this.f13925h = bVar;
        this.f13926i = eVar;
        this.f13927j = handler;
        this.f13928k = handler2;
    }

    /* renamed from: F */
    public /* synthetic */ void G(Map map, String str) {
        this.f13923f.r(map, str);
    }

    /* renamed from: H */
    public /* synthetic */ void I() {
        final LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put(null, null);
        for (com.parizene.netmonitor.db.celllog.i.o oVar : this.f13925h.A()) {
            linkedHashMap.put(oVar.b(), oVar.a());
        }
        final String strG = com.parizene.netmonitor.t0.f.w.g();
        this.f13927j.post(new Runnable() { // from class: com.parizene.netmonitor.ui.log.c
            @Override // java.lang.Runnable
            public final void run() {
                this.f13869e.G(linkedHashMap, strG);
            }
        });
    }

    private q o() {
        return new q(p0.values()[com.parizene.netmonitor.t0.f.f13717b.f().intValue()], com.parizene.netmonitor.t0.f.f13724i.g().booleanValue(), com.parizene.netmonitor.t0.f.t.g().booleanValue(), com.parizene.netmonitor.t0.f.u.g().booleanValue());
    }

    @Override // com.parizene.netmonitor.ui.log.o
    public void A() {
        this.f13923f.q(com.parizene.netmonitor.t0.f.I.g());
    }

    @Override // com.parizene.netmonitor.ui.log.o
    public void B() {
        this.f13926i.a(d.C0159d.a);
        this.f13928k.post(new Runnable() { // from class: com.parizene.netmonitor.ui.log.d
            @Override // java.lang.Runnable
            public final void run() {
                this.f13872e.I();
            }
        });
    }

    @Override // com.parizene.netmonitor.ui.log.o
    public void E() {
        boolean zBooleanValue = com.parizene.netmonitor.t0.f.t.g().booleanValue();
        com.parizene.netmonitor.t0.b bVar = com.parizene.netmonitor.t0.f.u;
        boolean z = !bVar.g().booleanValue();
        bVar.f(Boolean.valueOf(z));
        this.f13923f.H(new n(zBooleanValue, z));
        this.f13926i.a(d.C0159d.b(z));
        q qVarO = o();
        if (this.f13929l != qVarO) {
            this.f13929l = qVarO;
            this.f13923f.z(qVarO);
        }
    }

    @Override // com.parizene.netmonitor.ui.log.o
    public void a() {
        m.a.a.a("startUpdates", new Object[0]);
        if (this.f13924g) {
            return;
        }
        this.f13924g = true;
        q qVarO = o();
        if (this.f13929l != qVarO) {
            this.f13929l = qVarO;
            this.f13923f.z(qVarO);
        }
    }

    @Override // com.parizene.netmonitor.ui.log.o
    public void b() {
        m.a.a.a("stopUpdates", new Object[0]);
        if (this.f13924g) {
            this.f13924g = false;
        }
    }

    @Override // com.parizene.netmonitor.ui.log.o
    public void c() {
        this.f13923f.H(new n(com.parizene.netmonitor.t0.f.t.g().booleanValue(), com.parizene.netmonitor.t0.f.u.g().booleanValue()));
    }

    @Override // com.parizene.netmonitor.ui.log.o
    public void e(g gVar) {
        this.f13923f.L(gVar, gVar.f() + " " + p0.a(gVar.b(), gVar.k(), p0.values()[com.parizene.netmonitor.t0.f.f13717b.f().intValue()], com.parizene.netmonitor.t0.f.f13724i.g().booleanValue()));
    }

    @Override // com.parizene.netmonitor.ui.log.o
    public void l() {
        this.f13923f.x(com.parizene.netmonitor.t0.f.v.g().intValue());
    }

    @Override // com.parizene.netmonitor.ui.log.o
    public void p(g gVar) {
        this.f13923f.G(gVar);
    }

    @Override // com.parizene.netmonitor.ui.o0
    /* renamed from: s */
    public void D(s sVar, Bundle bundle) {
        m.a.a.a("createView", new Object[0]);
        this.f13923f = sVar;
        q qVarO = o();
        this.f13929l = qVarO;
        this.f13923f.Z(qVarO);
    }

    @Override // com.parizene.netmonitor.ui.o0
    public void u() {
        m.a.a.a("destroyView", new Object[0]);
        this.f13923f = f13922e;
    }

    @Override // com.parizene.netmonitor.ui.log.o
    public void v() {
        com.parizene.netmonitor.t0.b bVar = com.parizene.netmonitor.t0.f.t;
        boolean z = !bVar.g().booleanValue();
        bVar.f(Boolean.valueOf(z));
        this.f13923f.H(new n(z, com.parizene.netmonitor.t0.f.u.g().booleanValue()));
        this.f13926i.a(d.C0159d.c(z));
        q qVarO = o();
        if (this.f13929l != qVarO) {
            this.f13929l = qVarO;
            this.f13923f.z(qVarO);
        }
    }
}