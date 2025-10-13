package com.parizene.netmonitor.ui.map;

import android.content.Context;
import android.os.Bundle;
import android.view.ViewGroup;

/* compiled from: GoogleMapsView.java */
/* loaded from: classes3.dex */
public class x implements e0 {
    private Context a;

    /* renamed from: b */
    private com.google.android.gms.maps.d f13991b;

    public x(Context context) {
        this.a = context;
        this.f13991b = new com.google.android.gms.maps.d(context);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public /* synthetic */ void f() {
        d0.a(this);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public /* synthetic */ void g() {
        d0.j(this);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public void h() {
        this.f13991b.h();
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public void i(final c0 c0Var) {
        this.f13991b.a(new com.google.android.gms.maps.f() { // from class: com.parizene.netmonitor.ui.map.f
            @Override // com.google.android.gms.maps.f
            public final void a(com.google.android.gms.maps.c cVar) {
                c0Var.v(new t(cVar));
            }
        });
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public void j(ViewGroup viewGroup) {
        viewGroup.removeView(this.f13991b);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public void k(ViewGroup viewGroup, ViewGroup.LayoutParams layoutParams) {
        viewGroup.addView(this.f13991b, layoutParams);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public void l() {
        this.f13991b.i();
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public void onDestroy() {
        this.f13991b.c();
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public void onLowMemory() {
        this.f13991b.d();
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public void onPause() {
        this.f13991b.e();
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public void onResume() {
        this.f13991b.f();
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public void r(Bundle bundle) {
        this.f13991b.g(bundle);
    }

    @Override // com.parizene.netmonitor.ui.map.e0
    public void z(Bundle bundle) {
        com.google.android.gms.maps.e.a(this.a);
        this.f13991b.b(bundle);
    }
}