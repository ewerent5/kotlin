package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mj1 implements zg1<JSONObject> {
    private final Map<String, Object> a;

    public mj1(Map<String, Object> map) {
        this.a = map;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject) throws JSONException {
        try {
            jSONObject.put("video_decoders", zzs.zzc().zzf(this.a));
        } catch (JSONException e2) {
            String strValueOf = String.valueOf(e2.getMessage());
            zze.zza(strValueOf.length() != 0 ? "Could not encode video decoder properties: ".concat(strValueOf) : new String("Could not encode video decoder properties: "));
        }
    }
}