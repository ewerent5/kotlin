package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzl extends com.google.android.gms.ads.internal.util.zzb {
    final /* synthetic */ zzm zza;

    /* synthetic */ zzl(zzm zzmVar, zzg zzgVar) {
        this.zza = zzmVar;
    }

    @Override // com.google.android.gms.ads.internal.util.zzb
    public final void zza() {
        Bitmap bitmapZza = com.google.android.gms.ads.internal.zzs.zzv().zza(Integer.valueOf(this.zza.zzc.zzo.zzf));
        if (bitmapZza != null) {
            com.google.android.gms.ads.internal.util.zzac zzacVarZze = com.google.android.gms.ads.internal.zzs.zze();
            zzm zzmVar = this.zza;
            Activity activity = zzmVar.zzb;
            com.google.android.gms.ads.internal.zzj zzjVar = zzmVar.zzc.zzo;
            final Drawable drawableZzd = zzacVarZze.zzd(activity, bitmapZza, zzjVar.zzd, zzjVar.zze);
            com.google.android.gms.ads.internal.util.zzr.zza.post(new Runnable(this, drawableZzd) { // from class: com.google.android.gms.ads.internal.overlay.zzk
                private final zzl zza;
                private final Drawable zzb;

                {
                    this.zza = this;
                    this.zzb = drawableZzd;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    zzl zzlVar = this.zza;
                    zzlVar.zza.zzb.getWindow().setBackgroundDrawable(this.zzb);
                }
            });
        }
    }
}