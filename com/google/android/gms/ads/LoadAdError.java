package com.google.android.gms.ads;

import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.w3;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class LoadAdError extends AdError {
    private final ResponseInfo zza;

    public LoadAdError(int i2, @RecentlyNonNull String str, @RecentlyNonNull String str2, AdError adError, ResponseInfo responseInfo) {
        super(i2, str, str2, adError);
        this.zza = responseInfo;
    }

    @RecentlyNullable
    public ResponseInfo getResponseInfo() {
        if (((Boolean) c.c().b(w3.x5)).booleanValue()) {
            return this.zza;
        }
        return null;
    }

    @Override // com.google.android.gms.ads.AdError
    @RecentlyNonNull
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @Override // com.google.android.gms.ads.AdError
    @RecentlyNonNull
    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObjectZzb = super.zzb();
        ResponseInfo responseInfo = getResponseInfo();
        if (responseInfo == null) {
            jSONObjectZzb.put("Response Info", "null");
        } else {
            jSONObjectZzb.put("Response Info", responseInfo.zza());
        }
        return jSONObjectZzb;
    }
}