package com.parizene.netmonitor.ui.map;

import com.google.android.gms.maps.model.LatLng;

/* compiled from: GoogleMapsMarker.java */
/* loaded from: classes3.dex */
public class w implements b0 {
    private com.google.android.gms.maps.model.e a;

    public w(com.google.android.gms.maps.model.e eVar) {
        this.a = eVar;
    }

    @Override // com.parizene.netmonitor.ui.map.b0
    public String a() {
        return this.a.b();
    }

    public void b() {
        this.a.e();
    }

    public void c(com.google.android.gms.maps.model.a aVar) {
        this.a.g(aVar);
    }

    public void d(LatLng latLng) {
        this.a.h(latLng);
    }

    public void e(String str) {
        this.a.i(str);
    }

    public void f(Object obj) {
        this.a.j(obj);
    }

    public void g(String str) {
        this.a.k(str);
    }

    @Override // com.parizene.netmonitor.ui.map.b0
    public g0 getPosition() {
        return new g0(this.a.a());
    }

    @Override // com.parizene.netmonitor.ui.map.b0
    public String getTitle() {
        return this.a.d();
    }
}