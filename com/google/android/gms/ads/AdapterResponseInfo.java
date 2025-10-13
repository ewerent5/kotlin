package com.google.android.gms.ads;

import android.os.Bundle;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.g93;
import com.google.android.gms.internal.ads.w93;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class AdapterResponseInfo {
    private final w93 zza;
    private final AdError zzb;

    private AdapterResponseInfo(w93 w93Var) {
        this.zza = w93Var;
        g93 g93Var = w93Var.f9935g;
        this.zzb = g93Var == null ? null : g93Var.c();
    }

    public static AdapterResponseInfo zza(w93 w93Var) {
        if (w93Var != null) {
            return new AdapterResponseInfo(w93Var);
        }
        return null;
    }

    @RecentlyNullable
    public AdError getAdError() {
        return this.zzb;
    }

    @RecentlyNonNull
    public String getAdapterClassName() {
        return this.zza.f9933e;
    }

    @RecentlyNonNull
    public Bundle getCredentials() {
        return this.zza.f9936h;
    }

    public long getLatencyMillis() {
        return this.zza.f9934f;
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return zzb().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @RecentlyNonNull
    public final JSONObject zzb() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("Adapter", this.zza.f9933e);
        jSONObject.put("Latency", this.zza.f9934f);
        JSONObject jSONObject2 = new JSONObject();
        for (String str : this.zza.f9936h.keySet()) {
            jSONObject2.put(str, this.zza.f9936h.get(str));
        }
        jSONObject.put("Credentials", jSONObject2);
        AdError adError = this.zzb;
        if (adError == null) {
            jSONObject.put("Ad Error", "null");
        } else {
            jSONObject.put("Ad Error", adError.zzb());
        }
        return jSONObject;
    }
}