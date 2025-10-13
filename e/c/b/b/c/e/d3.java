package e.c.b.b.c.e;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.StrictMode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

/* compiled from: com.google.android.gms:play-services-measurement-impl@@18.0.0 */
/* loaded from: classes.dex */
public final class d3 implements l2 {
    private static final Map<String, d3> a = new c.e.a();

    /* renamed from: b, reason: collision with root package name */
    private final SharedPreferences f14455b;

    /* renamed from: c, reason: collision with root package name */
    private final SharedPreferences.OnSharedPreferenceChangeListener f14456c;

    /* renamed from: d, reason: collision with root package name */
    private final Object f14457d;

    /* renamed from: e, reason: collision with root package name */
    private volatile Map<String, ?> f14458e;

    /* renamed from: f, reason: collision with root package name */
    private final List<i2> f14459f;

    private d3(SharedPreferences sharedPreferences) {
        SharedPreferences.OnSharedPreferenceChangeListener onSharedPreferenceChangeListener = new SharedPreferences.OnSharedPreferenceChangeListener(this) { // from class: e.c.b.b.c.e.g3

            /* renamed from: e, reason: collision with root package name */
            private final d3 f14540e;

            {
                this.f14540e = this;
            }

            @Override // android.content.SharedPreferences.OnSharedPreferenceChangeListener
            public final void onSharedPreferenceChanged(SharedPreferences sharedPreferences2, String str) {
                this.f14540e.c(sharedPreferences2, str);
            }
        };
        this.f14456c = onSharedPreferenceChangeListener;
        this.f14457d = new Object();
        this.f14459f = new ArrayList();
        this.f14455b = sharedPreferences;
        sharedPreferences.registerOnSharedPreferenceChangeListener(onSharedPreferenceChangeListener);
    }

    static d3 a(Context context, String str) {
        d3 d3Var;
        if (f2.a()) {
            throw null;
        }
        synchronized (d3.class) {
            Map<String, d3> map = a;
            d3Var = map.get(null);
            if (d3Var == null) {
                d3Var = new d3(d(context, null));
                map.put(null, d3Var);
            }
        }
        return d3Var;
    }

    static synchronized void b() {
        for (d3 d3Var : a.values()) {
            d3Var.f14455b.unregisterOnSharedPreferenceChangeListener(d3Var.f14456c);
        }
        a.clear();
    }

    private static SharedPreferences d(Context context, String str) {
        StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            if (!str.startsWith("direct_boot:")) {
                return context.getSharedPreferences(str, 0);
            }
            if (f2.a()) {
                context = context.createDeviceProtectedStorageContext();
            }
            return context.getSharedPreferences(str.substring(12), 0);
        } finally {
            StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
        }
    }

    final /* synthetic */ void c(SharedPreferences sharedPreferences, String str) {
        synchronized (this.f14457d) {
            this.f14458e = null;
            w2.g();
        }
        synchronized (this) {
            Iterator<i2> it = this.f14459f.iterator();
            while (it.hasNext()) {
                it.next().zza();
            }
        }
    }

    @Override // e.c.b.b.c.e.l2
    public final Object zza(String str) {
        Map<String, ?> map = this.f14458e;
        if (map == null) {
            synchronized (this.f14457d) {
                map = this.f14458e;
                if (map == null) {
                    StrictMode.ThreadPolicy threadPolicyAllowThreadDiskReads = StrictMode.allowThreadDiskReads();
                    try {
                        Map<String, ?> all = this.f14455b.getAll();
                        this.f14458e = all;
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        map = all;
                    } catch (Throwable th) {
                        StrictMode.setThreadPolicy(threadPolicyAllowThreadDiskReads);
                        throw th;
                    }
                }
            }
        }
        if (map != null) {
            return map.get(str);
        }
        return null;
    }
}