package com.google.android.gms.ads.internal;

import android.content.Context;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.e42;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.g52;
import com.google.android.gms.internal.ads.h52;
import com.google.android.gms.internal.ads.ke;
import com.google.android.gms.internal.ads.kq;
import com.google.android.gms.internal.ads.kr;
import com.google.android.gms.internal.ads.oe;
import com.google.android.gms.internal.ads.qr;
import com.google.android.gms.internal.ads.se;
import com.google.android.gms.internal.ads.tr;
import com.google.android.gms.internal.ads.ve;
import com.google.android.gms.internal.ads.w3;
import com.google.android.gms.internal.ads.y42;
import javax.annotation.ParametersAreNonnullByDefault;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@ParametersAreNonnullByDefault
/* loaded from: classes.dex */
public final class zze {
    private Context zza;
    private long zzb = 0;

    public final void zza(Context context, kr krVar, String str, Runnable runnable) throws JSONException {
        zzc(context, krVar, true, null, str, null, runnable);
    }

    public final void zzb(Context context, kr krVar, String str, kq kqVar) throws JSONException {
        zzc(context, krVar, false, kqVar, kqVar != null ? kqVar.e() : null, str, null);
    }

    final void zzc(Context context, kr krVar, boolean z, kq kqVar, String str, String str2, Runnable runnable) throws JSONException {
        if (zzs.zzj().c() - this.zzb < 5000) {
            er.zzi("Not retrying to fetch app settings");
            return;
        }
        this.zzb = zzs.zzj().c();
        if (kqVar != null) {
            long jB = kqVar.b();
            if (zzs.zzj().a() - jB <= ((Long) c.c().b(w3.m2)).longValue() && kqVar.c()) {
                return;
            }
        }
        if (context == null) {
            er.zzi("Context not provided to fetch application settings");
            return;
        }
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(str2)) {
            er.zzi("App settings could not be fetched. Required parameters missing");
            return;
        }
        Context applicationContext = context.getApplicationContext();
        if (applicationContext == null) {
            applicationContext = context;
        }
        this.zza = applicationContext;
        ve veVarB = zzs.zzp().b(this.zza, krVar);
        oe<JSONObject> oeVar = se.f8855b;
        ke keVarA = veVarB.a("google.afma.config.fetchAppSettings", oeVar, oeVar);
        try {
            JSONObject jSONObject = new JSONObject();
            if (!TextUtils.isEmpty(str)) {
                jSONObject.put("app_id", str);
            } else if (!TextUtils.isEmpty(str2)) {
                jSONObject.put("ad_unit_id", str2);
            }
            jSONObject.put("is_init", z);
            jSONObject.put("pn", context.getPackageName());
            g52 g52VarZzb = keVarA.zzb(jSONObject);
            e42 e42Var = zzd.zza;
            h52 h52Var = qr.f8451f;
            g52 g52VarH = y42.h(g52VarZzb, e42Var, h52Var);
            if (runnable != null) {
                g52VarZzb.zze(runnable, h52Var);
            }
            tr.a(g52VarH, "ConfigLoader.maybeFetchNewAppSettings");
        } catch (Exception e2) {
            er.zzg("Error requesting application settings", e2);
        }
    }
}