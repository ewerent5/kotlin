package com.google.android.gms.ads.internal.overlay;

import com.google.android.gms.internal.ads.ew;
import com.google.android.gms.internal.ads.rx;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzd implements rx {
    private final zzm zza;

    zzd(zzm zzmVar) {
        this.zza = zzmVar;
    }

    @Override // com.google.android.gms.internal.ads.rx
    public final void zza(boolean z) {
        ew ewVar = this.zza.zzd;
        if (ewVar != null) {
            ewVar.t();
        }
    }
}