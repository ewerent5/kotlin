package com.parizene.netmonitor.ui.map;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.location.Location;
import com.google.android.gms.maps.c;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;

/* compiled from: GoogleMaps.java */
/* loaded from: classes3.dex */
public class t implements a0<w> {
    private com.google.android.gms.maps.c a;

    /* renamed from: b, reason: collision with root package name */
    private com.google.android.gms.maps.model.c f13988b;

    public t(com.google.android.gms.maps.c cVar) {
        this.a = cVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: d, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ boolean j(com.google.android.gms.maps.model.e eVar) {
        if (((Integer) eVar.c()) == null) {
            return false;
        }
        this.f13988b = this.a.a(new com.google.android.gms.maps.model.d().c(eVar.a()).U(r0.intValue()).V(Color.parseColor("#66000000")).I(Color.parseColor("#1a000000")));
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: k, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void l(com.google.android.gms.maps.model.e eVar) {
        com.google.android.gms.maps.model.c cVar = this.f13988b;
        if (cVar != null) {
            cVar.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: m, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void n(Location location) {
        this.a.l(null);
        e(new g0(location));
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public g0 A() {
        Location locationD = this.a.d();
        if (locationD != null) {
            return new g0(locationD);
        }
        return null;
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public h0 L() {
        return new h0(this.a.e().a().f10721i);
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public w h(String str, String str2, g0 g0Var, Bitmap bitmap, int i2) {
        com.google.android.gms.maps.model.e eVarB = this.a.b(new com.google.android.gms.maps.model.f().S(com.google.android.gms.maps.model.b.a(bitmap)).Y(g0Var.d()).c0(str).b0(str2));
        eVarB.f(0.5f, 0.45f);
        eVarB.j(i2 != 0 ? Integer.valueOf(i2) : null);
        return new w(eVarB);
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void c(g0 g0Var) {
        this.a.c(com.google.android.gms.maps.b.a(g0Var.d()));
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void destroy() {
        this.a.i(null);
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void e(g0 g0Var) {
        this.a.c(com.google.android.gms.maps.b.b(g0Var.d(), 15.0f));
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void f(final y yVar) {
        this.a.f().b(true);
        this.a.f().a(false);
        com.google.android.gms.maps.c cVar = this.a;
        Objects.requireNonNull(yVar);
        cVar.i(new c.a() { // from class: com.parizene.netmonitor.ui.map.a
            @Override // com.google.android.gms.maps.c.a
            public final void a() {
                yVar.a();
            }
        });
        this.a.k(new c.InterfaceC0114c() { // from class: com.parizene.netmonitor.ui.map.e
            @Override // com.google.android.gms.maps.c.InterfaceC0114c
            public final boolean a(com.google.android.gms.maps.model.e eVar) {
                return this.a.j(eVar);
            }
        });
        this.a.j(new c.b() { // from class: com.parizene.netmonitor.ui.map.c
            @Override // com.google.android.gms.maps.c.b
            public final void a(com.google.android.gms.maps.model.e eVar) {
                this.a.l(eVar);
            }
        });
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void g(List<w> list) {
        Iterator<w> it = list.iterator();
        while (it.hasNext()) {
            it.next().b();
        }
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void i(s sVar, s sVar2, long j2, int i2, boolean z, f0 f0Var, g0 g0Var) {
        w wVar = (w) sVar.f13981c;
        if (com.parizene.netmonitor.t.a(j2, 0)) {
            int i3 = sVar2.f13980b;
            sVar.f13980b = i3;
            f0Var.g(i3);
            wVar.c(com.google.android.gms.maps.model.b.a(f0Var.f(sVar.e(i2, z))));
        }
        if (com.parizene.netmonitor.t.a(j2, 1)) {
            wVar.d(sVar2.f().d());
        }
        if (com.parizene.netmonitor.t.a(j2, 2)) {
            wVar.g(sVar2.i(g0Var, i2, z));
        }
        if (com.parizene.netmonitor.t.a(j2, 3)) {
            wVar.e(sVar2.h());
        }
        int iB = sVar2.b();
        wVar.f(iB != 0 ? Integer.valueOf(iB) : null);
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    /* renamed from: o, reason: merged with bridge method [inline-methods] */
    public void b(w wVar) {
        wVar.b();
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void s(int i2) {
        this.a.g(i2);
    }

    @Override // com.parizene.netmonitor.ui.map.a0
    public void y(boolean z) {
        this.a.h(z);
        if (z) {
            this.a.l(new c.d() { // from class: com.parizene.netmonitor.ui.map.d
                @Override // com.google.android.gms.maps.c.d
                public final void a(Location location) {
                    this.a.n(location);
                }
            });
        }
    }
}