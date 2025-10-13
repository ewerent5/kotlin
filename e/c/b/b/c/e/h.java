package e.c.b.b.c.e;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.BadParcelableException;
import android.os.Bundle;
import android.os.NetworkOnMainThreadException;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import ch.qos.logback.core.spi.AbstractComponentTracker;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.dynamite.descriptors.com.google.android.gms.measurement.dynamite.ModuleDescriptor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.concurrent.ExecutorService;

/* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
/* loaded from: classes.dex */
public class h {
    private static volatile h a = null;

    /* renamed from: b, reason: collision with root package name */
    private static Boolean f14559b = null;

    /* renamed from: c, reason: collision with root package name */
    private static String f14560c = "allow_remote_dynamite";

    /* renamed from: d, reason: collision with root package name */
    private static boolean f14561d = true;

    /* renamed from: e, reason: collision with root package name */
    private final String f14562e;

    /* renamed from: f, reason: collision with root package name */
    protected final com.google.android.gms.common.util.f f14563f;

    /* renamed from: g, reason: collision with root package name */
    private final ExecutorService f14564g;

    /* renamed from: h, reason: collision with root package name */
    private final com.google.android.gms.measurement.a.a f14565h;

    /* renamed from: i, reason: collision with root package name */
    private final List<Pair<com.google.android.gms.measurement.internal.f6, c>> f14566i;

    /* renamed from: j, reason: collision with root package name */
    private int f14567j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f14568k;

    /* renamed from: l, reason: collision with root package name */
    private String f14569l;

    /* renamed from: m, reason: collision with root package name */
    private volatile tf f14570m;

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
    abstract class a implements Runnable {

        /* renamed from: e, reason: collision with root package name */
        final long f14571e;

        /* renamed from: f, reason: collision with root package name */
        final long f14572f;

        /* renamed from: g, reason: collision with root package name */
        private final boolean f14573g;

        a(h hVar) {
            this(true);
        }

        abstract void a();

        protected void b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            if (h.this.f14568k) {
                b();
                return;
            }
            try {
                a();
            } catch (Exception e2) {
                h.this.p(e2, false, this.f14573g);
                b();
            }
        }

        a(boolean z) {
            this.f14571e = h.this.f14563f.a();
            this.f14572f = h.this.f14563f.c();
            this.f14573g = z;
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
    class b implements Application.ActivityLifecycleCallbacks {
        b() {
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityCreated(Activity activity, Bundle bundle) {
            h.this.k(new i0(this, bundle, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityDestroyed(Activity activity) {
            h.this.k(new n0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityPaused(Activity activity) {
            h.this.k(new j0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityResumed(Activity activity) {
            h.this.k(new k0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivitySaveInstanceState(Activity activity, Bundle bundle) {
            rf rfVar = new rf();
            h.this.k(new l0(this, activity, rfVar));
            Bundle bundleM4 = rfVar.m4(50L);
            if (bundleM4 != null) {
                bundle.putAll(bundleM4);
            }
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStarted(Activity activity) {
            h.this.k(new h0(this, activity));
        }

        @Override // android.app.Application.ActivityLifecycleCallbacks
        public final void onActivityStopped(Activity activity) {
            h.this.k(new m0(this, activity));
        }
    }

    /* compiled from: com.google.android.gms:play-services-measurement-sdk-api@@18.0.0 */
    static class c extends e.c.b.b.c.e.b {

        /* renamed from: e, reason: collision with root package name */
        private final com.google.android.gms.measurement.internal.f6 f14576e;

        c(com.google.android.gms.measurement.internal.f6 f6Var) {
            this.f14576e = f6Var;
        }

        @Override // e.c.b.b.c.e.c
        public final void J2(String str, String str2, Bundle bundle, long j2) {
            this.f14576e.a(str, str2, bundle, j2);
        }

        @Override // e.c.b.b.c.e.c
        public final int zza() {
            return System.identityHashCode(this.f14576e);
        }
    }

    private h(Context context, String str, String str2, String str3, Bundle bundle) {
        if (str == null || !H(str2, str3)) {
            this.f14562e = "FA";
        } else {
            this.f14562e = str;
        }
        this.f14563f = com.google.android.gms.common.util.i.d();
        this.f14564g = q7.a().a(new q(this), qf.a);
        this.f14565h = new com.google.android.gms.measurement.a.a(this);
        this.f14566i = new ArrayList();
        if (!(!M(context) || U())) {
            this.f14569l = null;
            this.f14568k = true;
            Log.w(this.f14562e, "Disabling data collection. Found google_app_id in strings.xml but Google Analytics for Firebase is missing. Remove this value or add Google Analytics for Firebase to resume data collection.");
            return;
        }
        if (H(str2, str3)) {
            this.f14569l = str2;
        } else {
            this.f14569l = "fa";
            if (str2 == null || str3 == null) {
                if ((str2 == null) ^ (str3 == null)) {
                    Log.w(this.f14562e, "Specified origin or custom app id is null. Both parameters will be ignored.");
                }
            } else {
                Log.v(this.f14562e, "Deferring to Google Analytics for Firebase for event data collection. https://goo.gl/J1sWQy");
            }
        }
        k(new k(this, str2, str3, context, bundle));
        Application application = (Application) context.getApplicationContext();
        if (application == null) {
            Log.w(this.f14562e, "Unable to register lifecycle notifications. Application null.");
        } else {
            application.registerActivityLifecycleCallbacks(new b());
        }
    }

    static /* synthetic */ tf E(h hVar) {
        return hVar.f14570m;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static boolean H(String str, String str2) {
        return (str2 == null || str == null || U()) ? false : true;
    }

    private static boolean M(Context context) {
        return com.google.android.gms.measurement.internal.n7.b(context, "google_app_id") != null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int N(Context context) {
        return DynamiteModule.c(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int P(Context context) {
        return DynamiteModule.a(context, ModuleDescriptor.MODULE_ID);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static void R(Context context) {
        synchronized (h.class) {
            try {
            } catch (Exception e2) {
                Log.e("FA", "Exception reading flag from SharedPreferences.", e2);
                f14559b = Boolean.valueOf(f14561d);
            }
            if (f14559b != null) {
                return;
            }
            if (u(context, "app_measurement_internal_disable_startup_flags")) {
                f14559b = Boolean.valueOf(f14561d);
                return;
            }
            SharedPreferences sharedPreferences = context.getSharedPreferences("com.google.android.gms.measurement.prefs", 0);
            f14559b = Boolean.valueOf(sharedPreferences.getBoolean(f14560c, f14561d));
            SharedPreferences.Editor editorEdit = sharedPreferences.edit();
            editorEdit.remove(f14560c);
            editorEdit.apply();
        }
    }

    private static boolean U() throws ClassNotFoundException {
        try {
            Class.forName("com.google.firebase.analytics.FirebaseAnalytics");
            return true;
        } catch (ClassNotFoundException unused) {
            return false;
        }
    }

    public static h b(Context context) {
        return c(context, null, null, null, null);
    }

    public static h c(Context context, String str, String str2, String str3, Bundle bundle) {
        com.google.android.gms.common.internal.p.j(context);
        if (a == null) {
            synchronized (h.class) {
                if (a == null) {
                    a = new h(context, str, str2, str3, bundle);
                }
            }
        }
        return a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(a aVar) {
        this.f14564g.execute(aVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void p(Exception exc, boolean z, boolean z2) {
        this.f14568k |= z;
        if (z) {
            Log.w(this.f14562e, "Data collection startup failed. No data will be collected.", exc);
            return;
        }
        if (z2) {
            h(5, "Error with data collection. Data lost.", exc, null, null);
        }
        Log.w(this.f14562e, "Error with data collection. Data lost.", exc);
    }

    private final void r(String str, String str2, Bundle bundle, boolean z, boolean z2, Long l2) {
        k(new g0(this, l2, str, str2, bundle, z, z2));
    }

    private static boolean u(Context context, String str) {
        Bundle bundle;
        com.google.android.gms.common.internal.p.f(str);
        try {
            ApplicationInfo applicationInfoC = com.google.android.gms.common.p.c.a(context).c(context.getPackageName(), 128);
            if (applicationInfoC != null && (bundle = applicationInfoC.metaData) != null) {
                return bundle.getBoolean(str);
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public final void A(Bundle bundle) {
        k(new o(this, bundle));
    }

    public final void B(String str) {
        k(new s(this, str));
    }

    public final void C(String str, String str2, Bundle bundle) {
        k(new m(this, str, str2, bundle));
    }

    public final String F() {
        rf rfVar = new rf();
        k(new u(this, rfVar));
        return rfVar.Y(500L);
    }

    public final void G(String str) {
        k(new r(this, str));
    }

    public final int J(String str) {
        rf rfVar = new rf();
        k(new c0(this, str, rfVar));
        Integer num = (Integer) rf.U(rfVar.m4(AbstractComponentTracker.LINGERING_TIMEOUT), Integer.class);
        if (num == null) {
            return 25;
        }
        return num.intValue();
    }

    public final String K() {
        rf rfVar = new rf();
        k(new t(this, rfVar));
        return rfVar.Y(50L);
    }

    public final long L() {
        rf rfVar = new rf();
        k(new w(this, rfVar));
        Long l2 = (Long) rf.U(rfVar.m4(500L), Long.class);
        if (l2 != null) {
            return l2.longValue();
        }
        long jNextLong = new Random(System.nanoTime() ^ this.f14563f.a()).nextLong();
        int i2 = this.f14567j + 1;
        this.f14567j = i2;
        return jNextLong + i2;
    }

    public final String O() {
        rf rfVar = new rf();
        k(new v(this, rfVar));
        return rfVar.Y(500L);
    }

    public final String Q() {
        rf rfVar = new rf();
        k(new z(this, rfVar));
        return rfVar.Y(500L);
    }

    public final String S() {
        return this.f14569l;
    }

    public final Bundle a(Bundle bundle, boolean z) {
        rf rfVar = new rf();
        k(new a0(this, bundle, rfVar));
        if (z) {
            return rfVar.m4(5000L);
        }
        return null;
    }

    protected final tf d(Context context, boolean z) {
        try {
            return sf.asInterface(DynamiteModule.e(context, z ? DynamiteModule.f4788f : DynamiteModule.f4784b, ModuleDescriptor.MODULE_ID).d("com.google.android.gms.measurement.internal.AppMeasurementDynamiteService"));
        } catch (DynamiteModule.a e2) {
            p(e2, true, false);
            return null;
        }
    }

    public final com.google.android.gms.measurement.a.a f() {
        return this.f14565h;
    }

    public final Map<String, Object> g(String str, String str2, boolean z) {
        rf rfVar = new rf();
        k(new y(this, str, str2, z, rfVar));
        Bundle bundleM4 = rfVar.m4(5000L);
        if (bundleM4 == null || bundleM4.size() == 0) {
            return Collections.emptyMap();
        }
        HashMap map = new HashMap(bundleM4.size());
        for (String str3 : bundleM4.keySet()) {
            Object obj = bundleM4.get(str3);
            if ((obj instanceof Double) || (obj instanceof Long) || (obj instanceof String)) {
                map.put(str3, obj);
            }
        }
        return map;
    }

    public final void h(int i2, String str, Object obj, Object obj2, Object obj3) {
        k(new b0(this, false, 5, str, obj, null, null));
    }

    public final void i(Activity activity, String str, String str2) {
        k(new n(this, activity, str, str2));
    }

    public final void j(Bundle bundle) {
        k(new j(this, bundle));
    }

    public final void n(com.google.android.gms.measurement.internal.f6 f6Var) {
        com.google.android.gms.common.internal.p.j(f6Var);
        synchronized (this.f14566i) {
            for (int i2 = 0; i2 < this.f14566i.size(); i2++) {
                if (f6Var.equals(this.f14566i.get(i2).first)) {
                    Log.w(this.f14562e, "OnEventListener already registered.");
                    return;
                }
            }
            c cVar = new c(f6Var);
            this.f14566i.add(new Pair<>(f6Var, cVar));
            if (this.f14570m != null) {
                try {
                    this.f14570m.registerOnMeasurementEventListener(cVar);
                    return;
                } catch (BadParcelableException | NetworkOnMainThreadException | RemoteException | IllegalArgumentException | IllegalStateException | NullPointerException | SecurityException | UnsupportedOperationException unused) {
                    Log.w(this.f14562e, "Failed to register event listener on calling thread. Trying again on the dynamite thread.");
                }
            }
            k(new e0(this, cVar));
        }
    }

    public final void o(Boolean bool) {
        k(new p(this, bool));
    }

    public final void q(String str, String str2, Bundle bundle) {
        r(str, str2, bundle, true, true, null);
    }

    public final void s(String str, String str2, Object obj, boolean z) {
        k(new f0(this, str, str2, obj, z));
    }

    public final void t(boolean z) {
        k(new d0(this, z));
    }

    public final List<Bundle> y(String str, String str2) {
        rf rfVar = new rf();
        k(new l(this, str, str2, rfVar));
        List<Bundle> list = (List) rf.U(rfVar.m4(5000L), List.class);
        return list == null ? Collections.emptyList() : list;
    }
}