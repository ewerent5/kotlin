package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import e.c.b.b.b.b;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zze implements Callable {
    private final zzp zza;
    private final Uri zzb;
    private final b zzc;

    zze(zzp zzpVar, Uri uri, b bVar) {
        this.zza = zzpVar;
        this.zzb = uri;
        this.zzc = bVar;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        return this.zza.zzm(this.zzb, this.zzc);
    }
}