package com.parizene.netmonitor.ui.wifi;

import android.net.wifi.ScanResult;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/* compiled from: WifiPresenterImpl.java */
/* loaded from: classes3.dex */
class h implements g, com.parizene.netmonitor.s0.e.d {

    /* renamed from: e, reason: collision with root package name */
    private static final j f14053e = new a();

    /* renamed from: g, reason: collision with root package name */
    private com.parizene.netmonitor.s0.e.c f14055g;

    /* renamed from: h, reason: collision with root package name */
    private com.parizene.netmonitor.s0.d.c f14056h;

    /* renamed from: i, reason: collision with root package name */
    private Handler f14057i;

    /* renamed from: j, reason: collision with root package name */
    private boolean f14058j;

    /* renamed from: f, reason: collision with root package name */
    private j f14054f = f14053e;

    /* renamed from: k, reason: collision with root package name */
    private Comparator<e> f14059k = b.f14048e;

    /* compiled from: WifiPresenterImpl.java */
    class a implements j {
        a() {
        }

        @Override // com.parizene.netmonitor.ui.wifi.j
        public /* synthetic */ void d(List list) {
            i.c(this, list);
        }

        @Override // com.parizene.netmonitor.ui.wifi.j
        public /* synthetic */ void h() {
            i.b(this);
        }

        @Override // com.parizene.netmonitor.ui.wifi.j
        public /* synthetic */ void u(List list) {
            i.a(this, list);
        }
    }

    h(com.parizene.netmonitor.s0.e.c cVar, com.parizene.netmonitor.s0.d.c cVar2, Handler handler) {
        this.f14055g = cVar;
        this.f14056h = cVar2;
        this.f14057i = handler;
    }

    static /* synthetic */ int G(e eVar, e eVar2) {
        return eVar2.f14052e - eVar.f14052e;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: H, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void I(List list) {
        this.f14054f.d(list);
    }

    private List<Object> J(List<ScanResult> list) {
        ArrayList arrayList;
        if (list == null || list.isEmpty()) {
            arrayList = null;
        } else {
            ArrayList arrayList2 = new ArrayList();
            Iterator<ScanResult> it = list.iterator();
            while (it.hasNext()) {
                arrayList2.add(new e(it.next()));
            }
            Collections.sort(arrayList2, this.f14059k);
            arrayList = new ArrayList(arrayList2);
        }
        if (Build.VERSION.SDK_INT >= 28 && com.parizene.netmonitor.s0.d.f.OFF == this.f14056h.o()) {
            if (arrayList == null) {
                arrayList = new ArrayList();
            }
            arrayList.add(0, new com.parizene.netmonitor.ui.cell.o.d());
        }
        return arrayList;
    }

    private void K(final List<Object> list) {
        m.a.a.f("updateItems %s", list);
        this.f14057i.post(new Runnable() { // from class: com.parizene.netmonitor.ui.wifi.a
            @Override // java.lang.Runnable
            public final void run() {
                this.f14046e.I(list);
            }
        });
    }

    @Override // com.parizene.netmonitor.ui.o0
    /* renamed from: F, reason: merged with bridge method [inline-methods] */
    public void D(j jVar, Bundle bundle) {
        m.a.a.a("createView", new Object[0]);
        this.f14054f = jVar;
        this.f14054f.u(J(this.f14055g.s()));
    }

    @Override // com.parizene.netmonitor.ui.wifi.g
    public void a() {
        m.a.a.a("startUpdates", new Object[0]);
        if (this.f14058j) {
            return;
        }
        this.f14058j = true;
        this.f14055g.a(this);
        this.f14055g.j();
    }

    @Override // com.parizene.netmonitor.ui.wifi.g
    public void b() {
        m.a.a.a("stopUpdates", new Object[0]);
        if (this.f14058j) {
            this.f14055g.i(this);
            this.f14055g.k();
            this.f14058j = false;
        }
    }

    @Override // com.parizene.netmonitor.ui.wifi.g
    public void d() {
        this.f14054f.h();
    }

    @Override // com.parizene.netmonitor.s0.e.d
    public void o(List<ScanResult> list) {
        K(J(list));
    }

    @Override // com.parizene.netmonitor.s0.e.d
    public void s(int i2) {
        if (i2 == 0) {
            K(null);
        }
    }

    @Override // com.parizene.netmonitor.ui.o0
    public void t(Bundle bundle) {
    }

    @Override // com.parizene.netmonitor.ui.o0
    public void u() {
        m.a.a.a("destroyView", new Object[0]);
        this.f14054f = f14053e;
    }
}