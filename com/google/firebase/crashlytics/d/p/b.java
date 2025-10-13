package com.google.firebase.crashlytics.d.p;

import com.google.firebase.crashlytics.d.h.r;
import org.json.JSONObject;

/* compiled from: DefaultSettingsJsonTransform.java */
/* loaded from: classes.dex */
class b implements g {
    b() {
    }

    private static com.google.firebase.crashlytics.d.p.i.b b(JSONObject jSONObject) {
        return new com.google.firebase.crashlytics.d.p.i.b(jSONObject.getString("status"), jSONObject.getString("url"), jSONObject.getString("reports_url"), jSONObject.getString("ndk_reports_url"), jSONObject.optBoolean("update_required", false));
    }

    private static com.google.firebase.crashlytics.d.p.i.c c(JSONObject jSONObject) {
        return new com.google.firebase.crashlytics.d.p.i.c(jSONObject.optBoolean("collect_reports", true));
    }

    private static com.google.firebase.crashlytics.d.p.i.d d(JSONObject jSONObject) {
        return new com.google.firebase.crashlytics.d.p.i.d(jSONObject.optInt("max_custom_exception_events", 8), 4);
    }

    static com.google.firebase.crashlytics.d.p.i.e e(r rVar) {
        JSONObject jSONObject = new JSONObject();
        return new com.google.firebase.crashlytics.d.p.i.f(f(rVar, 3600L, jSONObject), null, d(jSONObject), c(jSONObject), 0, 3600);
    }

    private static long f(r rVar, long j2, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : rVar.a() + (j2 * 1000);
    }

    @Override // com.google.firebase.crashlytics.d.p.g
    public com.google.firebase.crashlytics.d.p.i.f a(r rVar, JSONObject jSONObject) {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new com.google.firebase.crashlytics.d.p.i.f(f(rVar, iOptInt2, jSONObject), b(jSONObject.getJSONObject("app")), d(jSONObject.getJSONObject("session")), c(jSONObject.getJSONObject("features")), iOptInt, iOptInt2);
    }
}