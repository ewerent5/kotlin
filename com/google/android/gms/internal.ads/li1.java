package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class li1 implements zg1<JSONObject> {
    private final JSONObject a;

    public li1(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("cache_state", this.a);
        } catch (JSONException unused) {
            zze.zza("Unable to get cache_state");
        }
    }
}