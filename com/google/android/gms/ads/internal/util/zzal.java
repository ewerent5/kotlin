package com.google.android.gms.ads.internal.util;

import android.content.DialogInterface;
import android.net.Uri;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final class zzal implements DialogInterface.OnClickListener {
    final /* synthetic */ zzam zza;

    zzal(zzam zzamVar) {
        this.zza = zzamVar;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i2) {
        com.google.android.gms.ads.internal.zzs.zzc();
        zzr.zzV(this.zza.zza, Uri.parse("https://support.google.com/dfp_premium/answer/7160685#push"));
    }
}