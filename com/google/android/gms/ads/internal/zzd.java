package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.e42;
import com.google.android.gms.internal.ads.g52;
import com.google.android.gms.internal.ads.y42;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzd implements e42 {
    static final e42 zza = new zzd();

    private zzd() {
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) throws JSONException {
        JSONObject jSONObject = (JSONObject) obj;
        if (jSONObject.optBoolean("isSuccessful", false)) {
            zzs.zzg().l().zzm(jSONObject.getString("appSettingsJson"));
        }
        return y42.a(null);
    }
}