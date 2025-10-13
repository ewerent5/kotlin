package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.zzs;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final /* synthetic */ class wc {
    public static void a(xc xcVar, String str, JSONObject jSONObject) {
        xcVar.o(str, jSONObject.toString());
    }

    public static void b(xc xcVar, String str, String str2) {
        StringBuilder sb = new StringBuilder(str.length() + 3 + String.valueOf(str2).length());
        sb.append(str);
        sb.append("(");
        sb.append(str2);
        sb.append(");");
        xcVar.zza(sb.toString());
    }

    public static void c(xc xcVar, String str, JSONObject jSONObject) {
        String string = jSONObject.toString();
        StringBuilder sb = new StringBuilder();
        sb.append("(window.AFMA_ReceiveMessage || function() {})('");
        sb.append(str);
        sb.append("',");
        sb.append(string);
        sb.append(");");
        String strValueOf = String.valueOf(sb.toString());
        er.zzd(strValueOf.length() != 0 ? "Dispatching AFMA event: ".concat(strValueOf) : new String("Dispatching AFMA event: "));
        xcVar.zza(sb.toString());
    }

    public static void d(xc xcVar, String str, Map map) {
        try {
            xcVar.a(str, zzs.zzc().zzf(map));
        } catch (JSONException unused) {
            er.zzi("Could not convert parameters to JSON.");
        }
    }
}