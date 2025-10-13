package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzh implements Runnable {
    private final zzj zza;
    private final Context zzb;
    private final String zzc = "admob";

    zzh(zzj zzjVar, Context context, String str) {
        this.zza = zzjVar;
        this.zzb = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzH(this.zzb, this.zzc);
    }
}