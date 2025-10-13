package com.google.android.gms.ads.internal;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzg implements Runnable {
    private final zzi zza;
    private final boolean zzb;

    zzg(zzi zziVar, boolean z) {
        this.zza = zziVar;
        this.zzb = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.zza.zzb(this.zzb);
    }
}