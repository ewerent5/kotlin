package com.google.android.gms.ads.internal.util;

import android.net.Uri;
import com.google.android.gms.internal.ads.l02;
import java.util.concurrent.Callable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzk implements Callable {
    private final Uri zza;

    zzk(Uri uri) {
        this.zza = uri;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        Uri uri = this.zza;
        l02 l02Var = zzr.zza;
        com.google.android.gms.ads.internal.zzs.zzc();
        return zzr.zzP(uri);
    }
}