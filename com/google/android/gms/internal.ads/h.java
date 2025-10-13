package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class h extends zr2 implements j {
    h(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdListener");
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void g(int i2) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void x(g93 g93Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, g93Var);
        zzbj(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void zzb() {
        zzbj(1, zza());
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void zze() {
        zzbj(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void zzf() {
        zzbj(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void zzg() {
        zzbj(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void zzh() {
        zzbj(6, zza());
    }

    @Override // com.google.android.gms.internal.ads.j
    public final void zzi() {
        zzbj(7, zza());
    }
}