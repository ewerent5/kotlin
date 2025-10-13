package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.dr;
import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.g52;
import com.google.android.gms.internal.ads.tr;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzd {
    public static void zza(Context context) {
        if (dr.k(context) && !dr.i()) {
            g52<?> g52VarZzb = new zzc(context).zzb();
            er.zzh("Updating ad debug logging enablement.");
            tr.a(g52VarZzb, "AdDebugLogUpdater.updateEnablement");
        }
    }
}