package com.parizene.netmonitor.r0.h;

import com.parizene.netmonitor.r0.c;
import okhttp3.FormBody;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: YandexGeolocationClient.java */
/* loaded from: classes3.dex */
public class b implements com.parizene.netmonitor.r0.a {
    private final OkHttpClient a;

    /* renamed from: b */
    private final String f13662b;

    public b(OkHttpClient okHttpClient, String str) {
        this.a = okHttpClient;
        this.f13662b = str;
    }

    private String b(c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("countrycode", cVar.a);
        jSONObject.put("operatorid", cVar.f13643b);
        jSONObject.put("lac", cVar.f13644c);
        jSONObject.put("cellid", cVar.f13645d);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject);
        return c("gsm_cells", jSONArray);
    }

    private String c(String str, Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", "1.0");
        jSONObject.put("api_key", this.f13662b);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("common", jSONObject);
        jSONObject2.put(str, obj);
        return jSONObject2.toString();
    }

    private a d(String str, String str2) throws JSONException {
        Response responseExecute = this.a.newCall(new Request.Builder().url("http://api.lbs.yandex.net/geolocation").post(new FormBody.Builder().add("json", str).build()).build()).execute();
        if (!responseExecute.isSuccessful()) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(responseExecute.body().string());
        if (jSONObject.has("position")) {
            JSONObject jSONObject2 = jSONObject.getJSONObject("position");
            return str2.equals(jSONObject2.getString("type")) ? new a(jSONObject2.getDouble("latitude"), jSONObject2.getDouble("longitude"), jSONObject2.getDouble("precision"), jSONObject2.getDouble("altitude"), jSONObject2.getDouble("altitude_precision")) : new a();
        }
        if (jSONObject.has("error") && jSONObject.getJSONObject("error").getInt("code") == 6) {
            return new a();
        }
        return null;
    }

    @Override // com.parizene.netmonitor.r0.a
    public com.parizene.netmonitor.r0.b a(c cVar) {
        try {
            return d(b(cVar), "gsm");
        } catch (Exception e2) {
            m.a.a.g(e2);
            return null;
        }
    }
}