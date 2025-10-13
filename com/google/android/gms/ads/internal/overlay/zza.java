package com.google.android.gms.ads.internal.overlay;

import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.w3;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zza {
    public static final boolean zza(Context context, Intent intent, zzw zzwVar, zzu zzuVar, boolean z) {
        if (z) {
            return zzc(context, intent.getData(), zzwVar, zzuVar);
        }
        try {
            String strValueOf = String.valueOf(intent.toURI());
            com.google.android.gms.ads.internal.util.zze.zza(strValueOf.length() != 0 ? "Launching an intent: ".concat(strValueOf) : new String("Launching an intent: "));
            com.google.android.gms.ads.internal.zzs.zzc();
            com.google.android.gms.ads.internal.util.zzr.zzN(context, intent);
            if (zzwVar != null) {
                zzwVar.zzf();
            }
            if (zzuVar != null) {
                zzuVar.zza(true);
            }
            return true;
        } catch (ActivityNotFoundException e2) {
            er.zzi(e2.getMessage());
            if (zzuVar != null) {
                zzuVar.zza(false);
            }
            return false;
        }
    }

    public static final boolean zzb(Context context, zzc zzcVar, zzw zzwVar, zzu zzuVar) throws NumberFormatException {
        int i2 = 0;
        if (zzcVar == null) {
            er.zzi("No intent data for launcher overlay.");
            return false;
        }
        w3.a(context);
        Intent intent = zzcVar.zzh;
        if (intent != null) {
            return zza(context, intent, zzwVar, zzuVar, zzcVar.zzj);
        }
        Intent intent2 = new Intent();
        if (TextUtils.isEmpty(zzcVar.zzb)) {
            er.zzi("Open GMSG did not contain a URL.");
            return false;
        }
        if (TextUtils.isEmpty(zzcVar.zzc)) {
            intent2.setData(Uri.parse(zzcVar.zzb));
        } else {
            intent2.setDataAndType(Uri.parse(zzcVar.zzb), zzcVar.zzc);
        }
        intent2.setAction("android.intent.action.VIEW");
        if (!TextUtils.isEmpty(zzcVar.zzd)) {
            intent2.setPackage(zzcVar.zzd);
        }
        if (!TextUtils.isEmpty(zzcVar.zze)) {
            String[] strArrSplit = zzcVar.zze.split("/", 2);
            if (strArrSplit.length < 2) {
                String strValueOf = String.valueOf(zzcVar.zze);
                er.zzi(strValueOf.length() != 0 ? "Could not parse component name from open GMSG: ".concat(strValueOf) : new String("Could not parse component name from open GMSG: "));
                return false;
            }
            intent2.setClassName(strArrSplit[0], strArrSplit[1]);
        }
        String str = zzcVar.zzf;
        if (!TextUtils.isEmpty(str)) {
            try {
                i2 = Integer.parseInt(str);
            } catch (NumberFormatException unused) {
                er.zzi("Could not parse intent flags.");
            }
            intent2.addFlags(i2);
        }
        if (((Boolean) c.c().b(w3.I2)).booleanValue()) {
            intent2.addFlags(268435456);
            intent2.putExtra("android.support.customtabs.extra.user_opt_out", true);
        } else {
            if (((Boolean) c.c().b(w3.H2)).booleanValue()) {
                com.google.android.gms.ads.internal.zzs.zzc();
                com.google.android.gms.ads.internal.util.zzr.zzu(context, intent2);
            }
        }
        return zza(context, intent2, zzwVar, zzuVar, zzcVar.zzj);
    }

    private static final boolean zzc(Context context, Uri uri, zzw zzwVar, zzu zzuVar) {
        int iZzs;
        try {
            iZzs = com.google.android.gms.ads.internal.zzs.zzc().zzs(context, uri);
            if (zzwVar != null) {
                zzwVar.zzf();
            }
        } catch (ActivityNotFoundException e2) {
            er.zzi(e2.getMessage());
            iZzs = 6;
        }
        if (zzuVar != null) {
            zzuVar.zzb(iZzs);
        }
        return iZzs == 5;
    }
}