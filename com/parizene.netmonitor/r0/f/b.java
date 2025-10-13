package com.parizene.netmonitor.r0.f;

import com.parizene.netmonitor.r0.c;
import okhttp3.HttpUrl;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: MylnikovGeolocationClient.java */
/* loaded from: classes3.dex */
public class b implements com.parizene.netmonitor.r0.a {
    private final OkHttpClient a;

    /* renamed from: b */
    private final boolean f13653b;

    public b(OkHttpClient okHttpClient, boolean z) {
        this.a = okHttpClient;
        this.f13653b = z;
    }

    @Override // com.parizene.netmonitor.r0.a
    public com.parizene.netmonitor.r0.b a(c cVar) throws JSONException {
        HttpUrl.Builder builderAddQueryParameter = HttpUrl.parse("https://api.mylnikov.org/geolocation/cell").newBuilder().addQueryParameter("mcc", String.valueOf(cVar.a)).addQueryParameter("mnc", String.valueOf(cVar.f13643b)).addQueryParameter("lac", String.valueOf(cVar.f13644c)).addQueryParameter("cellid", String.valueOf(cVar.f13645d)).addQueryParameter("v", "1.1");
        if (this.f13653b) {
            builderAddQueryParameter.addQueryParameter("data", "open");
        }
        try {
            Response responseExecute = this.a.newCall(new Request.Builder().url(builderAddQueryParameter.build()).build()).execute();
            if (!responseExecute.isSuccessful()) {
                return null;
            }
            JSONObject jSONObject = new JSONObject(responseExecute.body().string());
            if (200 != jSONObject.getInt("result")) {
                return new a();
            }
            JSONObject jSONObject2 = jSONObject.getJSONObject("data");
            return new a(jSONObject2.getDouble("lat"), jSONObject2.getDouble("lon"), jSONObject2.getDouble("range"));
        } catch (Exception e2) {
            m.a.a.g(e2);
            return null;
        }
    }
}