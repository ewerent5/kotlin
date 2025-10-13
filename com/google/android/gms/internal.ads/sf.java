package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class sf extends as2 implements tf {
    public sf() {
        super("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
    }

    public static tf I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.mediation.client.IAdapterCreator");
        return iInterfaceQueryLocalInterface instanceof tf ? (tf) iInterfaceQueryLocalInterface : new qf(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            wf wfVarC = c(parcel.readString());
            parcel2.writeNoException();
            bs2.f(parcel2, wfVarC);
        } else if (i2 == 2) {
            boolean zD = d(parcel.readString());
            parcel2.writeNoException();
            bs2.b(parcel2, zD);
        } else if (i2 == 3) {
            th thVarB = b(parcel.readString());
            parcel2.writeNoException();
            bs2.f(parcel2, thVarB);
        } else {
            if (i2 != 4) {
                return false;
            }
            boolean zO = O(parcel.readString());
            parcel2.writeNoException();
            bs2.b(parcel2, zO);
        }
        return true;
    }
}