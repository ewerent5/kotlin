package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public final class bb extends zr2 implements db {
    bb(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.h5.client.IH5AdsManagerCreator");
    }

    @Override // com.google.android.gms.internal.ads.db
    public final ab g2(e.c.b.b.b.b bVar, tf tfVar, int i2, xa xaVar) {
        ab yaVar;
        Parcel parcelZza = zza();
        bs2.f(parcelZza, bVar);
        bs2.f(parcelZza, tfVar);
        parcelZza.writeInt(210890000);
        bs2.f(parcelZza, xaVar);
        Parcel parcelZzbi = zzbi(1, parcelZza);
        IBinder strongBinder = parcelZzbi.readStrongBinder();
        if (strongBinder == null) {
            yaVar = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.h5.client.IH5AdsManager");
            yaVar = iInterfaceQueryLocalInterface instanceof ab ? (ab) iInterfaceQueryLocalInterface : new ya(strongBinder);
        }
        parcelZzbi.recycle();
        return yaVar;
    }
}