package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class km extends zr2 implements mm {
    km(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.client.IRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void O1(gm gmVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, gmVar);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void zze() {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void zzf() {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void zzg() {
        zzbj(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void zzh() {
        zzbj(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void zzj() {
        zzbj(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void zzk(int i2) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.mm
    public final void zzl() {
        zzbj(8, zza());
    }
}