package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class aq extends zr2 implements cq {
    aq(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.signals.ISignalGeneratorCreator");
    }

    @Override // com.google.android.gms.internal.ads.cq
    public final zp T(e.c.b.b.b.b bVar, tf tfVar, int i2) {
        zp xpVar;
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, tfVar);
        parcelZza.writeInt(210890000);
        Parcel parcelZzbi = zzbi(2, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            xpVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.signals.ISignalGenerator");
            xpVar = iInterfaceQueryLocalInterface instanceof zp ? (zp) iInterfaceQueryLocalInterface : new xp(strongBinder);
        }
        parcelZzbi.recycle();
        return xpVar;
    }
}