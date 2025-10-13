package com.google.android.gms.ads;

import android.os.RemoteException;
import androidx.annotation.RecentlyNonNull;
import androidx.annotation.RecentlyNullable;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.k1;
import com.google.android.gms.internal.ads.w3;
import com.google.android.gms.internal.ads.w93;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class ResponseInfo {
    private final k1 zza;
    private final List<AdapterResponseInfo> zzb = new ArrayList();

    private ResponseInfo(k1 k1Var) {
        this.zza = k1Var;
        if (!((Boolean) c.c().b(w3.x5)).booleanValue() || k1Var == null) {
            return;
        }
        try {
            List<w93> listZzg = k1Var.zzg();
            if (listZzg != null) {
                Iterator<w93> it = listZzg.iterator();
                while (it.hasNext()) {
                    AdapterResponseInfo adapterResponseInfoZza = AdapterResponseInfo.zza(it.next());
                    if (adapterResponseInfoZza != null) {
                        this.zzb.add(adapterResponseInfoZza);
                    }
                }
            }
        } catch (RemoteException e2) {
            er.zzg("Could not forward getAdapterResponseInfo to ResponseInfo.", e2);
        }
    }

    public static ResponseInfo zzb(k1 k1Var) {
        if (k1Var != null) {
            return new ResponseInfo(k1Var);
        }
        return null;
    }

    public static ResponseInfo zzc(k1 k1Var) {
        return new ResponseInfo(k1Var);
    }

    public List<AdapterResponseInfo> getAdapterResponses() {
        return this.zzb;
    }

    @RecentlyNullable
    public String getMediationAdapterClassName() {
        try {
            k1 k1Var = this.zza;
            if (k1Var != null) {
                return k1Var.zze();
            }
            return null;
        } catch (RemoteException e2) {
            er.zzg("Could not forward getMediationAdapterClassName to ResponseInfo.", e2);
            return null;
        }
    }

    @RecentlyNullable
    public String getResponseId() {
        try {
            k1 k1Var = this.zza;
            if (k1Var != null) {
                return k1Var.zzf();
            }
            return null;
        } catch (RemoteException e2) {
            er.zzg("Could not forward getResponseId to ResponseInfo.", e2);
            return null;
        }
    }

    @RecentlyNonNull
    public String toString() {
        try {
            return zza().toString(2);
        } catch (JSONException unused) {
            return "Error forming toString output.";
        }
    }

    @RecentlyNonNull
    public final JSONObject zza() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        String responseId = getResponseId();
        if (responseId == null) {
            jSONObject.put("Response ID", "null");
        } else {
            jSONObject.put("Response ID", responseId);
        }
        String mediationAdapterClassName = getMediationAdapterClassName();
        if (mediationAdapterClassName == null) {
            jSONObject.put("Mediation Adapter Class Name", "null");
        } else {
            jSONObject.put("Mediation Adapter Class Name", mediationAdapterClassName);
        }
        JSONArray jSONArray = new JSONArray();
        Iterator<AdapterResponseInfo> it = this.zzb.iterator();
        while (it.hasNext()) {
            jSONArray.put(it.next().zzb());
        }
        jSONObject.put("Adapter Responses", jSONArray);
        return jSONObject;
    }
}