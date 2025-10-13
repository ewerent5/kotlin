package com.parizene.netmonitor.ui.log;

import android.content.Context;
import android.view.LayoutInflater;
import androidx.recyclerview.widget.h;
import com.parizene.netmonitor.ui.i1;

/* compiled from: LogAdapter.java */
/* loaded from: classes3.dex */
class e extends i1<g, LogItemViewHolder> {

    /* renamed from: h */
    private final h f13873h;

    /* compiled from: LogAdapter.java */
    class a extends h.d<g> {
        a() {
        }

        @Override // androidx.recyclerview.widget.h.d
        /* renamed from: d */
        public boolean a(g gVar, g gVar2) {
            return gVar.equals(gVar2);
        }

        @Override // androidx.recyclerview.widget.h.d
        /* renamed from: e */
        public boolean b(g gVar, g gVar2) {
            return gVar.c() == gVar2.c();
        }
    }

    e(Context context, LayoutInflater layoutInflater, i iVar, q qVar, f.a<com.parizene.netmonitor.m0.z.b> aVar) {
        super(layoutInflater, new a());
        h hVar = new h(context, iVar, qVar, aVar);
        this.f13873h = hVar;
        E(g.class, hVar);
    }

    void F(q qVar) {
        this.f13873h.f(qVar);
        j();
    }
}