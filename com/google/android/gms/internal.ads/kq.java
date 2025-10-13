package com.google.android.gms.internal.ads;

import android.text.TextUtils;
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
public final class kq {

    /* renamed from: d */
    private String f7038d;

    /* renamed from: e */
    private String f7039e;

    /* renamed from: f */
    private long f7040f;

    /* renamed from: g */
    private JSONObject f7041g;

    /* renamed from: h */
    private boolean f7042h;

    /* renamed from: j */
    private boolean f7044j;
    private final List<String> a = new ArrayList();

    /* renamed from: b */
    private final List<String> f7036b = new ArrayList();

    /* renamed from: c */
    private final Map<String, nf> f7037c = new HashMap();

    /* renamed from: i */
    private final List<String> f7043i = new ArrayList();

    public kq(String str, long j2) throws JSONException {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectOptJSONObject2;
        JSONArray jSONArrayOptJSONArray;
        JSONObject jSONObjectOptJSONObject3;
        this.f7042h = false;
        this.f7044j = false;
        this.f7039e = str;
        this.f7040f = j2;
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f7041g = jSONObject;
            if (jSONObject.optInt("status", -1) != 1) {
                this.f7042h = false;
                er.zzi("App settings could not be fetched successfully.");
                return;
            }
            this.f7042h = true;
            this.f7038d = this.f7041g.optString("app_id");
            JSONArray jSONArrayOptJSONArray2 = this.f7041g.optJSONArray("ad_unit_id_settings");
            if (jSONArrayOptJSONArray2 != null) {
                for (int i2 = 0; i2 < jSONArrayOptJSONArray2.length(); i2++) {
                    JSONObject jSONObject2 = jSONArrayOptJSONArray2.getJSONObject(i2);
                    String strOptString = jSONObject2.optString("format");
                    String strOptString2 = jSONObject2.optString("ad_unit_id");
                    if (!TextUtils.isEmpty(strOptString) && !TextUtils.isEmpty(strOptString2)) {
                        if ("interstitial".equalsIgnoreCase(strOptString)) {
                            this.f7036b.add(strOptString2);
                        } else if (("rewarded".equalsIgnoreCase(strOptString) || "rewarded_interstitial".equals(strOptString)) && (jSONObjectOptJSONObject3 = jSONObject2.optJSONObject("mediation_config")) != null) {
                            this.f7037c.put(strOptString2, new nf(jSONObjectOptJSONObject3));
                        }
                    }
                }
            }
            JSONArray jSONArrayOptJSONArray3 = this.f7041g.optJSONArray("persistable_banner_ad_unit_ids");
            if (jSONArrayOptJSONArray3 != null) {
                for (int i3 = 0; i3 < jSONArrayOptJSONArray3.length(); i3++) {
                    this.a.add(jSONArrayOptJSONArray3.optString(i3));
                }
            }
            if (((Boolean) c.c().b(w3.T4)).booleanValue() && (jSONObjectOptJSONObject2 = this.f7041g.optJSONObject("common_settings")) != null && (jSONArrayOptJSONArray = jSONObjectOptJSONObject2.optJSONArray("loeid")) != null) {
                for (int i4 = 0; i4 < jSONArrayOptJSONArray.length(); i4++) {
                    this.f7043i.add(jSONArrayOptJSONArray.get(i4).toString());
                }
            }
            if (!((Boolean) c.c().b(w3.t4)).booleanValue() || (jSONObjectOptJSONObject = this.f7041g.optJSONObject("common_settings")) == null) {
                return;
            }
            this.f7044j = jSONObjectOptJSONObject.optBoolean("is_prefetching_enabled", false);
        } catch (JSONException e2) {
            er.zzj("Exception occurred while processing app setting json", e2);
            zzs.zzg().g(e2, "AppSettings.parseAppSettingsJson");
        }
    }

    public final void a(long j2) {
        this.f7040f = j2;
    }

    public final long b() {
        return this.f7040f;
    }

    public final boolean c() {
        return this.f7042h;
    }

    public final String d() {
        return this.f7039e;
    }

    public final String e() {
        return this.f7038d;
    }

    public final Map<String, nf> f() {
        return this.f7037c;
    }

    public final JSONObject g() {
        return this.f7041g;
    }

    public final List<String> h() {
        return this.f7043i;
    }

    public final boolean i() {
        return this.f7044j;
    }
}