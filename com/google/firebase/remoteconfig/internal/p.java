package com.google.firebase.remoteconfig.internal;

import android.os.Bundle;
import org.json.JSONObject;

/* compiled from: Personalization.java */
/* loaded from: classes.dex */
public class p {
    private final com.google.firebase.analytics.a.a a;

    public p(com.google.firebase.analytics.a.a aVar) {
        this.a = aVar;
    }

    public void a(String str, f fVar) {
        JSONObject jSONObjectOptJSONObject;
        JSONObject jSONObjectF = fVar.f();
        if (jSONObjectF.length() < 1) {
            return;
        }
        JSONObject jSONObjectD = fVar.d();
        if (jSONObjectD.length() >= 1 && (jSONObjectOptJSONObject = jSONObjectF.optJSONObject(str)) != null) {
            Bundle bundle = new Bundle();
            bundle.putString("_fpid", jSONObjectOptJSONObject.optString("personalizationId"));
            bundle.putString("_fpct", jSONObjectD.optString(str));
            this.a.c("fp", "_fpc", bundle);
        }
    }
}