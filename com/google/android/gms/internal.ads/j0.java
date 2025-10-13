package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class j0 extends zr2 implements l0 {
    j0(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IFullScreenContentCallback");
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final void s2(g93 g93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, g93Var);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final void zzc() {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final void zzd() {
        zzbj(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.l0
    public final void zze() {
        zzbj(4, zza());
    }
}