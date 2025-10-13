package com.parizene.netmonitor.ui.map;

import android.graphics.Rect;
import android.location.Location;
import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import androidx.lifecycle.LiveData;
import com.parizene.netmonitor.R;
import com.parizene.netmonitor.k0.b;
import com.parizene.netmonitor.k0.d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import org.greenrobot.eventbus.ThreadMode;

/* compiled from: MapPresenterImpl.java */
/* loaded from: classes3.dex */
class l0 implements k0 {

    /* renamed from: e */
    private static final o0 f13953e = new a();

    /* renamed from: f */
    private final org.greenrobot.eventbus.c f13954f;

    /* renamed from: g */
    private final t0 f13955g;

    /* renamed from: h */
    private final u f13956h;

    /* renamed from: i */
    private final com.parizene.netmonitor.db.celllog.b f13957i;

    /* renamed from: j */
    private final com.parizene.netmonitor.k0.e f13958j;

    /* renamed from: k */
    private final com.parizene.netmonitor.x f13959k;

    /* renamed from: l */
    private final Handler f13960l;

    /* renamed from: m */
    private final Handler f13961m;
    private LiveData<List<com.parizene.netmonitor.db.celllog.i.e>> p;
    private h0 q;
    private boolean s;
    private o0 o = f13953e;
    private final androidx.lifecycle.r<List<com.parizene.netmonitor.db.celllog.i.e>> t = new b();
    private Runnable u = new c();
    private final Map<Long, s> n = new HashMap();
    private SparseArray<c.h.k.d<Integer, com.parizene.netmonitor.db.celllog.i.d>> r = new SparseArray<>();

    /* compiled from: MapPresenterImpl.java */
    class a implements o0 {
        a() {
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ g0 A() {
            return n0.d(this);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void B() {
            n0.f(this);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void C(s sVar, s sVar2, long j2, g0 g0Var, int i2, boolean z) {
            n0.v(this, sVar, sVar2, j2, g0Var, i2, z);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void K(m0 m0Var, Bundle bundle) {
            n0.b(this, m0Var, bundle);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void M() {
            n0.e(this);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void N() {
            n0.c(this);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ b0 O(s sVar, g0 g0Var, int i2, boolean z) {
            return n0.a(this, sVar, g0Var, i2, z);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void P(Location location) {
            n0.r(this, location);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void S(m0 m0Var) {
            n0.t(this, m0Var);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void T(Map map) {
            n0.l(this, map);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void b(b0 b0Var) {
            n0.m(this, b0Var);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void c(g0 g0Var) {
            n0.i(this, g0Var);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void d0(int i2, boolean z) {
            n0.h(this, i2, z);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void e(g0 g0Var) {
            n0.j(this, g0Var);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void e0(j0 j0Var) {
            n0.w(this, j0Var);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void f() {
            n0.g(this);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void g() {
            n0.k(this);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void j(int i2) {
            n0.q(this, i2);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void o(int i2) {
            n0.u(this, i2);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void p(int i2) {
            n0.s(this, i2);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void s(int i2) {
            n0.n(this, i2);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void w() {
            n0.p(this);
        }

        @Override // com.parizene.netmonitor.ui.map.o0
        public /* synthetic */ void y(boolean z) {
            n0.o(this, z);
        }
    }

    /* compiled from: MapPresenterImpl.java */
    class b implements androidx.lifecycle.r<List<com.parizene.netmonitor.db.celllog.i.e>> {
        b() {
        }

        /* renamed from: b */
        public /* synthetic */ void c(List list) {
            l0.this.Y(list);
        }

        @Override // androidx.lifecycle.r
        /* renamed from: d */
        public void a(final List<com.parizene.netmonitor.db.celllog.i.e> list) {
            l0.this.f13961m.post(new Runnable() { // from class: com.parizene.netmonitor.ui.map.l
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13951e.c(list);
                }
            });
        }
    }

    /* compiled from: MapPresenterImpl.java */
    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            g0 g0VarP = l0.this.P();
            if (g0VarP != null) {
                l0.this.o.c(g0VarP);
            }
            l0.this.f13960l.postDelayed(this, 5000L);
        }
    }

    l0(org.greenrobot.eventbus.c cVar, t0 t0Var, u uVar, com.parizene.netmonitor.db.celllog.b bVar, com.parizene.netmonitor.k0.e eVar, com.parizene.netmonitor.x xVar, Handler handler, Handler handler2) {
        this.f13954f = cVar;
        this.f13955g = t0Var;
        this.f13956h = uVar;
        this.f13957i = bVar;
        this.f13958j = eVar;
        this.f13959k = xVar;
        this.f13960l = handler;
        this.f13961m = handler2;
    }

    private void I() {
        this.o.T(this.n);
        this.n.clear();
        this.o.f();
    }

    private Map<Long, s> J(List<com.parizene.netmonitor.db.celllog.i.e> list, int i2) {
        int i3;
        int size = list.size();
        HashMap map = new HashMap(size);
        for (int i4 = 0; i4 < size; i4++) {
            com.parizene.netmonitor.db.celllog.i.e eVar = list.get(i4);
            long jN = N(eVar, i2);
            s sVar = (s) map.get(Long.valueOf(jN));
            if (sVar != null) {
                sVar.a(eVar);
            } else {
                sVar = new s(eVar);
                map.put(Long.valueOf(jN), sVar);
            }
            for (int i5 = 0; i5 < this.r.size(); i5++) {
                com.parizene.netmonitor.db.celllog.i.d dVar = this.r.valueAt(i5).f3105b;
                com.parizene.netmonitor.db.celllog.i.c cVarA = dVar.a();
                if (cVarA == null || cVarA.n() != eVar.a) {
                    List<com.parizene.netmonitor.db.celllog.i.c> listB = dVar.b();
                    int i6 = 0;
                    while (true) {
                        if (i6 >= listB.size()) {
                            i3 = 0;
                            break;
                        }
                        if (listB.get(i6).n() == eVar.a) {
                            i3 = 2;
                            break;
                        }
                        i6++;
                    }
                } else {
                    i3 = 1;
                }
                sVar.k(i3);
            }
        }
        return map;
    }

    private LiveData<List<com.parizene.netmonitor.db.celllog.i.e>> K() {
        if (this.q != null) {
            return this.f13957i.z(new Rect(this.q.b().f13943b, this.q.a().a, this.q.a().f13943b, this.q.b().a), com.parizene.netmonitor.t0.f.f13728m.g().booleanValue(), com.parizene.netmonitor.t0.f.n.g().booleanValue());
        }
        androidx.lifecycle.q qVar = new androidx.lifecycle.q();
        qVar.l(new ArrayList());
        return qVar;
    }

    private static long M(int i2, long j2, int i3) {
        int i4;
        int i5;
        int i6;
        if (5 == i3 || 6 == i3) {
            return j2;
        }
        if (1 == i3) {
            i4 = ((int) j2) >> 8;
        } else if (i2 == 1) {
            i4 = ((int) j2) / 10;
        } else if (i2 != 2) {
            if (i2 == 3) {
                i5 = (int) j2;
                i6 = 65520;
            } else if (i2 != 4) {
                i4 = (int) j2;
            } else {
                i5 = (int) j2;
                i6 = 61695;
            }
            i4 = i5 & i6;
        } else {
            i4 = ((int) j2) % 10000;
        }
        return i4;
    }

    private static long N(com.parizene.netmonitor.db.celllog.i.b bVar, int i2) {
        return M(i2, bVar.a(), bVar.f13097k) | (Long.parseLong(bVar.f13088b) << 48) | (Long.parseLong(bVar.f13089c) << 32) | (bVar.f13090d << 16);
    }

    private g0 O() {
        Location locationI = this.f13959k.i();
        if (locationI != null) {
            return new g0(locationI);
        }
        return null;
    }

    public g0 P() {
        g0 g0VarA;
        if (!com.parizene.netmonitor.t0.f.f13718c.g().booleanValue() || (g0VarA = this.o.A()) == null) {
            g0VarA = null;
        }
        return g0VarA == null ? O() : g0VarA;
    }

    /* renamed from: Q */
    public /* synthetic */ void R() {
        Y(this.p.d());
    }

    /* renamed from: S */
    public /* synthetic */ void T() {
        Y(this.p.d());
    }

    /* renamed from: U */
    public /* synthetic */ void V(Map map) {
        int size = map.size();
        if (size > 150) {
            this.o.o(0);
            I();
        } else {
            this.o.o(size);
            Z(map, com.parizene.netmonitor.t0.f.r.g().intValue(), com.parizene.netmonitor.t0.f.f13724i.g().booleanValue());
        }
    }

    private void W() {
        this.f13960l.removeCallbacks(this.u);
        this.f13960l.postDelayed(this.u, 5000L);
    }

    private void X() {
        this.f13960l.removeCallbacks(this.u);
    }

    public void Y(List<com.parizene.netmonitor.db.celllog.i.e> list) {
        if (list == null) {
            return;
        }
        final Map<Long, s> mapJ = J(list, com.parizene.netmonitor.t0.f.r.g().intValue());
        this.f13960l.post(new Runnable() { // from class: com.parizene.netmonitor.ui.map.n
            @Override // java.lang.Runnable
            public final void run() {
                this.f13967e.V(mapJ);
            }
        });
    }

    private void Z(Map<Long, s> map, int i2, boolean z) {
        HashSet hashSet = new HashSet(map.size());
        g0 g0VarP = P();
        for (Map.Entry<Long, s> entry : map.entrySet()) {
            long jLongValue = entry.getKey().longValue();
            s value = entry.getValue();
            hashSet.add(Long.valueOf(jLongValue));
            s sVar = this.n.get(Long.valueOf(jLongValue));
            if (sVar == null) {
                b0 b0VarO = this.o.O(value, g0VarP, i2, z);
                if (b0VarO != null) {
                    value.f13981c = b0VarO;
                    this.n.put(Long.valueOf(jLongValue), value);
                }
            } else {
                long jB = (sVar.f13980b != value.f13980b || sVar.e(i2, z).equals(value.e(i2, z))) ? com.parizene.netmonitor.t.b(0L, 0) : 0L;
                if (!com.parizene.netmonitor.j0.c(sVar.f13981c.getPosition(), value.f())) {
                    jB = com.parizene.netmonitor.t.b(jB, 1);
                }
                if (!com.parizene.netmonitor.j0.c(sVar.f13981c.getTitle(), value.i(g0VarP, i2, z))) {
                    jB = com.parizene.netmonitor.t.b(jB, 2);
                }
                if (!com.parizene.netmonitor.j0.c(sVar.f13981c.a(), value.h())) {
                    jB = com.parizene.netmonitor.t.b(jB, 3);
                }
                long j2 = jB;
                if (j2 != 0) {
                    this.o.C(sVar, value, j2, g0VarP, i2, z);
                }
            }
        }
        Iterator<Long> it = this.n.keySet().iterator();
        while (it.hasNext()) {
            long jLongValue2 = it.next().longValue();
            if (!hashSet.contains(Long.valueOf(jLongValue2))) {
                this.o.b(this.n.get(Long.valueOf(jLongValue2)).f13981c);
                it.remove();
            }
        }
        this.o.g();
    }

    @Override // com.parizene.netmonitor.ui.map.k0
    public void C() {
        g0 g0VarP = P();
        if (g0VarP != null) {
            this.o.e(g0VarP);
        }
    }

    @Override // com.parizene.netmonitor.ui.o0
    /* renamed from: L */
    public void D(o0 o0Var, Bundle bundle) {
        this.o = o0Var;
        if (com.parizene.netmonitor.t0.f.f13726k.g().booleanValue()) {
            this.o.w();
        }
        this.o.K(("google_maps".equals(com.parizene.netmonitor.t0.f.x.g()) && this.f13956h.a()) ? m0.GOOGLE_MAPS : m0.OSM, bundle);
    }

    @Override // com.parizene.netmonitor.ui.map.k0
    public void a() {
        if (this.s) {
            return;
        }
        this.s = true;
        com.parizene.netmonitor.t0.b bVar = com.parizene.netmonitor.t0.f.f13718c;
        if (!bVar.g().booleanValue()) {
            this.o.B();
        }
        if (com.parizene.netmonitor.t0.f.q.g().booleanValue()) {
            W();
        }
        this.o.y(bVar.g().booleanValue());
        LiveData<List<com.parizene.netmonitor.db.celllog.i.e>> liveDataK = K();
        this.p = liveDataK;
        liveDataK.g(this.t);
        this.f13954f.r(this);
    }

    @Override // com.parizene.netmonitor.ui.map.k0
    public void b() {
        if (this.s) {
            this.f13954f.t(this);
            this.p.k(this.t);
            X();
            this.s = false;
        }
    }

    @Override // com.parizene.netmonitor.ui.map.k0
    public void g() {
        com.parizene.netmonitor.t0.b bVar = com.parizene.netmonitor.t0.f.q;
        boolean z = !bVar.g().booleanValue();
        bVar.f(Boolean.valueOf(z));
        this.f13958j.a(d.f.b(z));
        if (z) {
            W();
        } else {
            X();
        }
    }

    @Override // com.parizene.netmonitor.ui.map.k0
    public void i() {
        this.o.j(com.parizene.netmonitor.t0.f.r.g().intValue());
    }

    @Override // com.parizene.netmonitor.ui.map.k0
    public void j(h0 h0Var) {
        if (com.parizene.netmonitor.j0.c(this.q, h0Var)) {
            return;
        }
        this.q = h0Var;
        if (this.s) {
            this.p.k(this.t);
            LiveData<List<com.parizene.netmonitor.db.celllog.i.e>> liveDataK = K();
            this.p = liveDataK;
            liveDataK.g(this.t);
        }
    }

    @Override // com.parizene.netmonitor.ui.map.k0
    public void k() {
        this.o.d0(com.parizene.netmonitor.t0.f.s.g().intValue(), com.parizene.netmonitor.t0.f.f13718c.g().booleanValue());
    }

    @Override // com.parizene.netmonitor.ui.map.k0
    public void n() {
        com.parizene.netmonitor.t0.h hVar = com.parizene.netmonitor.t0.f.x;
        hVar.f("google_maps".equals(hVar.g()) ? "osm" : "google_maps");
        I();
        this.o.S("google_maps".equals(hVar.g()) ? m0.GOOGLE_MAPS : m0.OSM);
    }

    @org.greenrobot.eventbus.m(sticky = true)
    public void onCellsStateChangedEvent(com.parizene.netmonitor.l0.a aVar) {
        this.r = aVar.a();
        this.f13961m.post(new Runnable() { // from class: com.parizene.netmonitor.ui.map.o
            @Override // java.lang.Runnable
            public final void run() {
                this.f13969e.T();
            }
        });
    }

    @org.greenrobot.eventbus.m(sticky = true, threadMode = ThreadMode.MAIN)
    public void onLocationChangedEvent(com.parizene.netmonitor.l0.e eVar) {
        Location locationA;
        if (com.parizene.netmonitor.t0.f.f13718c.g().booleanValue() && (locationA = eVar.a()) != null) {
            this.o.P(locationA);
        }
    }

    @Override // com.parizene.netmonitor.ui.map.k0
    public void q() {
        com.parizene.netmonitor.t0.f.f13726k.f(Boolean.FALSE);
        this.o.M();
    }

    @Override // com.parizene.netmonitor.ui.map.k0
    public void r(int i2) {
        com.parizene.netmonitor.t0.f.r.f(Integer.valueOf(i2));
        this.f13958j.a(d.f.c(b.C0158b.a(i2)));
        I();
        this.f13961m.post(new Runnable() { // from class: com.parizene.netmonitor.ui.map.m
            @Override // java.lang.Runnable
            public final void run() {
                this.f13963e.R();
            }
        });
    }

    @Override // com.parizene.netmonitor.ui.o0
    public void t(Bundle bundle) {
    }

    @Override // com.parizene.netmonitor.ui.o0
    public void u() {
        this.o.N();
        this.o = f13953e;
    }

    @Override // com.parizene.netmonitor.ui.map.k0
    public void x() {
        this.o.p(com.parizene.netmonitor.t0.f.s.g().intValue() - 1);
    }

    @Override // com.parizene.netmonitor.ui.map.k0
    public void y(int i2) {
        int i3 = i2 + 1;
        com.parizene.netmonitor.t0.f.s.f(Integer.valueOf(i3));
        this.o.s(i3);
    }

    @Override // com.parizene.netmonitor.ui.map.k0
    public void z() {
        boolean zA = this.f13956h.a();
        m0 m0Var = "google_maps".equals(com.parizene.netmonitor.t0.f.x.g()) ? m0.GOOGLE_MAPS : m0.OSM;
        o0 o0Var = this.o;
        boolean zBooleanValue = com.parizene.netmonitor.t0.f.q.g().booleanValue();
        m0 m0Var2 = m0.GOOGLE_MAPS;
        o0Var.e0(new j0(zBooleanValue, m0Var == m0Var2 || zA, this.f13955g.a(m0Var == m0Var2 ? R.string.osm : R.string.google_maps), m0Var == m0Var2));
    }
}