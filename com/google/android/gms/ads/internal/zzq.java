package com.google.android.gms.ads.internal;

import android.content.Context;
import android.os.Bundle;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.internal.ads.b5;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.kr;
import com.google.android.gms.internal.ads.m93;
import com.google.android.gms.internal.ads.xg1;
import java.util.Map;
import java.util.TreeMap;
import org.json.JSONArray;
import org.json.JSONException;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzq {
    private final Context zza;
    private final String zzb;
    private final Map<String, String> zzc = new TreeMap();
    private String zzd;
    private String zze;

    public zzq(Context context, String str) {
        this.zza = context.getApplicationContext();
        this.zzb = str;
    }

    public final String zza() {
        return this.zze;
    }

    public final String zzb() {
        return this.zzd;
    }

    public final String zzc() {
        return this.zzb;
    }

    public final Map<String, String> zzd() {
        return this.zzc;
    }

    public final void zze(m93 m93Var, kr krVar) {
        this.zzd = m93Var.n.f10528e;
        Bundle bundle = m93Var.q;
        Bundle bundle2 = bundle != null ? bundle.getBundle(AdMobAdapter.class.getName()) : null;
        if (bundle2 == null) {
            return;
        }
        String strE = b5.f5072c.e();
        for (String str : bundle2.keySet()) {
            if (strE.equals(str)) {
                this.zze = bundle2.getString(str);
            } else if (str.startsWith("csa_")) {
                this.zzc.put(str.substring(4), bundle2.getString(str));
            }
        }
        this.zzc.put("SDKVersion", krVar.f7054e);
        if (b5.a.e().booleanValue()) {
            try {
                Bundle bundleA = xg1.a(this.zza, new JSONArray(b5.f5071b.e()));
                for (String str2 : bundleA.keySet()) {
                    this.zzc.put(str2, bundleA.get(str2).toString());
                }
            } catch (JSONException e2) {
                er.zzg("Flag gads:afs:csa_tcf_data_to_collect not a valid JSON array", e2);
            }
        }
    }
}