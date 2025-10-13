package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class wz1 extends zr2 implements IInterface {
    wz1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.clearcut.IClearcut");
    }

    public final void G2(int i2) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzbj(7, parcelZza);
    }

    public final void R(int[] iArr) {
        Parcel parcelZza = zza();
        parcelZza.writeIntArray(null);
        zzbj(4, parcelZza);
    }

    public final void U(byte[] bArr) {
        Parcel parcelZza = zza();
        parcelZza.writeByteArray(bArr);
        zzbj(5, parcelZza);
    }

    public final void Y(e.c.b.b.b.b bVar, String str, String str2) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        parcelZza.writeString(str);
        parcelZza.writeString(null);
        zzbj(8, parcelZza);
    }

    public final void Z(int i2) {
        Parcel parcelZza = zza();
        parcelZza.writeInt(i2);
        zzbj(6, parcelZza);
    }

    public final void zze() {
        zzbj(3, zza());
    }
}