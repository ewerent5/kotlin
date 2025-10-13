package com.google.android.gms.internal.ads;

import android.os.IBinder;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ww0 implements ta0, jd0, hc0 {

    /* renamed from: e, reason: collision with root package name */
    private final gx0 f10063e;

    /* renamed from: f, reason: collision with root package name */
    private final String f10064f;

    /* renamed from: g, reason: collision with root package name */
    private int f10065g = 0;

    /* renamed from: h, reason: collision with root package name */
    private vw0 f10066h = vw0.AD_REQUESTED;

    /* renamed from: i, reason: collision with root package name */
    private ia0 f10067i;

    /* renamed from: j, reason: collision with root package name */
    private g93 f10068j;

    ww0(gx0 gx0Var, qp1 qp1Var) {
        this.f10063e = gx0Var;
        this.f10064f = qp1Var.f8429f;
    }

    private static JSONObject c(ia0 ia0Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("winningAdapterClassName", ia0Var.zze());
        jSONObject.put("responseSecsSinceEpoch", ia0Var.J4());
        jSONObject.put("responseId", ia0Var.zzf());
        JSONArray jSONArray = new JSONArray();
        List<w93> listZzg = ia0Var.zzg();
        if (listZzg != null) {
            for (w93 w93Var : listZzg) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("adapterClassName", w93Var.f9933e);
                jSONObject2.put("latencyMillis", w93Var.f9934f);
                g93 g93Var = w93Var.f9935g;
                jSONObject2.put("error", g93Var == null ? null : d(g93Var));
                jSONArray.put(jSONObject2);
            }
        }
        jSONObject.put("adNetworks", jSONArray);
        return jSONObject;
    }

    private static JSONObject d(g93 g93Var) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("errorDomain", g93Var.f6093g);
        jSONObject.put("errorCode", g93Var.f6091e);
        jSONObject.put("errorDescription", g93Var.f6092f);
        g93 g93Var2 = g93Var.f6094h;
        jSONObject.put("underlyingError", g93Var2 == null ? null : d(g93Var2));
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.ta0
    public final void B0(g93 g93Var) {
        this.f10066h = vw0.AD_LOAD_FAILED;
        this.f10068j = g93Var;
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void R(kp1 kp1Var) {
        this.f10065g = kp1Var.f7035b.a.get(0).f10197b;
    }

    public final boolean a() {
        return this.f10066h != vw0.AD_REQUESTED;
    }

    public final JSONObject b() throws JSONException {
        String str;
        IBinder iBinder;
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("state", this.f10066h);
        switch (this.f10065g) {
            case 1:
                str = "BANNER";
                break;
            case 2:
                str = "INTERSTITIAL";
                break;
            case 3:
                str = "NATIVE_EXPRESS";
                break;
            case 4:
                str = "NATIVE";
                break;
            case 5:
                str = "REWARDED";
                break;
            case 6:
                str = "APP_OPEN_AD";
                break;
            case 7:
                str = "REWARDED_INTERSTITIAL";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        jSONObject.put("format", str);
        ia0 ia0Var = this.f10067i;
        JSONObject jSONObjectC = null;
        if (ia0Var != null) {
            jSONObjectC = c(ia0Var);
        } else {
            g93 g93Var = this.f10068j;
            if (g93Var != null && (iBinder = g93Var.f6095i) != null) {
                ia0 ia0Var2 = (ia0) iBinder;
                jSONObjectC = c(ia0Var2);
                List<w93> listZzg = ia0Var2.zzg();
                if (listZzg != null && listZzg.isEmpty()) {
                    JSONArray jSONArray = new JSONArray();
                    jSONArray.put(d(this.f10068j));
                    jSONObjectC.put("errors", jSONArray);
                }
            }
        }
        jSONObject.put("responseInfo", jSONObjectC);
        return jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.jd0
    public final void f(ql qlVar) {
        this.f10063e.g(this.f10064f, this);
    }

    @Override // com.google.android.gms.internal.ads.hc0
    public final void u(s60 s60Var) {
        this.f10067i = s60Var.d();
        this.f10066h = vw0.AD_LOADED;
    }
}