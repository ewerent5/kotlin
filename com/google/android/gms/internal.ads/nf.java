package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class nf {
    public final List<mf> a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f7696b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f7697c;

    /* renamed from: d, reason: collision with root package name */
    public final List<String> f7698d;

    /* renamed from: e, reason: collision with root package name */
    public final List<String> f7699e;

    /* renamed from: f, reason: collision with root package name */
    public final List<String> f7700f;

    /* renamed from: g, reason: collision with root package name */
    public final String f7701g;

    /* renamed from: h, reason: collision with root package name */
    public final String f7702h;

    public nf(JSONObject jSONObject) throws JSONException {
        if (er.zzm(2)) {
            String strValueOf = String.valueOf(jSONObject.toString(2));
            zze.zza(strValueOf.length() != 0 ? "Mediation Response JSON: ".concat(strValueOf) : new String("Mediation Response JSON: "));
        }
        JSONArray jSONArray = jSONObject.getJSONArray("ad_networks");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        int i2 = -1;
        for (int i3 = 0; i3 < jSONArray.length(); i3++) {
            try {
                mf mfVar = new mf(jSONArray.getJSONObject(i3));
                "banner".equalsIgnoreCase(mfVar.v);
                arrayList.add(mfVar);
                if (i2 < 0) {
                    Iterator<String> it = mfVar.f7465c.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (it.next().equals("com.google.ads.mediation.admob.AdMobAdapter")) {
                                i2 = i3;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
            } catch (JSONException unused) {
            }
        }
        jSONArray.length();
        this.a = Collections.unmodifiableList(arrayList);
        this.f7701g = jSONObject.optString("qdata");
        jSONObject.optInt("fs_model_type", -1);
        jSONObject.optLong("timeout_ms", -1L);
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("settings");
        if (jSONObjectOptJSONObject == null) {
            this.f7696b = null;
            this.f7697c = null;
            this.f7698d = null;
            this.f7699e = null;
            this.f7700f = null;
            this.f7702h = null;
            return;
        }
        jSONObjectOptJSONObject.optLong("ad_network_timeout_millis", -1L);
        zzs.zzu();
        this.f7696b = of.a(jSONObjectOptJSONObject, "click_urls");
        zzs.zzu();
        this.f7697c = of.a(jSONObjectOptJSONObject, "imp_urls");
        zzs.zzu();
        this.f7698d = of.a(jSONObjectOptJSONObject, "downloaded_imp_urls");
        zzs.zzu();
        this.f7699e = of.a(jSONObjectOptJSONObject, "nofill_urls");
        zzs.zzu();
        this.f7700f = of.a(jSONObjectOptJSONObject, "remote_ping_urls");
        jSONObjectOptJSONObject.optBoolean("render_in_browser", false);
        jSONObjectOptJSONObject.optLong("refresh", -1L);
        tm tmVarC = tm.c(jSONObjectOptJSONObject.optJSONArray("rewards"));
        if (tmVarC == null) {
            this.f7702h = null;
        } else {
            this.f7702h = tmVarC.f9199e;
        }
        jSONObjectOptJSONObject.optBoolean("use_displayed_impression", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_rendered_attribution", false);
        jSONObjectOptJSONObject.optBoolean("allow_pub_owned_ad_view", false);
        jSONObjectOptJSONObject.optBoolean("allow_custom_click_gesture", false);
    }
}