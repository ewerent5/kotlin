package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class cn extends as2 implements dn {
    public cn() {
        super("com.google.android.gms.ads.internal.rewarded.client.IRewardedAdCallback");
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        xm vmVar;
        switch (i2) {
            case 1:
                zze();
                break;
            case 2:
                zzf();
                break;
            case 3:
                IBinder strongBinder = parcel.readStrongBinder();
                if (strongBinder == null) {
                    vmVar = null;
                } else {
                    IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.ads.internal.rewarded.client.IRewardItem");
                    vmVar = iInterfaceQueryLocalInterface instanceof xm ? (xm) iInterfaceQueryLocalInterface : new vm(strongBinder);
                }
                Q0(vmVar);
                break;
            case 4:
                Z(parcel.readInt());
                break;
            case 5:
                I((g93) bs2.c(parcel, g93.CREATOR));
                break;
            case 6:
                zzj();
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}