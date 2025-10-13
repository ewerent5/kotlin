package com.google.android.gms.internal.ads;

import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import e.c.b.b.b.b;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class jj extends as2 implements kj {
    public jj() {
        super("com.google.android.gms.ads.internal.offline.IOfflineUtils");
    }

    public static kj I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.offline.IOfflineUtils");
        return iInterfaceQueryLocalInterface instanceof kj ? (kj) iInterfaceQueryLocalInterface : new ij(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 == 1) {
            a0((Intent) bs2.c(parcel, Intent.CREATOR));
        } else if (i2 == 2) {
            e0(b.a.U(parcel.readStrongBinder()), parcel.readString(), parcel.readString());
        } else {
            if (i2 != 3) {
                return false;
            }
            zzg();
        }
        parcel2.writeNoException();
        return true;
    }
}