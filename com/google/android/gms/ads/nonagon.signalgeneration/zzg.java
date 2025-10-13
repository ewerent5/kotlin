package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.x02;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzg implements x02 {
    private final zzp zza;
    private final List zzb;

    zzg(zzp zzpVar, List list) {
        this.zza = zzpVar;
        this.zzb = list;
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        return zzp.zzr(this.zzb, (String) obj);
    }
}