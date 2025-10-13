package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.util.zze;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class gq1 {
    public static void a(int i2, Throwable th, String str) {
        StringBuilder sb = new StringBuilder(31);
        sb.append("Ad failed to load : ");
        sb.append(i2);
        er.zzh(sb.toString());
        zze.zzb(str, th);
        if (i2 == 3) {
            return;
        }
        zzs.zzg().h(th, str);
    }

    public static void b(Context context, boolean z) {
        if (z) {
            er.zzh("This request is sent from a test device.");
            return;
        }
        ta3.a();
        String strT = xq.t(context);
        StringBuilder sb = new StringBuilder(String.valueOf(strT).length() + 102);
        sb.append("Use RequestConfiguration.Builder().setTestDeviceIds(Arrays.asList(\"");
        sb.append(strT);
        sb.append("\")) to get test ads on this device.");
        er.zzh(sb.toString());
    }
}