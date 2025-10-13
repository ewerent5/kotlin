package com.google.android.gms.internal.ads;

import android.content.Context;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class mp {
    public static String a(String str, Context context, boolean z) {
        String strQ;
        if ((((Boolean) c.c().b(w3.g0)).booleanValue() && !z) || !zzs.zzA().g(context) || TextUtils.isEmpty(str) || (strQ = zzs.zzA().q(context)) == null) {
            return str;
        }
        if (!((Boolean) c.c().b(w3.Y)).booleanValue()) {
            if (str.contains("fbs_aeid")) {
                return str;
            }
            if (zzs.zzc().zzl(str)) {
                zzs.zzA().s(context, strQ);
                return c(d(str, context), "fbs_aeid", strQ).toString();
            }
            if (!zzs.zzc().zzm(str)) {
                return str;
            }
            zzs.zzA().t(context, strQ);
            return c(d(str, context), "fbs_aeid", strQ).toString();
        }
        String str2 = (String) c.c().b(w3.Z);
        if (!str.contains(str2)) {
            return str;
        }
        if (zzs.zzc().zzl(str)) {
            zzs.zzA().s(context, strQ);
            return d(str, context).replace(str2, strQ);
        }
        if (!zzs.zzc().zzm(str)) {
            return str;
        }
        zzs.zzA().t(context, strQ);
        return d(str, context).replace(str2, strQ);
    }

    public static String b(Uri uri, Context context) {
        if (!zzs.zzA().g(context)) {
            return uri.toString();
        }
        String strQ = zzs.zzA().q(context);
        if (strQ == null) {
            return uri.toString();
        }
        if (((Boolean) c.c().b(w3.Y)).booleanValue()) {
            String str = (String) c.c().b(w3.Z);
            String string = uri.toString();
            if (string.contains(str)) {
                zzs.zzA().s(context, strQ);
                return d(string, context).replace(str, strQ);
            }
        } else if (TextUtils.isEmpty(uri.getQueryParameter("fbs_aeid"))) {
            String string2 = c(d(uri.toString(), context), "fbs_aeid", strQ).toString();
            zzs.zzA().s(context, strQ);
            return string2;
        }
        return uri.toString();
    }

    static Uri c(String str, String str2, String str3) {
        int iIndexOf = str.indexOf("&adurl");
        if (iIndexOf == -1) {
            iIndexOf = str.indexOf("?adurl");
        }
        if (iIndexOf == -1) {
            return Uri.parse(str).buildUpon().appendQueryParameter(str2, str3).build();
        }
        int i2 = iIndexOf + 1;
        return Uri.parse(str.substring(0, i2) + str2 + "=" + str3 + "&" + str.substring(i2));
    }

    private static String d(String str, Context context) {
        String strO = zzs.zzA().o(context);
        String strP = zzs.zzA().p(context);
        if (!str.contains("gmp_app_id") && !TextUtils.isEmpty(strO)) {
            str = c(str, "gmp_app_id", strO).toString();
        }
        return (str.contains("fbs_aiid") || TextUtils.isEmpty(strP)) ? str : c(str, "fbs_aiid", strP).toString();
    }
}