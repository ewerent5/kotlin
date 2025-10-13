package com.google.android.gms.internal.ads;

import android.content.Context;
import com.google.android.gms.ads.internal.overlay.AdOverlayInfoParcel;
import com.google.android.gms.ads.internal.overlay.zzn;
import com.google.android.gms.ads.internal.zzs;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
final /* synthetic */ class z41 implements rj0 {
    private final wr a;

    z41(wr wrVar) {
        this.a = wrVar;
    }

    @Override // com.google.android.gms.internal.ads.rj0
    public final void a(boolean z, Context context) {
        wr wrVar = this.a;
        try {
            zzs.zzb();
            zzn.zza(context, (AdOverlayInfoParcel) wrVar.get(), true);
        } catch (Exception unused) {
        }
    }
}