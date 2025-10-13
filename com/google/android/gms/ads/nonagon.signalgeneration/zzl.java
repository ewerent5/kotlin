package com.google.android.gms.ads.nonagon.signalgeneration;

import com.google.android.gms.internal.ads.pq0;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzl implements Runnable {
    private final zzp zza;
    private final pq0[] zzb;

    zzl(zzp zzpVar, pq0[] pq0VarArr) {
        this.zza = zzpVar;
        this.zzb = pq0VarArr;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzd(this.zzb);
    }
}