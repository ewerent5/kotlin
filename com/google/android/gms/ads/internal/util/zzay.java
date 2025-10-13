package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.er;
import com.google.android.gms.internal.ads.h5;
import com.google.android.gms.internal.ads.ma;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzay implements h5 {
    final /* synthetic */ String zza;
    final /* synthetic */ zzbb zzb;

    zzay(zzbe zzbeVar, String str, zzbb zzbbVar) {
        this.zza = str;
        this.zzb = zzbbVar;
    }

    @Override // com.google.android.gms.internal.ads.h5
    public final void zza(ma maVar) {
        String str = this.zza;
        String string = maVar.toString();
        StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 21 + String.valueOf(string).length());
        sb.append("Failed to load URL: ");
        sb.append(str);
        sb.append("\n");
        sb.append(string);
        er.zzi(sb.toString());
        this.zzb.zza((zzbb) null);
    }
}