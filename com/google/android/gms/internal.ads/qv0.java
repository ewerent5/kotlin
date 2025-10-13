package com.google.android.gms.internal.ads;

import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class qv0 {
    private Long a;

    /* renamed from: b, reason: collision with root package name */
    private final String f8483b;

    /* renamed from: c, reason: collision with root package name */
    private String f8484c;

    /* renamed from: d, reason: collision with root package name */
    private Integer f8485d;

    /* renamed from: e, reason: collision with root package name */
    private String f8486e;

    /* renamed from: f, reason: collision with root package name */
    private Integer f8487f;

    /* synthetic */ qv0(String str, pv0 pv0Var) {
        this.f8483b = str;
    }

    static /* synthetic */ String a(qv0 qv0Var) throws JSONException {
        String str = (String) c.c().b(w3.i6);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("objectId", qv0Var.a);
            jSONObject.put("eventCategory", qv0Var.f8483b);
            jSONObject.putOpt("event", qv0Var.f8484c);
            jSONObject.putOpt("errorCode", qv0Var.f8485d);
            jSONObject.putOpt("rewardType", qv0Var.f8486e);
            jSONObject.putOpt("rewardAmount", qv0Var.f8487f);
        } catch (JSONException unused) {
            er.zzi("Could not convert parameters to JSON.");
        }
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 16 + String.valueOf(string).length());
        sb.append(str);
        sb.append("(\"h5adsEvent\",");
        sb.append(string);
        sb.append(");");
        return sb.toString();
    }
}