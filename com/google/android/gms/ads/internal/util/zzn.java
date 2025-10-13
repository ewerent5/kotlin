package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.wq;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzn implements wq {
    final /* synthetic */ Context zza;
    final /* synthetic */ String zzb;

    zzn(zzr zzrVar, Context context, String str) {
        this.zza = context;
        this.zzb = str;
    }

    @Override // com.google.android.gms.internal.ads.wq
    public final void zza(String str) {
        com.google.android.gms.ads.internal.zzs.zzc();
        zzr.zzL(this.zza, this.zzb, str);
    }
}