package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class vj extends zr2 implements xj {
    vj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.overlay.client.IAdOverlay");
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zze() {
        zzbj(10, zza());
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzf() {
        zzbj(14, zza());
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final boolean zzg() {
        Parcel parcelZzbi = zzbi(11, zza());
        boolean zA = bs2.a(parcelZzbi);
        parcelZzbi.recycle();
        return zA;
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzh(Bundle bundle) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, bundle);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzi() {
        zzbj(2, zza());
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzj() {
        zzbj(3, zza());
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzk() {
        zzbj(4, zza());
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzl() {
        zzbj(5, zza());
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzm(int i2, int i3, Intent intent) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        parcelZza.writeInt(i3);
        bs2.d(parcelZza, intent);
        zzbj(12, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzn(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(13, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzo(Bundle bundle) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, bundle);
        Parcel parcelZzbi = zzbi(6, parcelZza);
        if (parcelZzbi.readInt() != 0) {
            bundle.readFromParcel(parcelZzbi);
        }
        parcelZzbi.recycle();
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzp() {
        zzbj(7, zza());
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzq() {
        zzbj(8, zza());
    }

    @Override // com.google.android.gms.internal.ads.xj
    public final void zzs() {
        zzbj(9, zza());
    }
}