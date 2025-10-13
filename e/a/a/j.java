package e.a.a;

import android.content.ContentResolver;
import android.content.Context;
import android.content.pm.PackageManager;
import android.location.Address;
import android.location.Geocoder;
import android.location.Location;
import android.os.Build;
import android.provider.Settings;
import android.telephony.TelephonyManager;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.List;
import java.util.Locale;
import java.util.UUID;

/* compiled from: DeviceInfo.java */
/* loaded from: classes.dex */
public class j {
    private static final String a = "e.a.a.j";

    /* renamed from: b, reason: collision with root package name */
    private boolean f14176b = true;

    /* renamed from: c, reason: collision with root package name */
    private Context f14177c;

    /* renamed from: d, reason: collision with root package name */
    private b f14178d;

    /* compiled from: DeviceInfo.java */
    private class b {
        private String a;

        /* renamed from: b, reason: collision with root package name */
        private String f14179b;

        /* renamed from: c, reason: collision with root package name */
        private String f14180c;

        /* renamed from: d, reason: collision with root package name */
        private String f14181d;

        /* renamed from: e, reason: collision with root package name */
        private String f14182e;

        /* renamed from: f, reason: collision with root package name */
        private String f14183f;

        /* renamed from: g, reason: collision with root package name */
        private String f14184g;

        /* renamed from: h, reason: collision with root package name */
        private String f14185h;

        /* renamed from: i, reason: collision with root package name */
        private String f14186i;

        /* renamed from: j, reason: collision with root package name */
        private String f14187j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f14188k;

        /* renamed from: l, reason: collision with root package name */
        private boolean f14189l;

        private String A() {
            return Build.VERSION.RELEASE;
        }

        private String B() {
            try {
                return j.this.f14177c.getPackageManager().getPackageInfo(j.this.f14177c.getPackageName(), 0).versionName;
            } catch (PackageManager.NameNotFoundException | Exception unused) {
                return null;
            }
        }

        private boolean m() {
            try {
                Integer num = (Integer) Class.forName("com.google.android.gms.common.i").getMethod("isGooglePlayServicesAvailable", Context.class).invoke(null, j.this.f14177c);
                if (num != null) {
                    return num.intValue() == 0;
                }
                return false;
            } catch (ClassNotFoundException unused) {
                e.d().h(j.a, "Google Play Services Util not found!");
                return false;
            } catch (IllegalAccessException unused2) {
                e.d().h(j.a, "Google Play Services not available");
                return false;
            } catch (NoSuchMethodException unused3) {
                e.d().h(j.a, "Google Play Services not available");
                return false;
            } catch (InvocationTargetException unused4) {
                e.d().h(j.a, "Google Play Services not available");
                return false;
            } catch (Exception e2) {
                e.d().h(j.a, "Error when checking for Google Play Services: " + e2);
                return false;
            } catch (NoClassDefFoundError unused5) {
                e.d().h(j.a, "Google Play Services Util not found!");
                return false;
            }
        }

        private String n() {
            return "Amazon".equals(x()) ? o() : p();
        }

        private String o() {
            ContentResolver contentResolver = j.this.f14177c.getContentResolver();
            this.f14188k = Settings.Secure.getInt(contentResolver, "limit_ad_tracking", 0) == 1;
            String string = Settings.Secure.getString(contentResolver, "advertising_id");
            this.a = string;
            return string;
        }

        private String p() throws IllegalAccessException, IllegalArgumentException, InvocationTargetException {
            try {
                boolean z = true;
                Object objInvoke = Class.forName("com.google.android.gms.ads.identifier.AdvertisingIdClient").getMethod("getAdvertisingIdInfo", Context.class).invoke(null, j.this.f14177c);
                Boolean bool = (Boolean) objInvoke.getClass().getMethod("isLimitAdTrackingEnabled", new Class[0]).invoke(objInvoke, new Object[0]);
                if (bool == null || !bool.booleanValue()) {
                    z = false;
                }
                this.f14188k = z;
                this.a = (String) objInvoke.getClass().getMethod("getId", new Class[0]).invoke(objInvoke, new Object[0]);
            } catch (ClassNotFoundException unused) {
                e.d().h(j.a, "Google Play Services SDK not found!");
            } catch (InvocationTargetException unused2) {
                e.d().h(j.a, "Google Play Services not available");
            } catch (Exception e2) {
                e.d().c(j.a, "Encountered an error connecting to Google Play Services", e2);
            }
            return this.a;
        }

        private String q() {
            return Build.BRAND;
        }

        private String r() {
            try {
                return ((TelephonyManager) j.this.f14177c.getSystemService("phone")).getNetworkOperatorName();
            } catch (Exception unused) {
                return null;
            }
        }

        private String s() {
            String strU = u();
            if (!m.d(strU)) {
                return strU;
            }
            String strV = v();
            return !m.d(strV) ? strV : t();
        }

        private String t() {
            return Locale.getDefault().getCountry();
        }

        private String u() {
            Location locationM;
            List<Address> fromLocation;
            if (j.this.s() && (locationM = j.this.m()) != null) {
                try {
                    if (Geocoder.isPresent() && (fromLocation = j.this.i().getFromLocation(locationM.getLatitude(), locationM.getLongitude(), 1)) != null) {
                        for (Address address : fromLocation) {
                            if (address != null) {
                                return address.getCountryCode();
                            }
                        }
                    }
                } catch (IOException | IllegalArgumentException | IllegalStateException | NoSuchMethodError | NullPointerException unused) {
                }
            }
            return null;
        }

        private String v() {
            String networkCountryIso;
            try {
                TelephonyManager telephonyManager = (TelephonyManager) j.this.f14177c.getSystemService("phone");
                if (telephonyManager.getPhoneType() == 2 || (networkCountryIso = telephonyManager.getNetworkCountryIso()) == null) {
                    return null;
                }
                return networkCountryIso.toUpperCase(Locale.US);
            } catch (Exception unused) {
                return null;
            }
        }

        private String w() {
            return Locale.getDefault().getLanguage();
        }

        private String x() {
            return Build.MANUFACTURER;
        }

        private String y() {
            return Build.MODEL;
        }

        private String z() {
            return "android";
        }

        private b() {
            this.a = n();
            this.f14180c = B();
            this.f14181d = z();
            this.f14182e = A();
            this.f14183f = q();
            this.f14184g = x();
            this.f14185h = y();
            this.f14186i = r();
            this.f14179b = s();
            this.f14187j = w();
            this.f14189l = m();
        }
    }

    public j(Context context) {
        this.f14177c = context;
    }

    public static String c() {
        return UUID.randomUUID().toString();
    }

    private b f() {
        if (this.f14178d == null) {
            this.f14178d = new b();
        }
        return this.f14178d;
    }

    public String d() {
        return f().a;
    }

    public String e() {
        return f().f14183f;
    }

    public String g() {
        return f().f14186i;
    }

    public String h() {
        return f().f14179b;
    }

    protected Geocoder i() {
        return new Geocoder(this.f14177c, Locale.ENGLISH);
    }

    public String j() {
        return f().f14187j;
    }

    public String k() {
        return f().f14184g;
    }

    public String l() {
        return f().f14185h;
    }

    /* JADX WARN: Removed duplicated region for block: B:37:0x0051 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x002a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public android.location.Location m() {
        /*
            r8 = this;
            java.lang.String r0 = "Failed to get most recent location"
            boolean r1 = r8.s()
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            android.content.Context r1 = r8.f14177c
            java.lang.String r3 = "location"
            java.lang.Object r1 = r1.getSystemService(r3)
            android.location.LocationManager r1 = (android.location.LocationManager) r1
            if (r1 != 0) goto L17
            return r2
        L17:
            r3 = 1
            java.util.List r3 = r1.getProviders(r3)     // Catch: java.lang.SecurityException -> L1d
            goto L1e
        L1d:
            r3 = r2
        L1e:
            if (r3 != 0) goto L21
            return r2
        L21:
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            java.util.Iterator r3 = r3.iterator()
        L2a:
            boolean r5 = r3.hasNext()
            if (r5 == 0) goto L55
            java.lang.Object r5 = r3.next()
            java.lang.String r5 = (java.lang.String) r5
            android.location.Location r5 = r1.getLastKnownLocation(r5)     // Catch: java.lang.Exception -> L3b java.lang.SecurityException -> L45
            goto L4f
        L3b:
            e.a.a.e r5 = e.a.a.e.d()
            java.lang.String r6 = e.a.a.j.a
            r5.h(r6, r0)
            goto L4e
        L45:
            e.a.a.e r5 = e.a.a.e.d()
            java.lang.String r6 = e.a.a.j.a
            r5.h(r6, r0)
        L4e:
            r5 = r2
        L4f:
            if (r5 == 0) goto L2a
            r4.add(r5)
            goto L2a
        L55:
            r0 = -1
            java.util.Iterator r3 = r4.iterator()
        L5b:
            boolean r4 = r3.hasNext()
            if (r4 == 0) goto L75
            java.lang.Object r4 = r3.next()
            android.location.Location r4 = (android.location.Location) r4
            long r5 = r4.getTime()
            int r7 = (r5 > r0 ? 1 : (r5 == r0 ? 0 : -1))
            if (r7 <= 0) goto L5b
            long r0 = r4.getTime()
            r2 = r4
            goto L5b
        L75:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: e.a.a.j.m():android.location.Location");
    }

    public String n() {
        return f().f14181d;
    }

    public String o() {
        return f().f14182e;
    }

    public String p() {
        return f().f14180c;
    }

    public boolean q() {
        return f().f14189l;
    }

    public boolean r() {
        return f().f14188k;
    }

    public boolean s() {
        return this.f14176b;
    }

    public void t() {
        f();
    }

    public void u(boolean z) {
        this.f14176b = z;
    }
}