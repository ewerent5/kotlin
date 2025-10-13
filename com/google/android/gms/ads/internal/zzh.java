package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.vy1;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzh implements vy1 {
    final /* synthetic */ zzi zza;

    zzh(zzi zziVar) {
        this.zza = zziVar;
    }

    @Override // com.google.android.gms.internal.ads.vy1
    public final void zza(int i2, long j2) {
        this.zza.zzi.c(i2, System.currentTimeMillis() - j2);
    }

    @Override // com.google.android.gms.internal.ads.vy1
    public final void zzb(int i2, long j2, String str) {
        this.zza.zzi.g(i2, System.currentTimeMillis() - j2, str);
    }
}