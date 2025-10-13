package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class x extends zr2 implements IInterface {
    x(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IAdManagerCreator");
    }

    public final IBinder R(e.c.b.b.b.b bVar, r93 r93Var, String str, tf tfVar, int i2, int i3) {
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.d(parcelZza, r93Var);
        parcelZza.writeString(str);
        bs2.f(parcelZza, tfVar);
        parcelZza.writeInt(210890000);
        parcelZza.writeInt(i3);
        Parcel parcelZzbi = zzbi(2, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        parcelZzbi.recycle();
        return strongBinder;
    }
}