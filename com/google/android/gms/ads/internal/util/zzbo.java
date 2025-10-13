package com.google.android.gms.ads.internal.util;

import android.content.Context;
import com.google.android.gms.internal.ads.jr;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzbo extends zzb {
    private final jr zza;
    private final String zzb;

    public zzbo(Context context, String str, String str2) {
        this.zza = new jr(com.google.android.gms.ads.internal.zzs.zzc().zze(context, str));
        this.zzb = str2;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        this.zza.zza(this.zzb);
    }
}