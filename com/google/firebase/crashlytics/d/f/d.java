package com.google.firebase.crashlytics.d.f;

import android.os.Bundle;
import ch.qos.logback.core.joran.action.Action;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: BreadcrumbAnalyticsEventReceiver.java */
/* loaded from: classes.dex */
public class d implements b, com.google.firebase.crashlytics.d.g.b {
    private com.google.firebase.crashlytics.d.g.a a;

    private static String c(String str, Bundle bundle) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        for (String str2 : bundle.keySet()) {
            jSONObject2.put(str2, bundle.get(str2));
        }
        jSONObject.put(Action.NAME_ATTRIBUTE, str);
        jSONObject.put("parameters", jSONObject2);
        return jSONObject.toString();
    }

    @Override // com.google.firebase.crashlytics.d.g.b
    public void a(com.google.firebase.crashlytics.d.g.a aVar) {
        this.a = aVar;
        com.google.firebase.crashlytics.d.b.f().b("Registered Firebase Analytics event receiver for breadcrumbs");
    }

    @Override // com.google.firebase.crashlytics.d.f.b
    public void b(String str, Bundle bundle) {
        com.google.firebase.crashlytics.d.g.a aVar = this.a;
        if (aVar != null) {
            try {
                aVar.a("$A$:" + c(str, bundle));
            } catch (JSONException unused) {
                com.google.firebase.crashlytics.d.b.f().i("Unable to serialize Firebase Analytics event to breadcrumb.");
            }
        }
    }
}