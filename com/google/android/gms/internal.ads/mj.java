package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class mj extends zr2 implements oj {
    mj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.offline.IOfflineUtilsCreator");
    }

    @Override // com.google.android.gms.internal.ads.oj
    public final kj T(e.c.b.b.b.b bVar, tf tfVar, int i2) {
        kj ijVar;
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, tfVar);
        parcelZza.writeInt(210890000);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            ijVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
            ijVar = iInterfaceQueryLocalInterface instanceof kj ? (kj) iInterfaceQueryLocalInterface : new ij(strongBinder);
        }
        parcelZzbi.recycle();
        return ijVar;
    }
}