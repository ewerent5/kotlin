package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.util.zzbk;
import com.google.android.gms.ads.internal.util.zze;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ai1 implements zg1<JSONObject> {
    private final JSONObject a;

    public ai1(JSONObject jSONObject) {
        this.a = jSONObject;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectZzg = zzbk.zzg(jSONObject, "content_info");
            JSONObject jSONObject2 = this.a;
            Iterator<String> itKeys = jSONObject2.keys();
            while (itKeys.hasNext()) {
                String next = itKeys.next();
                jSONObjectZzg.put(next, jSONObject2.get(next));
            }
        } catch (JSONException unused) {
            zze.zza("Failed putting app indexing json.");
        }
    }
}