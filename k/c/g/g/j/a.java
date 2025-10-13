package k.c.g.g.j;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationListener;
import android.location.LocationManager;
import android.os.Bundle;
import android.util.Log;
import java.util.HashSet;
import java.util.Set;
import k.c.f.p;

/* compiled from: GpsMyLocationProvider.java */
/* loaded from: classes3.dex */
public class a implements c, LocationListener {
    private LocationManager a;

    /* renamed from: b, reason: collision with root package name */
    private Location f16908b;

    /* renamed from: c, reason: collision with root package name */
    private b f16909c;

    /* renamed from: d, reason: collision with root package name */
    private long f16910d = 0;

    /* renamed from: e, reason: collision with root package name */
    private float f16911e = 0.0f;

    /* renamed from: f, reason: collision with root package name */
    private p f16912f = new p();

    /* renamed from: g, reason: collision with root package name */
    private final Set<String> f16913g;

    public a(Context context) {
        HashSet hashSet = new HashSet();
        this.f16913g = hashSet;
        this.a = (LocationManager) context.getSystemService("location");
        hashSet.add("gps");
        hashSet.add("network");
    }

    @Override // k.c.g.g.j.c
    public Location a() {
        return this.f16908b;
    }

    @Override // k.c.g.g.j.c
    @SuppressLint({"MissingPermission"})
    public void b() {
        this.f16909c = null;
        LocationManager locationManager = this.a;
        if (locationManager != null) {
            try {
                locationManager.removeUpdates(this);
            } catch (Throwable th) {
                Log.w("OsmDroid", "Unable to deattach location listener", th);
            }
        }
    }

    @Override // k.c.g.g.j.c
    @SuppressLint({"MissingPermission"})
    public boolean c(b bVar) {
        this.f16909c = bVar;
        boolean z = false;
        for (String str : this.a.getProviders(true)) {
            if (this.f16913g.contains(str)) {
                try {
                    this.a.requestLocationUpdates(str, this.f16910d, this.f16911e, this);
                    z = true;
                } catch (Throwable th) {
                    Log.e("OsmDroid", "Unable to attach listener for location provider " + str + " check permissions?", th);
                }
            }
        }
        return z;
    }

    @Override // k.c.g.g.j.c
    public void destroy() {
        b();
        this.f16908b = null;
        this.a = null;
        this.f16909c = null;
        this.f16912f = null;
    }

    @Override // android.location.LocationListener
    public void onLocationChanged(Location location) {
        if (this.f16912f == null) {
            Log.w("OsmDroid", "GpsMyLocation provider, mIgnore is null, unexpected. Location update will be ignored");
            return;
        }
        if (location == null || location.getProvider() == null || this.f16912f.a(location.getProvider(), System.currentTimeMillis())) {
            return;
        }
        this.f16908b = location;
        b bVar = this.f16909c;
        if (bVar == null || location == null) {
            return;
        }
        bVar.a(location, this);
    }

    @Override // android.location.LocationListener
    public void onProviderDisabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onProviderEnabled(String str) {
    }

    @Override // android.location.LocationListener
    public void onStatusChanged(String str, int i2, Bundle bundle) {
    }
}