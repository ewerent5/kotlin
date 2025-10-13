package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.e42;
import com.google.android.gms.internal.ads.g52;
import com.google.android.gms.internal.ads.pq0;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzk implements e42 {
    private final zzp zza;
    private final pq0[] zzb;
    private final String zzc;

    zzk(zzp zzpVar, pq0[] pq0VarArr, String str) {
        this.zza = zzpVar;
        this.zzb = pq0VarArr;
        this.zzc = str;
    }

    @Override // com.google.android.gms.internal.ads.e42
    public final g52 zza(Object obj) {
        return this.zza.zzk(this.zzb, this.zzc, (pq0) obj);
    }
}