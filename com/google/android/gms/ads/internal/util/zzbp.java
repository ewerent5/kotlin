package com.google.android.gms.ads.internal.util;

import javax.annotation.concurrent.GuardedBy;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzbp {
    private long zza;

    @GuardedBy("lock")
    private long zzb = Long.MIN_VALUE;
    private final Object zzc = new Object();

    public zzbp(long j2) {
        this.zza = j2;
    }

    public final boolean zza() {
        synchronized (this.zzc) {
            long jC = com.google.android.gms.ads.internal.zzs.zzj().c();
            if (this.zzb + this.zza > jC) {
                return false;
            }
            this.zzb = jC;
            return true;
        }
    }

    public final void zzb(long j2) {
        synchronized (this.zzc) {
            this.zza = j2;
        }
    }
}