package com.parizene.netmonitor.ui.map;

import com.google.android.gms.maps.model.LatLngBounds;

/* compiled from: LatLngRect.java */
/* loaded from: classes3.dex */
public class h0 {
    private g0 a;

    /* renamed from: b, reason: collision with root package name */
    private g0 f13945b;

    public h0(LatLngBounds latLngBounds) {
        this.a = new g0(latLngBounds.f10694e);
        this.f13945b = new g0(latLngBounds.f10695f);
    }

    public g0 a() {
        return this.f13945b;
    }

    public g0 b() {
        return this.a;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || h0.class != obj.getClass()) {
            return false;
        }
        h0 h0Var = (h0) obj;
        g0 g0Var = this.a;
        if (g0Var == null ? h0Var.a != null : !g0Var.equals(h0Var.a)) {
            return false;
        }
        g0 g0Var2 = this.f13945b;
        g0 g0Var3 = h0Var.f13945b;
        return g0Var2 != null ? g0Var2.equals(g0Var3) : g0Var3 == null;
    }

    public int hashCode() {
        g0 g0Var = this.a;
        int iHashCode = (g0Var != null ? g0Var.hashCode() : 0) * 31;
        g0 g0Var2 = this.f13945b;
        return iHashCode + (g0Var2 != null ? g0Var2.hashCode() : 0);
    }

    public h0(k.c.f.a aVar) {
        this.a = new g0((int) (aVar.i() * 1000000.0d), (int) (aVar.s() * 1000000.0d));
        this.f13945b = new g0((int) (aVar.g() * 1000000.0d), (int) (aVar.q() * 1000000.0d));
    }
}