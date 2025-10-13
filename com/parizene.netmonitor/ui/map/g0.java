package com.parizene.netmonitor.ui.map;

import android.location.Location;
import ch.qos.logback.core.CoreConstants;
import com.google.android.gms.maps.model.LatLng;

/* compiled from: LatLngPoint.java */
/* loaded from: classes3.dex */
public class g0 {
    public int a;

    /* renamed from: b, reason: collision with root package name */
    public int f13943b;

    public g0(Location location) {
        this((int) (location.getLatitude() * 1000000.0d), (int) (location.getLongitude() * 1000000.0d));
    }

    public double a() {
        return this.a / 1000000.0d;
    }

    public double b() {
        return this.f13943b / 1000000.0d;
    }

    public k.c.f.e c() {
        return new k.c.f.e(a(), b());
    }

    public LatLng d() {
        return new LatLng(a(), b());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || g0.class != obj.getClass()) {
            return false;
        }
        g0 g0Var = (g0) obj;
        return this.a == g0Var.a && this.f13943b == g0Var.f13943b;
    }

    public int hashCode() {
        return (this.a * 31) + this.f13943b;
    }

    public String toString() {
        return "LatLngPoint{latitude=" + this.a + ", longitude=" + this.f13943b + CoreConstants.CURLY_RIGHT;
    }

    public g0(LatLng latLng) {
        this((int) (latLng.f10692e * 1000000.0d), (int) (latLng.f10693f * 1000000.0d));
    }

    public g0(k.c.f.e eVar) {
        this((int) (eVar.b() * 1000000.0d), (int) (eVar.a() * 1000000.0d));
    }

    public g0(int i2, int i3) {
        this.a = i2;
        this.f13943b = i3;
    }
}