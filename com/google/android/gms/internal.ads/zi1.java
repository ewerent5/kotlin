package com.google.android.gms.internal.ads;

import android.os.Bundle;
import com.google.android.gms.ads.internal.util.zzbk;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zi1 implements zg1<JSONObject> {
    private final Bundle a;

    public zi1(Bundle bundle) {
        this.a = bundle;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject) throws JSONException {
        JSONObject jSONObject2 = jSONObject;
        if (this.a != null) {
            try {
                zzbk.zzg(zzbk.zzg(jSONObject2, "device"), "play_store").put("parental_controls", zzs.zzc().zzh(this.a));
            } catch (JSONException unused) {
                zze.zza("Failed putting parental controls bundle.");
            }
        }
    }
}