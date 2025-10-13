package com.parizene.netmonitor.ui.cell;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.h;
import com.parizene.netmonitor.ui.cell.n.e;
import com.parizene.netmonitor.ui.i1;

/* compiled from: CellAdapter.java */
/* loaded from: classes3.dex */
class e extends i1<Object, RecyclerView.d0> {

    /* renamed from: h, reason: collision with root package name */
    private com.parizene.netmonitor.ui.cell.n.b f13785h;

    /* renamed from: i, reason: collision with root package name */
    private com.parizene.netmonitor.ui.cell.n.d f13786i;

    /* renamed from: j, reason: collision with root package name */
    private com.parizene.netmonitor.ui.cell.n.f f13787j;

    /* renamed from: k, reason: collision with root package name */
    private com.parizene.netmonitor.ui.cell.n.k f13788k;

    /* renamed from: l, reason: collision with root package name */
    private com.parizene.netmonitor.ui.cell.n.j f13789l;

    /* renamed from: m, reason: collision with root package name */
    private com.parizene.netmonitor.ui.cell.n.h f13790m;

    /* compiled from: CellAdapter.java */
    class a extends h.d<Object> {
        a() {
        }

        @Override // androidx.recyclerview.widget.h.d
        public boolean a(Object obj, Object obj2) {
            if (obj.getClass() == obj2.getClass() && obj.getClass() == com.parizene.netmonitor.ui.cell.o.i.class) {
                return false;
            }
            return obj.equals(obj2);
        }

        @Override // androidx.recyclerview.widget.h.d
        public boolean b(Object obj, Object obj2) {
            return true;
        }
    }

    e(Context context, LayoutInflater layoutInflater, k kVar, com.parizene.netmonitor.m0.z.b bVar, e.a aVar) {
        super(layoutInflater, new a());
        this.f13785h = new com.parizene.netmonitor.ui.cell.n.b(kVar);
        this.f13786i = new com.parizene.netmonitor.ui.cell.n.d(kVar, bVar);
        this.f13787j = new com.parizene.netmonitor.ui.cell.n.f(kVar, bVar);
        this.f13788k = new com.parizene.netmonitor.ui.cell.n.k(kVar, bVar);
        this.f13789l = new com.parizene.netmonitor.ui.cell.n.j(kVar);
        this.f13790m = new com.parizene.netmonitor.ui.cell.n.h(kVar, bVar);
        E(com.parizene.netmonitor.ui.cell.o.d.class, new com.parizene.netmonitor.ui.cell.n.e(aVar));
        E(com.parizene.netmonitor.ui.cell.o.f.class, new com.parizene.netmonitor.ui.cell.n.g(context));
        E(com.parizene.netmonitor.ui.cell.o.i.class, new com.parizene.netmonitor.ui.cell.n.i(context));
        E(com.parizene.netmonitor.ui.cell.o.a.class, this.f13785h);
        E(com.parizene.netmonitor.ui.cell.o.c.class, this.f13786i);
        E(com.parizene.netmonitor.ui.cell.o.e.class, this.f13787j);
        E(com.parizene.netmonitor.ui.cell.o.k.class, this.f13788k);
        E(com.parizene.netmonitor.ui.cell.o.j.class, this.f13789l);
        E(com.parizene.netmonitor.ui.cell.o.g.class, this.f13790m);
    }

    boolean F(int i2) {
        int i3 = i2 + 1;
        if (i3 >= e()) {
            return false;
        }
        Object objB = B(i2);
        Object objB2 = B(i3);
        boolean z = objB instanceof com.parizene.netmonitor.ui.cell.o.f;
        if (z && (objB2 instanceof com.parizene.netmonitor.ui.cell.o.i)) {
            return true;
        }
        if ((z || (objB instanceof com.parizene.netmonitor.ui.cell.o.i)) && (objB2 instanceof com.parizene.netmonitor.ui.cell.o.b)) {
            return ((com.parizene.netmonitor.ui.cell.o.b) objB2).a;
        }
        return false;
    }

    void G(k kVar, boolean z) {
        this.f13785h.f(kVar);
        this.f13786i.f(kVar);
        this.f13787j.f(kVar);
        this.f13788k.f(kVar);
        this.f13789l.f(kVar);
        this.f13790m.f(kVar);
        if (z) {
            j();
        }
    }
}