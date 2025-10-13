package com.google.android.gms.ads.nonagon.signalgeneration;

import android.net.Uri;
import com.google.android.gms.internal.ads.x02;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzh implements x02 {
    private final zzp zza;
    private final Uri zzb;

    zzh(zzp zzpVar, Uri uri) {
        this.zza = zzpVar;
        this.zzb = uri;
    }

    @Override // com.google.android.gms.internal.ads.x02
    public final Object apply(Object obj) {
        return zzp.zzq(this.zzb, (String) obj);
    }
}