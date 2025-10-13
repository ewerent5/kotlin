package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class bn extends zr2 implements dn {
    bn(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.dn
    public final void I(g93 g93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, g93Var);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.dn
    public final void Q0(xm xmVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, xmVar);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.dn
    public final void Z(int i2) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzbj(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.dn
    public final void zze() {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.dn
    public final void zzf() {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.dn
    public final void zzj() {
        zzbj(6, zza());
    }
}