package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;

/* compiled from: com.google.android.gms:play-services-ads-lite@@20.1.0 */
/* loaded from: classes.dex */
public abstract class g1 extends as2 implements h1 {
    public g1() {
        super("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
    }

    public static h1 I4(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.internal.client.IOnPaidEventListener");
        return iInterfaceQueryLocalInterface instanceof h1 ? (h1) iInterfaceQueryLocalInterface : new f1(iBinder);
    }

    @Override // com.google.android.gms.internal.ads.as2
    protected final boolean zzbA(int i2, Parcel parcel, Parcel parcel2, int i3) {
        if (i2 != 1) {
            return false;
        }
        W2((t93) bs2.c(parcel, t93.CREATOR));
        parcel2.writeNoException();
        return true;
    }
}