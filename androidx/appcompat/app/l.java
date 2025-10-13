package androidx.appcompat.app;

import android.annotation.SuppressLint;
import android.content.Context;
import android.location.Location;
import android.location.LocationManager;
import android.util.Log;
import ch.qos.logback.classic.turbo.ReconfigureOnChangeFilter;
import java.util.Calendar;

/* compiled from: TwilightManager.java */
/* loaded from: classes.dex */
class l {
    private static l a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f139b;

    /* renamed from: c, reason: collision with root package name */
    private final LocationManager f140c;

    /* renamed from: d, reason: collision with root package name */
    private final a f141d = new a();

    /* compiled from: TwilightManager.java */
    private static class a {
        boolean a;

        /* renamed from: b, reason: collision with root package name */
        long f142b;

        /* renamed from: c, reason: collision with root package name */
        long f143c;

        /* renamed from: d, reason: collision with root package name */
        long f144d;

        /* renamed from: e, reason: collision with root package name */
        long f145e;

        /* renamed from: f, reason: collision with root package name */
        long f146f;

        a() {
        }
    }

    l(Context context, LocationManager locationManager) {
        this.f139b = context;
        this.f140c = locationManager;
    }

    static l a(Context context) {
        if (a == null) {
            Context applicationContext = context.getApplicationContext();
            a = new l(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
        }
        return a;
    }

    @SuppressLint({"MissingPermission"})
    private Location b() {
        Location locationC = androidx.core.content.b.b(this.f139b, "android.permission.ACCESS_COARSE_LOCATION") == 0 ? c("network") : null;
        Location locationC2 = androidx.core.content.b.b(this.f139b, "android.permission.ACCESS_FINE_LOCATION") == 0 ? c("gps") : null;
        return (locationC2 == null || locationC == null) ? locationC2 != null ? locationC2 : locationC : locationC2.getTime() > locationC.getTime() ? locationC2 : locationC;
    }

    private Location c(String str) {
        try {
            if (this.f140c.isProviderEnabled(str)) {
                return this.f140c.getLastKnownLocation(str);
            }
            return null;
        } catch (Exception e2) {
            Log.d("TwilightManager", "Failed to get last known location", e2);
            return null;
        }
    }

    private boolean e() {
        return this.f141d.f146f > System.currentTimeMillis();
    }

    private void f(Location location) {
        long j2;
        a aVar = this.f141d;
        long jCurrentTimeMillis = System.currentTimeMillis();
        k kVarB = k.b();
        kVarB.a(jCurrentTimeMillis - 86400000, location.getLatitude(), location.getLongitude());
        long j3 = kVarB.f136b;
        kVarB.a(jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        boolean z = kVarB.f138d == 1;
        long j4 = kVarB.f137c;
        long j5 = kVarB.f136b;
        boolean z2 = z;
        kVarB.a(86400000 + jCurrentTimeMillis, location.getLatitude(), location.getLongitude());
        long j6 = kVarB.f137c;
        if (j4 == -1 || j5 == -1) {
            j2 = 43200000 + jCurrentTimeMillis;
        } else {
            j2 = (jCurrentTimeMillis > j5 ? 0 + j6 : jCurrentTimeMillis > j4 ? 0 + j5 : 0 + j4) + ReconfigureOnChangeFilter.DEFAULT_REFRESH_PERIOD;
        }
        aVar.a = z2;
        aVar.f142b = j3;
        aVar.f143c = j4;
        aVar.f144d = j5;
        aVar.f145e = j6;
        aVar.f146f = j2;
    }

    boolean d() {
        a aVar = this.f141d;
        if (e()) {
            return aVar.a;
        }
        Location locationB = b();
        if (locationB != null) {
            f(locationB);
            return aVar.a;
        }
        Log.i("TwilightManager", "Could not get last known location. This is probably because the app does not have any location permissions. Falling back to hardcoded sunrise/sunset values.");
        int i2 = Calendar.getInstance().get(11);
        return i2 < 6 || i2 >= 22;
    }
}