package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class cs2 extends zr2 implements fs2 {
    cs2(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.clearcut.IClearcut");
    }

    @Override // com.google.android.gms.internal.ads.fs2
    public final void G2(int i2) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(0);
        zzbj(6, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.fs2
    public final void a3(byte[] bArr) {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzbj(5, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.fs2
    public final void l3(e.c.b.b.b.b bVar, String str) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        parcelZza.writeString("GMA_SDK");
        zzbj(2, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.fs2
    public final void o3(int i2) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzbj(7, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.fs2
    public final void y2(int[] iArr) {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzbj(4, parcelZza);
    }

    @Override // com.google.android.gms.internal.ads.fs2
    public final void zzf() {
        zzbj(3, zza());
    }
}