package com.google.android.gms.ads.internal.util;

import android.annotation.TargetApi;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
@TargetApi(17)
/* loaded from: classes.dex */
public final class zzbu {
    private static zzbu zzb;
    String zza;

    private zzbu() {
    }

    public static zzbu zza() {
        if (zzb == null) {
            zzb = new zzbu();
        }
        return zzb;
    }
}