package com.google.android.gms.ads.internal.overlay;

import android.graphics.drawable.Drawable;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzk implements Runnable {
    private final zzl zza;
    private final Drawable zzb;

    zzk(zzl zzlVar, Drawable drawable) {
        this.zza = zzlVar;
        this.zzb = drawable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        zzl zzlVar = this.zza;
        zzlVar.zza.zzb.getWindow().setBackgroundDrawable(this.zzb);
    }
}