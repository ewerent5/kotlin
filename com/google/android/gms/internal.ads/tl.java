package com.google.android.gms.internal.ads;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class tl {
    private final List<String> a;

    /* renamed from: b, reason: collision with root package name */
    private final String f9175b;

    /* renamed from: c, reason: collision with root package name */
    private final String f9176c;

    /* renamed from: d, reason: collision with root package name */
    private final String f9177d;

    /* renamed from: e, reason: collision with root package name */
    private final boolean f9178e;

    /* renamed from: f, reason: collision with root package name */
    private final boolean f9179f;

    /* renamed from: g, reason: collision with root package name */
    private final String f9180g;

    /* renamed from: h, reason: collision with root package name */
    private final String f9181h;

    /* renamed from: i, reason: collision with root package name */
    private final String f9182i;

    /* renamed from: j, reason: collision with root package name */
    private final int f9183j;

    /* renamed from: k, reason: collision with root package name */
    private final JSONObject f9184k;

    /* renamed from: l, reason: collision with root package name */
    private final String f9185l;

    /* renamed from: m, reason: collision with root package name */
    private final String f9186m;

    public tl(JSONObject jSONObject) {
        this.f9182i = jSONObject.optString("url");
        this.f9175b = jSONObject.optString("base_uri");
        this.f9176c = jSONObject.optString("post_parameters");
        this.f9178e = j(jSONObject.optString("drt_include"));
        this.f9179f = j(jSONObject.optString("cookies_include", "true"));
        this.f9180g = jSONObject.optString("request_id");
        this.f9177d = jSONObject.optString("type");
        String strOptString = jSONObject.optString("errors");
        this.a = strOptString == null ? null : Arrays.asList(strOptString.split(","));
        this.f9183j = jSONObject.optInt("valid", 0) == 1 ? -2 : 1;
        this.f9181h = jSONObject.optString("fetched_ad");
        jSONObject.optBoolean("render_test_ad_label");
        JSONObject jSONObjectOptJSONObject = jSONObject.optJSONObject("preprocessor_flags");
        this.f9184k = jSONObjectOptJSONObject == null ? new JSONObject() : jSONObjectOptJSONObject;
        this.f9185l = jSONObject.optString("analytics_query_ad_event_id");
        jSONObject.optBoolean("is_analytics_logging_enabled");
        this.f9186m = jSONObject.optString("pool_key");
    }

    private static boolean j(String str) {
        return str != null && (str.equals("1") || str.equals("true"));
    }

    public final int a() {
        return this.f9183j;
    }

    public final List<String> b() {
        return this.a;
    }

    public final String c() {
        return this.f9175b;
    }

    public final String d() {
        return this.f9176c;
    }

    public final String e() {
        return this.f9182i;
    }

    public final boolean f() {
        return this.f9178e;
    }

    public final boolean g() {
        return this.f9179f;
    }

    public final JSONObject h() {
        return this.f9184k;
    }

    public final String i() {
        return this.f9186m;
    }
}