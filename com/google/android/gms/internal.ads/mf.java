package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class mf {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final String f7464b;

    /* renamed from: c, reason: collision with root package name */
    public final List<String> f7465c;

    /* renamed from: d, reason: collision with root package name */
    public final String f7466d;

    /* renamed from: e, reason: collision with root package name */
    public final String f7467e;

    /* renamed from: f, reason: collision with root package name */
    public final List<String> f7468f;

    /* renamed from: g, reason: collision with root package name */
    public final List<String> f7469g;

    /* renamed from: h, reason: collision with root package name */
    public final List<String> f7470h;

    /* renamed from: i, reason: collision with root package name */
    public final List<String> f7471i;

    /* renamed from: j, reason: collision with root package name */
    public final List<String> f7472j;

    /* renamed from: k, reason: collision with root package name */
    public final String f7473k;

    /* renamed from: l, reason: collision with root package name */
    public final List<String> f7474l;

    /* renamed from: m, reason: collision with root package name */
    public final List<String> f7475m;
    public final List<String> n;
    public final String o;
    public final String p;
    public final String q;
    public final String r;
    public final String s;
    public final List<String> t;
    public final String u;
    public final String v;

    public mf(JSONObject jSONObject) throws JSONException {
        List<String> listA;
        this.f7464b = jSONObject.optString("id");
        JSONArray jSONArray = jSONObject.getJSONArray("adapters");
        ArrayList arrayList = new ArrayList(jSONArray.length());
        for (int i2 = 0; i2 < jSONArray.length(); i2++) {
            arrayList.add(jSONArray.getString(i2));
        }
        this.f7465c = Collections.unmodifiableList(arrayList);
        this.f7466d = jSONObject.optString("allocation_id", null);
        zzs.zzu();
        this.f7468f = of.a(jSONObject, "clickurl");
        zzs.zzu();
        this.f7469g = of.a(jSONObject, "imp_urls");
        zzs.zzu();
        this.f7470h = of.a(jSONObject, "downloaded_imp_urls");
        zzs.zzu();
        this.f7472j = of.a(jSONObject, "fill_urls");
        zzs.zzu();
        this.f7474l = of.a(jSONObject, "video_start_urls");
        zzs.zzu();
        this.n = of.a(jSONObject, "video_complete_urls");
        zzs.zzu();
        this.f7475m = of.a(jSONObject, "video_reward_urls");
        this.o = jSONObject.optString("transaction_id");
        this.p = jSONObject.optString("valid_from_timestamp");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("ad");
        if (jSONObjectOptJSONObject != null) {
            zzs.zzu();
            listA = of.a(jSONObjectOptJSONObject, "manual_impression_urls");
        } else {
            listA = null;
        }
        this.f7471i = listA;
        this.a = jSONObjectOptJSONObject != null ? jSONObjectOptJSONObject.toString() : null;
        JSONObject jSONObjectOptJSONObject2 = jSONObject.optJSONObject("data");
        this.f7473k = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.toString() : null;
        this.f7467e = jSONObjectOptJSONObject2 != null ? jSONObjectOptJSONObject2.optString("class_name") : null;
        this.q = jSONObject.optString("html_template", null);
        this.r = jSONObject.optString("ad_base_url", null);
        JSONObject jSONObjectOptJSONObject3 = jSONObject.optJSONObject("assets");
        this.s = jSONObjectOptJSONObject3 != null ? jSONObjectOptJSONObject3.toString() : null;
        zzs.zzu();
        this.t = of.a(jSONObject, "template_ids");
        JSONObject jSONObjectOptJSONObject4 = jSONObject.optJSONObject("ad_loader_options");
        this.u = jSONObjectOptJSONObject4 != null ? jSONObjectOptJSONObject4.toString() : null;
        this.v = jSONObject.optString("response_type", null);
        jSONObject.optLong("ad_network_timeout_millis", -1L);
    }
}