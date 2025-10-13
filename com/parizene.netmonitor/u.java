package com.parizene.netmonitor;

import android.content.Context;
import android.content.SharedPreferences;
import android.location.Address;
import android.location.Geocoder;
import android.os.Handler;
import android.text.TextUtils;
import com.parizene.netmonitor.db.AppDatabase;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;

/* compiled from: GeolocationUpdater.java */
/* loaded from: classes.dex */
public class u {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final AppDatabase f13729b;

    /* renamed from: c, reason: collision with root package name */
    private final com.parizene.netmonitor.r0.d f13730c;

    /* renamed from: d, reason: collision with root package name */
    private final org.greenrobot.eventbus.c f13731d;

    /* renamed from: e, reason: collision with root package name */
    private final Handler f13732e;

    /* renamed from: f, reason: collision with root package name */
    private final Handler f13733f;

    /* renamed from: g, reason: collision with root package name */
    private final SharedPreferences f13734g;

    /* renamed from: h, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f13735h = new SharedPreferences.OnSharedPreferenceChangeListener() { // from class: com.parizene.netmonitor.i
        @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
        public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences, String str) {
            this.f13198e.g(sharedPreferences, str);
        }
    };

    public u(Context context, AppDatabase appDatabase, com.parizene.netmonitor.r0.d dVar, org.greenrobot.eventbus.c cVar, Handler handler, Handler handler2, SharedPreferences sharedPreferences) {
        this.a = context;
        this.f13729b = appDatabase;
        this.f13730c = dVar;
        this.f13731d = cVar;
        this.f13732e = handler;
        this.f13733f = handler2;
        this.f13734g = sharedPreferences;
    }

    private Address b(Locale locale, double d2, double d3) throws IOException {
        List<Address> fromLocation;
        if (!Geocoder.isPresent()) {
            return null;
        }
        try {
            fromLocation = new Geocoder(this.a, locale).getFromLocation(d2, d3, 1);
        } catch (IOException e2) {
            m.a.a.g(e2);
            fromLocation = null;
        }
        if (fromLocation == null || fromLocation.isEmpty()) {
            return null;
        }
        return fromLocation.get(0);
    }

    private com.parizene.netmonitor.r0.b c(com.parizene.netmonitor.r0.c cVar) {
        com.parizene.netmonitor.r0.b bVarA = this.f13730c.a(com.parizene.netmonitor.r0.e.YANDEX, cVar);
        if (bVarA != null && !bVarA.isEmpty()) {
            return bVarA;
        }
        com.parizene.netmonitor.r0.b bVarA2 = this.f13730c.a(com.parizene.netmonitor.r0.e.MYLNIKOV, cVar);
        if (bVarA2 == null || bVarA2.isEmpty()) {
            return null;
        }
        return bVarA2;
    }

    private com.parizene.netmonitor.db.celllog.i.j d(com.parizene.netmonitor.r0.c cVar) {
        return this.f13729b.H().e(cVar.a, cVar.f13643b, cVar.f13644c, cVar.f13645d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void g(SharedPreferences sharedPreferences, String str) {
        if (com.parizene.netmonitor.t0.f.f13720e.c().equals(str)) {
            t();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public /* synthetic */ void i(com.parizene.netmonitor.db.celllog.i.j jVar) {
        j(new com.parizene.netmonitor.r0.c(jVar.a, jVar.f13118b, jVar.f13119c, jVar.f13120d));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: n, reason: merged with bridge method [inline-methods] */
    public void m(com.parizene.netmonitor.r0.c cVar, com.parizene.netmonitor.r0.b bVar, Address address) {
        com.parizene.netmonitor.db.celllog.i.j jVarD = d(cVar);
        if (jVarD == null) {
            return;
        }
        if (bVar.isEmpty()) {
            jVarD.f13121e = 0;
            jVarD.f13122f = 0;
            jVarD.f13123g = 0;
            jVarD.f13124h = null;
            jVarD.f13125i = 2;
        } else {
            jVarD.f13121e = (int) (bVar.b() * 1000000.0d);
            jVarD.f13122f = (int) (bVar.a() * 1000000.0d);
            jVarD.f13123g = (int) bVar.d();
            if (address != null) {
                jVarD.f13124h = p(address);
            } else {
                jVarD.f13124h = null;
            }
            jVarD.f13125i = 1;
        }
        jVarD.f13126j = System.currentTimeMillis();
        if (com.parizene.netmonitor.r0.e.YANDEX == bVar.c()) {
            jVarD.f13127k = 2;
        } else if (com.parizene.netmonitor.r0.e.MYLNIKOV == bVar.c()) {
            jVarD.f13127k = 3;
        }
        this.f13729b.H().f(jVarD);
        bVar.isEmpty();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void o() {
        int i2 = 0;
        while (true) {
            List<com.parizene.netmonitor.db.celllog.i.j> listD = this.f13729b.H().d(i2, 500L);
            if (listD.isEmpty()) {
                return;
            }
            i2 += 500;
            for (final com.parizene.netmonitor.db.celllog.i.j jVar : listD) {
                this.f13733f.post(new Runnable() { // from class: com.parizene.netmonitor.f
                    @Override // java.lang.Runnable
                    public final void run() {
                        this.f13181e.i(jVar);
                    }
                });
            }
        }
    }

    private static String p(Address address) {
        StringBuilder sb = new StringBuilder();
        String adminArea = address.getAdminArea();
        if (!TextUtils.isEmpty(adminArea)) {
            sb.append(adminArea);
            sb.append(", ");
        }
        String countryName = address.getCountryName();
        for (int maxAddressLineIndex = address.getMaxAddressLineIndex(); maxAddressLineIndex >= 0; maxAddressLineIndex--) {
            String addressLine = address.getAddressLine(maxAddressLineIndex);
            if (!TextUtils.isEmpty(addressLine) && !addressLine.equals(countryName)) {
                sb.append(addressLine);
                sb.append(", ");
            }
        }
        if (sb.length() <= 0) {
            return null;
        }
        sb.delete(sb.length() - 2, sb.length());
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public void k(final com.parizene.netmonitor.r0.c cVar) {
        final com.parizene.netmonitor.r0.b bVarC = c(cVar);
        if (bVarC == null) {
            return;
        }
        final Address addressB = !bVarC.isEmpty() ? b(Locale.getDefault(), bVarC.b(), bVarC.a()) : null;
        this.f13732e.post(new Runnable() { // from class: com.parizene.netmonitor.e
            @Override // java.lang.Runnable
            public final void run() {
                this.f13176e.m(cVar, bVarC, addressB);
            }
        });
    }

    private void t() {
        boolean zBooleanValue = com.parizene.netmonitor.t0.f.f13720e.g().booleanValue();
        boolean zA = ((com.parizene.netmonitor.l0.b) this.f13731d.f(com.parizene.netmonitor.l0.b.class)).a();
        if (zBooleanValue && zA) {
            this.f13732e.post(new Runnable() { // from class: com.parizene.netmonitor.h
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13197e.o();
                }
            });
        }
    }

    public int a() {
        return this.f13729b.H().a();
    }

    @org.greenrobot.eventbus.m
    public void onConnectivityStateChanged(com.parizene.netmonitor.l0.b bVar) {
        t();
    }

    public void q() {
        this.f13731d.r(this);
        this.f13734g.registerOnSharedPreferenceChangeListener(this.f13735h);
    }

    public void r(final com.parizene.netmonitor.r0.c cVar) {
        com.parizene.netmonitor.db.celllog.i.j jVarD = d(cVar);
        if (jVarD != null) {
            int i2 = jVarD.f13125i;
            if (1 == i2) {
                return;
            }
            if (2 == i2 && jVarD.f13126j >= System.currentTimeMillis() - TimeUnit.DAYS.toMillis(30L)) {
                return;
            }
        }
        if (jVarD == null) {
            this.f13729b.H().g(new com.parizene.netmonitor.db.celllog.i.j(cVar.a, cVar.f13643b, cVar.f13644c, cVar.f13645d, 0, 0, 0, null, 0, 0L, 0));
        }
        if (com.parizene.netmonitor.t0.f.f13720e.g().booleanValue() && ((com.parizene.netmonitor.l0.b) this.f13731d.f(com.parizene.netmonitor.l0.b.class)).a()) {
            this.f13733f.post(new Runnable() { // from class: com.parizene.netmonitor.g
                @Override // java.lang.Runnable
                public final void run() {
                    this.f13195e.k(cVar);
                }
            });
        }
    }

    public void u() {
        this.f13731d.t(this);
        this.f13734g.unregisterOnSharedPreferenceChangeListener(this.f13735h);
    }
}