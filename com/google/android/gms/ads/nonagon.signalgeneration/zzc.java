package com.google.android.gms.ads.nonagon.signalgeneration;

import e.c.b.b.b.b;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzc implements Callable {
    private final zzp zza;
    private final List zzb;
    private final b zzc;

    zzc(zzp zzpVar, List list, b bVar) {
        this.zza = zzpVar;
        this.zzb = list;
        this.zzc = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.zza.zzo(this.zzb, this.zzc);
    }
}