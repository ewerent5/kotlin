package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.hp2;
import com.google.android.gms.internal.ads.ip2;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzo implements Callable<ip2> {
    final /* synthetic */ zzr zza;

    zzo(zzr zzrVar) {
        this.zza = zzrVar;
    }

    @Override // java.util.concurrent.Callable
    public final /* bridge */ /* synthetic */ ip2 call() {
        return new ip2(hp2.r(this.zza.zza.f7054e, this.zza.zzd, false, 1));
    }
}