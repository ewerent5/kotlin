package com.google.android.gms.ads.internal.util;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.internal.ads.c;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.g52;
import com.google.android.gms.internal.ads.w3;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import javax.annotation.concurrent.GuardedBy;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzan {
    private final Object zzb = new Object();

    @GuardedBy("lock")
    private String zzc = "";

    @GuardedBy("lock")
    private String zzd = "";

    @GuardedBy("lock")
    private boolean zze = false;
    protected String zza = "";

    protected static final String zzh(Context context, String str, String str2) {
        HashMap map = new HashMap();
        map.put("User-Agent", com.google.android.gms.ads.internal.zzs.zzc().zze(context, str2));
        g52<String> g52VarZzb = new zzbe(context).zzb(0, str, map, null);
        try {
            return g52VarZzb.get(((Integer) c.c().b(w3.V2)).intValue(), TimeUnit.MILLISECONDS);
        } catch (InterruptedException e2) {
            String strValueOf = String.valueOf(str);
            er.zzg(strValueOf.length() != 0 ? "Interrupted while retrieving a response from: ".concat(strValueOf) : new String("Interrupted while retrieving a response from: "), e2);
            g52VarZzb.cancel(true);
            return null;
        } catch (TimeoutException e3) {
            String strValueOf2 = String.valueOf(str);
            er.zzg(strValueOf2.length() != 0 ? "Timeout while retrieving a response from: ".concat(strValueOf2) : new String("Timeout while retrieving a response from: "), e3);
            g52VarZzb.cancel(true);
            return null;
        } catch (Exception e4) {
            String strValueOf3 = String.valueOf(str);
            er.zzg(strValueOf3.length() != 0 ? "Error retrieving a response from: ".concat(strValueOf3) : new String("Error retrieving a response from: "), e4);
            return null;
        }
    }

    private final void zzi(Context context, String str, String str2) {
        com.google.android.gms.ads.internal.zzs.zzc();
        zzr.zzV(context, zzj(context, (String) c.c().b(w3.R2), str, str2));
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0064 A[Catch: all -> 0x007b, TryCatch #2 {, blocks: (B:4:0x000b, B:6:0x0013, B:7:0x0018, B:10:0x0030, B:12:0x0038, B:14:0x004d, B:17:0x005f, B:9:0x0029, B:18:0x0064, B:19:0x0066), top: B:29:0x000b, inners: #0, #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private final android.net.Uri zzj(android.content.Context r5, java.lang.String r6, java.lang.String r7, java.lang.String r8) {
        /*
            r4 = this;
            android.net.Uri r6 = android.net.Uri.parse(r6)
            android.net.Uri$Builder r6 = r6.buildUpon()
            java.lang.Object r0 = r4.zzb
            monitor-enter(r0)
            java.lang.String r1 = r4.zzc     // Catch: java.lang.Throwable -> L7b
            boolean r1 = android.text.TextUtils.isEmpty(r1)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L64
            com.google.android.gms.ads.internal.zzs.zzc()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = "debug_signals_id.txt"
            java.io.FileInputStream r1 = r5.openFileInput(r1)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            java.lang.String r2 = new java.lang.String     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            r3 = 1
            byte[] r1 = com.google.android.gms.common.util.l.d(r1, r3)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            java.lang.String r3 = "UTF-8"
            r2.<init>(r1, r3)     // Catch: java.io.IOException -> L29 java.lang.Throwable -> L7b
            goto L30
        L29:
            java.lang.String r1 = "Error reading from internal storage."
            com.google.android.gms.internal.ads.er.zzd(r1)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = ""
        L30:
            r4.zzc = r2     // Catch: java.lang.Throwable -> L7b
            boolean r1 = android.text.TextUtils.isEmpty(r2)     // Catch: java.lang.Throwable -> L7b
            if (r1 == 0) goto L64
            com.google.android.gms.ads.internal.zzs.zzc()     // Catch: java.lang.Throwable -> L7b
            java.util.UUID r1 = java.util.UUID.randomUUID()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r1.toString()     // Catch: java.lang.Throwable -> L7b
            r4.zzc = r1     // Catch: java.lang.Throwable -> L7b
            com.google.android.gms.ads.internal.zzs.zzc()     // Catch: java.lang.Throwable -> L7b
            java.lang.String r1 = r4.zzc     // Catch: java.lang.Throwable -> L7b
            java.lang.String r2 = "debug_signals_id.txt"
            r3 = 0
            java.io.FileOutputStream r5 = r5.openFileOutput(r2, r3)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            java.lang.String r2 = "UTF-8"
            byte[] r1 = r1.getBytes(r2)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            r5.write(r1)     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            r5.close()     // Catch: java.lang.Exception -> L5e java.lang.Throwable -> L7b
            goto L64
        L5e:
            r5 = move-exception
            java.lang.String r1 = "Error writing to file in internal storage."
            com.google.android.gms.internal.ads.er.zzg(r1, r5)     // Catch: java.lang.Throwable -> L7b
        L64:
            java.lang.String r5 = r4.zzc     // Catch: java.lang.Throwable -> L7b
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            java.lang.String r0 = "linkedDeviceId"
            r6.appendQueryParameter(r0, r5)
            java.lang.String r5 = "adSlotPath"
            r6.appendQueryParameter(r5, r7)
            java.lang.String r5 = "afmaVersion"
            r6.appendQueryParameter(r5, r8)
            android.net.Uri r5 = r6.build()
            return r5
        L7b:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L7b
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.ads.internal.util.zzan.zzj(android.content.Context, java.lang.String, java.lang.String, java.lang.String):android.net.Uri");
    }

    public final void zza(Context context, String str, String str2) {
        String strZzh = zzh(context, zzj(context, (String) c.c().b(w3.S2), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzh)) {
            er.zzd("Not linked for in app preview.");
        } else {
            try {
                JSONObject jSONObject = new JSONObject(strZzh.trim());
                String strOptString = jSONObject.optString("gct");
                this.zza = jSONObject.optString("status");
                synchronized (this.zzb) {
                    this.zzd = strOptString;
                }
                if ("2".equals(this.zza)) {
                    er.zzd("Creative is not pushed for this device.");
                    zzg(context, "There was no creative pushed from DFP to the device.", false, false);
                    return;
                } else if ("1".equals(this.zza)) {
                    er.zzd("The app is not linked for creative preview.");
                    zzi(context, str, str2);
                    return;
                } else {
                    if ("0".equals(this.zza)) {
                        er.zzd("Device is linked for in app preview.");
                        zzg(context, "The device is successfully linked for creative preview.", false, true);
                        return;
                    }
                    return;
                }
            } catch (JSONException e2) {
                er.zzj("Fail to get in app preview response json.", e2);
            }
        }
        zzg(context, "In-app preview failed to load because of a system error. Please try again later.", true, true);
    }

    public final void zzb(Context context, String str, String str2, String str3) {
        boolean zZzf = zzf();
        String strZzh = zzh(context, zzj(context, (String) c.c().b(w3.T2), str, str2).toString(), str2);
        if (TextUtils.isEmpty(strZzh)) {
            er.zzd("Not linked for debug signals.");
        } else {
            try {
                boolean zEquals = "1".equals(new JSONObject(strZzh.trim()).optString("debug_mode"));
                synchronized (this.zzb) {
                    this.zze = zEquals;
                }
                if (zEquals) {
                    if (!zZzf && !TextUtils.isEmpty(str3)) {
                        zzd(context, str2, str3, str);
                    }
                    er.zzd("Device is linked for debug signals.");
                    zzg(context, "The device is successfully linked for troubleshooting.", false, true);
                    return;
                }
            } catch (JSONException e2) {
                er.zzj("Fail to get debug mode response json.", e2);
            }
        }
        zzi(context, str, str2);
    }

    public final boolean zzc(Context context, String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || !com.google.android.gms.ads.internal.zzs.zzm().zzf()) {
            return false;
        }
        er.zzd("Sending troubleshooting signals to the server.");
        zzd(context, str, str2, str3);
        return true;
    }

    public final void zzd(Context context, String str, String str2, String str3) {
        Uri.Builder builderBuildUpon = zzj(context, (String) c.c().b(w3.U2), str3, str).buildUpon();
        builderBuildUpon.appendQueryParameter("debugData", str2);
        com.google.android.gms.ads.internal.zzs.zzc();
        zzr.zzL(context, str, builderBuildUpon.build().toString());
    }

    public final String zze() {
        String str;
        synchronized (this.zzb) {
            str = this.zzd;
        }
        return str;
    }

    public final boolean zzf() {
        boolean z;
        synchronized (this.zzb) {
            z = this.zze;
        }
        return z;
    }

    protected final void zzg(Context context, String str, boolean z, boolean z2) {
        if (context instanceof Activity) {
            zzr.zza.post(new zzam(this, context, str, z, z2));
        } else {
            er.zzh("Can not create dialog without Activity Context");
        }
    }
}