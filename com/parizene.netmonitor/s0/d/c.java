package com.parizene.netmonitor.s0.d;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.provider.Settings;
import com.parizene.netmonitor.s0.b;
import java.util.concurrent.TimeUnit;

/* compiled from: LocationHelper.java */
/* loaded from: classes3.dex */
public class c extends com.parizene.netmonitor.s0.b<d> {

    /* renamed from: e, reason: collision with root package name */
    private static final long f13691e = TimeUnit.SECONDS.toMillis(5);

    /* renamed from: f, reason: collision with root package name */
    private final Context f13692f;

    /* renamed from: g, reason: collision with root package name */
    private final LocationManager f13693g;

    /* renamed from: h, reason: collision with root package name */
    private long f13694h;

    /* renamed from: i, reason: collision with root package name */
    private float f13695i;

    /* renamed from: j, reason: collision with root package name */
    private LocationListener f13696j;

    /* compiled from: LocationHelper.java */
    class a implements LocationListener {
        a() {
        }

        @Override // android.location.LocationListener
        public void onLocationChanged(Location location) {
            m.a.a.a("location=%s", location);
            c.this.t(location);
        }

        @Override // android.location.LocationListener
        public void onProviderDisabled(String str) {
            m.a.a.a("provider=%s", str);
            c.this.u(str, false);
        }

        @Override // android.location.LocationListener
        public void onProviderEnabled(String str) {
            m.a.a.a("provider=%s", str);
            c.this.u(str, true);
        }

        @Override // android.location.LocationListener
        public void onStatusChanged(String str, int i2, Bundle bundle) {
            m.a.a.a("provider=%s, status=%d", str, Integer.valueOf(i2));
        }
    }

    public c(Context context, LocationManager locationManager, Handler handler, Handler handler2) {
        super(handler, handler2);
        this.f13694h = f13691e;
        this.f13695i = 5.0f;
        this.f13696j = new a();
        this.f13692f = context;
        this.f13693g = locationManager;
    }

    public static Intent n() {
        return new Intent("android.settings.LOCATION_SOURCE_SETTINGS");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void t(final Location location) {
        e(new b.a() { // from class: com.parizene.netmonitor.s0.d.a
            @Override // com.parizene.netmonitor.s0.b.a
            public final void a(Object obj) {
                ((d) obj).onLocationChanged(location);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void u(final String str, final boolean z) {
        e(new b.a() { // from class: com.parizene.netmonitor.s0.d.b
            @Override // com.parizene.netmonitor.s0.b.a
            public final void a(Object obj) {
                ((d) obj).a(str, z);
            }
        });
    }

    @Override // com.parizene.netmonitor.s0.b
    @SuppressLint({"MissingPermission"})
    protected void g() {
        if (p("gps")) {
            this.f13693g.requestLocationUpdates("gps", this.f13694h, this.f13695i, this.f13696j);
        }
        if (p("network")) {
            this.f13693g.requestLocationUpdates("network", this.f13694h, this.f13695i, this.f13696j);
        }
    }

    @Override // com.parizene.netmonitor.s0.b
    protected void h() {
        this.f13693g.removeUpdates(this.f13696j);
    }

    public f o() {
        if (Build.VERSION.SDK_INT >= 28) {
            return this.f13693g.isLocationEnabled() ? f.ON : f.OFF;
        }
        try {
            return Settings.Secure.getInt(this.f13692f.getContentResolver(), "location_mode") == 0 ? f.OFF : f.ON;
        } catch (Settings.SettingNotFoundException e2) {
            m.a.a.g(e2);
            return f.UNKNOWN;
        }
    }

    public boolean p(String str) {
        return this.f13693g.getAllProviders().contains(str);
    }

    public boolean q(String str) {
        return this.f13693g.isProviderEnabled(str);
    }

    public void v(long j2, float f2) {
        this.f13694h = j2;
        this.f13695i = f2;
        if (b()) {
            h();
            g();
        }
    }
}