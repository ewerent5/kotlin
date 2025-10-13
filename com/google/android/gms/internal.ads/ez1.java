package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads@@20.1.0 */
/* loaded from: classes.dex */
public final class ez1 extends zr2 implements IInterface {
    ez1(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.gass.internal.IGassService");
    }

    public final cz1 R(az1 az1Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, az1Var);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        cz1 cz1Var = (cz1) bs2.c(parcelZzbi, cz1.CREATOR);
        parcelZzbi.recycle();
        return cz1Var;
    }

    public final void U(xy1 xy1Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, xy1Var);
        zzbj(2, parcelZza);
    }

    public final lz1 Y(jz1 jz1Var) {
        Parcel parcelZza = zza();
        bs2.d(parcelZza, jz1Var);
        Parcel parcelZzbi = zzbi(3, parcelZza);
        lz1 lz1Var = (lz1) bs2.c(parcelZzbi, lz1.CREATOR);
        parcelZzbi.recycle();
        return lz1Var;
    }
}