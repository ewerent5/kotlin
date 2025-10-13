package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class zzag implements DialogInterface.OnClickListener {
    private final zzak zza;
    private final String zzb;

    zzag(zzak zzakVar, String str) {
        this.zza = zzakVar;
        this.zzb = str;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        this.zza.zzi(this.zzb, dialogInterface, i2);
    }
}