package com.google.android.gms.internal.ads;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.zzs;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class gx0 implements rx0, tw0 {
    private final qx0 a;

    /* renamed from: b, reason: collision with root package name */
    private final sx0 f6216b;

    /* renamed from: c, reason: collision with root package name */
    private final uw0 f6217c;

    /* renamed from: d, reason: collision with root package name */
    private final cx0 f6218d;

    /* renamed from: e, reason: collision with root package name */
    private final sw0 f6219e;

    /* renamed from: f, reason: collision with root package name */
    private final String f6220f;

    /* renamed from: k, reason: collision with root package name */
    private boolean f6225k;

    /* renamed from: l, reason: collision with root package name */
    private int f6226l;

    /* renamed from: m, reason: collision with root package name */
    private boolean f6227m;

    /* renamed from: h, reason: collision with root package name */
    private String f6222h = "{}";

    /* renamed from: i, reason: collision with root package name */
    private long f6223i = Long.MAX_VALUE;

    /* renamed from: j, reason: collision with root package name */
    private dx0 f6224j = dx0.NONE;

    /* renamed from: g, reason: collision with root package name */
    private final Map<String, List<ww0>> f6221g = new HashMap();

    gx0(qx0 qx0Var, sx0 sx0Var, uw0 uw0Var, Context context, kr krVar, cx0 cx0Var) {
        this.a = qx0Var;
        this.f6216b = sx0Var;
        this.f6217c = uw0Var;
        this.f6219e = new sw0(context);
        this.f6220f = krVar.f7054e;
        this.f6218d = cx0Var;
    }

    private final synchronized void j(boolean z, boolean z2) {
        if (this.f6225k == z) {
            return;
        }
        this.f6225k = z;
        if (z) {
            n();
        } else {
            o();
        }
        if (z2) {
            p();
        }
    }

    private final synchronized void k(dx0 dx0Var, boolean z) {
        if (this.f6224j == dx0Var) {
            return;
        }
        if (this.f6225k) {
            o();
        }
        this.f6224j = dx0Var;
        if (this.f6225k) {
            n();
        }
        if (z) {
            p();
        }
    }

    private final synchronized JSONObject l() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        for (Map.Entry<String, List<ww0>> entry : this.f6221g.entrySet()) {
            JSONArray jSONArray = new JSONArray();
            for (ww0 ww0Var : entry.getValue()) {
                if (ww0Var.a()) {
                    jSONArray.put(ww0Var.b());
                }
            }
            if (jSONArray.length() > 0) {
                jSONObject.put(entry.getKey(), jSONArray);
            }
        }
        return jSONObject;
    }

    private final void m() {
        this.f6227m = true;
        this.f6218d.a();
        this.a.a(this);
        this.f6216b.a(this);
        this.f6217c.a(this);
        q(zzs.zzg().l().zzF());
    }

    private final synchronized void n() {
        dx0 dx0Var = dx0.NONE;
        int iOrdinal = this.f6224j.ordinal();
        if (iOrdinal == 1) {
            this.f6216b.b();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f6217c.b();
        }
    }

    private final synchronized void o() {
        dx0 dx0Var = dx0.NONE;
        int iOrdinal = this.f6224j.ordinal();
        if (iOrdinal == 1) {
            this.f6216b.c();
        } else {
            if (iOrdinal != 2) {
                return;
            }
            this.f6217c.c();
        }
    }

    private final void p() {
        zzs.zzg().l().zzG(e());
    }

    private final synchronized void q(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            j(jSONObject.optBoolean("isTestMode", false), false);
            k(dx0.a(jSONObject.optString("gesture", "NONE")), false);
            this.f6222h = jSONObject.optString("networkExtras", "{}");
            this.f6223i = jSONObject.optLong("networkExtrasExpirationSecs", Long.MAX_VALUE);
        } catch (JSONException unused) {
        }
    }

    public final void a() {
        String strZzF;
        if (((Boolean) c.c().b(w3.P5)).booleanValue() && (strZzF = zzs.zzg().l().zzF()) != null) {
            try {
                if (new JSONObject(strZzF).optBoolean("isTestMode", false)) {
                    m();
                }
            } catch (JSONException unused) {
            }
        }
    }

    public final void b(boolean z) {
        if (!this.f6227m && z) {
            m();
        }
        j(z, true);
    }

    public final void c(dx0 dx0Var) {
        k(dx0Var, true);
    }

    public final synchronized String d() {
        if (((Boolean) c.c().b(w3.P5)).booleanValue() && this.f6225k) {
            if (this.f6223i < zzs.zzj().b() / 1000) {
                this.f6222h = "{}";
                return "";
            }
            if (this.f6222h.equals("{}")) {
                return "";
            }
            return this.f6222h;
        }
        return "";
    }

    public final synchronized String e() {
        JSONObject jSONObject;
        jSONObject = new JSONObject();
        try {
            jSONObject.put("isTestMode", this.f6225k);
            jSONObject.put("gesture", this.f6224j);
            if (this.f6223i > zzs.zzj().b() / 1000) {
                jSONObject.put("networkExtras", this.f6222h);
                jSONObject.put("networkExtrasExpirationSecs", this.f6223i);
            }
        } catch (JSONException unused) {
        }
        return jSONObject.toString();
    }

    public final synchronized void f(String str, long j2) {
        this.f6222h = str;
        this.f6223i = j2;
        p();
    }

    public final synchronized void g(String str, ww0 ww0Var) {
        if (((Boolean) c.c().b(w3.P5)).booleanValue() && this.f6225k) {
            if (this.f6226l >= ((Integer) c.c().b(w3.R5)).intValue()) {
                er.zzi("Maximum number of ad requests stored reached. Dropping the current request.");
                return;
            }
            if (!this.f6221g.containsKey(str)) {
                this.f6221g.put(str, new ArrayList());
            }
            this.f6226l++;
            this.f6221g.get(str).add(ww0Var);
        }
    }

    public final synchronized void h(a1 a1Var) {
        if (!this.f6225k) {
            try {
                a1Var.F(mq1.d(17, null, null));
                return;
            } catch (RemoteException unused) {
                er.zzi("Ad inspector cannot be opened because the device is not in test mode. See https://developers.google.com/admob/android/test-ads#enable_test_devices for more information.");
                return;
            }
        }
        if (((Boolean) c.c().b(w3.P5)).booleanValue()) {
            this.a.b(a1Var, new ca(this));
            return;
        }
        try {
            a1Var.F(mq1.d(1, null, null));
            return;
        } catch (RemoteException unused2) {
            er.zzi("Ad inspector had an internal error.");
            return;
        }
    }

    public final JSONObject i() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("platform", "ANDROID");
            jSONObject.put("internalSdkVersion", this.f6220f);
            jSONObject.put("adapters", this.f6218d.b());
            if (this.f6223i < zzs.zzj().b() / 1000) {
                this.f6222h = "{}";
            }
            jSONObject.put("networkExtras", this.f6222h);
            jSONObject.put("adSlots", l());
            jSONObject.put("appInfo", this.f6219e.a());
            jSONObject.put("cld", new JSONObject(zzs.zzg().l().zzn().d()));
        } catch (JSONException unused) {
        }
        return jSONObject;
    }
}