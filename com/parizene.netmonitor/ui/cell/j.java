package com.parizene.netmonitor.ui.cell;

import android.os.Bundle;
import android.os.Handler;
import android.util.SparseArray;
import com.parizene.netmonitor.db.celllog.i.p;
import com.parizene.netmonitor.db.celllog.i.q;
import com.parizene.netmonitor.j0;
import com.parizene.netmonitor.k0.d;
import com.parizene.netmonitor.m0.b0.n;
import com.parizene.netmonitor.m0.b0.o;
import com.parizene.netmonitor.ui.cell.o.h;
import com.parizene.netmonitor.ui.p0;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* compiled from: CellPresenterImpl.java */
/* loaded from: classes3.dex */
class j implements i, Runnable {

    /* renamed from: e */
    private static final m f13802e = new a();

    /* renamed from: g */
    private com.parizene.netmonitor.k0.e f13804g;

    /* renamed from: h */
    private org.greenrobot.eventbus.c f13805h;

    /* renamed from: k */
    private com.parizene.netmonitor.l0.a f13808k;

    /* renamed from: l */
    private Handler f13809l;

    /* renamed from: m */
    private Handler f13810m;
    private boolean n;

    /* renamed from: f */
    private m f13803f = f13802e;

    /* renamed from: i */
    private SparseArray<com.parizene.netmonitor.ui.cell.o.h> f13806i = new SparseArray<>();

    /* renamed from: j */
    private SparseArray<h.a> f13807j = new SparseArray<>();

    /* compiled from: CellPresenterImpl.java */
    class a implements m {
        a() {
        }

        @Override // com.parizene.netmonitor.ui.cell.m
        public /* synthetic */ void E(h hVar) {
            l.g(this, hVar);
        }

        @Override // com.parizene.netmonitor.ui.cell.m
        public /* synthetic */ void J() {
            l.e(this);
        }

        @Override // com.parizene.netmonitor.ui.cell.m
        public /* synthetic */ void W(k kVar, boolean z) {
            l.h(this, kVar, z);
        }

        @Override // com.parizene.netmonitor.ui.cell.m
        public /* synthetic */ void a0() {
            l.d(this);
        }

        @Override // com.parizene.netmonitor.ui.cell.m
        public /* synthetic */ void c0(k kVar) {
            l.b(this, kVar);
        }

        @Override // com.parizene.netmonitor.ui.cell.m
        public /* synthetic */ void d(List list) {
            l.f(this, list);
        }

        @Override // com.parizene.netmonitor.ui.cell.m
        public /* synthetic */ void h() {
            l.c(this);
        }

        @Override // com.parizene.netmonitor.ui.cell.m
        public /* synthetic */ void n() {
            l.a(this);
        }
    }

    j(com.parizene.netmonitor.k0.e eVar, org.greenrobot.eventbus.c cVar, Handler handler, Handler handler2) {
        this.f13804g = eVar;
        this.f13805h = cVar;
        this.f13809l = handler;
        this.f13810m = handler2;
    }

    private k F() {
        return new k(p0.values()[com.parizene.netmonitor.t0.f.f13717b.f().intValue()], com.parizene.netmonitor.t0.f.f13724i.g().booleanValue(), com.parizene.netmonitor.t0.f.B.g().booleanValue(), com.parizene.netmonitor.t0.f.H.f().intValue());
    }

    private int[] H(int i2, SparseArray<c.h.k.d<Integer, com.parizene.netmonitor.db.celllog.i.d>> sparseArray) {
        int size = sparseArray.size();
        int i3 = 1;
        if (size <= 0) {
            return new int[]{0};
        }
        int[] iArr = new int[size];
        for (int i4 = 0; i4 < size; i4++) {
            if (i2 == sparseArray.keyAt(i4)) {
                iArr[0] = i4;
                for (int i5 = 0; i5 < size; i5++) {
                    if (i4 != i5) {
                        iArr[i3] = i5;
                        i3++;
                    }
                }
                return iArr;
            }
        }
        return iArr;
    }

    static /* synthetic */ int I(com.parizene.netmonitor.ui.cell.o.b bVar, com.parizene.netmonitor.ui.cell.o.b bVar2) {
        return bVar2.f13819b.f13304c.a - bVar.f13819b.f13304c.a;
    }

    /* renamed from: J */
    public /* synthetic */ void K(List list) {
        this.f13803f.d(list);
    }

    private com.parizene.netmonitor.ui.cell.o.b o(com.parizene.netmonitor.db.celllog.i.c cVar) {
        if (cVar instanceof com.parizene.netmonitor.db.celllog.i.a) {
            return new com.parizene.netmonitor.ui.cell.o.a(cVar.s(), (com.parizene.netmonitor.m0.b0.l) cVar.f13101c, cVar.o());
        }
        if (cVar instanceof com.parizene.netmonitor.db.celllog.i.k) {
            return new com.parizene.netmonitor.ui.cell.o.c(cVar.s(), (com.parizene.netmonitor.m0.b0.m) cVar.f13101c, cVar.o());
        }
        if (cVar instanceof com.parizene.netmonitor.db.celllog.i.m) {
            return new com.parizene.netmonitor.ui.cell.o.e(cVar.s(), (n) cVar.f13101c, cVar.o());
        }
        if (cVar instanceof q) {
            return new com.parizene.netmonitor.ui.cell.o.k(cVar.s(), (com.parizene.netmonitor.m0.b0.q) cVar.f13101c, cVar.o());
        }
        if (cVar instanceof p) {
            return new com.parizene.netmonitor.ui.cell.o.j(cVar.s(), (com.parizene.netmonitor.m0.b0.p) cVar.f13101c, cVar.o());
        }
        if (cVar instanceof com.parizene.netmonitor.db.celllog.i.n) {
            return new com.parizene.netmonitor.ui.cell.o.g(cVar.s(), (o) cVar.f13101c, cVar.o());
        }
        return null;
    }

    private List<Object> s(int i2, SparseArray<c.h.k.d<Integer, com.parizene.netmonitor.db.celllog.i.d>> sparseArray, boolean z, boolean z2) {
        com.parizene.netmonitor.ui.cell.o.b bVarO;
        int[] iArrH = H(i2, sparseArray);
        boolean zBooleanValue = com.parizene.netmonitor.t0.f.f13721f.g().booleanValue();
        boolean zBooleanValue2 = com.parizene.netmonitor.t0.f.f13722g.g().booleanValue();
        ArrayList arrayList = new ArrayList();
        for (int i3 : iArrH) {
            int iKeyAt = sparseArray.keyAt(i3);
            int iIntValue = sparseArray.valueAt(i3).a.intValue();
            com.parizene.netmonitor.db.celllog.i.d dVar = sparseArray.valueAt(i3).f3105b;
            arrayList.add(new com.parizene.netmonitor.ui.cell.o.f(dVar.c()));
            com.parizene.netmonitor.db.celllog.i.c cVarA = dVar.a();
            h.a aVar = null;
            com.parizene.netmonitor.ui.cell.o.b bVarO2 = (cVarA == null || !cVarA.b()) ? null : o(cVarA);
            if (z && (iIntValue & 4) > 0) {
                if (cVarA != null && cVarA.f13101c.f13304c.a()) {
                    aVar = new h.a(cVarA.f13101c.f13304c.a);
                }
                this.f13807j.put(iKeyAt, aVar);
            }
            if (zBooleanValue) {
                com.parizene.netmonitor.ui.cell.o.h hVar = this.f13806i.get(iKeyAt);
                if (hVar == null) {
                    hVar = new com.parizene.netmonitor.ui.cell.o.h();
                    this.f13806i.put(iKeyAt, hVar);
                }
                hVar.a(this.f13807j.get(iKeyAt));
                if (bVarO2 != null) {
                    arrayList.add(new com.parizene.netmonitor.ui.cell.o.i(hVar));
                }
            }
            if (bVarO2 != null) {
                arrayList.add(bVarO2);
            }
            if (zBooleanValue2) {
                ArrayList arrayList2 = new ArrayList();
                for (com.parizene.netmonitor.db.celllog.i.c cVar : dVar.b()) {
                    if (cVar.b() && (bVarO = o(cVar)) != null) {
                        arrayList2.add(bVarO);
                    }
                }
                Collections.sort(arrayList2, d.f13784e);
                arrayList.addAll(arrayList2);
            }
        }
        if (z2) {
            arrayList.add(0, new com.parizene.netmonitor.ui.cell.o.d());
        }
        return arrayList;
    }

    @Override // com.parizene.netmonitor.ui.o0
    /* renamed from: G */
    public void D(m mVar, Bundle bundle) {
        m.a.a.a("createView", new Object[0]);
        this.f13803f = mVar;
        if (com.parizene.netmonitor.t0.f.f13725j.g().booleanValue()) {
            this.f13803f.J();
        }
        this.f13803f.c0(F());
    }

    @Override // com.parizene.netmonitor.ui.cell.i
    public void a() {
        m.a.a.a("startUpdates", new Object[0]);
        if (this.n) {
            return;
        }
        this.n = true;
        this.f13803f.W(F(), false);
        this.f13810m.post(this);
    }

    @Override // com.parizene.netmonitor.ui.cell.i
    public void b() {
        m.a.a.a("stopUpdates", new Object[0]);
        if (this.n) {
            this.f13810m.removeCallbacks(this);
            this.n = false;
        }
    }

    @Override // com.parizene.netmonitor.ui.cell.i
    public void c() {
        m.a.a.a("handleCreateOptionsMenu", new Object[0]);
        this.f13803f.E(new h(com.parizene.netmonitor.t0.f.f13721f.g().booleanValue(), com.parizene.netmonitor.t0.f.f13722g.g().booleanValue()));
    }

    @Override // com.parizene.netmonitor.ui.cell.i
    public void d() {
        this.f13803f.h();
    }

    @Override // com.parizene.netmonitor.ui.cell.i
    public void f() {
        this.f13803f.a0();
    }

    @Override // com.parizene.netmonitor.ui.cell.i
    public void h() {
        com.parizene.netmonitor.t0.f.f13725j.f(Boolean.FALSE);
        this.f13803f.n();
    }

    @Override // com.parizene.netmonitor.ui.cell.i
    public void m() {
        com.parizene.netmonitor.t0.b bVar = com.parizene.netmonitor.t0.f.f13721f;
        boolean z = !bVar.g().booleanValue();
        bVar.f(Boolean.valueOf(z));
        this.f13803f.E(new h(z, com.parizene.netmonitor.t0.f.f13722g.g().booleanValue()));
        this.f13804g.a(d.a.c(z));
        if (z) {
            return;
        }
        this.f13806i.clear();
    }

    @Override // java.lang.Runnable
    public void run() {
        com.parizene.netmonitor.l0.a aVar = (com.parizene.netmonitor.l0.a) this.f13805h.f(com.parizene.netmonitor.l0.a.class);
        boolean z = !j0.c(this.f13808k, aVar);
        this.f13808k = aVar;
        if (aVar != null) {
            final List<Object> listS = s(aVar.b(), this.f13808k.a(), z, this.f13808k.c());
            this.f13809l.post(new Runnable() { // from class: com.parizene.netmonitor.ui.cell.c
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13782e.K(listS);
                }
            });
        }
        this.f13810m.postDelayed(this, 1000L);
    }

    @Override // com.parizene.netmonitor.ui.o0
    public void u() {
        m.a.a.a("detachView", new Object[0]);
        this.f13803f = f13802e;
    }

    @Override // com.parizene.netmonitor.ui.cell.i
    public void w() {
        com.parizene.netmonitor.t0.b bVar = com.parizene.netmonitor.t0.f.f13722g;
        boolean z = !bVar.g().booleanValue();
        bVar.f(Boolean.valueOf(z));
        this.f13803f.E(new h(com.parizene.netmonitor.t0.f.f13721f.g().booleanValue(), z));
        this.f13804g.a(d.a.b(z));
    }
}