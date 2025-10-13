package com.google.firebase.crashlytics.d.p;

import com.google.firebase.crashlytics.d.h.r;
import java.util.Locale;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: SettingsV3JsonTransform.java */
/* loaded from: classes.dex */
class h implements g {
    h() {
    }

    private static com.google.firebase.crashlytics.d.p.i.b b(JSONObject jSONObject, JSONObject jSONObject2) throws JSONException {
        String string = jSONObject2.getString("status");
        boolean zEquals = "new".equals(string);
        String string2 = jSONObject.getString("bundle_id");
        String string3 = jSONObject.getString("org_id");
        String str = zEquals ? "https://update.crashlytics.com/spi/v1/platforms/android/apps" : String.format(Locale.US, "https://update.crashlytics.com/spi/v1/platforms/android/apps/%s", string2);
        Locale locale = Locale.US;
        return new com.google.firebase.crashlytics.d.p.i.b(string, str, String.format(locale, "https://reports.crashlytics.com/spi/v1/platforms/android/apps/%s/reports", string2), String.format(locale, "https://reports.crashlytics.com/sdk-api/v1/platforms/android/apps/%s/minidumps", string2), string2, string3, jSONObject2.optBoolean("update_required", false), jSONObject2.optInt("report_upload_variant", 0), jSONObject2.optInt("native_report_upload_variant", 0));
    }

    private static com.google.firebase.crashlytics.d.p.i.c c(JSONObject jSONObject) {
        return new com.google.firebase.crashlytics.d.p.i.c(jSONObject.optBoolean("collect_reports", true));
    }

    private static com.google.firebase.crashlytics.d.p.i.d d() {
        return new com.google.firebase.crashlytics.d.p.i.d(8, 4);
    }

    private static long e(r rVar, long j2, JSONObject jSONObject) {
        return jSONObject.has("expires_at") ? jSONObject.optLong("expires_at") : rVar.a() + (j2 * 1000);
    }

    @Override // com.google.firebase.crashlytics.d.p.g
    public com.google.firebase.crashlytics.d.p.i.f a(r rVar, JSONObject jSONObject) throws JSONException {
        int iOptInt = jSONObject.optInt("settings_version", 0);
        int iOptInt2 = jSONObject.optInt("cache_duration", 3600);
        return new com.google.firebase.crashlytics.d.p.i.f(e(rVar, iOptInt2, jSONObject), b(jSONObject.getJSONObject("fabric"), jSONObject.getJSONObject("app")), d(), c(jSONObject.getJSONObject("features")), iOptInt, iOptInt2);
    }
}