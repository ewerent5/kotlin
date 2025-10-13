package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzaf implements DialogInterface.OnClickListener {
    private final zzak zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;

    zzaf(zzak zzakVar, int i2, int i3, int i4) {
        this.zza = zzakVar;
        this.zzb = i2;
        this.zzc = i3;
        this.zzd = i4;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.zza.zzj(this.zzb, this.zzc, this.zzd, dialogInterface, i2);
    }
}