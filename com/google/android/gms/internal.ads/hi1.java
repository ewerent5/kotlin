package com.google.android.gms.internal.ads;

import android.text.TextUtils;
import com.google.android.gms.ads.internal.util.zzbk;
import com.google.android.gms.ads.internal.util.zze;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class hi1 implements zg1<JSONObject> {
    private final String a;

    public hi1(String str) {
        this.a = str;
    }

    @Override // com.google.android.gms.internal.ads.zg1
    public final /* bridge */ /* synthetic */ void a(JSONObject jSONObject) throws JSONException {
        try {
            JSONObject jSONObjectZzg = zzbk.zzg(jSONObject, "pii");
            if (TextUtils.isEmpty(this.a)) {
                return;
            }
            jSONObjectZzg.put("attok", this.a);
        } catch (JSONException e2) {
            zze.zzb("Failed putting attestation token.", e2);
        }
    }
}