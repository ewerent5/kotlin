package com.parizene.netmonitor.r0.g;

import com.parizene.netmonitor.r0.c;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: OpencellidGeolocationClient.java */
/* loaded from: classes3.dex */
public class b implements com.parizene.netmonitor.r0.a {
    private final OkHttpClient a;

    /* renamed from: b */
    private final String f13657b;

    public b(OkHttpClient okHttpClient, String str) {
        this.a = okHttpClient;
        this.f13657b = str;
    }

    private String b(c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("token", this.f13657b);
        jSONObject.put("mcc", cVar.a);
        jSONObject.put("mnc", cVar.f13643b);
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("lac", cVar.f13644c);
        jSONObject2.put("cid", cVar.f13645d);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject2);
        jSONObject.put("cells", jSONArray);
        jSONObject.put("address", 1);
        return jSONObject.toString();
    }

    @Override // com.parizene.netmonitor.r0.a
    /* renamed from: c */
    public a a(c cVar) throws JSONException {
        try {
            Response responseExecute = this.a.newCall(new Request.Builder().url("https://eu1.unwiredlabs.com/v2/process.php").post(RequestBody.create(MediaType.parse("application/json; charset=utf-8"), b(cVar))).build()).execute();
            if (!responseExecute.isSuccessful()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(responseExecute.body().string());
            String string = jSONObject.getString("status");
            jSONObject.getString("balance");
            if ("ok".equals(string)) {
                return new a(jSONObject.getDouble("lat"), jSONObject.getDouble("lon"), jSONObject.getInt("accuracy"), jSONObject.getString("address"));
            }
            if (!"error".equals(string) || !jSONObject.has("message")) {
                return null;
            }
            String strOptString = jSONObject.optString("message");
            if ("No matches found".equals(strOptString) || "No valid cell IDs or LACs provided".equals(strOptString)) {
                return new a();
            }
            return null;
        } catch (Exception e2) {
            m.a.a.g(e2);
            return null;
        }
    }
}