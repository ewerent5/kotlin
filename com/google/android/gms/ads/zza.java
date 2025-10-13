package com.google.android.gms.ads;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class zza {
    public static AdSize zza(int i2, int i3, String str) {
        return new AdSize(i2, i3, str);
    }

    public static AdSize zzb(int i2, int i3) {
        AdSize adSize = new AdSize(i2, i3);
        adSize.zzc(true);
        adSize.zzd(i3);
        return adSize;
    }

    public static AdSize zzc(int i2, int i3) {
        AdSize adSize = new AdSize(i2, i3);
        adSize.zzg(true);
        adSize.zzi(i3);
        return adSize;
    }

    public static boolean zzd(AdSize adSize) {
        return adSize.zzf();
    }

    public static int zze(AdSize adSize) {
        return adSize.zzh();
    }

    public static boolean zzf(AdSize adSize) {
        return adSize.zza();
    }

    public static boolean zzg(AdSize adSize) {
        return adSize.zzb();
    }

    public static int zzh(AdSize adSize) {
        return adSize.zze();
    }
}