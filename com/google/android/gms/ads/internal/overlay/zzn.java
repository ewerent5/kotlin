package com.google.android.gms.ads.internal.overlay;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import com.google.android.gms.ads.AdActivity;
import com.google.android.gms.common.util.n;
import com.google.android.gms.internal.ads.c93;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class zzn {
    public static final void zza(Context context, AdOverlayInfoParcel adOverlayInfoParcel, boolean z) throws NumberFormatException {
        if (adOverlayInfoParcel.zzk == 4 && adOverlayInfoParcel.zzc == null) {
            c93 c93Var = adOverlayInfoParcel.zzb;
            if (c93Var != null) {
                c93Var.onAdClicked();
            }
            Activity activityZzj = adOverlayInfoParcel.zzd.zzj();
            zzc zzcVar = adOverlayInfoParcel.zza;
            if (zzcVar != null && zzcVar.zzj && activityZzj != null) {
                context = activityZzj;
            }
            com.google.android.gms.ads.internal.zzs.zza();
            zzc zzcVar2 = adOverlayInfoParcel.zza;
            zza.zzb(context, zzcVar2, adOverlayInfoParcel.zzi, zzcVar2 != null ? zzcVar2.zzi : null);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName(context, AdActivity.CLASS_NAME);
        intent.putExtra("com.google.android.gms.ads.internal.overlay.useClientJar", adOverlayInfoParcel.zzm.f7057h);
        intent.putExtra("shouldCallOnOverlayOpened", z);
        Bundle bundle = new Bundle(1);
        bundle.putParcelable("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", adOverlayInfoParcel);
        intent.putExtra("com.google.android.gms.ads.inernal.overlay.AdOverlayInfo", bundle);
        if (!n.h()) {
            intent.addFlags(524288);
        }
        if (!(context instanceof Activity)) {
            intent.addFlags(268435456);
        }
        com.google.android.gms.ads.internal.zzs.zzc();
        com.google.android.gms.ads.internal.util.zzr.zzN(context, intent);
    }
}