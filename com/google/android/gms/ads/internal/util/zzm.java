package com.google.android.gms.ads.internal.util;

import android.content.Context;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzm implements Runnable {
    final /* synthetic */ Context zza;
    final /* synthetic */ zzr zzb;

    zzm(zzr zzrVar, Context context) {
        this.zzb = zzrVar;
        this.zza = context;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.zzb.zzf) {
            this.zzb.zzg = zzr.zzS(this.zza);
            this.zzb.zzf.notifyAll();
        }
    }
}