package com.google.android.gms.internal.ads;

import android.net.Uri;
import android.os.IBinder;
import android.os.Parcel;
import java.util.List;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class xp extends zr2 implements zp {
    xp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGenerator");
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final void zze(e.c.b.b.b.b bVar, dq dqVar, wp wpVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.d(parcelZza, dqVar);
        bs2.f(parcelZza, wpVar);
        zzbj(1, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final void zzf(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final void zzg(List<Uri> list, e.c.b.b.b.b bVar, kk kkVar) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, kkVar);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final void zzh(List<Uri> list, e.c.b.b.b.b bVar, kk kkVar) {
        Parcel parcelZza = zza();
        parcelZza.writeTypedList(list);
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, kkVar);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final void zzi(sk skVar) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, skVar);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.zp
    public final void zzj(e.c.b.b.b.b bVar) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        zzbj(8, parcelZza);
    }
}