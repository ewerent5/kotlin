package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class t01 implements ne<u01> {
    t01() {
    }

    @Override // com.google.android.gms.internal.ads.ne
    public final /* bridge */ /* synthetic */ JSONObject zzb(u01 u01Var) throws JSONException {
        u01 u01Var2 = u01Var;
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        JSONObject jSONObject3 = new JSONObject();
        jSONObject2.put("base_url", u01Var2.f9329d.c());
        jSONObject2.put("signals", u01Var2.f9328c);
        jSONObject3.put("body", u01Var2.f9327b.f10328c);
        jSONObject3.put("headers", zzs.zzc().zzf(u01Var2.f9327b.f10327b));
        jSONObject3.put("response_code", u01Var2.f9327b.a);
        jSONObject3.put("latency", u01Var2.f9327b.f10329d);
        jSONObject.put("request", jSONObject2);
        jSONObject.put("response", jSONObject3);
        jSONObject.put("flags", u01Var2.f9329d.h());
        return jSONObject;
    }
}