package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class qm extends zr2 implements sm {
    qm(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.reward.mediation.client.IMediationRewardedVideoAdListener");
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final void C0(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(11, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final void H(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final void i(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final void j0(e.c.b.b.b.b bVar, tm tmVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.d(parcelZza, tmVar);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final void m(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final void t4(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(8, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final void w1(e.c.b.b.b.b bVar, int i2) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        parcelZza.writeInt(i2);
        zzbj(9, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final void zzg(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(3, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.sm
    public final void zzj(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(6, parcelZza);
    }
}