package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zy0 implements e42 {
    private final cz0 a;

    /* renamed from: b */
    private final e93 f10662b;

    zy0(cz0 cz0Var, e93 e93Var) {
        this.a = cz0Var;
        this.f10662b = e93Var;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) throws JSONException {
        e93 e93Var = this.f10662b;
        String str = e93Var.f5603e;
        String str2 = e93Var.f5604f;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("headers", new JSONObject());
        jSONObject3.put("body", str);
        jSONObject2.put("base_url", "");
        jSONObject2.put("signals", new JSONObject(str2));
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", new JSONObject());
        return y42.a(jSONObject);
    }
}