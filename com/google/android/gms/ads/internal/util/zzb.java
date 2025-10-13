package com.google.android.gms.ads.internal.util;

import com.google.android.gms.internal.ads.g52;
import com.google.android.gms.internal.ads.qr;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public abstract class zzb {
    private final Runnable zza = new zza(this);
    private volatile Thread zzb;

    public abstract void zza();

    public final g52<?> zzb() {
        return qr.a.c(this.zza);
    }
}